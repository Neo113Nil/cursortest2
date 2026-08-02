package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.go.multimodal_route.interactors.h;
import com.yandex.go.navigator.driving.SearchSourceType;
import com.yandex.go.navigator.gas_stations.repositories.c;
import com.yandex.go.preorder.confirm.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.y;
import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.d;
import com.yandex.go.walking.navigation.impl.guidance.overlay.b;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.cashback.router.f;
import ru.yandex.taxi.styling.g;

/* loaded from: classes12.dex */
public final class xus extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public Object H;
    public Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xus(ney neyVar, vw2 vw2Var, f fVar, yvf0 yvf0Var, oqd0 oqd0Var) {
        super(null);
        this.D = 4;
        this.F = neyVar;
        this.G = vw2Var;
        this.H = fVar;
        this.E = yvf0Var;
        this.I = oqd0Var;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        int i = this.D;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                ((kts) this.G).a = SearchSourceType.FILTER;
                ((c) this.H).g.l(null);
                ((tus) this.I).b();
                break;
            case 2:
                d dVar = (d) this.I;
                if (dVar != null) {
                    ah00 ah00Var = dVar.b;
                    dVar.a.Cg();
                    dVar.e.detach();
                    o1v o1vVar = dVar.c;
                    LinkedHashMap linkedHashMap = o1vVar.d;
                    o1vVar.g.cancel();
                    ArrayList arrayList = o1vVar.c;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((w4e0) it.next()).d();
                    }
                    arrayList.clear();
                    ArrayList arrayList2 = o1vVar.e;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((w4e0) it2.next()).d();
                        }
                    }
                    o1vVar.e = null;
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((f4c0) it3.next()).d();
                    }
                    linkedHashMap.clear();
                    xm00 xm00Var = dVar.f;
                    if (xm00Var != null) {
                        xm00Var.m();
                    }
                    xm00 xm00Var2 = dVar.f;
                    if (xm00Var2 != null) {
                        xm00Var2.d();
                    }
                    dVar.f = null;
                    gh00 gh00Var = (gh00) ah00Var;
                    gh00Var.s(dVar.h);
                    gh00Var.u(dVar.i);
                    if (((l141) dVar.d).a()) {
                        gh00Var.I(false);
                        gh00Var.v();
                    }
                }
                this.I = null;
                break;
            case 4:
                f fVar = (f) this.H;
                pzt0 pzt0Var = fVar.d;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                fVar.d = null;
                ((ney) obj2).d(this);
                ((oqd0) this.I).a();
                break;
            case 6:
                ((Activity) obj2).getWindow().clearFlags(128);
                i541 i541Var = (i541) this.H;
                i541Var.Ig();
                i541Var.A.Cg();
                xm00 xm00Var3 = i541Var.E;
                xm00Var3.m();
                xm00Var3.d();
                i541Var.D.b();
                b bVar = (b) this.I;
                if (bVar != null) {
                    bVar.detach();
                }
                this.I = null;
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = 0;
        switch (this.D) {
            case 0:
                C((m950) ((yvf0) this.E).get(), new wus(this));
                return;
            case 1:
                o2y0 o2y0Var = (o2y0) obj;
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context) this.I, ((g) ((oxu0) this.H)).b().b);
                j4n j4nVar = (j4n) ((oj) this.F).get();
                w030 a = ((i130) this.E).a();
                o2y0Var.getClass();
                a.getClass();
                xwf xwfVar = new xwf(j4nVar, 1);
                int i2 = 24;
                t160 t160Var = new t160(xwfVar, i2);
                n3w a2 = n3w.a(o2y0Var);
                dx7 dx7Var = new dx7(t160Var, a2, i);
                n3w a3 = n3w.a(contextThemeWrapper);
                n3w a4 = n3w.a(new rx7(new c06(dx7Var, a3)));
                xwf xwfVar2 = new xwf(j4nVar, i);
                jx7 jx7Var = ix7.a;
                kj7 kj7Var = new kj7((xvf0) jx7Var, (xvf0) xwfVar2, (xvf0) a2, 3, (byte) 0);
                xvf0 b = i5m.b(ey7.a);
                pg5 pg5Var = new pg5(new xwf(j4nVar, 5), i2);
                xwf xwfVar3 = new xwf(j4nVar, 6);
                n3w a5 = n3w.a(new by7(new m2v(kj7Var, new yc(15, a2, b, jx7Var, pg5Var, xwfVar2, xwfVar3), dx7Var, new xwf(j4nVar, 4))));
                n3w a6 = n3w.a(new iy7(new m2v(new xwf(j4nVar, 2), a3, new xwf(j4nVar, 3), xwfVar3)));
                t4 t4Var = new t4(a3, n3w.a(a), new uzu0(xwfVar, 20), hv7.a, 18);
                ((hx7) this.G).getClass();
                CancelReasonsGrouped cancelReasonsGrouped = o2y0Var.b().V().A.g;
                Object gx7Var = cancelReasonsGrouped != null ? new gx7(cancelReasonsGrouped) : o2y0Var.b().V().A.f != null ? fx7.a : new ex7(hx7.a(o2y0Var));
                if (gx7Var instanceof ex7) {
                    A(new dr7(1, (rx7) a4.a, a), ((ex7) gx7Var).a, new lx7(this));
                    return;
                }
                if (gx7Var instanceof fx7) {
                    A(new da0((by7) a5.a, (iy7) a6.a, a), zy11.a, new mx7(this));
                    return;
                }
                if (!(gx7Var instanceof gx7)) {
                    w511.b();
                    return;
                }
                Object obj2 = ((gx7) gx7Var).a;
                pho phoVar = (pho) j4nVar.a;
                q5z.h(phoVar);
                co40 co40Var = new co40(phoVar);
                tt2 tt2Var = (tt2) j4nVar.c;
                q5z.h(tt2Var);
                A(new oy7(contextThemeWrapper, a, co40Var, tt2Var, t4Var), obj2, new ox7(this));
                return;
            case 2:
                g2v g2vVar = (g2v) this.F;
                xl10 xl10Var = new xl10(this);
                s14 s14Var = g2vVar.a;
                fw20 fw20Var = new fw20(xl10Var, (ah00) ((xvf0) s14Var.a).get(), (a3v) ((xvf0) s14Var.c).get(), (et00) ((xvf0) s14Var.d).get(), (fvr) ((xvf0) s14Var.e).get(), (pwy0) ((xvf0) s14Var.f).get(), (com.yandex.go.taxi.summary.mobilityhub.mapper.b) ((epf) s14Var.g).get(), (lhq0) ((xvf0) s14Var.h).get(), (f1v) ((xvf0) s14Var.i).get(), (o7r0) ((qcz0) s14Var.j).get(), (dxu) ((xvf0) s14Var.k).get(), (a2v) ((xvf0) s14Var.l).get(), (com.yandex.go.multimodal_route.interactors.d) ((xvf0) s14Var.m).get(), (h) ((xvf0) s14Var.n).get(), (com.yandex.go.route.interactor.b) ((l3g) s14Var.b).get(), (me31) ((xvf0) s14Var.o).get());
                dt20 dt20Var = ((f2v) this.G).a;
                d dVar = new d(fw20Var, (ah00) ((xvf0) dt20Var.b).get(), (o1v) ((f9t) dt20Var.c).get(), (k141) ((xvf0) dt20Var.w).get(), (uo21) ((xvf0) dt20Var.x).get());
                this.I = dVar;
                dVar.b();
                return;
            case 3:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                ((y) this.I).a(taxiOrder.a);
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.L();
                }
                ((ysg) this.F).g(taxiOrder);
                ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper((Context) this.E, ((g) ((oxu0) this.H)).b().b);
                m2v m2vVar = (m2v) this.G;
                m2vVar.getClass();
                e28 e28Var = (e28) n3w.a(new e28(new c06(n3w.a(contextThemeWrapper2), new ywf(i, m2vVar)))).a;
                gf41 gf41Var = (gf41) m2vVar.w;
                q5z.h(gf41Var);
                mxf0 mxf0Var = (mxf0) m2vVar.c;
                q5z.h(mxf0Var);
                w030 w030Var = (w030) m2vVar.b;
                q5z.h(w030Var);
                A(new f28(e28Var, gf41Var, mxf0Var, w030Var, 0), taxiOrder, new mo30(11, this));
                return;
            case 4:
                ((f) this.H).b(new agc0(8, this, (qxx0) obj));
                return;
            case 5:
                ((jj3) this.F).c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new k7d0(19, this)), false, false, 28));
                return;
            default:
                b a7 = ((c241) this.G).a(false, (e241) ((yvf0) this.E).get());
                this.I = a7;
                a7.attach();
                i541 i541Var = (i541) this.H;
                i541Var.D.a();
                i541Var.E.b(((gh00) ((ah00) i541Var.b)).i);
                i541Var.A.Bg(i541Var);
                ((Activity) this.F).getWindow().addFlags(128);
                return;
        }
    }

    public void P(qxx0 qxx0Var) {
        A((m950) ((vw2) this.G).get(), qxx0Var, new mrd0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xus(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
        this.H = obj4;
        this.I = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xus(yvf0 yvf0Var, g2v g2vVar, f2v f2vVar) {
        super(null);
        this.D = 2;
        this.E = yvf0Var;
        this.F = g2vVar;
        this.G = f2vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xus(Activity activity, u02 u02Var, jj3 jj3Var, dqe0 dqe0Var, ra00 ra00Var, yvf0 yvf0Var, a aVar) {
        super(null);
        this.D = 5;
        this.F = jj3Var;
        this.G = dqe0Var;
        this.H = ra00Var;
        this.E = yvf0Var;
        this.I = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xus(Activity activity, yvf0 yvf0Var, c241 c241Var, i541 i541Var) {
        super(null);
        this.D = 6;
        this.F = activity;
        this.E = yvf0Var;
        this.G = c241Var;
        this.H = i541Var;
    }
}
