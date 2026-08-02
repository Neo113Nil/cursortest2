package androidx.media3.extractor.flv;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisBitArray;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class FlvExtractor implements Extractor {
    public AudioTagPayloadReader audioReader;
    public int bytesToNextTagHeader;
    public ExtractorOutput extractorOutput;
    public long mediaTagTimestampOffsetUs;
    public final ScriptTagPayloadReader metadataReader;
    public boolean outputFirstSample;
    public boolean outputSeekMap;
    public int state;
    public int tagDataSize;
    public long tagTimestampUs;
    public int tagType;
    public VideoTagPayloadReader videoReader;
    public final ParsableByteArray scratch = new ParsableByteArray(4);
    public final ParsableByteArray headerBuffer = new ParsableByteArray(9);
    public final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
    public final ParsableByteArray tagData = new ParsableByteArray();

    public FlvExtractor() {
        ScriptTagPayloadReader scriptTagPayloadReader = new ScriptTagPayloadReader(new DiscardingTrackOutput());
        scriptTagPayloadReader.durationUs = -9223372036854775807L;
        scriptTagPayloadReader.keyFrameTimesUs = new long[0];
        scriptTagPayloadReader.keyFrameTagPositions = new long[0];
        this.metadataReader = scriptTagPayloadReader;
        this.state = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public final ParsableByteArray prepareTagData(ExtractorInput extractorInput) {
        int i = this.tagDataSize;
        ParsableByteArray parsableByteArray = this.tagData;
        byte[] bArr = parsableByteArray.data;
        if (i > bArr.length) {
            parsableByteArray.reset(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            parsableByteArray.setPosition(0);
        }
        parsableByteArray.setLimit(this.tagDataSize);
        extractorInput.readFully(parsableByteArray.data, 0, this.tagDataSize);
        return parsableByteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        int i2;
        this.extractorOutput.getClass();
        while (true) {
            int i3 = this.state;
            boolean z3 = true;
            if (i3 == 1) {
                ParsableByteArray parsableByteArray = this.headerBuffer;
                if (!extractorInput.readFully(parsableByteArray.data, 0, 9, true)) {
                    return -1;
                }
                parsableByteArray.setPosition(0);
                parsableByteArray.skipBytes(4);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                boolean z4 = (readUnsignedByte & 4) != 0;
                boolean z5 = (readUnsignedByte & 1) != 0;
                if (z4 && this.audioReader == null) {
                    this.audioReader = new AudioTagPayloadReader(this.extractorOutput.track(8, 1));
                }
                if (z5 && this.videoReader == null) {
                    i2 = 2;
                    this.videoReader = new VideoTagPayloadReader(this.extractorOutput.track(9, 2));
                } else {
                    i2 = 2;
                }
                this.extractorOutput.endTracks();
                this.bytesToNextTagHeader = parsableByteArray.readInt() - 5;
                this.state = i2;
            } else if (i3 == 2) {
                extractorInput.skipFully(this.bytesToNextTagHeader);
                this.bytesToNextTagHeader = 0;
                this.state = 3;
            } else if (i3 == 3) {
                ParsableByteArray parsableByteArray2 = this.tagHeaderBuffer;
                if (!extractorInput.readFully(parsableByteArray2.data, 0, 11, true)) {
                    return -1;
                }
                parsableByteArray2.setPosition(0);
                this.tagType = parsableByteArray2.readUnsignedByte();
                this.tagDataSize = parsableByteArray2.readUnsignedInt24();
                this.tagTimestampUs = parsableByteArray2.readUnsignedInt24();
                this.tagTimestampUs = ((parsableByteArray2.readUnsignedByte() << 24) | this.tagTimestampUs) * 1000;
                parsableByteArray2.skipBytes(3);
                this.state = 4;
            } else {
                if (i3 != 4) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return 0;
                }
                boolean z6 = this.outputFirstSample;
                ScriptTagPayloadReader scriptTagPayloadReader = this.metadataReader;
                if (z6) {
                    j = this.mediaTagTimestampOffsetUs + this.tagTimestampUs;
                } else if (scriptTagPayloadReader.durationUs == -9223372036854775807L) {
                    j2 = 0;
                    i = this.tagType;
                    if (i == 8 || this.audioReader == null) {
                        int i4 = 4;
                        if (i != 9 && this.videoReader != null) {
                            if (!this.outputSeekMap) {
                                this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
                                this.outputSeekMap = true;
                            }
                            VideoTagPayloadReader videoTagPayloadReader = this.videoReader;
                            ParsableByteArray prepareTagData = prepareTagData(extractorInput);
                            videoTagPayloadReader.getClass();
                            int readUnsignedByte2 = prepareTagData.readUnsignedByte();
                            int i5 = (readUnsignedByte2 >> 4) & 15;
                            int i6 = readUnsignedByte2 & 15;
                            if (i6 != 7) {
                                final String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "Video format not supported: ");
                                throw new ParserException(m) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            videoTagPayloadReader.frameType = i5;
                            if (i5 != 5) {
                                ParsableByteArray parsableByteArray3 = videoTagPayloadReader.nalStartCode;
                                TrackOutput trackOutput = (TrackOutput) videoTagPayloadReader.data;
                                ParsableByteArray parsableByteArray4 = videoTagPayloadReader.nalLength;
                                int readUnsignedByte3 = prepareTagData.readUnsignedByte();
                                prepareTagData.maybeAssertAtLeastBytesLeftForLegacyMethod(3);
                                byte[] bArr = prepareTagData.data;
                                int i7 = prepareTagData.position;
                                int i8 = i7 + 1;
                                prepareTagData.position = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                prepareTagData.position = i7 + 2;
                                int i10 = ((bArr[i8] & 255) << 8) | i9;
                                prepareTagData.position = i7 + 3;
                                long j3 = ((i10 | (bArr[r8] & 255)) * 1000) + j2;
                                if (readUnsignedByte3 == 0 && !videoTagPayloadReader.hasOutputFormat) {
                                    byte[] bArr2 = new byte[prepareTagData.bytesLeft()];
                                    ParsableByteArray parsableByteArray5 = new ParsableByteArray(bArr2);
                                    prepareTagData.readBytes(0, prepareTagData.bytesLeft(), bArr2);
                                    AvcConfig parse = AvcConfig.parse(parsableByteArray5);
                                    videoTagPayloadReader.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                                    Format.Builder builder = new Format.Builder();
                                    builder.containerMimeType = MimeTypes.normalizeMimeType("video/x-flv");
                                    builder.sampleMimeType = MimeTypes.normalizeMimeType("video/avc");
                                    builder.codecs = parse.codecs;
                                    builder.width = parse.width;
                                    builder.height = parse.height;
                                    builder.pixelWidthHeightRatio = parse.pixelWidthHeightRatio;
                                    builder.initializationData = parse.initializationData;
                                    NavAction$$ExternalSyntheticOutline0.m(builder, trackOutput);
                                    videoTagPayloadReader.hasOutputFormat = true;
                                } else if (readUnsignedByte3 == 1 && videoTagPayloadReader.hasOutputFormat) {
                                    int i11 = videoTagPayloadReader.frameType == 1 ? 1 : 0;
                                    if (videoTagPayloadReader.hasOutputKeyframe || i11 != 0) {
                                        byte[] bArr3 = parsableByteArray4.data;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i12 = 4 - videoTagPayloadReader.nalUnitLengthFieldLength;
                                        int i13 = 0;
                                        while (prepareTagData.bytesLeft() > 0) {
                                            prepareTagData.readBytes(i12, videoTagPayloadReader.nalUnitLengthFieldLength, parsableByteArray4.data);
                                            parsableByteArray4.setPosition(0);
                                            int readUnsignedIntToInt = parsableByteArray4.readUnsignedIntToInt();
                                            parsableByteArray3.setPosition(0);
                                            trackOutput.sampleData(i4, parsableByteArray3);
                                            trackOutput.sampleData(readUnsignedIntToInt, prepareTagData);
                                            i13 = i13 + 4 + readUnsignedIntToInt;
                                            i4 = 4;
                                        }
                                        ((TrackOutput) videoTagPayloadReader.data).sampleMetadata(j3, i11, i13, 0, null);
                                        videoTagPayloadReader.hasOutputKeyframe = true;
                                        z2 = true;
                                        if (z2) {
                                            z = true;
                                            z3 = true;
                                        }
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                }
                            }
                        } else if (i == 18 || this.outputSeekMap) {
                            extractorInput.skipFully(this.tagDataSize);
                            z = false;
                            z3 = false;
                        } else {
                            ParsableByteArray prepareTagData2 = prepareTagData(extractorInput);
                            scriptTagPayloadReader.getClass();
                            if (prepareTagData2.readUnsignedByte() == 2 && "onMetaData".equals(ScriptTagPayloadReader.readAmfString(prepareTagData2)) && prepareTagData2.bytesLeft() != 0 && prepareTagData2.readUnsignedByte() == 8) {
                                HashMap readAmfEcmaArray = ScriptTagPayloadReader.readAmfEcmaArray(prepareTagData2);
                                Object obj = readAmfEcmaArray.get("duration");
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        scriptTagPayloadReader.durationUs = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = readAmfEcmaArray.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        scriptTagPayloadReader.keyFrameTimesUs = new long[size];
                                        scriptTagPayloadReader.keyFrameTagPositions = new long[size];
                                        for (int i14 = 0; i14 < size; i14++) {
                                            Object obj5 = list.get(i14);
                                            Object obj6 = list2.get(i14);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                scriptTagPayloadReader.keyFrameTimesUs = new long[0];
                                                scriptTagPayloadReader.keyFrameTagPositions = new long[0];
                                                break;
                                            }
                                            scriptTagPayloadReader.keyFrameTimesUs[i14] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            scriptTagPayloadReader.keyFrameTagPositions[i14] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j4 = scriptTagPayloadReader.durationUs;
                            if (j4 != -9223372036854775807L) {
                                this.extractorOutput.seekMap(new IndexSeekMap(j4, scriptTagPayloadReader.keyFrameTagPositions, scriptTagPayloadReader.keyFrameTimesUs));
                                this.outputSeekMap = true;
                            }
                        }
                        z = false;
                        z3 = true;
                    } else {
                        if (!this.outputSeekMap) {
                            this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
                            this.outputSeekMap = true;
                        }
                        AudioTagPayloadReader audioTagPayloadReader = this.audioReader;
                        ParsableByteArray prepareTagData3 = prepareTagData(extractorInput);
                        TrackOutput trackOutput2 = (TrackOutput) audioTagPayloadReader.data;
                        if (audioTagPayloadReader.hasParsedAudioDataHeader) {
                            prepareTagData3.skipBytes(1);
                        } else {
                            int readUnsignedByte4 = prepareTagData3.readUnsignedByte();
                            int i15 = (readUnsignedByte4 >> 4) & 15;
                            audioTagPayloadReader.audioFormat = i15;
                            if (i15 == 2) {
                                int i16 = AudioTagPayloadReader.AUDIO_SAMPLING_RATE_TABLE[(readUnsignedByte4 >> 2) & 3];
                                Format.Builder builder2 = new Format.Builder();
                                builder2.containerMimeType = MimeTypes.normalizeMimeType("video/x-flv");
                                builder2.sampleMimeType = MimeTypes.normalizeMimeType("audio/mpeg");
                                builder2.channelCount = 1;
                                builder2.sampleRate = i16;
                                NavAction$$ExternalSyntheticOutline0.m(builder2, trackOutput2);
                                audioTagPayloadReader.hasOutputFormat = true;
                            } else if (i15 == 7 || i15 == 8) {
                                String str = i15 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                Format.Builder builder3 = new Format.Builder();
                                builder3.containerMimeType = MimeTypes.normalizeMimeType("video/x-flv");
                                builder3.sampleMimeType = MimeTypes.normalizeMimeType(str);
                                builder3.channelCount = 1;
                                builder3.sampleRate = 8000;
                                NavAction$$ExternalSyntheticOutline0.m(builder3, trackOutput2);
                                audioTagPayloadReader.hasOutputFormat = true;
                            } else if (i15 != 10) {
                                final String str2 = "Audio format not supported: " + audioTagPayloadReader.audioFormat;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            audioTagPayloadReader.hasParsedAudioDataHeader = true;
                        }
                        TrackOutput trackOutput3 = (TrackOutput) audioTagPayloadReader.data;
                        if (audioTagPayloadReader.audioFormat == 2) {
                            int bytesLeft = prepareTagData3.bytesLeft();
                            trackOutput3.sampleData(bytesLeft, prepareTagData3);
                            ((TrackOutput) audioTagPayloadReader.data).sampleMetadata(j2, 1, bytesLeft, 0, null);
                        } else {
                            int readUnsignedByte5 = prepareTagData3.readUnsignedByte();
                            if (readUnsignedByte5 == 0 && !audioTagPayloadReader.hasOutputFormat) {
                                int bytesLeft2 = prepareTagData3.bytesLeft();
                                byte[] bArr4 = new byte[bytesLeft2];
                                prepareTagData3.readBytes(0, bytesLeft2, bArr4);
                                AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(new VorbisBitArray(bArr4, bytesLeft2), false);
                                Format.Builder builder4 = new Format.Builder();
                                builder4.containerMimeType = MimeTypes.normalizeMimeType("video/x-flv");
                                builder4.sampleMimeType = MimeTypes.normalizeMimeType("audio/mp4a-latm");
                                builder4.codecs = parseAudioSpecificConfig.codecs;
                                builder4.channelCount = parseAudioSpecificConfig.channelCount;
                                builder4.sampleRate = parseAudioSpecificConfig.sampleRateHz;
                                builder4.initializationData = Collections.singletonList(bArr4);
                                NavAction$$ExternalSyntheticOutline0.m(builder4, trackOutput3);
                                audioTagPayloadReader.hasOutputFormat = true;
                            } else if (audioTagPayloadReader.audioFormat != 10 || readUnsignedByte5 == 1) {
                                int bytesLeft3 = prepareTagData3.bytesLeft();
                                trackOutput3.sampleData(bytesLeft3, prepareTagData3);
                                ((TrackOutput) audioTagPayloadReader.data).sampleMetadata(j2, 1, bytesLeft3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.outputFirstSample && z) {
                        this.outputFirstSample = true;
                        this.mediaTagTimestampOffsetUs = scriptTagPayloadReader.durationUs != -9223372036854775807L ? -this.tagTimestampUs : 0L;
                    }
                    this.bytesToNextTagHeader = 4;
                    this.state = 2;
                    if (!z3) {
                        return 0;
                    }
                } else {
                    j = this.tagTimestampUs;
                }
                j2 = j;
                i = this.tagType;
                if (i == 8) {
                }
                int i42 = 4;
                if (i != 9) {
                }
                if (i == 18) {
                }
                extractorInput.skipFully(this.tagDataSize);
                z = false;
                z3 = false;
                if (!this.outputFirstSample) {
                    this.outputFirstSample = true;
                    this.mediaTagTimestampOffsetUs = scriptTagPayloadReader.durationUs != -9223372036854775807L ? -this.tagTimestampUs : 0L;
                }
                this.bytesToNextTagHeader = 4;
                this.state = 2;
                if (!z3) {
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.state = 1;
            this.outputFirstSample = false;
        } else {
            this.state = 3;
        }
        this.bytesToNextTagHeader = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = this.scratch;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(parsableByteArray.data, 0, 3, false);
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readUnsignedInt24() == 4607062) {
            defaultExtractorInput.peekFully(parsableByteArray.data, 0, 2, false);
            parsableByteArray.setPosition(0);
            if ((parsableByteArray.readUnsignedShort() & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE) == 0) {
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
                parsableByteArray.setPosition(0);
                int readInt = parsableByteArray.readInt();
                defaultExtractorInput.peekBufferPosition = 0;
                defaultExtractorInput.advancePeekPosition(readInt, false);
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
                parsableByteArray.setPosition(0);
                if (parsableByteArray.readInt() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
