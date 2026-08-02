package androidx.media3.extractor.mp4;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.decoder.Buffer;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.ts.MpeghUtil;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.common.collect.ImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Sniffer {
    public static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static String getContainerMimeType(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((TrackSampleTable) it.next()).track.f892format.sampleMimeType;
            if (MimeTypes.isVideo(str2)) {
                return "video/mp4";
            }
            if (MimeTypes.isAudio(str2)) {
                z = true;
            } else if (MimeTypes.isImage(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (COMPATIBLE_BRANDS[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int readInt2 = parsableByteArray.readInt();
        byte[] bArr = BoxParser.opusMagic;
        int i = readInt2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            Fragment$5$$ExternalSyntheticOutline0.m(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i2 = readInt - 16;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(0, i2, bArr2);
        return new ApicFrame(3, str, null, bArr2);
    }

    public static TextInformationFrame parseIndexAndCountAttribute(int i, ParsableByteArray parsableByteArray, String str) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && readInt >= 22) {
            parsableByteArray.skipBytes(10);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            if (readUnsignedShort > 0) {
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readUnsignedShort, "");
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    m = Boxes$$ExternalSyntheticOutline1.m(readUnsignedShort2, m, "/");
                }
                return new TextInformationFrame(str, null, ImmutableList.of((Object) m));
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(Buffer.getBoxTypeString(i)));
        return null;
    }

    public static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i = readInt - 16;
            if (i == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i == 3) {
                return parsableByteArray.readUnsignedInt24();
            }
            if (i == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                return parsableByteArray.readUnsignedIntToInt();
            }
        }
        Log.w("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static TextInformationFrame parseTextAttribute(int i, ParsableByteArray parsableByteArray, String str) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, ImmutableList.of((Object) parsableByteArray.readNullTerminatedString(readInt - 16)));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(Buffer.getBoxTypeString(i)));
        return null;
    }

    public static void setFormatMetadata(int i, Metadata metadata, Format.Builder builder, Metadata metadata2, Metadata... metadataArr) {
        if (metadata2 == null) {
            metadata2 = new Metadata(new Metadata.Entry[0]);
        }
        if (metadata != null) {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (Metadata.Entry entry : metadata.entries) {
                if (MdtaMetadataEntry.class.isAssignableFrom(entry.getClass())) {
                    builder2.m2032add(MdtaMetadataEntry.class.cast(r4));
                }
            }
            ImmutableList.Itr listIterator = builder2.build().listIterator(0);
            while (listIterator.hasNext()) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) listIterator.next();
                if (!mdtaMetadataEntry.key.equals("com.android.capture.fps") || i == 2) {
                    metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.entries.length > 0) {
            builder.metadata = metadata2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z, boolean z2) {
        SniffFailure sniffFailure;
        int i;
        long j;
        int i2;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        boolean z3;
        int[] iArr;
        long length = extractorInput.getLength();
        long j4 = -1;
        int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j5 = 4096;
        if (i6 != 0 && length <= 4096) {
            j5 = length;
        }
        int i7 = (int) j5;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (i9 < i7) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.data, i8, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                j = j4;
                extractorInput.peekFully(8, 8, parsableByteArray.data);
                i4 = 16;
                parsableByteArray.setLimit(16);
                i2 = i9;
                j2 = parsableByteArray.readLong();
                i3 = i6;
            } else {
                j = j4;
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                long j6 = readUnsignedInt;
                i2 = i9;
                j2 = j6;
                i3 = i6;
                i4 = 8;
            }
            long j7 = i4;
            if (j2 < j7) {
                sniffFailure = null;
                if (readInt != 1718773093 || i4 != 8) {
                    return new MpeghUtil.MhasPacketHeader(readInt, i4, j2);
                }
                j2 = j7;
            } else {
                sniffFailure = null;
            }
            int i10 = i2 + i4;
            if (readInt == 1836019574 || readInt == 1970628964) {
                i7 += (int) j2;
                if (i3 != 0 && i7 > length) {
                    i7 = (int) length;
                }
                if (readInt == 1836019574) {
                    i9 = i10;
                    i6 = i3;
                    j4 = j;
                    i8 = 0;
                }
            }
            if (readInt != 1953653099 && readInt != 1835297121 && readInt != 1835626086) {
                if (readInt != 1836019558 && readInt != 1836475768) {
                    if (readInt == 1835295092) {
                        z4 = true;
                    }
                    if (readInt != 1937007212 || j2 <= 1000000) {
                        j3 = length;
                        if ((i10 + j2) - j7 < i7) {
                            int i11 = (int) (j2 - j7);
                            i9 = i10 + i11;
                            if (readInt != 1718909296) {
                                i5 = 0;
                                if (i11 != 0) {
                                    extractorInput.advancePeekPosition(i11);
                                }
                            } else {
                                if (i11 < 8) {
                                    return new MpeghUtil.MhasPacketHeader(readInt, 8, i11);
                                }
                                parsableByteArray.reset(i11);
                                i5 = 0;
                                extractorInput.peekFully(0, i11, parsableByteArray.data);
                                int readInt2 = parsableByteArray.readInt();
                                if (isCompatibleBrand(readInt2, z2)) {
                                    z4 = true;
                                }
                                parsableByteArray.skipBytes(4);
                                int bytesLeft = parsableByteArray.bytesLeft() / 4;
                                if (!z4 && bytesLeft > 0) {
                                    int[] iArr2 = new int[bytesLeft];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= bytesLeft) {
                                            z3 = z4;
                                            iArr = iArr2;
                                            break;
                                        }
                                        int readInt3 = parsableByteArray.readInt();
                                        iArr2[i12] = readInt3;
                                        if (isCompatibleBrand(readInt3, z2)) {
                                            z3 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i12++;
                                    }
                                } else {
                                    z3 = z4;
                                    iArr = sniffFailure;
                                }
                                if (!z3) {
                                    return new androidx.media3.extractor.mkv.Sniffer(readInt2, iArr);
                                }
                                z4 = z3;
                            }
                        }
                    }
                    i = 0;
                    break;
                }
                i = 1;
                break;
            }
            j3 = length;
            i5 = 0;
            i9 = i10;
            i8 = i5;
            i6 = i3;
            j4 = j;
            length = j3;
        }
        sniffFailure = null;
        i = i8;
        return !z4 ? NoDeclaredBrandSniffFailure.INSTANCE : z != i ? i != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED : sniffFailure;
    }

    public static Id3Frame parseIntegerAttribute(int i, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int parseIntegerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z2) {
            parseIntegerAttribute = Math.min(1, parseIntegerAttribute);
        }
        if (parseIntegerAttribute < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(Buffer.getBoxTypeString(i)));
            return null;
        }
        if (z) {
            return new TextInformationFrame(str, null, ImmutableList.of((Object) Integer.toString(parseIntegerAttribute)));
        }
        return new CommentFrame("und", str, Integer.toString(parseIntegerAttribute));
    }
}
