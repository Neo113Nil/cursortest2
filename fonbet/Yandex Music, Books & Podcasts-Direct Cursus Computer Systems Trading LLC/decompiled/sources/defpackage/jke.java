package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class jke implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ afn d;
    public final /* synthetic */ float e;

    public /* synthetic */ jke(nh0 nh0Var, float f, afn afnVar, float f2, int i) {
        this.a = i;
        this.b = nh0Var;
        this.c = f;
        this.d = afnVar;
        this.e = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        float f;
        nsh nshVar;
        long j2;
        nsh nshVar2;
        long j3;
        float f2;
        ou3 ou3Var;
        long j4;
        nsh nshVar3;
        switch (this.a) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                nh0 nh0Var = this.b;
                float f3 = this.c;
                afn afnVar = this.d;
                float f4 = this.e;
                ou3 ou3Var2 = opfVar.a;
                nsh nshVar4 = ou3Var2.b;
                long B = nshVar4.B();
                nshVar4.s().r();
                try {
                    ((nsh) ((xzi) nshVar4.b).a).s().h(nh0Var);
                    float f5 = -enj.f(ou3Var2.y0());
                    ((xzi) ou3Var2.b.b).m0(0.0f, f5);
                    try {
                        long y0 = ou3Var2.y0();
                        nsh nshVar5 = ou3Var2.b;
                        try {
                            long B2 = nshVar5.B();
                            nshVar5.s().r();
                            try {
                                ((xzi) nshVar5.b).f0(f3, 2.0f, y0);
                                nshVar = nshVar5;
                                f = -0.0f;
                                j2 = B2;
                                try {
                                    jpa.q(opfVar, afnVar, 0.0f, 0L, f4, null, 118);
                                    try {
                                        nshVar.s().k();
                                        nshVar.R(j2);
                                        try {
                                            ((xzi) ou3Var2.b.b).m0(-0.0f, -f5);
                                            vz1.A(nshVar4, B);
                                            return Unit.a;
                                        } catch (Throwable th) {
                                            th = th;
                                            j = B;
                                            vz1.A(nshVar4, j);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j = B;
                                        try {
                                            ((xzi) ou3Var2.b.b).m0(f, -f5);
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            vz1.A(nshVar4, j);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j = B;
                                    try {
                                        nshVar.s().k();
                                        nshVar.R(j2);
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        ((xzi) ou3Var2.b.b).m0(f, -f5);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                f = -0.0f;
                                nshVar = nshVar5;
                                j2 = B2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            f = -0.0f;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        f = -0.0f;
                        j = B;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    j = B;
                }
            default:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                opfVar2.a();
                nh0 nh0Var2 = this.b;
                float f6 = this.c;
                afn afnVar2 = this.d;
                float f7 = this.e;
                ou3 ou3Var3 = opfVar2.a;
                nsh nshVar6 = ou3Var3.b;
                long B3 = nshVar6.B();
                nshVar6.s().r();
                try {
                    ((nsh) ((xzi) nshVar6.b).a).s().h(nh0Var2);
                    f2 = -enj.f(ou3Var3.y0());
                    ((xzi) ou3Var3.b.b).m0(0.0f, f2);
                    try {
                        long y02 = ou3Var3.y0();
                        nsh nshVar7 = ou3Var3.b;
                        try {
                            long B4 = nshVar7.B();
                            nshVar7.s().r();
                            try {
                                ((xzi) nshVar7.b).f0(f6, 2.0f, y02);
                                nshVar3 = nshVar7;
                                nshVar2 = nshVar6;
                                j4 = B4;
                                try {
                                    jpa.q(opfVar2, afnVar2, 0.0f, 0L, f7, null, 118);
                                    try {
                                        nshVar3.s().k();
                                        nshVar3.R(j4);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        ou3Var = ou3Var3;
                                        j3 = B3;
                                        try {
                                            ((xzi) ou3Var.b.b).m0(-0.0f, -f2);
                                            throw th;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            vz1.A(nshVar2, j3);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    ou3Var = ou3Var3;
                                    j3 = B3;
                                    try {
                                        nshVar3.s().k();
                                        nshVar3.R(j4);
                                        throw th;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        ((xzi) ou3Var.b.b).m0(-0.0f, -f2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                ou3Var = ou3Var3;
                                nshVar2 = nshVar6;
                                j3 = B3;
                                j4 = B4;
                                nshVar3 = nshVar7;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            ou3Var = ou3Var3;
                            nshVar2 = nshVar6;
                            j3 = B3;
                            ((xzi) ou3Var.b.b).m0(-0.0f, -f2);
                            throw th;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        ou3Var = ou3Var3;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    nshVar2 = nshVar6;
                    j3 = B3;
                }
                try {
                    ((xzi) ou3Var3.b.b).m0(-0.0f, -f2);
                    vz1.A(nshVar2, B3);
                    return Unit.a;
                } catch (Throwable th18) {
                    th = th18;
                    j3 = B3;
                    vz1.A(nshVar2, j3);
                    throw th;
                }
        }
    }
}
