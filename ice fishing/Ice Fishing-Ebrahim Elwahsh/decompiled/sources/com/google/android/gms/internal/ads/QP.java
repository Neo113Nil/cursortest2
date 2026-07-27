package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class QP implements YP {

    /* renamed from: n, reason: collision with root package name */
    public final MediaCodec f27157n;

    /* renamed from: u, reason: collision with root package name */
    public final VP f27158u;

    /* renamed from: v, reason: collision with root package name */
    public final ZP f27159v;

    /* renamed from: w, reason: collision with root package name */
    public final C4164xG f27160w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27161x;

    /* renamed from: y, reason: collision with root package name */
    public int f27162y = 0;

    public /* synthetic */ QP(MediaCodec mediaCodec, HandlerThread handlerThread, ZP zp, C4164xG c4164xG) {
        this.f27157n = mediaCodec;
        this.f27158u = new VP(handlerThread);
        this.f27159v = zp;
        this.f27160w = c4164xG;
    }

    public static String b(int i, String str) {
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

    @Override // com.google.android.gms.internal.ads.YP
    public final ByteBuffer A(int i) {
        return this.f27157n.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void D(int i) {
        this.f27157n.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void G(int i, int i4, int i9, long j9) {
        this.f27159v.i(i, i4, i9, j9);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void H(int i, long j9) {
        this.f27157n.releaseOutputBuffer(i, j9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r6 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MediaFormat mediaFormat, Surface surface, int i) {
        C4164xG c4164xG;
        boolean addMediaCodec;
        VP vp = this.f27158u;
        PA.T(vp.f28249c == null);
        HandlerThread handlerThread = vp.f28248b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f27157n;
        mediaCodec.setCallback(vp, handler);
        vp.f28249c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        this.f27159v.mo3a();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c4164xG = this.f27160w) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c4164xG.f35133v;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            PA.T(((HashSet) c4164xG.f35132u).add(mediaCodec));
        }
        this.f27162y = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // com.google.android.gms.internal.ads.YP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c() {
        boolean z8;
        this.f27159v.e();
        VP vp = this.f27158u;
        synchronized (vp.f28247a) {
            try {
                vp.b();
                if (vp.f28257l <= 0 && !vp.f28258m) {
                    z8 = false;
                    int i = -1;
                    if (!z8) {
                        return -1;
                    }
                    C2830Vl c2830Vl = vp.f28250d;
                    int i4 = c2830Vl.f28294a;
                    int i9 = c2830Vl.f28295b;
                    if (!(i4 == i9)) {
                        if (i4 == i9) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c2830Vl.f28296c[i4];
                        c2830Vl.f28294a = (i4 + 1) & c2830Vl.f28297d;
                    }
                    return i;
                }
                z8 = true;
                int i10 = -1;
                if (!z8) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final ByteBuffer d(int i) {
        return this.f27157n.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        VP vp = this.f27158u;
        synchronized (vp.f28247a) {
            try {
                mediaFormat = vp.f28254h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void f(ArrayList arrayList) {
        this.f27157n.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void g(Bundle bundle) {
        this.f27159v.d(bundle);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void j() {
        this.f27159v.c();
        MediaCodec mediaCodec = this.f27157n;
        mediaCodec.flush();
        VP vp = this.f27158u;
        synchronized (vp.f28247a) {
            vp.f28257l++;
            Handler handler = vp.f28249c;
            String str = AbstractC3548lu.f32613a;
            handler.post(new RunnableC3873rw(18, vp));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void k() {
        C4164xG c4164xG;
        C4164xG c4164xG2;
        C4164xG c4164xG3;
        try {
            try {
                if (this.f27162y == 1) {
                    this.f27159v.f();
                    VP vp = this.f27158u;
                    synchronized (vp.f28247a) {
                        vp.f28258m = true;
                        vp.f28248b.quit();
                        vp.a();
                    }
                }
                this.f27162y = 2;
                if (this.f27161x) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f27157n.stop();
                }
                if (i >= 35 && (c4164xG3 = this.f27160w) != null) {
                    c4164xG3.T(this.f27157n);
                }
                this.f27157n.release();
                this.f27161x = true;
            } catch (Throwable th) {
                if (!this.f27161x) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30 && i4 < 33) {
                        this.f27157n.stop();
                    }
                    if (i4 >= 35 && (c4164xG2 = this.f27160w) != null) {
                        c4164xG2.T(this.f27157n);
                    }
                    this.f27157n.release();
                    this.f27161x = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (c4164xG = this.f27160w) != null) {
                c4164xG.T(this.f27157n);
            }
            this.f27157n.release();
            this.f27161x = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void l(Surface surface) {
        this.f27157n.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void q() {
        this.f27157n.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void r(RunnableC3903sP runnableC3903sP) {
        RunnableC3903sP runnableC3903sP2 = new RunnableC3903sP(2, this, runnableC3903sP);
        VP vp = this.f27158u;
        synchronized (vp.f28247a) {
            vp.b();
            runnableC3903sP2.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void t(int i, FN fn, long j9, int i4) {
        this.f27159v.h(i, fn, j9, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:26:0x0046, B:27:0x006b, B:30:0x005c, B:33:0x0060, B:34:0x006d, B:35:0x0072), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:26:0x0046, B:27:0x006b, B:30:0x005c, B:33:0x0060, B:34:0x006d, B:35:0x0072), top: B:3:0x000a }] */
    @Override // com.google.android.gms.internal.ads.YP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v(MediaCodec.BufferInfo bufferInfo) {
        boolean z8;
        this.f27159v.e();
        VP vp = this.f27158u;
        synchronized (vp.f28247a) {
            try {
                vp.b();
                if (vp.f28257l <= 0 && !vp.f28258m) {
                    z8 = false;
                    if (!z8) {
                        return -1;
                    }
                    C2830Vl c2830Vl = vp.f28251e;
                    int i = c2830Vl.f28294a;
                    int i4 = c2830Vl.f28295b;
                    if (i == i4) {
                        return -1;
                    }
                    if (i == i4) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i9 = c2830Vl.f28296c[i];
                    c2830Vl.f28294a = c2830Vl.f28297d & (i + 1);
                    if (i9 >= 0) {
                        if (vp.f28254h == null) {
                            throw null;
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) vp.f28252f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i9 == -2) {
                        vp.f28254h = (MediaFormat) vp.f28253g.remove();
                        i9 = -2;
                    }
                    return i9;
                }
                z8 = true;
                if (!z8) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final void w(int i) {
        this.f27157n.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.YP
    public final boolean x(C4086vt c4086vt) {
        VP vp = this.f27158u;
        synchronized (vp.f28247a) {
            vp.f28260o = c4086vt;
        }
        return true;
    }
}
