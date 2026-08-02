package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class il6 implements kfh {
    public final /* synthetic */ axf a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ybs c;
    public final /* synthetic */ mnj d;
    public final /* synthetic */ jx7 e;
    public final /* synthetic */ int f;

    public il6(axf axfVar, Function1 function1, ybs ybsVar, mnj mnjVar, jx7 jx7Var, int i) {
        this.a = axfVar;
        this.b = function1;
        this.c = ybsVar;
        this.d = mnjVar;
        this.e = jx7Var;
        this.f = i;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        axf axfVar = this.a;
        axfVar.a.a(fxeVar.getLayoutDirection());
        dn9 dn9Var = axfVar.a.j;
        if (dn9Var != null) {
            return wxf.n(dn9Var.b());
        }
        xq0.q("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    @Override // defpackage.kfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, long j) {
        long j2;
        axf axfVar;
        cds cdsVar;
        dds ddsVar;
        cds cdsVar2;
        cds cdsVar3;
        il6 il6Var;
        axf axfVar2;
        int i;
        axf axfVar3 = this.a;
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            dds d = axfVar3.d();
            cds cdsVar4 = d != null ? d.a : null;
            das dasVar = axfVar3.a;
            xof layoutDirection = mfhVar.getLayoutDirection();
            int i2 = dasVar.f;
            boolean z = dasVar.e;
            int i3 = dasVar.c;
            if (cdsVar4 != null) {
                ogi ogiVar = cdsVar4.b;
                bds bdsVar = cdsVar4.a;
                mn0 mn0Var = dasVar.a;
                ges gesVar = dasVar.b;
                List list2 = dasVar.i;
                jx7 jx7Var = dasVar.g;
                ppc ppcVar = dasVar.h;
                cds cdsVar5 = cdsVar4;
                if (ogiVar.a.a()) {
                    j2 = j;
                    axfVar = axfVar3;
                } else {
                    mn0 mn0Var2 = bdsVar.a;
                    axfVar = axfVar3;
                    long j3 = bdsVar.j;
                    if (Intrinsics.d(mn0Var2, mn0Var) && bdsVar.b.d(gesVar) && Intrinsics.d(bdsVar.c, list2) && bdsVar.d == i3 && bdsVar.e == z && bdsVar.f == i2 && Intrinsics.d(bdsVar.g, jx7Var) && bdsVar.h == layoutDirection && Intrinsics.d(bdsVar.i, ppcVar) && ga6.k(j) == ga6.k(j3) && ((!z && i2 != 2) || (ga6.i(j) == ga6.i(j3) && ga6.h(j) == ga6.h(j3)))) {
                        cdsVar3 = new cds(new bds(bdsVar.a, dasVar.b, bdsVar.c, bdsVar.d, bdsVar.e, bdsVar.f, bdsVar.g, bdsVar.h, bdsVar.i, j), ogiVar, ia6.d(j, (wxf.n(ogiVar.e) & 4294967295L) | (wxf.n(ogiVar.d) << 32)));
                        cdsVar2 = cdsVar5;
                        ddsVar = d;
                        long j4 = cdsVar3.c;
                        Integer valueOf = Integer.valueOf((int) (j4 >> 32));
                        Integer valueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                        int intValue = valueOf.intValue();
                        int intValue2 = valueOf2.intValue();
                        if (Intrinsics.d(cdsVar2, cdsVar3)) {
                            axfVar2 = axfVar;
                            axfVar2.i.setValue(new dds(cdsVar3, ddsVar != null ? ddsVar.c : null));
                            i = 0;
                            axfVar2.p = false;
                            il6Var = this;
                            il6Var.b.invoke(cdsVar3);
                            j66.l0(axfVar2, il6Var.c, il6Var.d);
                        } else {
                            il6Var = this;
                            axfVar2 = axfVar;
                            i = 0;
                        }
                        axfVar2.g.setValue(new cma(il6Var.e.c0(il6Var.f != 1 ? wxf.n(cdsVar3.b.c(i)) : i)));
                        return mfhVar.w0(intValue, intValue2, uah.e(new Pair(j40.a, Integer.valueOf(Math.round(cdsVar3.d))), new Pair(j40.b, Integer.valueOf(Math.round(cdsVar3.e)))), gx3.X);
                    }
                    j2 = j;
                }
                cdsVar = cdsVar5;
            } else {
                j2 = j;
                axfVar = axfVar3;
                cdsVar = cdsVar4;
            }
            dasVar.a(layoutDirection);
            int k = ga6.k(j2);
            int i4 = ((z || i2 == 2) && ga6.e(j2)) ? ga6.i(j2) : Integer.MAX_VALUE;
            int i5 = (z || i2 != 2) ? i3 : 1;
            if (k != i4) {
                dn9 dn9Var = dasVar.j;
                if (dn9Var == null) {
                    xq0.q("layoutIntrinsics must be called first");
                    return null;
                }
                i4 = yhn.d(wxf.n(dn9Var.b()), k, i4);
            }
            dn9 dn9Var2 = dasVar.j;
            if (dn9Var2 == null) {
                xq0.q("layoutIntrinsics must be called first");
                return null;
            }
            ogi ogiVar2 = new ogi(dn9Var2, qld.A(0, i4, 0, ga6.h(j2)), i5, dasVar.f);
            long d2 = ia6.d(j2, (wxf.n(ogiVar2.d) << 32) | (wxf.n(ogiVar2.e) & 4294967295L));
            cdsVar2 = cdsVar;
            ddsVar = d;
            cdsVar3 = new cds(new bds(dasVar.a, dasVar.b, dasVar.i, dasVar.c, dasVar.e, dasVar.f, dasVar.g, layoutDirection, dasVar.h, j2), ogiVar2, d2);
            long j42 = cdsVar3.c;
            Integer valueOf3 = Integer.valueOf((int) (j42 >> 32));
            Integer valueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
            int intValue3 = valueOf3.intValue();
            int intValue22 = valueOf22.intValue();
            if (Intrinsics.d(cdsVar2, cdsVar3)) {
            }
            axfVar2.g.setValue(new cma(il6Var.e.c0(il6Var.f != 1 ? wxf.n(cdsVar3.b.c(i)) : i)));
            return mfhVar.w0(intValue3, intValue22, uah.e(new Pair(j40.a, Integer.valueOf(Math.round(cdsVar3.d))), new Pair(j40.b, Integer.valueOf(Math.round(cdsVar3.e)))), gx3.X);
        } finally {
            wyf.b0(G, Q, e);
        }
    }
}
