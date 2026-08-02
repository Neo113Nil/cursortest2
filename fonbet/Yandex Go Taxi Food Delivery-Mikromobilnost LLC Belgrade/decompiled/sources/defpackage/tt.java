package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.state.search.SearchState;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes14.dex */
public final class tt {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public /* synthetic */ tt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.j = obj10;
        this.k = obj11;
        this.l = obj12;
        this.m = obj13;
        this.n = obj14;
    }

    public void a(String str, ActionType actionType, ActionButtonsClickListener$SourceScreen actionButtonsClickListener$SourceScreen) {
        CheckInInfo checkInInfo;
        String str2;
        p370 p370Var = (p370) this.f;
        eg7 eg7Var = (eg7) this.i;
        ci70 ci70Var = (ci70) this.g;
        x980 x980Var = (x980) this.b;
        a aVar = (a) this.a;
        int[] iArr = st.a;
        int i = 2;
        switch (iArr[actionType.ordinal()]) {
            case 1:
                if (actionButtonsClickListener$SourceScreen == ActionButtonsClickListener$SourceScreen.ORDER_DETAILS) {
                    int i2 = iArr[actionType.ordinal()];
                    if (i2 == 1) {
                        ci70Var.g(str, null, false);
                    } else if (i2 != 3) {
                        switch (i2) {
                            case 9:
                                yh70 yh70Var = ci70Var.f;
                                yh70Var.getClass();
                                yh70Var.a.a("OpenChat", new HashMap(), 1, new HashMap());
                                break;
                            case 10:
                                ctc ctcVar = ci70Var.h;
                                ctcVar.getClass();
                                ctcVar.a.a("CommunicationToDriverButton.Tapped", new HashMap(), 1, new HashMap());
                                break;
                            case 11:
                                o2y0 n = aVar.n(str);
                                if (n != null) {
                                    TaxiOrder b = n.b();
                                    eg7Var.getClass();
                                    Dialog a = eg7.a(b).a();
                                    ci70Var.getClass();
                                    ci70Var.g(str, a.a, true);
                                    break;
                                }
                                break;
                        }
                    } else {
                        yh70 yh70Var2 = ci70Var.f;
                        yh70Var2.getClass();
                        yh70Var2.a.a("ComingSoon", new HashMap(), 1, new HashMap());
                    }
                }
                o2y0 n2 = aVar.n(str);
                if (n2 != null) {
                    ((com.yandex.go.taxi.order.delegates.a) ((f) x980Var).U).c(n2.b(), null);
                    break;
                }
                break;
            case 2:
                o2y0 n3 = aVar.n(str);
                if (n3 != null) {
                    ((f) x980Var).s0(n3);
                    break;
                }
                break;
            case 3:
                o2y0 n4 = aVar.n(str);
                if (n4 != null) {
                    ((ss21) this.d).a(n4.b());
                    pz40 pz40Var = (pz40) ((yk21) this.e).a.get(n4);
                    if (pz40Var != null) {
                        TaxiOrder b2 = n4.b();
                        boolean z = b2.h.b == DriveState.WAITING;
                        boolean H = b2.H();
                        boolean z2 = b2.V().R;
                        double d = b2.V().N;
                        wf7.b.c(b2.V().O);
                        ((r0) pz40Var).m(null, Boolean.valueOf(!H && z));
                        break;
                    }
                }
                break;
            case 4:
                ((f) x980Var).u0(str);
                break;
            case 5:
                o2y0 n5 = aVar.n(str);
                if (n5 != null && (checkInInfo = n5.b().V().a0) != null) {
                    ((ufb) p370Var.b).a(((c) this.l).d(n5.b().M(), n5.b().x()).a.a(ButtonType.DEFAULT), checkInInfo.b);
                    break;
                }
                break;
            case 6:
                o2y0 n6 = aVar.n(str);
                SearchState k = ((n) ((iup0) this.k)).k(str);
                if (k != null) {
                    r11 = k.l != null;
                }
                if (n6 != null && !jl40.l(n6.b().V().g, Driver.v)) {
                    ((xhm) this.h).c(rim.a(n6.b()));
                    if (!n6.b().V().g.s) {
                        p370Var.B(n6);
                        break;
                    }
                } else if (r11) {
                    ud80 ud80Var = (ud80) this.m;
                    if (n6 != null && (str2 = n6.b().a) != null) {
                        ud80Var.a(str2);
                        break;
                    }
                }
                break;
            case 7:
                o2y0 n7 = aVar.n(str);
                if (n7 != null) {
                    ((v2y0) ((u2y0) this.j)).a(n7);
                    yh70 yh70Var3 = ci70Var.f;
                    yh70Var3.getClass();
                    yh70Var3.a.a("openShareRoute", new HashMap(), 1, new HashMap());
                    break;
                }
                break;
            case 8:
                ((g) this.c).d(str, false, DetailsOpenReason.PREVIEW_CARD, TaxiCardNavigationAction.EMPTY);
                break;
            case 9:
                o2y0 n8 = ((a) this.a).n(str);
                if (n8 != null) {
                    f fVar = (f) ((x980) this.b);
                    apf apfVar = fVar.C1.c;
                    bub bubVar = new bub(i);
                    Iterator it = ((ArrayDeque) apfVar.c).iterator();
                    while (it.hasNext()) {
                        if (apf.r((tdj) it.next(), pp70.class, bubVar)) {
                            it.remove();
                        }
                    }
                    tdj tdjVar = (tdj) apfVar.w;
                    if (tdjVar != null ? apf.r(tdjVar, pp70.class, bubVar) : false) {
                        apfVar.k();
                    }
                    if (n8.b().V().R) {
                        fVar.x0(n8);
                        OrderFragment orderFragment = fVar.p1;
                        if (orderFragment != null) {
                            orderFragment.showChat(n8, true);
                            break;
                        }
                    }
                }
                break;
            case 10:
                o2y0 n9 = ((a) this.a).n(str);
                if (n9 != null) {
                    f fVar2 = (f) ((x980) this.b);
                    apf apfVar2 = fVar2.C1.c;
                    bub bubVar2 = new bub(i);
                    Iterator it2 = ((ArrayDeque) apfVar2.c).iterator();
                    while (it2.hasNext()) {
                        if (apf.r((tdj) it2.next(), pp70.class, bubVar2)) {
                            it2.remove();
                        }
                    }
                    tdj tdjVar2 = (tdj) apfVar2.w;
                    if (tdjVar2 != null ? apf.r(tdjVar2, pp70.class, bubVar2) : false) {
                        apfVar2.k();
                    }
                    if (n9.b().V().R) {
                        fVar2.x0(n9);
                        OrderFragment orderFragment2 = fVar2.p1;
                        if (orderFragment2 != null) {
                            orderFragment2.showChat(n9, true);
                            break;
                        }
                    }
                }
                break;
            case 11:
                o2y0 n10 = aVar.n(str);
                if (n10 != null) {
                    TaxiOrder b3 = n10.b();
                    eg7Var.getClass();
                    ((f) x980Var).r0(n10, eg7.a(b3).a());
                    break;
                }
                break;
            case 12:
                ci70Var.r.a();
                ((v1y0) this.n).a();
                break;
            case 13:
                o2y0 n11 = aVar.n(str);
                if (n11 != null) {
                    f fVar3 = (f) x980Var;
                    fVar3.getClass();
                    OrderStatusInfo.TransportInfo transportInfo = n11.b().V().t0;
                    if (transportInfo != null) {
                        ((n3h) fVar3.r0.get()).a(Uri.parse(transportInfo.a), DeeplinkSource.TOTW_COMMUNICATIONS);
                        break;
                    }
                }
                break;
            default:
                ny61.g("Unsupported action type");
                break;
        }
    }

    public void b(zlm zlmVar) {
        zzs zzsVar;
        Address h = zlmVar.a.h();
        Address b = zlmVar.a.b();
        lgv0 lgv0Var = (lgv0) this.j;
        if (h != null) {
            lgv0Var.getClass();
            zzsVar = h.B();
        } else {
            zzsVar = null;
        }
        boolean l = jl40.l(zzsVar, lgv0Var.b.e);
        boolean b2 = h != null ? xna1.b(h) : false;
        boolean d = xna1.d(h);
        boolean z = (l || d) ? false : true;
        boolean z2 = !l && d;
        if ((!b2 && z) || !lgv0Var.a()) {
            mgv0 mgv0Var = lgv0Var.b;
            mgv0Var.d = false;
            mgv0Var.e = null;
        } else if (z2 || b2) {
            lgv0Var.b.e = zzsVar;
        }
        if (jl40.l(b != null ? b.B() : null, lgv0Var.b.f) && lgv0Var.a()) {
            return;
        }
        lgv0Var.b.f = null;
    }

    public WebViewContainerImpl c() {
        return (WebViewContainerImpl) ((xvf0) this.n).get();
    }
}
