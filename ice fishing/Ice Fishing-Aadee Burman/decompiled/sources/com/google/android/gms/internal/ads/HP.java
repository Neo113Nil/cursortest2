package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class HP implements MP {

    /* renamed from: n, reason: collision with root package name */
    public final MediaCodec f25292n;

    /* renamed from: u, reason: collision with root package name */
    public final HandlerThread f25293u;

    /* renamed from: v, reason: collision with root package name */
    public FP f25294v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f25295w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final C2781Sm f25296x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25297y;

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayDeque f25291z = new ArrayDeque();

    /* renamed from: A, reason: collision with root package name */
    public static final Object f25290A = new Object();

    public HP(MediaCodec mediaCodec, HandlerThread handlerThread, C2781Sm c2781Sm) {
        this.f25292n = mediaCodec;
        this.f25293u = handlerThread;
        this.f25296x = c2781Sm;
    }

    public static GP a() {
        ArrayDeque arrayDeque = f25291z;
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

    @Override // com.google.android.gms.internal.ads.MP
    public final void b(int i, C3834rN c3834rN, long j6, int i6) {
        int length;
        int length2;
        int length3;
        int length4;
        h();
        GP a9 = a();
        a9.f24971a = i;
        a9.f24972b = 0;
        a9.f24974d = j6;
        a9.f24975e = i6;
        int i9 = c3834rN.f33577f;
        MediaCodec.CryptoInfo cryptoInfo = a9.f24973c;
        cryptoInfo.numSubSamples = i9;
        int[] iArr = c3834rN.f33575d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c3834rN.f33576e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c3834rN.f33573b;
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
        byte[] bArr3 = c3834rN.f33572a;
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
        cryptoInfo.mode = c3834rN.f33574c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c3834rN.f33578g, c3834rN.f33579h));
        FP fp = this.f25294v;
        String str = AbstractC3159eu.f29993a;
        fp.obtainMessage(2, a9).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.MP
    /* renamed from: c */
    public final void mo12c() {
        if (this.f25297y) {
            return;
        }
        HandlerThread handlerThread = this.f25293u;
        handlerThread.start();
        this.f25294v = new FP(this, handlerThread.getLooper());
        this.f25297y = true;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void d() {
        if (this.f25297y) {
            try {
                FP fp = this.f25294v;
                if (fp == null) {
                    throw null;
                }
                fp.removeCallbacksAndMessages(null);
                C2781Sm c2781Sm = this.f25296x;
                synchronized (c2781Sm) {
                    c2781Sm.f27548a = false;
                }
                FP fp2 = this.f25294v;
                if (fp2 == null) {
                    throw null;
                }
                fp2.obtainMessage(3).sendToTarget();
                synchronized (c2781Sm) {
                    while (!c2781Sm.f27548a) {
                        c2781Sm.wait();
                    }
                }
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void e() {
        if (this.f25297y) {
            d();
            this.f25293u.quit();
        }
        this.f25297y = false;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void g(Bundle bundle) {
        h();
        FP fp = this.f25294v;
        String str = AbstractC3159eu.f29993a;
        fp.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void h() {
        RuntimeException runtimeException = (RuntimeException) this.f25295w.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public final void i(int i, int i6, int i9, long j6) {
        h();
        GP a9 = a();
        a9.f24971a = i;
        a9.f24972b = i6;
        a9.f24974d = j6;
        a9.f24975e = i9;
        FP fp = this.f25294v;
        String str = AbstractC3159eu.f29993a;
        fp.obtainMessage(1, a9).sendToTarget();
    }
}
