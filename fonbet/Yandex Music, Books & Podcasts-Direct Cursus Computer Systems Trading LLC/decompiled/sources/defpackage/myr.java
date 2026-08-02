package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class myr implements iih {
    public final MediaCodec a;
    public final uzg b;

    public myr(MediaCodec mediaCodec, uzg uzgVar) {
        this.a = mediaCodec;
        this.b = uzgVar;
        if (dvt.a < 35 || uzgVar == null) {
            return;
        }
        uzgVar.a(mediaCodec);
    }

    @Override // defpackage.iih
    public final void a() {
        uzg uzgVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = dvt.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && uzgVar != null) {
                uzgVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (dvt.a >= 35 && uzgVar != null) {
                uzgVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.iih
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.iih
    public final void c(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.iih
    public final MediaFormat d() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.iih
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.iih
    public final void f(int i, nv6 nv6Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, nv6Var.i, j, i2);
    }

    @Override // defpackage.iih
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.iih
    public final void g(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.iih
    public final PersistableBundle h() {
        return this.a.getMetrics();
    }

    @Override // defpackage.iih
    public final ByteBuffer i(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.iih
    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.iih
    public final void k(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.iih
    public final void l(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.iih
    public final ByteBuffer m(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.iih
    public final void o(ckh ckhVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new qt1(this, ckhVar, 3), handler);
    }

    @Override // defpackage.iih
    public final int s() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.iih
    public final int t(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }
}
