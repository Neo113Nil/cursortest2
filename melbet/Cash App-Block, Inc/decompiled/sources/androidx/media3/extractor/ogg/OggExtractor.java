package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import coil3.memory.RealStrongMemoryCache$cache$1;
import com.bumptech.glide.GlideBuilder$1;
import java.util.Arrays;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class OggExtractor implements Extractor {
    public ExtractorOutput output;
    public StreamReader streamReader;
    public boolean streamReaderInitialized;

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        int i;
        ParsableByteArray parsableByteArray;
        byte[] bArr;
        this.output.getClass();
        if (this.streamReader == null) {
            if (!sniffInternal(extractorInput)) {
                throw ParserException.createForMalformedContainer(null, "Failed to determine bitstream type");
            }
            extractorInput.resetPeekPosition();
        }
        if (!this.streamReaderInitialized) {
            TrackOutput track = this.output.track(0, 1);
            this.output.endTracks();
            StreamReader streamReader = this.streamReader;
            streamReader.extractorOutput = this.output;
            streamReader.trackOutput = track;
            streamReader.reset(true);
            this.streamReaderInitialized = true;
        }
        StreamReader streamReader2 = this.streamReader;
        OggPacket oggPacket = streamReader2.oggPacket;
        streamReader2.trackOutput.getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        int i2 = streamReader2.state;
        if (i2 != 0) {
            if (i2 == 1) {
                extractorInput.skipFully((int) streamReader2.payloadStartPosition);
                streamReader2.state = 2;
                return 0;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1;
                }
                Path$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            long read = streamReader2.oggSeeker.read(extractorInput);
            if (read >= 0) {
                iadFrame.b = read;
                return 1;
            }
            if (read < -1) {
                streamReader2.onSeekEnd(-(read + 2));
            }
            if (!streamReader2.seekMapSet) {
                SeekMap createSeekMap = streamReader2.oggSeeker.createSeekMap();
                createSeekMap.getClass();
                streamReader2.extractorOutput.seekMap(createSeekMap);
                streamReader2.trackOutput.durationUs(createSeekMap.getDurationUs());
                streamReader2.seekMapSet = true;
            }
            if (streamReader2.lengthOfReadPacket <= 0 && !oggPacket.populate(extractorInput)) {
                streamReader2.state = 3;
                return -1;
            }
            streamReader2.lengthOfReadPacket = 0L;
            ParsableByteArray parsableByteArray2 = oggPacket.packetArray;
            long preparePayload = streamReader2.preparePayload(parsableByteArray2);
            if (preparePayload >= 0) {
                long j = streamReader2.currentGranule;
                if (j + preparePayload >= streamReader2.targetGranule) {
                    streamReader2.trackOutput.sampleData(parsableByteArray2.limit, parsableByteArray2);
                    streamReader2.trackOutput.sampleMetadata((j * 1000000) / streamReader2.sampleRate, 1, parsableByteArray2.limit, 0, null);
                    streamReader2.targetGranule = -1L;
                }
            }
            streamReader2.currentGranule += preparePayload;
            return 0;
        }
        while (true) {
            boolean populate = oggPacket.populate(extractorInput);
            ParsableByteArray parsableByteArray3 = oggPacket.packetArray;
            if (!populate) {
                streamReader2.state = 3;
                return -1;
            }
            long position = extractorInput.getPosition();
            long j2 = streamReader2.payloadStartPosition;
            streamReader2.lengthOfReadPacket = position - j2;
            if (streamReader2.readHeaders(parsableByteArray3, j2, streamReader2.setupData)) {
                streamReader2.payloadStartPosition = extractorInput.getPosition();
            } else {
                Format format2 = (Format) streamReader2.setupData.svg;
                streamReader2.sampleRate = format2.sampleRate;
                if (!streamReader2.formatSet) {
                    streamReader2.trackOutput.format(format2);
                    streamReader2.formatSet = true;
                }
                RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) streamReader2.setupData.renderOptions;
                if (realStrongMemoryCache$cache$1 != null) {
                    streamReader2.oggSeeker = realStrongMemoryCache$cache$1;
                } else {
                    if (extractorInput.getLength() != -1) {
                        OggPageHeader oggPageHeader = oggPacket.pageHeader;
                        boolean z = (oggPageHeader.f894type & 4) != 0;
                        i = 2;
                        long j3 = streamReader2.payloadStartPosition;
                        long length = extractorInput.getLength();
                        long j4 = oggPageHeader.headerSize + oggPageHeader.bodySize;
                        long j5 = oggPageHeader.granulePosition;
                        parsableByteArray = parsableByteArray3;
                        streamReader2.oggSeeker = new DefaultOggSeeker(streamReader2, j3, length, j4, j5, z);
                        streamReader2.state = i;
                        bArr = parsableByteArray.data;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        parsableByteArray.reset(parsableByteArray.limit, Arrays.copyOf(bArr, Math.max(65025, parsableByteArray.limit)));
                        return 0;
                    }
                    streamReader2.oggSeeker = new GlideBuilder$1();
                }
                i = 2;
                parsableByteArray = parsableByteArray3;
                streamReader2.state = i;
                bArr = parsableByteArray.data;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        StreamReader streamReader = this.streamReader;
        if (streamReader != null) {
            OggPacket oggPacket = streamReader.oggPacket;
            OggPageHeader oggPageHeader = oggPacket.pageHeader;
            oggPageHeader.f894type = 0;
            oggPageHeader.granulePosition = 0L;
            oggPageHeader.pageSegmentCount = 0;
            oggPageHeader.headerSize = 0;
            oggPageHeader.bodySize = 0;
            oggPacket.packetArray.reset(0);
            oggPacket.currentSegmentIndex = -1;
            oggPacket.populated = false;
            if (j == 0) {
                streamReader.reset(!streamReader.seekMapSet);
                return;
            }
            if (streamReader.state != 0) {
                long j3 = (streamReader.sampleRate * j2) / 1000000;
                streamReader.targetGranule = j3;
                OggSeeker oggSeeker = streamReader.oggSeeker;
                String str = Util.DEVICE_DEBUG_INFO;
                oggSeeker.startSeek(j3);
                streamReader.state = 2;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        try {
            return sniffInternal(extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean sniffInternal(ExtractorInput extractorInput) {
        boolean z;
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.populate(extractorInput, true) && (oggPageHeader.f894type & 2) == 2) {
            int min = Math.min(oggPageHeader.bodySize, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(min);
            extractorInput.peekFully(0, min, parsableByteArray.data);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563) {
                this.streamReader = new FlacReader();
                return true;
            }
            parsableByteArray.setPosition(0);
            try {
                z = AacUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
            } catch (ParserException unused) {
                z = false;
            }
            if (z) {
                this.streamReader = new VorbisReader();
            } else {
                parsableByteArray.setPosition(0);
                if (OpusReader.peekPacketStartsWith(parsableByteArray, OpusReader.OPUS_ID_HEADER_SIGNATURE)) {
                    this.streamReader = new OpusReader();
                }
            }
            return true;
        }
        return false;
    }
}
