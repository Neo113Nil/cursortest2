package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class RK extends OutputStream {

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f27339y = new byte[0];

    /* renamed from: v, reason: collision with root package name */
    public int f27342v;

    /* renamed from: x, reason: collision with root package name */
    public int f27344x;

    /* renamed from: n, reason: collision with root package name */
    public final int f27340n = 128;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f27341u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public byte[] f27343w = new byte[128];

    public final synchronized SK b() {
        try {
            int i = this.f27344x;
            byte[] bArr = this.f27343w;
            if (i >= bArr.length) {
                this.f27341u.add(new QK(this.f27343w));
                this.f27343w = f27339y;
            } else if (i > 0) {
                this.f27341u.add(new QK(Arrays.copyOf(bArr, i)));
            }
            this.f27342v += this.f27344x;
            this.f27344x = 0;
        } catch (Throwable th) {
            throw th;
        }
        return SK.u(this.f27341u);
    }

    public final void g(int i) {
        this.f27341u.add(new QK(this.f27343w));
        int length = this.f27342v + this.f27343w.length;
        this.f27342v = length;
        this.f27343w = new byte[Math.max(this.f27340n, Math.max(i, length >>> 1))];
        this.f27344x = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f27342v + this.f27344x;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f27344x == this.f27343w.length) {
                g(1);
            }
            byte[] bArr = this.f27343w;
            int i4 = this.f27344x;
            this.f27344x = i4 + 1;
            bArr[i4] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i4) {
        byte[] bArr2 = this.f27343w;
        int length = bArr2.length;
        int i9 = this.f27344x;
        int i10 = length - i9;
        if (i4 <= i10) {
            System.arraycopy(bArr, i, bArr2, i9, i4);
            this.f27344x += i4;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i9, i10);
        int i11 = i4 - i10;
        g(i11);
        System.arraycopy(bArr, i + i10, this.f27343w, 0, i11);
        this.f27344x = i11;
    }
}
