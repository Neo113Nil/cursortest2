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
public final class EP implements LP {

    /* renamed from: n, reason: collision with root package name */
    public final MediaCodec f24613n;

    /* renamed from: u, reason: collision with root package name */
    public final IP f24614u;

    /* renamed from: v, reason: collision with root package name */
    public final MP f24615v;

    /* renamed from: w, reason: collision with root package name */
    public final S0.c f24616w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24617x;

    /* renamed from: y, reason: collision with root package name */
    public int f24618y = 0;

    public /* synthetic */ EP(MediaCodec mediaCodec, HandlerThread handlerThread, MP mp, S0.c cVar) {
        this.f24613n = mediaCodec;
        this.f24614u = new IP(handlerThread);
        this.f24615v = mp;
        this.f24616w = cVar;
    }

    public static String c(int i, String str) {
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

    @Override // com.google.android.gms.internal.ads.LP
    public final ByteBuffer D(int i) {
        return this.f24613n.getInputBuffer(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r6 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MediaFormat mediaFormat, Surface surface, int i) {
        S0.c cVar;
        boolean addMediaCodec;
        IP ip = this.f24614u;
        AbstractC2772Sd.H(ip.f25503c == null);
        HandlerThread handlerThread = ip.f25502b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f24613n;
        mediaCodec.setCallback(ip, handler);
        ip.f25503c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        this.f24615v.mo12c();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (cVar = this.f24616w) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) cVar.f2776v;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            AbstractC2772Sd.H(((HashSet) cVar.f2775u).add(mediaCodec));
        }
        this.f24618y = 1;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final ByteBuffer b(int i) {
        return this.f24613n.getOutputBuffer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // com.google.android.gms.internal.ads.LP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d() {
        boolean z3;
        this.f24615v.h();
        IP ip = this.f24614u;
        synchronized (ip.f25501a) {
            try {
                ip.b();
                if (ip.f25511l <= 0 && !ip.f25512m) {
                    z3 = false;
                    int i = -1;
                    if (!z3) {
                        return -1;
                    }
                    C2780Sl c2780Sl = ip.f25504d;
                    int i6 = c2780Sl.f27544a;
                    int i9 = c2780Sl.f27545b;
                    if (!(i6 == i9)) {
                        if (i6 == i9) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c2780Sl.f27546c[i6];
                        c2780Sl.f27544a = (i6 + 1) & c2780Sl.f27547d;
                    }
                    return i;
                }
                z3 = true;
                int i10 = -1;
                if (!z3) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void g(ArrayList arrayList) {
        this.f24613n.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final MediaFormat h() {
        MediaFormat mediaFormat;
        IP ip = this.f24614u;
        synchronized (ip.f25501a) {
            try {
                mediaFormat = ip.f25508h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void i(int i, C3834rN c3834rN, long j6, int i6) {
        this.f24615v.b(i, c3834rN, j6, i6);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void j(Bundle bundle) {
        this.f24615v.g(bundle);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void k() {
        this.f24615v.d();
        MediaCodec mediaCodec = this.f24613n;
        mediaCodec.flush();
        IP ip = this.f24614u;
        synchronized (ip.f25501a) {
            ip.f25511l++;
            Handler handler = ip.f25503c;
            String str = AbstractC3159eu.f29993a;
            handler.post(new RunnableC3807qw(18, ip));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void l() {
        S0.c cVar;
        S0.c cVar2;
        S0.c cVar3;
        try {
            try {
                if (this.f24618y == 1) {
                    this.f24615v.e();
                    IP ip = this.f24614u;
                    synchronized (ip.f25501a) {
                        ip.f25512m = true;
                        ip.f25502b.quit();
                        ip.a();
                    }
                }
                this.f24618y = 2;
                if (this.f24617x) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f24613n.stop();
                }
                if (i >= 35 && (cVar3 = this.f24616w) != null) {
                    cVar3.A(this.f24613n);
                }
                this.f24613n.release();
                this.f24617x = true;
            } catch (Throwable th) {
                if (!this.f24617x) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30 && i6 < 33) {
                        this.f24613n.stop();
                    }
                    if (i6 >= 35 && (cVar2 = this.f24616w) != null) {
                        cVar2.A(this.f24613n);
                    }
                    this.f24613n.release();
                    this.f24617x = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (cVar = this.f24616w) != null) {
                cVar.A(this.f24613n);
            }
            this.f24613n.release();
            this.f24617x = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void m(Surface surface) {
        this.f24613n.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final boolean o(C4019ut c4019ut) {
        IP ip = this.f24614u;
        synchronized (ip.f25501a) {
            ip.f25514o = c4019ut;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void q(int i) {
        this.f24613n.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void r(RunnableC3191fP runnableC3191fP) {
        RunnableC3191fP runnableC3191fP2 = new RunnableC3191fP(1, this, runnableC3191fP);
        IP ip = this.f24614u;
        synchronized (ip.f25501a) {
            ip.b();
            runnableC3191fP2.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void s() {
        this.f24613n.detachOutputSurface();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:26:0x0046, B:27:0x006b, B:30:0x005c, B:33:0x0060, B:34:0x006d, B:35:0x0072), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:26:0x0046, B:27:0x006b, B:30:0x005c, B:33:0x0060, B:34:0x006d, B:35:0x0072), top: B:3:0x000a }] */
    @Override // com.google.android.gms.internal.ads.LP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(MediaCodec.BufferInfo bufferInfo) {
        boolean z3;
        this.f24615v.h();
        IP ip = this.f24614u;
        synchronized (ip.f25501a) {
            try {
                ip.b();
                if (ip.f25511l <= 0 && !ip.f25512m) {
                    z3 = false;
                    if (!z3) {
                        return -1;
                    }
                    C2780Sl c2780Sl = ip.f25505e;
                    int i = c2780Sl.f27544a;
                    int i6 = c2780Sl.f27545b;
                    if (i == i6) {
                        return -1;
                    }
                    if (i == i6) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i9 = c2780Sl.f27546c[i];
                    c2780Sl.f27544a = c2780Sl.f27547d & (i + 1);
                    if (i9 >= 0) {
                        if (ip.f25508h == null) {
                            throw null;
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) ip.f25506f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i9 == -2) {
                        ip.f25508h = (MediaFormat) ip.f25507g.remove();
                        i9 = -2;
                    }
                    return i9;
                }
                z3 = true;
                if (!z3) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void u(int i) {
        this.f24613n.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void x(int i, int i6, int i9, long j6) {
        this.f24615v.i(i, i6, i9, j6);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final void y(int i, long j6) {
        this.f24613n.releaseOutputBuffer(i, j6);
    }
}
