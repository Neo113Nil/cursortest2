package g1;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final d6.f f2480r = new d6.f(14);

    /* renamed from: d, reason: collision with root package name */
    public final s f2481d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2482e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2483f;

    /* renamed from: g, reason: collision with root package name */
    public final r f2484g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f2485h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f2486i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f2487j;

    /* renamed from: k, reason: collision with root package name */
    public final i f2488k;

    /* renamed from: l, reason: collision with root package name */
    public final p f2489l;

    /* renamed from: m, reason: collision with root package name */
    public final m f2490m;

    /* renamed from: n, reason: collision with root package name */
    public final i f2491n;

    /* renamed from: o, reason: collision with root package name */
    public final p f2492o;

    /* renamed from: p, reason: collision with root package name */
    public final m f2493p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2494q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        this(str, fArr, sVar, null, r4, r0, 0.0f, 1.0f, rVar, i10);
        i iVar;
        i iVar2;
        double d10 = rVar.f2495a;
        boolean z10 = d10 == -3.0d;
        double d11 = rVar.f2501g;
        double d12 = rVar.f2500f;
        if (z10) {
            final int i11 = 4;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i12 = 5;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i12;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i13 = 6;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i13;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        } else {
            final int i14 = 7;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i14;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i15 = 0;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i15;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i16 = 1;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i16;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i17 = 2;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i17;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        } else {
            final int i18 = 3;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double c(double d13) {
                    int i122 = i18;
                    r rVar2 = rVar;
                    switch (i122) {
                        case 0:
                            float[] fArr2 = d.f2429a;
                            return d.a(rVar2, d13);
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            float[] fArr3 = d.f2429a;
                            return d.c(rVar2, d13);
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            double d14 = rVar2.f2496b;
                            return d13 >= rVar2.f2499e ? Math.pow((d14 * d13) + rVar2.f2497c, rVar2.f2495a) : d13 * rVar2.f2498d;
                        case 3:
                            double d15 = rVar2.f2496b;
                            double d16 = rVar2.f2497c;
                            double d17 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e ? Math.pow((d15 * d13) + d16, rVar2.f2495a) + rVar2.f2500f : (d17 * d13) + rVar2.f2501g;
                        case 4:
                            float[] fArr4 = d.f2429a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f2429a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f2496b;
                            double d19 = rVar2.f2497c;
                            double d20 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d20 ? (Math.pow(d13, 1.0d / rVar2.f2495a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f2496b;
                            double d22 = rVar2.f2497c;
                            double d23 = rVar2.f2498d;
                            return d13 >= rVar2.f2499e * d23 ? (Math.pow(d13 - rVar2.f2500f, 1.0d / rVar2.f2495a) - d22) / d21 : (d13 - rVar2.f2501g) / d23;
                    }
                }
            };
        }
    }

    @Override // g1.c
    public final float a(int i10) {
        return this.f2483f;
    }

    @Override // g1.c
    public final float b(int i10) {
        return this.f2482e;
    }

    @Override // g1.c
    public final boolean c() {
        return this.f2494q;
    }

    @Override // g1.c
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f2493p;
        float c3 = (float) mVar.c(d10);
        float c7 = (float) mVar.c(f11);
        float c10 = (float) mVar.c(f12);
        float[] fArr = this.f2486i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * c10) + (fArr[3] * c7) + (fArr[0] * c3);
        float f14 = (fArr[7] * c10) + (fArr[4] * c7) + (fArr[1] * c3);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // g1.c
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f2493p;
        float c3 = (float) mVar.c(d10);
        float c7 = (float) mVar.c(f11);
        float c10 = (float) mVar.c(f12);
        float[] fArr = this.f2486i;
        return (fArr[8] * c10) + (fArr[5] * c7) + (fArr[2] * c3);
    }

    @Override // g1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f2484g;
        if (Float.compare(qVar.f2482e, this.f2482e) != 0 || Float.compare(qVar.f2483f, this.f2483f) != 0 || !pc.j.a(this.f2481d, qVar.f2481d) || !Arrays.equals(this.f2485h, qVar.f2485h)) {
            return false;
        }
        r rVar2 = this.f2484g;
        if (rVar2 != null) {
            return pc.j.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (pc.j.a(this.f2488k, qVar.f2488k)) {
            return pc.j.a(this.f2491n, qVar.f2491n);
        }
        return false;
    }

    @Override // g1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.f2487j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f2490m;
        return d0.a((float) mVar.c(f14), (float) mVar.c(f15), (float) mVar.c(f16), f13, cVar);
    }

    @Override // g1.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f2485h) + ((this.f2481d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f2482e;
        int floatToIntBits = (hashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f2483f;
        int floatToIntBits2 = (floatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f2484g;
        int hashCode2 = floatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f2491n.hashCode() + ((this.f2488k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e2, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r11)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f10, float f11, r rVar, int i10) {
        super(i10, b.f2421a, str);
        ?? r41;
        float f12;
        float f13;
        this.f2481d = sVar;
        this.f2482e = f10;
        this.f2483f = f11;
        this.f2484g = rVar;
        this.f2488k = iVar;
        boolean z10 = true;
        z10 = true;
        this.f2489l = new p(this, z10 ? 1 : 0);
        int i11 = 0;
        this.f2490m = new m(this, i11);
        this.f2491n = iVar2;
        this.f2492o = new p(this, i11);
        this.f2493p = new m(this, z10 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 < f11) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f14 = fArr[0];
                float f15 = fArr[1];
                float f16 = f14 + f15 + fArr[2];
                fArr3[0] = f14 / f16;
                fArr3[1] = f15 / f16;
                float f17 = fArr[3];
                float f18 = fArr[4];
                float f19 = f17 + f18 + fArr[5];
                fArr3[2] = f17 / f19;
                fArr3[3] = f18 / f19;
                float f20 = fArr[6];
                float f21 = fArr[7];
                float f22 = f20 + f21 + fArr[8];
                fArr3[4] = f20 / f22;
                fArr3[5] = f21 / f22;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f2485h = fArr3;
            if (fArr2 == null) {
                float f23 = fArr3[0];
                float f24 = fArr3[1];
                float f25 = fArr3[2];
                float f26 = fArr3[3];
                float f27 = fArr3[4];
                float f28 = fArr3[5];
                f12 = 1.0f;
                float f29 = sVar.f2502a;
                r41 = 0;
                float f30 = sVar.f2503b;
                float f31 = 1;
                float f32 = (f31 - f23) / f24;
                float f33 = (f31 - f25) / f26;
                float f34 = (f31 - f27) / f28;
                float f35 = (f31 - f29) / f30;
                float f36 = f23 / f24;
                float f37 = (f25 / f26) - f36;
                float f38 = (f29 / f30) - f36;
                float f39 = f33 - f32;
                float f40 = (f27 / f28) - f36;
                float f41 = (((f35 - f32) * f37) - (f38 * f39)) / (((f34 - f32) * f37) - (f39 * f40));
                float f42 = (f38 - (f40 * f41)) / f37;
                float f43 = (1.0f - f42) - f41;
                float f44 = f43 / f24;
                float f45 = f42 / f26;
                float f46 = f41 / f28;
                this.f2486i = new float[]{f44 * f23, f43, ((1.0f - f23) - f24) * f44, f45 * f25, f42, ((1.0f - f25) - f26) * f45, f46 * f27, f41, ((1.0f - f27) - f28) * f46};
            } else {
                r41 = 0;
                f12 = 1.0f;
                if (fArr2.length == 9) {
                    this.f2486i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f2487j = j.f(this.f2486i);
            float b2 = j.b(fArr3);
            float[] fArr4 = d.f2429a;
            if (b2 / j.b(d.f2430b) > 0.9f) {
                float[] fArr5 = d.f2429a;
                float f47 = fArr3[r41];
                float f48 = fArr5[r41];
                float f49 = fArr3[1];
                float f50 = fArr5[1];
                float f51 = fArr3[2];
                float f52 = fArr5[2];
                float f53 = fArr3[3];
                float f54 = fArr5[3];
                float f55 = fArr3[4];
                float f56 = fArr5[4];
                float f57 = fArr3[5];
                float f58 = fArr5[5];
                f13 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r41] = f47 - f48;
                fArr6[1] = f49 - f50;
                fArr6[2] = f51 - f52;
                fArr6[3] = f53 - f54;
                fArr6[4] = f55 - f56;
                fArr6[5] = f57 - f58;
                float f59 = fArr6[r41];
                float f60 = fArr6[1];
                if (((f50 - f58) * f59) - ((f48 - f56) * f60) >= 0.0f && ((f48 - f52) * f60) - ((f50 - f54) * f59) >= 0.0f) {
                    float f61 = fArr6[2];
                    float f62 = fArr6[3];
                    if (((f54 - f50) * f61) - ((f52 - f48) * f62) >= 0.0f && ((f52 - f56) * f62) - ((f54 - f58) * f61) >= 0.0f) {
                        float f63 = fArr6[4];
                        float f64 = fArr6[5];
                        if (((f58 - f54) * f63) - ((f56 - f52) * f64) >= 0.0f) {
                        }
                    }
                }
            } else {
                f13 = 0.0f;
            }
            int i12 = (f10 > f13 ? 1 : (f10 == f13 ? 0 : -1));
            if (i10 != 0) {
                float[] fArr7 = d.f2429a;
                if (fArr3 != fArr7) {
                    for (int i13 = r41; i13 < 6; i13++) {
                        if (Float.compare(fArr3[i13], fArr7[i13]) != 0 && Math.abs(fArr3[i13] - fArr7[i13]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (j.d(sVar, j.f2465d) && f10 == f13 && f11 == f12) {
                    float[] fArr8 = d.f2429a;
                    q qVar = d.f2433e;
                    for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                        if (Math.abs(iVar.c(d10) - qVar.f2488k.c(d10)) <= 0.001d && Math.abs(iVar2.c(d10) - qVar.f2491n.c(d10)) <= 0.001d) {
                        }
                    }
                }
                z10 = r41;
            }
            this.f2494q = z10;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i10) {
        this(str, fArr, sVar, null, r11, r3, f10, f11, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
        i iVar;
        i iVar2 = f2480r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: g1.n
                @Override // g1.i
                public final double c(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: g1.n
                @Override // g1.i
                public final double c(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
    }
}
