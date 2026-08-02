package androidx.media3.extractor.avi;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import coil3.size.DimensionKt;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ListChunk implements AviChunk {
    public final ImmutableList children;

    /* renamed from: type, reason: collision with root package name */
    public final int f888type;

    public ListChunk(int i, RegularImmutableList regularImmutableList) {
        this.f888type = i;
        this.children = regularImmutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ListChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        AviChunk streamFormatChunk;
        String str;
        int i2 = 4;
        DimensionKt.checkNonnegative(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = parsableByteArray.limit;
        int i4 = -2;
        int i5 = 0;
        while (parsableByteArray.bytesLeft() > 8) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int readLittleEndianInt2 = parsableByteArray.position + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(readLittleEndianInt2);
            if (readLittleEndianInt != 1414744396) {
                AviStreamHeaderChunk aviStreamHeaderChunk = null;
                switch (readLittleEndianInt) {
                    case 1718776947:
                        if (i4 == 2) {
                            parsableByteArray.skipBytes(i2);
                            int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
                            int readLittleEndianInt4 = parsableByteArray.readLittleEndianInt();
                            parsableByteArray.skipBytes(i2);
                            int readLittleEndianInt5 = parsableByteArray.readLittleEndianInt();
                            switch (readLittleEndianInt5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                Format.Builder builder = new Format.Builder();
                                builder.width = readLittleEndianInt3;
                                builder.height = readLittleEndianInt4;
                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
                                streamFormatChunk = new StreamFormatChunk(new Format(builder));
                                break;
                            } else {
                                Fragment$5$$ExternalSyntheticOutline0.m(readLittleEndianInt5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                streamFormatChunk = aviStreamHeaderChunk;
                                break;
                            }
                        } else {
                            if (i4 == 1) {
                                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                                String str2 = readLittleEndianUnsignedShort != 1 ? readLittleEndianUnsignedShort != 85 ? readLittleEndianUnsignedShort != 255 ? readLittleEndianUnsignedShort != 8192 ? readLittleEndianUnsignedShort != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
                                    int readLittleEndianInt6 = parsableByteArray.readLittleEndianInt();
                                    parsableByteArray.skipBytes(6);
                                    int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
                                    String str3 = Util.DEVICE_DEBUG_INFO;
                                    int pcmEncoding = Util.getPcmEncoding(readLittleEndianUnsignedShort3, ByteOrder.LITTLE_ENDIAN);
                                    int readLittleEndianUnsignedShort4 = parsableByteArray.bytesLeft() > 0 ? parsableByteArray.readLittleEndianUnsignedShort() : 0;
                                    Format.Builder builder2 = new Format.Builder();
                                    builder2.sampleMimeType = MimeTypes.normalizeMimeType(str2);
                                    builder2.channelCount = readLittleEndianUnsignedShort2;
                                    builder2.sampleRate = readLittleEndianInt6;
                                    if (str2.equals("audio/raw") && pcmEncoding != 0) {
                                        builder2.pcmEncoding = pcmEncoding;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && readLittleEndianUnsignedShort4 > 0) {
                                        byte[] bArr = new byte[readLittleEndianUnsignedShort4];
                                        parsableByteArray.readBytes(0, readLittleEndianUnsignedShort4, bArr);
                                        builder2.initializationData = ImmutableList.of((Object) bArr);
                                    }
                                    streamFormatChunk = new StreamFormatChunk(new Format(builder2));
                                    break;
                                } else {
                                    Fragment$5$$ExternalSyntheticOutline0.m(readLittleEndianUnsignedShort, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                Log.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(Util.getTrackTypeString(i4)));
                            }
                            streamFormatChunk = aviStreamHeaderChunk;
                        }
                    case 1751742049:
                        int readLittleEndianInt7 = parsableByteArray.readLittleEndianInt();
                        parsableByteArray.skipBytes(8);
                        int readLittleEndianInt8 = parsableByteArray.readLittleEndianInt();
                        int readLittleEndianInt9 = parsableByteArray.readLittleEndianInt();
                        parsableByteArray.skipBytes(i2);
                        parsableByteArray.readLittleEndianInt();
                        parsableByteArray.skipBytes(12);
                        streamFormatChunk = new AviMainHeaderChunk(readLittleEndianInt7, readLittleEndianInt8, readLittleEndianInt9);
                        break;
                    case 1752331379:
                        int readLittleEndianInt10 = parsableByteArray.readLittleEndianInt();
                        parsableByteArray.skipBytes(12);
                        parsableByteArray.readLittleEndianInt();
                        int readLittleEndianInt11 = parsableByteArray.readLittleEndianInt();
                        int readLittleEndianInt12 = parsableByteArray.readLittleEndianInt();
                        parsableByteArray.skipBytes(i2);
                        int readLittleEndianInt13 = parsableByteArray.readLittleEndianInt();
                        int readLittleEndianInt14 = parsableByteArray.readLittleEndianInt();
                        parsableByteArray.skipBytes(i2);
                        aviStreamHeaderChunk = new AviStreamHeaderChunk(readLittleEndianInt10, readLittleEndianInt11, readLittleEndianInt12, readLittleEndianInt13, readLittleEndianInt14, parsableByteArray.readLittleEndianInt());
                        streamFormatChunk = aviStreamHeaderChunk;
                        break;
                    case 1852994675:
                        streamFormatChunk = new StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft(), StandardCharsets.UTF_8));
                        break;
                    default:
                        streamFormatChunk = aviStreamHeaderChunk;
                        break;
                }
            } else {
                streamFormatChunk = parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray);
            }
            if (streamFormatChunk != null) {
                if (streamFormatChunk.getType() == 1752331379) {
                    i4 = ((AviStreamHeaderChunk) streamFormatChunk).getTrackType();
                }
                int i6 = i5 + 1;
                int expandedCapacity = ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i6);
                if (expandedCapacity > objArr.length) {
                    objArr = Arrays.copyOf(objArr, expandedCapacity);
                }
                objArr[i5] = streamFormatChunk;
                i5 = i6;
            }
            parsableByteArray.setPosition(readLittleEndianInt2);
            parsableByteArray.setLimit(i3);
            i2 = 4;
        }
        return new ListChunk(i, ImmutableList.asImmutableList(i5, objArr));
    }

    public final AviChunk getChild(Class cls) {
        ImmutableList.Itr listIterator = this.children.listIterator(0);
        while (listIterator.hasNext()) {
            AviChunk aviChunk = (AviChunk) listIterator.next();
            if (aviChunk.getClass() == cls) {
                return aviChunk;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return this.f888type;
    }
}
