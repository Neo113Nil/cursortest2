package androidx.media3.extractor.mp4;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box$ContainerBox;
import androidx.media3.container.Mp4Box$LeafBox;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.MpegAudioUtil$Header;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.ThumbnailMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.mp4.SefReader;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class Mp4Extractor implements Extractor {
    public long[][] accumulatedSampleSizes;
    public ParsableByteArray atomData;
    public final ParsableByteArray atomHeader;
    public int atomHeaderBytesRead;
    public long atomSize;
    public int atomType;
    public long axteAtomOffset;
    public final ArrayDeque containerAtoms;
    public ExtractorOutput extractorOutput;
    public int fileType;
    public final int flags;
    public boolean isSampleDependedOn;
    public RegularImmutableList lastSniffFailures;
    public boolean moovAtomProcessed;
    public MotionPhotoMetadata motionPhotoMetadata;
    public final ParsableByteArray nalPrefix;
    public final ParsableByteArray nalStartCode;
    public final boolean omitTrackSampleTable;
    public int parserState;
    public boolean readingAuxiliaryTracks;
    public int sampleBytesRead;
    public int sampleBytesWritten;
    public int sampleCurrentNalBytesRemaining;
    public long sampleOffsetForAuxiliaryTracks;
    public int sampleTrackIndex;
    public final ParsableByteArray scratch;
    public boolean seekToAxteAtom;
    public boolean seenFtypAtom;
    public final SefReader sefReader;
    public final ArrayList slowMotionMetadataEntries;
    public final SubtitleParser.Factory subtitleParserFactory;
    public Mp4Track[] tracks;

    public final class Mp4SeekMap implements SeekMap {
        public final long durationUs;
        public final int firstVideoTrackIndex;
        public final Mp4Track[] tracks;

        public Mp4SeekMap(long j, Mp4Track[] mp4TrackArr, int i) {
            this.durationUs = j;
            this.tracks = mp4TrackArr;
            this.firstVideoTrackIndex = i;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            return this.durationUs;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
        @Override // androidx.media3.extractor.SeekMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            long j2;
            long j3;
            long j4;
            long j5;
            int i;
            int indexOfLaterOrEqualSynchronizationSample;
            Mp4Track[] mp4TrackArr = this.tracks;
            int length = mp4TrackArr.length;
            SeekPoint seekPoint = SeekPoint.START;
            if (length == 0) {
                return new SeekMap.SeekPoints(seekPoint, seekPoint);
            }
            int i2 = this.firstVideoTrackIndex;
            if (i2 != -1) {
                TrackSampleTable trackSampleTable = mp4TrackArr[i2].sampleTable;
                int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
                if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                    indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j);
                }
                long[] jArr = trackSampleTable.offsets;
                long[] jArr2 = trackSampleTable.timestampsUs;
                if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                    return new SeekMap.SeekPoints(seekPoint, seekPoint);
                }
                j3 = jArr2[indexOfEarlierOrEqualSynchronizationSample];
                j2 = jArr[indexOfEarlierOrEqualSynchronizationSample];
                if (j3 < j && indexOfEarlierOrEqualSynchronizationSample < trackSampleTable.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j)) != -1 && indexOfLaterOrEqualSynchronizationSample != indexOfEarlierOrEqualSynchronizationSample) {
                    j5 = jArr2[indexOfLaterOrEqualSynchronizationSample];
                    j4 = jArr[indexOfLaterOrEqualSynchronizationSample];
                    long j6 = j2;
                    for (i = 0; i < mp4TrackArr.length; i++) {
                        if (i != i2) {
                            TrackSampleTable trackSampleTable2 = mp4TrackArr[i].sampleTable;
                            long[] jArr3 = trackSampleTable2.offsets;
                            int indexOfEarlierOrEqualSynchronizationSample2 = trackSampleTable2.getIndexOfEarlierOrEqualSynchronizationSample(j3);
                            if (indexOfEarlierOrEqualSynchronizationSample2 == -1) {
                                indexOfEarlierOrEqualSynchronizationSample2 = trackSampleTable2.getIndexOfLaterOrEqualSynchronizationSample(j3);
                            }
                            if (indexOfEarlierOrEqualSynchronizationSample2 != -1) {
                                j6 = Math.min(jArr3[indexOfEarlierOrEqualSynchronizationSample2], j6);
                            }
                            if (j5 != -9223372036854775807L) {
                                int indexOfEarlierOrEqualSynchronizationSample3 = trackSampleTable2.getIndexOfEarlierOrEqualSynchronizationSample(j5);
                                if (indexOfEarlierOrEqualSynchronizationSample3 == -1) {
                                    indexOfEarlierOrEqualSynchronizationSample3 = trackSampleTable2.getIndexOfLaterOrEqualSynchronizationSample(j5);
                                }
                                if (indexOfEarlierOrEqualSynchronizationSample3 != -1) {
                                    j4 = Math.min(jArr3[indexOfEarlierOrEqualSynchronizationSample3], j4);
                                }
                            }
                        }
                    }
                    SeekPoint seekPoint2 = new SeekPoint(j3, j6);
                    return j5 != -9223372036854775807L ? new SeekMap.SeekPoints(seekPoint2, seekPoint2) : new SeekMap.SeekPoints(seekPoint2, new SeekPoint(j5, j4));
                }
            } else {
                j2 = Long.MAX_VALUE;
                j3 = j;
            }
            j4 = -1;
            j5 = -9223372036854775807L;
            long j62 = j2;
            while (i < mp4TrackArr.length) {
            }
            SeekPoint seekPoint22 = new SeekPoint(j3, j62);
            if (j5 != -9223372036854775807L) {
            }
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public final class Mp4Track {
        public Format pendingFormat;
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = "audio/true-hd".equals(track.f892format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i) {
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.omitTrackSampleTable = (i & 256) != 0;
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        this.lastSniffFailures = RegularImmutableList.EMPTY;
        this.parserState = (i & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque();
        this.nalStartCode = new ParsableByteArray(OpusUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public final List getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new Response(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0123, code lost:
    
        if (((androidx.media3.container.MdtaMetadataEntry) r13).key.equals("auxiliary.tracks.offset") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (((androidx.media3.container.MdtaMetadataEntry) r12).key.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (((androidx.media3.container.MdtaMetadataEntry) r12).key.equals("auxiliary.tracks.map") != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void processAtomEnded$1(long j) {
        int i;
        ArrayList arrayList;
        Metadata metadata;
        boolean z;
        ArrayDeque arrayDeque;
        boolean z2;
        Metadata metadata2;
        Metadata metadata3;
        boolean z3;
        long[][] jArr;
        ArrayList arrayList2;
        String str;
        boolean z4;
        ArrayList arrayList3;
        int i2;
        long j2;
        int i3;
        Metadata metadata4;
        Metadata metadata5;
        Metadata metadata6;
        ArrayList arrayList4;
        int i4;
        int i5;
        int i6;
        int i7;
        Metadata.Entry entry;
        Metadata.Entry entry2;
        Metadata.Entry entry3;
        int i8;
        while (true) {
            ArrayDeque arrayDeque2 = this.containerAtoms;
            int i9 = 0;
            if (arrayDeque2.isEmpty() || ((Mp4Box$ContainerBox) arrayDeque2.peek()).endPosition != j) {
                break;
            }
            Mp4Box$ContainerBox mp4Box$ContainerBox = (Mp4Box$ContainerBox) arrayDeque2.pop();
            if (mp4Box$ContainerBox.flags == 1836019574) {
                Mp4Box$ContainerBox containerBoxOfType = mp4Box$ContainerBox.getContainerBoxOfType(1835365473);
                ArrayList arrayList5 = new ArrayList();
                boolean z5 = this.omitTrackSampleTable;
                long j3 = 0;
                int i10 = this.flags;
                if (containerBoxOfType != null) {
                    metadata = BoxParser.parseMdtaFromMeta(containerBoxOfType);
                    if (this.readingAuxiliaryTracks) {
                        metadata.getClass();
                        Metadata.Entry[] entryArr = metadata.entries;
                        int length = entryArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                entry2 = null;
                                break;
                            }
                            Metadata.Entry entry4 = entryArr[i11];
                            if (MdtaMetadataEntry.class.isAssignableFrom(entry4.getClass())) {
                                entry2 = (Metadata.Entry) MdtaMetadataEntry.class.cast(entry4);
                            }
                            entry2 = null;
                            if (entry2 != null) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry2;
                        if (mdtaMetadataEntry != null && mdtaMetadataEntry.value[0] == 0) {
                            this.sampleOffsetForAuxiliaryTracks = this.axteAtomOffset + 16;
                        }
                        int length2 = entryArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length2) {
                                entry3 = null;
                                break;
                            }
                            Metadata.Entry entry5 = entryArr[i12];
                            if (MdtaMetadataEntry.class.isAssignableFrom(entry5.getClass())) {
                                entry3 = (Metadata.Entry) MdtaMetadataEntry.class.cast(entry5);
                            }
                            entry3 = null;
                            if (entry3 != null) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry3;
                        mdtaMetadataEntry2.getClass();
                        ArrayList auxiliaryTrackTypesFromMap = mdtaMetadataEntry2.getAuxiliaryTrackTypesFromMap();
                        ArrayList arrayList6 = new ArrayList(auxiliaryTrackTypesFromMap.size());
                        for (int i13 = 0; i13 < auxiliaryTrackTypesFromMap.size(); i13++) {
                            int intValue = ((Integer) auxiliaryTrackTypesFromMap.get(i13)).intValue();
                            if (intValue == 0) {
                                i8 = 1;
                            } else if (intValue != 1) {
                                i8 = 3;
                                if (intValue != 2) {
                                    i8 = intValue != 3 ? 0 : 4;
                                }
                            } else {
                                i8 = 2;
                            }
                            arrayList6.add(Integer.valueOf(i8));
                        }
                        i = 0;
                        arrayList = arrayList6;
                    } else {
                        if (metadata == null || (i10 & 64) == 0) {
                            i = 0;
                        } else {
                            Metadata.Entry[] entryArr2 = metadata.entries;
                            int length3 = entryArr2.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    i = i9;
                                    entry = null;
                                    break;
                                }
                                Metadata.Entry entry6 = entryArr2[i14];
                                if (MdtaMetadataEntry.class.isAssignableFrom(entry6.getClass())) {
                                    entry = (Metadata.Entry) MdtaMetadataEntry.class.cast(entry6);
                                    i = i9;
                                } else {
                                    i = i9;
                                }
                                entry = null;
                                if (entry != null) {
                                    break;
                                }
                                i14++;
                                i9 = i;
                            }
                            MdtaMetadataEntry mdtaMetadataEntry3 = (MdtaMetadataEntry) entry;
                            if (mdtaMetadataEntry3 != null) {
                                long readUnsignedLongToLong = new ParsableByteArray(mdtaMetadataEntry3.value).readUnsignedLongToLong();
                                if (readUnsignedLongToLong > 0) {
                                    this.axteAtomOffset = readUnsignedLongToLong;
                                    this.seekToAxteAtom = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z5;
                                    arrayDeque.clear();
                                    this.moovAtomProcessed = z2;
                                    if (!this.seekToAxteAtom && !z) {
                                        this.parserState = 2;
                                    }
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList5;
                    metadata = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z6 = this.fileType == 1 ? 1 : i;
                GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
                Mp4Box$LeafBox leafBoxOfType = mp4Box$ContainerBox.getLeafBoxOfType(1969517665);
                if (leafBoxOfType != null) {
                    metadata2 = BoxParser.parseUdta(leafBoxOfType);
                    gaplessInfoHolder.setFromMetadata(metadata2);
                } else {
                    metadata2 = null;
                }
                Mp4Box$LeafBox leafBoxOfType2 = mp4Box$ContainerBox.getLeafBoxOfType(1836476516);
                leafBoxOfType2.getClass();
                Metadata.Entry[] entryArr3 = new Metadata.Entry[1];
                entryArr3[i] = BoxParser.parseMvhd(leafBoxOfType2.data);
                Metadata metadata7 = new Metadata(entryArr3);
                if ((i10 & 1) != 0) {
                    metadata3 = metadata7;
                    z3 = 1;
                } else {
                    metadata3 = metadata7;
                    z3 = i;
                }
                Metadata metadata8 = metadata3;
                Metadata metadata9 = metadata2;
                ArrayList parseTraks = BoxParser.parseTraks(mp4Box$ContainerBox, gaplessInfoHolder, -9223372036854775807L, null, z3, z6, new Format$$ExternalSyntheticLambda1(9), this.omitTrackSampleTable);
                if (this.readingAuxiliaryTracks) {
                    boolean z7 = arrayList.size() == parseTraks.size() ? 1 : i;
                    Locale locale = Locale.US;
                    Trace.checkState(Recorder$$ExternalSyntheticOutline2.m(arrayList.size(), parseTraks.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z7);
                }
                String containerMimeType = Sniffer.getContainerMimeType(parseTraks);
                int i15 = i;
                int i16 = i15;
                long j4 = -9223372036854775807L;
                int i17 = -1;
                while (i15 < parseTraks.size()) {
                    TrackSampleTable trackSampleTable = (TrackSampleTable) parseTraks.get(i15);
                    int i18 = trackSampleTable.sampleCount;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    long[] jArr2 = trackSampleTable.timestampsUs;
                    Track track = trackSampleTable.track;
                    if (i18 == 0) {
                        arrayList3 = arrayList;
                        arrayList2 = parseTraks;
                        str = containerMimeType;
                        i2 = i15;
                        arrayList4 = arrayList7;
                        z4 = z5;
                        metadata5 = metadata9;
                        metadata6 = metadata8;
                    } else {
                        arrayList2 = parseTraks;
                        str = containerMimeType;
                        ExtractorOutput extractorOutput = this.extractorOutput;
                        int i19 = i16 + 1;
                        z4 = z5;
                        int i20 = track.f893type;
                        ArrayList arrayList8 = arrayList7;
                        Format format2 = track.f892format;
                        TrackOutput track2 = extractorOutput.track(i16, i20);
                        Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, track2);
                        long j5 = track.durationUs;
                        if (j5 == -9223372036854775807L) {
                            j5 = trackSampleTable.durationUs;
                        }
                        track2.durationUs(j5);
                        long max = Math.max(j4, j5);
                        String str2 = format2.sampleMimeType;
                        String str3 = format2.sampleMimeType;
                        boolean equals = "audio/true-hd".equals(str2);
                        int i21 = trackSampleTable.maximumSize;
                        int i22 = equals ? i21 * 16 : i21 + 30;
                        Format.Builder buildUpon = format2.buildUpon();
                        buildUpon.maxInputSize = i22;
                        if (i20 == 2) {
                            int i23 = format2.roleFlags;
                            if ((i10 & 8) != 0) {
                                i23 |= i17 == -1 ? 1 : 2;
                            }
                            int i24 = i23;
                            if (this.readingAuxiliaryTracks) {
                                i7 = i24 | 32768;
                                arrayList3 = arrayList;
                                buildUpon.auxiliaryTrackType = ((Integer) arrayList.get(i15)).intValue();
                            } else {
                                arrayList3 = arrayList;
                                i7 = i24;
                            }
                            buildUpon.roleFlags = i7;
                        } else {
                            arrayList3 = arrayList;
                        }
                        int[] iArr = trackSampleTable.syncSampleIndices;
                        boolean z8 = trackSampleTable.hasOnlySyncSamples;
                        if (!MimeTypes.isVideo(str3) || jArr2.length <= 0) {
                            i2 = i15;
                        } else {
                            int min = Math.min(z8 ? trackSampleTable.sampleCount : iArr.length, 20);
                            Trace.checkState(j5 != -9223372036854775807L ? 1 : i);
                            i2 = i15;
                            long min2 = Math.min(j5, 10000000L);
                            int i25 = i;
                            int i26 = i25;
                            int i27 = -1;
                            while (i25 < min) {
                                int i28 = z8 ? i25 : iArr[i25];
                                long j6 = jArr2[i28];
                                if (j6 > min2) {
                                    break;
                                }
                                if (j6 >= 0) {
                                    i6 = min;
                                    int i29 = trackSampleTable.sizes[i28];
                                    if (i29 > i26) {
                                        i26 = i29;
                                        i27 = i28;
                                    }
                                } else {
                                    i6 = min;
                                }
                                i25++;
                                min = i6;
                            }
                            if (i27 != -1) {
                                j2 = jArr2[i27];
                                if (j2 == -9223372036854775807L) {
                                    ThumbnailMetadata thumbnailMetadata = new ThumbnailMetadata(j2);
                                    i3 = 1;
                                    Metadata.Entry[] entryArr4 = new Metadata.Entry[1];
                                    entryArr4[i] = thumbnailMetadata;
                                    metadata4 = new Metadata(entryArr4);
                                } else {
                                    i3 = 1;
                                    metadata4 = null;
                                }
                                if (i20 == i3 && (i4 = gaplessInfoHolder.encoderDelay) != -1 && (i5 = gaplessInfoHolder.encoderPadding) != -1) {
                                    buildUpon.encoderDelay = i4;
                                    buildUpon.encoderPadding = i5;
                                }
                                Metadata metadata10 = format2.metadata;
                                ArrayList arrayList9 = this.slowMotionMetadataEntries;
                                Metadata metadata11 = !arrayList9.isEmpty() ? null : new Metadata(arrayList9);
                                metadata5 = metadata9;
                                metadata6 = metadata8;
                                Sniffer.setFormatMetadata(i20, metadata, buildUpon, metadata10, metadata11, metadata5, metadata6, metadata4);
                                buildUpon.containerMimeType = MimeTypes.normalizeMimeType(str);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    NavAction$$ExternalSyntheticOutline0.m(buildUpon, mp4Track.trackOutput);
                                } else {
                                    mp4Track.pendingFormat = new Format(buildUpon);
                                }
                                if (i20 == 2 && i17 == -1) {
                                    i17 = arrayList8.size();
                                }
                                arrayList4 = arrayList8;
                                arrayList4.add(mp4Track);
                                i16 = i19;
                                j4 = max;
                            }
                        }
                        j2 = -9223372036854775807L;
                        if (j2 == -9223372036854775807L) {
                        }
                        if (i20 == i3) {
                            buildUpon.encoderDelay = i4;
                            buildUpon.encoderPadding = i5;
                        }
                        Metadata metadata102 = format2.metadata;
                        ArrayList arrayList92 = this.slowMotionMetadataEntries;
                        if (!arrayList92.isEmpty()) {
                        }
                        metadata5 = metadata9;
                        metadata6 = metadata8;
                        Sniffer.setFormatMetadata(i20, metadata, buildUpon, metadata102, metadata11, metadata5, metadata6, metadata4);
                        buildUpon.containerMimeType = MimeTypes.normalizeMimeType(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                        }
                        if (i20 == 2) {
                            i17 = arrayList8.size();
                        }
                        arrayList4 = arrayList8;
                        arrayList4.add(mp4Track);
                        i16 = i19;
                        j4 = max;
                    }
                    arrayList7 = arrayList4;
                    metadata9 = metadata5;
                    metadata8 = metadata6;
                    arrayDeque2 = arrayDeque3;
                    parseTraks = arrayList2;
                    z5 = z4;
                    arrayList = arrayList3;
                    i15 = i2 + 1;
                    containerMimeType = str;
                }
                arrayDeque = arrayDeque2;
                z = z5;
                int i30 = -1;
                boolean z9 = true;
                Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList7.toArray(new Mp4Track[i]);
                this.tracks = mp4TrackArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[mp4TrackArr.length][];
                    int[] iArr2 = new int[mp4TrackArr.length];
                    long[] jArr3 = new long[mp4TrackArr.length];
                    boolean[] zArr = new boolean[mp4TrackArr.length];
                    for (int i31 = 0; i31 < mp4TrackArr.length; i31++) {
                        jArr[i31] = new long[mp4TrackArr[i31].sampleTable.sampleCount];
                        jArr3[i31] = mp4TrackArr[i31].sampleTable.timestampsUs[0];
                    }
                    int i32 = 0;
                    while (i32 < mp4TrackArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i33 = i30;
                        for (int i34 = 0; i34 < mp4TrackArr.length; i34++) {
                            if (!zArr[i34]) {
                                long j8 = jArr3[i34];
                                if (j8 <= j7) {
                                    i33 = i34;
                                    j7 = j8;
                                }
                            }
                        }
                        int i35 = iArr2[i33];
                        long[] jArr4 = jArr[i33];
                        jArr4[i35] = j3;
                        TrackSampleTable trackSampleTable2 = mp4TrackArr[i33].sampleTable;
                        boolean z10 = z9;
                        int[] iArr3 = iArr2;
                        j3 += trackSampleTable2.sizes[i35];
                        int i36 = i35 + 1;
                        iArr3[i33] = i36;
                        if (i36 < jArr4.length) {
                            jArr3[i33] = trackSampleTable2.timestampsUs[i36];
                        } else {
                            zArr[i33] = z10;
                            i32++;
                        }
                        iArr2 = iArr3;
                        z9 = z10;
                        i30 = -1;
                    }
                }
                z2 = z9;
                this.accumulatedSampleSizes = jArr;
                this.extractorOutput.endTracks();
                this.extractorOutput.seekMap(new Mp4SeekMap(j4, this.tracks, i17));
                arrayDeque.clear();
                this.moovAtomProcessed = z2;
                if (!this.seekToAxteAtom) {
                    this.parserState = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((Mp4Box$ContainerBox) arrayDeque2.peek()).containerChildren.add(mp4Box$ContainerBox);
            }
        }
        if (this.parserState != 2) {
            this.parserState = 0;
            this.atomHeaderBytesRead = 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0655, code lost:
    
        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0581  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        boolean z;
        boolean z2;
        Mp4Box$ContainerBox mp4Box$ContainerBox;
        if (!this.omitTrackSampleTable || !this.moovAtomProcessed) {
            while (true) {
                int i6 = this.parserState;
                ArrayDeque arrayDeque = this.containerAtoms;
                int i7 = this.flags;
                ParsableByteArray parsableByteArray = this.scratch;
                int i8 = 4;
                int i9 = 0;
                int i10 = 2;
                if (i6 == 0) {
                    int i11 = this.atomHeaderBytesRead;
                    ParsableByteArray parsableByteArray2 = this.atomHeader;
                    if (i11 == 0) {
                        if (extractorInput.readFully(parsableByteArray2.data, 0, 8, true)) {
                            this.atomHeaderBytesRead = 8;
                            parsableByteArray2.setPosition(0);
                            this.atomSize = parsableByteArray2.readUnsignedInt();
                            this.atomType = parsableByteArray2.readInt();
                        } else if (this.fileType == 2 && (i7 & 2) != 0) {
                            TrackOutput track = this.extractorOutput.track(0, 4);
                            MotionPhotoMetadata motionPhotoMetadata = this.motionPhotoMetadata;
                            Metadata metadata = motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata);
                            Format.Builder builder = new Format.Builder();
                            builder.metadata = metadata;
                            NavAction$$ExternalSyntheticOutline0.m(builder, track);
                            this.extractorOutput.endTracks();
                            this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
                            return -1;
                        }
                    }
                    long j = this.atomSize;
                    if (j == 1) {
                        extractorInput.readFully(parsableByteArray2.data, 8, 8);
                        this.atomHeaderBytesRead += 8;
                        this.atomSize = parsableByteArray2.readUnsignedLongToLong();
                    } else if (j == 0) {
                        long length = extractorInput.getLength();
                        if (length == -1 && (mp4Box$ContainerBox = (Mp4Box$ContainerBox) arrayDeque.peek()) != null) {
                            length = mp4Box$ContainerBox.endPosition;
                        }
                        if (length != -1) {
                            this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
                        }
                    }
                    long j2 = this.atomSize;
                    int i12 = this.atomHeaderBytesRead;
                    long j3 = i12;
                    if (j2 < j3) {
                        if (this.atomType != 1718773093 || i12 != 8) {
                            break;
                        }
                        this.atomSize = j3;
                    }
                    int i13 = this.atomType;
                    if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069) {
                        long position = extractorInput.getPosition();
                        long j4 = this.atomSize;
                        long j5 = this.atomHeaderBytesRead;
                        long j6 = (position + j4) - j5;
                        if (j4 != j5 && this.atomType == 1835365473) {
                            parsableByteArray.reset(8);
                            extractorInput.peekFully(0, 8, parsableByteArray.data);
                            BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
                            extractorInput.skipFully(parsableByteArray.position);
                            extractorInput.resetPeekPosition();
                        }
                        arrayDeque.push(new Mp4Box$ContainerBox(this.atomType, j6));
                        if (this.atomSize == this.atomHeaderBytesRead) {
                            processAtomEnded$1(j6);
                        } else {
                            this.parserState = 0;
                            this.atomHeaderBytesRead = 0;
                        }
                    } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                        Trace.checkState(i12 == 8);
                        Trace.checkState(this.atomSize <= 2147483647L);
                        ParsableByteArray parsableByteArray3 = new ParsableByteArray((int) this.atomSize);
                        System.arraycopy(parsableByteArray2.data, 0, parsableByteArray3.data, 0, 8);
                        this.atomData = parsableByteArray3;
                        this.parserState = 1;
                    } else {
                        long position2 = extractorInput.getPosition();
                        long j7 = this.atomHeaderBytesRead;
                        long j8 = position2 - j7;
                        if (this.atomType == 1836086884) {
                            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j8, -9223372036854775807L, j8 + j7, this.atomSize - j7);
                        }
                        this.atomData = null;
                        this.parserState = 1;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return 0;
                            }
                            SefReader sefReader = this.sefReader;
                            ArrayList arrayList = sefReader.dataReferences;
                            int i14 = sefReader.readerState;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    short s = 2817;
                                    int i15 = 8;
                                    short s2 = 2192;
                                    if (i14 == 2) {
                                        long length2 = extractorInput.getLength();
                                        int i16 = sefReader.tailLength - 20;
                                        ParsableByteArray parsableByteArray4 = new ParsableByteArray(i16);
                                        extractorInput.readFully(parsableByteArray4.data, 0, i16);
                                        int i17 = 0;
                                        while (i17 < i16 / 12) {
                                            parsableByteArray4.skipBytes(i10);
                                            parsableByteArray4.maybeAssertAtLeastBytesLeftForLegacyMethod(i10);
                                            byte[] bArr = parsableByteArray4.data;
                                            int i18 = parsableByteArray4.position;
                                            int i19 = i10;
                                            int i20 = i18 + 1;
                                            parsableByteArray4.position = i20;
                                            int i21 = bArr[i18] & 255;
                                            parsableByteArray4.position = i18 + 2;
                                            short s3 = (short) (i21 | ((bArr[i20] & 255) << 8));
                                            if (s3 != s2 && s3 != 2816 && s3 != s) {
                                                if (s3 != 2819 && s3 != 2820) {
                                                    parsableByteArray4.skipBytes(i15);
                                                    i4 = i16;
                                                    i17++;
                                                    i16 = i4;
                                                    i10 = i19;
                                                    s = 2817;
                                                    s2 = 2192;
                                                    i15 = 8;
                                                }
                                            }
                                            i4 = i16;
                                            arrayList.add(new SefReader.DataReference((length2 - sefReader.tailLength) - parsableByteArray4.readLittleEndianInt(), parsableByteArray4.readLittleEndianInt()));
                                            i17++;
                                            i16 = i4;
                                            i10 = i19;
                                            s = 2817;
                                            s2 = 2192;
                                            i15 = 8;
                                        }
                                        if (arrayList.isEmpty()) {
                                            iadFrame.b = 0L;
                                        } else {
                                            sefReader.readerState = 3;
                                            iadFrame.b = ((SefReader.DataReference) arrayList.get(0)).startOffset;
                                        }
                                    } else {
                                        if (i14 != 3) {
                                            Path$$ExternalSyntheticBUOutline0.m();
                                            return 0;
                                        }
                                        long position3 = extractorInput.getPosition();
                                        int length3 = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - sefReader.tailLength);
                                        ParsableByteArray parsableByteArray5 = new ParsableByteArray(length3);
                                        extractorInput.readFully(parsableByteArray5.data, 0, length3);
                                        int i22 = 0;
                                        while (i22 < arrayList.size()) {
                                            SefReader.DataReference dataReference = (SefReader.DataReference) arrayList.get(i22);
                                            int i23 = i9;
                                            parsableByteArray5.setPosition((int) (dataReference.startOffset - position3));
                                            parsableByteArray5.skipBytes(i8);
                                            int readLittleEndianInt = parsableByteArray5.readLittleEndianInt();
                                            Charset charset = StandardCharsets.UTF_8;
                                            int i24 = i23;
                                            String readString = parsableByteArray5.readString(readLittleEndianInt, charset);
                                            switch (readString.hashCode()) {
                                                case -1711564334:
                                                    if (readString.equals("SlowMotion_Data")) {
                                                        i5 = i24;
                                                        break;
                                                    }
                                                    i5 = -1;
                                                    break;
                                                case -1332107749:
                                                    if (readString.equals("Super_SlowMotion_Edit_Data")) {
                                                        i5 = 1;
                                                        break;
                                                    }
                                                    i5 = -1;
                                                    break;
                                                case -1251387154:
                                                    if (readString.equals("Super_SlowMotion_Data")) {
                                                        i5 = 2;
                                                        break;
                                                    }
                                                    i5 = -1;
                                                    break;
                                                case -830665521:
                                                    if (readString.equals("Super_SlowMotion_Deflickering_On")) {
                                                        i5 = 3;
                                                        break;
                                                    }
                                                    i5 = -1;
                                                    break;
                                                case 1760745220:
                                                    if (readString.equals("Super_SlowMotion_BGM")) {
                                                        i5 = 4;
                                                        break;
                                                    }
                                                    i5 = -1;
                                                    break;
                                                default:
                                                    i5 = -1;
                                                    break;
                                            }
                                            switch (i5) {
                                                case 0:
                                                    c2 = 2192;
                                                    break;
                                                case 1:
                                                    c2 = 2819;
                                                    break;
                                                case 2:
                                                    c2 = 2816;
                                                    break;
                                                case 3:
                                                    c2 = 2820;
                                                    break;
                                                case 4:
                                                    c2 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.createForMalformedContainer(null, "Invalid SEF name");
                                            }
                                            int i25 = dataReference.size - (readLittleEndianInt + 8);
                                            if (c2 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List splitToList = SefReader.ASTERISK_SPLITTER.splitToList(parsableByteArray5.readString(i25, charset));
                                                int i26 = i24;
                                                while (i26 < splitToList.size()) {
                                                    List splitToList2 = SefReader.COLON_SPLITTER.splitToList((CharSequence) splitToList.get(i26));
                                                    if (splitToList2.size() != 3) {
                                                        throw ParserException.createForMalformedContainer(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new SlowMotionData.Segment(1 << (Integer.parseInt((String) splitToList2.get(2)) - 1), Long.parseLong((String) splitToList2.get(i24)), Long.parseLong((String) splitToList2.get(1))));
                                                        i26++;
                                                        i24 = 0;
                                                    } catch (NumberFormatException e) {
                                                        throw ParserException.createForMalformedContainer(e, null);
                                                    }
                                                }
                                                this.slowMotionMetadataEntries.add(new SlowMotionData(arrayList2));
                                            } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                                Path$$ExternalSyntheticBUOutline0.m();
                                                return i24;
                                            }
                                            i22++;
                                            i9 = 0;
                                            i8 = 4;
                                        }
                                        iadFrame.b = 0L;
                                    }
                                } else {
                                    ParsableByteArray parsableByteArray6 = new ParsableByteArray(8);
                                    extractorInput.readFully(parsableByteArray6.data, 0, 8);
                                    sefReader.tailLength = parsableByteArray6.readLittleEndianInt() + 8;
                                    if (parsableByteArray6.readInt() != 1397048916) {
                                        iadFrame.b = 0L;
                                    } else {
                                        iadFrame.b = extractorInput.getPosition() - (sefReader.tailLength - 12);
                                        sefReader.readerState = 2;
                                    }
                                }
                                i3 = 1;
                            } else {
                                long length4 = extractorInput.getLength();
                                iadFrame.b = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i3 = 1;
                                sefReader.readerState = 1;
                            }
                            if (iadFrame.b != 0) {
                                return i3;
                            }
                            this.parserState = 0;
                            this.atomHeaderBytesRead = 0;
                            return i3;
                        }
                        long position4 = extractorInput.getPosition();
                        if (this.sampleTrackIndex == -1) {
                            int i27 = 0;
                            int i28 = -1;
                            int i29 = -1;
                            boolean z3 = true;
                            boolean z4 = true;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            while (true) {
                                Mp4Track[] mp4TrackArr = this.tracks;
                                if (i27 >= mp4TrackArr.length) {
                                    break;
                                }
                                Mp4Track mp4Track = mp4TrackArr[i27];
                                int i30 = mp4Track.sampleIndex;
                                TrackSampleTable trackSampleTable = mp4Track.sampleTable;
                                if (i30 != trackSampleTable.sampleCount) {
                                    long j12 = trackSampleTable.offsets[i30];
                                    long[][] jArr = this.accumulatedSampleSizes;
                                    jArr.getClass();
                                    long j13 = jArr[i27][i30];
                                    long j14 = j12 - position4;
                                    boolean z5 = j14 < 0 || j14 >= 262144;
                                    if ((!z5 && z4) || (z5 == z4 && j14 < j11)) {
                                        j10 = j13;
                                        i29 = i27;
                                        z4 = z5;
                                        j11 = j14;
                                    }
                                    if (j13 < j9) {
                                        j9 = j13;
                                        i28 = i27;
                                        z3 = z5;
                                    }
                                }
                                i27++;
                            }
                            if (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) {
                                i28 = i29;
                            }
                            this.sampleTrackIndex = i28;
                            if (i28 == -1) {
                                return -1;
                            }
                        }
                        Mp4Track mp4Track2 = this.tracks[this.sampleTrackIndex];
                        TrackOutput trackOutput = mp4Track2.trackOutput;
                        TrackSampleTable trackSampleTable2 = mp4Track2.sampleTable;
                        Track track2 = mp4Track2.track;
                        int i31 = mp4Track2.sampleIndex;
                        long[] jArr2 = trackSampleTable2.offsets;
                        int[] iArr = trackSampleTable2.sizes;
                        long j15 = jArr2[i31] + this.sampleOffsetForAuxiliaryTracks;
                        int i32 = iArr[i31];
                        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track2.trueHdSampleRechunker;
                        long j16 = (j15 - position4) + this.sampleBytesRead;
                        if (j16 < 0 || j16 >= 262144) {
                            iadFrame.b = j15;
                            return 1;
                        }
                        int i33 = track2.sampleTransformation;
                        int i34 = track2.nalUnitLengthFieldLength;
                        Format format2 = track2.f892format;
                        if (i33 == 1) {
                            j16 += 8;
                            i32 -= 8;
                        }
                        extractorInput.skipFully((int) j16);
                        String str = format2.sampleMimeType;
                        String str2 = format2.sampleMimeType;
                        if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i7 & 128) == 0) : (i7 & 32) != 0) {
                            c = 1;
                            this.isSampleDependedOn = true;
                        } else {
                            c = 1;
                        }
                        if (i34 == 0) {
                            if ("audio/ac4".equals(str2)) {
                                if (this.sampleBytesWritten == 0) {
                                    AacUtil.getAc4SampleHeader(i32, parsableByteArray);
                                    trackOutput.sampleData(7, parsableByteArray);
                                    this.sampleBytesWritten += 7;
                                }
                                i32 += 7;
                            } else if (mp4Track2.pendingFormat != null && Objects.equals(str2, "audio/mpeg")) {
                                Format format3 = mp4Track2.pendingFormat;
                                parsableByteArray.reset(4);
                                extractorInput.peekFully(0, 4, parsableByteArray.data);
                                extractorInput.resetPeekPosition();
                                MpegAudioUtil$Header mpegAudioUtil$Header = new MpegAudioUtil$Header();
                                TrackOutput trackOutput2 = mp4Track2.trackOutput;
                                if (mpegAudioUtil$Header.setForHeaderData(parsableByteArray.readInt()) && !Objects.equals(format3.sampleMimeType, (String) mpegAudioUtil$Header.mimeType)) {
                                    Format.Builder buildUpon = format3.buildUpon();
                                    String str3 = (String) mpegAudioUtil$Header.mimeType;
                                    str3.getClass();
                                    buildUpon.sampleMimeType = MimeTypes.normalizeMimeType(str3);
                                    format3 = new Format(buildUpon);
                                }
                                trackOutput2.format(format3);
                                mp4Track2.pendingFormat = null;
                            } else if (trueHdSampleRechunker != null) {
                                trueHdSampleRechunker.startSample(extractorInput);
                            }
                            while (true) {
                                int i35 = this.sampleBytesWritten;
                                if (i35 >= i32) {
                                    break;
                                }
                                int sampleData = trackOutput.sampleData((DataReader) extractorInput, i32 - i35, false);
                                this.sampleBytesRead += sampleData;
                                this.sampleBytesWritten += sampleData;
                                this.sampleCurrentNalBytesRemaining -= sampleData;
                            }
                        } else {
                            ParsableByteArray parsableByteArray7 = this.nalPrefix;
                            byte[] bArr2 = parsableByteArray7.data;
                            bArr2[0] = 0;
                            bArr2[c] = 0;
                            bArr2[2] = 0;
                            int i36 = 4 - i34;
                            i32 += i36;
                            while (this.sampleBytesWritten < i32) {
                                int i37 = this.sampleCurrentNalBytesRemaining;
                                if (i37 == 0) {
                                    if (this.isSampleDependedOn || OpusUtil.numberOfBytesInNalUnitHeader(format2) + i34 > iArr[i31] - this.sampleBytesRead) {
                                        i = i34;
                                        i2 = 0;
                                    } else {
                                        int numberOfBytesInNalUnitHeader = OpusUtil.numberOfBytesInNalUnitHeader(format2);
                                        i = i34 + numberOfBytesInNalUnitHeader;
                                        i2 = numberOfBytesInNalUnitHeader;
                                    }
                                    extractorInput.readFully(bArr2, i36, i);
                                    this.sampleBytesRead += i;
                                    parsableByteArray7.setPosition(0);
                                    int readInt = parsableByteArray7.readInt();
                                    if (readInt < 0) {
                                        throw ParserException.createForMalformedContainer(null, "Invalid NAL length");
                                    }
                                    this.sampleCurrentNalBytesRemaining = readInt - i2;
                                    ParsableByteArray parsableByteArray8 = this.nalStartCode;
                                    parsableByteArray8.setPosition(0);
                                    trackOutput.sampleData(4, parsableByteArray8);
                                    this.sampleBytesWritten += 4;
                                    if (i2 > 0) {
                                        trackOutput.sampleData(i2, parsableByteArray7);
                                        this.sampleBytesWritten += i2;
                                        if (OpusUtil.isDependedOn(bArr2, i2, format2)) {
                                            this.isSampleDependedOn = true;
                                        }
                                    }
                                } else {
                                    int sampleData2 = trackOutput.sampleData((DataReader) extractorInput, i37, false);
                                    this.sampleBytesRead += sampleData2;
                                    this.sampleBytesWritten += sampleData2;
                                    this.sampleCurrentNalBytesRemaining -= sampleData2;
                                }
                            }
                        }
                        int i38 = i32;
                        long j17 = trackSampleTable2.timestampsUs[i31];
                        int i39 = trackSampleTable2.flags[i31];
                        if (!this.isSampleDependedOn) {
                            i39 |= 67108864;
                        }
                        int i40 = i39;
                        if (trueHdSampleRechunker != null) {
                            trueHdSampleRechunker.sampleMetadata(trackOutput, j17, i40, i38, 0, null);
                            if (i31 + 1 == trackSampleTable2.sampleCount) {
                                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
                            }
                        } else {
                            trackOutput.sampleMetadata(j17, i40, i38, 0, null);
                        }
                        mp4Track2.sampleIndex++;
                        this.sampleTrackIndex = -1;
                        this.sampleBytesRead = 0;
                        this.sampleBytesWritten = 0;
                        this.sampleCurrentNalBytesRemaining = 0;
                        this.isSampleDependedOn = false;
                        return 0;
                    }
                    long j18 = this.atomSize - this.atomHeaderBytesRead;
                    long position5 = extractorInput.getPosition() + j18;
                    ParsableByteArray parsableByteArray9 = this.atomData;
                    if (parsableByteArray9 != null) {
                        extractorInput.readFully(parsableByteArray9.data, this.atomHeaderBytesRead, (int) j18);
                        if (this.atomType == 1718909296) {
                            this.seenFtypAtom = true;
                            parsableByteArray9.setPosition(8);
                            int readInt2 = parsableByteArray9.readInt();
                            int i41 = readInt2 != 1751476579 ? readInt2 != 1903435808 ? 0 : 1 : 2;
                            if (i41 == 0) {
                                parsableByteArray9.skipBytes(4);
                                while (true) {
                                    if (parsableByteArray9.bytesLeft() <= 0) {
                                        i41 = 0;
                                        break;
                                    }
                                    int readInt3 = parsableByteArray9.readInt();
                                    i41 = readInt3 != 1751476579 ? readInt3 != 1903435808 ? 0 : 1 : 2;
                                    if (i41 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.fileType = i41;
                        } else if (!arrayDeque.isEmpty()) {
                            ((Mp4Box$ContainerBox) arrayDeque.peek()).leafChildren.add(new Mp4Box$LeafBox(this.atomType, parsableByteArray9));
                        }
                    } else {
                        if (!this.seenFtypAtom && this.atomType == 1835295092) {
                            this.fileType = 1;
                        }
                        if (j18 < 262144) {
                            extractorInput.skipFully((int) j18);
                        } else {
                            iadFrame.b = extractorInput.getPosition() + j18;
                            z = true;
                            processAtomEnded$1(position5);
                            if (this.seekToAxteAtom) {
                                z2 = z;
                            } else {
                                this.readingAuxiliaryTracks = true;
                                iadFrame.b = this.axteAtomOffset;
                                this.seekToAxteAtom = false;
                                z2 = true;
                            }
                            if (z2 && this.parserState != 2) {
                                return 1;
                            }
                        }
                    }
                    z = false;
                    processAtomEnded$1(position5);
                    if (this.seekToAxteAtom) {
                    }
                    if (z2) {
                        return 1;
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.isSampleDependedOn = false;
        this.moovAtomProcessed = false;
        if (j == 0) {
            if (this.parserState != 3) {
                this.parserState = 0;
                this.atomHeaderBytesRead = 0;
                return;
            } else {
                SefReader sefReader = this.sefReader;
                sefReader.dataReferences.clear();
                sefReader.readerState = 0;
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j2);
            if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j2);
            }
            mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.foundSyncframe = false;
                trueHdSampleRechunker.chunkSampleCount = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        RegularImmutableList regularImmutableList;
        SniffFailure sniffInternal = Sniffer.sniffInternal(extractorInput, false, (this.flags & 2) != 0);
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
