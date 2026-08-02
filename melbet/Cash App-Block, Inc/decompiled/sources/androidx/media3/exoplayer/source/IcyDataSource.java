package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.extractor.TrackOutput;
import androidx.tracing.Trace;
import java.util.Map;

/* loaded from: classes3.dex */
public final class IcyDataSource implements DataSource {
    public int bytesUntilMetadata;
    public final ProgressiveMediaPeriod.ExtractingLoadable listener;
    public final int metadataIntervalBytes;
    public final byte[] metadataLengthByteHolder;
    public final DataSource upstream;

    public IcyDataSource(DataSource dataSource, int i, ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable) {
        Trace.checkArgument(i > 0);
        this.upstream = dataSource;
        this.metadataIntervalBytes = i;
        this.listener = extractingLoadable;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(DefaultBandwidthMeter defaultBandwidthMeter) {
        defaultBandwidthMeter.getClass();
        this.upstream.addTransferListener(defaultBandwidthMeter);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.bytesUntilMetadata;
        DataSource dataSource = this.upstream;
        if (i3 == 0) {
            byte[] bArr2 = this.metadataLengthByteHolder;
            int i4 = 0;
            if (dataSource.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = dataSource.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3, i5);
                        ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = this.listener;
                        long max = !extractingLoadable.seenIcyMetadata ? extractingLoadable.seekTimeUs : Math.max(ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), extractingLoadable.seekTimeUs);
                        int bytesLeft = parsableByteArray.bytesLeft();
                        TrackOutput trackOutput = extractingLoadable.icyTrackOutput;
                        trackOutput.getClass();
                        trackOutput.sampleData(bytesLeft, parsableByteArray);
                        trackOutput.sampleMetadata(max, 1, bytesLeft, 0, null);
                        extractingLoadable.seenIcyMetadata = true;
                    }
                }
                this.bytesUntilMetadata = this.metadataIntervalBytes;
            }
            return -1;
        }
        int read2 = dataSource.read(bArr, i, Math.min(this.bytesUntilMetadata, i2));
        if (read2 != -1) {
            this.bytesUntilMetadata -= read2;
        }
        return read2;
    }
}
