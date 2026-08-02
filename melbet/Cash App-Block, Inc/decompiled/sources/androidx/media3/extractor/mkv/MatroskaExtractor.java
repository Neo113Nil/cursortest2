package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.metadata.ThumbnailMetadata;
import androidx.media3.extractor.mkv.DefaultEbmlReader;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.plaid.internal.EnumC0170g;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MatroskaExtractor implements Extractor {
    public static final byte[] SSA_DIALOGUE_FORMAT;
    public static final byte[] SSA_PREFIX;
    public static final byte[] SUBRIP_PREFIX = {PnmConstants.PBM_TEXT_CODE, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, PnmConstants.PNM_SEPARATOR, 45, 45, 62, PnmConstants.PNM_SEPARATOR, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final Map TRACK_NAME_TO_ROTATION_DEGREES;
    public static final byte[] VTT_PREFIX;
    public static final UUID WAVE_SUBFORMAT_PCM;
    public int blockAdditionalId;
    public long blockDurationUs;
    public int blockFlags;
    public long blockGroupDiscardPaddingNs;
    public boolean blockHasReferenceBlock;
    public int blockSampleCount;
    public int blockSampleIndex;
    public int[] blockSampleSizes;
    public int blockState;
    public long blockTimeUs;
    public int blockTrackNumber;
    public int blockTrackNumberLength;
    public long clusterTimecodeUs;
    public long cuesContentPosition;
    public long currentCueClusterPosition;
    public long currentCueRelativePosition;
    public long currentCueTimeUs;
    public int currentCueTrackNumber;
    public Track currentTrack;
    public long durationTimecode;
    public long durationUs;
    public final ParsableByteArray encryptionInitializationVector;
    public final ParsableByteArray encryptionSubsampleData;
    public ByteBuffer encryptionSubsampleDataBuffer;
    public ExtractorOutput extractorOutput;
    public boolean haveOutputSample;
    public boolean inCuesElement;
    public boolean isWebm;
    public final ParsableByteArray nalLength;
    public final ParsableByteArray nalStartCode;
    public final boolean parseSubtitlesDuringExtraction;
    public boolean pendingEndTracks;
    public final SparseArray perTrackCues;
    public int primarySeekTrackNumber;
    public final DefaultEbmlReader reader;
    public int sampleBytesRead;
    public int sampleBytesWritten;
    public int sampleCurrentNalBytesRemaining;
    public boolean sampleEncodingHandled;
    public boolean sampleInitializationVectorRead;
    public int samplePartitionCount;
    public boolean samplePartitionCountRead;
    public byte sampleSignalByte;
    public boolean sampleSignalByteRead;
    public final ParsableByteArray sampleStrippedBytes;
    public final ParsableByteArray scratch;
    public int seekEntryId;
    public final ParsableByteArray seekEntryIdBytes;
    public long seekEntryPosition;
    public boolean seekForCues;
    public final boolean seekForCuesEnabled;
    public long seekPositionAfterBuildingCues;
    public long segmentContentPosition;
    public long segmentContentSize;
    public boolean sentSeekMap;
    public final SubtitleParser.Factory subtitleParserFactory;
    public final ParsableByteArray subtitleSample;
    public final ParsableByteArray supplementalData;
    public long timecodeScale;
    public final SparseArray tracks;
    public final VarintReader varintReader;
    public final ParsableByteArray vorbisNumPageSamples;

    public final class MatroskaSeekMap implements SeekMap {
        public final ChunkIndex chunkIndex;
        public final long durationUs;
        public final SparseArray perTrackCues;
        public final int primarySeekTrackNumber;

        public final class CuePointData implements Comparable {
            public final long clusterPosition;
            public final long relativePosition;
            public final long timeUs;

            public CuePointData(long j, long j2, long j3) {
                this.timeUs = j;
                this.clusterPosition = j2;
                this.relativePosition = j3;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Object obj) {
                return Long.compare(this.timeUs, ((CuePointData) obj).timeUs);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CuePointData)) {
                    return false;
                }
                CuePointData cuePointData = (CuePointData) obj;
                return this.timeUs == cuePointData.timeUs && this.clusterPosition == cuePointData.clusterPosition && this.relativePosition == cuePointData.relativePosition;
            }

            public final int hashCode() {
                return Objects.hash(Long.valueOf(this.timeUs), Long.valueOf(this.clusterPosition), Long.valueOf(this.relativePosition));
            }
        }

        public MatroskaSeekMap(SparseArray sparseArray, long j, int i, long j2, long j3) {
            ChunkIndex chunkIndex;
            int i2;
            this.perTrackCues = sparseArray;
            this.durationUs = j;
            this.primarySeekTrackNumber = i;
            List list = (List) sparseArray.get(i);
            if (list == null || list.isEmpty()) {
                chunkIndex = null;
            } else {
                int size = list.size();
                int[] iArr = new int[size];
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                long[] jArr3 = new long[size];
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    CuePointData cuePointData = (CuePointData) list.get(i4);
                    jArr3[i4] = cuePointData.timeUs;
                    jArr[i4] = cuePointData.clusterPosition;
                }
                while (true) {
                    i2 = size - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    int i5 = i3 + 1;
                    iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                    jArr2[i3] = jArr3[i5] - jArr3[i3];
                    i3 = i5;
                }
                int i6 = i2;
                while (i6 > 0 && jArr3[i6] >= j) {
                    i6--;
                }
                iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
                jArr2[i6] = j - jArr3[i6];
                if (i6 < i2) {
                    Log.w("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                    int i7 = i6 + 1;
                    iArr = Arrays.copyOf(iArr, i7);
                    jArr = Arrays.copyOf(jArr, i7);
                    jArr2 = Arrays.copyOf(jArr2, i7);
                    jArr3 = Arrays.copyOf(jArr3, i7);
                }
                chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
            }
            this.chunkIndex = chunkIndex;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            ChunkIndex chunkIndex = this.chunkIndex;
            if (chunkIndex != null) {
                return chunkIndex.getSeekPoints(j);
            }
            SeekPoint seekPoint = SeekPoint.START;
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            List list = (List) this.perTrackCues.get(this.primarySeekTrackNumber);
            return (list == null || list.isEmpty()) ? false : true;
        }
    }

    public final class Track {
        public int audioBitDepth;
        public int bitsPerChannel;
        public int blockAddIdType;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;

        /* renamed from: format, reason: collision with root package name */
        public Format f890format;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        public boolean isWebm;
        public String language;
        public int maxBlockAdditionId;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public float projectionPosePitch;
        public float projectionPoseRoll;
        public float projectionPoseYaw;
        public int projectionType;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;
        public TrueHdSampleRechunker trueHdSampleRechunker;

        /* renamed from: type, reason: collision with root package name */
        public int f891type;
        public boolean waitingForDtsAnalysis;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        public final byte[] getCodecPrivate(String str) {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        String str = Util.DEVICE_DEBUG_INFO;
        SSA_DIALOGUE_FORMAT = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        SSA_PREFIX = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, PnmConstants.PNM_SEPARATOR, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        VTT_PREFIX = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, PnmConstants.PNM_SEPARATOR, 45, 45, 62, PnmConstants.PNM_SEPARATOR, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        Fragment$5$$ExternalSyntheticOutline0.m(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        Fragment$5$$ExternalSyntheticOutline0.m(EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, hashMap, "htc_video_rotA-180", EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, "htc_video_rotA-270");
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i) {
        DefaultEbmlReader defaultEbmlReader = new DefaultEbmlReader();
        this.segmentContentPosition = -1L;
        this.timecodeScale = -9223372036854775807L;
        this.durationTimecode = -9223372036854775807L;
        this.durationUs = -9223372036854775807L;
        this.currentCueTimeUs = -9223372036854775807L;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        this.primarySeekTrackNumber = -1;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = -9223372036854775807L;
        this.reader = defaultEbmlReader;
        defaultEbmlReader.processor = new Toolbar.AnonymousClass1(this);
        this.subtitleParserFactory = factory;
        this.perTrackCues = new SparseArray();
        this.seekForCuesEnabled = (i & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i & 2) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(OpusUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
        this.pendingEndTracks = true;
    }

    public static byte[] formatSubtitleTimecode(long j, long j2, String str) {
        Trace.checkArgument(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = Util.DEVICE_DEBUG_INFO;
        return format2.getBytes(StandardCharsets.UTF_8);
    }

    public final void assertInCues(int i) {
        if (this.inCuesElement) {
            return;
        }
        throw ParserException.createForMalformedContainer(null, "Element " + i + " must be in a Cues");
    }

    public final void assertInTrackEntry(int i) {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        byte[] formatSubtitleTimecode;
        int i4;
        int i5;
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j, i, i2, i3, track.cryptoData);
        } else {
            if ("S_TEXT/UTF8".equals(track.codecId) || "S_TEXT/ASS".equals(track.codecId) || "S_TEXT/SSA".equals(track.codecId) || "S_TEXT/WEBVTT".equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.blockDurationUs;
                    if (j2 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = track.codecId;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        byte[] bArr = parsableByteArray.data;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                formatSubtitleTimecode = formatSubtitleTimecode(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                formatSubtitleTimecode = formatSubtitleTimecode(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                formatSubtitleTimecode = formatSubtitleTimecode(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                Path$$ExternalSyntheticBUOutline0.m$3();
                                return;
                        }
                        System.arraycopy(formatSubtitleTimecode, 0, bArr, i4, formatSubtitleTimecode.length);
                        int i6 = parsableByteArray.position;
                        while (true) {
                            if (i6 < parsableByteArray.limit) {
                                if (parsableByteArray.data[i6] == 0) {
                                    parsableByteArray.setLimit(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        track.output.sampleData(parsableByteArray.limit, parsableByteArray);
                        i5 = i2 + parsableByteArray.limit;
                        if ((i & 268435456) != 0) {
                            int i7 = this.blockSampleCount;
                            ParsableByteArray parsableByteArray2 = this.supplementalData;
                            if (i7 > 1) {
                                parsableByteArray2.reset(0);
                            } else {
                                int i8 = parsableByteArray2.limit;
                                track.output.sampleData(parsableByteArray2, i8, 2);
                                i5 += i8;
                            }
                        }
                        track.output.sampleMetadata(j, i, i5, i3, track.cryptoData);
                    }
                }
            }
            i5 = i2;
            if ((i & 268435456) != 0) {
            }
            track.output.sampleMetadata(j, i, i5, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new Response(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    public final void maybeEndTracks() {
        if (!this.pendingEndTracks) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.tracks;
            if (i >= sparseArray.size()) {
                ExtractorOutput extractorOutput = this.extractorOutput;
                extractorOutput.getClass();
                extractorOutput.endTracks();
                this.pendingEndTracks = false;
                return;
            }
            if (((Track) sparseArray.valueAt(i)).waitingForDtsAnalysis) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0f83, code lost:
    
        if (r0.sentSeekMap == false) goto L930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0f85, code lost:
    
        r6 = r0.seekPositionAfterBuildingCues;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0f89, code lost:
    
        if (r6 == (-1)) goto L931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0f8b, code lost:
    
        r45.b = r6;
        r0.seekPositionAfterBuildingCues = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0f91, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0f98, code lost:
    
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0f98, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0f70, code lost:
    
        r0.seekPositionAfterBuildingCues = r2;
        r45.b = r0.cuesContentPosition;
        r0.seekForCues = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0f7c, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0f92, code lost:
    
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0a1d, code lost:
    
        if (r0.readLong() == r4.getLeastSignificantBits()) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d3d, code lost:
    
        r5 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f64, code lost:
    
        if (r5 == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0f66, code lost:
    
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0f6e, code lost:
    
        if (r0.seekForCues == false) goto L874;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0f7d, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v100, types: [int] */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v103, types: [int] */
    /* JADX WARN: Type inference failed for: r6v116 */
    /* JADX WARN: Type inference failed for: r6v117, types: [int] */
    /* JADX WARN: Type inference failed for: r6v122 */
    /* JADX WARN: Type inference failed for: r6v123 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.media3.extractor.mkv.VarintReader] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        boolean z;
        int i;
        boolean z2;
        ?? r15;
        String str;
        int i2;
        int assembleVarint;
        ExtractorInput extractorInput2;
        char c;
        List singletonList;
        int pcmEncoding;
        ?? r2;
        int i3;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        String str3;
        List list;
        List of;
        String str4;
        List list2;
        List list3;
        Format.Builder builder;
        boolean isAudio;
        int i4;
        ColorInfo colorInfo;
        byte[] bArr;
        int i5;
        String str5;
        Joiner parse;
        List list4;
        int i6;
        List list5;
        int i7;
        long j;
        int i8;
        long j2;
        long j3;
        Metadata copyWithAppendedEntries;
        MatroskaExtractor matroskaExtractor = this;
        boolean z3 = false;
        matroskaExtractor.haveOutputSample = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !matroskaExtractor.haveOutputSample) {
            DefaultEbmlReader defaultEbmlReader = matroskaExtractor.reader;
            ?? r8 = defaultEbmlReader.varintReader;
            ArrayDeque arrayDeque = defaultEbmlReader.masterElementsStack;
            defaultEbmlReader.processor.getClass();
            ?? r4 = z4;
            while (true) {
                DefaultEbmlReader.MasterElement masterElement = (DefaultEbmlReader.MasterElement) arrayDeque.peek();
                if (masterElement == null || extractorInput.getPosition() < masterElement.elementEndPosition) {
                    ?? r42 = z3;
                    ExtractorInput extractorInput3 = extractorInput;
                    if (defaultEbmlReader.elementState == 0) {
                        int i9 = 4;
                        long readUnsignedVarint = r8.readUnsignedVarint(extractorInput3, true, r42, 4);
                        if (readUnsignedVarint == -2) {
                            byte[] bArr2 = defaultEbmlReader.scratch;
                            extractorInput3.resetPeekPosition();
                            int i10 = r42;
                            while (true) {
                                extractorInput3.peekFully(i10, i9, bArr2);
                                byte b = bArr2[i10];
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= 8) {
                                        i2 = -1;
                                    } else if ((VarintReader.VARINT_LENGTH_MASKS[i11] & b) != 0) {
                                        i2 = i11 + 1;
                                    } else {
                                        i11++;
                                    }
                                }
                                if (i2 != -1 && i2 <= 4) {
                                    assembleVarint = (int) VarintReader.assembleVarint(i2, bArr2, false);
                                    Object obj = defaultEbmlReader.processor.this$0;
                                    if (assembleVarint == 357149030 || assembleVarint == 524531317 || assembleVarint == 475249515 || assembleVarint == 374648427) {
                                    }
                                }
                                extractorInput3.skipFully(1);
                                i9 = 4;
                                i10 = 0;
                            }
                            extractorInput3.skipFully(i2);
                            readUnsignedVarint = assembleVarint;
                        }
                        z = true;
                        if (readUnsignedVarint == -1) {
                            z2 = false;
                            z5 = false;
                            ExtractorInput extractorInput4 = extractorInput3;
                        } else {
                            defaultEbmlReader.elementId = (int) readUnsignedVarint;
                            defaultEbmlReader.elementState = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (defaultEbmlReader.elementState == z) {
                        defaultEbmlReader.elementContentSize = r8.readUnsignedVarint(extractorInput3, false, z, 8);
                        defaultEbmlReader.elementState = 2;
                    }
                    Toolbar.AnonymousClass1 anonymousClass1 = defaultEbmlReader.processor;
                    int i12 = defaultEbmlReader.elementId;
                    Object obj2 = anonymousClass1.this$0;
                    switch (i12) {
                        case 131:
                        case 136:
                        case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                        case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                        case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        case 224:
                        case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        extractorInput3.skipFully((int) defaultEbmlReader.elementContentSize);
                        defaultEbmlReader.elementState = 0;
                        z3 = false;
                        r4 = 1;
                    } else if (i == 1) {
                        long position = extractorInput3.getPosition();
                        arrayDeque.push(new DefaultEbmlReader.MasterElement(defaultEbmlReader.elementId, defaultEbmlReader.elementContentSize + position));
                        defaultEbmlReader.processor.startMasterElement(defaultEbmlReader.elementId, position, defaultEbmlReader.elementContentSize);
                        z2 = false;
                        defaultEbmlReader.elementState = 0;
                        extractorInput2 = extractorInput3;
                    } else if (i == 2) {
                        long j4 = defaultEbmlReader.elementContentSize;
                        if (j4 > 8) {
                            throw ParserException.createForMalformedContainer(null, "Invalid integer size: " + defaultEbmlReader.elementContentSize);
                        }
                        anonymousClass1.integerElement(i12, defaultEbmlReader.readInteger(extractorInput3, (int) j4));
                        z2 = false;
                        defaultEbmlReader.elementState = 0;
                        extractorInput2 = extractorInput3;
                    } else if (i == 3) {
                        long j5 = defaultEbmlReader.elementContentSize;
                        if (j5 > 2147483647L) {
                            throw ParserException.createForMalformedContainer(null, "String element size: " + defaultEbmlReader.elementContentSize);
                        }
                        int i13 = (int) j5;
                        if (i13 == 0) {
                            str = "";
                            r15 = 0;
                        } else {
                            byte[] bArr3 = new byte[i13];
                            extractorInput3.readFully(bArr3, 0, i13);
                            while (i13 > 0 && bArr3[i13 - 1] == 0) {
                                i13--;
                            }
                            r15 = 0;
                            str = new String(bArr3, 0, i13);
                        }
                        anonymousClass1.stringElement(i12, str);
                        defaultEbmlReader.elementState = r15;
                        z2 = r15;
                        extractorInput2 = extractorInput3;
                    } else if (i == 4) {
                        anonymousClass1.binaryElement(i12, (int) defaultEbmlReader.elementContentSize, extractorInput3);
                        z2 = false;
                        defaultEbmlReader.elementState = 0;
                        extractorInput2 = extractorInput3;
                    } else {
                        if (i != 5) {
                            throw ParserException.createForMalformedContainer(null, "Invalid element type " + i);
                        }
                        long j6 = defaultEbmlReader.elementContentSize;
                        if (j6 != 4 && j6 != 8) {
                            throw ParserException.createForMalformedContainer(null, "Invalid float size: " + defaultEbmlReader.elementContentSize);
                        }
                        int i14 = (int) j6;
                        double intBitsToFloat = i14 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(defaultEbmlReader.readInteger(extractorInput3, i14));
                        MatroskaExtractor matroskaExtractor2 = (MatroskaExtractor) anonymousClass1.this$0;
                        if (i12 == 181) {
                            matroskaExtractor2.assertInTrackEntry(i12);
                            matroskaExtractor2.currentTrack.sampleRate = (int) intBitsToFloat;
                        } else if (i12 != 17545) {
                            switch (i12) {
                                case 21969:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.primaryRChromaticityX = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.primaryRChromaticityY = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.primaryGChromaticityX = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.primaryGChromaticityY = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.primaryBChromaticityX = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.primaryBChromaticityY = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.whitePointChromaticityX = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.whitePointChromaticityY = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.maxMasteringLuminance = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    matroskaExtractor2.assertInTrackEntry(i12);
                                    matroskaExtractor2.currentTrack.minMasteringLuminance = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i12) {
                                        case 30323:
                                            matroskaExtractor2.assertInTrackEntry(i12);
                                            matroskaExtractor2.currentTrack.projectionPoseYaw = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            matroskaExtractor2.assertInTrackEntry(i12);
                                            matroskaExtractor2.currentTrack.projectionPosePitch = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            matroskaExtractor2.assertInTrackEntry(i12);
                                            matroskaExtractor2.currentTrack.projectionPoseRoll = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            matroskaExtractor2.durationTimecode = (long) intBitsToFloat;
                        }
                        z2 = false;
                        defaultEbmlReader.elementState = 0;
                        extractorInput2 = extractorInput3;
                    }
                } else {
                    Toolbar.AnonymousClass1 anonymousClass12 = defaultEbmlReader.processor;
                    int i15 = ((DefaultEbmlReader.MasterElement) arrayDeque.pop()).elementId;
                    MatroskaExtractor matroskaExtractor3 = (MatroskaExtractor) anonymousClass12.this$0;
                    ?? r82 = matroskaExtractor3.perTrackCues;
                    ?? r9 = matroskaExtractor3.tracks;
                    matroskaExtractor3.extractorOutput.getClass();
                    if (i15 != 160) {
                        if (i15 == 174) {
                            Track track = matroskaExtractor3.currentTrack;
                            track.getClass();
                            String str6 = track.codecId;
                            if (str6 == null) {
                                throw ParserException.createForMalformedContainer(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str6) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i16 = track.number;
                                    switch (str6.hashCode()) {
                                        case -2095576542:
                                            if (str6.equals("V_MPEG4/ISO/AP")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2095575984:
                                            if (str6.equals("V_MPEG4/ISO/SP")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1985379776:
                                            if (str6.equals("A_MS/ACM")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1784763192:
                                            if (str6.equals("A_TRUEHD")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1730367663:
                                            if (str6.equals("A_VORBIS")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1482641358:
                                            if (str6.equals("A_MPEG/L2")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1482641357:
                                            if (str6.equals("A_MPEG/L3")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1373388978:
                                            if (str6.equals("V_MS/VFW/FOURCC")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -933872740:
                                            if (str6.equals("S_DVBSUB")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -538363189:
                                            if (str6.equals("V_MPEG4/ISO/ASP")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -538363109:
                                            if (str6.equals("V_MPEG4/ISO/AVC")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -425012669:
                                            if (str6.equals("S_VOBSUB")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -356037306:
                                            if (str6.equals("A_DTS/LOSSLESS")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62923557:
                                            if (str6.equals("A_AAC")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62923603:
                                            if (str6.equals("A_AC3")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62927045:
                                            if (str6.equals("A_DTS")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82318131:
                                            if (str6.equals("V_AV1")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82338133:
                                            if (str6.equals("V_VP8")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82338134:
                                            if (str6.equals("V_VP9")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99146302:
                                            if (str6.equals("S_HDMV/PGS")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 444813526:
                                            if (str6.equals("V_THEORA")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 542569478:
                                            if (str6.equals("A_DTS/EXPRESS")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 635596514:
                                            if (str6.equals("A_PCM/FLOAT/IEEE")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 725948237:
                                            if (str6.equals("A_PCM/INT/BIG")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 725957860:
                                            if (str6.equals("A_PCM/INT/LIT")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 738597099:
                                            if (str6.equals("S_TEXT/ASS")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 738614379:
                                            if (str6.equals("S_TEXT/SSA")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 855502857:
                                            if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1045209816:
                                            if (str6.equals("S_TEXT/WEBVTT")) {
                                                c = 28;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1422270023:
                                            if (str6.equals("S_TEXT/UTF8")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1809237540:
                                            if (str6.equals("V_MPEG2")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950749482:
                                            if (str6.equals("A_EAC3")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950789798:
                                            if (str6.equals("A_FLAC")) {
                                                c = ' ';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1951062397:
                                            if (str6.equals("A_OPUS")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    String str7 = "video/x-unknown";
                                    switch (c) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            byte[] bArr4 = track.codecPrivate;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str7 = "video/mp4v-es";
                                            of = singletonList;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null && (parse = Joiner.parse(new ParsableByteArray(track.dolbyVisionConfigBytes))) != null) {
                                                str3 = parse.separator;
                                                str7 = "video/dolby-vision";
                                            }
                                            int i17 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                                builder.channelCount = track.channelCount;
                                                builder.sampleRate = track.sampleRate;
                                                builder.pcmEncoding = pcmEncoding;
                                            } else if (MimeTypes.isVideo(str7)) {
                                                if (track.displayUnit == 0) {
                                                    int i18 = track.displayWidth;
                                                    i4 = -1;
                                                    if (i18 == -1) {
                                                        i18 = track.width;
                                                    }
                                                    track.displayWidth = i18;
                                                    int i19 = track.displayHeight;
                                                    if (i19 == -1) {
                                                        i19 = track.height;
                                                    }
                                                    track.displayHeight = i19;
                                                } else {
                                                    i4 = -1;
                                                }
                                                float f = (track.displayWidth == i4 || (i5 = track.displayHeight) == i4) ? -1.0f : (track.height * r0) / (track.width * i5);
                                                if (track.hasColorInfo) {
                                                    if (track.primaryRChromaticityX == -1.0f || track.primaryRChromaticityY == -1.0f || track.primaryGChromaticityX == -1.0f || track.primaryGChromaticityY == -1.0f || track.primaryBChromaticityX == -1.0f || track.primaryBChromaticityY == -1.0f || track.whitePointChromaticityX == -1.0f || track.whitePointChromaticityY == -1.0f || track.maxMasteringLuminance == -1.0f || track.minMasteringLuminance == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((track.primaryRChromaticityX * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.primaryRChromaticityY * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.primaryGChromaticityX * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.primaryGChromaticityY * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.primaryBChromaticityX * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.primaryBChromaticityY * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.whitePointChromaticityX * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((track.whitePointChromaticityY * 50000.0f) + 0.5f));
                                                        order.putShort((short) (track.maxMasteringLuminance + 0.5f));
                                                        order.putShort((short) (track.minMasteringLuminance + 0.5f));
                                                        order.putShort((short) track.maxContentLuminance);
                                                        order.putShort((short) track.maxFrameAverageLuminance);
                                                        bArr = bArr5;
                                                    }
                                                    int i20 = track.colorSpace;
                                                    int i21 = track.colorRange;
                                                    int i22 = track.colorTransfer;
                                                    int i23 = track.bitsPerChannel;
                                                    colorInfo = new ColorInfo(i20, i21, i22, i23, i23, bArr);
                                                } else {
                                                    colorInfo = null;
                                                }
                                                String str8 = track.name;
                                                int intValue = (str8 == null || !map.containsKey(str8)) ? -1 : ((Integer) map.get(track.name)).intValue();
                                                if (track.projectionType == 0 && Float.compare(track.projectionPoseYaw, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(track.projectionPosePitch, RecyclerView.DECELERATION_RATE) == 0) {
                                                    if (Float.compare(track.projectionPoseRoll, RecyclerView.DECELERATION_RATE) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(track.projectionPoseRoll, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(track.projectionPoseRoll, -180.0f) == 0 || Float.compare(track.projectionPoseRoll, 180.0f) == 0) {
                                                        intValue = EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
                                                    } else if (Float.compare(track.projectionPoseRoll, -90.0f) == 0) {
                                                        intValue = EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                                    }
                                                }
                                                builder.width = track.width;
                                                builder.height = track.height;
                                                builder.pixelWidthHeightRatio = f;
                                                builder.rotationDegrees = intValue;
                                                builder.projectionData = track.projectionData;
                                                builder.stereoMode = track.stereoMode;
                                                builder.colorInfo = colorInfo;
                                            } else if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                throw ParserException.createForMalformedContainer(null, "Unexpected MIME type.");
                                            }
                                            str5 = track.name;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                builder.label = track.name;
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 2:
                                            ParsableByteArray parsableByteArray = new ParsableByteArray(track.getCodecPrivate(track.codecId));
                                            try {
                                                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                                                if (readLittleEndianUnsignedShort != 1) {
                                                    if (readLittleEndianUnsignedShort == 65534) {
                                                        parsableByteArray.setPosition(24);
                                                        long readLong = parsableByteArray.readLong();
                                                        UUID uuid = WAVE_SUBFORMAT_PCM;
                                                        if (readLong == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    pcmEncoding = -1;
                                                    i3 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (track.dolbyVisionConfigBytes != null) {
                                                        str3 = parse.separator;
                                                        str7 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i172 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                    builder = new Format.Builder();
                                                    isAudio = MimeTypes.isAudio(str7);
                                                    Map map2 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                    if (isAudio) {
                                                    }
                                                    str5 = track.name;
                                                    if (str5 != null) {
                                                        builder.label = track.name;
                                                        break;
                                                    }
                                                    builder.id = Integer.toString(i16);
                                                    builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                    builder.maxInputSize = i3;
                                                    builder.language = track.language;
                                                    builder.selectionFlags = i172;
                                                    builder.initializationData = list3;
                                                    builder.codecs = str3;
                                                    builder.drmInitData = track.drmInitData;
                                                    track.f890format = builder.build();
                                                    track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                    r9.put(track.number, track);
                                                }
                                                int i24 = track.audioBitDepth;
                                                String str9 = Util.DEVICE_DEBUG_INFO;
                                                pcmEncoding = Util.getPcmEncoding(i24, ByteOrder.LITTLE_ENDIAN);
                                                if (pcmEncoding == 0) {
                                                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + track.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    pcmEncoding = -1;
                                                    i3 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (track.dolbyVisionConfigBytes != null) {
                                                    }
                                                    int i1722 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                    builder = new Format.Builder();
                                                    isAudio = MimeTypes.isAudio(str7);
                                                    Map map22 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                    if (isAudio) {
                                                    }
                                                    str5 = track.name;
                                                    if (str5 != null) {
                                                    }
                                                    builder.id = Integer.toString(i16);
                                                    builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                    builder.maxInputSize = i3;
                                                    builder.language = track.language;
                                                    builder.selectionFlags = i1722;
                                                    builder.initializationData = list3;
                                                    builder.codecs = str3;
                                                    builder.drmInitData = track.drmInitData;
                                                    track.f890format = builder.build();
                                                    track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                    r9.put(track.number, track);
                                                }
                                                str7 = "audio/raw";
                                                i3 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i17222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i17222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.createForMalformedContainer(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            track.trueHdSampleRechunker = new TrueHdSampleRechunker();
                                            str7 = "audio/true-hd";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 4:
                                            byte[] codecPrivate = track.getCodecPrivate(str6);
                                            try {
                                                r2 = codecPrivate[0];
                                                try {
                                                    if (r2 != 2) {
                                                        throw ParserException.createForMalformedContainer(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i25 = 0;
                                                    int i26 = 1;
                                                    while (true) {
                                                        int i27 = codecPrivate[i26] & 255;
                                                        if (i27 == 255) {
                                                            i25 += 255;
                                                            i26++;
                                                        } else {
                                                            int i28 = i26 + 1;
                                                            int i29 = i25 + i27;
                                                            int i30 = 0;
                                                            while (true) {
                                                                int i31 = codecPrivate[i28] & 255;
                                                                if (i31 == 255) {
                                                                    i30 += 255;
                                                                    i28++;
                                                                } else {
                                                                    int i32 = i28 + 1;
                                                                    int i33 = i30 + i31;
                                                                    if (codecPrivate[i32] != 1) {
                                                                        throw ParserException.createForMalformedContainer(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i29];
                                                                    System.arraycopy(codecPrivate, i32, bArr6, 0, i29);
                                                                    int i34 = i32 + i29;
                                                                    if (codecPrivate[i34] != 3) {
                                                                        throw ParserException.createForMalformedContainer(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i35 = i34 + i33;
                                                                    if (codecPrivate[i35] != 5) {
                                                                        throw ParserException.createForMalformedContainer(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[codecPrivate.length - i35];
                                                                    System.arraycopy(codecPrivate, i35, bArr7, 0, codecPrivate.length - i35);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str7 = "audio/vorbis";
                                                                    i3 = PKIFailureInfo.certRevoked;
                                                                    arrayList = arrayList2;
                                                                    pcmEncoding = -1;
                                                                    list4 = arrayList;
                                                                    str3 = null;
                                                                    list3 = list4;
                                                                    if (track.dolbyVisionConfigBytes != null) {
                                                                    }
                                                                    int i1722222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                                    builder = new Format.Builder();
                                                                    isAudio = MimeTypes.isAudio(str7);
                                                                    Map map22222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                                    if (isAudio) {
                                                                    }
                                                                    str5 = track.name;
                                                                    if (str5 != null) {
                                                                    }
                                                                    builder.id = Integer.toString(i16);
                                                                    builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                                    builder.maxInputSize = i3;
                                                                    builder.language = track.language;
                                                                    builder.selectionFlags = i1722222;
                                                                    builder.initializationData = list3;
                                                                    builder.codecs = str3;
                                                                    builder.drmInitData = track.drmInitData;
                                                                    track.f890format = builder.build();
                                                                    track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                                    r9.put(track.number, track);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.createForMalformedContainer(r2, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r2 = 0;
                                            }
                                            break;
                                        case 5:
                                            str7 = "audio/mpeg-L2";
                                            pcmEncoding = -1;
                                            i3 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 6:
                                            str7 = "audio/mpeg";
                                            pcmEncoding = -1;
                                            i3 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 7:
                                            ParsableByteArray parsableByteArray2 = new ParsableByteArray(track.getCodecPrivate(track.codecId));
                                            try {
                                                parsableByteArray2.skipBytes(16);
                                                long readLittleEndianUnsignedInt = parsableByteArray2.readLittleEndianUnsignedInt();
                                                if (readLittleEndianUnsignedInt == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                        throw ParserException.createForMalformedContainer(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else if (readLittleEndianUnsignedInt == 859189832) {
                                                    pair = new Pair("video/3gpp", null);
                                                } else {
                                                    if (readLittleEndianUnsignedInt == 826496599) {
                                                        byte[] bArr8 = parsableByteArray2.data;
                                                        for (int i36 = parsableByteArray2.position + 20; i36 < bArr8.length - 4; i36++) {
                                                            if (bArr8[i36] == 0 && bArr8[i36 + 1] == 0 && bArr8[i36 + 2] == 1) {
                                                                if (bArr8[i36 + 3] == 15) {
                                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i36, bArr8.length)));
                                                                }
                                                            }
                                                        }
                                                        runtimeException = null;
                                                        try {
                                                            throw ParserException.createForMalformedContainer(null, "Failed to find FourCC VC1 initialization data");
                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                            throw ParserException.createForMalformedContainer(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    }
                                                    Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str2 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    str7 = (String) pair.first;
                                                    str3 = str2;
                                                    list = (List) pair.second;
                                                    pcmEncoding = -1;
                                                    i3 = -1;
                                                    list3 = list;
                                                    if (track.dolbyVisionConfigBytes != null) {
                                                    }
                                                    int i1722222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                    builder = new Format.Builder();
                                                    isAudio = MimeTypes.isAudio(str7);
                                                    Map map22222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                    if (isAudio) {
                                                    }
                                                    str5 = track.name;
                                                    if (str5 != null) {
                                                    }
                                                    builder.id = Integer.toString(i16);
                                                    builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                    builder.maxInputSize = i3;
                                                    builder.language = track.language;
                                                    builder.selectionFlags = i1722222222;
                                                    builder.initializationData = list3;
                                                    builder.codecs = str3;
                                                    builder.drmInitData = track.drmInitData;
                                                    track.f890format = builder.build();
                                                    track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                    r9.put(track.number, track);
                                                }
                                                str2 = null;
                                                str7 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                pcmEncoding = -1;
                                                i3 = -1;
                                                list3 = list;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i17222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i17222222222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case '\b':
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(track.getCodecPrivate(str6), 0, bArr9, 0, 4);
                                            of = ImmutableList.of((Object) bArr9);
                                            str7 = "application/dvbsubs";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case '\n':
                                            AvcConfig parse2 = AvcConfig.parse(new ParsableByteArray(track.getCodecPrivate(track.codecId)));
                                            ArrayList arrayList3 = parse2.initializationData;
                                            track.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                                            str4 = parse2.codecs;
                                            str7 = "video/avc";
                                            list2 = arrayList3;
                                            str3 = str4;
                                            list = list2;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list3 = list;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 11:
                                            of = ImmutableList.of((Object) track.getCodecPrivate(str6));
                                            str7 = "application/vobsub";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case '\f':
                                            str7 = "audio/vnd.dts.hd";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(track.getCodecPrivate(str6));
                                            byte[] bArr10 = track.codecPrivate;
                                            AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(new VorbisBitArray(bArr10, bArr10.length), false);
                                            track.sampleRate = parseAudioSpecificConfig.sampleRateHz;
                                            track.channelCount = parseAudioSpecificConfig.channelCount;
                                            str7 = "audio/mp4a-latm";
                                            list = singletonList2;
                                            str3 = parseAudioSpecificConfig.codecs;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list3 = list;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 14:
                                            str7 = "audio/ac3";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 15:
                                        case 21:
                                            track.waitingForDtsAnalysis = true;
                                            str7 = "audio/vnd.dts";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 16:
                                            byte[] bArr11 = track.codecPrivate;
                                            singletonList = bArr11 == null ? null : ImmutableList.of((Object) bArr11);
                                            str7 = "video/av01";
                                            of = singletonList;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 17:
                                            str7 = "video/x-vnd.on2.vp8";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 18:
                                            byte[] bArr12 = track.codecPrivate;
                                            singletonList = bArr12 == null ? null : ImmutableList.of((Object) bArr12);
                                            str7 = "video/x-vnd.on2.vp9";
                                            of = singletonList;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 19:
                                            str7 = "application/pgs";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 20:
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 22:
                                            if (track.audioBitDepth == 32) {
                                                str7 = "audio/raw";
                                                pcmEncoding = 4;
                                                i3 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i172222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map2222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i172222222222222222222222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            } else {
                                                Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + track.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                pcmEncoding = -1;
                                                i3 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i1722222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map22222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i1722222222222222222222222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            }
                                            break;
                                        case 23:
                                            int i37 = track.audioBitDepth;
                                            if (i37 == 8) {
                                                str7 = "audio/raw";
                                                pcmEncoding = 3;
                                                i3 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i17222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i17222222222222222222222222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            } else {
                                                if (i37 == 16) {
                                                    pcmEncoding = 268435456;
                                                } else if (i37 == 24) {
                                                    pcmEncoding = 1342177280;
                                                } else if (i37 == 32) {
                                                    pcmEncoding = 1610612736;
                                                } else {
                                                    Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + track.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    pcmEncoding = -1;
                                                    i3 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (track.dolbyVisionConfigBytes != null) {
                                                    }
                                                    int i172222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                    builder = new Format.Builder();
                                                    isAudio = MimeTypes.isAudio(str7);
                                                    Map map2222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                    if (isAudio) {
                                                    }
                                                    str5 = track.name;
                                                    if (str5 != null) {
                                                    }
                                                    builder.id = Integer.toString(i16);
                                                    builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                    builder.maxInputSize = i3;
                                                    builder.language = track.language;
                                                    builder.selectionFlags = i172222222222222222222222222;
                                                    builder.initializationData = list3;
                                                    builder.codecs = str3;
                                                    builder.drmInitData = track.drmInitData;
                                                    track.f890format = builder.build();
                                                    track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                    r9.put(track.number, track);
                                                }
                                                str7 = "audio/raw";
                                                i3 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i1722222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map22222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i1722222222222222222222222222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            }
                                            break;
                                        case 24:
                                            int i38 = track.audioBitDepth;
                                            String str10 = Util.DEVICE_DEBUG_INFO;
                                            pcmEncoding = Util.getPcmEncoding(i38, ByteOrder.LITTLE_ENDIAN);
                                            if (pcmEncoding == 0) {
                                                Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + track.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                pcmEncoding = -1;
                                                i3 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (track.dolbyVisionConfigBytes != null) {
                                                }
                                                int i17222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                                builder = new Format.Builder();
                                                isAudio = MimeTypes.isAudio(str7);
                                                Map map222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                                if (isAudio) {
                                                }
                                                str5 = track.name;
                                                if (str5 != null) {
                                                }
                                                builder.id = Integer.toString(i16);
                                                builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                                builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                                builder.maxInputSize = i3;
                                                builder.language = track.language;
                                                builder.selectionFlags = i17222222222222222222222222222;
                                                builder.initializationData = list3;
                                                builder.codecs = str3;
                                                builder.drmInitData = track.drmInitData;
                                                track.f890format = builder.build();
                                                track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                                r9.put(track.number, track);
                                            }
                                            str7 = "audio/raw";
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 25:
                                        case 26:
                                            of = ImmutableList.of((Object) SSA_DIALOGUE_FORMAT, (Object) track.getCodecPrivate(str6));
                                            str7 = "text/x-ssa";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 27:
                                            HevcConfig parseImpl = HevcConfig.parseImpl(new ParsableByteArray(track.getCodecPrivate(track.codecId)), false, null);
                                            List list6 = parseImpl.initializationData;
                                            track.nalUnitLengthFieldLength = parseImpl.nalUnitLengthFieldLength;
                                            str4 = parseImpl.codecs;
                                            str7 = "video/hevc";
                                            list2 = list6;
                                            str3 = str4;
                                            list = list2;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list3 = list;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 28:
                                            str7 = "text/vtt";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 29:
                                            str7 = "application/x-subrip";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 30:
                                            str7 = "video/mpeg2";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case 31:
                                            str7 = "audio/eac3";
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i172222222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map2222222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i172222222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case ' ':
                                            singletonList = Collections.singletonList(track.getCodecPrivate(str6));
                                            str7 = "audio/flac";
                                            of = singletonList;
                                            pcmEncoding = -1;
                                            i3 = -1;
                                            list4 = of;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i1722222222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map22222222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i1722222222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        case '!':
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(track.getCodecPrivate(track.codecId));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(allocate.order(byteOrder).putLong(track.codecDelayNs).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(track.seekPreRollNs).array());
                                            str7 = "audio/opus";
                                            i3 = 5760;
                                            arrayList = arrayList4;
                                            pcmEncoding = -1;
                                            list4 = arrayList;
                                            str3 = null;
                                            list3 = list4;
                                            if (track.dolbyVisionConfigBytes != null) {
                                            }
                                            int i17222222222222222222222222222222222222 = (track.flagDefault ? 1 : 0) | (track.flagForced ? 2 : 0);
                                            builder = new Format.Builder();
                                            isAudio = MimeTypes.isAudio(str7);
                                            Map map222222222222222222222222222222222222 = TRACK_NAME_TO_ROTATION_DEGREES;
                                            if (isAudio) {
                                            }
                                            str5 = track.name;
                                            if (str5 != null) {
                                            }
                                            builder.id = Integer.toString(i16);
                                            builder.containerMimeType = MimeTypes.normalizeMimeType(track.isWebm ? "video/webm" : "video/x-matroska");
                                            builder.sampleMimeType = MimeTypes.normalizeMimeType(str7);
                                            builder.maxInputSize = i3;
                                            builder.language = track.language;
                                            builder.selectionFlags = i17222222222222222222222222222222222222;
                                            builder.initializationData = list3;
                                            builder.codecs = str3;
                                            builder.drmInitData = track.drmInitData;
                                            track.f890format = builder.build();
                                            track.output = matroskaExtractor3.extractorOutput.track(track.number, track.f891type);
                                            r9.put(track.number, track);
                                            break;
                                        default:
                                            throw ParserException.createForMalformedContainer(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    matroskaExtractor3.currentTrack = null;
                                    break;
                            }
                        } else if (i15 != 183) {
                            if (i15 == 19899) {
                                int i39 = matroskaExtractor3.seekEntryId;
                                if (i39 != -1) {
                                    long j7 = matroskaExtractor3.seekEntryPosition;
                                    if (j7 != -1) {
                                        if (i39 == 475249515) {
                                            matroskaExtractor3.cuesContentPosition = j7;
                                        }
                                    }
                                }
                                throw ParserException.createForMalformedContainer(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i15 == 25152) {
                                matroskaExtractor3.assertInTrackEntry(i15);
                                Track track2 = matroskaExtractor3.currentTrack;
                                if (track2.hasContentEncryption) {
                                    TrackOutput.CryptoData cryptoData = track2.cryptoData;
                                    if (cryptoData == null) {
                                        throw ParserException.createForMalformedContainer(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    track2.drmInitData = new DrmInitData(null, true, new DrmInitData.SchemeData(C.UUID_NIL, null, "video/webm", cryptoData.encryptionKey));
                                }
                            } else if (i15 == 28032) {
                                matroskaExtractor3.assertInTrackEntry(i15);
                                Track track3 = matroskaExtractor3.currentTrack;
                                if (track3.hasContentEncryption && track3.sampleStrippedBytes != null) {
                                    throw ParserException.createForMalformedContainer(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i15 == 357149030) {
                                if (matroskaExtractor3.timecodeScale == -9223372036854775807L) {
                                    matroskaExtractor3.timecodeScale = 1000000L;
                                }
                                long j8 = matroskaExtractor3.durationTimecode;
                                if (j8 != -9223372036854775807L) {
                                    matroskaExtractor3.durationUs = matroskaExtractor3.scaleTimecodeToUs(j8);
                                }
                            } else if (i15 == 374648427) {
                                boolean z6 = z3;
                                if (r9.size() == 0) {
                                    throw ParserException.createForMalformedContainer(null, "No valid tracks were found");
                                }
                                boolean z7 = (!matroskaExtractor3.seekForCuesEnabled || matroskaExtractor3.cuesContentPosition == -1) ? true : z6 ? 1 : 0;
                                int i40 = -1;
                                int i41 = -1;
                                int i42 = -1;
                                int i43 = -1;
                                for (int i44 = z6 ? 1 : 0; i44 < r9.size(); i44++) {
                                    Track track4 = (Track) r9.valueAt(i44);
                                    int i45 = track4.f891type;
                                    if (i45 == 2) {
                                        if (track4.flagDefault) {
                                            i40 = track4.number;
                                        }
                                        if (i41 == -1) {
                                            i41 = track4.number;
                                        }
                                    } else if (i45 == 1) {
                                        if (track4.flagDefault) {
                                            i42 = track4.number;
                                        }
                                        if (i43 == -1) {
                                            i43 = track4.number;
                                        }
                                    }
                                    if (z7) {
                                        track4.output.getClass();
                                        if (!track4.waitingForDtsAnalysis) {
                                            TrackOutput trackOutput = track4.output;
                                            Format format2 = track4.f890format;
                                            format2.getClass();
                                            trackOutput.format(format2);
                                        }
                                    }
                                }
                                if (i40 != -1) {
                                    matroskaExtractor3.primarySeekTrackNumber = i40;
                                } else if (i41 != -1) {
                                    matroskaExtractor3.primarySeekTrackNumber = i41;
                                } else if (i42 != -1) {
                                    matroskaExtractor3.primarySeekTrackNumber = i42;
                                } else if (i43 != -1) {
                                    matroskaExtractor3.primarySeekTrackNumber = i43;
                                } else {
                                    matroskaExtractor3.primarySeekTrackNumber = r9.size() > 0 ? ((Track) r9.valueAt(z6 ? 1 : 0)).number : -1;
                                }
                                if (z7) {
                                    matroskaExtractor3.maybeEndTracks();
                                }
                            } else if (i15 == 475249515 && !matroskaExtractor3.sentSeekMap) {
                                ?? r6 = z3;
                                while (true) {
                                    if (r6 < r82.size()) {
                                        if (((List) r82.valueAt(r6)).isEmpty()) {
                                            r6++;
                                        } else if (matroskaExtractor3.durationUs != -9223372036854775807L) {
                                            for (?? r62 = z3; r62 < r82.size(); r62++) {
                                                Collections.sort((List) r82.valueAt(r62));
                                            }
                                            matroskaExtractor3.extractorOutput.seekMap(new MatroskaSeekMap(r82, matroskaExtractor3.durationUs, matroskaExtractor3.primarySeekTrackNumber, matroskaExtractor3.segmentContentPosition, matroskaExtractor3.segmentContentSize));
                                        }
                                    }
                                }
                                matroskaExtractor3.extractorOutput.seekMap(new SeekMap.Unseekable(matroskaExtractor3.durationUs));
                                matroskaExtractor3.sentSeekMap = r4;
                                matroskaExtractor3.inCuesElement = z3;
                                int i46 = r4;
                                for (?? r63 = z3; r63 < r9.size(); r63 = i7 + 1) {
                                    Track track5 = (Track) r9.valueAt(r63);
                                    long j9 = matroskaExtractor3.durationUs;
                                    long j10 = matroskaExtractor3.segmentContentPosition;
                                    long j11 = matroskaExtractor3.segmentContentSize;
                                    boolean z8 = z3;
                                    int i47 = i46;
                                    if (track5.f891type != 2 || (list5 = (List) r82.get(track5.number)) == null || list5.isEmpty()) {
                                        i7 = r63;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i7 = r63;
                                        } else {
                                            i7 = r63;
                                            int min = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i48 = z8 ? 1 : 0;
                                            int i49 = -1;
                                            while (i48 < min) {
                                                MatroskaSeekMap.CuePointData cuePointData = (MatroskaSeekMap.CuePointData) list5.get(i48);
                                                long j12 = j10;
                                                long j13 = cuePointData.timeUs;
                                                long j14 = cuePointData.relativePosition;
                                                long j15 = cuePointData.clusterPosition;
                                                if (j13 <= 10000000) {
                                                    if (i48 < list5.size() - 1) {
                                                        MatroskaSeekMap.CuePointData cuePointData2 = (MatroskaSeekMap.CuePointData) list5.get(i48 + 1);
                                                        i8 = i48;
                                                        j2 = (cuePointData2.clusterPosition + cuePointData2.relativePosition) - (j15 + j14);
                                                        j3 = cuePointData2.timeUs - j13;
                                                    } else {
                                                        i8 = i48;
                                                        j2 = (j12 + j11) - (j15 + j14);
                                                        j3 = j9 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i49 = i8;
                                                        }
                                                    }
                                                    i48 = i8 + 1;
                                                    j10 = j12;
                                                } else if (i49 != -1) {
                                                    j = ((MatroskaSeekMap.CuePointData) list5.get(i49)).timeUs;
                                                    if (j != -9223372036854775807L) {
                                                        Format format3 = track5.f890format;
                                                        format3.getClass();
                                                        Metadata metadata = format3.metadata;
                                                        ThumbnailMetadata thumbnailMetadata = new ThumbnailMetadata(j);
                                                        if (metadata == null) {
                                                            Metadata.Entry[] entryArr = new Metadata.Entry[i47];
                                                            entryArr[z8 ? 1 : 0] = thumbnailMetadata;
                                                            copyWithAppendedEntries = new Metadata(entryArr);
                                                        } else {
                                                            Metadata.Entry[] entryArr2 = new Metadata.Entry[i47];
                                                            entryArr2[z8 ? 1 : 0] = thumbnailMetadata;
                                                            copyWithAppendedEntries = metadata.copyWithAppendedEntries(entryArr2);
                                                        }
                                                        Format.Builder buildUpon = track5.f890format.buildUpon();
                                                        buildUpon.metadata = copyWithAppendedEntries;
                                                        track5.f890format = new Format(buildUpon);
                                                    }
                                                }
                                            }
                                            if (i49 != -1) {
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                        }
                                    }
                                    if (!track5.waitingForDtsAnalysis) {
                                        track5.output.getClass();
                                        TrackOutput trackOutput2 = track5.output;
                                        Format format4 = track5.f890format;
                                        format4.getClass();
                                        trackOutput2.format(format4);
                                    }
                                    z3 = z8 ? 1 : 0;
                                    i46 = 1;
                                }
                                matroskaExtractor3.maybeEndTracks();
                                z2 = z3;
                                extractorInput2 = extractorInput;
                            }
                        } else if (!matroskaExtractor3.sentSeekMap) {
                            matroskaExtractor3.assertInCues(i15);
                            if (matroskaExtractor3.currentCueTimeUs != -9223372036854775807L && (i6 = matroskaExtractor3.currentCueTrackNumber) != -1 && matroskaExtractor3.currentCueClusterPosition != -1) {
                                List list7 = (List) r82.get(i6);
                                if (list7 == null) {
                                    list7 = new ArrayList();
                                    r82.put(matroskaExtractor3.currentCueTrackNumber, list7);
                                }
                                list7.add(new MatroskaSeekMap.CuePointData(matroskaExtractor3.currentCueTimeUs, matroskaExtractor3.segmentContentPosition + matroskaExtractor3.currentCueClusterPosition, matroskaExtractor3.currentCueRelativePosition));
                            }
                        }
                        z2 = false;
                        extractorInput2 = extractorInput;
                    } else {
                        if (matroskaExtractor3.blockState == 2) {
                            Track track6 = (Track) r9.get(matroskaExtractor3.blockTrackNumber);
                            track6.output.getClass();
                            if (matroskaExtractor3.blockGroupDiscardPaddingNs > 0 && "A_OPUS".equals(track6.codecId)) {
                                ParsableByteArray parsableByteArray3 = matroskaExtractor3.supplementalData;
                                byte[] array2 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(matroskaExtractor3.blockGroupDiscardPaddingNs).array();
                                parsableByteArray3.getClass();
                                parsableByteArray3.reset(array2.length, array2);
                            }
                            int i50 = 0;
                            for (int i51 = 0; i51 < matroskaExtractor3.blockSampleCount; i51++) {
                                i50 += matroskaExtractor3.blockSampleSizes[i51];
                            }
                            int i52 = 0;
                            while (i52 < matroskaExtractor3.blockSampleCount) {
                                long j16 = matroskaExtractor3.blockTimeUs + ((track6.defaultSampleDurationNs * i52) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                                int i53 = matroskaExtractor3.blockFlags;
                                if (i52 == 0 && !matroskaExtractor3.blockHasReferenceBlock) {
                                    i53 |= 1;
                                }
                                int i54 = matroskaExtractor3.blockSampleSizes[i52];
                                int i55 = i50 - i54;
                                matroskaExtractor3.commitSampleToOutput(track6, j16, i53, i54, i55);
                                i52++;
                                i50 = i55;
                            }
                            z2 = false;
                            matroskaExtractor3.blockState = 0;
                            extractorInput2 = extractorInput;
                        }
                        z2 = false;
                        extractorInput2 = extractorInput;
                    }
                }
            }
        }
        if (z5) {
            return 0;
        }
        int i56 = 0;
        while (true) {
            SparseArray sparseArray = matroskaExtractor.tracks;
            if (i56 >= sparseArray.size()) {
                return -1;
            }
            Track track7 = (Track) sparseArray.valueAt(i56);
            track7.output.getClass();
            TrueHdSampleRechunker trueHdSampleRechunker = track7.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(track7.output, track7.cryptoData);
            }
            i56++;
        }
    }

    public final void readScratch(ExtractorInput extractorInput, int i) {
        ParsableByteArray parsableByteArray = this.scratch;
        if (parsableByteArray.limit >= i) {
            return;
        }
        byte[] bArr = parsableByteArray.data;
        if (bArr.length < i) {
            parsableByteArray.ensureCapacity(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = parsableByteArray.data;
        int i2 = parsableByteArray.limit;
        extractorInput.readFully(bArr2, i2, i - i2);
        parsableByteArray.setLimit(i);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    public final void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    public final long scaleTimecodeToUs(long j) {
        long j2 = this.timecodeScale;
        if (j2 == -9223372036854775807L) {
            throw ParserException.createForMalformedContainer(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = Util.DEVICE_DEBUG_INFO;
        return Util.scaleLargeValue(j, j2, 1000L, RoundingMode.DOWN);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.clusterTimecodeUs = -9223372036854775807L;
        this.blockState = 0;
        DefaultEbmlReader defaultEbmlReader = this.reader;
        defaultEbmlReader.elementState = 0;
        defaultEbmlReader.masterElementsStack.clear();
        VarintReader varintReader = defaultEbmlReader.varintReader;
        varintReader.state = 0;
        varintReader.length = 0;
        VarintReader varintReader2 = this.varintReader;
        varintReader2.state = 0;
        varintReader2.length = 0;
        resetWriteSampleData();
        this.inCuesElement = false;
        this.currentCueTimeUs = -9223372036854775807L;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        if (!this.sentSeekMap) {
            this.perTrackCues.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.tracks;
            if (i >= sparseArray.size()) {
                return;
            }
            TrueHdSampleRechunker trueHdSampleRechunker = ((Track) sparseArray.valueAt(i)).trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.foundSyncframe = false;
                trueHdSampleRechunker.chunkSampleCount = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        return false;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean sniff(ExtractorInput extractorInput) {
        Sniffer sniffer = new Sniffer(0, false, false);
        ParsableByteArray parsableByteArray = (ParsableByteArray) sniffer.scratch;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        long j = defaultExtractorInput.streamLength;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        sniffer.peekLength = 4;
        while (true) {
            if (readUnsignedInt != 440786851) {
                int i2 = sniffer.peekLength + 1;
                sniffer.peekLength = i2;
                if (i2 == i) {
                    break;
                }
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 1, false);
                readUnsignedInt = (parsableByteArray.data[0] & 255) | ((readUnsignedInt << 8) & (-256));
            } else {
                long readUint = sniffer.readUint(defaultExtractorInput);
                long j3 = sniffer.peekLength;
                if (readUint != Long.MIN_VALUE && (j == -1 || j3 + readUint < j)) {
                    while (true) {
                        long j4 = sniffer.peekLength;
                        long j5 = j3 + readUint;
                        if (j4 < j5) {
                            if (sniffer.readUint(defaultExtractorInput) != Long.MIN_VALUE) {
                                long readUint2 = sniffer.readUint(defaultExtractorInput);
                                if (readUint2 < 0 || readUint2 > 2147483647L) {
                                    break;
                                }
                                if (readUint2 != 0) {
                                    int i3 = (int) readUint2;
                                    defaultExtractorInput.advancePeekPosition(i3, false);
                                    sniffer.peekLength += i3;
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
    }

    public final int writeSampleData(ExtractorInput extractorInput, Track track, int i, boolean z) {
        int sampleData;
        int sampleData2;
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            int i4 = this.sampleBytesWritten;
            resetWriteSampleData();
            return i4;
        }
        if ("S_TEXT/ASS".equals(track.codecId) || "S_TEXT/SSA".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            int i5 = this.sampleBytesWritten;
            resetWriteSampleData();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            int i6 = this.sampleBytesWritten;
            resetWriteSampleData();
            return i6;
        }
        int i7 = 2;
        if (track.waitingForDtsAnalysis) {
            track.f890format.getClass();
            ParsableByteArray parsableByteArray = new ParsableByteArray(i);
            if (extractorInput.peekFully(parsableByteArray.data, 0, i, true)) {
                extractorInput.resetPeekPosition();
                if (AacUtil.getFrameType(parsableByteArray.peekInt()) == 1 && parsableByteArray.bytesLeft() >= 10) {
                    byte[] bArr = new byte[10];
                    parsableByteArray.readBytes(0, 10, bArr);
                    parsableByteArray.setPosition(0);
                    int dtsFrameSize = AacUtil.getDtsFrameSize(bArr);
                    if (dtsFrameSize > 0 && parsableByteArray.bytesLeft() >= dtsFrameSize + 4) {
                        parsableByteArray.skipBytes(dtsFrameSize);
                        if (AacUtil.getFrameType(parsableByteArray.readInt()) == 2) {
                            Format.Builder buildUpon = track.f890format.buildUpon();
                            buildUpon.sampleMimeType = MimeTypes.normalizeMimeType("audio/vnd.dts.hd");
                            track.f890format = new Format(buildUpon);
                        }
                    }
                }
            }
            track.output.format(track.f890format);
            track.waitingForDtsAnalysis = false;
            maybeEndTracks();
        }
        TrackOutput trackOutput = track.output;
        boolean z2 = this.sampleEncodingHandled;
        ParsableByteArray parsableByteArray2 = this.sampleStrippedBytes;
        if (!z2) {
            boolean z3 = track.hasContentEncryption;
            ParsableByteArray parsableByteArray3 = this.scratch;
            if (z3) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(parsableByteArray3.data, 0, 1);
                    this.sampleBytesRead++;
                    byte b = parsableByteArray3.data[0];
                    if ((b & 128) == 128) {
                        throw ParserException.createForMalformedContainer(null, "Extension bit is set in signal byte");
                    }
                    this.sampleSignalByte = b;
                    this.sampleSignalByteRead = true;
                }
                byte b2 = this.sampleSignalByte;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        ParsableByteArray parsableByteArray4 = this.encryptionInitializationVector;
                        extractorInput.readFully(parsableByteArray4.data, 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        parsableByteArray3.data[0] = (byte) ((z4 ? 128 : 0) | 8);
                        parsableByteArray3.setPosition(0);
                        trackOutput.sampleData(parsableByteArray3, 1, 1);
                        this.sampleBytesWritten++;
                        parsableByteArray4.setPosition(0);
                        trackOutput.sampleData(parsableByteArray4, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z4) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(parsableByteArray3.data, 0, 1);
                            this.sampleBytesRead++;
                            parsableByteArray3.setPosition(0);
                            this.samplePartitionCount = parsableByteArray3.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i8 = this.samplePartitionCount * 4;
                        parsableByteArray3.reset(i8);
                        extractorInput.readFully(parsableByteArray3.data, 0, i8);
                        this.sampleBytesRead += i8;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i9);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.samplePartitionCount;
                            if (i10 >= i3) {
                                break;
                            }
                            int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.encryptionSubsampleDataBuffer;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (readUnsignedIntToInt - i11));
                            } else {
                                byteBuffer2.putInt(readUnsignedIntToInt - i11);
                            }
                            i10++;
                            i11 = readUnsignedIntToInt;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.sampleBytesRead) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.encryptionSubsampleDataBuffer;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        byte[] array2 = this.encryptionSubsampleDataBuffer.array();
                        ParsableByteArray parsableByteArray5 = this.encryptionSubsampleData;
                        parsableByteArray5.reset(i9, array2);
                        trackOutput.sampleData(parsableByteArray5, i9, 1);
                        this.sampleBytesWritten += i9;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr2 = track.sampleStrippedBytes;
                if (bArr2 != null) {
                    parsableByteArray2.reset(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(track.codecId) ? z : track.maxBlockAdditionId > 0) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int i16 = (parsableByteArray2.limit + i) - this.sampleBytesRead;
                parsableByteArray3.reset(4);
                byte[] bArr3 = parsableByteArray3.data;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                trackOutput.sampleData(parsableByteArray3, 4, i2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int i17 = i + parsableByteArray2.limit;
        if (!"V_MPEG4/ISO/AVC".equals(track.codecId) && !"V_MPEGH/ISO/HEVC".equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Trace.checkState(parsableByteArray2.limit == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i18 = this.sampleBytesRead;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int bytesLeft = parsableByteArray2.bytesLeft();
                if (bytesLeft > 0) {
                    sampleData2 = Math.min(i19, bytesLeft);
                    trackOutput.sampleData(sampleData2, parsableByteArray2);
                } else {
                    sampleData2 = trackOutput.sampleData((DataReader) extractorInput, i19, false);
                }
                this.sampleBytesRead += sampleData2;
                this.sampleBytesWritten += sampleData2;
            }
        } else {
            ParsableByteArray parsableByteArray6 = this.nalLength;
            byte[] bArr4 = parsableByteArray6.data;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = track.nalUnitLengthFieldLength;
            int i21 = 4 - i20;
            while (this.sampleBytesRead < i17) {
                int i22 = this.sampleCurrentNalBytesRemaining;
                if (i22 == 0) {
                    int min = Math.min(i20, parsableByteArray2.bytesLeft());
                    extractorInput.readFully(bArr4, i21 + min, i20 - min);
                    if (min > 0) {
                        parsableByteArray2.readBytes(i21, min, bArr4);
                    }
                    this.sampleBytesRead += i20;
                    parsableByteArray6.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = parsableByteArray6.readUnsignedIntToInt();
                    ParsableByteArray parsableByteArray7 = this.nalStartCode;
                    parsableByteArray7.setPosition(0);
                    trackOutput.sampleData(4, parsableByteArray7);
                    this.sampleBytesWritten += 4;
                } else {
                    int bytesLeft2 = parsableByteArray2.bytesLeft();
                    if (bytesLeft2 > 0) {
                        sampleData = Math.min(i22, bytesLeft2);
                        trackOutput.sampleData(sampleData, parsableByteArray2);
                    } else {
                        sampleData = trackOutput.sampleData((DataReader) extractorInput, i22, false);
                    }
                    this.sampleBytesRead += sampleData;
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                }
            }
        }
        if ("A_VORBIS".equals(track.codecId)) {
            ParsableByteArray parsableByteArray8 = this.vorbisNumPageSamples;
            parsableByteArray8.setPosition(0);
            trackOutput.sampleData(4, parsableByteArray8);
            this.sampleBytesWritten += 4;
        }
        int i23 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i23;
    }

    public final void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) {
        int length = bArr.length + i;
        ParsableByteArray parsableByteArray = this.subtitleSample;
        byte[] bArr2 = parsableByteArray.data;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            parsableByteArray.getClass();
            parsableByteArray.reset(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        extractorInput.readFully(parsableByteArray.data, bArr.length, i);
        parsableByteArray.setPosition(0);
        parsableByteArray.setLimit(length);
    }
}
