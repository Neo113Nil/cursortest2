package androidx.media3.extractor.metadata.id3;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.commonmark.internal.BlockContinueImpl;

/* loaded from: classes3.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    public static final Id3Peeker$$ExternalSyntheticBUOutline0 NO_FRAMES_PREDICATE = new Id3Peeker$$ExternalSyntheticBUOutline0(20);
    public final Id3Peeker$$ExternalSyntheticBUOutline0 framePredicate;

    public Id3Decoder(Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0) {
        this.framePredicate = id3Peeker$$ExternalSyntheticBUOutline0;
    }

    public static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) {
        int indexOfZeroByte;
        String concat;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(0, i3, bArr);
        if (i2 == 2) {
            concat = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(0, bArr);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, indexOfZeroByte, StandardCharsets.ISO_8859_1));
            concat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i4 = bArr[indexOfZeroByte + 1] & 255;
        int i5 = indexOfZeroByte + 2;
        int indexOfTerminator = indexOfTerminator(i5, readUnsignedByte, bArr);
        String str = new String(bArr, i5, indexOfTerminator - i5, charset);
        int delimiterLength = delimiterLength(readUnsignedByte) + indexOfTerminator;
        return new ApicFrame(i4, concat, str, i3 <= delimiterLength ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, delimiterLength, i3));
    }

    public static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0) {
        int i4 = parsableByteArray.position;
        int indexOfZeroByte = indexOfZeroByte(i4, parsableByteArray.data);
        String str = new String(parsableByteArray.data, i4, indexOfZeroByte - i4, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt == BodyPartID.bodyIdMax) {
            readUnsignedInt = -1;
        }
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = readUnsignedInt2 == BodyPartID.bodyIdMax ? -1L : readUnsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (parsableByteArray.position < i5) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, id3Peeker$$ExternalSyntheticBUOutline0);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterFrame(str, readInt, readInt2, readUnsignedInt, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0) {
        int i4 = parsableByteArray.position;
        int indexOfZeroByte = indexOfZeroByte(i4, parsableByteArray.data);
        String str = new String(parsableByteArray.data, i4, indexOfZeroByte - i4, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (readUnsignedByte & 2) != 0;
        boolean z3 = (readUnsignedByte & 1) != 0;
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
            int i6 = parsableByteArray.position;
            int indexOfZeroByte2 = indexOfZeroByte(i6, parsableByteArray.data);
            strArr[i5] = new String(parsableByteArray.data, i6, indexOfZeroByte2 - i6, StandardCharsets.ISO_8859_1);
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (parsableByteArray.position < i7) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, id3Peeker$$ExternalSyntheticBUOutline0);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame decodeCommentFrame(int i, ParsableByteArray parsableByteArray) {
        if (i < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(0, i2, bArr2);
        int indexOfTerminator = indexOfTerminator(0, readUnsignedByte, bArr2);
        String str2 = new String(bArr2, 0, indexOfTerminator, charset);
        int delimiterLength = delimiterLength(readUnsignedByte) + indexOfTerminator;
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfTerminator(delimiterLength, readUnsignedByte, bArr2), charset));
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ab, code lost:
    
        if (r10 == 67) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame decodeFrame(int i, ParsableByteArray parsableByteArray, boolean z, int i2, Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0) {
        int readUnsignedIntToInt;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        Id3Frame id3Frame;
        Id3Frame binaryFrame;
        boolean z7;
        int i4 = i;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
        int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
        int readUnsignedByte4 = i4 >= 3 ? parsableByteArray2.readUnsignedByte() : 0;
        if (i4 == 4) {
            readUnsignedIntToInt = parsableByteArray2.readUnsignedIntToInt();
            if (!z) {
                readUnsignedIntToInt = (((readUnsignedIntToInt >> 24) & 255) << 21) | (readUnsignedIntToInt & 255) | (((readUnsignedIntToInt >> 8) & 255) << 7) | (((readUnsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            readUnsignedIntToInt = i4 == 3 ? parsableByteArray2.readUnsignedIntToInt() : parsableByteArray2.readUnsignedInt24();
        }
        int readUnsignedShort = i4 >= 3 ? parsableByteArray2.readUnsignedShort() : 0;
        if (readUnsignedByte == 0 && readUnsignedByte2 == 0 && readUnsignedByte3 == 0 && readUnsignedByte4 == 0 && readUnsignedIntToInt == 0 && readUnsignedShort == 0) {
            parsableByteArray2.setPosition(parsableByteArray2.limit);
            return null;
        }
        int i5 = parsableByteArray2.position + readUnsignedIntToInt;
        if (i5 > parsableByteArray2.limit) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray2.setPosition(parsableByteArray2.limit);
            return null;
        }
        if (id3Peeker$$ExternalSyntheticBUOutline0 != null) {
            switch (id3Peeker$$ExternalSyntheticBUOutline0.$r8$classId) {
                default:
                    if ((readUnsignedByte == 67 && readUnsignedByte2 == 79 && readUnsignedByte3 == 77 && (readUnsignedByte4 == 77 || i4 == 2)) || (readUnsignedByte == 77 && readUnsignedByte2 == 76 && readUnsignedByte3 == 76 && (readUnsignedByte4 == 84 || i4 == 2))) {
                        z7 = true;
                        break;
                    }
                case 20:
                    z7 = false;
                    break;
            }
            if (!z7) {
                parsableByteArray2.setPosition(i5);
                return null;
            }
        }
        if (i4 == 3) {
            z3 = (readUnsignedShort & 128) != 0;
            boolean z8 = (readUnsignedShort & 64) != 0;
            z2 = (readUnsignedShort & 32) != 0;
            z5 = z8;
            z6 = false;
            z4 = z3;
        } else if (i4 == 4) {
            boolean z9 = (readUnsignedShort & 64) != 0;
            boolean z10 = (readUnsignedShort & 8) != 0;
            z5 = (readUnsignedShort & 4) != 0;
            z6 = (readUnsignedShort & 2) != 0;
            boolean z11 = z10;
            z4 = (readUnsignedShort & 1) != 0;
            z2 = z9;
            z3 = z11;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z3 || z5) {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            parsableByteArray2.setPosition(i5);
            return null;
        }
        if (z2) {
            readUnsignedIntToInt--;
            parsableByteArray2.skipBytes(1);
        }
        if (z4) {
            readUnsignedIntToInt -= 4;
            parsableByteArray2.skipBytes(4);
        }
        if (z6) {
            readUnsignedIntToInt = removeUnsynchronization(readUnsignedIntToInt, parsableByteArray2);
        }
        int i6 = 84;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception | OutOfMemoryError e) {
            e = e;
            i3 = readUnsignedIntToInt;
        }
        if (readUnsignedByte == 84) {
            if (readUnsignedByte2 == 88 && readUnsignedByte3 == 88 && (i4 == 2 || readUnsignedByte4 == 88)) {
                binaryFrame = decodeTxxxFrame(readUnsignedIntToInt, parsableByteArray2);
                i3 = readUnsignedIntToInt;
                parsableByteArray2.setPosition(i5);
                id3Frame = binaryFrame;
                e = null;
                if (id3Frame == null) {
                    Log.w("Id3Decoder", "Failed to decode frame: id=" + getFrameId(i4, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4) + ", frameSize=" + i3, e);
                }
                return id3Frame;
            }
            i6 = 84;
        }
        if (readUnsignedByte == i6) {
            binaryFrame = decodeTextInformationFrame(readUnsignedIntToInt, parsableByteArray2, getFrameId(i4, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
        } else if (readUnsignedByte == 87 && readUnsignedByte2 == 88 && readUnsignedByte3 == 88 && (i4 == 2 || readUnsignedByte4 == 88)) {
            binaryFrame = decodeWxxxFrame(readUnsignedIntToInt, parsableByteArray2);
        } else if (readUnsignedByte == 87) {
            binaryFrame = decodeUrlLinkFrame(readUnsignedIntToInt, parsableByteArray2, getFrameId(i4, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4));
        } else if (readUnsignedByte == 80 && readUnsignedByte2 == 82 && readUnsignedByte3 == 73 && readUnsignedByte4 == 86) {
            binaryFrame = decodePrivFrame(readUnsignedIntToInt, parsableByteArray2);
        } else if (readUnsignedByte == 71 && readUnsignedByte2 == 69 && readUnsignedByte3 == 79 && (readUnsignedByte4 == 66 || i4 == 2)) {
            binaryFrame = decodeGeobFrame(readUnsignedIntToInt, parsableByteArray2);
        } else {
            if (i4 != 2) {
                if (readUnsignedByte == 65) {
                    if (readUnsignedByte2 == 80) {
                        if (readUnsignedByte3 == 73) {
                        }
                    }
                }
                if (readUnsignedByte == 67) {
                }
                if (readUnsignedByte != 67) {
                }
                i3 = readUnsignedIntToInt;
                if (readUnsignedByte != 67) {
                }
                i4 = i;
                parsableByteArray2 = parsableByteArray;
                if (readUnsignedByte != 77) {
                }
                String frameId = getFrameId(i4, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4);
                byte[] bArr = new byte[i3];
                parsableByteArray2.readBytes(0, i3, bArr);
                binaryFrame = new BinaryFrame(frameId, bArr);
                parsableByteArray2.setPosition(i5);
                id3Frame = binaryFrame;
                e = null;
                if (id3Frame == null) {
                }
                return id3Frame;
            }
            if (readUnsignedByte == 80 && readUnsignedByte2 == 73 && readUnsignedByte3 == 67) {
                binaryFrame = decodeApicFrame(parsableByteArray2, readUnsignedIntToInt, i4);
            }
            if (readUnsignedByte == 67 || readUnsignedByte2 != 79 || readUnsignedByte3 != 77 || (readUnsignedByte4 != 77 && i4 != 2)) {
                if (readUnsignedByte != 67 && readUnsignedByte2 == 72 && readUnsignedByte3 == 65 && readUnsignedByte4 == 80) {
                    i3 = readUnsignedIntToInt;
                    try {
                        binaryFrame = decodeChapterFrame(parsableByteArray2, i3, i4, z, i2, id3Peeker$$ExternalSyntheticBUOutline0);
                        i4 = i;
                        parsableByteArray2 = parsableByteArray;
                    } catch (Exception | OutOfMemoryError e2) {
                        e = e2;
                        i4 = i;
                        parsableByteArray2 = parsableByteArray;
                        parsableByteArray2.setPosition(i5);
                        id3Frame = null;
                        if (id3Frame == null) {
                        }
                        return id3Frame;
                    } catch (Throwable th2) {
                        th = th2;
                        parsableByteArray2 = parsableByteArray;
                        parsableByteArray2.setPosition(i5);
                        throw th;
                    }
                } else {
                    i3 = readUnsignedIntToInt;
                    try {
                        if (readUnsignedByte != 67 && readUnsignedByte2 == 84 && readUnsignedByte3 == 79 && readUnsignedByte4 == 67) {
                            i4 = i;
                            parsableByteArray2 = parsableByteArray;
                            binaryFrame = decodeChapterTOCFrame(parsableByteArray2, i3, i4, z, i2, id3Peeker$$ExternalSyntheticBUOutline0);
                        } else {
                            i4 = i;
                            parsableByteArray2 = parsableByteArray;
                            if (readUnsignedByte != 77 && readUnsignedByte2 == 76 && readUnsignedByte3 == 76 && readUnsignedByte4 == 84) {
                                binaryFrame = decodeMlltFrame(i3, parsableByteArray2);
                            } else {
                                String frameId2 = getFrameId(i4, readUnsignedByte, readUnsignedByte2, readUnsignedByte3, readUnsignedByte4);
                                byte[] bArr2 = new byte[i3];
                                parsableByteArray2.readBytes(0, i3, bArr2);
                                binaryFrame = new BinaryFrame(frameId2, bArr2);
                            }
                        }
                    } catch (Exception | OutOfMemoryError e3) {
                        e = e3;
                        parsableByteArray2.setPosition(i5);
                        id3Frame = null;
                        if (id3Frame == null) {
                        }
                        return id3Frame;
                    }
                }
                parsableByteArray2.setPosition(i5);
                id3Frame = binaryFrame;
                e = null;
                if (id3Frame == null) {
                }
                return id3Frame;
            }
            binaryFrame = decodeCommentFrame(readUnsignedIntToInt, parsableByteArray2);
        }
        i3 = readUnsignedIntToInt;
        parsableByteArray2.setPosition(i5);
        id3Frame = binaryFrame;
        e = null;
        if (id3Frame == null) {
        }
        return id3Frame;
    }

    public static GeobFrame decodeGeobFrame(int i, ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(0, i2, bArr);
        int indexOfZeroByte = indexOfZeroByte(0, bArr);
        String normalizeMimeType = MimeTypes.normalizeMimeType(new String(bArr, 0, indexOfZeroByte, StandardCharsets.ISO_8859_1));
        int i3 = indexOfZeroByte + 1;
        int indexOfTerminator = indexOfTerminator(i3, readUnsignedByte, bArr);
        String decodeStringIfValid = decodeStringIfValid(bArr, i3, indexOfTerminator, charset);
        int delimiterLength = delimiterLength(readUnsignedByte) + indexOfTerminator;
        int indexOfTerminator2 = indexOfTerminator(delimiterLength, readUnsignedByte, bArr);
        String decodeStringIfValid2 = decodeStringIfValid(bArr, delimiterLength, indexOfTerminator2, charset);
        int delimiterLength2 = delimiterLength(readUnsignedByte) + indexOfTerminator2;
        return new GeobFrame(normalizeMimeType, decodeStringIfValid, decodeStringIfValid2, i2 <= delimiterLength2 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, delimiterLength2, i2));
    }

    public static MlltFrame decodeMlltFrame(int i, ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        int readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        VorbisBitArray vorbisBitArray = new VorbisBitArray();
        vorbisBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (readUnsignedByte + readUnsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int readBits = vorbisBitArray.readBits(readUnsignedByte);
            int readBits2 = vorbisBitArray.readBits(readUnsignedByte2);
            iArr[i3] = readBits;
            iArr2[i3] = readBits2;
        }
        return new MlltFrame(readUnsignedShort, iArr, readUnsignedInt24, readUnsignedInt242, iArr2);
    }

    public static PrivFrame decodePrivFrame(int i, ParsableByteArray parsableByteArray) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(0, i, bArr);
        int indexOfZeroByte = indexOfZeroByte(0, bArr);
        String str = new String(bArr, 0, indexOfZeroByte, StandardCharsets.ISO_8859_1);
        int i2 = indexOfZeroByte + 1;
        return new PrivFrame(str, i <= i2 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static TextInformationFrame decodeTextInformationFrame(int i, ParsableByteArray parsableByteArray, String str) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(0, i2, bArr);
        return new TextInformationFrame(str, null, decodeTextInformationFrameValues(readUnsignedByte, 0, bArr));
    }

    public static RegularImmutableList decodeTextInformationFrameValues(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return ImmutableList.of((Object) "");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int indexOfTerminator = indexOfTerminator(i2, i, bArr);
        while (i2 < indexOfTerminator) {
            builder.m2032add((Object) new String(bArr, i2, indexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + indexOfTerminator;
            indexOfTerminator = indexOfTerminator(i2, i, bArr);
        }
        RegularImmutableList build = builder.build();
        return build.isEmpty() ? ImmutableList.of((Object) "") : build;
    }

    public static TextInformationFrame decodeTxxxFrame(int i, ParsableByteArray parsableByteArray) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(0, i2, bArr);
        int indexOfTerminator = indexOfTerminator(0, readUnsignedByte, bArr);
        return new TextInformationFrame("TXXX", new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte)), decodeTextInformationFrameValues(readUnsignedByte, delimiterLength(readUnsignedByte) + indexOfTerminator, bArr));
    }

    public static UrlLinkFrame decodeUrlLinkFrame(int i, ParsableByteArray parsableByteArray, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(0, i, bArr);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static UrlLinkFrame decodeWxxxFrame(int i, ParsableByteArray parsableByteArray) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(0, i2, bArr);
        int indexOfTerminator = indexOfTerminator(0, readUnsignedByte, bArr);
        String str = new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte));
        int delimiterLength = delimiterLength(readUnsignedByte) + indexOfTerminator;
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(delimiterLength, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset getCharset(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int indexOfTerminator(int i, int i2, byte[] bArr) {
        int indexOfZeroByte = indexOfZeroByte(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return indexOfZeroByte;
        }
        while (indexOfZeroByte < bArr.length - 1) {
            if ((indexOfZeroByte - i) % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                return indexOfZeroByte;
            }
            indexOfZeroByte = indexOfZeroByte(indexOfZeroByte + 1, bArr);
        }
        return bArr.length;
    }

    public static int indexOfZeroByte(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int removeUnsynchronization(int i, ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.data;
        int i2 = parsableByteArray.position;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean validateFrames(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int readUnsignedInt24;
        long readUnsignedInt242;
        int i3;
        int i4;
        int i5 = parsableByteArray.position;
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    parsableByteArray.setPosition(i5);
                    return true;
                }
                if (i >= 3) {
                    readUnsignedInt24 = parsableByteArray.readInt();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt();
                    i3 = parsableByteArray.readUnsignedShort();
                } else {
                    readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
                    readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
                    i3 = 0;
                }
                if (readUnsignedInt24 == 0 && readUnsignedInt242 == 0 && i3 == 0) {
                    parsableByteArray.setPosition(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & readUnsignedInt242) != 0) {
                        parsableByteArray.setPosition(i5);
                        return false;
                    }
                    readUnsignedInt242 = (((readUnsignedInt242 >> 24) & 255) << 21) | (readUnsignedInt242 & 255) | (((readUnsignedInt242 >> 8) & 255) << 7) | (((readUnsignedInt242 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i4 += 4;
                    }
                    if (readUnsignedInt242 < i4) {
                        parsableByteArray.setPosition(i5);
                        return false;
                    }
                    if (parsableByteArray.bytesLeft() < readUnsignedInt242) {
                        parsableByteArray.setPosition(i5);
                        return false;
                    }
                    parsableByteArray.skipBytes((int) readUnsignedInt242);
                }
            } catch (Throwable th) {
                parsableByteArray.setPosition(i5);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Metadata decode(int i, byte[] bArr) {
        BlockContinueImpl blockContinueImpl;
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        boolean z = false;
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
            if (readUnsignedInt24 == 4801587) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
                if (readUnsignedByte == 2) {
                    if ((readUnsignedByte2 & 64) != 0) {
                        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    blockContinueImpl = new BlockContinueImpl(readUnsignedByte, readUnsignedByte >= 4 && (readUnsignedByte2 & 128) != 0, readSynchSafeInt);
                } else {
                    if (readUnsignedByte == 3) {
                        if ((readUnsignedByte2 & 64) != 0) {
                            int readInt = parsableByteArray.readInt();
                            parsableByteArray.skipBytes(readInt);
                            readSynchSafeInt -= readInt + 4;
                        }
                    } else if (readUnsignedByte == 4) {
                        if ((readUnsignedByte2 & 64) != 0) {
                            int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                            parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                            readSynchSafeInt -= readSynchSafeInt2;
                        }
                        if ((readUnsignedByte2 & 16) != 0) {
                            readSynchSafeInt -= 10;
                        }
                    } else {
                        Fragment$5$$ExternalSyntheticOutline0.m(readUnsignedByte, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    blockContinueImpl = new BlockContinueImpl(readUnsignedByte, readUnsignedByte >= 4 && (readUnsignedByte2 & 128) != 0, readSynchSafeInt);
                }
                if (blockContinueImpl != null) {
                    return null;
                }
                int i2 = blockContinueImpl.newIndex;
                int i3 = parsableByteArray.position;
                int i4 = i2 == 2 ? 6 : 10;
                int i5 = blockContinueImpl.newColumn;
                if (blockContinueImpl.finalize) {
                    i5 = removeUnsynchronization(i5, parsableByteArray);
                }
                parsableByteArray.setLimit(i3 + i5);
                if (!validateFrames(parsableByteArray, i2, i4, false)) {
                    if (i2 != 4 || !validateFrames(parsableByteArray, 4, i4, true)) {
                        Fragment$5$$ExternalSyntheticOutline0.m(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z = true;
                }
                while (parsableByteArray.bytesLeft() >= i4) {
                    Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i4, this.framePredicate);
                    if (decodeFrame != null) {
                        arrayList.add(decodeFrame);
                    }
                }
                return new Metadata(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(readUnsignedInt24))));
        }
        blockContinueImpl = null;
        if (blockContinueImpl != null) {
        }
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.limit(), byteBuffer.array());
    }
}
