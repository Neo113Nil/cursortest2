package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class kuf {
    public static final float a = 2500;
    public static final float b = 1500;
    public static final float c = 50;

    public static final boolean a(boolean z, dvf dvfVar, int i, int i2) {
        if (z) {
            if (dvfVar.c() > i) {
                return true;
            }
            return dvfVar.c() == i && dvfVar.d() > i2;
        }
        if (dvfVar.c() < i) {
            return true;
        }
        return dvfVar.c() == i && dvfVar.d() < i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[Catch: bze -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {bze -> 0x01c5, blocks: (B:26:0x00c8, B:33:0x00e6, B:41:0x010e, B:43:0x0124, B:46:0x0139), top: B:25:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0192 -> B:21:0x019d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(dvf dvfVar, int i, int i2, int i3, jx7 jx7Var, cg6 cg6Var) {
        iuf iufVar;
        nm6 nm6Var;
        int i4;
        ?? r9;
        int i5;
        int i6;
        float n0;
        float n02;
        float n03;
        tqn tqnVar;
        xqn xqnVar;
        float f;
        int i7;
        float f2;
        int i8;
        int i9;
        vqn vqnVar;
        dvf dvfVar2;
        dvf dvfVar3;
        vm0 Z;
        Float f3;
        boolean z;
        yf0 yf0Var;
        int i10;
        int i11;
        dvf dvfVar4;
        dvf dvfVar5;
        float f4;
        iuf iufVar2;
        dvf dvfVar6;
        int i12;
        float f5;
        int i13;
        tqn tqnVar2;
        xqn xqnVar2;
        dvf dvfVar7;
        int i14;
        int i15;
        dvf dvfVar8;
        int i16 = i;
        if (cg6Var instanceof iuf) {
            iufVar = (iuf) cg6Var;
            int i17 = iufVar.v;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                iufVar.v = i17 - Integer.MIN_VALUE;
                Object obj = iufVar.u;
                nm6Var = nm6.a;
                i4 = iufVar.v;
                float f6 = 0.0f;
                boolean z2 = true;
                if (i4 != 0) {
                    qgg.h0(obj);
                    if (i16 < 0.0f) {
                        vme.a("Index should be non-negative");
                    }
                    try {
                        n0 = jx7Var.n0(a);
                        n02 = jx7Var.n0(b);
                        n03 = jx7Var.n0(c);
                        tqnVar = new tqn();
                        tqnVar.a = true;
                        xqnVar = new xqn();
                        xqnVar.a = wdp.J(0.0f, 0.0f, 30);
                        r9 = c(dvfVar, i);
                        try {
                        } catch (bze e) {
                            e = e;
                            i5 = i2;
                            i6 = i16;
                            dvfVar3 = r9;
                            Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
                            float f7 = e.a + i5;
                            uqn uqnVar = new uqn();
                            f3 = new Float(f7);
                            if (((Number) Z.a()).floatValue() == 0.0f) {
                            }
                            yf0Var = new yf0(f7, 2, uqnVar, dvfVar3);
                            iufVar.j = dvfVar3;
                            iufVar.k = null;
                            iufVar.l = null;
                            iufVar.m = null;
                            iufVar.n = i6;
                            iufVar.o = i5;
                            iufVar.v = 2;
                            if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
                            }
                            return nm6Var;
                        }
                    } catch (bze e2) {
                        e = e2;
                        r9 = dvfVar;
                    }
                    if (r9 != 0) {
                        throw new bze(dvfVar.b(i), (vm0) xqnVar.a);
                    }
                    dvf dvfVar9 = dvfVar;
                    int i18 = i16 > ((fvf) dvfVar9.c).h() ? 1 : 0;
                    vqn vqnVar2 = new vqn();
                    vqnVar2.a = 1;
                    f = n03;
                    i7 = i18;
                    f2 = n0;
                    i8 = i2;
                    i9 = i3;
                    vqnVar = vqnVar2;
                    dvfVar5 = dvfVar9;
                    f4 = n02;
                    if (tqnVar.a) {
                    }
                    return Unit.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i11 = iufVar.o;
                    i10 = iufVar.n;
                    dvfVar4 = iufVar.j;
                    qgg.h0(obj);
                    dvfVar4.f(i10, i11);
                    return Unit.a;
                }
                i7 = iufVar.q;
                float f8 = iufVar.t;
                n02 = iufVar.s;
                f2 = iufVar.r;
                int i19 = iufVar.p;
                int i20 = iufVar.o;
                int i21 = iufVar.n;
                vqn vqnVar3 = iufVar.m;
                xqn xqnVar3 = iufVar.l;
                tqn tqnVar3 = iufVar.k;
                dvf dvfVar10 = iufVar.j;
                try {
                    qgg.h0(obj);
                    dvfVar8 = dvfVar10;
                    tqnVar = tqnVar3;
                    xqnVar = xqnVar3;
                    f = f8;
                    i15 = 1;
                    i9 = i19;
                    i8 = i20;
                    try {
                        try {
                            vqnVar3.a += i15;
                            i16 = i21;
                            vqnVar = vqnVar3;
                            f6 = 0.0f;
                            z2 = true;
                            dvfVar5 = dvfVar8;
                        } catch (bze e3) {
                            e = e3;
                            i6 = i21;
                            dvfVar2 = dvfVar8;
                            i5 = i8;
                            dvfVar3 = dvfVar2;
                            Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
                            float f72 = e.a + i5;
                            uqn uqnVar2 = new uqn();
                            f3 = new Float(f72);
                            if (((Number) Z.a()).floatValue() == 0.0f) {
                            }
                            yf0Var = new yf0(f72, 2, uqnVar2, dvfVar3);
                            iufVar.j = dvfVar3;
                            iufVar.k = null;
                            iufVar.l = null;
                            iufVar.m = null;
                            iufVar.n = i6;
                            iufVar.o = i5;
                            iufVar.v = 2;
                            if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
                            }
                            return nm6Var;
                        }
                    } catch (bze e4) {
                        e = e4;
                        i6 = i16;
                        dvfVar2 = dvfVar5;
                    }
                    f4 = n02;
                } catch (bze e5) {
                    e = e5;
                    dvfVar3 = dvfVar10;
                    i5 = i20;
                    i6 = i21;
                }
                if (tqnVar.a) {
                    try {
                    } catch (bze e6) {
                        e = e6;
                        i6 = i16;
                        iufVar2 = iufVar;
                        dvfVar6 = dvfVar5;
                        i5 = i8;
                    }
                    switch (dvfVar5.a) {
                        case 0:
                            i12 = ((fvf) dvfVar5.c).j().n;
                            if (i12 > 0) {
                                try {
                                    try {
                                        try {
                                            try {
                                                int b2 = dvfVar5.b(i16) + i8;
                                                if (Math.abs(b2) >= f2) {
                                                    f5 = i7 != 0 ? f2 : -f2;
                                                } else {
                                                    try {
                                                        f5 = Math.max(Math.abs(b2), f);
                                                        if (i7 == 0) {
                                                            f5 = -f5;
                                                        }
                                                    } catch (bze e7) {
                                                        e = e7;
                                                        i6 = i16;
                                                        dvfVar2 = dvfVar5;
                                                        i5 = i8;
                                                        dvfVar3 = dvfVar2;
                                                        Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
                                                        float f722 = e.a + i5;
                                                        uqn uqnVar22 = new uqn();
                                                        f3 = new Float(f722);
                                                        if (((Number) Z.a()).floatValue() == 0.0f) {
                                                        }
                                                        yf0Var = new yf0(f722, 2, uqnVar22, dvfVar3);
                                                        iufVar.j = dvfVar3;
                                                        iufVar.k = null;
                                                        iufVar.l = null;
                                                        iufVar.m = null;
                                                        iufVar.n = i6;
                                                        iufVar.o = i5;
                                                        iufVar.v = 2;
                                                        if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
                                                        }
                                                        return nm6Var;
                                                    }
                                                }
                                                vm0 Z2 = wdp.Z((vm0) xqnVar.a, f6, f6, 30);
                                                xqnVar.a = Z2;
                                                uqn uqnVar3 = new uqn();
                                                Float f9 = new Float(f5);
                                                boolean z3 = (((Number) ((vm0) xqnVar.a).a()).floatValue() == f6 ? z2 : false) ^ z2;
                                                juf jufVar = new juf(dvfVar7, i13, f5, uqnVar3, tqnVar2, i7 != 0 ? z2 : false, f4, vqnVar, i9, i8, xqnVar2);
                                                iufVar.j = dvfVar7;
                                                iufVar.k = tqnVar2;
                                                iufVar.l = xqnVar2;
                                                iufVar.m = vqnVar3;
                                                iufVar.n = i6;
                                                iufVar.o = i5;
                                                iufVar.p = i14;
                                                iufVar.r = f2;
                                                iufVar.s = n02;
                                                iufVar.t = f;
                                                iufVar.q = i7;
                                                iufVar.v = 1;
                                                if (v5g.s(Z2, f9, null, z3, jufVar, iufVar2, 2) != nm6Var) {
                                                    i21 = i6;
                                                    i8 = i5;
                                                    tqnVar = tqnVar2;
                                                    xqnVar = xqnVar2;
                                                    iufVar = iufVar2;
                                                    dvfVar8 = dvfVar6;
                                                    i9 = i14;
                                                    vqnVar3.a += i15;
                                                    i16 = i21;
                                                    vqnVar = vqnVar3;
                                                    f6 = 0.0f;
                                                    z2 = true;
                                                    dvfVar5 = dvfVar8;
                                                    f4 = n02;
                                                    if (tqnVar.a) {
                                                    }
                                                }
                                            } catch (bze e8) {
                                                e = e8;
                                                dvfVar6 = dvfVar7;
                                            }
                                            i6 = i13;
                                            n02 = f4;
                                            vqnVar3 = vqnVar;
                                            i14 = i9;
                                            i5 = i8;
                                        } catch (bze e9) {
                                            e = e9;
                                            dvfVar3 = dvfVar6;
                                            Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
                                            float f7222 = e.a + i5;
                                            uqn uqnVar222 = new uqn();
                                            f3 = new Float(f7222);
                                            if (((Number) Z.a()).floatValue() == 0.0f) {
                                            }
                                            yf0Var = new yf0(f7222, 2, uqnVar222, dvfVar3);
                                            iufVar.j = dvfVar3;
                                            iufVar.k = null;
                                            iufVar.l = null;
                                            iufVar.m = null;
                                            iufVar.n = i6;
                                            iufVar.o = i5;
                                            iufVar.v = 2;
                                            if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
                                            }
                                            return nm6Var;
                                        }
                                        dvfVar6 = dvfVar7;
                                        i15 = 1;
                                    } catch (bze e10) {
                                        e = e10;
                                        iufVar = iufVar2;
                                        dvfVar3 = dvfVar6;
                                        Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
                                        float f72222 = e.a + i5;
                                        uqn uqnVar2222 = new uqn();
                                        f3 = new Float(f72222);
                                        if (((Number) Z.a()).floatValue() == 0.0f) {
                                        }
                                        yf0Var = new yf0(f72222, 2, uqnVar2222, dvfVar3);
                                        iufVar.j = dvfVar3;
                                        iufVar.k = null;
                                        iufVar.l = null;
                                        iufVar.m = null;
                                        iufVar.n = i6;
                                        iufVar.o = i5;
                                        iufVar.v = 2;
                                        if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
                                        }
                                        return nm6Var;
                                    }
                                    iufVar2 = iufVar;
                                } catch (bze e11) {
                                    e = e11;
                                    dvfVar6 = dvfVar7;
                                    i6 = i13;
                                    i5 = i8;
                                }
                                i13 = i16;
                                tqnVar2 = tqnVar;
                                xqnVar2 = xqnVar;
                                dvfVar7 = dvfVar5;
                                return nm6Var;
                            }
                            break;
                        default:
                            i12 = ((o3k) dvfVar5.c).n();
                            if (i12 > 0) {
                            }
                            break;
                    }
                }
                return Unit.a;
                Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
                float f722222 = e.a + i5;
                uqn uqnVar22222 = new uqn();
                f3 = new Float(f722222);
                z = ((Number) Z.a()).floatValue() == 0.0f;
                yf0Var = new yf0(f722222, 2, uqnVar22222, dvfVar3);
                iufVar.j = dvfVar3;
                iufVar.k = null;
                iufVar.l = null;
                iufVar.m = null;
                iufVar.n = i6;
                iufVar.o = i5;
                iufVar.v = 2;
                if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
                    i10 = i6;
                    i11 = i5;
                    dvfVar4 = dvfVar3;
                    dvfVar4.f(i10, i11);
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        iufVar = new iuf(cg6Var);
        Object obj2 = iufVar.u;
        nm6Var = nm6.a;
        i4 = iufVar.v;
        float f62 = 0.0f;
        boolean z22 = true;
        if (i4 != 0) {
        }
        Z = wdp.Z(e.b, 0.0f, 0.0f, 30);
        float f7222222 = e.a + i5;
        uqn uqnVar222222 = new uqn();
        f3 = new Float(f7222222);
        if (((Number) Z.a()).floatValue() == 0.0f) {
        }
        yf0Var = new yf0(f7222222, 2, uqnVar222222, dvfVar3);
        iufVar.j = dvfVar3;
        iufVar.k = null;
        iufVar.l = null;
        iufVar.m = null;
        iufVar.n = i6;
        iufVar.o = i5;
        iufVar.v = 2;
        if (v5g.s(Z, f3, null, !z, yf0Var, iufVar, 2) != nm6Var) {
        }
        return nm6Var;
    }

    public static final boolean c(dvf dvfVar, int i) {
        return i <= dvfVar.e() && dvfVar.c() <= i;
    }
}
