package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* loaded from: classes3.dex */
public interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i, int i2, int i3, long j);

    void queueSecureInputBuffer(int i, CryptoInfo cryptoInfo, long j, int i2);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();
}
