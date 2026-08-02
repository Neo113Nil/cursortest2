package androidx.media3.extractor.text;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SubtitleTranscodingTrackOutput implements TrackOutput {
    public Format currentFormat;
    public SubtitleParser currentSubtitleParser;
    public final TrackOutput delegate;
    public boolean shouldSuppressParsingErrors;
    public final SubtitleParser.Factory subtitleParserFactory;
    public int sampleDataStart = 0;
    public int sampleDataEnd = 0;
    public byte[] sampleData = Util.EMPTY_BYTE_ARRAY;
    public final ParsableByteArray parsableScratch = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    public final void ensureSampleDataCapacity(int i) {
        int length = this.sampleData.length;
        int i2 = this.sampleDataEnd;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.sampleDataStart;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i3);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i3;
        this.sampleData = bArr2;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format2) {
        format2.sampleMimeType.getClass();
        String str = format2.sampleMimeType;
        Trace.checkArgument(MimeTypes.getTrackType(str) == 3);
        boolean equals = format2.equals(this.currentFormat);
        SubtitleParser.Factory factory = this.subtitleParserFactory;
        if (!equals) {
            this.currentFormat = format2;
            this.currentSubtitleParser = factory.supportsFormat(format2) ? factory.create(format2) : null;
        }
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        TrackOutput trackOutput = this.delegate;
        if (subtitleParser == null) {
            trackOutput.format(format2);
            return;
        }
        Format.Builder buildUpon = format2.buildUpon();
        buildUpon.sampleMimeType = MimeTypes.normalizeMimeType("application/x-media3-cues");
        buildUpon.codecs = str;
        buildUpon.subsampleOffsetUs = Long.MAX_VALUE;
        buildUpon.cueReplacementBehavior = factory.getCueReplacementBehavior(format2);
        NavAction$$ExternalSyntheticOutline0.m(buildUpon, trackOutput);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i, i2);
            return;
        }
        ensureSampleDataCapacity(i);
        parsableByteArray.readBytes(this.sampleDataEnd, i, this.sampleData);
        this.sampleDataEnd += i;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData$1(DataReader dataReader, int i, boolean z) {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData$1(dataReader, i, z);
        }
        ensureSampleDataCapacity(i);
        int read = dataReader.read(this.sampleData, this.sampleDataEnd, i);
        if (read != -1) {
            this.sampleDataEnd += read;
            return read;
        }
        if (z) {
            return -1;
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        int i4;
        int i5;
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleMetadata(j, i, i2, i3, cryptoData);
            return;
        }
        Trace.checkArgument("DRM on subtitles is not supported", cryptoData == null);
        int i6 = (this.sampleDataEnd - i3) - i2;
        try {
            i4 = i6;
        } catch (RuntimeException e) {
            e = e;
            i4 = i6;
        }
        try {
            this.currentSubtitleParser.parse(this.sampleData, i4, i2, SubtitleParser.OutputOptions.ALL, new SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0(this, j, i));
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!this.shouldSuppressParsingErrors) {
                throw runtimeException;
            }
            Log.w("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i5 = i4 + i2;
            this.sampleDataStart = i5;
            if (i5 != this.sampleDataEnd) {
            }
        }
        i5 = i4 + i2;
        this.sampleDataStart = i5;
        if (i5 != this.sampleDataEnd) {
            this.sampleDataStart = 0;
            this.sampleDataEnd = 0;
        }
    }
}
