package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.EOFException;
import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DefaultOggSeeker implements OggSeeker {
    public long end;
    public long endGranule;
    public final OggPageHeader pageHeader;
    public final long payloadEndPosition;
    public final long payloadStartPosition;
    public long positionBeforeSeekToEnd;
    public long start;
    public long startGranule;
    public int state;
    public final StreamReader streamReader;
    public long targetGranule;
    public long totalGranules;

    public final class OggSeekMap implements SeekMap {
        public OggSeekMap() {
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            return (DefaultOggSeeker.this.totalGranules * 1000000) / r5.streamReader.sampleRate;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            long j2 = defaultOggSeeker.payloadStartPosition;
            BigInteger valueOf = BigInteger.valueOf((defaultOggSeeker.streamReader.sampleRate * j) / 1000000);
            long j3 = defaultOggSeeker.payloadEndPosition;
            SeekPoint seekPoint = new SeekPoint(j, Util.constrainValue((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(defaultOggSeeker.totalGranules)).longValue() + j2) - 30000, defaultOggSeeker.payloadStartPosition, j3 - 1));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z) {
        Trace.checkArgument(j >= 0 && j2 > j);
        this.streamReader = streamReader;
        this.payloadStartPosition = j;
        this.payloadEndPosition = j2;
        if (j3 == j2 - j || z) {
            this.totalGranules = j4;
            this.state = 4;
        } else {
            this.state = 0;
        }
        this.pageHeader = new OggPageHeader();
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final SeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    @Override // androidx.media3.extractor.ogg.OggSeeker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(ExtractorInput extractorInput) {
        long j;
        long j2;
        long constrainValue;
        int i = this.state;
        long j3 = this.payloadEndPosition;
        OggPageHeader oggPageHeader = this.pageHeader;
        if (i == 0) {
            j = 0;
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.start == this.end) {
                    constrainValue = -1;
                } else {
                    long position2 = extractorInput.getPosition();
                    if (oggPageHeader.skipToNextPage(extractorInput, this.end)) {
                        oggPageHeader.populate(extractorInput, false);
                        extractorInput.resetPeekPosition();
                        long j5 = this.targetGranule;
                        long j6 = oggPageHeader.granulePosition;
                        long j7 = j5 - j6;
                        j2 = 2;
                        int i2 = oggPageHeader.headerSize + oggPageHeader.bodySize;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.end = position2;
                                this.endGranule = j6;
                            } else {
                                this.start = extractorInput.getPosition() + i2;
                                this.startGranule = oggPageHeader.granulePosition;
                            }
                            long j8 = this.end;
                            long j9 = this.start;
                            if (j8 - j9 < 100000) {
                                this.end = j9;
                                constrainValue = j9;
                            } else {
                                long position3 = extractorInput.getPosition() - (i2 * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.end;
                                long j11 = this.start;
                                constrainValue = Util.constrainValue((((j10 - j11) * j7) / (this.endGranule - this.startGranule)) + position3, j11, j10 - 1);
                            }
                        } else {
                            constrainValue = -1;
                        }
                        if (constrainValue == -1) {
                            return constrainValue;
                        }
                        this.state = 3;
                    } else {
                        constrainValue = this.start;
                        if (constrainValue == position2) {
                            a$$ExternalSyntheticBUOutline0.m$4("No ogg page can be found.");
                            return 0L;
                        }
                    }
                }
                j2 = 2;
                if (constrainValue == -1) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    Path$$ExternalSyntheticBUOutline0.m();
                    return 0L;
                }
                j2 = 2;
            }
            while (true) {
                oggPageHeader.skipToNextPage(extractorInput, -1L);
                oggPageHeader.populate(extractorInput, false);
                if (oggPageHeader.granulePosition > this.targetGranule) {
                    extractorInput.resetPeekPosition();
                    this.state = 4;
                    return -(this.startGranule + j2);
                }
                extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
                this.start = extractorInput.getPosition();
                this.startGranule = oggPageHeader.granulePosition;
            }
        } else {
            j = 0;
        }
        oggPageHeader.f894type = 0;
        oggPageHeader.granulePosition = j;
        oggPageHeader.pageSegmentCount = 0;
        oggPageHeader.headerSize = 0;
        oggPageHeader.bodySize = 0;
        if (!oggPageHeader.skipToNextPage(extractorInput, -1L)) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0L;
        }
        oggPageHeader.populate(extractorInput, false);
        extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        long j12 = oggPageHeader.granulePosition;
        while ((oggPageHeader.f894type & 4) != 4 && oggPageHeader.skipToNextPage(extractorInput, -1L) && extractorInput.getPosition() < j3 && oggPageHeader.populate(extractorInput, true)) {
            try {
                extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
                j12 = oggPageHeader.granulePosition;
            } catch (EOFException unused) {
            }
        }
        this.totalGranules = j12;
        this.state = 4;
        return this.positionBeforeSeekToEnd;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final void startSeek(long j) {
        this.targetGranule = Util.constrainValue(j, 0L, this.totalGranules - 1);
        this.state = 2;
        this.start = this.payloadStartPosition;
        this.end = this.payloadEndPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }
}
