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
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class st1 implements iih {
    public final MediaCodec a;
    public final wt1 b;
    public final kih c;
    public final uzg d;
    public boolean e;
    public int f = 0;

    public st1(MediaCodec mediaCodec, HandlerThread handlerThread, kih kihVar, uzg uzgVar) {
        this.a = mediaCodec;
        this.b = new wt1(handlerThread, 0);
        this.c = kihVar;
        this.d = uzgVar;
    }

    public static void u(st1 st1Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        uzg uzgVar;
        wt1 wt1Var = st1Var.b;
        MediaCodec mediaCodec = st1Var.a;
        HandlerThread handlerThread = wt1Var.c;
        vq1.A(wt1Var.d == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(wt1Var, handler);
        wt1Var.d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        st1Var.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (dvt.a >= 35 && (uzgVar = st1Var.d) != null) {
            uzgVar.a(mediaCodec);
        }
        st1Var.f = 1;
    }

    public static String v(int i, String str) {
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
    public final void a() {
        uzg uzgVar;
        uzg uzgVar2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                wt1 wt1Var = this.b;
                synchronized (wt1Var.b) {
                    wt1Var.n = true;
                    wt1Var.c.quit();
                    wt1Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = dvt.a;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (uzgVar2 = this.d) != null) {
                    uzgVar2.c(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = dvt.a;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (uzgVar = this.d) != null) {
                        uzgVar.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.iih
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.iih
    public final void c(int i, int i2, long j, int i3) {
        this.c.c(i, i2, j, i3);
    }

    @Override // defpackage.iih
    public final MediaFormat d() {
        MediaFormat mediaFormat;
        wt1 wt1Var = this.b;
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
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.iih
    public final void f(int i, nv6 nv6Var, long j, int i2) {
        this.c.f(i, nv6Var, j, i2);
    }

    @Override // defpackage.iih
    public final void flush() {
        this.c.flush();
        this.a.flush();
        wt1 wt1Var = this.b;
        synchronized (wt1Var.b) {
            wt1Var.m++;
            Handler handler = wt1Var.d;
            int i = dvt.a;
            handler.post(new he0(4, wt1Var));
        }
        this.a.start();
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
        this.a.setOnFrameRenderedListener(new qt1(this, ckhVar, 0), handler);
    }

    @Override // defpackage.iih
    public final boolean p(hih hihVar) {
        wt1 wt1Var = this.b;
        synchronized (wt1Var.b) {
            wt1Var.p = hihVar;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0030, B:26:0x0041, B:28:0x003d, B:31:0x0043, B:32:0x0045, B:33:0x0046, B:34:0x0048, B:35:0x0049, B:36:0x004b), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0030, B:26:0x0041, B:28:0x003d, B:31:0x0043, B:32:0x0045, B:33:0x0046, B:34:0x0048, B:35:0x0049, B:36:0x004b), top: B:3:0x000a }] */
    @Override // defpackage.iih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s() {
        boolean z;
        this.c.a();
        wt1 wt1Var = this.b;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0031, B:25:0x003d, B:27:0x003f, B:29:0x0045, B:30:0x006c, B:34:0x0062, B:37:0x006e, B:38:0x0070, B:39:0x0071, B:40:0x0073, B:41:0x0074, B:42:0x0076), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x0017, B:12:0x0021, B:18:0x002c, B:21:0x0031, B:25:0x003d, B:27:0x003f, B:29:0x0045, B:30:0x006c, B:34:0x0062, B:37:0x006e, B:38:0x0070, B:39:0x0071, B:40:0x0073, B:41:0x0074, B:42:0x0076), top: B:3:0x000a }] */
    @Override // defpackage.iih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        this.c.a();
        wt1 wt1Var = this.b;
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
}
