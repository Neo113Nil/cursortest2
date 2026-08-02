package androidx.media3.extractor;

import androidx.media3.extractor.TrackOutput;
import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class TrueHdSampleRechunker {
    public int chunkFlags;
    public int chunkOffset;
    public int chunkSampleCount;
    public int chunkSize;
    public long chunkTimeUs;
    public boolean foundSyncframe;
    public final byte[] syncframePrefix = new byte[10];

    public final void outputPendingSampleMetadata(TrackOutput trackOutput, TrackOutput.CryptoData cryptoData) {
        if (this.chunkSampleCount > 0) {
            trackOutput.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, cryptoData);
            this.chunkSampleCount = 0;
        }
    }

    public final void sampleMetadata(TrackOutput trackOutput, long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        Trace.checkState("TrueHD chunk samples must be contiguous in the sample queue.", this.chunkOffset <= i2 + i3);
        if (this.foundSyncframe) {
            int i4 = this.chunkSampleCount;
            int i5 = i4 + 1;
            this.chunkSampleCount = i5;
            if (i4 == 0) {
                this.chunkTimeUs = j;
                this.chunkFlags = i;
                this.chunkSize = 0;
            }
            this.chunkSize += i2;
            this.chunkOffset = i3;
            if (i5 >= 16) {
                outputPendingSampleMetadata(trackOutput, cryptoData);
            }
        }
    }

    public final void startSample(ExtractorInput extractorInput) {
        if (this.foundSyncframe) {
            return;
        }
        byte[] bArr = this.syncframePrefix;
        extractorInput.peekFully(0, 10, bArr);
        extractorInput.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r1 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.foundSyncframe = true;
    }
}
