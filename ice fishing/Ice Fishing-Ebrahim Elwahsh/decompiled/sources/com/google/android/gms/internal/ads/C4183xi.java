package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4183xi implements InterfaceC4291zi {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f35223a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f35224b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f35225c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f35226d;

    /* renamed from: e, reason: collision with root package name */
    public double f35227e;

    /* renamed from: f, reason: collision with root package name */
    public double f35228f;

    /* renamed from: g, reason: collision with root package name */
    public double f35229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2759Ri f35230h;

    public C4183xi(C2759Ri c2759Ri) {
        Objects.requireNonNull(c2759Ri);
        this.f35230h = c2759Ri;
        int i = c2759Ri.f27407h;
        this.f35223a = new float[i];
        int i4 = c2759Ri.f27401b;
        this.f35224b = new float[i * i4];
        this.f35225c = new float[i * i4];
        this.f35226d = new float[i * i4];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final int a() {
        return 4;
    }

    public final int b(float[] fArr, int i, int i4, int i9) {
        int i10 = 255;
        int i11 = 0;
        double d2 = 0.0d;
        double d3 = 1.0d;
        int i12 = i4;
        while (true) {
            double d9 = i10;
            double d10 = i11;
            if (i12 > i9) {
                this.f35227e = d3 / d10;
                this.f35228f = d2 / d9;
                return i11;
            }
            int i13 = 0;
            double d11 = 0.0d;
            while (i13 < i12) {
                int i14 = this.f35230h.f27401b * i;
                d11 += Math.abs(fArr[i14 + i13] - fArr[(i14 + i12) + i13]);
                i13++;
                i10 = i10;
            }
            int i15 = i10;
            double d12 = d10 * d11;
            double d13 = i12;
            double d14 = d3 * d13;
            if (d12 < d14) {
                d3 = d11;
            }
            if (d12 < d14) {
                i11 = i12;
            }
            double d15 = d9 * d11;
            double d16 = d13 * d2;
            if (d15 > d16) {
                d2 = d11;
            }
            i10 = d15 > d16 ? i12 : i15;
            i12++;
        }
    }

    public final float[] c(float[] fArr, int i, int i4) {
        int length = fArr.length;
        int i9 = this.f35230h.f27401b;
        int i10 = length / i9;
        return i + i4 <= i10 ? fArr : Arrays.copyOf(fArr, (((i10 * 3) / 2) + i4) * i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void d(int i) {
        this.f35224b = c(this.f35224b, this.f35230h.f27408j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void e() {
        this.f35229g = 0.0d;
        this.f35227e = 0.0d;
        this.f35228f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final int f(int i, int i4, int i9) {
        return b(this.f35224b, i, i4, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void g(int i, long j9, long j10) {
        int i4 = 0;
        while (true) {
            C2759Ri c2759Ri = this.f35230h;
            int i9 = c2759Ri.f27401b;
            if (i4 >= i9) {
                return;
            }
            float[] fArr = this.f35225c;
            int i10 = c2759Ri.f27409k;
            float[] fArr2 = this.f35226d;
            int i11 = (i * i9) + i4;
            float f6 = fArr2[i11];
            float f9 = fArr2[i11 + i9];
            long j11 = c2759Ri.f27412n * j9;
            long j12 = (r1 + 1) * j10;
            long j13 = j12 - j11;
            fArr[(i10 * i9) + i4] = ((j13 * f6) + ((r12 - j13) * f9)) / (j12 - (c2759Ri.f27411m * j10));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void h(int i) {
        this.f35226d = c(this.f35226d, this.f35230h.f27410l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final boolean i() {
        double d2 = this.f35227e;
        return d2 != 0.0d && this.f35230h.f27414p != 0 && this.f35228f <= d2 * 3.0d && d2 + d2 > this.f35229g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void j(int i, int i4, int i9, int i10, int i11) {
        float[] fArr = this.f35225c;
        float[] fArr2 = this.f35224b;
        for (int i12 = 0; i12 < i4; i12++) {
            int i13 = (i10 * i4) + i12;
            int i14 = (i11 * i4) + i12;
            int i15 = (i9 * i4) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                fArr[i15] = ((fArr2[i14] * i16) + (fArr2[i13] * (i - i16))) / i;
                i15 += i4;
                i13 += i4;
                i14 += i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void k(int i, int i4) {
        int i9;
        int i10 = 0;
        while (true) {
            C2759Ri c2759Ri = this.f35230h;
            if (i10 >= c2759Ri.f27407h / i4) {
                return;
            }
            double d2 = 0.0d;
            int i11 = 0;
            while (true) {
                i9 = c2759Ri.f27401b * i4;
                if (i11 < i9) {
                    d2 += this.f35224b[(i9 * i10) + (r6 * i) + i11];
                    i11++;
                }
            }
            this.f35223a[i10] = (float) (d2 / i9);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void l() {
        this.f35229g = this.f35227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void m(int i, ByteBuffer byteBuffer) {
        C2759Ri c2759Ri = this.f35230h;
        byteBuffer.asFloatBuffer().get(this.f35224b, c2759Ri.f27408j * c2759Ri.f27401b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final /* synthetic */ Object n() {
        return this.f35225c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void o(int i, int i4) {
        for (int i9 = 0; i9 < this.f35230h.f27401b * i4; i9++) {
            this.f35224b[i + i9] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final int p(int i, int i4) {
        return b(this.f35223a, 0, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void q(int i, ByteBuffer byteBuffer) {
        C2759Ri c2759Ri = this.f35230h;
        byteBuffer.asFloatBuffer().put(this.f35225c, 0, c2759Ri.f27401b * i);
        byteBuffer.position((i * 4 * c2759Ri.f27401b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final /* synthetic */ Object r() {
        return this.f35226d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final /* synthetic */ Object t() {
        return this.f35224b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public final void u(int i) {
        this.f35225c = c(this.f35225c, this.f35230h.f27409k, i);
    }
}
