package androidx.media3.decoder.flac;

import androidx.media3.extractor.FlacStreamMetadata;
import defpackage.au1;
import defpackage.g3a;
import defpackage.y6;

/* loaded from: classes.dex */
public final class b extends y6 {
    public final FlacDecoderJni f;

    public b(FlacStreamMetadata flacStreamMetadata, long j, long j2, FlacDecoderJni flacDecoderJni, au1 au1Var) {
        super(new g3a(15, flacStreamMetadata), new a(flacDecoderJni, au1Var), flacStreamMetadata.getDurationUs(), flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        flacDecoderJni.getClass();
        this.f = flacDecoderJni;
    }

    @Override // defpackage.y6
    public final void v(long j, boolean z) {
        if (z) {
            return;
        }
        this.f.reset(j);
    }
}
