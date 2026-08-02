package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.TrackOutput;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DiscardingTrackOutput implements TrackOutput {
    public final byte[] readBuffer = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format2) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.skipBytes(i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData$1(DataReader dataReader, int i, boolean z) {
        byte[] bArr = this.readBuffer;
        int read = dataReader.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
    }
}
