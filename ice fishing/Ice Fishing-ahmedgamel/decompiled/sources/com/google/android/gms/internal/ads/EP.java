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
public final class EP implements MP {

    /* renamed from: n, reason: collision with root package name */
    public final MediaCodec f25374n;

    /* renamed from: u, reason: collision with root package name */
    public final IP f25375u;

    /* renamed from: v, reason: collision with root package name */
    public final NP f25376v;

    /* renamed from: w, reason: collision with root package name */
    public final LP f25377w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25378x;

    /* renamed from: y, reason: collision with root package name */
    public int f25379y = 0;

    public /* synthetic */ EP(MediaCodec mediaCodec, HandlerThread handlerThread, NP np, LP lp) {
        this.f25374n = mediaCodec;
        this.f25375u = new IP(handlerThread);
        this.f25376v = np;
        this.f25377w = lp;
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

    @Override // com.google.android.gms.internal.ads.MP
    public final void A(int i, int i4, int i6, long j6) {
        this.f25376v.g(i, i4, i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void B(int i, long j6) {
        this.f25374n.releaseOutputBuffer(i, j6);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final ByteBuffer D(int i) {
        return this.f25374n.getInputBuffer(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r6 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MediaFormat mediaFormat, Surface surface, int i) {
        LP lp;
        boolean addMediaCodec;
        IP ip = this.f25375u;
        AbstractC2792Sd.H(ip.f26246c == null);
        HandlerThread handlerThread = ip.f26245b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f25374n;
        mediaCodec.setCallback(ip, handler);
        ip.f26246c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        this.f25376v.mo11c();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (lp = this.f25377w) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) lp.f26917v;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            AbstractC2792Sd.H(((HashSet) lp.f26916u).add(mediaCodec));
        }
        this.f25379y = 1;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final ByteBuffer b(int i) {
        return this.f25374n.getOutputBuffer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // com.google.android.gms.internal.ads.MP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d() {
        boolean z6;
        this.f25376v.h();
        IP ip = this.f25375u;
        synchronized (ip.f26244a) {
            try {
                ip.b();
                if (ip.f26254l <= 0 && !ip.f26255m) {
                    z6 = false;
                    int i = -1;
                    if (!z6) {
                        return -1;
                    }
                    C2817Tl c2817Tl = ip.f26247d;
                    int i4 = c2817Tl.f28573a;
                    int i6 = c2817Tl.f28574b;
                    if (!(i4 == i6)) {
                        if (i4 == i6) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c2817Tl.f28575c[i4];
                        c2817Tl.f28573a = (i4 + 1) & c2817Tl.f28576d;
                    }
                    return i;
                }
                z6 = true;
                int i9 = -1;
                if (!z6) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void g(ArrayList arrayList) {
        this.f25374n.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final MediaFormat h() {
        MediaFormat mediaFormat;
        IP ip = this.f25375u;
        synchronized (ip.f26244a) {
            try {
                mediaFormat = ip.f26251h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void i(int i, C3857rN c3857rN, long j6, int i4) {
        this.f25376v.b(i, c3857rN, j6, i4);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void k() {
        this.f25376v.d();
        MediaCodec mediaCodec = this.f25374n;
        mediaCodec.flush();
        IP ip = this.f25375u;
        synchronized (ip.f26244a) {
            ip.f26254l++;
            Handler handler = ip.f26246c;
            String str = AbstractC3182eu.f30782a;
            handler.post(new RunnableC3830qw(18, ip));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void l() {
        LP lp;
        LP lp2;
        LP lp3;
        try {
            try {
                if (this.f25379y == 1) {
                    this.f25376v.e();
                    IP ip = this.f25375u;
                    synchronized (ip.f26244a) {
                        ip.f26255m = true;
                        ip.f26245b.quit();
                        ip.a();
                    }
                }
                this.f25379y = 2;
                if (this.f25378x) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f25374n.stop();
                }
                if (i >= 35 && (lp3 = this.f25377w) != null) {
                    lp3.l(this.f25374n);
                }
                this.f25374n.release();
                this.f25378x = true;
            } catch (Throwable th) {
                if (!this.f25378x) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30 && i4 < 33) {
                        this.f25374n.stop();
                    }
                    if (i4 >= 35 && (lp2 = this.f25377w) != null) {
                        lp2.l(this.f25374n);
                    }
                    this.f25374n.release();
                    this.f25378x = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (lp = this.f25377w) != null) {
                lp.l(this.f25374n);
            }
            this.f25374n.release();
            this.f25378x = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void m(Bundle bundle) {
        this.f25376v.f(bundle);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void o(Surface surface) {
        this.f25374n.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final boolean p(C4042ut c4042ut) {
        IP ip = this.f25375u;
        synchronized (ip.f26244a) {
            ip.f26257o = c4042ut;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void s() {
        this.f25374n.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void t(int i) {
        this.f25374n.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void u(RunnableC3214fP runnableC3214fP) {
        RunnableC3214fP runnableC3214fP2 = new RunnableC3214fP(1, this, runnableC3214fP);
        IP ip = this.f25375u;
        synchronized (ip.f26244a) {
            ip.b();
            runnableC3214fP2.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:26:0x0046, B:27:0x006b, B:30:0x005c, B:33:0x0060, B:34:0x006d, B:35:0x0072), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:26:0x0046, B:27:0x006b, B:30:0x005c, B:33:0x0060, B:34:0x006d, B:35:0x0072), top: B:3:0x000a }] */
    @Override // com.google.android.gms.internal.ads.MP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v(MediaCodec.BufferInfo bufferInfo) {
        boolean z6;
        this.f25376v.h();
        IP ip = this.f25375u;
        synchronized (ip.f26244a) {
            try {
                ip.b();
                if (ip.f26254l <= 0 && !ip.f26255m) {
                    z6 = false;
                    if (!z6) {
                        return -1;
                    }
                    C2817Tl c2817Tl = ip.f26248e;
                    int i = c2817Tl.f28573a;
                    int i4 = c2817Tl.f28574b;
                    if (i == i4) {
                        return -1;
                    }
                    if (i == i4) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i6 = c2817Tl.f28575c[i];
                    c2817Tl.f28573a = c2817Tl.f28576d & (i + 1);
                    if (i6 >= 0) {
                        if (ip.f26251h == null) {
                            throw null;
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) ip.f26249f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i6 == -2) {
                        ip.f26251h = (MediaFormat) ip.f26250g.remove();
                        i6 = -2;
                    }
                    return i6;
                }
                z6 = true;
                if (!z6) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void y(int i) {
        this.f25374n.setVideoScalingMode(i);
    }
}
