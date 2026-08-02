package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dpc extends xci implements yr5, ekj, bdi, sv7 {
    public final Function2 o;
    public boolean p;
    public boolean q;
    public final int r;

    public dpc(int i, int i2, Function2 function2) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.o = (i2 & 2) != 0 ? null : function2;
        this.r = i;
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.ekj
    public final void J() {
        V0();
    }

    @Override // defpackage.xci
    public final void L0() {
        int ordinal = U0().ordinal();
        if (ordinal == 0 || (ordinal != 1 && ordinal == 2)) {
            uoc uocVar = (uoc) bcx.G(this).getFocusOwner();
            uocVar.b(8, true, false);
            roc rocVar = uocVar.g;
            if (rocVar.f) {
                return;
            }
            rocVar.a.invoke(new ceb(0, rocVar, roc.class, "invalidateNodes", "invalidateNodes()V", 0, 26));
            rocVar.f = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [eqi] */
    public final void S0(bpc bpcVar, bpc bpcVar2) {
        cr crVar;
        Function2 function2;
        uoc uocVar = (uoc) bcx.G(this).getFocusOwner();
        dpc dpcVar = uocVar.l;
        if (!bpcVar.equals(bpcVar2) && (function2 = this.o) != null) {
            function2.invoke(bpcVar, bpcVar2);
        }
        xci xciVar = this.a;
        if (!xciVar.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = this.a;
        mpf F = bcx.F(this);
        while (F != null) {
            if ((((xci) F.F.f).d & 5120) != 0) {
                while (xciVar2 != null) {
                    int i = xciVar2.c;
                    if ((i & 5120) != 0) {
                        if (xciVar2 != xciVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            cw7 cw7Var = xciVar2;
                            ?? r6 = 0;
                            while (cw7Var != 0) {
                                if (cw7Var instanceof moc) {
                                    moc mocVar = (moc) cw7Var;
                                    if (dpcVar == uocVar.l) {
                                        mocVar.t(bpcVar2);
                                    }
                                } else if ((cw7Var.c & 4096) != 0 && (cw7Var instanceof cw7)) {
                                    xci xciVar3 = cw7Var.p;
                                    int i2 = 0;
                                    cw7Var = cw7Var;
                                    r6 = r6;
                                    while (xciVar3 != null) {
                                        if ((xciVar3.c & 4096) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                cw7Var = xciVar3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r6.d(cw7Var);
                                                    cw7Var = 0;
                                                }
                                                r6.d(xciVar3);
                                            }
                                        }
                                        xciVar3 = xciVar3.f;
                                        cw7Var = cw7Var;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cw7Var = bcx.p(r6);
                            }
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [eqi] */
    public final woc T0() {
        boolean z;
        cr crVar;
        woc wocVar = new woc();
        wocVar.a = true;
        yoc yocVar = yoc.b;
        wocVar.b = yocVar;
        wocVar.c = yocVar;
        wocVar.d = yocVar;
        wocVar.e = yocVar;
        wocVar.f = yocVar;
        wocVar.g = yocVar;
        wocVar.h = yocVar;
        wocVar.i = yocVar;
        wocVar.j = lhb.C;
        wocVar.k = lhb.D;
        int i = this.r;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((sne) ((une) ((tne) men.t(this, es5.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                xq0.q("Unknown Focusability");
                return null;
            }
            z = false;
        }
        wocVar.a = z;
        xci xciVar = this.a;
        if (!xciVar.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = this.a;
        mpf F = bcx.F(this);
        loop0: while (F != null) {
            if ((((xci) F.F.f).d & 3072) != 0) {
                while (xciVar2 != null) {
                    int i2 = xciVar2.c;
                    if ((i2 & 3072) != 0) {
                        if (xciVar2 != xciVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            cw7 cw7Var = xciVar2;
                            ?? r8 = 0;
                            while (cw7Var != 0) {
                                if (cw7Var instanceof xoc) {
                                    ((xoc) cw7Var).r(wocVar);
                                } else if ((cw7Var.c & 2048) != 0 && (cw7Var instanceof cw7)) {
                                    xci xciVar3 = cw7Var.p;
                                    int i3 = 0;
                                    cw7Var = cw7Var;
                                    r8 = r8;
                                    while (xciVar3 != null) {
                                        if ((xciVar3.c & 2048) != 0) {
                                            i3++;
                                            r8 = r8;
                                            if (i3 == 1) {
                                                cw7Var = xciVar3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r8.d(cw7Var);
                                                    cw7Var = 0;
                                                }
                                                r8.d(xciVar3);
                                            }
                                        }
                                        xciVar3 = xciVar3.f;
                                        cw7Var = cw7Var;
                                        r8 = r8;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cw7Var = bcx.p(r8);
                            }
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        return wocVar;
    }

    public final bpc U0() {
        cr crVar;
        if (!this.n) {
            return bpc.d;
        }
        uoc uocVar = (uoc) bcx.G(this).getFocusOwner();
        dpc dpcVar = uocVar.l;
        if (dpcVar == null) {
            return bpc.d;
        }
        if (this == dpcVar) {
            uocVar.getClass();
            return bpc.a;
        }
        if (dpcVar.n) {
            if (!dpcVar.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar = dpcVar.a.e;
            mpf F = bcx.F(dpcVar);
            while (F != null) {
                if ((((xci) F.F.f).d & 1024) != 0) {
                    while (xciVar != null) {
                        if ((xciVar.c & 1024) != 0) {
                            xci xciVar2 = xciVar;
                            eqi eqiVar = null;
                            while (xciVar2 != null) {
                                if (xciVar2 instanceof dpc) {
                                    if (this == ((dpc) xciVar2)) {
                                        return bpc.b;
                                    }
                                } else if ((xciVar2.c & 1024) != 0 && (xciVar2 instanceof cw7)) {
                                    int i = 0;
                                    for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                        if ((xciVar3.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                xciVar2 = xciVar3;
                                            } else {
                                                if (eqiVar == null) {
                                                    eqiVar = new eqi(new xci[16]);
                                                }
                                                if (xciVar2 != null) {
                                                    eqiVar.d(xciVar2);
                                                    xciVar2 = null;
                                                }
                                                eqiVar.d(xciVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                xciVar2 = bcx.p(eqiVar);
                            }
                        }
                        xciVar = xciVar.e;
                    }
                }
                F = F.u();
                xciVar = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
            }
        }
        return bpc.d;
    }

    public final void V0() {
        int ordinal = U0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            xqn xqnVar = new xqn();
            neg.y(this, new ssb(xqnVar, this, 1));
            Object obj = xqnVar.a;
            if (obj == null) {
                Intrinsics.j("focusProperties");
                throw null;
            }
            if (((voc) obj).d()) {
                return;
            }
            ((uoc) bcx.G(this).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean W0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z = false;
            if (!T0().a) {
                Trace.endSection();
                return false;
            }
            int ordinal = x97.B(this, i).ordinal();
            if (ordinal == 0) {
                z = x97.C(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z = true;
                } else if (ordinal != 3) {
                    throw new x7j();
                }
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.xci
    public final void K0() {
    }
}
