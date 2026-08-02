package defpackage;

import android.content.Context;
import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.go.places.organization.card.impl.domain.entities.card.FocusPinMode;
import com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.g;
import com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.j;
import com.yandex.go.places.organization.card.impl.ui.card.factory.map.OrganizationCardWalkingRouteOverlay$attach$$inlined$collectLatestIn$1;
import com.yandex.go.places.organization.card.impl.ui.card.factory.map.OrganizationCardWalkingRouteOverlay$attach$$inlined$safeCollectIn$1;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class xe80 extends j3v {
    public final Context E;
    public final tse F;
    public final b G;
    public final p75 H;
    public final se80 I;
    public final mh80 J;
    public final ff80 K;
    public final xh80 L;
    public final n3h M;
    public final PlacesNavigationMode N;
    public final g3h O;
    public final af80 P;
    public final oh80 Q;
    public final mg80 R;
    public final wbc0 S;
    public final wf80 T;
    public final yf80 U;
    public final wg80 V;
    public final g W;
    public final j Z;
    public final w030 a0;
    public final i3y b0;
    public final i3y c0;
    public vf80 d0;
    public vg80 e0;
    public g0c f0;
    public boolean g0;
    public final boolean h0;

    public xe80(Context context, tse tseVar, b bVar, p75 p75Var, se80 se80Var, mh80 mh80Var, ff80 ff80Var, xh80 xh80Var, n3h n3hVar, PlacesNavigationMode placesNavigationMode, g3h g3hVar, af80 af80Var, oh80 oh80Var, mg80 mg80Var, wbc0 wbc0Var, wf80 wf80Var, yf80 yf80Var, wg80 wg80Var, g gVar, j jVar, w030 w030Var) {
        this.E = context;
        this.F = tseVar;
        this.G = bVar;
        this.H = p75Var;
        this.I = se80Var;
        this.J = mh80Var;
        this.K = ff80Var;
        this.L = xh80Var;
        this.M = n3hVar;
        this.N = placesNavigationMode;
        this.O = g3hVar;
        this.P = af80Var;
        this.Q = oh80Var;
        this.R = mg80Var;
        this.S = wbc0Var;
        this.T = wf80Var;
        this.U = yf80Var;
        this.V = wg80Var;
        this.W = gVar;
        this.Z = jVar;
        this.a0 = w030Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: ue80
            public final /* synthetic */ xe80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                xe80 xe80Var = this.b;
                switch (i2) {
                    case 0:
                        return new ve80(xe80Var);
                    default:
                        return new we80(xe80Var);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b0 = a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.c0 = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ue80
            public final /* synthetic */ xe80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                xe80 xe80Var = this.b;
                switch (i22) {
                    case 0:
                        return new ve80(xe80Var);
                    default:
                        return new we80(xe80Var);
                }
            }
        });
        this.h0 = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        V();
        this.P.a.l(null);
        this.f0 = null;
        this.R.b();
        this.S.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        U((te80) obj);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.a0;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.h0;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        te80 te80Var = (te80) obj;
        y7c0 y7c0Var = te80Var.a;
        boolean z = te80Var.j;
        this.f0 = qoi0.a(y7c0Var.getClass());
        y7c0 y7c0Var2 = te80Var.a;
        if (y7c0Var2 instanceof u7c0) {
            this.Q.a.g(new ne80(te80Var.c, te80Var.d, te80Var.e, te80Var.f, te80Var.b, te80Var.B));
        } else {
            ne80 ne80Var = new ne80(te80Var.c, te80Var.d, te80Var.e, te80Var.f, te80Var.b, te80Var.B);
            r0 r0Var = this.P.a;
            r0Var.getClass();
            r0Var.m(null, ne80Var);
        }
        DeeplinkSource deeplinkSource = te80Var.A ? DeeplinkSource.PLACES : DeeplinkSource.UNSPECIFIED;
        f3h a = this.O.a((we80) this.c0.getValue(), this.N);
        tse tseVar = this.F;
        n3h n3hVar = this.M;
        Context context = this.E;
        i3h i3hVar = new i3h(context, tseVar, n3hVar, deeplinkSource, a);
        this.g0 = (y7c0Var2 instanceof t7c0) || !te80Var.v;
        boolean z2 = y7c0Var2 instanceof u7c0;
        i3y i3yVar = this.b0;
        if (z2) {
            ne80 ne80Var2 = new ne80(te80Var.c, te80Var.d, te80Var.e, te80Var.f, te80Var.b, te80Var.B, te80Var.g, te80Var.h);
            boolean z3 = !z;
            boolean z4 = te80Var.v;
            OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy = te80Var.w;
            ub60 ub60Var = new ub60(17, this);
            ke8 ke8Var = this.L.a;
            com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g gVar = new com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g(y7c0Var2, z4, organizationCardSliderPinDisplayStrategy, i3hVar, (oh80) ((xvf0) ke8Var.b).get(), (com.yandex.go.places.analytics.organization.card.a) ((xvf0) ke8Var.c).get(), (m9c0) ((xvf0) ke8Var.d).get(), (dac0) ((xvf0) ke8Var.a).get(), (com.yandex.go.places.organization.card.impl.domain.interactors.flex.b) ((xvf0) ke8Var.e).get(), (yh80) ((xvf0) ke8Var.f).get(), (de6) ((xvf0) ke8Var.g).get(), (d470) ((n3w) ke8Var.r).a, (yzh) ((faj) ke8Var.h).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a) ((xvf0) ke8Var.i).get(), (go80) ((xvf0) ke8Var.j).get(), (oxu0) ((y4g) ke8Var.k).get(), (tse) ((xvf0) ke8Var.l).get(), (wbc0) ((xvf0) ke8Var.m).get(), (yac0) ((xvf0) ke8Var.n).get(), z3, ub60Var, ne80Var2, (q3v) ((xvf0) ke8Var.o).get(), (k0b0) ((xvf0) ke8Var.p).get(), (ah00) ((xvf0) ke8Var.q).get());
            zf80 zf80Var = new zf80(te80Var.l, te80Var.k, te80Var.n, te80Var.o, te80Var.j, te80Var.s, te80Var.t, te80Var.p, te80Var.q, te80Var.r, te80Var.i);
            ve80 ve80Var = (ve80) i3yVar.getValue();
            xv10 xv10Var = this.J.a;
            return new OrganizationCardsSliderModalView((Context) ((x4g) xv10Var.a).get(), (c2x0) ((z4g) xv10Var.b).get(), zf80Var, ve80Var, gVar, (yac0) ((xvf0) xv10Var.c).get(), (pav) ((xvf0) xv10Var.w).get(), (exu0) ((y4g) xv10Var.x).get());
        }
        jsj jsjVar = new jsj(context);
        boolean z5 = te80Var.l;
        boolean z6 = te80Var.n;
        boolean z7 = te80Var.o;
        Integer num = te80Var.s;
        Float f = te80Var.t;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState = te80Var.p;
        Float f2 = te80Var.q;
        Float f3 = te80Var.r;
        lf80 lf80Var = te80Var.m;
        boolean z8 = te80Var.k;
        boolean z9 = te80Var.j;
        ve80 ve80Var2 = (ve80) i3yVar.getValue();
        y7c0 y7c0Var3 = te80Var.a;
        lf80 lf80Var2 = te80Var.m;
        boolean z10 = te80Var.i;
        boolean z11 = !z;
        kv1 kv1Var = this.K.a;
        c cVar = new c(ve80Var2, y7c0Var3, jsjVar, (af80) ((xvf0) kv1Var.a).get(), (tt2) ((xvf0) kv1Var.b).get(), (com.yandex.go.places.impl.domain.interactors.a) ((xvf0) kv1Var.c).get(), (dac0) ((xvf0) kv1Var.d).get(), (com.yandex.go.places.organization.card.impl.domain.interactors.flex.a) ((xvf0) kv1Var.e).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_taxi.a) ((xvf0) kv1Var.h).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_delivery.a) ((xvf0) kv1Var.i).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_navigator.a) ((xvf0) kv1Var.j).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.goal_tracking_link.a) ((xvf0) kv1Var.k).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_organization.a) ((xvf0) kv1Var.l).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a) ((xvf0) kv1Var.m).get(), (xvf0) kv1Var.n, i3hVar, (pe80) ((xvf0) kv1Var.o).get(), (com.yandex.go.places.analytics.organization.card.a) ((xvf0) kv1Var.p).get(), (m9c0) ((xvf0) kv1Var.q).get(), (oep0) ((xvf0) kv1Var.r).get(), (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.a) ((gmh) kv1Var.f).get(), (wbc0) ((xvf0) kv1Var.g).get(), z10, z11, lf80Var2, (q3v) ((xvf0) kv1Var.s).get(), (k0b0) ((xvf0) kv1Var.t).get(), (ah00) ((xvf0) kv1Var.u).get());
        xv10 xv10Var2 = this.I.a;
        return new OrganizationCardFlexModalView((Context) ((x4g) xv10Var2.a).get(), (c2x0) ((z4g) xv10Var2.b).get(), z5, z8, z6, z7, z9, num, f, placesMapConfig$RevealingState, f2, f3, lf80Var, jsjVar, cVar, (of80) ((n3w) xv10Var2.c).a, (yac0) ((xvf0) xv10Var2.w).get(), (kbc0) ((xvf0) xv10Var2.x).get());
    }

    @Override // defpackage.j3v, defpackage.bgc0
    /* renamed from: T */
    public final boolean c(te80 te80Var) {
        g0c g0cVar = this.f0;
        if (g0cVar == null) {
            return true;
        }
        return g0cVar.equals(qoi0.a(te80Var.a.getClass()));
    }

    public final void U(te80 te80Var) {
        boolean z = te80Var.x;
        y7c0 y7c0Var = te80Var.a;
        u55 u55Var = this.W;
        u55 u55Var2 = this.Z;
        if (z) {
            ti80 ti80Var = te80Var.c;
            String str = te80Var.z;
            FocusPinMode focusPinMode = te80Var.y ? y7c0Var instanceof u7c0 ? FocusPinMode.SMART : FocusPinMode.ALWAYS : FocusPinMode.NONE;
            u55 u55Var3 = y7c0Var instanceof u7c0 ? u55Var2 : u55Var;
            ve80 ve80Var = (ve80) this.b0.getValue();
            boolean z2 = te80Var.u;
            h470 h470Var = this.U.a;
            com.yandex.go.places.organization.card.impl.ui.card.map.overlay.c cVar = new com.yandex.go.places.organization.card.impl.ui.card.map.overlay.c(ti80Var, str, focusPinMode, u55Var3, ve80Var, z2, (yac0) h470Var.a.get(), (q3v) h470Var.b.get(), (ah00) h470Var.c.get(), (iaq0) h470Var.d.get(), ((Boolean) h470Var.e.a).booleanValue());
            xv10 xv10Var = this.T.a;
            vf80 vf80Var = new vf80((Context) ((x4g) xv10Var.a).get(), (a3v) ((xvf0) xv10Var.b).get(), i5m.a((xvf0) xv10Var.c), (com.yandex.go.places.map.ui.overlay.a) ((xvf0) xv10Var.w).get(), cVar, (ah00) ((xvf0) xv10Var.x).get());
            this.d0 = vf80Var;
            vf80Var.attach();
        }
        if (te80Var.C) {
            if (y7c0Var instanceof u7c0) {
                u55Var = u55Var2;
            }
            tpr c = u55Var.c(te80Var.c);
            at20 at20Var = this.V.a;
            com.yandex.go.places.organization.card.impl.domain.interactors.map.walkroute.a aVar = (com.yandex.go.places.organization.card.impl.domain.interactors.map.walkroute.a) ((xvf0) at20Var.a).get();
            vg80 vg80Var = new vg80(c, aVar, (j741) ((z4g) at20Var.b).get());
            this.e0 = vg80Var;
            hbp0 hbp0Var = vg80Var.c;
            hbp0Var.a();
            tje.N(hbp0Var.c(), null, null, new OrganizationCardWalkingRouteOverlay$attach$$inlined$collectLatestIn$1(e.t(c), null, vg80Var), 3);
            tje.N(hbp0Var.c(), null, null, new OrganizationCardWalkingRouteOverlay$attach$$inlined$safeCollectIn$1(e.d(aVar.c.a), null, vg80Var), 3);
        }
    }

    public final void V() {
        vf80 vf80Var = this.d0;
        if (vf80Var != null) {
            vf80Var.x.b();
            vf80Var.A.Cg();
            vf80Var.z.Lc(vf80.class, null);
            gh00 gh00Var = (gh00) ((ah00) vf80Var.b);
            gh00Var.t(vf80Var.F);
            gh00Var.s(vf80Var.G);
            gh00Var.u(vf80Var.H);
        }
        this.d0 = null;
        vg80 vg80Var = this.e0;
        if (vg80Var != null) {
            vg80Var.c.b();
            vg80Var.a.c.a(null);
            ((ru.yandex.taxi.map.c) vg80Var.b).a();
        }
        this.e0 = null;
    }

    public final void W(qg80 qg80Var) {
        qg80 qg80Var2 = qg80Var;
        r0 r0Var = this.H.a.V.a;
        while (true) {
            Object value = r0Var.getValue();
            List list = (List) value;
            Iterator it = list.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((bcc0) next).a instanceof xl80) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            bcc0 bcc0Var = (bcc0) obj;
            if (bcc0Var != null) {
                xl80 xl80Var = (xl80) bcc0Var.a;
                list = ccc0.c(list, bcc0Var, new bcc0(new xl80(qg80Var2.a, qg80Var2.b, qg80Var2.c, qg80Var2.d, qg80Var2.e, xl80Var.f, qg80Var2.f, qg80Var2.g, xl80Var.i, xl80Var.j, xl80Var.k, xl80Var.l, xl80Var.m), bcc0Var.b));
            }
            if (r0Var.k(value, list)) {
                return;
            } else {
                qg80Var2 = qg80Var;
            }
        }
    }

    @Override // defpackage.bgc0
    public final void b(Object obj) {
        te80 te80Var = (te80) obj;
        this.f0 = qoi0.a(te80Var.a.getClass());
        if (te80Var.a instanceof u7c0) {
            this.Q.a.g(new ne80(te80Var.c, te80Var.d, te80Var.e, te80Var.f, te80Var.b, te80Var.B));
        } else {
            ne80 ne80Var = new ne80(te80Var.c, te80Var.d, te80Var.e, te80Var.f, te80Var.b, te80Var.B);
            r0 r0Var = this.P.a;
            r0Var.getClass();
            r0Var.m(null, ne80Var);
        }
        W(new qg80(te80Var.b, te80Var.c, te80Var.d, te80Var.e, te80Var.f, te80Var.g, te80Var.h));
        if (this.g0) {
            V();
            U(te80Var);
        }
    }
}
