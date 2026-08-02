package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.iL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3372iL extends InputStream {

    /* renamed from: A, reason: collision with root package name */
    public int f31803A;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f31804n;

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f31805u;

    /* renamed from: v, reason: collision with root package name */
    public int f31806v;

    /* renamed from: w, reason: collision with root package name */
    public int f31807w;

    /* renamed from: x, reason: collision with root package name */
    public int f31808x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f31809y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f31810z;

    public final boolean b() {
        ByteBuffer byteBuffer;
        do {
            this.f31807w++;
            Iterator it = this.f31804n;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f31805u = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f31808x = this.f31805u.position();
        if (this.f31805u.hasArray()) {
            this.f31809y = true;
            this.f31810z = this.f31805u.array();
            this.f31803A = this.f31805u.arrayOffset();
        } else {
            this.f31809y = false;
            this.f31810z = null;
        }
        return true;
    }

    public final void n(int i) {
        int i4 = this.f31808x + i;
        this.f31808x = i4;
        if (i4 == this.f31805u.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f31807w == this.f31806v) {
            return -1;
        }
        if (this.f31809y) {
            int i = this.f31810z[this.f31808x + this.f31803A] & 255;
            n(1);
            return i;
        }
        int i4 = this.f31805u.get(this.f31808x) & 255;
        n(1);
        return i4;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        if (this.f31807w == this.f31806v) {
            return -1;
        }
        int limit = this.f31805u.limit();
        int i6 = this.f31808x;
        int i9 = limit - i6;
        if (i4 > i9) {
            i4 = i9;
        }
        if (this.f31809y) {
            System.arraycopy(this.f31810z, i6 + this.f31803A, bArr, i, i4);
            n(i4);
            return i4;
        }
        int position = this.f31805u.position();
        this.f31805u.position(this.f31808x);
        this.f31805u.get(bArr, i, i4);
        this.f31805u.position(position);
        n(i4);
        return i4;
    }
}
