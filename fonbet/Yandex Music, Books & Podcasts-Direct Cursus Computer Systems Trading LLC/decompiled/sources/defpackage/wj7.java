package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.trackselection.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class wj7 implements iih {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public wj7(dkh dkhVar, HandlerThread handlerThread, kih kihVar, uzg uzgVar, boolean z) {
        this.d = dkhVar;
        this.e = new wt1(handlerThread, 1);
        this.f = kihVar;
        this.g = uzgVar;
        this.a = 0;
        this.c = z;
    }

    public static String u(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.iih
    public void a() {
        try {
            if (this.a == 1) {
                ((kih) this.f).shutdown();
                wt1 wt1Var = (wt1) this.e;
                synchronized (wt1Var.b) {
                    wt1Var.n = true;
                    wt1Var.c.quit();
                    wt1Var.a();
                }
            }
            this.a = 2;
            if (this.b) {
                return;
            }
            if (this.c) {
                try {
                    int i = dvt.a;
                    if (i >= 30 && i < 33) {
                        ((dkh) this.d).stop();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.b) {
                if (this.c) {
                    try {
                        int i2 = dvt.a;
                        if (i2 >= 30 && i2 < 33) {
                            ((dkh) this.d).stop();
                        }
                    } finally {
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.iih
    public void b(Bundle bundle) {
        ((kih) this.f).b(bundle);
    }

    @Override // defpackage.iih
    public void c(int i, int i2, long j, int i3) {
        ((kih) this.f).c(i, i2, j, i3);
    }

    @Override // defpackage.iih
    public MediaFormat d() {
        MediaFormat mediaFormat;
        wt1 wt1Var = (wt1) this.e;
        synchronized (wt1Var.b) {
            try {
                mediaFormat = wt1Var.i;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.iih
    public void e() {
        ((dkh) this.d).e();
    }

    @Override // defpackage.iih
    public void f(int i, nv6 nv6Var, long j, int i2) {
        ((kih) this.f).f(i, nv6Var, j, i2);
    }

    @Override // defpackage.iih
    public void flush() {
        ((kih) this.f).flush();
        ((dkh) this.d).flush();
        wt1 wt1Var = (wt1) this.e;
        synchronized (wt1Var.b) {
            wt1Var.m++;
            Handler handler = wt1Var.d;
            int i = dvt.a;
            handler.post(new he0(9, wt1Var));
        }
        ((dkh) this.d).start();
    }

    @Override // defpackage.iih
    public void g(int i) {
        ((dkh) this.d).g(i);
    }

    @Override // defpackage.iih
    public PersistableBundle h() {
        return ((dkh) this.d).h();
    }

    @Override // defpackage.iih
    public ByteBuffer i(int i) {
        return ((dkh) this.d).i(i);
    }

    @Override // defpackage.iih
    public void j(Surface surface) {
        ((dkh) this.d).j(surface);
    }

    @Override // defpackage.iih
    public void k(int i) {
        ((dkh) this.d).k(i);
    }

    @Override // defpackage.iih
    public void l(int i, long j) {
        ((dkh) this.d).l(i, j);
    }

    @Override // defpackage.iih
    public ByteBuffer m(int i) {
        return ((dkh) this.d).m(i);
    }

    @Override // defpackage.iih
    public void o(ckh ckhVar, Handler handler) {
        ((dkh) this.d).s(new qt1(this, ckhVar, 1), handler);
    }

    @Override // defpackage.iih
    public boolean p(hih hihVar) {
        wt1 wt1Var = (wt1) this.e;
        synchronized (wt1Var.b) {
            wt1Var.p = hihVar;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x0045, B:28:0x0041, B:31:0x0047, B:32:0x0049, B:33:0x004a, B:34:0x004c, B:35:0x004d, B:36:0x004f), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x0045, B:28:0x0041, B:31:0x0047, B:32:0x0049, B:33:0x004a, B:34:0x004c, B:35:0x004d, B:36:0x004f), top: B:3:0x000e }] */
    @Override // defpackage.iih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int s() {
        boolean z;
        ((kih) this.f).a();
        wt1 wt1Var = (wt1) this.e;
        synchronized (wt1Var.b) {
            try {
                IllegalStateException illegalStateException = wt1Var.o;
                if (illegalStateException != null) {
                    wt1Var.o = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wt1Var.k;
                if (codecException != null) {
                    wt1Var.k = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wt1Var.l;
                if (cryptoException != null) {
                    wt1Var.l = null;
                    throw cryptoException;
                }
                boolean z2 = true;
                if (wt1Var.m <= 0 && !wt1Var.n) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    ll4 ll4Var = wt1Var.e;
                    if (ll4Var.a != ll4Var.b) {
                        z2 = false;
                    }
                    if (!z2) {
                        i = ll4Var.d();
                    }
                    return i;
                }
                z = true;
                int i2 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0041, B:27:0x0043, B:29:0x0049, B:30:0x0070, B:34:0x0066, B:37:0x0072, B:38:0x0074, B:39:0x0075, B:40:0x0077, B:41:0x0078, B:42:0x007a), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0041, B:27:0x0043, B:29:0x0049, B:30:0x0070, B:34:0x0066, B:37:0x0072, B:38:0x0074, B:39:0x0075, B:40:0x0077, B:41:0x0078, B:42:0x007a), top: B:3:0x000e }] */
    @Override // defpackage.iih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int t(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ((kih) this.f).a();
        wt1 wt1Var = (wt1) this.e;
        synchronized (wt1Var.b) {
            try {
                IllegalStateException illegalStateException = wt1Var.o;
                if (illegalStateException != null) {
                    wt1Var.o = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wt1Var.k;
                if (codecException != null) {
                    wt1Var.k = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wt1Var.l;
                if (cryptoException != null) {
                    wt1Var.l = null;
                    throw cryptoException;
                }
                boolean z2 = true;
                if (wt1Var.m <= 0 && !wt1Var.n) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    ll4 ll4Var = wt1Var.f;
                    if (ll4Var.a != ll4Var.b) {
                        z2 = false;
                    }
                    if (z2) {
                        return -1;
                    }
                    int d = ll4Var.d();
                    if (d >= 0) {
                        vq1.B(wt1Var.i);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) wt1Var.g.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (d == -2) {
                        wt1Var.i = (MediaFormat) wt1Var.h.remove();
                    }
                    return d;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    public void v() {
        ct7 ct7Var = (ct7) this.d;
        int intValue = ((Number) ((yqb) this.e).invoke()).intValue();
        if (this.b && this.a == 1 && intValue == -1) {
            this.c = true;
            return;
        }
        us7 a = ct7Var.a();
        a.r(intValue, true);
        ct7Var.k(new a(a));
        ((uqb) this.g).invoke();
        this.c = false;
    }

    public p6g w() {
        yqb yqbVar = (yqb) this.e;
        if (this.b && this.c) {
            v();
        }
        if (!((ct7) this.d).d().x0.get(((Number) yqbVar.invoke()).intValue())) {
            zsb zsbVar = (zsb) ((xqb) this.f).invoke(yqbVar.invoke());
            if (zsbVar instanceof kk ? true : zsbVar instanceof a8w) {
                dsc s = zsbVar.s();
                su3 bo0Var = zsbVar instanceof su3 ? (su3) zsbVar : new bo0(zsbVar);
                p6s p6sVar = zsbVar instanceof p6s ? (p6s) zsbVar : null;
                return new jxn(s, bo0Var, p6sVar != null ? p6sVar.A : null);
            }
            if (zsbVar != null) {
                return new lxn(zsbVar.b(), zsbVar.r(), zsbVar.s());
            }
        }
        return kxn.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r2 <= (r0.c != null ? r5.a - 1 : 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yvs x() {
        ct7 ct7Var = (ct7) this.d;
        Object invoke = ((yqb) this.e).invoke();
        int intValue = ((Number) invoke).intValue();
        if (intValue >= 0) {
        }
        invoke = null;
        Integer num = (Integer) invoke;
        if (num != null) {
            int intValue2 = num.intValue();
            qah qahVar = ct7Var.c;
            yvs yvsVar = qahVar != null ? qahVar.c[intValue2] : null;
            if (yvsVar != null) {
                return yvsVar;
            }
        }
        return new yvs(new xvs[0]);
    }

    public void y(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        uzg uzgVar;
        wt1 wt1Var = (wt1) this.e;
        dkh dkhVar = (dkh) this.d;
        HandlerThread handlerThread = wt1Var.c;
        vq1.A(wt1Var.d == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        dkhVar.r(wt1Var, handler);
        wt1Var.d = handler;
        Trace.beginSection("configureCodec");
        dkhVar.n(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((kih) this.f).start();
        Trace.beginSection("startCodec");
        dkhVar.start();
        Trace.endSection();
        if (dvt.a >= 35 && (uzgVar = (uzg) this.g) != null) {
            uzgVar.a(dkhVar.q());
        }
        this.a = 1;
    }

    public wj7(ct7 ct7Var, int i, yqb yqbVar, xqb xqbVar, uqb uqbVar, boolean z) {
        ct7Var.getClass();
        this.d = ct7Var;
        this.a = i;
        this.e = yqbVar;
        this.f = xqbVar;
        this.g = uqbVar;
        this.b = z;
    }
}
