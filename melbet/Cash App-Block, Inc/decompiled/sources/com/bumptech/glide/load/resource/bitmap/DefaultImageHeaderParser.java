package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import coil3.request.OneShotDisposable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    public static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int getUInt16();

        short getUInt8();

        int read(int i, byte[] bArr);

        long skip(long j);
    }

    public static int getOrientation(Reader reader, LruArrayPool lruArrayPool) {
        try {
            int uInt16 = reader.getUInt16();
            if ((uInt16 & 65496) == 65496 || uInt16 == 19789 || uInt16 == 18761) {
                int moveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength(reader);
                if (moveToExifSegmentAndGetLength != -1) {
                    byte[] bArr = (byte[]) lruArrayPool.get(byte[].class, moveToExifSegmentAndGetLength);
                    try {
                        return parseExifSegment(reader, bArr, moveToExifSegmentAndGetLength);
                    } finally {
                        lruArrayPool.put(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + uInt16);
                return -1;
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType getType(Reader reader) {
        try {
            int uInt16 = reader.getUInt16();
            if (uInt16 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | reader.getUInt8();
            if (uInt8 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int uInt82 = (uInt8 << 8) | reader.getUInt8();
            if (uInt82 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.getUInt8() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (uInt82 == 1380533830) {
                reader.skip(4L);
                if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int uInt162 = (reader.getUInt16() << 16) | reader.getUInt16();
                if ((uInt162 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = uInt162 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short uInt83 = reader.getUInt8();
                    return (uInt83 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (uInt83 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.getUInt8() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt163 = (reader.getUInt16() << 16) | reader.getUInt16();
            if (uInt163 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = uInt163 == 1635150182;
            reader.skip(4L);
            int i3 = uInt82 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int uInt164 = (reader.getUInt16() << 16) | reader.getUInt16();
                    if (uInt164 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (uInt164 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int moveToExifSegmentAndGetLength(Reader reader) {
        while (true) {
            short uInt8 = reader.getUInt8();
            if (uInt8 == 255) {
                short uInt82 = reader.getUInt8();
                if (uInt82 == 218) {
                    break;
                }
                if (uInt82 != 217) {
                    int uInt16 = reader.getUInt16() - 2;
                    if (uInt82 == 225) {
                        return uInt16;
                    }
                    long j = uInt16;
                    long skip = reader.skip(j);
                    if (skip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m((int) uInt82, uInt16, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            m107m.append(skip);
                            Log.d("DfltImageHeaderParser", m107m.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                CameraState$Type$EnumUnboxingLocalUtility.m(uInt8, "Unknown segmentId=", "DfltImageHeaderParser");
                return -1;
            }
        }
        return -1;
    }

    public static int parseExifSegment(Reader reader, byte[] bArr, int i) {
        ByteOrder byteOrder;
        short s;
        int read = reader.read(i, bArr);
        short s2 = -1;
        if (read == i) {
            int i2 = 0;
            byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i3 = 0;
                while (true) {
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i3] != bArr2[i3]) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s3 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (s3 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    CameraState$Type$EnumUnboxingLocalUtility.m(s3, "Unknown endianness = ", "DfltImageHeaderParser");
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s4 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            while (i2 < s4) {
                int i6 = (i2 * 12) + i4 + 8;
                short s5 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : s2;
                if (s5 == 274) {
                    int i7 = i6 + 2;
                    short s6 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : s2;
                    if (s6 < 1 || s6 > 12) {
                        s = s2;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            CameraState$Type$EnumUnboxingLocalUtility.m(s6, "Got invalid format code = ", "DfltImageHeaderParser");
                        }
                    } else {
                        int i8 = i6 + 4;
                        int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : s2;
                        if (i9 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                s = s2;
                                StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i2, (int) s5, "Got tagIndex=", " tagType=", " formatCode=");
                                m107m.append((int) s6);
                                m107m.append(" componentCount=");
                                m107m.append(i9);
                                Log.d("DfltImageHeaderParser", m107m.toString());
                            } else {
                                s = s2;
                            }
                            int i10 = i9 + BYTES_PER_FORMAT[s6];
                            if (i10 <= 4) {
                                int i11 = i6 + 8;
                                if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) s5));
                                    }
                                } else {
                                    if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : s;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        CameraState$Type$EnumUnboxingLocalUtility.m(s5, "Illegal number of bytes for TI tag data tagType=", "DfltImageHeaderParser");
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                CameraState$Type$EnumUnboxingLocalUtility.m(s6, "Got byte count > 4, not orientation, continuing, formatCode=", "DfltImageHeaderParser");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    }
                    i2++;
                    s2 = s;
                }
                s = s2;
                i2++;
                s2 = s;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + read);
            return -1;
        }
        return s2;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(ByteBuffer byteBuffer, LruArrayPool lruArrayPool) {
        ByteBufferRewinder byteBufferRewinder = new ByteBufferRewinder(byteBuffer);
        Util.checkNotNull(lruArrayPool, "Argument must not be null");
        return getOrientation(byteBufferRewinder, lruArrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(InputStream inputStream, LruArrayPool lruArrayPool) {
        OneShotDisposable oneShotDisposable = new OneShotDisposable(inputStream, 8);
        Util.checkNotNull(lruArrayPool, "Argument must not be null");
        return getOrientation(oneShotDisposable, lruArrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(ByteBuffer byteBuffer) {
        Util.checkNotNull(byteBuffer, "Argument must not be null");
        return getType(new ByteBufferRewinder(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(InputStream inputStream) {
        return getType(new OneShotDisposable(inputStream, 8));
    }
}
