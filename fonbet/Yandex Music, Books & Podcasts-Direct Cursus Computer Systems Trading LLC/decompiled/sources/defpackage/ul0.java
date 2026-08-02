package defpackage;

import androidx.compose.ui.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ul0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ wn5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(d8t d8tVar, Object obj, Function1 function1, hl0 hl0Var, s2r s2rVar, wn5 wn5Var) {
        super(2);
        this.r = 2;
        this.s = d8tVar;
        this.t = obj;
        this.u = function1;
        this.v = hl0Var;
        this.w = s2rVar;
        this.x = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                etn.g((cqi) this.s, (yci) this.t, (e9b) this.u, (vpb) this.v, (String) this.w, this.x, (hq5) obj, rvf.R(1575943));
                break;
            case 1:
                ((Number) obj2).intValue();
                etn.c((cqi) this.s, (yci) this.t, (e9b) this.u, (vpb) this.v, (String) this.w, this.x, (hq5) obj, rvf.R(196609));
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                Function1 function1 = (Function1) this.u;
                hl0 hl0Var = (hl0) this.v;
                d8t d8tVar = (d8t) this.s;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var.K();
                    Object obj3 = gq5.a;
                    if (K == obj3) {
                        K = (zd6) function1.invoke(hl0Var);
                        oq5Var.k0(K);
                    }
                    zd6 zd6Var = (zd6) K;
                    x7t f = d8tVar.f();
                    x6k x6kVar = d8tVar.d;
                    Object a = f.a();
                    Object obj4 = this.t;
                    boolean g = oq5Var.g(Intrinsics.d(a, obj4));
                    Object K2 = oq5Var.K();
                    if (g || K2 == obj3) {
                        K2 = Intrinsics.d(d8tVar.f().a(), obj4) ? vpb.b : ((zd6) function1.invoke(hl0Var)).b;
                        oq5Var.k0(K2);
                    }
                    vpb vpbVar = (vpb) K2;
                    Object K3 = oq5Var.K();
                    if (K3 == obj3) {
                        K3 = new dl0(Intrinsics.d(obj4, x6kVar.getValue()));
                        oq5Var.k0(K3);
                    }
                    dl0 dl0Var = (dl0) K3;
                    e9b e9bVar = zd6Var.a;
                    boolean h = oq5Var.h(zd6Var);
                    Object K4 = oq5Var.K();
                    if (h || K4 == obj3) {
                        K4 = new wk0(0, zd6Var);
                        oq5Var.k0(K4);
                    }
                    yci b = a.b(vci.a, (pyc) K4);
                    dl0Var.a.setValue(Boolean.valueOf(Intrinsics.d(obj4, x6kVar.getValue())));
                    yci f2 = b.f(dl0Var);
                    boolean h2 = oq5Var.h(obj4);
                    Object K5 = oq5Var.K();
                    if (h2 || K5 == obj3) {
                        K5 = new xk0(0, obj4);
                        oq5Var.k0(K5);
                    }
                    Function1 function12 = (Function1) K5;
                    boolean f3 = oq5Var.f(vpbVar);
                    Object K6 = oq5Var.K();
                    if (f3 || K6 == obj3) {
                        K6 = new y5(3, vpbVar);
                        oq5Var.k0(K6);
                    }
                    etn.b(d8tVar, function12, f2, e9bVar, vpbVar, (Function2) K6, ild.C(-616195562, new zk0((s2r) this.w, obj4, hl0Var, this.x, 0), oq5Var), oq5Var, 12582912);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul0(cqi cqiVar, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = cqiVar;
        this.t = yciVar;
        this.u = e9bVar;
        this.v = vpbVar;
        this.w = str;
        this.x = wn5Var;
    }
}
