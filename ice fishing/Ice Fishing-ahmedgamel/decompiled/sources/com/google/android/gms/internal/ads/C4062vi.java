package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.vi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4062vi implements InterfaceC2471Ai {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f34715a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f34716b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f34717c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f34718d;

    /* renamed from: e, reason: collision with root package name */
    public double f34719e;

    /* renamed from: f, reason: collision with root package name */
    public double f34720f;

    /* renamed from: g, reason: collision with root package name */
    public double f34721g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2675Mi f34722h;

    public C4062vi(C2675Mi c2675Mi) {
        Objects.requireNonNull(c2675Mi);
        this.f34722h = c2675Mi;
        int i = c2675Mi.f26312h;
        this.f34715a = new float[i];
        int i6 = c2675Mi.f26306b;
        this.f34716b = new float[i * i6];
        this.f34717c = new float[i * i6];
        this.f34718d = new float[i * i6];
    }

    public final int a(float[] fArr, int i, int i6, int i9) {
        int i10 = 255;
        int i11 = 0;
        double d2 = 0.0d;
        double d9 = 1.0d;
        int i12 = i6;
        while (true) {
            double d10 = i10;
            double d11 = i11;
            if (i12 > i9) {
                this.f34719e = d9 / d11;
                this.f34720f = d2 / d10;
                return i11;
            }
            int i13 = 0;
            double d12 = 0.0d;
            while (i13 < i12) {
                int i14 = this.f34722h.f26306b * i;
                d12 += Math.abs(fArr[i14 + i13] - fArr[(i14 + i12) + i13]);
                i13++;
                i10 = i10;
            }
            int i15 = i10;
            double d13 = d11 * d12;
            double d14 = i12;
            double d15 = d9 * d14;
            if (d13 < d15) {
                d9 = d12;
            }
            if (d13 < d15) {
                i11 = i12;
            }
            double d16 = d10 * d12;
            double d17 = d14 * d2;
            if (d16 > d17) {
                d2 = d12;
            }
            i10 = d16 > d17 ? i12 : i15;
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void b(int i) {
        this.f34716b = q(this.f34716b, this.f34722h.f26313j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final int c() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final int d(int i, int i6, int i9) {
        return a(this.f34716b, i, i6, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void e(int i, long j6, long j9) {
        int i6 = 0;
        while (true) {
            C2675Mi c2675Mi = this.f34722h;
            int i9 = c2675Mi.f26306b;
            if (i6 >= i9) {
                return;
            }
            float[] fArr = this.f34717c;
            int i10 = c2675Mi.f26314k;
            float[] fArr2 = this.f34718d;
            int i11 = (i * i9) + i6;
            float f3 = fArr2[i11];
            float f9 = fArr2[i11 + i9];
            long j10 = c2675Mi.f26317n * j6;
            long j11 = (r1 + 1) * j9;
            long j12 = j11 - j10;
            fArr[(i10 * i9) + i6] = ((j12 * f3) + ((r12 - j12) * f9)) / (j11 - (c2675Mi.f26316m * j9));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void f(int i) {
        this.f34718d = q(this.f34718d, this.f34722h.f26315l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void g(int i, int i6, int i9, int i10, int i11) {
        float[] fArr = this.f34717c;
        float[] fArr2 = this.f34716b;
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = (i10 * i6) + i12;
            int i14 = (i11 * i6) + i12;
            int i15 = (i9 * i6) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                fArr[i15] = ((fArr2[i14] * i16) + (fArr2[i13] * (i - i16))) / i;
                i15 += i6;
                i13 += i6;
                i14 += i6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void h() {
        this.f34721g = 0.0d;
        this.f34719e = 0.0d;
        this.f34720f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final boolean i() {
        double d2 = this.f34719e;
        return d2 != 0.0d && this.f34722h.f26319p != 0 && this.f34720f <= d2 * 3.0d && d2 + d2 > this.f34721g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void j(int i, int i6) {
        int i9;
        int i10 = 0;
        while (true) {
            C2675Mi c2675Mi = this.f34722h;
            if (i10 >= c2675Mi.f26312h / i6) {
                return;
            }
            double d2 = 0.0d;
            int i11 = 0;
            while (true) {
                i9 = c2675Mi.f26306b * i6;
                if (i11 < i9) {
                    d2 += this.f34716b[(i9 * i10) + (r6 * i) + i11];
                    i11++;
                }
            }
            this.f34715a[i10] = (float) (d2 / i9);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void k(int i, ByteBuffer byteBuffer) {
        C2675Mi c2675Mi = this.f34722h;
        byteBuffer.asFloatBuffer().get(this.f34716b, c2675Mi.f26313j * c2675Mi.f26306b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void l(int i, int i6) {
        for (int i9 = 0; i9 < this.f34722h.f26306b * i6; i9++) {
            this.f34716b[i + i9] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final /* synthetic */ Object m() {
        return this.f34717c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void n() {
        this.f34721g = this.f34719e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final int o(int i, int i6) {
        return a(this.f34715a, 0, i, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void p(int i, ByteBuffer byteBuffer) {
        C2675Mi c2675Mi = this.f34722h;
        byteBuffer.asFloatBuffer().put(this.f34717c, 0, c2675Mi.f26306b * i);
        byteBuffer.position((i * 4 * c2675Mi.f26306b) + byteBuffer.position());
    }

    public final float[] q(float[] fArr, int i, int i6) {
        int length = fArr.length;
        int i9 = this.f34722h.f26306b;
        int i10 = length / i9;
        return i + i6 <= i10 ? fArr : Arrays.copyOf(fArr, (((i10 * 3) / 2) + i6) * i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final /* synthetic */ Object r() {
        return this.f34718d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final void t(int i) {
        this.f34717c = q(this.f34717c, this.f34722h.f26314k, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public final /* synthetic */ Object w() {
        return this.f34716b;
    }
}
