package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.ScrollFeedbackProvider;
import android.view.Surface;
import androidx.core.widget.NestedScrollView;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o7j implements dkh, kwo {
    public final Object a;

    public o7j(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.dkh
    public void a() {
        ((MediaCodec) this.a).release();
    }

    @Override // defpackage.dkh
    public void b(Bundle bundle) {
        bundle.getClass();
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // defpackage.dkh
    public void c(int i, int i2, long j, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.dkh
    public MediaFormat d() {
        MediaFormat outputFormat = ((MediaCodec) this.a).getOutputFormat();
        outputFormat.getClass();
        return outputFormat;
    }

    @Override // defpackage.dkh
    public void e() {
        ((MediaCodec) this.a).detachOutputSurface();
    }

    @Override // defpackage.dkh
    public int f() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0L);
    }

    @Override // defpackage.dkh
    public void flush() {
        ((MediaCodec) this.a).flush();
    }

    @Override // defpackage.dkh
    public void g(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    @Override // defpackage.dkh
    public String getName() {
        String name = ((MediaCodec) this.a).getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.dkh
    public PersistableBundle h() {
        PersistableBundle metrics = ((MediaCodec) this.a).getMetrics();
        metrics.getClass();
        return metrics;
    }

    @Override // defpackage.dkh
    public ByteBuffer i(int i) {
        return ((MediaCodec) this.a).getInputBuffer(i);
    }

    @Override // defpackage.dkh
    public void j(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    @Override // defpackage.dkh
    public void k(int i) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.dkh
    public void l(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.dkh
    public ByteBuffer m(int i) {
        return ((MediaCodec) this.a).getOutputBuffer(i);
    }

    @Override // defpackage.dkh
    public void n(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        ((MediaCodec) this.a).configure(mediaFormat, surface, mediaCrypto, i);
    }

    @Override // defpackage.dkh
    public int o(MediaCodec.BufferInfo bufferInfo) {
        bufferInfo.getClass();
        return ((MediaCodec) this.a).dequeueOutputBuffer(bufferInfo, 0L);
    }

    @Override // defpackage.kwo
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
        ((ScrollFeedbackProvider) this.a).onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.kwo
    public void onScrollProgress(int i, int i2, int i3, int i4) {
        ((ScrollFeedbackProvider) this.a).onScrollProgress(i, i2, i3, i4);
    }

    @Override // defpackage.dkh
    public void p(int i, MediaCodec.CryptoInfo cryptoInfo, long j, int i2) {
        cryptoInfo.getClass();
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, cryptoInfo, j, i2);
    }

    @Override // defpackage.dkh
    public MediaCodec q() {
        return (MediaCodec) this.a;
    }

    @Override // defpackage.dkh
    public void r(MediaCodec.Callback callback, Handler handler) {
        ((MediaCodec) this.a).setCallback(callback, handler);
    }

    @Override // defpackage.dkh
    public void reset() {
        ((MediaCodec) this.a).reset();
    }

    @Override // defpackage.dkh
    public void s(MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        ((MediaCodec) this.a).setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    @Override // defpackage.dkh
    public void start() {
        ((MediaCodec) this.a).start();
    }

    @Override // defpackage.dkh
    public void stop() {
        ((MediaCodec) this.a).stop();
    }

    public o7j(MediaCodec mediaCodec) {
        mediaCodec.getClass();
        this.a = mediaCodec;
    }
}
