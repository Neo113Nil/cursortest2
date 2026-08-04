package com.gamericefishpro.space.t0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements c {
    public final com.gamericefishpro.space.t.v d = new com.gamericefishpro.space.t.v();
    public final com.gamericefishpro.space.t.d0 e = new com.gamericefishpro.space.t.d0();
    public final Object i;

    public v1(Object obj) {
        this.i = obj;
    }

    public final void a(com.gamericefishpro.space.h2.d2 d2Var, com.gamericefishpro.space.u6.q qVar) {
        Exception exc;
        com.gamericefishpro.space.t.v vVar = this.d;
        int i = vVar.b;
        com.gamericefishpro.space.t.d0 d0Var = new com.gamericefishpro.space.t.d0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            com.gamericefishpro.space.t.d0 d0Var2 = this.e;
            if (i2 >= i) {
                if (i3 != d0Var2.b) {
                    s.a("Applier operation size mismatch");
                }
                d0Var2.d();
                vVar.b = 0;
                d2Var.h();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (vVar.b(i2)) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            d2Var.l();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            d2Var.d(d0Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            d2Var.j(vVar.b(i4), vVar.b(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    d2Var.i(vVar.b(i4), vVar.b(i7), vVar.b(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            d2Var.a();
                            i2 = i4;
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            d2Var.c(vVar.b(i4), d0Var2.f(i3));
                            i3 = i9;
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                vVar.b(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object objF = d0Var2.f(i3);
                            Intrinsics.c(objF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            com.gamericefishpro.space.ei.e0.c(2, objF);
                            i3 += 2;
                            d2Var.n(d0Var2.f(i11), (Function2) objF);
                            i2 = i4;
                            break;
                        case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                            Object obj = d2Var.i;
                            if (obj instanceof j) {
                                j jVar = (j) obj;
                                if (((com.gamericefishpro.space.v0.e) qVar.f).k(jVar)) {
                                    jVar.e();
                                }
                            }
                            d0Var.a(obj);
                            d2Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                d2Var.h();
                throw th;
            }
            exc = e3;
            throw new l(d0Var2, d0Var, vVar, i2 - 1, exc);
        }
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void c(int i, Object obj) {
        com.gamericefishpro.space.t.v vVar = this.d;
        vVar.a(5);
        vVar.a(i);
        this.e.a(obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void d(Object obj) {
        this.d.a(1);
        this.e.a(obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void e() {
        this.d.a(8);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void g(int i, Object obj) {
        com.gamericefishpro.space.t.v vVar = this.d;
        vVar.a(6);
        vVar.a(i);
        this.e.a(obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final Object getCurrent() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void i(int i, int i2, int i3) {
        com.gamericefishpro.space.t.v vVar = this.d;
        vVar.a(3);
        vVar.a(i);
        vVar.a(i2);
        vVar.a(i3);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void j(int i, int i2) {
        com.gamericefishpro.space.t.v vVar = this.d;
        vVar.a(2);
        vVar.a(i);
        vVar.a(i2);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void l() {
        this.d.a(0);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void n(Object obj, Function2 function2) {
        this.d.a(7);
        com.gamericefishpro.space.t.d0 d0Var = this.e;
        d0Var.a(function2);
        d0Var.a(obj);
    }
}
