package androidx.media3.extractor;

import android.util.Base64;
import androidx.biometric.BiometricPrompt;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PagingConfig;
import androidx.tracing.Trace;
import coil3.svg.internal.AndroidSvg;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.idrnd.misnap.iad.IadFrame;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AacUtil {
    public static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    public static final int[] SAMPLE_RATE_BY_FSCOD = {48000, 44100, 32000};
    public static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    public static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 192, 224, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};
    public static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] SAMPLE_RATE_BY_INDEX = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    public static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    public static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    public static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    public static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};
    public static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    public static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] BITRATE_V2_L1 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] BITRATE_V1_L2 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] BITRATE_V1_L3 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] BITRATE_V2 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static boolean checkAndReadFrameHeader(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i, IadFrame iadFrame) {
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long j = readUnsignedInt >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((readUnsignedInt >> 12) & 15);
        int i3 = (int) ((readUnsignedInt >> 8) & 15);
        int i4 = (int) ((readUnsignedInt >> 4) & 15);
        int i5 = (int) ((readUnsignedInt >> 1) & 7);
        boolean z2 = (readUnsignedInt & 1) == 1;
        if (i4 <= 7) {
            if (i4 != flacStreamMetadata.channels - 1) {
                return false;
            }
        } else if (i4 > 10 || flacStreamMetadata.channels != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == flacStreamMetadata.bitsPerSampleLookupKey) || z2) {
            return false;
        }
        try {
            long readUtf8EncodedLong = parsableByteArray.readUtf8EncodedLong();
            if (!z) {
                readUtf8EncodedLong *= flacStreamMetadata.maxBlockSizeSamples;
            }
            long j2 = flacStreamMetadata.totalSamples;
            if (j2 != 0 && readUtf8EncodedLong > j2) {
                return false;
            }
            iadFrame.b = readUtf8EncodedLong;
            int readFrameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(i2, parsableByteArray);
            long j3 = flacStreamMetadata.totalSamples;
            boolean z3 = j3 == 0 || readUtf8EncodedLong + ((long) readFrameBlockSizeSamplesFromKey) >= j3;
            if (readFrameBlockSizeSamplesFromKey == -1) {
                return false;
            }
            if ((!z3 && readFrameBlockSizeSamplesFromKey < flacStreamMetadata.minBlockSizeSamples) || readFrameBlockSizeSamplesFromKey > flacStreamMetadata.maxBlockSizeSamples) {
                return false;
            }
            int i6 = flacStreamMetadata.sampleRate;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != flacStreamMetadata.sampleRateLookupKey) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int readUnsignedShort = parsableByteArray.readUnsignedShort();
                    if (i3 == 14) {
                        readUnsignedShort *= 10;
                    }
                    if (readUnsignedShort != i6) {
                        return false;
                    }
                } else if (parsableByteArray.readUnsignedByte() * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO != i6) {
                    return false;
                }
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int i7 = parsableByteArray.position;
            byte[] bArr = parsableByteArray.data;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = parsableByteArray.position; i10 < i8; i10++) {
                i9 = Util.CRC8_BYTES_MSBF[i9 ^ (bArr[i10] & 255)];
            }
            String str = Util.DEVICE_DEBUG_INFO;
            if (readUnsignedByte != i9) {
                return false;
            }
            if (parsableByteArray.bytesLeft() != 0) {
                int peekUnsignedByte = parsableByteArray.peekUnsignedByte();
                if ((peekUnsignedByte & 128) != 0) {
                    return false;
                }
                int i11 = (peekUnsignedByte & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    Log.i("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void checkContainerInput(String str, boolean z) {
        if (!z) {
            throw ParserException.createForMalformedContainer(null, str);
        }
    }

    public static void consume(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i;
        while (true) {
            if (parsableByteArray.bytesLeft() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (parsableByteArray.bytesLeft() == 0) {
                    i = -1;
                    break;
                }
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                i2 += readUnsignedByte;
                if (readUnsignedByte != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (parsableByteArray.bytesLeft() == 0) {
                    i3 = -1;
                    break;
                }
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i3 += readUnsignedByte2;
                if (readUnsignedByte2 != 255) {
                    break;
                }
            }
            int i4 = parsableByteArray.position + i3;
            if (i3 == -1 || i3 > parsableByteArray.bytesLeft()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = parsableByteArray.limit;
            } else if (i == 4 && i3 >= 8) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readInt = readUnsignedShort == 49 ? parsableByteArray.readInt() : 0;
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                if (readUnsignedShort == 47) {
                    parsableByteArray.skipBytes(1);
                }
                boolean z = readUnsignedByte3 == 181 && (readUnsignedShort == 49 || readUnsignedShort == 47) && readUnsignedByte4 == 3;
                if (readUnsignedShort == 49) {
                    z &= readInt == 1195456820;
                }
                if (z) {
                    consumeCcData(j, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.setPosition(i4);
        }
    }

    public static void consumeCcData(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i = (readUnsignedByte & 31) * 3;
            int i2 = parsableByteArray.position;
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.setPosition(i2);
                trackOutput.sampleData(i, parsableByteArray);
                Trace.checkState(j != -9223372036854775807L);
                trackOutput.sampleMetadata(j, 1, i, 0, null);
            }
        }
    }

    public static int getAc3SyncframeSize(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = SAMPLE_RATE_BY_FSCOD[i];
        if (i4 == 44100) {
            return ((i2 % 2) + SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1[i3]) * 2;
        }
        int i5 = BITRATE_BY_HALF_FRMSIZECOD[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static void getAc4SampleHeader(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] bArr = parsableByteArray.data;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getDtsFrameSize(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            return !z ? (i2 * 16) / 14 : i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (!z) {
        }
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1] : BITRATE_V2[i4 - 1];
        if (i2 == 3) {
            return Boxes$$ExternalSyntheticOutline1.m$2(i8, 144, i6, i7);
        }
        return Boxes$$ExternalSyntheticOutline1.m$2(i3 == 1 ? 72 : 144, i8, i6, i7);
    }

    public static int getFrameType(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static int getMaximumEncodedRateBytesPerSecond(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static VorbisBitArray getNormalizedFrame(byte[] bArr) {
        byte[] bArr2;
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new VorbisBitArray(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = copyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b3 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b3;
            }
        }
        VorbisBitArray vorbisBitArray = new VorbisBitArray(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            VorbisBitArray vorbisBitArray2 = new VorbisBitArray(copyOf, copyOf.length);
            while (vorbisBitArray2.bitsLeft() >= 16) {
                vorbisBitArray2.skipBits(2);
                int readBits = vorbisBitArray2.readBits(14) & 16383;
                int min = Math.min(8 - vorbisBitArray.byteOffset, 14);
                int i3 = vorbisBitArray.byteOffset;
                int i4 = (8 - i3) - min;
                byte[] bArr3 = vorbisBitArray.data;
                int i5 = vorbisBitArray.byteLimit;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr3[i5]);
                bArr3[i5] = b4;
                int i6 = 14 - min;
                bArr3[i5] = (byte) (b4 | ((readBits >>> i6) << i4));
                int i7 = i5 + 1;
                while (true) {
                    bArr2 = vorbisBitArray.data;
                    if (i6 > 8) {
                        bArr2[i7] = (byte) (readBits >>> (i6 - 8));
                        i6 -= 8;
                        i7++;
                    }
                }
                int i8 = 8 - i6;
                byte b5 = (byte) (bArr2[i7] & ((1 << i8) - 1));
                bArr2[i7] = b5;
                bArr2[i7] = (byte) (((readBits & ((1 << i6) - 1)) << i8) | b5);
                vorbisBitArray.skipBits(14);
                vorbisBitArray.assertValidOffset();
            }
        }
        vorbisBitArray.reset(copyOf.length, copyOf);
        return vorbisBitArray;
    }

    public static int getSamplingFrequency(VorbisBitArray vorbisBitArray) {
        int readBits = vorbisBitArray.readBits(4);
        if (readBits == 15) {
            if (vorbisBitArray.bitsLeft() >= 24) {
                return vorbisBitArray.readBits(24);
            }
            throw ParserException.createForMalformedContainer(null, "AAC header insufficient data");
        }
        if (readBits < 13) {
            return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[readBits];
        }
        throw ParserException.createForMalformedContainer(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PagingConfig parseAc4SyncframeInfo(VorbisBitArray vorbisBitArray) {
        int i;
        int i2;
        int readBits = vorbisBitArray.readBits(16);
        int readBits2 = vorbisBitArray.readBits(16);
        if (readBits2 == 65535) {
            readBits2 = vorbisBitArray.readBits(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = readBits2 + i;
        if (readBits == 44097) {
            i3 += 2;
        }
        if (vorbisBitArray.readBits(2) == 3) {
            do {
                vorbisBitArray.readBits(2);
            } while (vorbisBitArray.readBit());
        }
        int readBits3 = vorbisBitArray.readBits(10);
        if (vorbisBitArray.readBit() && vorbisBitArray.readBits(3) > 0) {
            vorbisBitArray.skipBits(2);
        }
        int i4 = vorbisBitArray.readBit() ? 48000 : 44100;
        int readBits4 = vorbisBitArray.readBits(4);
        int[] iArr = SAMPLE_COUNT;
        if (i4 == 44100 && readBits4 == 13) {
            i2 = iArr[readBits4];
        } else if (i4 != 48000 || readBits4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[readBits4];
            int i6 = readBits3 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (readBits4 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (readBits4 != 3) {
                            if (readBits4 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (readBits4 != 3) {
            }
            i2 = i5 + 1;
        }
        return new PagingConfig(i4, i3, i2);
    }

    public static Config parseAudioSpecificConfig(VorbisBitArray vorbisBitArray, boolean z) {
        int readBits = vorbisBitArray.readBits(5);
        if (readBits == 31) {
            readBits = vorbisBitArray.readBits(6) + 32;
        }
        int samplingFrequency = getSamplingFrequency(vorbisBitArray);
        int readBits2 = vorbisBitArray.readBits(4);
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readBits, "mp4a.40.");
        if (readBits == 5 || readBits == 29) {
            samplingFrequency = getSamplingFrequency(vorbisBitArray);
            int readBits3 = vorbisBitArray.readBits(5);
            if (readBits3 == 31) {
                readBits3 = vorbisBitArray.readBits(6) + 32;
            }
            readBits = readBits3;
            if (readBits == 22) {
                readBits2 = vorbisBitArray.readBits(4);
            }
        }
        if (z) {
            if (readBits != 1 && readBits != 2 && readBits != 3 && readBits != 4 && readBits != 6 && readBits != 7 && readBits != 17) {
                switch (readBits) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + readBits);
                }
            }
            if (vorbisBitArray.readBit()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (vorbisBitArray.readBit()) {
                vorbisBitArray.skipBits(14);
            }
            boolean readBit = vorbisBitArray.readBit();
            if (readBits2 == 0) {
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return null;
            }
            if (readBits == 6 || readBits == 20) {
                vorbisBitArray.skipBits(3);
            }
            if (readBit) {
                if (readBits == 22) {
                    vorbisBitArray.skipBits(16);
                }
                if (readBits == 17 || readBits == 19 || readBits == 20 || readBits == 23) {
                    vorbisBitArray.skipBits(3);
                }
                vorbisBitArray.skipBits(1);
            }
            switch (readBits) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int readBits4 = vorbisBitArray.readBits(2);
                    if (readBits4 == 2 || readBits4 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + readBits4);
                    }
            }
        }
        int i = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[readBits2];
        if (i != -1) {
            return new Config(samplingFrequency, i, m);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static void parseDsiSubstream(VorbisBitArray vorbisBitArray, Ac4Util$Ac4Presentation ac4Util$Ac4Presentation) {
        int readBits = vorbisBitArray.readBits(5);
        vorbisBitArray.skipBits(2);
        if (vorbisBitArray.readBit()) {
            vorbisBitArray.skipBits(5);
        }
        if (readBits >= 7 && readBits <= 10) {
            vorbisBitArray.skipBit();
        }
        if (vorbisBitArray.readBit()) {
            int readBits2 = vorbisBitArray.readBits(3);
            if (ac4Util$Ac4Presentation.channelMode == -1 && readBits >= 0 && readBits <= 15 && (readBits2 == 0 || readBits2 == 1)) {
                ac4Util$Ac4Presentation.channelMode = readBits;
            }
            if (vorbisBitArray.readBit()) {
                skipDsiLanguage(vorbisBitArray);
            }
        }
    }

    public static void parseDsiSubstreamGroup(VorbisBitArray vorbisBitArray, Ac4Util$Ac4Presentation ac4Util$Ac4Presentation) {
        vorbisBitArray.skipBits(2);
        boolean readBit = vorbisBitArray.readBit();
        int readBits = vorbisBitArray.readBits(8);
        for (int i = 0; i < readBits; i++) {
            vorbisBitArray.skipBits(2);
            if (vorbisBitArray.readBit()) {
                vorbisBitArray.skipBits(5);
            }
            if (readBit) {
                vorbisBitArray.skipBits(24);
            } else {
                if (vorbisBitArray.readBit()) {
                    if (!vorbisBitArray.readBit()) {
                        vorbisBitArray.skipBits(4);
                    }
                    ac4Util$Ac4Presentation.numOfUmxObjects = vorbisBitArray.readBits(6) + 1;
                }
                vorbisBitArray.skipBits(4);
            }
        }
        if (vorbisBitArray.readBit()) {
            vorbisBitArray.skipBits(3);
            if (vorbisBitArray.readBit()) {
                skipDsiLanguage(vorbisBitArray);
            }
        }
    }

    public static int parseUnsignedVarInt(VorbisBitArray vorbisBitArray, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && vorbisBitArray.readBit(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return vorbisBitArray.readBits(iArr[i]) + i3;
    }

    public static Metadata parseVorbisComments(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = Util.DEVICE_DEBUG_INFO;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ParsableByteArray(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    Log.w("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static int readFrameBlockSizeSamplesFromKey(int i, ParsableByteArray parsableByteArray) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return parsableByteArray.readUnsignedByte() + 1;
            case 7:
                return parsableByteArray.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static AndroidSvg readSeekTableMetadataBlock(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(1);
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        long j = parsableByteArray.position + readUnsignedInt24;
        int i = readUnsignedInt24 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long readLong = parsableByteArray.readLong();
            if (readLong == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = readLong;
            jArr2[i2] = parsableByteArray.readLong();
            parsableByteArray.skipBytes(2);
            i2++;
        }
        parsableByteArray.skipBytes((int) (j - parsableByteArray.position));
        return new AndroidSvg(5, jArr, jArr2);
    }

    public static BiometricPrompt readVorbisCommentHeader(ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        if (z) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt(), StandardCharsets.UTF_8);
        long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) readLittleEndianUnsignedInt];
        for (int i = 0; i < readLittleEndianUnsignedInt; i++) {
            strArr[i] = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt(), StandardCharsets.UTF_8);
        }
        if (z2 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw ParserException.createForMalformedContainer(null, "framing bit expected to be set");
        }
        return new BiometricPrompt(strArr, 27);
    }

    public static void skipDsiLanguage(VorbisBitArray vorbisBitArray) {
        int readBits = vorbisBitArray.readBits(6);
        if (readBits < 2 || readBits > 42) {
            throw ParserException.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(readBits)));
        }
        vorbisBitArray.skipBits(readBits * 8);
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, ParsableByteArray parsableByteArray, boolean z) {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer(null, "too short header: " + parsableByteArray.bytesLeft());
        }
        if (parsableByteArray.readUnsignedByte() != i) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer(null, "expected header type " + Integer.toHexString(i));
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.createForMalformedContainer(null, "expected characters 'vorbis'");
    }

    public final class Config {
        public final int channelCount;
        public final String codecs;
        public final int sampleRateHz;

        public Config(int i, int i2, String str) {
            this.sampleRateHz = i;
            this.channelCount = i2;
            this.codecs = str;
        }

        public Config(int i, int i2, int i3, long j, String str) {
            this.codecs = str;
            this.channelCount = i;
            this.sampleRateHz = i2;
        }
    }
}
