package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import coil3.svg.internal.AndroidSvg;

/* loaded from: classes3.dex */
public interface SampleStream {
    boolean isReady();

    void maybeThrowError();

    int readData(AndroidSvg androidSvg, DecoderInputBuffer decoderInputBuffer, int i);

    int skipData(long j);
}
