package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.vi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4085vi implements InterfaceC2491Ai {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f35472a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f35473b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f35474c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f35475d;

    /* renamed from: e, reason: collision with root package name */
    public double f35476e;

    /* renamed from: f, reason: collision with root package name */
    public double f35477f;

    /* renamed from: g, reason: collision with root package name */
    public double f35478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2695Mi f35479h;

    public C4085vi(C2695Mi c2695Mi) {
        Objects.requireNonNull(c2695Mi);
        this.f35479h = c2695Mi;
        int i = c2695Mi.f27101h;
        this.f35472a = new float[i];
        int i4 = c2695Mi.f27095b;
        this.f35473b = new float[i * i4];
        this.f35474c = new float[i * i4];
        this.f35475d = new float[i * i4];
    }

    public final int a(float[] fArr, int i, int i4, int i6) {
        int i9 = 255;
        int i10 = 0;
        double d9 = 0.0d;
        double d10 = 1.0d;
        int i11 = i4;
        while (true) {
            double d11 = i9;
            double d12 = i10;
            if (i11 > i6) {
                this.f35476e = d10 / d12;
                this.f35477f = d9 / d11;
                return i10;
            }
            int i12 = 0;
            double d13 = 0.0d;
            while (i12 < i11) {
                int i13 = this.f35479h.f27095b * i;
                d13 += Math.abs(fArr[i13 + i12] - fArr[(i13 + i11) + i12]);
                i12++;
                i9 = i9;
            }
            int i14 = i9;
            double d14 = d12 * d13;
            double d15 = i11;
            double d16 = d10 * d15;
            if (d14 < d16) {
                d10 = d13;
            }
            if (d14 < d16) {
                i10 = i11;
            }
            double d17 = d11 * d13;
            double d18 = d15 * d9;
            if (d17 > d18) {
                d9 = d13;
            }
            i9 = d17 > d18 ? i11 : i14;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void b(int i) {
        this.f35473b = q(this.f35473b, this.f35479h.f27102j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final int c() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final int d(int i, int i4, int i6) {
        return a(this.f35473b, i, i4, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void e(int i, long j6, long j9) {
        int i4 = 0;
        while (true) {
            C2695Mi c2695Mi = this.f35479h;
            int i6 = c2695Mi.f27095b;
            if (i4 >= i6) {
                return;
            }
            float[] fArr = this.f35474c;
            int i9 = c2695Mi.f27103k;
            float[] fArr2 = this.f35475d;
            int i10 = (i * i6) + i4;
            float f2 = fArr2[i10];
            float f9 = fArr2[i10 + i6];
            long j10 = c2695Mi.f27106n * j6;
            long j11 = (r1 + 1) * j9;
            long j12 = j11 - j10;
            fArr[(i9 * i6) + i4] = ((j12 * f2) + ((r12 - j12) * f9)) / (j11 - (c2695Mi.f27105m * j9));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void f(int i) {
        this.f35475d = q(this.f35475d, this.f35479h.f27104l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void g(int i, int i4, int i6, int i9, int i10) {
        float[] fArr = this.f35474c;
        float[] fArr2 = this.f35473b;
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = (i9 * i4) + i11;
            int i13 = (i10 * i4) + i11;
            int i14 = (i6 * i4) + i11;
            for (int i15 = 0; i15 < i; i15++) {
                fArr[i14] = ((fArr2[i13] * i15) + (fArr2[i12] * (i - i15))) / i;
                i14 += i4;
                i12 += i4;
                i13 += i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void h() {
        this.f35478g = 0.0d;
        this.f35476e = 0.0d;
        this.f35477f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final boolean i() {
        double d9 = this.f35476e;
        return d9 != 0.0d && this.f35479h.f27108p != 0 && this.f35477f <= d9 * 3.0d && d9 + d9 > this.f35478g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void j(int i, int i4) {
        int i6;
        int i9 = 0;
        while (true) {
            C2695Mi c2695Mi = this.f35479h;
            if (i9 >= c2695Mi.f27101h / i4) {
                return;
            }
            double d9 = 0.0d;
            int i10 = 0;
            while (true) {
                i6 = c2695Mi.f27095b * i4;
                if (i10 < i6) {
                    d9 += this.f35473b[(i6 * i9) + (r6 * i) + i10];
                    i10++;
                }
            }
            this.f35472a[i9] = (float) (d9 / i6);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void k(int i, ByteBuffer byteBuffer) {
        C2695Mi c2695Mi = this.f35479h;
        byteBuffer.asFloatBuffer().get(this.f35473b, c2695Mi.f27102j * c2695Mi.f27095b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void l(int i, int i4) {
        for (int i6 = 0; i6 < this.f35479h.f27095b * i4; i6++) {
            this.f35473b[i + i6] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final /* synthetic */ Object m() {
        return this.f35474c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void n() {
        this.f35478g = this.f35476e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final int o(int i, int i4) {
        return a(this.f35472a, 0, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void p(int i, ByteBuffer byteBuffer) {
        C2695Mi c2695Mi = this.f35479h;
        byteBuffer.asFloatBuffer().put(this.f35474c, 0, c2695Mi.f27095b * i);
        byteBuffer.position((i * 4 * c2695Mi.f27095b) + byteBuffer.position());
    }

    public final float[] q(float[] fArr, int i, int i4) {
        int length = fArr.length;
        int i6 = this.f35479h.f27095b;
        int i9 = length / i6;
        return i + i4 <= i9 ? fArr : Arrays.copyOf(fArr, (((i9 * 3) / 2) + i4) * i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final /* synthetic */ Object r() {
        return this.f35475d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final void t(int i) {
        this.f35474c = q(this.f35474c, this.f35479h.f27103k, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public final /* synthetic */ Object w() {
        return this.f35473b;
    }
}
