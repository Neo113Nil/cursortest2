package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.ExifData;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes3.dex */
public final class ExifOutputStream extends FilterOutputStream {
    public static final byte[] IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(ExifAttribute.ASCII);
    public final ByteBuffer mBuffer;
    public int mByteToCopy;
    public int mByteToSkip;
    public final ExifData mExifData;
    public final byte[] mSingleByteArray;
    public int mState;

    public ExifOutputStream(ByteArrayOutputStream byteArrayOutputStream, ExifData exifData) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.mSingleByteArray = new byte[1];
        this.mBuffer = ByteBuffer.allocate(4);
        this.mState = 0;
        this.mExifData = exifData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0355, code lost:
    
        ((java.io.FilterOutputStream) r17).out.write(r18, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x035a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0353, code lost:
    
        if (r3 <= 0) goto L162;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(byte[] bArr, int i, int i2) {
        ExifData exifData;
        int[] iArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.mByteToSkip;
            if ((i5 > 0 || this.mByteToCopy > 0 || this.mState != 2) && i4 > 0) {
                if (i5 > 0) {
                    int min = Math.min(i4, i5);
                    i4 -= min;
                    this.mByteToSkip -= min;
                    i3 += min;
                }
                int i6 = this.mByteToCopy;
                if (i6 > 0) {
                    int min2 = Math.min(i4, i6);
                    ((FilterOutputStream) this).out.write(bArr, i3, min2);
                    i4 -= min2;
                    this.mByteToCopy -= min2;
                    i3 += min2;
                }
                if (i4 == 0) {
                    return;
                }
                int i7 = this.mState;
                int i8 = 4;
                ByteBuffer byteBuffer = this.mBuffer;
                if (i7 == 0) {
                    int min3 = Math.min(i4, 2 - byteBuffer.position());
                    byteBuffer.put(bArr, i3, min3);
                    i3 += min3;
                    i4 -= min3;
                    if (byteBuffer.position() < 2) {
                        return;
                    }
                    byteBuffer.rewind();
                    if (byteBuffer.getShort() != -40) {
                        a$$ExternalSyntheticBUOutline0.m$4("Not a valid jpeg image, cannot write exif");
                        return;
                    }
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    this.mState = 1;
                    byteBuffer.rewind();
                    OutputStream outputStream = ((FilterOutputStream) this).out;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream);
                    byteOrderedDataOutputStream.writeShort((short) -31);
                    int[] iArr2 = new int[4];
                    int[] iArr3 = new int[4];
                    ExifTag[] exifTagArr = ExifData.EXIF_POINTER_TAGS;
                    int i9 = 0;
                    while (true) {
                        exifData = this.mExifData;
                        if (i9 >= i8) {
                            break;
                        }
                        ExifTag exifTag = exifTagArr[i9];
                        int i10 = 0;
                        while (true) {
                            ExifTag[] exifTagArr2 = ExifData.EXIF_POINTER_TAGS;
                            if (i10 < i8) {
                                exifData.getAttributes(i10).remove(exifTag.name);
                                i10++;
                                i8 = 4;
                            }
                        }
                        i9++;
                        i8 = 4;
                    }
                    Map attributes = exifData.getAttributes(1);
                    ByteOrder byteOrder2 = exifData.mByteOrder;
                    if (!attributes.isEmpty()) {
                        exifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0L, byteOrder2));
                    }
                    if (!exifData.getAttributes(2).isEmpty()) {
                        exifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0L, byteOrder2));
                    }
                    if (!exifData.getAttributes(3).isEmpty()) {
                        exifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0L, byteOrder2));
                    }
                    int i11 = 0;
                    while (true) {
                        ExifTag[] exifTagArr3 = ExifData.EXIF_POINTER_TAGS;
                        if (i11 >= 4) {
                            break;
                        }
                        Iterator it = exifData.getAttributes(i11).entrySet().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            ExifAttribute exifAttribute = (ExifAttribute) ((Map.Entry) it.next()).getValue();
                            int i13 = ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT[exifAttribute.f845format] * exifAttribute.numberOfComponents;
                            if (i13 > 4) {
                                i12 += i13;
                            }
                        }
                        iArr3[i11] = iArr3[i11] + i12;
                        i11++;
                    }
                    int i14 = 0;
                    int i15 = 8;
                    while (true) {
                        ExifTag[] exifTagArr4 = ExifData.EXIF_POINTER_TAGS;
                        if (i14 >= 4) {
                            break;
                        }
                        if (!exifData.getAttributes(i14).isEmpty()) {
                            iArr2[i14] = i15;
                            i15 += (exifData.getAttributes(i14).size() * 12) + 6 + iArr3[i14];
                        }
                        i14++;
                    }
                    int i16 = i15 + 8;
                    if (!exifData.getAttributes(1).isEmpty()) {
                        exifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(iArr2[1], byteOrder2));
                    }
                    if (exifData.getAttributes(2).isEmpty()) {
                        iArr = iArr2;
                    } else {
                        iArr = iArr2;
                        exifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(iArr2[2], byteOrder2));
                    }
                    if (!exifData.getAttributes(3).isEmpty()) {
                        exifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(iArr[3], byteOrder2));
                    }
                    byteOrderedDataOutputStream.writeShort((short) i16);
                    byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
                    byteOrderedDataOutputStream.writeShort(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                    byteOrderedDataOutputStream.mByteOrder = byteOrder2;
                    byteOrderedDataOutputStream.writeShort((short) 42);
                    byteOrderedDataOutputStream.writeInt(8);
                    int i17 = 0;
                    while (true) {
                        ExifTag[] exifTagArr5 = ExifData.EXIF_POINTER_TAGS;
                        if (i17 >= 4) {
                            break;
                        }
                        if (!exifData.getAttributes(i17).isEmpty()) {
                            byteOrderedDataOutputStream.writeShort((short) exifData.getAttributes(i17).size());
                            int size = (exifData.getAttributes(i17).size() * 12) + iArr[i17] + 2 + 4;
                            for (Map.Entry entry : exifData.getAttributes(i17).entrySet()) {
                                ExifTag exifTag2 = (ExifTag) ((HashMap) ExifData.Builder.sExifTagMapsForWriting.get(i17)).get(entry.getKey());
                                TransactorKt.checkNotNull(exifTag2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                int i18 = exifTag2.number;
                                ExifAttribute exifAttribute2 = (ExifAttribute) entry.getValue();
                                int[] iArr4 = ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT;
                                int i19 = exifAttribute2.f845format;
                                int i20 = exifAttribute2.numberOfComponents;
                                int i21 = iArr4[i19] * i20;
                                byteOrderedDataOutputStream.writeShort((short) i18);
                                byteOrderedDataOutputStream.writeShort((short) exifAttribute2.f845format);
                                byteOrderedDataOutputStream.writeInt(i20);
                                if (i21 > 4) {
                                    byteOrderedDataOutputStream.writeInt(size);
                                    size += i21;
                                } else {
                                    byteOrderedDataOutputStream.write(exifAttribute2.bytes);
                                    if (i21 < 4) {
                                        for (int i22 = 4; i21 < i22; i22 = 4) {
                                            byteOrderedDataOutputStream.mOutputStream.write(0);
                                            i21++;
                                        }
                                    }
                                }
                            }
                            byteOrderedDataOutputStream.writeInt(0);
                            Iterator it2 = exifData.getAttributes(i17).entrySet().iterator();
                            while (it2.hasNext()) {
                                byte[] bArr2 = ((ExifAttribute) ((Map.Entry) it2.next()).getValue()).bytes;
                                if (bArr2.length > 4) {
                                    byteOrderedDataOutputStream.write(bArr2, 0, bArr2.length);
                                }
                            }
                        }
                        i17++;
                    }
                    byteOrderedDataOutputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
                } else if (i7 != 1) {
                    continue;
                } else {
                    int min4 = Math.min(i4, 4 - byteBuffer.position());
                    byteBuffer.put(bArr, i3, min4);
                    i3 += min4;
                    i4 -= min4;
                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                        byteBuffer.rewind();
                    }
                    if (byteBuffer.position() < 4) {
                        return;
                    }
                    byteBuffer.rewind();
                    short s = byteBuffer.getShort();
                    if (s == -31) {
                        this.mByteToSkip = (byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) - 2;
                        this.mState = 2;
                    } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.mByteToCopy = (byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.mState = 2;
                    }
                    byteBuffer.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.mSingleByteArray;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
