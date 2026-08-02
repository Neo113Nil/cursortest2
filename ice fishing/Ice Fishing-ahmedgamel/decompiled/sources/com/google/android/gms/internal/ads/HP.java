package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class HP implements NP {

    /* renamed from: n, reason: collision with root package name */
    public final MediaCodec f26064n;

    /* renamed from: u, reason: collision with root package name */
    public final HandlerThread f26065u;

    /* renamed from: v, reason: collision with root package name */
    public FP f26066v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f26067w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final C2818Tm f26068x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26069y;

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayDeque f26063z = new ArrayDeque();

    /* renamed from: A, reason: collision with root package name */
    public static final Object f26062A = new Object();

    public HP(MediaCodec mediaCodec, HandlerThread handlerThread, C2818Tm c2818Tm) {
        this.f26064n = mediaCodec;
        this.f26065u = handlerThread;
        this.f26068x = c2818Tm;
    }

    public static GP a() {
        ArrayDeque arrayDeque = f26063z;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new GP();
                }
                return (GP) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NP
    public final void b(int i, C3857rN c3857rN, long j6, int i4) {
        int length;
        int length2;
        int length3;
        int length4;
        h();
        GP a9 = a();
        a9.f25761a = i;
        a9.f25762b = 0;
        a9.f25764d = j6;
        a9.f25765e = i4;
        int i6 = c3857rN.f34345f;
        MediaCodec.CryptoInfo cryptoInfo = a9.f25763c;
        cryptoInfo.numSubSamples = i6;
        int[] iArr = c3857rN.f34343d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c3857rN.f34344e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c3857rN.f34341b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = c3857rN.f34340a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = c3857rN.f34342c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c3857rN.f34346g, c3857rN.f34347h));
        FP fp = this.f26066v;
        String str = AbstractC3182eu.f30782a;
        fp.obtainMessage(2, a9).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.NP
    /* renamed from: c */
    public final void mo11c() {
        if (this.f26069y) {
            return;
        }
        HandlerThread handlerThread = this.f26065u;
        handlerThread.start();
        this.f26066v = new FP(this, handlerThread.getLooper());
        this.f26069y = true;
    }

    @Override // com.google.android.gms.internal.ads.NP
    public final void d() {
        if (this.f26069y) {
            try {
                FP fp = this.f26066v;
                if (fp == null) {
                    throw null;
                }
                fp.removeCallbacksAndMessages(null);
                C2818Tm c2818Tm = this.f26068x;
                synchronized (c2818Tm) {
                    c2818Tm.f28577a = false;
                }
                FP fp2 = this.f26066v;
                if (fp2 == null) {
                    throw null;
                }
                fp2.obtainMessage(3).sendToTarget();
                synchronized (c2818Tm) {
                    while (!c2818Tm.f28577a) {
                        c2818Tm.wait();
                    }
                }
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NP
    public final void e() {
        if (this.f26069y) {
            d();
            this.f26065u.quit();
        }
        this.f26069y = false;
    }

    @Override // com.google.android.gms.internal.ads.NP
    public final void f(Bundle bundle) {
        h();
        FP fp = this.f26066v;
        String str = AbstractC3182eu.f30782a;
        fp.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.NP
    public final void g(int i, int i4, int i6, long j6) {
        h();
        GP a9 = a();
        a9.f25761a = i;
        a9.f25762b = i4;
        a9.f25764d = j6;
        a9.f25765e = i6;
        FP fp = this.f26066v;
        String str = AbstractC3182eu.f30782a;
        fp.obtainMessage(1, a9).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.NP
    public final void h() {
        RuntimeException runtimeException = (RuntimeException) this.f26067w.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
