package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.iL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3349iL extends InputStream {

    /* renamed from: A, reason: collision with root package name */
    public int f31030A;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f31031n;

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f31032u;

    /* renamed from: v, reason: collision with root package name */
    public int f31033v;

    /* renamed from: w, reason: collision with root package name */
    public int f31034w;

    /* renamed from: x, reason: collision with root package name */
    public int f31035x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f31036y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f31037z;

    public final boolean b() {
        ByteBuffer byteBuffer;
        do {
            this.f31034w++;
            Iterator it = this.f31031n;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f31032u = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f31035x = this.f31032u.position();
        if (this.f31032u.hasArray()) {
            this.f31036y = true;
            this.f31037z = this.f31032u.array();
            this.f31030A = this.f31032u.arrayOffset();
        } else {
            this.f31036y = false;
            this.f31037z = null;
        }
        return true;
    }

    public final void n(int i) {
        int i6 = this.f31035x + i;
        this.f31035x = i6;
        if (i6 == this.f31032u.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f31034w == this.f31033v) {
            return -1;
        }
        if (this.f31036y) {
            int i = this.f31037z[this.f31035x + this.f31030A] & 255;
            n(1);
            return i;
        }
        int i6 = this.f31032u.get(this.f31035x) & 255;
        n(1);
        return i6;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        if (this.f31034w == this.f31033v) {
            return -1;
        }
        int limit = this.f31032u.limit();
        int i9 = this.f31035x;
        int i10 = limit - i9;
        if (i6 > i10) {
            i6 = i10;
        }
        if (this.f31036y) {
            System.arraycopy(this.f31037z, i9 + this.f31030A, bArr, i, i6);
            n(i6);
            return i6;
        }
        int position = this.f31032u.position();
        this.f31032u.position(this.f31035x);
        this.f31032u.get(bArr, i, i6);
        this.f31032u.position(position);
        n(i6);
        return i6;
    }
}
