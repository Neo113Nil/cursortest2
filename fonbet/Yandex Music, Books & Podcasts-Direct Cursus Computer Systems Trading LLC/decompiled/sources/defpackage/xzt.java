package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class xzt implements tzt {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public xzt(o46 o46Var, anm anmVar, ssm ssmVar, rp7 rp7Var, c5p c5pVar, c5p c5pVar2, kau kauVar, OkHttpClient okHttpClient, keg kegVar, s1 s1Var, qdc qdcVar) {
        okHttpClient.getClass();
        s1Var.getClass();
        this.b = o46Var;
        this.c = anmVar;
        this.d = ssmVar;
        this.e = rp7Var;
        this.f = c5pVar;
        this.g = c5pVar2;
        this.h = kauVar;
        this.i = okHttpClient;
        this.j = kegVar;
        this.k = s1Var;
        this.l = qdcVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new lp7(9, Executors.defaultThreadFactory()));
        newCachedThreadPool.getClass();
        this.m = newCachedThreadPool;
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        cn0 cn0Var4;
        cn0 cn0Var5;
        float f;
        fx0[][] fx0VarArr;
        boolean z;
        cn0 cn0Var6 = cn0Var;
        cn0 cn0Var7 = cn0Var2;
        roi roiVar = (roi) this.b;
        int[] iArr = szt.a;
        int i = 0;
        long j2 = (j / 1000000) - 0;
        int i2 = this.a;
        long j3 = i2;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i3 = (int) j3;
        soi soiVar = (soi) this.c;
        wzt wztVar = (wzt) soiVar.b(i3);
        if (wztVar != null) {
            return wztVar.a;
        }
        if (i3 >= i2) {
            return cn0Var7;
        }
        if (i3 <= 0) {
            return cn0Var6;
        }
        d(cn0Var6, cn0Var7, cn0Var3);
        cn0 cn0Var8 = (cn0) this.i;
        cn0Var8.getClass();
        boolean z2 = true;
        if (((xzi) this.m) != szt.c) {
            float c = c(b(i3), i3, false);
            float[] fArr = (float[]) this.g;
            fx0[][] fx0VarArr2 = (fx0[][]) ((xzi) this.m).a;
            int length = fx0VarArr2.length - 1;
            float f2 = fx0VarArr2[0][0].a;
            float f3 = fx0VarArr2[length][0].b;
            int length2 = fArr.length;
            if (c < f2 || c > f3) {
                if (c > f3) {
                    f2 = f3;
                } else {
                    length = 0;
                }
                float f4 = c - f2;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    fx0 fx0Var = fx0VarArr2[length][i5];
                    boolean z3 = fx0Var.p;
                    float f5 = fx0Var.r;
                    float f6 = fx0Var.q;
                    if (z3) {
                        float f7 = fx0Var.a;
                        float f8 = fx0Var.k;
                        f = f4;
                        float f9 = fx0Var.c;
                        fx0VarArr = fx0VarArr2;
                        fArr[i4] = (f * f6) + su4.e(fx0Var.e, f9, (f2 - f7) * f8, f9);
                        float f10 = (f2 - f7) * f8;
                        float f11 = fx0Var.d;
                        fArr[i4 + 1] = (f * f5) + su4.e(fx0Var.f, f11, f10, f11);
                    } else {
                        f = f4;
                        fx0VarArr = fx0VarArr2;
                        fx0Var.c(f2);
                        fArr[i4] = (fx0Var.a() * f) + (fx0Var.n * fx0Var.h) + f6;
                        fArr[i4 + 1] = (fx0Var.b() * f) + (fx0Var.o * fx0Var.i) + f5;
                    }
                    i4 += 2;
                    i5++;
                    f4 = f;
                    fx0VarArr2 = fx0VarArr;
                }
            } else {
                int length3 = fx0VarArr2.length;
                int i6 = 0;
                boolean z4 = false;
                while (i6 < length3) {
                    int i7 = i;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        fx0 fx0Var2 = fx0VarArr2[i6][i8];
                        if (c <= fx0Var2.b) {
                            if (fx0Var2.p) {
                                float f12 = fx0Var2.a;
                                float f13 = fx0Var2.k;
                                float f14 = fx0Var2.c;
                                z = z2;
                                fArr[i7] = su4.e(fx0Var2.e, f14, (c - f12) * f13, f14);
                                float f15 = fx0Var2.d;
                                fArr[i7 + 1] = su4.e(fx0Var2.f, f15, (c - f12) * f13, f15);
                            } else {
                                z = z2;
                                fx0Var2.c(c);
                                fArr[i7] = (fx0Var2.n * fx0Var2.h) + fx0Var2.q;
                                fArr[i7 + 1] = (fx0Var2.o * fx0Var2.i) + fx0Var2.r;
                            }
                            z4 = z;
                        } else {
                            z = z2;
                        }
                        i7 += 2;
                        i8++;
                        z2 = z;
                    }
                    boolean z5 = z2;
                    if (z4) {
                        break;
                    }
                    i6++;
                    z2 = z5;
                    i = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                cn0Var8.e(i9, fArr[i9]);
            }
        } else {
            int b = b(i3);
            float c2 = c(b, i3, true);
            wzt wztVar2 = (wzt) soiVar.b(roiVar.c(b));
            if (wztVar2 != null && (cn0Var5 = wztVar2.a) != null) {
                cn0Var6 = cn0Var5;
            }
            wzt wztVar3 = (wzt) soiVar.b(roiVar.c(b + 1));
            if (wztVar3 != null && (cn0Var4 = wztVar3.a) != null) {
                cn0Var7 = cn0Var4;
            }
            int b2 = cn0Var8.b();
            for (int i10 = 0; i10 < b2; i10++) {
                cn0Var8.e(i10, (cn0Var7.a(i10) * c2) + ((1 - c2) * cn0Var6.a(i10)));
            }
        }
        return cn0Var8;
    }

    public int b(int i) {
        int i2;
        roi roiVar = (roi) this.b;
        int i3 = roiVar.b;
        if (i3 <= 0) {
            e7o.o("");
            return 0;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = roiVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public float c(int i, int i2, boolean z) {
        kya kyaVar;
        float f;
        roi roiVar = (roi) this.b;
        if (i >= roiVar.b - 1) {
            f = i2;
        } else {
            int c = roiVar.c(i);
            int c2 = roiVar.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                wzt wztVar = (wzt) ((soi) this.c).b(c);
                if (wztVar == null || (kyaVar = wztVar.b) == null) {
                    kyaVar = (kya) this.d;
                }
                float f2 = i3;
                float b = kyaVar.b((i2 - c) / f2);
                if (z) {
                    return b;
                }
                f = (f2 * b) + c;
            }
        }
        return f / 1000;
    }

    public void d(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        float[] fArr;
        soi soiVar = (soi) this.c;
        roi roiVar = (roi) this.b;
        boolean z = ((xzi) this.m) != szt.c;
        if (((cn0) this.i) == null) {
            this.i = cn0Var.c();
            this.j = cn0Var3.c();
            int i = roiVar.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = roiVar.c(i2) / 1000;
            }
            this.f = fArr2;
            int i3 = roiVar.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (((xzi) this.m) != szt.c && Intrinsics.d((cn0) this.k, cn0Var) && Intrinsics.d((cn0) this.l, cn0Var2)) {
                return;
            }
            this.k = cn0Var;
            this.l = cn0Var2;
            int b = cn0Var.b() + (cn0Var.b() % 2);
            this.g = new float[b];
            this.h = new float[b];
            int i5 = roiVar.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = roiVar.c(i6);
                wzt wztVar = (wzt) soiVar.b(c);
                if (c == 0 && wztVar == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = cn0Var.a(i7);
                    }
                } else if (c == this.a && wztVar == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = cn0Var2.a(i8);
                    }
                } else {
                    wztVar.getClass();
                    cn0 cn0Var4 = wztVar.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = cn0Var4.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new xzi((int[]) this.e, (float[]) this.f, fArr3);
        }
    }

    @Override // defpackage.tzt
    public int o() {
        return 0;
    }

    @Override // defpackage.tzt
    public int u() {
        return this.a;
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        int[] iArr = szt.a;
        int i = 0;
        long j2 = (j / 1000000) - 0;
        long j3 = this.a;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return cn0Var3;
        }
        d(cn0Var, cn0Var2, cn0Var3);
        cn0 cn0Var4 = (cn0) this.j;
        cn0Var4.getClass();
        if (((xzi) this.m) != szt.c) {
            int i2 = (int) j4;
            float c = c(b(i2), i2, false);
            float[] fArr = (float[]) this.h;
            fx0[][] fx0VarArr = (fx0[][]) ((xzi) this.m).a;
            float f = fx0VarArr[0][0].a;
            float f2 = fx0VarArr[fx0VarArr.length - 1][0].b;
            if (c < f) {
                c = f;
            }
            if (c <= f2) {
                f2 = c;
            }
            int length = fArr.length;
            boolean z = false;
            for (fx0[] fx0VarArr2 : fx0VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    fx0 fx0Var = fx0VarArr2[i4];
                    if (f2 <= fx0Var.b) {
                        if (fx0Var.p) {
                            fArr[i3] = fx0Var.q;
                            fArr[i3 + 1] = fx0Var.r;
                        } else {
                            fx0Var.c(f2);
                            fArr[i3] = fx0Var.a();
                            fArr[i3 + 1] = fx0Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                cn0Var4.e(i, fArr[i]);
                i++;
            }
        } else {
            cn0 A = A((j4 - 1) * 1000000, cn0Var, cn0Var2, cn0Var3);
            cn0 A2 = A(j4 * 1000000, cn0Var, cn0Var2, cn0Var3);
            int b = A.b();
            while (i < b) {
                cn0Var4.e(i, (A.a(i) - A2.a(i)) * 1000.0f);
                i++;
            }
        }
        return cn0Var4;
    }

    public xzt(roi roiVar, soi soiVar, int i, kya kyaVar) {
        this.b = roiVar;
        this.c = soiVar;
        this.a = i;
        this.d = kyaVar;
        this.e = szt.a;
        float[] fArr = szt.b;
        this.f = fArr;
        this.g = fArr;
        this.h = fArr;
        this.m = szt.c;
    }
}
