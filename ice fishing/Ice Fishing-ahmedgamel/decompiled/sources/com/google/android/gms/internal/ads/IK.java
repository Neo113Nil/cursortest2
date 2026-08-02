package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class IK extends OutputStream {

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f26231y = new byte[0];

    /* renamed from: v, reason: collision with root package name */
    public int f26234v;

    /* renamed from: x, reason: collision with root package name */
    public int f26236x;

    /* renamed from: n, reason: collision with root package name */
    public final int f26232n = 128;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f26233u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public byte[] f26235w = new byte[128];

    public final synchronized JK b() {
        try {
            int i = this.f26236x;
            byte[] bArr = this.f26235w;
            if (i >= bArr.length) {
                this.f26233u.add(new HK(this.f26235w));
                this.f26235w = f26231y;
            } else if (i > 0) {
                this.f26233u.add(new HK(Arrays.copyOf(bArr, i)));
            }
            this.f26234v += this.f26236x;
            this.f26236x = 0;
        } catch (Throwable th) {
            throw th;
        }
        return JK.u(this.f26233u);
    }

    public final void n(int i) {
        this.f26233u.add(new HK(this.f26235w));
        int length = this.f26234v + this.f26235w.length;
        this.f26234v = length;
        this.f26235w = new byte[Math.max(this.f26232n, Math.max(i, length >>> 1))];
        this.f26236x = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f26234v + this.f26236x;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f26236x == this.f26235w.length) {
                n(1);
            }
            byte[] bArr = this.f26235w;
            int i4 = this.f26236x;
            this.f26236x = i4 + 1;
            bArr[i4] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i4) {
        byte[] bArr2 = this.f26235w;
        int length = bArr2.length;
        int i6 = this.f26236x;
        int i9 = length - i6;
        if (i4 <= i9) {
            System.arraycopy(bArr, i, bArr2, i6, i4);
            this.f26236x += i4;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i9);
        int i10 = i4 - i9;
        n(i10);
        System.arraycopy(bArr, i + i9, this.f26235w, 0, i10);
        this.f26236x = i10;
    }
}
