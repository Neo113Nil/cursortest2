package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class IK extends OutputStream {

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f25488y = new byte[0];

    /* renamed from: v, reason: collision with root package name */
    public int f25491v;

    /* renamed from: x, reason: collision with root package name */
    public int f25493x;

    /* renamed from: n, reason: collision with root package name */
    public final int f25489n = 128;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f25490u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public byte[] f25492w = new byte[128];

    public final synchronized JK b() {
        try {
            int i = this.f25493x;
            byte[] bArr = this.f25492w;
            if (i >= bArr.length) {
                this.f25490u.add(new HK(this.f25492w));
                this.f25492w = f25488y;
            } else if (i > 0) {
                this.f25490u.add(new HK(Arrays.copyOf(bArr, i)));
            }
            this.f25491v += this.f25493x;
            this.f25493x = 0;
        } catch (Throwable th) {
            throw th;
        }
        return JK.u(this.f25490u);
    }

    public final void n(int i) {
        this.f25490u.add(new HK(this.f25492w));
        int length = this.f25491v + this.f25492w.length;
        this.f25491v = length;
        this.f25492w = new byte[Math.max(this.f25489n, Math.max(i, length >>> 1))];
        this.f25493x = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f25491v + this.f25493x;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f25493x == this.f25492w.length) {
                n(1);
            }
            byte[] bArr = this.f25492w;
            int i6 = this.f25493x;
            this.f25493x = i6 + 1;
            bArr[i6] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i6) {
        byte[] bArr2 = this.f25492w;
        int length = bArr2.length;
        int i9 = this.f25493x;
        int i10 = length - i9;
        if (i6 <= i10) {
            System.arraycopy(bArr, i, bArr2, i9, i6);
            this.f25493x += i6;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i9, i10);
        int i11 = i6 - i10;
        n(i11);
        System.arraycopy(bArr, i + i10, this.f25492w, 0, i11);
        this.f25493x = i11;
    }
}
