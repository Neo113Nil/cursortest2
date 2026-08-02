package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rdo extends l95 {
    public static final e7o r = new e7o(2);
    public final jkv d;
    public final float e;
    public final float f;
    public final u6t g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final c9a k;
    public final qdo l;
    public final ndo m;
    public final c9a n;
    public final qdo o;
    public final ndo p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d9, code lost:
    
        if ((((r24 - r12) * r10) - ((r1 - r14) * r3)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rdo(String str, float[] fArr, jkv jkvVar, float[] fArr2, c9a c9aVar, c9a c9aVar2, float f, float f2, u6t u6tVar, int i) {
        super(str, v85.a, i);
        ?? r41;
        int i2;
        float f3;
        boolean z;
        float f4;
        boolean z2;
        this.d = jkvVar;
        this.e = f;
        this.f = f2;
        this.g = u6tVar;
        this.k = c9aVar;
        int i3 = 1;
        this.l = new qdo(this, i3);
        int i4 = 0;
        this.m = new ndo(this, i4);
        this.n = c9aVar2;
        this.o = new qdo(this, i4);
        this.p = new ndo(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            xq0.x("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            e7o.k("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = jkvVar.a;
            r41 = 0;
            float f21 = jkvVar.b;
            i2 = 6;
            float f22 = 1;
            float f23 = (f22 - f14) / f15;
            float f24 = (f22 - f16) / f17;
            float f25 = (f22 - f18) / f19;
            float f26 = (f22 - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = f24 - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / (((f25 - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
        } else {
            r41 = 0;
            i2 = 6;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                kac.c(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.i = fArr2;
        }
        this.j = zsd.p0(this.i);
        float s = fxf.s(fArr3);
        float[] fArr4 = n95.a;
        if (s / fxf.s(n95.b) > 0.9f) {
            float[] fArr5 = n95.a;
            float f38 = fArr3[r41];
            float f39 = fArr5[r41];
            float f40 = fArr3[1];
            float f41 = fArr5[1];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            z = true;
            f4 = 0.0f;
            float[] fArr6 = new float[i2];
            fArr6[r41] = f38 - f39;
            fArr6[1] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[r41];
            float f51 = fArr6[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                    }
                }
            }
        } else {
            z = true;
            f4 = 0.0f;
        }
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = n95.a;
            if (fArr3 != fArr7) {
                for (int i6 = r41; i6 < 6; i6++) {
                    if (Float.compare(fArr3[i6], fArr7[i6]) != 0 && Math.abs(fArr3[i6] - fArr7[i6]) > 0.001f) {
                        break;
                    }
                }
            }
            if (zsd.S(jkvVar, i4w.r) && f == f4 && f2 == f3) {
                float[] fArr8 = n95.a;
                rdo rdoVar = n95.e;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(c9aVar.c(d) - rdoVar.k.c(d)) <= 0.001d && Math.abs(c9aVar2.c(d) - rdoVar.n.c(d)) <= 0.001d) {
                    }
                }
            }
            z2 = r41;
            this.q = z2;
        }
        z2 = z;
        this.q = z2;
    }

    @Override // defpackage.l95
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.l95
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.l95
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.l95
    public final long d(float f, float f2, float f3) {
        double d = f;
        ndo ndoVar = this.p;
        float c = (float) ndoVar.c(d);
        float c2 = (float) ndoVar.c(f2);
        float c3 = (float) ndoVar.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f5 = (fArr[7] * c3) + (fArr[4] * c2) + (fArr[1] * c);
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // defpackage.l95
    public final float e(float f, float f2, float f3) {
        double d = f;
        ndo ndoVar = this.p;
        float c = (float) ndoVar.c(d);
        float c2 = (float) ndoVar.c(f2);
        float c3 = (float) ndoVar.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * c3) + (fArr[5] * c2) + (fArr[2] * c);
    }

    @Override // defpackage.l95
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rdo.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        rdo rdoVar = (rdo) obj;
        if (Float.compare(rdoVar.e, this.e) != 0 || Float.compare(rdoVar.f, this.f) != 0 || !Intrinsics.d(this.d, rdoVar.d) || !Arrays.equals(this.h, rdoVar.h)) {
            return false;
        }
        u6t u6tVar = rdoVar.g;
        u6t u6tVar2 = this.g;
        if (u6tVar2 != null) {
            return Intrinsics.d(u6tVar2, u6tVar);
        }
        if (u6tVar == null) {
            return true;
        }
        if (Intrinsics.d(this.k, rdoVar.k)) {
            return Intrinsics.d(this.n, rdoVar.n);
        }
        return false;
    }

    @Override // defpackage.l95
    public final long f(float f, float f2, float f3, float f4, l95 l95Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        ndo ndoVar = this.m;
        return c3x.e((float) ndoVar.c(f5), (float) ndoVar.c(f6), (float) ndoVar.c(f7), f4, l95Var);
    }

    @Override // defpackage.l95
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        u6t u6tVar = this.g;
        int hashCode2 = floatToIntBits2 + (u6tVar != null ? u6tVar.hashCode() : 0);
        if (u6tVar == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rdo(String str, float[] fArr, jkv jkvVar, final u6t u6tVar, int i) {
        this(str, fArr, jkvVar, null, r4, r0, 0.0f, 1.0f, u6tVar, i);
        c9a c9aVar;
        c9a c9aVar2;
        double d = u6tVar.a;
        boolean z = d == -3.0d;
        double d2 = u6tVar.g;
        double d3 = u6tVar.f;
        if (z) {
            final int i2 = 4;
            c9aVar = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i3 = i2;
                    u6t u6tVar2 = u6tVar;
                    switch (i3) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            c9aVar = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i3;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            c9aVar = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i4;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            c9aVar = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i5;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            c9aVar2 = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i6;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            c9aVar2 = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i7;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            c9aVar2 = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i8;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            c9aVar2 = new c9a() { // from class: pdo
                @Override // defpackage.c9a
                public final double c(double d4) {
                    int i32 = i9;
                    u6t u6tVar2 = u6tVar;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = n95.a;
                            return n95.a(u6tVar2, d4);
                        case 1:
                            float[] fArr3 = n95.a;
                            return n95.c(u6tVar2, d4);
                        case 2:
                            double d5 = u6tVar2.b;
                            return d4 >= u6tVar2.e ? Math.pow((d5 * d4) + u6tVar2.c, u6tVar2.a) : d4 * u6tVar2.d;
                        case 3:
                            double d6 = u6tVar2.b;
                            double d7 = u6tVar2.c;
                            double d8 = u6tVar2.d;
                            return d4 >= u6tVar2.e ? Math.pow((d6 * d4) + d7, u6tVar2.a) + u6tVar2.f : (d8 * d4) + u6tVar2.g;
                        case 4:
                            float[] fArr4 = n95.a;
                            return n95.b(u6tVar2, d4);
                        case 5:
                            float[] fArr5 = n95.a;
                            return n95.d(u6tVar2, d4);
                        case 6:
                            double d9 = u6tVar2.b;
                            double d10 = u6tVar2.c;
                            double d11 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d11 ? (Math.pow(d4, 1.0d / u6tVar2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = u6tVar2.b;
                            double d13 = u6tVar2.c;
                            double d14 = u6tVar2.d;
                            return d4 >= u6tVar2.e * d14 ? (Math.pow(d4 - u6tVar2.f, 1.0d / u6tVar2.a) - d13) / d12 : (d4 - u6tVar2.g) / d14;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rdo(String str, float[] fArr, jkv jkvVar, final double d, float f, float f2, int i) {
        this(str, fArr, jkvVar, null, r11, r12, f, f2, new u6t(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        c9a c9aVar;
        c9a c9aVar2 = r;
        if (d == 1.0d) {
            c9aVar = c9aVar2;
        } else {
            final int i2 = 0;
            c9aVar = new c9a() { // from class: odo
                @Override // defpackage.c9a
                public final double c(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            c9aVar2 = new c9a() { // from class: odo
                @Override // defpackage.c9a
                public final double c(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        c9a c9aVar3 = c9aVar2;
    }
}
