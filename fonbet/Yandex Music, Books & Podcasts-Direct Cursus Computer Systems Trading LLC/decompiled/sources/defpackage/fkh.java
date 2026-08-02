package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fkh implements dkh {
    public final String a;
    public final yfx b;
    public final hr4 c;
    public final MediaCodec d;
    public final int e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;

    public fkh(String str, yfx yfxVar, hr4 hr4Var) {
        Object t7oVar;
        this.a = str;
        this.b = yfxVar;
        this.c = hr4Var;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = MediaCodec.createByCodecName(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        Continuation continuation = null;
        if (a != null) {
            t(a, new ejh(this.a, (String) this.b.c));
            throw null;
        }
        qgg.h0(t7oVar);
        MediaCodec mediaCodec = (MediaCodec) t7oVar;
        this.d = mediaCodec;
        int hashCode = mediaCodec.hashCode();
        this.e = hashCode;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        hr4 hr4Var2 = this.c;
        ajh ajhVar = new ajh(hashCode, new ejh(this.a, (String) this.b.c));
        hr4Var2.getClass();
        x97.y(hr4Var2.b, null, null, new rc4(ajhVar, hr4Var2, continuation, 6), 3);
    }

    @Override // defpackage.dkh
    public final void a() {
        this.d.release();
        xih xihVar = new xih(this.e, this.a);
        hr4 hr4Var = this.c;
        hr4Var.getClass();
        x97.y(hr4Var.b, null, null, new rc4(xihVar, hr4Var, null, 9), 3);
    }

    @Override // defpackage.dkh
    public final void b(Bundle bundle) {
        Object t7oVar;
        bundle.getClass();
        try {
            r7o r7oVar = z7o.b;
            this.d.setParameters(bundle);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, new rjh(bundle));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, int i2, long j, int i3) {
        int i4;
        Object t7oVar;
        Throwable a;
        try {
            r7o r7oVar = z7o.b;
            i4 = i3;
        } catch (Throwable th) {
            th = th;
            i4 = i3;
        }
        try {
            this.d.queueInputBuffer(i, 0, i2, j, i4);
            t7oVar = Unit.a;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th3);
            if (!(t7oVar instanceof t7o)) {
            }
            a = z7o.a(t7oVar);
            if (a != null) {
            }
        }
        if (!(t7oVar instanceof t7o)) {
            if ((i4 & 4) != 0) {
                this.f.compareAndSet(true, false);
                this.c.C(new tih(this.e, ljh.a));
            }
        }
        a = z7o.a(t7oVar);
        if (a != null) {
            return;
        }
        t(a, kjh.a);
        throw null;
    }

    @Override // defpackage.dkh
    public final MediaFormat d() {
        MediaFormat outputFormat = this.d.getOutputFormat();
        outputFormat.getClass();
        return outputFormat;
    }

    @Override // defpackage.dkh
    public final void e() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.detachOutputSurface();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, hjh.a);
        throw null;
    }

    @Override // defpackage.dkh
    public final int f() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(this.d.dequeueInputBuffer(0L));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        fjh fjhVar = fjh.a;
        if (!z) {
            ((Number) t7oVar).intValue();
            if (this.f.compareAndSet(false, true)) {
                this.c.C(new vih(this.e, fjhVar));
            }
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            qgg.h0(t7oVar);
            return ((Number) t7oVar).intValue();
        }
        t(a, fjhVar);
        throw null;
    }

    @Override // defpackage.dkh
    public final void flush() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.flush();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        jjh jjhVar = jjh.a;
        if (!z) {
            this.c.C(new uih(this.e, jjhVar));
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, jjhVar);
        throw null;
    }

    @Override // defpackage.dkh
    public final void g(int i) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.setVideoScalingMode(i);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, new sjh(i));
        throw null;
    }

    @Override // defpackage.dkh
    public final String getName() {
        String name = this.d.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.dkh
    public final PersistableBundle h() {
        PersistableBundle metrics = this.d.getMetrics();
        metrics.getClass();
        return metrics;
    }

    @Override // defpackage.dkh
    public final ByteBuffer i(int i) {
        return this.d.getInputBuffer(i);
    }

    @Override // defpackage.dkh
    public final void j(Surface surface) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.setOutputSurface(surface);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, new qjh(surface.isValid()));
        throw null;
    }

    @Override // defpackage.dkh
    public final void k(int i) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.releaseOutputBuffer(i, false);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, ojh.a);
        throw null;
    }

    @Override // defpackage.dkh
    public final void l(int i, long j) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.releaseOutputBuffer(i, j);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, ojh.a);
        throw null;
    }

    @Override // defpackage.dkh
    public final ByteBuffer m(int i) {
        return this.d.getOutputBuffer(i);
    }

    @Override // defpackage.dkh
    public final void n(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.configure(mediaFormat, surface, mediaCrypto, i);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        yfx yfxVar = this.b;
        if (!z) {
            this.c.G(new yih(this.e, new djh(yfxVar)));
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, new djh(yfxVar));
        throw null;
    }

    @Override // defpackage.dkh
    public final int o(MediaCodec.BufferInfo bufferInfo) {
        Object t7oVar;
        bufferInfo.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(this.d.dequeueOutputBuffer(bufferInfo, 0L));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            qgg.h0(t7oVar);
            return ((Number) t7oVar).intValue();
        }
        t(a, gjh.a);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.dkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i, MediaCodec.CryptoInfo cryptoInfo, long j, int i2) {
        int i3;
        Object t7oVar;
        Throwable a;
        cryptoInfo.getClass();
        try {
            r7o r7oVar = z7o.b;
            i3 = i2;
            try {
                this.d.queueSecureInputBuffer(i, 0, cryptoInfo, j, i3);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th2);
                if (!(t7oVar instanceof t7o)) {
                }
                a = z7o.a(t7oVar);
                if (a != null) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i3 = i2;
        }
        if (!(t7oVar instanceof t7o)) {
            if ((i3 & 4) != 0) {
                this.f.compareAndSet(true, false);
                this.c.C(new tih(this.e, ljh.a));
            }
        }
        a = z7o.a(t7oVar);
        if (a != null) {
            return;
        }
        t(a, mjh.a);
        throw null;
    }

    @Override // defpackage.dkh
    public final MediaCodec q() {
        return this.d;
    }

    @Override // defpackage.dkh
    public final void r(MediaCodec.Callback callback, Handler handler) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.setCallback(callback != null ? new ekh(this, callback) : null, handler);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (!(t7oVar instanceof t7o)) {
            this.g.set(true);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, cjh.a);
        throw null;
    }

    @Override // defpackage.dkh
    public final void reset() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.reset();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        pjh pjhVar = pjh.a;
        if (!z) {
            this.c.G(new ajh(this.e, pjhVar));
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, pjhVar);
        throw null;
    }

    @Override // defpackage.dkh
    public final void s(MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.d.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    @Override // defpackage.dkh
    public final void start() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.start();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        tjh tjhVar = tjh.a;
        if (!z) {
            boolean z2 = this.g.get();
            int i = this.e;
            hr4 hr4Var = this.c;
            if (z2) {
                hr4Var.C(new vih(i, tjhVar));
            } else {
                hr4Var.C(new uih(i, tjhVar));
            }
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, tjhVar);
        throw null;
    }

    @Override // defpackage.dkh
    public final void stop() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            this.d.stop();
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        ujh ujhVar = ujh.a;
        if (!z) {
            this.c.G(new ajh(this.e, ujhVar));
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return;
        }
        t(a, ujhVar);
        throw null;
    }

    public final void t(Throwable th, p1g p1gVar) {
        Object t7oVar;
        Object t7oVar2;
        MediaCodec mediaCodec = this.d;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = mediaCodec.getInputFormat();
        } catch (Throwable th2) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th2);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        MediaFormat mediaFormat = (MediaFormat) t7oVar;
        try {
            t7oVar2 = mediaCodec.getOutputFormat();
        } catch (Throwable th3) {
            r7o r7oVar3 = z7o.b;
            t7oVar2 = new t7o(th3);
        }
        this.c.G(new zih(this.e, this.a, this.b, p1gVar, mediaFormat, (MediaFormat) (t7oVar2 instanceof t7o ? null : t7oVar2), th));
        throw th;
    }
}
