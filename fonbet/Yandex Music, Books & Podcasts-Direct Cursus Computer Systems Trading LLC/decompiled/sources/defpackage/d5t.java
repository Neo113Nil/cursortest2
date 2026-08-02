package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d5t implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ g5t b;
    public final /* synthetic */ y c;
    public final /* synthetic */ sai d;
    public final /* synthetic */ e6t e;
    public final /* synthetic */ tmb f;
    public final /* synthetic */ fvf g;

    public /* synthetic */ d5t(g5t g5tVar, y yVar, sai saiVar, e6t e6tVar, tmb tmbVar, fvf fvfVar, int i) {
        this.b = g5tVar;
        this.c = yVar;
        this.d = saiVar;
        this.e = e6tVar;
        this.f = tmbVar;
        this.g = fvfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    e6t e6tVar = this.e;
                    b6t b6tVar = (b6t) gld.M(e6tVar.v, oq5Var).getValue();
                    c3r c3rVar = (c3r) oq5Var.j(es5.p);
                    if (c3rVar != null) {
                        ((nw7) c3rVar).a();
                    }
                    boolean z = b6tVar instanceof y5t;
                    g5t g5tVar = this.b;
                    Continuation continuation = null;
                    kjn kjnVar = gq5.a;
                    if (z) {
                        oq5Var.Z(1560644446);
                        Unit unit = Unit.a;
                        boolean h = oq5Var.h(g5tVar);
                        Object K = oq5Var.K();
                        if (h || K == kjnVar) {
                            K = new f5t(g5tVar, continuation, 0);
                            oq5Var.k0(K);
                        }
                        gld.w(oq5Var, unit, (Function2) K);
                        y5t y5tVar = (y5t) b6tVar;
                        boolean h2 = oq5Var.h(e6tVar);
                        Object K2 = oq5Var.K();
                        if (h2 || K2 == kjnVar) {
                            K2 = new r3s(7, e6tVar);
                            oq5Var.k0(K2);
                        }
                        g0g.x(y5tVar, this.f, (Function1) K2, oq5Var, 64);
                        oq5Var.p(false);
                    } else if (b6tVar instanceof z5t) {
                        oq5Var.Z(-1196570437);
                        cb0.q((z5t) b6tVar, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        if (!(b6tVar instanceof a6t)) {
                            throw vz1.i(oq5Var, -1196583323, false);
                        }
                        oq5Var.Z(1561141159);
                        Unit unit2 = Unit.a;
                        boolean h3 = oq5Var.h(g5tVar);
                        Object K3 = oq5Var.K();
                        if (h3 || K3 == kjnVar) {
                            K3 = new f5t(g5tVar, continuation, 1);
                            oq5Var.k0(K3);
                        }
                        gld.w(oq5Var, unit2, (Function2) K3);
                        Object K4 = oq5Var.K();
                        if (K4 == kjnVar) {
                            b5t b5tVar = (b5t) g5tVar.j.getValue();
                            Context requireContext = g5tVar.requireContext();
                            requireContext.getClass();
                            kxi kxiVar = g5tVar.y().c;
                            Bundle requireArguments = g5tVar.requireArguments();
                            requireArguments.getClass();
                            gj gjVar = (gj) ((Parcelable) vwb.O(requireArguments, gj.class, "TRAILER_AD_DATA_ARG_KEY"));
                            b5tVar.getClass();
                            y yVar = this.c;
                            yVar.getClass();
                            yVar.getClass();
                            tao taoVar = new tao();
                            taoVar.a = requireContext;
                            taoVar.b = yVar;
                            taoVar.c = kxiVar;
                            taoVar.e = gjVar;
                            taoVar.d = l18.b.b(hag.I(mvp.class), true);
                            K4 = new h5t(e6tVar, taoVar, new zhs(0, this.d, sai.class, "hide", "hide()V", 0, 14));
                            oq5Var.k0(K4);
                        }
                        k5t.a((h5t) K4, (a6t) b6tVar, this.g, oq5Var, 0);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                this.b.x(this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(4097));
                return Unit.a;
        }
    }

    public /* synthetic */ d5t(e6t e6tVar, g5t g5tVar, tmb tmbVar, fvf fvfVar, y yVar, sai saiVar) {
        this.e = e6tVar;
        this.b = g5tVar;
        this.f = tmbVar;
        this.g = fvfVar;
        this.c = yVar;
        this.d = saiVar;
    }
}
