package androidx.media3.extractor.mp3;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil$Header;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Mp3InfoReplayGain;
import androidx.media3.extractor.mp3.Seeker;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.Providers;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.EOFException;
import java.math.RoundingMode;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Mp3Extractor implements Extractor {
    public TrackOutput currentTrackOutput;
    public boolean disableSeeking;
    public long endPositionOfLastSampleRead;
    public ExtractorOutput extractorOutput;
    public long firstSamplePosition;
    public Metadata id3Metadata;
    public boolean isSeekInProgress;
    public TrackOutput realTrackOutput;
    public int sampleBytesRemaining;
    public long samplesRead;
    public long seekTimeUs;
    public Seeker seeker;
    public final DiscardingTrackOutput skippingTrackOutput;
    public int synchronizedHeaderData;
    public Metadata xingMetadata;
    public final ParsableByteArray scratch = new ParsableByteArray(10);
    public final MpegAudioUtil$Header synchronizedHeader = new MpegAudioUtil$Header();
    public final GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
    public long basisTimeUs = -9223372036854775807L;
    public final Id3Peeker id3Peeker = new Id3Peeker(0);

    public Mp3Extractor() {
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
        this.endPositionOfLastSampleRead = -1L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput track = extractorOutput.track(0, 1);
        this.realTrackOutput = track;
        this.currentTrackOutput = track;
        this.extractorOutput.endTracks();
    }

    public final void maybeUpdateCbrDurationToLastSample() {
        Seeker seeker = this.seeker;
        if ((seeker instanceof ConstantBitrateSeeker) && ((ConstantBitrateSeeker) seeker).isSeekable()) {
            long j = this.endPositionOfLastSampleRead;
            if (j == -1 || j == this.seeker.getDataEndPosition()) {
                return;
            }
            ConstantBitrateSeeker constantBitrateSeeker = (ConstantBitrateSeeker) this.seeker;
            this.seeker = new ConstantBitrateSeeker(this.endPositionOfLastSampleRead, constantBitrateSeeker.firstFramePosition, constantBitrateSeeker.bitrate, constantBitrateSeeker.frameSize, constantBitrateSeeker.allowSeeksIfLengthUnknown, false);
            ExtractorOutput extractorOutput = this.extractorOutput;
            extractorOutput.getClass();
            extractorOutput.seekMap(this.seeker);
            TrackOutput trackOutput = this.realTrackOutput;
            trackOutput.getClass();
            trackOutput.durationUs(this.seeker.getDurationUs());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.getPeekPosition() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1) {
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.data, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (r3 != 1231971951) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0350, code lost:
    
        if (com.google.common.base.Predicates$ObjectPredicate.ALWAYS_TRUE.apply(r9) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0389, code lost:
    
        if (((androidx.media3.extractor.metadata.id3.TextInformationFrame) r10).id.equals("TLEN") != false) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032f  */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        MpegAudioUtil$Header mpegAudioUtil$Header;
        Throwable th;
        int i;
        long j;
        ParsableByteArray parsableByteArray;
        long j2;
        ?? r4;
        int i2;
        int i3;
        GaplessInfoHolder gaplessInfoHolder;
        MpegAudioUtil$Header mpegAudioUtil$Header2;
        int i4;
        int readInt;
        long[] jArr;
        Mp3InfoReplayGain mp3InfoReplayGain;
        int i5;
        int i6;
        long j3;
        long j4;
        long j5;
        long j6;
        Seeker constantBitrateSeeker;
        Metadata metadata;
        Metadata.Entry entry;
        Metadata.Entry entry2;
        char c;
        long msToUs;
        MlltSeeker mlltSeeker;
        GaplessInfoHolder gaplessInfoHolder2;
        boolean z;
        Seeker seeker;
        boolean z2;
        Metadata metadata2;
        long j7;
        long j8;
        int readUnsignedByte;
        this.realTrackOutput.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        int i7 = this.synchronizedHeaderData;
        int i8 = 0;
        MpegAudioUtil$Header mpegAudioUtil$Header3 = this.synchronizedHeader;
        if (i7 == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                mpegAudioUtil$Header = mpegAudioUtil$Header3;
                th = null;
                i = -1;
                i8 = -1;
                j = 1000000;
            }
        }
        Seeker seeker2 = this.seeker;
        ParsableByteArray parsableByteArray2 = this.scratch;
        if (seeker2 == null) {
            ParsableByteArray parsableByteArray3 = new ParsableByteArray(mpegAudioUtil$Header3.frameSize);
            th = null;
            extractorInput.peekFully(0, mpegAudioUtil$Header3.frameSize, parsableByteArray3.data);
            int i9 = mpegAudioUtil$Header3.version & 1;
            int i10 = mpegAudioUtil$Header3.channels;
            int i11 = 21;
            j = 1000000;
            if (i9 != 0) {
                if (i10 != 1) {
                    i2 = 36;
                    long j9 = 0;
                    j2 = -9223372036854775807L;
                    if (parsableByteArray3.limit >= i2 + 4) {
                        parsableByteArray3.setPosition(i2);
                        i3 = parsableByteArray3.readInt();
                        if (i3 != 1483304551) {
                        }
                        gaplessInfoHolder = this.gaplessInfoHolder;
                        if (i3 != 1231971951) {
                            if (i3 == 1447187017) {
                                long length = extractorInput.getLength();
                                long position = extractorInput.getPosition();
                                parsableByteArray3.skipBytes(6);
                                i4 = 0;
                                long j10 = position + mpegAudioUtil$Header3.frameSize;
                                long readInt2 = j10 + parsableByteArray3.readInt();
                                int readInt3 = parsableByteArray3.readInt();
                                if (readInt3 <= 0) {
                                    constantBitrateSeeker = null;
                                    mpegAudioUtil$Header2 = mpegAudioUtil$Header3;
                                } else {
                                    long sampleCountToDurationUs = Util.sampleCountToDurationUs(mpegAudioUtil$Header3.sampleRate, (readInt3 * mpegAudioUtil$Header3.samplesPerFrame) - 1);
                                    int readUnsignedShort = parsableByteArray3.readUnsignedShort();
                                    int readUnsignedShort2 = parsableByteArray3.readUnsignedShort();
                                    int readUnsignedShort3 = parsableByteArray3.readUnsignedShort();
                                    parsableByteArray3.skipBytes(2);
                                    long[] jArr2 = new long[readUnsignedShort];
                                    long[] jArr3 = new long[readUnsignedShort];
                                    MpegAudioUtil$Header mpegAudioUtil$Header4 = mpegAudioUtil$Header3;
                                    long j11 = position + mpegAudioUtil$Header3.frameSize;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < readUnsignedShort) {
                                            long[] jArr4 = jArr3;
                                            MpegAudioUtil$Header mpegAudioUtil$Header5 = mpegAudioUtil$Header4;
                                            int i13 = i12;
                                            long[] jArr5 = jArr2;
                                            jArr5[i13] = (i12 * sampleCountToDurationUs) / readUnsignedShort;
                                            jArr4[i13] = j11;
                                            if (readUnsignedShort3 == 1) {
                                                readUnsignedByte = parsableByteArray3.readUnsignedByte();
                                            } else if (readUnsignedShort3 == 2) {
                                                readUnsignedByte = parsableByteArray3.readUnsignedShort();
                                            } else if (readUnsignedShort3 == 3) {
                                                readUnsignedByte = parsableByteArray3.readUnsignedInt24();
                                            } else {
                                                if (readUnsignedShort3 != 4) {
                                                    constantBitrateSeeker = null;
                                                    mpegAudioUtil$Header2 = mpegAudioUtil$Header5;
                                                    break;
                                                }
                                                readUnsignedByte = parsableByteArray3.readUnsignedIntToInt();
                                            }
                                            j11 += readUnsignedByte * readUnsignedShort2;
                                            i12 = i13 + 1;
                                            jArr3 = jArr4;
                                            mpegAudioUtil$Header4 = mpegAudioUtil$Header5;
                                            jArr2 = jArr5;
                                        } else {
                                            long[] jArr6 = jArr2;
                                            long[] jArr7 = jArr3;
                                            MpegAudioUtil$Header mpegAudioUtil$Header6 = mpegAudioUtil$Header4;
                                            if (length == -1 || length == readInt2) {
                                                j7 = readInt2;
                                            } else {
                                                StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(length, "VBRI data size mismatch: ", ", ");
                                                j7 = readInt2;
                                                m1149m.append(j7);
                                                Log.w("VbriSeeker", m1149m.toString());
                                            }
                                            if (j7 != j11) {
                                                StringBuilder m1149m2 = Boxes$$ExternalSyntheticOutline1.m1149m(j7, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                                m1149m2.append(j11);
                                                m1149m2.append("\nSeeking will be inaccurate.");
                                                Log.w("VbriSeeker", m1149m2.toString());
                                                j8 = Math.max(j7, j11);
                                            } else {
                                                j8 = j7;
                                            }
                                            mpegAudioUtil$Header2 = mpegAudioUtil$Header6;
                                            constantBitrateSeeker = new VbriSeeker(jArr6, jArr7, sampleCountToDurationUs, j10, j8, mpegAudioUtil$Header2.bitrate);
                                        }
                                    }
                                }
                                extractorInput.skipFully(mpegAudioUtil$Header2.frameSize);
                            } else if (i3 != 1483304551) {
                                extractorInput.resetPeekPosition();
                                constantBitrateSeeker = null;
                                mpegAudioUtil$Header2 = mpegAudioUtil$Header3;
                                i4 = 0;
                            }
                            metadata = this.id3Metadata;
                            long position2 = extractorInput.getPosition();
                            if (metadata != null) {
                                Metadata.Entry[] entryArr = metadata.entries;
                                int length2 = entryArr.length;
                                int i14 = i4;
                                while (true) {
                                    if (i14 >= length2) {
                                        entry = null;
                                        break;
                                    }
                                    Metadata.Entry entry3 = entryArr[i14];
                                    if (MlltFrame.class.isAssignableFrom(entry3.getClass())) {
                                        entry = (Metadata.Entry) MlltFrame.class.cast(entry3);
                                    }
                                    entry = null;
                                    if (entry != null) {
                                        break;
                                    }
                                    i14++;
                                }
                                MlltFrame mlltFrame = (MlltFrame) entry;
                                if (mlltFrame != null) {
                                    int[] iArr = mlltFrame.bytesDeviations;
                                    Metadata.Entry[] entryArr2 = metadata.entries;
                                    int length3 = entryArr2.length;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= length3) {
                                            entry2 = null;
                                            break;
                                        }
                                        Metadata.Entry entry4 = entryArr2[i15];
                                        if (TextInformationFrame.class.isAssignableFrom(entry4.getClass())) {
                                            entry2 = (Metadata.Entry) TextInformationFrame.class.cast(entry4);
                                        }
                                        entry2 = null;
                                        if (entry2 != null) {
                                            break;
                                        }
                                        i15++;
                                    }
                                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry2;
                                    if (textInformationFrame == null) {
                                        msToUs = -9223372036854775807L;
                                        c = 0;
                                    } else {
                                        c = 0;
                                        msToUs = Util.msToUs(Long.parseLong((String) textInformationFrame.values.get(0)));
                                    }
                                    int length4 = iArr.length;
                                    int i16 = length4 + 1;
                                    long[] jArr8 = new long[i16];
                                    long[] jArr9 = new long[i16];
                                    jArr8[c] = position2;
                                    jArr9[c] = 0;
                                    int i17 = 1;
                                    while (i17 <= length4) {
                                        int i18 = i17 - 1;
                                        long j12 = position2 + mlltFrame.bytesBetweenReference + iArr[i18];
                                        j9 += mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i18];
                                        jArr8[i17] = j12;
                                        jArr9[i17] = j9;
                                        i17++;
                                        length4 = length4;
                                        position2 = j12;
                                    }
                                    mlltSeeker = new MlltSeeker(msToUs, jArr8, jArr9);
                                    if (this.disableSeeking) {
                                        if (mlltSeeker != null) {
                                            constantBitrateSeeker = mlltSeeker;
                                        } else if (constantBitrateSeeker == null) {
                                            constantBitrateSeeker = null;
                                        }
                                        if (constantBitrateSeeker == null) {
                                            int i19 = i4;
                                            extractorInput.peekFully(i19, 4, parsableByteArray2.data);
                                            parsableByteArray2.setPosition(i19);
                                            mpegAudioUtil$Header2.setForHeaderData(parsableByteArray2.readInt());
                                            parsableByteArray = parsableByteArray2;
                                            gaplessInfoHolder2 = gaplessInfoHolder;
                                            j2 = -9223372036854775807L;
                                            mpegAudioUtil$Header = mpegAudioUtil$Header2;
                                            z = true;
                                            i8 = 0;
                                            constantBitrateSeeker = new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), mpegAudioUtil$Header2.bitrate, mpegAudioUtil$Header2.frameSize, false, true);
                                        } else {
                                            j2 = -9223372036854775807L;
                                            parsableByteArray = parsableByteArray2;
                                            gaplessInfoHolder2 = gaplessInfoHolder;
                                            mpegAudioUtil$Header = mpegAudioUtil$Header2;
                                            z = true;
                                            i8 = 0;
                                        }
                                        constantBitrateSeeker.isSeekable();
                                        constantBitrateSeeker.isSeekable();
                                        this.realTrackOutput.durationUs(constantBitrateSeeker.getDurationUs());
                                        seeker = constantBitrateSeeker;
                                        z2 = z;
                                    } else {
                                        seeker = new Seeker.UnseekableSeeker(-9223372036854775807L);
                                        parsableByteArray = parsableByteArray2;
                                        gaplessInfoHolder2 = gaplessInfoHolder;
                                        mpegAudioUtil$Header = mpegAudioUtil$Header2;
                                        z2 = true;
                                        i8 = 0;
                                    }
                                    this.seeker = seeker;
                                    this.extractorOutput.seekMap(seeker);
                                    metadata2 = this.id3Metadata;
                                    Metadata metadata3 = this.xingMetadata;
                                    if (metadata2 != null) {
                                        if (metadata3 != null) {
                                            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
                                        }
                                        metadata3 = metadata2;
                                    }
                                    Format.Builder builder = new Format.Builder();
                                    builder.containerMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                                    builder.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                                    builder.maxInputSize = 4096;
                                    builder.channelCount = mpegAudioUtil$Header.channels;
                                    builder.sampleRate = mpegAudioUtil$Header.sampleRate;
                                    builder.encoderDelay = gaplessInfoHolder2.encoderDelay;
                                    builder.encoderPadding = gaplessInfoHolder2.encoderPadding;
                                    builder.metadata = metadata3;
                                    if (this.seeker.getAverageBitrate() != -2147483647) {
                                        builder.averageBitrate = this.seeker.getAverageBitrate();
                                    }
                                    this.currentTrackOutput.format(new Format(builder));
                                    this.firstSamplePosition = extractorInput.getPosition();
                                    r4 = z2;
                                }
                            }
                            mlltSeeker = null;
                            if (this.disableSeeking) {
                            }
                            this.seeker = seeker;
                            this.extractorOutput.seekMap(seeker);
                            metadata2 = this.id3Metadata;
                            Metadata metadata32 = this.xingMetadata;
                            if (metadata2 != null) {
                            }
                            Format.Builder builder2 = new Format.Builder();
                            builder2.containerMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                            builder2.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                            builder2.maxInputSize = 4096;
                            builder2.channelCount = mpegAudioUtil$Header.channels;
                            builder2.sampleRate = mpegAudioUtil$Header.sampleRate;
                            builder2.encoderDelay = gaplessInfoHolder2.encoderDelay;
                            builder2.encoderPadding = gaplessInfoHolder2.encoderPadding;
                            builder2.metadata = metadata32;
                            if (this.seeker.getAverageBitrate() != -2147483647) {
                            }
                            this.currentTrackOutput.format(new Format(builder2));
                            this.firstSamplePosition = extractorInput.getPosition();
                            r4 = z2;
                        }
                        mpegAudioUtil$Header2 = mpegAudioUtil$Header3;
                        i4 = 0;
                        readInt = parsableByteArray3.readInt();
                        int readUnsignedIntToInt = (readInt & 1) == 0 ? parsableByteArray3.readUnsignedIntToInt() : -1;
                        long readUnsignedInt = (readInt & 2) == 0 ? parsableByteArray3.readUnsignedInt() : -1L;
                        if ((readInt & 4) != 4) {
                            long[] jArr10 = new long[100];
                            int i20 = 0;
                            for (int i21 = 100; i20 < i21; i21 = 100) {
                                jArr10[i20] = parsableByteArray3.readUnsignedByte();
                                i20++;
                            }
                            jArr = jArr10;
                        } else {
                            jArr = null;
                        }
                        if ((readInt & 8) != 0) {
                            parsableByteArray3.skipBytes(4);
                        }
                        if (parsableByteArray3.bytesLeft() < 24) {
                            parsableByteArray3.skipBytes(11);
                            float intBitsToFloat = Float.intBitsToFloat(parsableByteArray3.readInt());
                            int readUnsignedShort4 = parsableByteArray3.readUnsignedShort();
                            int readUnsignedShort5 = parsableByteArray3.readUnsignedShort();
                            Mp3InfoReplayGain.GainField access$000 = Mp3InfoReplayGain.GainField.access$000(readUnsignedShort4);
                            Mp3InfoReplayGain.GainField access$0002 = Mp3InfoReplayGain.GainField.access$000(readUnsignedShort5);
                            mp3InfoReplayGain = (intBitsToFloat <= RecyclerView.DECELERATION_RATE && access$000 == null && access$0002 == null) ? null : new Mp3InfoReplayGain(intBitsToFloat, access$000, access$0002);
                            parsableByteArray3.skipBytes(2);
                            int readUnsignedInt24 = parsableByteArray3.readUnsignedInt24();
                            i6 = (16773120 & readUnsignedInt24) >> 12;
                            i5 = readUnsignedInt24 & 4095;
                        } else {
                            mp3InfoReplayGain = null;
                            i5 = -1;
                            i6 = -1;
                        }
                        long j13 = readUnsignedIntToInt;
                        int i22 = mpegAudioUtil$Header2.frameSize;
                        int i23 = mpegAudioUtil$Header2.sampleRate;
                        int i24 = mpegAudioUtil$Header2.bitrate;
                        int i25 = mpegAudioUtil$Header2.samplesPerFrame;
                        Mp3InfoReplayGain mp3InfoReplayGain2 = mp3InfoReplayGain;
                        if ((gaplessInfoHolder.encoderDelay != -1 || gaplessInfoHolder.encoderPadding == -1) && i6 != -1 && i5 != -1) {
                            gaplessInfoHolder.encoderDelay = i6;
                            gaplessInfoHolder.encoderPadding = i5;
                        }
                        this.xingMetadata = mp3InfoReplayGain2 == null ? new Metadata(mp3InfoReplayGain2) : null;
                        long position3 = extractorInput.getPosition();
                        extractorInput.skipFully(mpegAudioUtil$Header2.frameSize);
                        if (i3 != 1483304551) {
                            long length5 = extractorInput.getLength();
                            long sampleCountToDurationUs2 = (j13 == -1 || j13 == 0) ? -9223372036854775807L : Util.sampleCountToDurationUs(i23, (j13 * i25) - 1);
                            if (sampleCountToDurationUs2 != -9223372036854775807L) {
                                if (readUnsignedInt != -1 && length5 != -1 && position3 + readUnsignedInt != length5) {
                                    long j14 = length5 - position3;
                                    StringBuilder m1149m3 = Boxes$$ExternalSyntheticOutline1.m1149m(j14, "Data size mismatch between stream (", ") and Xing frame (");
                                    m1149m3.append(readUnsignedInt);
                                    m1149m3.append("), using smaller value.");
                                    Log.i("XingSeeker", m1149m3.toString());
                                    readUnsignedInt = Math.min(readUnsignedInt, j14);
                                }
                                constantBitrateSeeker = new XingSeeker(position3, i22, sampleCountToDurationUs2, i24, readUnsignedInt, jArr);
                                metadata = this.id3Metadata;
                                long position22 = extractorInput.getPosition();
                                if (metadata != null) {
                                }
                                mlltSeeker = null;
                                if (this.disableSeeking) {
                                }
                                this.seeker = seeker;
                                this.extractorOutput.seekMap(seeker);
                                metadata2 = this.id3Metadata;
                                Metadata metadata322 = this.xingMetadata;
                                if (metadata2 != null) {
                                }
                                Format.Builder builder22 = new Format.Builder();
                                builder22.containerMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                                builder22.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                                builder22.maxInputSize = 4096;
                                builder22.channelCount = mpegAudioUtil$Header.channels;
                                builder22.sampleRate = mpegAudioUtil$Header.sampleRate;
                                builder22.encoderDelay = gaplessInfoHolder2.encoderDelay;
                                builder22.encoderPadding = gaplessInfoHolder2.encoderPadding;
                                builder22.metadata = metadata322;
                                if (this.seeker.getAverageBitrate() != -2147483647) {
                                }
                                this.currentTrackOutput.format(new Format(builder22));
                                this.firstSamplePosition = extractorInput.getPosition();
                                r4 = z2;
                            }
                            constantBitrateSeeker = null;
                            metadata = this.id3Metadata;
                            long position222 = extractorInput.getPosition();
                            if (metadata != null) {
                            }
                            mlltSeeker = null;
                            if (this.disableSeeking) {
                            }
                            this.seeker = seeker;
                            this.extractorOutput.seekMap(seeker);
                            metadata2 = this.id3Metadata;
                            Metadata metadata3222 = this.xingMetadata;
                            if (metadata2 != null) {
                            }
                            Format.Builder builder222 = new Format.Builder();
                            builder222.containerMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                            builder222.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                            builder222.maxInputSize = 4096;
                            builder222.channelCount = mpegAudioUtil$Header.channels;
                            builder222.sampleRate = mpegAudioUtil$Header.sampleRate;
                            builder222.encoderDelay = gaplessInfoHolder2.encoderDelay;
                            builder222.encoderPadding = gaplessInfoHolder2.encoderPadding;
                            builder222.metadata = metadata3222;
                            if (this.seeker.getAverageBitrate() != -2147483647) {
                            }
                            this.currentTrackOutput.format(new Format(builder222));
                            this.firstSamplePosition = extractorInput.getPosition();
                            r4 = z2;
                        } else {
                            long length6 = extractorInput.getLength();
                            if (j13 == -1 || j13 == 0) {
                                j3 = length6;
                                j4 = -9223372036854775807L;
                            } else {
                                j3 = length6;
                                j4 = Util.sampleCountToDurationUs(i23, (i25 * j13) - 1);
                            }
                            if (j4 != -9223372036854775807L) {
                                if (readUnsignedInt != -1) {
                                    long j15 = position3 + readUnsignedInt;
                                    j5 = readUnsignedInt - i22;
                                    j6 = j15;
                                } else if (j3 != -1) {
                                    j5 = (j3 - position3) - i22;
                                    j6 = j3;
                                }
                                long j16 = j5;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                constantBitrateSeeker = new ConstantBitrateSeeker(j6, position3 + i22, CompositeException.WrappedPrintStream.checkedCast(Util.scaleLargeValue(j16, 8000000L, j4, roundingMode)), CompositeException.WrappedPrintStream.checkedCast(Providers.divide(j16, j13, roundingMode)), false, true);
                                metadata = this.id3Metadata;
                                long position2222 = extractorInput.getPosition();
                                if (metadata != null) {
                                }
                                mlltSeeker = null;
                                if (this.disableSeeking) {
                                }
                                this.seeker = seeker;
                                this.extractorOutput.seekMap(seeker);
                                metadata2 = this.id3Metadata;
                                Metadata metadata32222 = this.xingMetadata;
                                if (metadata2 != null) {
                                }
                                Format.Builder builder2222 = new Format.Builder();
                                builder2222.containerMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                                builder2222.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                                builder2222.maxInputSize = 4096;
                                builder2222.channelCount = mpegAudioUtil$Header.channels;
                                builder2222.sampleRate = mpegAudioUtil$Header.sampleRate;
                                builder2222.encoderDelay = gaplessInfoHolder2.encoderDelay;
                                builder2222.encoderPadding = gaplessInfoHolder2.encoderPadding;
                                builder2222.metadata = metadata32222;
                                if (this.seeker.getAverageBitrate() != -2147483647) {
                                }
                                this.currentTrackOutput.format(new Format(builder2222));
                                this.firstSamplePosition = extractorInput.getPosition();
                                r4 = z2;
                            }
                            constantBitrateSeeker = null;
                            metadata = this.id3Metadata;
                            long position22222 = extractorInput.getPosition();
                            if (metadata != null) {
                            }
                            mlltSeeker = null;
                            if (this.disableSeeking) {
                            }
                            this.seeker = seeker;
                            this.extractorOutput.seekMap(seeker);
                            metadata2 = this.id3Metadata;
                            Metadata metadata322222 = this.xingMetadata;
                            if (metadata2 != null) {
                            }
                            Format.Builder builder22222 = new Format.Builder();
                            builder22222.containerMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                            builder22222.sampleMimeType = MimeTypes.normalizeMimeType((String) mpegAudioUtil$Header.mimeType);
                            builder22222.maxInputSize = 4096;
                            builder22222.channelCount = mpegAudioUtil$Header.channels;
                            builder22222.sampleRate = mpegAudioUtil$Header.sampleRate;
                            builder22222.encoderDelay = gaplessInfoHolder2.encoderDelay;
                            builder22222.encoderPadding = gaplessInfoHolder2.encoderPadding;
                            builder22222.metadata = metadata322222;
                            if (this.seeker.getAverageBitrate() != -2147483647) {
                            }
                            this.currentTrackOutput.format(new Format(builder22222));
                            this.firstSamplePosition = extractorInput.getPosition();
                            r4 = z2;
                        }
                    }
                    if (parsableByteArray3.limit >= 40) {
                        parsableByteArray3.setPosition(36);
                        if (parsableByteArray3.readInt() == 1447187017) {
                            i3 = 1447187017;
                            gaplessInfoHolder = this.gaplessInfoHolder;
                            if (i3 != 1231971951) {
                            }
                            mpegAudioUtil$Header2 = mpegAudioUtil$Header3;
                            i4 = 0;
                            readInt = parsableByteArray3.readInt();
                            if ((readInt & 1) == 0) {
                            }
                            if ((readInt & 2) == 0) {
                            }
                            if ((readInt & 4) != 4) {
                            }
                            if ((readInt & 8) != 0) {
                            }
                            if (parsableByteArray3.bytesLeft() < 24) {
                            }
                            long j132 = readUnsignedIntToInt;
                            int i222 = mpegAudioUtil$Header2.frameSize;
                            int i232 = mpegAudioUtil$Header2.sampleRate;
                            int i242 = mpegAudioUtil$Header2.bitrate;
                            int i252 = mpegAudioUtil$Header2.samplesPerFrame;
                            Mp3InfoReplayGain mp3InfoReplayGain22 = mp3InfoReplayGain;
                            if (gaplessInfoHolder.encoderDelay != -1) {
                            }
                            gaplessInfoHolder.encoderDelay = i6;
                            gaplessInfoHolder.encoderPadding = i5;
                            this.xingMetadata = mp3InfoReplayGain22 == null ? new Metadata(mp3InfoReplayGain22) : null;
                            long position32 = extractorInput.getPosition();
                            extractorInput.skipFully(mpegAudioUtil$Header2.frameSize);
                            if (i3 != 1483304551) {
                            }
                        }
                    }
                    i3 = 0;
                    gaplessInfoHolder = this.gaplessInfoHolder;
                    if (i3 != 1231971951) {
                    }
                    mpegAudioUtil$Header2 = mpegAudioUtil$Header3;
                    i4 = 0;
                    readInt = parsableByteArray3.readInt();
                    if ((readInt & 1) == 0) {
                    }
                    if ((readInt & 2) == 0) {
                    }
                    if ((readInt & 4) != 4) {
                    }
                    if ((readInt & 8) != 0) {
                    }
                    if (parsableByteArray3.bytesLeft() < 24) {
                    }
                    long j1322 = readUnsignedIntToInt;
                    int i2222 = mpegAudioUtil$Header2.frameSize;
                    int i2322 = mpegAudioUtil$Header2.sampleRate;
                    int i2422 = mpegAudioUtil$Header2.bitrate;
                    int i2522 = mpegAudioUtil$Header2.samplesPerFrame;
                    Mp3InfoReplayGain mp3InfoReplayGain222 = mp3InfoReplayGain;
                    if (gaplessInfoHolder.encoderDelay != -1) {
                    }
                    gaplessInfoHolder.encoderDelay = i6;
                    gaplessInfoHolder.encoderPadding = i5;
                    this.xingMetadata = mp3InfoReplayGain222 == null ? new Metadata(mp3InfoReplayGain222) : null;
                    long position322 = extractorInput.getPosition();
                    extractorInput.skipFully(mpegAudioUtil$Header2.frameSize);
                    if (i3 != 1483304551) {
                    }
                }
            } else if (i10 == 1) {
                i11 = 13;
            }
            i2 = i11;
            long j92 = 0;
            j2 = -9223372036854775807L;
            if (parsableByteArray3.limit >= i2 + 4) {
            }
            if (parsableByteArray3.limit >= 40) {
            }
            i3 = 0;
            gaplessInfoHolder = this.gaplessInfoHolder;
            if (i3 != 1231971951) {
            }
            mpegAudioUtil$Header2 = mpegAudioUtil$Header3;
            i4 = 0;
            readInt = parsableByteArray3.readInt();
            if ((readInt & 1) == 0) {
            }
            if ((readInt & 2) == 0) {
            }
            if ((readInt & 4) != 4) {
            }
            if ((readInt & 8) != 0) {
            }
            if (parsableByteArray3.bytesLeft() < 24) {
            }
            long j13222 = readUnsignedIntToInt;
            int i22222 = mpegAudioUtil$Header2.frameSize;
            int i23222 = mpegAudioUtil$Header2.sampleRate;
            int i24222 = mpegAudioUtil$Header2.bitrate;
            int i25222 = mpegAudioUtil$Header2.samplesPerFrame;
            Mp3InfoReplayGain mp3InfoReplayGain2222 = mp3InfoReplayGain;
            if (gaplessInfoHolder.encoderDelay != -1) {
            }
            gaplessInfoHolder.encoderDelay = i6;
            gaplessInfoHolder.encoderPadding = i5;
            this.xingMetadata = mp3InfoReplayGain2222 == null ? new Metadata(mp3InfoReplayGain2222) : null;
            long position3222 = extractorInput.getPosition();
            extractorInput.skipFully(mpegAudioUtil$Header2.frameSize);
            if (i3 != 1483304551) {
            }
        } else {
            mpegAudioUtil$Header = mpegAudioUtil$Header3;
            parsableByteArray = parsableByteArray2;
            boolean z3 = true;
            th = null;
            j = 1000000;
            j2 = -9223372036854775807L;
            r4 = z3;
            if (this.firstSamplePosition != 0) {
                long position4 = extractorInput.getPosition();
                long j17 = this.firstSamplePosition;
                r4 = z3;
                if (position4 < j17) {
                    extractorInput.skipFully((int) (j17 - position4));
                    r4 = z3;
                }
            }
        }
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (!peekEndOfStreamOrHeader(extractorInput)) {
                parsableByteArray.setPosition(i8);
                int readInt4 = parsableByteArray.readInt();
                if (((-128000) & readInt4) != (this.synchronizedHeaderData & (-128000)) || AacUtil.getFrameSize(readInt4) == -1) {
                    extractorInput.skipFully(r4);
                    this.synchronizedHeaderData = i8;
                    i = -1;
                    if (i8 == i) {
                        Seeker seeker3 = this.seeker;
                        if (seeker3 instanceof IndexSeeker) {
                            if (seeker3.getDurationUs() != ((this.samplesRead * j) / mpegAudioUtil$Header.sampleRate) + this.basisTimeUs) {
                                ((IndexSeeker) this.seeker).getClass();
                                throw th;
                            }
                        }
                    }
                    return i8;
                }
                mpegAudioUtil$Header.setForHeaderData(readInt4);
                if (this.basisTimeUs == j2) {
                    this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                }
                this.sampleBytesRemaining = mpegAudioUtil$Header.frameSize;
                this.endPositionOfLastSampleRead = extractorInput.getPosition() + mpegAudioUtil$Header.frameSize;
                if (this.seeker instanceof IndexSeeker) {
                    long j18 = ((this.samplesRead + mpegAudioUtil$Header.samplesPerFrame) * j) / mpegAudioUtil$Header.sampleRate;
                    throw th;
                }
            }
            i = -1;
            i8 = -1;
            if (i8 == i) {
            }
            return i8;
        }
        int sampleData = this.currentTrackOutput.sampleData(extractorInput, this.sampleBytesRemaining, (boolean) r4);
        if (sampleData != -1) {
            int i26 = this.sampleBytesRemaining - sampleData;
            this.sampleBytesRemaining = i26;
            if (i26 <= 0) {
                this.currentTrackOutput.sampleMetadata(this.basisTimeUs + ((this.samplesRead * j) / mpegAudioUtil$Header.sampleRate), 1, mpegAudioUtil$Header.frameSize, 0, null);
                this.samplesRead += mpegAudioUtil$Header.samplesPerFrame;
                this.sampleBytesRemaining = i8;
            }
            i = -1;
            if (i8 == i) {
            }
            return i8;
        }
        i = -1;
        i8 = -1;
        if (i8 == i) {
        }
        return i8;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = -9223372036854775807L;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.endPositionOfLastSampleRead = -1L;
        this.seekTimeUs = j2;
        if (this.seeker instanceof IndexSeeker) {
            throw null;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return synchronize(extractorInput, true);
    }

    public final boolean synchronize(ExtractorInput extractorInput, boolean z) {
        int i;
        int i2;
        int frameSize;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            Metadata peekId3Data = this.id3Peeker.peekId3Data(extractorInput, null, PKIFailureInfo.unsupportedVersion);
            this.id3Metadata = peekId3Data;
            if (peekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(peekId3Data);
            }
            i = (int) extractorInput.getPeekPosition();
            if (!z) {
                extractorInput.skipFully(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!peekEndOfStreamOrHeader(extractorInput)) {
                ParsableByteArray parsableByteArray = this.scratch;
                parsableByteArray.setPosition(0);
                int readInt = parsableByteArray.readInt();
                if ((i2 == 0 || ((-128000) & readInt) == (i2 & (-128000))) && (frameSize = AacUtil.getFrameSize(readInt)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.synchronizedHeader.setForHeaderData(readInt);
                        i2 = readInt;
                    }
                    extractorInput.advancePeekPosition(frameSize - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        maybeUpdateCbrDurationToLastSample();
                        Path$$ExternalSyntheticBUOutline0.m$1();
                        return false;
                    }
                    if (z) {
                        extractorInput.resetPeekPosition();
                        extractorInput.advancePeekPosition(i + i5);
                    } else {
                        extractorInput.skipFully(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                maybeUpdateCbrDurationToLastSample();
                Path$$ExternalSyntheticBUOutline0.m$1();
                return false;
            }
        }
        if (z) {
            extractorInput.skipFully(i + i4);
        } else {
            extractorInput.resetPeekPosition();
        }
        this.synchronizedHeaderData = i2;
        return true;
    }
}
