package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box$ContainerBox;
import androidx.media3.container.Mp4Box$LeafBox;
import androidx.media3.container.OpusUtil;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class FragmentedMp4Extractor implements Extractor {
    public static final Format EMSG_FORMAT;
    public static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public ParsableByteArray atomData;
    public final ParsableByteArray atomHeader;
    public int atomHeaderBytesRead;
    public long atomSize;
    public int atomType;
    public TrackOutput[] ceaTrackOutputs;
    public final ChunkIndexMerger chunkIndexMerger;
    public final List closedCaptionFormats;
    public final ArrayDeque containerAtoms;
    public TrackBundle currentTrackBundle;
    public long durationUs;
    public TrackOutput[] emsgTrackOutputs;
    public long endOfMdatPosition;
    public final CallResult eventMessageEncoder;
    public ExtractorOutput extractorOutput;
    public final int flags;
    public boolean haveOutputSeekMap;
    public boolean isSampleDependedOn;
    public RegularImmutableList lastSniffFailures;
    public final ParsableByteArray nalPrefix;
    public final ParsableByteArray nalStartCode;
    public final ParsableByteArray nalUnitWithoutHeaderBuffer;
    public int parserState;
    public int pendingMetadataSampleBytes;
    public final ArrayDeque pendingMetadataSampleInfos;
    public long pendingSeekTimeUs;
    public boolean processSeiNalUnitPayload;
    public final AdapterHelper reorderingBufferQueue;
    public int sampleBytesWritten;
    public int sampleCurrentNalBytesRemaining;
    public int sampleSize;
    public final ParsableByteArray scratch;
    public final byte[] scratchBytes;
    public long seekPositionBeforeSidxProcessing;
    public long segmentIndexEarliestPresentationTimeUs;
    public final SubtitleParser.Factory subtitleParserFactory;
    public final SparseArray trackBundles;
    public boolean upfrontSidxScanComplete;

    public final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j, int i, boolean z) {
            this.sampleTimeUs = j;
            this.sampleTimeIsRelative = z;
            this.size = i;
        }
    }

    public final class TrackBundle {
        public final Format baseFormat;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        public boolean currentlyInFragment;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        public final TrackFragment fragment = new TrackFragment();
        public final ParsableByteArray scratch = new ParsableByteArray();
        public final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        public final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues, Format format2) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.baseFormat = format2;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            trackOutput.format(format2);
            resetFragmentInfo();
        }

        public final int getCurrentSampleFlags() {
            int i = !this.currentlyInFragment ? this.moovSampleTable.flags[this.currentSampleIndex] : this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? 1073741824 | i : i;
        }

        public final TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (!this.currentlyInFragment) {
                return null;
            }
            TrackFragment trackFragment = this.fragment;
            DefaultSampleValues defaultSampleValues = trackFragment.header;
            String str = Util.DEVICE_DEBUG_INFO;
            int i = defaultSampleValues.sampleDescriptionIndex;
            TrackEncryptionBox trackEncryptionBox = trackFragment.trackEncryptionBox;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.moovSampleTable.track.sampleDescriptionEncryptionBoxes[i];
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.isEncrypted) {
                return null;
            }
            return trackEncryptionBox;
        }

        public final boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i;
            int[] iArr = this.fragment.trunLength;
            int i2 = this.currentTrackRunIndex;
            if (i != iArr[i2]) {
                return true;
            }
            this.currentTrackRunIndex = i2 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public final int outputSampleEncryptionData(int i, int i2) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int i3 = encryptionBoxIfEncrypted.perSampleIvSize;
            TrackFragment trackFragment = this.fragment;
            if (i3 != 0) {
                parsableByteArray = trackFragment.sampleEncryptionData;
            } else {
                byte[] bArr = encryptionBoxIfEncrypted.defaultInitializationVector;
                String str = Util.DEVICE_DEBUG_INFO;
                int length = bArr.length;
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                parsableByteArray2.reset(length, bArr);
                i3 = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z = trackFragment.definesEncryptionData && trackFragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex];
            boolean z2 = z || i2 != 0;
            ParsableByteArray parsableByteArray3 = this.encryptionSignalByte;
            parsableByteArray3.data[0] = (byte) ((z2 ? 128 : 0) | i3);
            parsableByteArray3.setPosition(0);
            TrackOutput trackOutput = this.output;
            trackOutput.sampleData(parsableByteArray3, 1, 1);
            trackOutput.sampleData(parsableByteArray, i3, 1);
            if (!z2) {
                return i3 + 1;
            }
            ParsableByteArray parsableByteArray4 = this.scratch;
            if (!z) {
                parsableByteArray4.reset(8);
                byte[] bArr2 = parsableByteArray4.data;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = 0;
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                trackOutput.sampleData(parsableByteArray4, 8, 1);
                return i3 + 9;
            }
            ParsableByteArray parsableByteArray5 = trackFragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray5.readUnsignedShort();
            parsableByteArray5.skipBytes(-2);
            int i4 = (readUnsignedShort * 6) + 2;
            if (i2 != 0) {
                parsableByteArray4.reset(i4);
                byte[] bArr3 = parsableByteArray4.data;
                parsableByteArray5.readBytes(0, i4, bArr3);
                int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
            } else {
                parsableByteArray4 = parsableByteArray5;
            }
            trackOutput.sampleData(parsableByteArray4, i4, 1);
            return i3 + 1 + i4;
        }

        public final void resetFragmentInfo() {
            TrackFragment trackFragment = this.fragment;
            trackFragment.trunCount = 0;
            trackFragment.nextFragmentDecodeTime = 0L;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = false;
            trackFragment.definesEncryptionData = false;
            trackFragment.sampleEncryptionDataNeedsFill = false;
            trackFragment.trackEncryptionBox = null;
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.sampleMimeType = MimeTypes.normalizeMimeType("application/x-emsg");
        EMSG_FORMAT = new Format(builder);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i) {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.closedCaptionFormats = Collections.unmodifiableList(regularImmutableList);
        this.eventMessageEncoder = new CallResult(8);
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(OpusUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.nalUnitWithoutHeaderBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque();
        this.pendingMetadataSampleInfos = new ArrayDeque();
        this.trackBundles = new SparseArray();
        this.lastSniffFailures = regularImmutableList;
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
        this.reorderingBufferQueue = new AdapterHelper(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 10));
        this.chunkIndexMerger = new ChunkIndexMerger(0);
        this.seekPositionBeforeSidxProcessing = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DrmInitData getDrmInitDataFromAtoms(List list) {
        PreviewView.AnonymousClass1 anonymousClass1;
        UUID uuid;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            Mp4Box$LeafBox mp4Box$LeafBox = (Mp4Box$LeafBox) list.get(i2);
            if (mp4Box$LeafBox.flags == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = mp4Box$LeafBox.data.data;
                ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
                if (parsableByteArray.limit >= 32) {
                    parsableByteArray.setPosition(i);
                    int bytesLeft = parsableByteArray.bytesLeft();
                    int readInt = parsableByteArray.readInt();
                    if (readInt != bytesLeft) {
                        Log.w("PsshAtomUtil", "Advertised atom size (" + readInt + ") does not match buffer size: " + bytesLeft);
                    } else {
                        int readInt2 = parsableByteArray.readInt();
                        if (readInt2 != 1886614376) {
                            Fragment$5$$ExternalSyntheticOutline0.m(readInt2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
                            if (parseFullBoxVersion > 1) {
                                Fragment$5$$ExternalSyntheticOutline0.m(parseFullBoxVersion, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid2 = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
                                if (parseFullBoxVersion == 1) {
                                    int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                                    UUID[] uuidArr = new UUID[readUnsignedIntToInt];
                                    for (int i3 = i; i3 < readUnsignedIntToInt; i3++) {
                                        uuidArr[i3] = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
                                    }
                                }
                                int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
                                int bytesLeft2 = parsableByteArray.bytesLeft();
                                if (readUnsignedIntToInt2 != bytesLeft2) {
                                    Log.w("PsshAtomUtil", "Atom data size (" + readUnsignedIntToInt2 + ") does not match the bytes left: " + bytesLeft2);
                                } else {
                                    parsableByteArray.readBytes(0, readUnsignedIntToInt2, new byte[readUnsignedIntToInt2]);
                                    anonymousClass1 = new PreviewView.AnonymousClass1();
                                    anonymousClass1.this$0 = uuid2;
                                    uuid = anonymousClass1 != null ? null : (UUID) anonymousClass1.this$0;
                                    if (uuid != null) {
                                        Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                    } else {
                                        arrayList.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                                        i2++;
                                        i = 0;
                                    }
                                }
                            }
                        }
                    }
                }
                anonymousClass1 = null;
                if (anonymousClass1 != null) {
                }
                if (uuid != null) {
                }
            }
            i2++;
            i = 0;
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void parseSenc(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) {
        parsableByteArray.setPosition(i + 8);
        int readInt = parsableByteArray.readInt();
        byte[] bArr = BoxParser.opusMagic;
        if ((readInt & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (readInt & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 0) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
            return;
        }
        int i2 = trackFragment.sampleCount;
        ParsableByteArray parsableByteArray2 = trackFragment.sampleEncryptionData;
        if (readUnsignedIntToInt != i2) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(readUnsignedIntToInt, "Senc sample count ", " is different from fragment sample count");
            m2m.append(trackFragment.sampleCount);
            throw ParserException.createForMalformedContainer(null, m2m.toString());
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
        parsableByteArray2.reset(parsableByteArray.bytesLeft());
        trackFragment.definesEncryptionData = true;
        trackFragment.sampleEncryptionDataNeedsFill = true;
        parsableByteArray.readBytes(0, parsableByteArray2.limit, parsableByteArray2.data);
        parsableByteArray2.setPosition(0);
        trackFragment.sampleEncryptionDataNeedsFill = false;
    }

    public static Pair parseSidx(long j, ParsableByteArray parsableByteArray) {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        long readUnsignedInt = parsableByteArray2.readUnsignedInt();
        if (parseFullBoxVersion == 0) {
            readUnsignedLongToLong = parsableByteArray2.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray2.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray2.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray2.readUnsignedLongToLong();
        }
        long j2 = readUnsignedLongToLong2 + j;
        String str = Util.DEVICE_DEBUG_INFO;
        long scaleLargeValue = Util.scaleLargeValue(readUnsignedLongToLong, 1000000L, readUnsignedInt, RoundingMode.DOWN);
        parsableByteArray2.skipBytes(2);
        int readUnsignedShort = parsableByteArray2.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j3 = j2;
        long j4 = scaleLargeValue;
        int i = 0;
        while (i < readUnsignedShort) {
            int readInt = parsableByteArray2.readInt();
            if ((Integer.MIN_VALUE & readInt) != 0) {
                throw ParserException.createForMalformedContainer(null, "Unhandled indirect reference");
            }
            long readUnsignedInt2 = parsableByteArray2.readUnsignedInt();
            iArr[i] = readInt & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            readUnsignedLongToLong += readUnsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long scaleLargeValue2 = Util.scaleLargeValue(readUnsignedLongToLong, 1000000L, readUnsignedInt, RoundingMode.DOWN);
            jArr4[i] = scaleLargeValue2 - jArr5[i];
            parsableByteArray2.skipBytes(4);
            j3 += iArr[i];
            i++;
            readUnsignedShort = readUnsignedShort;
            parsableByteArray2 = parsableByteArray;
            j4 = scaleLargeValue2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(scaleLargeValue), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    public final void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final List getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        int i;
        int i2 = this.flags;
        if ((i2 & 32) == 0) {
            extractorOutput = new Response(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
        enterReadingAtomHeaderState();
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            trackOutputArr[0] = this.extractorOutput.track(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(i, this.emsgTrackOutputs);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.format(EMSG_FORMAT);
        }
        List list = this.closedCaptionFormats;
        this.ceaTrackOutputs = new TrackOutput[list.size()];
        while (i4 < this.ceaTrackOutputs.length) {
            TrackOutput track = this.extractorOutput.track(i3, 3);
            track.format((Format) list.get(i4));
            this.ceaTrackOutputs[i4] = track;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0435, code lost:
    
        if ((androidx.media3.common.util.Util.scaleLargeValue(r40, 1000000, r7, r46) + androidx.media3.common.util.Util.scaleLargeValue(r7[0], 1000000, r2.timescale, r46)) >= r2.durationUs) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0804, code lost:
    
        enterReadingAtomHeaderState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0807, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x071a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void processAtomEnded(long j) {
        Metadata metadata;
        int i;
        long j2;
        DefaultSampleValues defaultSampleValues;
        int i2;
        DefaultSampleValues defaultSampleValues2;
        ArrayList arrayList;
        int i3;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        int size;
        int i8;
        byte[] bArr;
        int i9;
        boolean z;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        int i13;
        int i14;
        int i15;
        while (true) {
            ArrayDeque arrayDeque = this.containerAtoms;
            if (arrayDeque.isEmpty() || ((Mp4Box$ContainerBox) arrayDeque.peek()).endPosition != j) {
                break;
            }
            Mp4Box$ContainerBox mp4Box$ContainerBox = (Mp4Box$ContainerBox) arrayDeque.pop();
            int i16 = mp4Box$ContainerBox.flags;
            ArrayList arrayList6 = mp4Box$ContainerBox.containerChildren;
            ArrayList arrayList7 = mp4Box$ContainerBox.leafChildren;
            int i17 = this.flags;
            int i18 = 12;
            SparseArray sparseArray = this.trackBundles;
            if (i16 == 1836019574) {
                DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(arrayList7);
                Mp4Box$ContainerBox containerBoxOfType = mp4Box$ContainerBox.getContainerBoxOfType(1836475768);
                containerBoxOfType.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList8 = containerBoxOfType.leafChildren;
                int size2 = arrayList8.size();
                int i19 = 0;
                long j3 = -9223372036854775807L;
                while (i19 < size2) {
                    Mp4Box$LeafBox mp4Box$LeafBox = (Mp4Box$LeafBox) arrayList8.get(i19);
                    int i20 = mp4Box$LeafBox.flags;
                    ParsableByteArray parsableByteArray = mp4Box$LeafBox.data;
                    if (i20 == 1953654136) {
                        parsableByteArray.setPosition(i18);
                        arrayList = arrayList8;
                        Pair create = Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
                        sparseArray2.put(((Integer) create.first).intValue(), (DefaultSampleValues) create.second);
                    } else {
                        arrayList = arrayList8;
                        if (i20 == 1835362404) {
                            parsableByteArray.setPosition(8);
                            j3 = BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                        }
                    }
                    i19++;
                    arrayList8 = arrayList;
                    i18 = 12;
                }
                int i21 = 0;
                Mp4Box$ContainerBox containerBoxOfType2 = mp4Box$ContainerBox.getContainerBoxOfType(1835365473);
                Metadata parseMdtaFromMeta = containerBoxOfType2 != null ? BoxParser.parseMdtaFromMeta(containerBoxOfType2) : null;
                GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
                Mp4Box$LeafBox leafBoxOfType = mp4Box$ContainerBox.getLeafBoxOfType(1969517665);
                if (leafBoxOfType != null) {
                    Metadata parseUdta = BoxParser.parseUdta(leafBoxOfType);
                    gaplessInfoHolder.setFromMetadata(parseUdta);
                    metadata = parseUdta;
                } else {
                    metadata = null;
                }
                Mp4Box$LeafBox leafBoxOfType2 = mp4Box$ContainerBox.getLeafBoxOfType(1836476516);
                leafBoxOfType2.getClass();
                Metadata metadata2 = new Metadata(BoxParser.parseMvhd(leafBoxOfType2.data));
                ArrayList parseTraks = BoxParser.parseTraks(mp4Box$ContainerBox, gaplessInfoHolder, j3, drmInitDataFromAtoms, (i17 & 16) != 0, false, new Format$$ExternalSyntheticLambda1(this), false);
                int size3 = parseTraks.size();
                if (sparseArray.size() == 0) {
                    String containerMimeType = Sniffer.getContainerMimeType(parseTraks);
                    int i22 = 0;
                    while (i22 < size3) {
                        TrackSampleTable trackSampleTable = (TrackSampleTable) parseTraks.get(i22);
                        Track track = trackSampleTable.track;
                        ExtractorOutput extractorOutput = this.extractorOutput;
                        int i23 = track.f893type;
                        int i24 = track.id;
                        String str = containerMimeType;
                        Format format2 = track.f892format;
                        long j4 = track.durationUs;
                        TrackOutput track2 = extractorOutput.track(i22, i23);
                        track2.durationUs(j4);
                        int i25 = i22;
                        Format.Builder buildUpon = format2.buildUpon();
                        ArrayList arrayList9 = parseTraks;
                        buildUpon.containerMimeType = MimeTypes.normalizeMimeType(str);
                        if (i23 == 1) {
                            int i26 = gaplessInfoHolder.encoderDelay;
                            i = size3;
                            j2 = j4;
                            if (i26 != -1 && (i2 = gaplessInfoHolder.encoderPadding) != -1) {
                                buildUpon.encoderDelay = i26;
                                buildUpon.encoderPadding = i2;
                            }
                        } else {
                            i = size3;
                            j2 = j4;
                        }
                        Sniffer.setFormatMetadata(i23, parseMdtaFromMeta, buildUpon, format2.metadata, metadata, metadata2);
                        if (sparseArray2.size() == 1) {
                            defaultSampleValues = (DefaultSampleValues) sparseArray2.valueAt(i21);
                        } else {
                            defaultSampleValues = (DefaultSampleValues) sparseArray2.get(i24);
                            defaultSampleValues.getClass();
                        }
                        sparseArray.put(i24, new TrackBundle(track2, trackSampleTable, defaultSampleValues, new Format(buildUpon)));
                        this.durationUs = Math.max(this.durationUs, j2);
                        i22 = i25 + 1;
                        containerMimeType = str;
                        parseTraks = arrayList9;
                        size3 = i;
                        i21 = 0;
                    }
                    this.extractorOutput.endTracks();
                } else {
                    ArrayList arrayList10 = parseTraks;
                    Trace.checkState(sparseArray.size() == size3);
                    int i27 = 0;
                    while (i27 < size3) {
                        ArrayList arrayList11 = arrayList10;
                        TrackSampleTable trackSampleTable2 = (TrackSampleTable) arrayList11.get(i27);
                        Track track3 = trackSampleTable2.track;
                        TrackBundle trackBundle = (TrackBundle) sparseArray.get(track3.id);
                        int i28 = track3.id;
                        if (sparseArray2.size() == 1) {
                            defaultSampleValues2 = (DefaultSampleValues) sparseArray2.valueAt(0);
                        } else {
                            defaultSampleValues2 = (DefaultSampleValues) sparseArray2.get(i28);
                            defaultSampleValues2.getClass();
                        }
                        trackBundle.moovSampleTable = trackSampleTable2;
                        trackBundle.defaultSampleValues = defaultSampleValues2;
                        trackBundle.output.format(trackBundle.baseFormat);
                        trackBundle.resetFragmentInfo();
                        i27++;
                        arrayList10 = arrayList11;
                    }
                }
            } else if (i16 == 1836019558) {
                int size4 = arrayList6.size();
                int i29 = 0;
                while (i29 < size4) {
                    Mp4Box$ContainerBox mp4Box$ContainerBox2 = (Mp4Box$ContainerBox) arrayList6.get(i29);
                    if (mp4Box$ContainerBox2.flags == 1953653094) {
                        Mp4Box$LeafBox leafBoxOfType3 = mp4Box$ContainerBox2.getLeafBoxOfType(1952868452);
                        ArrayList arrayList12 = mp4Box$ContainerBox2.leafChildren;
                        leafBoxOfType3.getClass();
                        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
                        parsableByteArray2.setPosition(8);
                        int readInt = parsableByteArray2.readInt();
                        byte[] bArr2 = BoxParser.opusMagic;
                        TrackBundle trackBundle2 = (TrackBundle) sparseArray.get(parsableByteArray2.readInt());
                        if (trackBundle2 == null) {
                            i3 = size4;
                            trackBundle2 = null;
                        } else {
                            TrackFragment trackFragment = trackBundle2.fragment;
                            if ((readInt & 1) != 0) {
                                long readUnsignedLongToLong = parsableByteArray2.readUnsignedLongToLong();
                                trackFragment.dataPosition = readUnsignedLongToLong;
                                trackFragment.auxiliaryDataPosition = readUnsignedLongToLong;
                            }
                            DefaultSampleValues defaultSampleValues3 = trackBundle2.defaultSampleValues;
                            int readInt2 = (readInt & 2) != 0 ? parsableByteArray2.readInt() - 1 : defaultSampleValues3.sampleDescriptionIndex;
                            int readInt3 = (readInt & 8) != 0 ? parsableByteArray2.readInt() : defaultSampleValues3.duration;
                            if ((readInt & 16) != 0) {
                                i3 = size4;
                                i6 = parsableByteArray2.readInt();
                            } else {
                                i3 = size4;
                                i6 = defaultSampleValues3.size;
                            }
                            trackFragment.header = new DefaultSampleValues(readInt2, readInt3, i6, (readInt & 32) != 0 ? parsableByteArray2.readInt() : defaultSampleValues3.flags);
                        }
                        if (trackBundle2 == null) {
                            i4 = i29;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i5 = i17;
                        } else {
                            TrackFragment trackFragment2 = trackBundle2.fragment;
                            long j5 = trackFragment2.nextFragmentDecodeTime;
                            boolean z4 = trackFragment2.nextFragmentDecodeTimeIncludesMoov;
                            trackBundle2.resetFragmentInfo();
                            trackBundle2.currentlyInFragment = true;
                            Mp4Box$LeafBox leafBoxOfType4 = mp4Box$ContainerBox2.getLeafBoxOfType(1952867444);
                            if (leafBoxOfType4 == null || (i17 & 2) != 0) {
                                trackFragment2.nextFragmentDecodeTime = j5;
                                trackFragment2.nextFragmentDecodeTimeIncludesMoov = z4;
                            } else {
                                ParsableByteArray parsableByteArray3 = leafBoxOfType4.data;
                                parsableByteArray3.setPosition(8);
                                trackFragment2.nextFragmentDecodeTime = BoxParser.parseFullBoxVersion(parsableByteArray3.readInt()) == 1 ? parsableByteArray3.readUnsignedLongToLong() : parsableByteArray3.readUnsignedInt();
                                trackFragment2.nextFragmentDecodeTimeIncludesMoov = true;
                            }
                            int size5 = arrayList12.size();
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                i7 = 1953658222;
                                if (i30 >= size5) {
                                    break;
                                }
                                Mp4Box$LeafBox mp4Box$LeafBox2 = (Mp4Box$LeafBox) arrayList12.get(i30);
                                int i33 = i29;
                                if (mp4Box$LeafBox2.flags == 1953658222) {
                                    ParsableByteArray parsableByteArray4 = mp4Box$LeafBox2.data;
                                    parsableByteArray4.setPosition(12);
                                    int readUnsignedIntToInt = parsableByteArray4.readUnsignedIntToInt();
                                    if (readUnsignedIntToInt > 0) {
                                        i32 += readUnsignedIntToInt;
                                        i31++;
                                    }
                                }
                                i30++;
                                i29 = i33;
                            }
                            i4 = i29;
                            trackBundle2.currentTrackRunIndex = 0;
                            trackBundle2.currentSampleInTrackRun = 0;
                            trackBundle2.currentSampleIndex = 0;
                            trackFragment2.trunCount = i31;
                            trackFragment2.sampleCount = i32;
                            if (trackFragment2.trunLength.length < i31) {
                                trackFragment2.trunDataPosition = new long[i31];
                                trackFragment2.trunLength = new int[i31];
                            }
                            if (trackFragment2.sampleSizeTable.length < i32) {
                                int i34 = (i32 * 125) / 100;
                                trackFragment2.sampleSizeTable = new int[i34];
                                trackFragment2.samplePresentationTimesUs = new long[i34];
                                trackFragment2.sampleIsSyncFrameTable = new boolean[i34];
                                trackFragment2.sampleHasSubsampleEncryptionTable = new boolean[i34];
                            }
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                long j6 = 0;
                                if (i35 < size5) {
                                    Mp4Box$LeafBox mp4Box$LeafBox3 = (Mp4Box$LeafBox) arrayList12.get(i35);
                                    if (mp4Box$LeafBox3.flags == i7) {
                                        int i38 = i36 + 1;
                                        ParsableByteArray parsableByteArray5 = mp4Box$LeafBox3.data;
                                        parsableByteArray5.setPosition(8);
                                        int readInt4 = parsableByteArray5.readInt();
                                        byte[] bArr3 = BoxParser.opusMagic;
                                        i10 = i35;
                                        Track track4 = trackBundle2.moovSampleTable.track;
                                        arrayList4 = arrayList6;
                                        DefaultSampleValues defaultSampleValues4 = trackFragment2.header;
                                        String str2 = Util.DEVICE_DEBUG_INFO;
                                        arrayList5 = arrayList7;
                                        trackFragment2.trunLength[i36] = parsableByteArray5.readUnsignedIntToInt();
                                        long[] jArr = trackFragment2.trunDataPosition;
                                        i11 = size5;
                                        i12 = i17;
                                        long j7 = trackFragment2.dataPosition;
                                        jArr[i36] = j7;
                                        if ((readInt4 & 1) != 0) {
                                            jArr[i36] = j7 + parsableByteArray5.readInt();
                                        }
                                        boolean z5 = (readInt4 & 4) != 0;
                                        int i39 = defaultSampleValues4.flags;
                                        if (z5) {
                                            i39 = parsableByteArray5.readInt();
                                        }
                                        boolean z6 = (readInt4 & 256) != 0;
                                        boolean z7 = z5;
                                        boolean z8 = (readInt4 & 512) != 0;
                                        boolean z9 = (readInt4 & 1024) != 0;
                                        boolean z10 = (readInt4 & 2048) != 0;
                                        boolean z11 = z9;
                                        long[] jArr2 = track4.editListDurations;
                                        int i40 = i39;
                                        long[] jArr3 = track4.editListMediaTimes;
                                        if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                            z2 = z6;
                                        } else {
                                            long j8 = jArr2[0];
                                            if (j8 == 0) {
                                                z2 = z6;
                                            } else {
                                                z2 = z6;
                                                long j9 = track4.movieTimescale;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j6 = jArr3[0];
                                        }
                                        int[] iArr = trackFragment2.sampleSizeTable;
                                        long[] jArr4 = trackFragment2.samplePresentationTimesUs;
                                        boolean z12 = z2;
                                        boolean[] zArr = trackFragment2.sampleIsSyncFrameTable;
                                        boolean z13 = track4.f893type == 2 && (i12 & 1) != 0;
                                        int i41 = trackFragment2.trunLength[i36] + i37;
                                        int i42 = i37;
                                        long j10 = track4.timescale;
                                        boolean z14 = z10;
                                        long j11 = trackFragment2.nextFragmentDecodeTime;
                                        int i43 = i42;
                                        while (i43 < i41) {
                                            int readInt5 = z12 ? parsableByteArray5.readInt() : defaultSampleValues4.duration;
                                            boolean z15 = z14;
                                            if (readInt5 < 0) {
                                                throw ParserException.createForMalformedContainer(null, "Unexpected negative value: " + readInt5);
                                            }
                                            if (z8) {
                                                z3 = z13;
                                                i13 = parsableByteArray5.readInt();
                                            } else {
                                                z3 = z13;
                                                i13 = defaultSampleValues4.size;
                                            }
                                            if (i13 < 0) {
                                                throw ParserException.createForMalformedContainer(null, "Unexpected negative value: " + i13);
                                            }
                                            int readInt6 = z11 ? parsableByteArray5.readInt() : (i43 == 0 && z7) ? i40 : defaultSampleValues4.flags;
                                            if (z15) {
                                                i14 = readInt6;
                                                i15 = parsableByteArray5.readInt();
                                            } else {
                                                i14 = readInt6;
                                                i15 = 0;
                                            }
                                            int i44 = i41;
                                            long[] jArr5 = jArr4;
                                            long scaleLargeValue = Util.scaleLargeValue((i15 + j11) - j6, 1000000L, j10, RoundingMode.DOWN);
                                            jArr5[i43] = scaleLargeValue;
                                            if (!trackFragment2.nextFragmentDecodeTimeIncludesMoov) {
                                                jArr5[i43] = scaleLargeValue + trackBundle2.moovSampleTable.durationUs;
                                            }
                                            iArr[i43] = i13;
                                            zArr[i43] = ((i14 >> 16) & 1) == 0 && (!z3 || i43 == 0);
                                            j11 += readInt5;
                                            i43++;
                                            z14 = z15;
                                            z13 = z3;
                                            jArr4 = jArr5;
                                            i41 = i44;
                                        }
                                        trackFragment2.nextFragmentDecodeTime = j11;
                                        i36 = i38;
                                        i37 = i41;
                                    } else {
                                        i10 = i35;
                                        arrayList4 = arrayList6;
                                        arrayList5 = arrayList7;
                                        i11 = size5;
                                        i12 = i17;
                                    }
                                    i35 = i10 + 1;
                                    arrayList6 = arrayList4;
                                    arrayList7 = arrayList5;
                                    i17 = i12;
                                    size5 = i11;
                                    i7 = 1953658222;
                                } else {
                                    arrayList2 = arrayList6;
                                    arrayList3 = arrayList7;
                                    i5 = i17;
                                    Track track5 = trackBundle2.moovSampleTable.track;
                                    DefaultSampleValues defaultSampleValues5 = trackFragment2.header;
                                    defaultSampleValues5.getClass();
                                    TrackEncryptionBox trackEncryptionBox = track5.sampleDescriptionEncryptionBoxes[defaultSampleValues5.sampleDescriptionIndex];
                                    Mp4Box$LeafBox leafBoxOfType5 = mp4Box$ContainerBox2.getLeafBoxOfType(1935763834);
                                    if (leafBoxOfType5 != null) {
                                        trackEncryptionBox.getClass();
                                        ParsableByteArray parsableByteArray6 = leafBoxOfType5.data;
                                        int i45 = trackEncryptionBox.perSampleIvSize;
                                        parsableByteArray6.setPosition(8);
                                        int readInt7 = parsableByteArray6.readInt();
                                        byte[] bArr4 = BoxParser.opusMagic;
                                        if ((readInt7 & 1) == 1) {
                                            parsableByteArray6.skipBytes(8);
                                        }
                                        int readUnsignedByte = parsableByteArray6.readUnsignedByte();
                                        int readUnsignedIntToInt2 = parsableByteArray6.readUnsignedIntToInt();
                                        if (readUnsignedIntToInt2 > trackFragment2.sampleCount) {
                                            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(readUnsignedIntToInt2, "Saiz sample count ", " is greater than fragment sample count");
                                            m2m.append(trackFragment2.sampleCount);
                                            throw ParserException.createForMalformedContainer(null, m2m.toString());
                                        }
                                        if (readUnsignedByte == 0) {
                                            boolean[] zArr2 = trackFragment2.sampleHasSubsampleEncryptionTable;
                                            i9 = 0;
                                            for (int i46 = 0; i46 < readUnsignedIntToInt2; i46++) {
                                                int readUnsignedByte2 = parsableByteArray6.readUnsignedByte();
                                                i9 += readUnsignedByte2;
                                                zArr2[i46] = readUnsignedByte2 > i45;
                                            }
                                            z = false;
                                        } else {
                                            boolean z16 = readUnsignedByte > i45;
                                            i9 = readUnsignedByte * readUnsignedIntToInt2;
                                            z = false;
                                            Arrays.fill(trackFragment2.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt2, z16);
                                        }
                                        Arrays.fill(trackFragment2.sampleHasSubsampleEncryptionTable, readUnsignedIntToInt2, trackFragment2.sampleCount, z);
                                        if (i9 > 0) {
                                            trackFragment2.sampleEncryptionData.reset(i9);
                                            trackFragment2.definesEncryptionData = true;
                                            trackFragment2.sampleEncryptionDataNeedsFill = true;
                                        }
                                    }
                                    Mp4Box$LeafBox leafBoxOfType6 = mp4Box$ContainerBox2.getLeafBoxOfType(1935763823);
                                    if (leafBoxOfType6 != null) {
                                        ParsableByteArray parsableByteArray7 = leafBoxOfType6.data;
                                        parsableByteArray7.setPosition(8);
                                        int readInt8 = parsableByteArray7.readInt();
                                        byte[] bArr5 = BoxParser.opusMagic;
                                        if ((readInt8 & 1) == 1) {
                                            parsableByteArray7.skipBytes(8);
                                        }
                                        int readUnsignedIntToInt3 = parsableByteArray7.readUnsignedIntToInt();
                                        if (readUnsignedIntToInt3 != 1) {
                                            throw ParserException.createForMalformedContainer(null, "Unexpected saio entry count: " + readUnsignedIntToInt3);
                                        }
                                        trackFragment2.auxiliaryDataPosition += BoxParser.parseFullBoxVersion(readInt8) == 0 ? parsableByteArray7.readUnsignedInt() : parsableByteArray7.readUnsignedLongToLong();
                                    }
                                    Mp4Box$LeafBox leafBoxOfType7 = mp4Box$ContainerBox2.getLeafBoxOfType(1936027235);
                                    if (leafBoxOfType7 != null) {
                                        parseSenc(leafBoxOfType7.data, 0, trackFragment2);
                                    }
                                    String str3 = trackEncryptionBox != null ? trackEncryptionBox.schemeType : null;
                                    ParsableByteArray parsableByteArray8 = null;
                                    ParsableByteArray parsableByteArray9 = null;
                                    for (int i47 = 0; i47 < arrayList12.size(); i47++) {
                                        Mp4Box$LeafBox mp4Box$LeafBox4 = (Mp4Box$LeafBox) arrayList12.get(i47);
                                        ParsableByteArray parsableByteArray10 = mp4Box$LeafBox4.data;
                                        int i48 = mp4Box$LeafBox4.flags;
                                        if (i48 == 1935828848) {
                                            parsableByteArray10.setPosition(12);
                                            if (parsableByteArray10.readInt() == 1936025959) {
                                                parsableByteArray8 = parsableByteArray10;
                                            }
                                        } else if (i48 == 1936158820) {
                                            parsableByteArray10.setPosition(12);
                                            if (parsableByteArray10.readInt() == 1936025959) {
                                                parsableByteArray9 = parsableByteArray10;
                                            }
                                        }
                                    }
                                    if (parsableByteArray8 != null && parsableByteArray9 != null) {
                                        parsableByteArray8.setPosition(8);
                                        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray8.readInt());
                                        parsableByteArray8.skipBytes(4);
                                        if (parseFullBoxVersion == 1) {
                                            parsableByteArray8.skipBytes(4);
                                        }
                                        if (parsableByteArray8.readInt() != 1) {
                                            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        parsableByteArray9.setPosition(8);
                                        int parseFullBoxVersion2 = BoxParser.parseFullBoxVersion(parsableByteArray9.readInt());
                                        parsableByteArray9.skipBytes(4);
                                        if (parseFullBoxVersion2 == 1) {
                                            if (parsableByteArray9.readUnsignedInt() == 0) {
                                                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (parseFullBoxVersion2 >= 2) {
                                            parsableByteArray9.skipBytes(4);
                                        }
                                        if (parsableByteArray9.readUnsignedInt() != 1) {
                                            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        parsableByteArray9.skipBytes(1);
                                        int readUnsignedByte3 = parsableByteArray9.readUnsignedByte();
                                        int i49 = (readUnsignedByte3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
                                        int i50 = readUnsignedByte3 & 15;
                                        boolean z17 = parsableByteArray9.readUnsignedByte() == 1;
                                        if (z17) {
                                            int readUnsignedByte4 = parsableByteArray9.readUnsignedByte();
                                            byte[] bArr6 = new byte[16];
                                            parsableByteArray9.readBytes(0, 16, bArr6);
                                            if (readUnsignedByte4 == 0) {
                                                int readUnsignedByte5 = parsableByteArray9.readUnsignedByte();
                                                byte[] bArr7 = new byte[readUnsignedByte5];
                                                parsableByteArray9.readBytes(0, readUnsignedByte5, bArr7);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            trackFragment2.definesEncryptionData = true;
                                            trackFragment2.trackEncryptionBox = new TrackEncryptionBox(z17, str3, readUnsignedByte4, bArr6, i49, i50, bArr);
                                            size = arrayList12.size();
                                            for (i8 = 0; i8 < size; i8++) {
                                                Mp4Box$LeafBox mp4Box$LeafBox5 = (Mp4Box$LeafBox) arrayList12.get(i8);
                                                if (mp4Box$LeafBox5.flags == 1970628964) {
                                                    ParsableByteArray parsableByteArray11 = mp4Box$LeafBox5.data;
                                                    parsableByteArray11.setPosition(8);
                                                    byte[] bArr8 = this.scratchBytes;
                                                    parsableByteArray11.readBytes(0, 16, bArr8);
                                                    if (Arrays.equals(bArr8, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
                                                        parseSenc(parsableByteArray11, 16, trackFragment2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList12.size();
                                    while (i8 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i3 = size4;
                        i4 = i29;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = i17;
                    }
                    i29 = i4 + 1;
                    size4 = i3;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    i17 = i5;
                }
                DrmInitData drmInitDataFromAtoms2 = getDrmInitDataFromAtoms(arrayList7);
                if (drmInitDataFromAtoms2 != null) {
                    int size6 = sparseArray.size();
                    for (int i51 = 0; i51 < size6; i51++) {
                        TrackBundle trackBundle3 = (TrackBundle) sparseArray.valueAt(i51);
                        Track track6 = trackBundle3.moovSampleTable.track;
                        DefaultSampleValues defaultSampleValues6 = trackBundle3.fragment.header;
                        String str4 = Util.DEVICE_DEBUG_INFO;
                        TrackEncryptionBox trackEncryptionBox2 = track6.sampleDescriptionEncryptionBoxes[defaultSampleValues6.sampleDescriptionIndex];
                        DrmInitData copyWithSchemeType = drmInitDataFromAtoms2.copyWithSchemeType(trackEncryptionBox2 != null ? trackEncryptionBox2.schemeType : null);
                        Format.Builder buildUpon2 = trackBundle3.baseFormat.buildUpon();
                        buildUpon2.drmInitData = copyWithSchemeType;
                        trackBundle3.output.format(new Format(buildUpon2));
                    }
                }
                if (this.pendingSeekTimeUs != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i52 = 0; i52 < size7; i52++) {
                        TrackBundle trackBundle4 = (TrackBundle) sparseArray.valueAt(i52);
                        long j12 = this.pendingSeekTimeUs;
                        int i53 = trackBundle4.currentSampleIndex;
                        while (true) {
                            TrackFragment trackFragment3 = trackBundle4.fragment;
                            if (i53 < trackFragment3.sampleCount && trackFragment3.samplePresentationTimesUs[i53] <= j12) {
                                if (trackFragment3.sampleIsSyncFrameTable[i53]) {
                                    trackBundle4.firstSampleToOutputIndex = i53;
                                }
                                i53++;
                            }
                        }
                    }
                    this.pendingSeekTimeUs = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((Mp4Box$ContainerBox) arrayDeque.peek()).containerChildren.add(mp4Box$ContainerBox);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0657, code lost:
    
        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x00c8, code lost:
    
        r9 = r2.output;
        r5 = r2.fragment;
        r10 = "video/hevc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x00d7, code lost:
    
        if (r31.parserState != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x00db, code lost:
    
        if (r2.currentlyInFragment != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x00dd, code lost:
    
        r6 = r2.moovSampleTable.sizes[r2.currentSampleIndex];
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00ec, code lost:
    
        r31.sampleSize = r6;
        r6 = r2.moovSampleTable.track.f892format;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00fa, code lost:
    
        if (java.util.Objects.equals(r6.sampleMimeType, "video/avc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00fe, code lost:
    
        if ((r4 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0100, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0113, code lost:
    
        r31.isSampleDependedOn = r4 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x011b, code lost:
    
        if (r2.currentSampleIndex >= r2.firstSampleToOutputIndex) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x011d, code lost:
    
        r1.skipFully(r31.sampleSize);
        r1 = r2.getEncryptionBoxIfEncrypted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0126, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0129, code lost:
    
        r3 = r5.sampleEncryptionData;
        r1 = r1.perSampleIvSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x012d, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x012f, code lost:
    
        r3.skipBytes(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0132, code lost:
    
        r1 = r2.currentSampleIndex;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0136, code lost:
    
        if (r5.definesEncryptionData == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x013c, code lost:
    
        if (r5.sampleHasSubsampleEncryptionTable[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x013e, code lost:
    
        r3.skipBytes(r3.readUnsignedShort() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x014a, code lost:
    
        if (r2.next() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x014c, code lost:
    
        r31.currentTrackBundle = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x014f, code lost:
    
        r31.parserState = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0152, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x015b, code lost:
    
        if (r2.moovSampleTable.track.sampleTransformation != r22) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x015d, code lost:
    
        r31.sampleSize -= 8;
        r1.skipFully(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0168, code lost:
    
        r4 = "audio/ac4".equals(r2.moovSampleTable.track.f892format.sampleMimeType);
        r6 = r31.sampleSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0178, code lost:
    
        if (r4 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017a, code lost:
    
        r31.sampleBytesWritten = r2.outputSampleEncryptionData(r6, 7);
        androidx.media3.extractor.AacUtil.getAc4SampleHeader(r31.sampleSize, r8);
        r9.sampleData(7, r8);
        r31.sampleBytesWritten += 7;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0199, code lost:
    
        r31.sampleSize += r31.sampleBytesWritten;
        r31.parserState = 4;
        r31.sampleCurrentNalBytesRemaining = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0191, code lost:
    
        r4 = r21;
        r31.sampleBytesWritten = r2.outputSampleEncryptionData(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0103, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x010c, code lost:
    
        if (java.util.Objects.equals(r6.sampleMimeType, "video/hevc") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0110, code lost:
    
        if ((r4 & 128) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x00e6, code lost:
    
        r6 = r5.sampleSizeTable[r2.currentSampleIndex];
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01a4, code lost:
    
        r4 = r2.moovSampleTable;
        r6 = r4.track;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01aa, code lost:
    
        if (r2.currentlyInFragment != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01ac, code lost:
    
        r4 = r4.timestampsUs[r2.currentSampleIndex];
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01b9, code lost:
    
        r8 = r6.nalUnitLengthFieldLength;
        r6 = r6.f892format;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01bd, code lost:
    
        if (r8 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01bf, code lost:
    
        r14 = r31.nalPrefix;
        r15 = r14.data;
        r15[0] = 0;
        r15[1] = 0;
        r15[r19] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01cf, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01d5, code lost:
    
        if (r31.sampleBytesWritten >= r31.sampleSize) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01d7, code lost:
    
        r2 = r31.sampleCurrentNalBytesRemaining;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01d9, code lost:
    
        if (r2 != 0) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x02ad, code lost:
    
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x02b1, code lost:
    
        if (r31.processSeiNalUnitPayload == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x02b3, code lost:
    
        r8 = r31.nalUnitWithoutHeaderBuffer;
        r8.reset(r2);
        r24 = r10;
        r1.readFully(r8.data, 0, r31.sampleCurrentNalBytesRemaining);
        r9.sampleData(r31.sampleCurrentNalBytesRemaining, r8);
        r2 = r31.sampleCurrentNalBytesRemaining;
        r2 = androidx.media3.container.OpusUtil.unescapeStream(r8.limit, r8.data);
        r8.setPosition(0);
        r8.setLimit(r2);
        r2 = r6.maxNumReorderSamples;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x02dc, code lost:
    
        if (r2 != (-1)) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x02e0, code lost:
    
        if (r7.mExistingUpdateTypes == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x02e2, code lost:
    
        r7.setMaxSize(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02ed, code lost:
    
        r7.add(r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x02f9, code lost:
    
        if ((r17.getCurrentSampleFlags() & 4) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x02fb, code lost:
    
        r7.flushQueueDownToSize(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02fe, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x030a, code lost:
    
        r31.sampleBytesWritten += r2;
        r31.sampleCurrentNalBytesRemaining -= r2;
        r2 = r17;
        r8 = r20;
        r10 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x02e8, code lost:
    
        if (r7.mExistingUpdateTypes == r2) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x02ea, code lost:
    
        r7.setMaxSize(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0301, code lost:
    
        r24 = r10;
        r2 = r9.sampleData((androidx.media3.common.DataReader) r1, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01de, code lost:
    
        if (r31.ceaTrackOutputs.length > 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x01e2, code lost:
    
        if (r31.isSampleDependedOn != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x01f9, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x01fa, code lost:
    
        r1.readFully(r15, r12, r8 + r2);
        r14.setPosition(0);
        r20 = r14.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0207, code lost:
    
        if (r20 < 0) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0209, code lost:
    
        r31.sampleCurrentNalBytesRemaining = r20 - r2;
        r13 = r31.nalStartCode;
        r20 = r8;
        r13.setPosition(0);
        r9.sampleData(4, r13);
        r31.sampleBytesWritten += 4;
        r31.sampleSize += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0226, code lost:
    
        if (r31.ceaTrackOutputs.length <= 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0228, code lost:
    
        if (r2 <= 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x022a, code lost:
    
        r8 = androidx.media3.container.OpusUtil.getNalStructureMimeType(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x022e, code lost:
    
        if (r8 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0235, code lost:
    
        switch(r8.hashCode()) {
            case -1662541442: goto L125;
            case 1331836730: goto L121;
            case 1331856911: goto L117;
            default: goto L116;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0238, code lost:
    
        r8 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0258, code lost:
    
        switch(r8) {
            case 0: goto L137;
            case 1: goto L134;
            case 2: goto L131;
            default: goto L140;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0267, code lost:
    
        if (((r15[5] & 248) >> 3) != 23) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0283, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0286, code lost:
    
        r31.processSeiNalUnitPayload = r8;
        r9.sampleData(r2, r14);
        r31.sampleBytesWritten += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0290, code lost:
    
        if (r2 <= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0294, code lost:
    
        if (r31.isSampleDependedOn != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x029a, code lost:
    
        if (androidx.media3.container.OpusUtil.isDependedOn(r15, r2, r6) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x029c, code lost:
    
        r31.isSampleDependedOn = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x029f, code lost:
    
        r2 = r17;
        r8 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0271, code lost:
    
        if ((r15[4] & 31) != 6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0281, code lost:
    
        if (((r15[4] & 126) >> 1) != 39) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0241, code lost:
    
        if (r8.equals("video/vvc") != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0244, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x024b, code lost:
    
        if (r8.equals("video/avc") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x024e, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0254, code lost:
    
        if (r8.equals(r10) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0257, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0285, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02ac, code lost:
    
        throw androidx.media3.common.ParserException.createForMalformedContainer(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x01e4, code lost:
    
        r2 = androidx.media3.container.OpusUtil.numberOfBytesInNalUnitHeader(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x01f4, code lost:
    
        if ((r8 + r2) > (r31.sampleSize - r31.sampleBytesWritten)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x01f6, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0330, code lost:
    
        r1 = r17.getCurrentSampleFlags();
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0336, code lost:
    
        if (r31.isSampleDependedOn != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0338, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x033b, code lost:
    
        r12 = r1;
        r1 = r17.getEncryptionBoxIfEncrypted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0340, code lost:
    
        if (r1 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0342, code lost:
    
        r15 = r1.cryptoData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0347, code lost:
    
        r10 = r4;
        r9.sampleMetadata(r10, r12, r31.sampleSize, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0352, code lost:
    
        if (r3.isEmpty() != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0354, code lost:
    
        r1 = (androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo) r3.removeFirst();
        r31.pendingMetadataSampleBytes -= r1.size;
        r4 = r1.sampleTimeUs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0365, code lost:
    
        if (r1.sampleTimeIsRelative == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0367, code lost:
    
        r4 = r4 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0368, code lost:
    
        r25 = r4;
        r2 = r31.emsgTrackOutputs;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x036e, code lost:
    
        if (r5 >= r4) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0370, code lost:
    
        r2[r5].sampleMetadata(r25, 1, r1.size, r31.pendingMetadataSampleBytes, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0388, code lost:
    
        if (r17.next() != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x038a, code lost:
    
        r31.currentTrackBundle = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x038d, code lost:
    
        r31.parserState = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0390, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0346, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x031c, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x031e, code lost:
    
        r2 = r31.sampleBytesWritten;
        r6 = r31.sampleSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0322, code lost:
    
        if (r2 >= r6) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0324, code lost:
    
        r31.sampleBytesWritten += r9.sampleData((androidx.media3.common.DataReader) r1, r6 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x01b3, code lost:
    
        r4 = r5.samplePresentationTimesUs[r2.currentSampleIndex];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        char c;
        int i;
        int i2;
        int i3;
        String readNullTerminatedString;
        String readNullTerminatedString2;
        long scaleLargeValue;
        long readUnsignedInt;
        long j;
        long j2;
        int i4;
        ExtractorInput extractorInput2 = extractorInput;
        while (true) {
            int i5 = this.parserState;
            ArrayDeque arrayDeque = this.containerAtoms;
            AdapterHelper adapterHelper = this.reorderingBufferQueue;
            ParsableByteArray parsableByteArray = this.scratch;
            ChunkIndexMerger chunkIndexMerger = this.chunkIndexMerger;
            SparseArray sparseArray = this.trackBundles;
            int i6 = 1;
            if (i5 != 0) {
                ArrayDeque arrayDeque2 = this.pendingMetadataSampleInfos;
                int i7 = this.flags;
                if (i5 != 1) {
                    long j3 = Long.MAX_VALUE;
                    if (i5 != 2) {
                        TrackBundle trackBundle = this.currentTrackBundle;
                        if (trackBundle != null) {
                            c = 2;
                            i = 1;
                            i2 = 8;
                            i3 = 0;
                            break;
                        }
                        int size = sparseArray.size();
                        c = 2;
                        TrackBundle trackBundle2 = null;
                        int i8 = 0;
                        while (i8 < size) {
                            TrackBundle trackBundle3 = (TrackBundle) sparseArray.valueAt(i8);
                            boolean z = trackBundle3.currentlyInFragment;
                            int i9 = i6;
                            TrackFragment trackFragment = trackBundle3.fragment;
                            if ((z || trackBundle3.currentSampleIndex != trackBundle3.moovSampleTable.sampleCount) && (!z || trackBundle3.currentTrackRunIndex != trackFragment.trunCount)) {
                                long j4 = !z ? trackBundle3.moovSampleTable.offsets[trackBundle3.currentSampleIndex] : trackFragment.trunDataPosition[trackBundle3.currentTrackRunIndex];
                                if (j4 < j3) {
                                    j3 = j4;
                                    trackBundle2 = trackBundle3;
                                }
                            }
                            i8++;
                            i6 = i9;
                        }
                        i = i6;
                        i2 = 8;
                        i3 = 0;
                        if (trackBundle2 == null) {
                            int position = (int) (this.endOfMdatPosition - extractorInput2.getPosition());
                            if (position < 0) {
                                throw ParserException.createForMalformedContainer(null, "Offset to end of mdat was negative.");
                            }
                            extractorInput2.skipFully(position);
                            enterReadingAtomHeaderState();
                        } else {
                            int position2 = (int) ((!trackBundle2.currentlyInFragment ? trackBundle2.moovSampleTable.offsets[trackBundle2.currentSampleIndex] : trackBundle2.fragment.trunDataPosition[trackBundle2.currentTrackRunIndex]) - extractorInput2.getPosition());
                            if (position2 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            extractorInput2.skipFully(position2);
                            this.currentTrackBundle = trackBundle2;
                            trackBundle = trackBundle2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        TrackBundle trackBundle4 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            TrackFragment trackFragment2 = ((TrackBundle) sparseArray.valueAt(i10)).fragment;
                            if (trackFragment2.sampleEncryptionDataNeedsFill) {
                                long j5 = trackFragment2.auxiliaryDataPosition;
                                if (j5 < j3) {
                                    trackBundle4 = (TrackBundle) sparseArray.valueAt(i10);
                                    j3 = j5;
                                }
                            }
                        }
                        if (trackBundle4 == null) {
                            this.parserState = 3;
                        } else {
                            int position3 = (int) (j3 - extractorInput2.getPosition());
                            if (position3 < 0) {
                                throw ParserException.createForMalformedContainer(null, "Offset to encryption data was negative.");
                            }
                            extractorInput2.skipFully(position3);
                            TrackFragment trackFragment3 = trackBundle4.fragment;
                            ParsableByteArray parsableByteArray2 = trackFragment3.sampleEncryptionData;
                            extractorInput2.readFully(parsableByteArray2.data, 0, parsableByteArray2.limit);
                            parsableByteArray2.setPosition(0);
                            trackFragment3.sampleEncryptionDataNeedsFill = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.atomSize - this.atomHeaderBytesRead);
                    ParsableByteArray parsableByteArray3 = this.atomData;
                    if (parsableByteArray3 != null) {
                        extractorInput2.readFully(parsableByteArray3.data, 8, i11);
                        int i12 = this.atomType;
                        Mp4Box$LeafBox mp4Box$LeafBox = new Mp4Box$LeafBox(i12, parsableByteArray3);
                        if (!arrayDeque.isEmpty()) {
                            ((Mp4Box$ContainerBox) arrayDeque.peek()).leafChildren.add(mp4Box$LeafBox);
                        } else if (i12 == 1936286840) {
                            Pair parseSidx = parseSidx(extractorInput2.getPosition(), parsableByteArray3);
                            chunkIndexMerger.add((ChunkIndex) parseSidx.second);
                            LinkedHashMap linkedHashMap = chunkIndexMerger.chunkMap;
                            this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
                            if (this.upfrontSidxScanComplete) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                                this.extractorOutput.seekMap(linkedHashMap.size() == 1 ? (SeekMap) parseSidx.second : chunkIndexMerger.merge());
                                this.haveOutputSeekMap = true;
                            }
                            if ((i7 & 256) != 0 && !this.upfrontSidxScanComplete && linkedHashMap.size() > i4) {
                                this.seekPositionBeforeSidxProcessing = extractorInput2.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.emsgTrackOutputs.length != 0) {
                            parsableByteArray3.setPosition(8);
                            int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray3.readInt());
                            long j6 = -9223372036854775807L;
                            if (parseFullBoxVersion == 0) {
                                readNullTerminatedString = parsableByteArray3.readNullTerminatedString();
                                readNullTerminatedString.getClass();
                                readNullTerminatedString2 = parsableByteArray3.readNullTerminatedString();
                                readNullTerminatedString2.getClass();
                                long readUnsignedInt2 = parsableByteArray3.readUnsignedInt();
                                long readUnsignedInt3 = parsableByteArray3.readUnsignedInt();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long scaleLargeValue2 = Util.scaleLargeValue(readUnsignedInt3, 1000000L, readUnsignedInt2, roundingMode);
                                long j7 = this.segmentIndexEarliestPresentationTimeUs;
                                long j8 = j7 != -9223372036854775807L ? j7 + scaleLargeValue2 : -9223372036854775807L;
                                scaleLargeValue = Util.scaleLargeValue(parsableByteArray3.readUnsignedInt(), 1000L, readUnsignedInt2, roundingMode);
                                readUnsignedInt = parsableByteArray3.readUnsignedInt();
                                j = -9223372036854775807L;
                                j6 = scaleLargeValue2;
                                j2 = j8;
                            } else if (parseFullBoxVersion != 1) {
                                Fragment$5$$ExternalSyntheticOutline0.m(parseFullBoxVersion, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long readUnsignedInt4 = parsableByteArray3.readUnsignedInt();
                                long readUnsignedLongToLong = parsableByteArray3.readUnsignedLongToLong();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long scaleLargeValue3 = Util.scaleLargeValue(readUnsignedLongToLong, 1000000L, readUnsignedInt4, roundingMode2);
                                scaleLargeValue = Util.scaleLargeValue(parsableByteArray3.readUnsignedInt(), 1000L, readUnsignedInt4, roundingMode2);
                                readUnsignedInt = parsableByteArray3.readUnsignedInt();
                                readNullTerminatedString = parsableByteArray3.readNullTerminatedString();
                                readNullTerminatedString.getClass();
                                readNullTerminatedString2 = parsableByteArray3.readNullTerminatedString();
                                readNullTerminatedString2.getClass();
                                j2 = scaleLargeValue3;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[parsableByteArray3.bytesLeft()];
                            long j9 = j;
                            parsableByteArray3.readBytes(0, parsableByteArray3.bytesLeft(), bArr);
                            CallResult callResult = this.eventMessageEncoder;
                            DataOutputStream dataOutputStream = (DataOutputStream) callResult.serviceNames;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) callResult.result;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(readNullTerminatedString);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(readNullTerminatedString2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(scaleLargeValue);
                                dataOutputStream.writeLong(readUnsignedInt);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                ParsableByteArray parsableByteArray4 = new ParsableByteArray(byteArrayOutputStream.toByteArray());
                                int bytesLeft = parsableByteArray4.bytesLeft();
                                for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                                    parsableByteArray4.setPosition(0);
                                    trackOutput.sampleData(bytesLeft, parsableByteArray4);
                                }
                                if (j2 == j9) {
                                    arrayDeque2.addLast(new MetadataSampleInfo(j6, bytesLeft, true));
                                    this.pendingMetadataSampleBytes += bytesLeft;
                                } else if (arrayDeque2.isEmpty()) {
                                    for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
                                        trackOutput2.sampleMetadata(j2, 1, bytesLeft, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new MetadataSampleInfo(j2, bytesLeft, false));
                                    this.pendingMetadataSampleBytes += bytesLeft;
                                }
                            } catch (IOException e) {
                                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                                return 0;
                            }
                        }
                        extractorInput2 = extractorInput;
                    } else {
                        extractorInput2.skipFully(i11);
                    }
                    processAtomEnded(extractorInput2.getPosition());
                }
            } else {
                int i13 = this.atomHeaderBytesRead;
                ParsableByteArray parsableByteArray5 = this.atomHeader;
                if (i13 == 0) {
                    if (!extractorInput2.readFully(parsableByteArray5.data, 0, 8, true)) {
                        long j10 = this.seekPositionBeforeSidxProcessing;
                        if (j10 == -1) {
                            adapterHelper.flushQueueDownToSize(0);
                            return -1;
                        }
                        iadFrame.b = j10;
                        this.seekPositionBeforeSidxProcessing = -1L;
                        this.extractorOutput.seekMap(chunkIndexMerger.merge());
                        this.upfrontSidxScanComplete = true;
                        return 1;
                    }
                    this.atomHeaderBytesRead = 8;
                    parsableByteArray5.setPosition(0);
                    this.atomSize = parsableByteArray5.readUnsignedInt();
                    this.atomType = parsableByteArray5.readInt();
                }
                long j11 = this.atomSize;
                if (j11 == 1) {
                    extractorInput2.readFully(parsableByteArray5.data, 8, 8);
                    this.atomHeaderBytesRead += 8;
                    this.atomSize = parsableByteArray5.readUnsignedLongToLong();
                } else if (j11 == 0) {
                    long length = extractorInput2.getLength();
                    if (length == -1 && !arrayDeque.isEmpty()) {
                        length = ((Mp4Box$ContainerBox) arrayDeque.peek()).endPosition;
                    }
                    if (length != -1) {
                        this.atomSize = (length - extractorInput2.getPosition()) + this.atomHeaderBytesRead;
                    }
                }
                long j12 = this.atomSize;
                int i14 = this.atomHeaderBytesRead;
                long j13 = i14;
                if (j12 < j13) {
                    if (this.atomType != 1718773093 || i14 != 8) {
                        break;
                    }
                    this.atomSize = j13;
                }
                if (this.seekPositionBeforeSidxProcessing != -1) {
                    int i15 = this.atomType;
                    long j14 = this.atomSize;
                    if (i15 == 1936286840) {
                        parsableByteArray.reset((int) j14);
                        System.arraycopy(parsableByteArray5.data, 0, parsableByteArray.data, 0, 8);
                        extractorInput2.readFully(parsableByteArray.data, 8, (int) (this.atomSize - this.atomHeaderBytesRead));
                        chunkIndexMerger.add((ChunkIndex) parseSidx(extractorInput2.getPeekPosition(), parsableByteArray).second);
                    } else {
                        extractorInput2.skipFully((int) (j14 - j13), true);
                    }
                    enterReadingAtomHeaderState();
                } else {
                    long position4 = extractorInput2.getPosition() - this.atomHeaderBytesRead;
                    int i16 = this.atomType;
                    if ((i16 == 1836019558 || i16 == 1835295092) && !this.haveOutputSeekMap) {
                        this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position4));
                        this.haveOutputSeekMap = true;
                    }
                    if (this.atomType == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            TrackFragment trackFragment4 = ((TrackBundle) sparseArray.valueAt(i17)).fragment;
                            trackFragment4.getClass();
                            trackFragment4.auxiliaryDataPosition = position4;
                            trackFragment4.dataPosition = position4;
                        }
                    }
                    int i18 = this.atomType;
                    if (i18 == 1835295092) {
                        this.currentTrackBundle = null;
                        this.endOfMdatPosition = position4 + this.atomSize;
                        this.parserState = 2;
                    } else if (i18 == 1836019574 || i18 == 1953653099 || i18 == 1835297121 || i18 == 1835626086 || i18 == 1937007212 || i18 == 1836019558 || i18 == 1953653094 || i18 == 1836475768 || i18 == 1701082227 || i18 == 1835365473) {
                        long position5 = extractorInput2.getPosition();
                        long j15 = this.atomSize;
                        long j16 = (position5 + j15) - 8;
                        if (j15 != this.atomHeaderBytesRead && this.atomType == 1835365473) {
                            parsableByteArray.reset(8);
                            extractorInput2.peekFully(0, 8, parsableByteArray.data);
                            BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
                            extractorInput2.skipFully(parsableByteArray.position);
                            extractorInput2.resetPeekPosition();
                        }
                        arrayDeque.push(new Mp4Box$ContainerBox(this.atomType, j16));
                        if (this.atomSize == this.atomHeaderBytesRead) {
                            processAtomEnded(j16);
                        } else {
                            enterReadingAtomHeaderState();
                        }
                    } else if (i18 == 1751411826 || i18 == 1835296868 || i18 == 1836476516 || i18 == 1936286840 || i18 == 1937011556 || i18 == 1937011827 || i18 == 1668576371 || i18 == 1937011555 || i18 == 1937011578 || i18 == 1937013298 || i18 == 1937007471 || i18 == 1668232756 || i18 == 1937011571 || i18 == 1952867444 || i18 == 1952868452 || i18 == 1953196132 || i18 == 1953654136 || i18 == 1953658222 || i18 == 1886614376 || i18 == 1935763834 || i18 == 1935763823 || i18 == 1936027235 || i18 == 1970628964 || i18 == 1935828848 || i18 == 1936158820 || i18 == 1701606260 || i18 == 1835362404 || i18 == 1701671783 || i18 == 1969517665 || i18 == 1801812339 || i18 == 1768715124) {
                        if (this.atomHeaderBytesRead != 8) {
                            throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.atomSize > 2147483647L) {
                            throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        ParsableByteArray parsableByteArray6 = new ParsableByteArray((int) this.atomSize);
                        System.arraycopy(parsableByteArray5.data, 0, parsableByteArray6.data, 0, 8);
                        this.atomData = parsableByteArray6;
                        this.parserState = 1;
                    } else {
                        if (this.atomSize > 2147483647L) {
                            throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.atomData = null;
                        this.parserState = 1;
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.trackBundles;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((TrackBundle) sparseArray.valueAt(i)).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        ((PriorityQueue) this.reorderingBufferQueue.mCallback).clear();
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        RegularImmutableList regularImmutableList;
        SniffFailure sniffInternal = Sniffer.sniffInternal(extractorInput, true, false);
        if (sniffInternal != null) {
            regularImmutableList = ImmutableList.of((Object) sniffInternal);
        } else {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            regularImmutableList = RegularImmutableList.EMPTY;
        }
        this.lastSniffFailures = regularImmutableList;
        return sniffInternal == null;
    }
}
