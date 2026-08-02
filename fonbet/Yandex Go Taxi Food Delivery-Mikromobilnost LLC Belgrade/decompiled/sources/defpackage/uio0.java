package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.go.platform.sdk.models.PlatformEnvironment;
import com.yandex.go.platform.web_view_client.GoWebChromeClient;
import com.yandex.go.platform.web_view_client.a;
import com.yandex.go.route.interactor.c;
import com.yandex.go.suggest.DestinationSuggest;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.order.k;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.summary.solid.interactor.t;
import yads.s12;

/* loaded from: classes7.dex */
public final class uio0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public uio0(ViewGroup viewGroup, ss2 ss2Var, s421 s421Var, GoWebChromeClient goWebChromeClient, Context context, PlatformEnvironment platformEnvironment, m2v m2vVar, ryh ryhVar, ak akVar, sls slsVar, zh41 zh41Var, lb20 lb20Var) {
        this.c = ss2Var;
        this.a = goWebChromeClient;
        this.b = context;
        this.d = platformEnvironment;
        a aVar = new a(ss2Var, viewGroup, s421Var, this, ryhVar, slsVar, zh41Var, lb20Var);
        this.e = aVar;
        WebView webView = aVar.n;
        this.f = webView;
        webView.setOnFocusChangeListener(new bk(0, new com.yandex.go.platform.auth.a((tse) m2vVar.a, (fk) m2vVar.b, (ss2) m2vVar.c, webView, (lb20) m2vVar.w)));
        akVar.a.add(new dy31(3));
    }

    public vd71 a(CustomizableMediaView customizableMediaView, v981 v981Var, v881 v881Var, j981 j981Var, ak81 ak81Var, d171 d171Var) {
        CustomizableMediaView customizableMediaView2;
        v881 v881Var2;
        j981 j981Var2;
        i971 i971Var = (i971) this.d;
        List list = d171Var.c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return i971Var.x(customizableMediaView, v881Var, j981Var);
        }
        try {
            customizableMediaView2 = customizableMediaView;
            v881Var2 = v881Var;
            j981Var2 = j981Var;
            try {
                return ((mz71) this.e).a((d881) this.a, v981Var, customizableMediaView2, v881Var2, list, j981Var2, ak81Var);
            } catch (Throwable unused) {
                return i971Var.x(customizableMediaView2, v881Var2, j981Var2);
            }
        } catch (Throwable unused2) {
            customizableMediaView2 = customizableMediaView;
            v881Var2 = v881Var;
            j981Var2 = j981Var;
        }
    }

    public hn71 b() {
        ar81 ar81Var = (ar81) this.e;
        d881 d881Var = (d881) this.b;
        qb71 qb71Var = (qb71) this.d;
        fe81 fe81Var = (fe81) this.c;
        hn71 d = ar81Var.d(fe81Var, d881Var, qb71Var);
        s12 s12Var = (s12) this.f;
        if (s12Var != null) {
            d.r(s12Var.b, "bind_type");
        }
        d.j((String) this.a, "native_ad_type");
        a271 a271Var = fe81Var.d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            d.r(jd81Var.a.b, "size_type");
            d.r(Integer.valueOf(jd81Var.b), "width");
            d.r(Integer.valueOf(jd81Var.c), "height");
        }
        d.c = d881Var.i;
        return d;
    }

    public RoutePointType c(u0j u0jVar, DestinationSuggest destinationSuggest) {
        boolean equals;
        if (!(u0jVar instanceof dzi) && !(u0jVar instanceof ezi)) {
            return u0jVar instanceof lzi ? RoutePointType.FAVORITE : RoutePointType.POINT_B;
        }
        c cVar = (c) this.d;
        if (destinationSuggest == null) {
            equals = true;
            if (cVar.c().b.size() - 1 != 0) {
                equals = false;
            }
        } else {
            equals = destinationSuggest.equals(cVar.d());
        }
        return equals ? RoutePointType.POINT_B : RoutePointType.POINT_MID;
    }

    public ArrayList d(int i) {
        ArrayList a = ((tgz0) this.e).a(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Integer.parseInt(((jfz0) next).f) != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void e(Intent intent, String str) {
        r041 a = ((t041) this.e).a(180000L, "WaitingNotificationServiceWakeLock");
        try {
            if (str.equals("ru.yandex.taxi.activity.MainActivity.IM_COMING")) {
                String stringExtra = intent.getStringExtra("ru.yandex.taxi.broadcast.NotificationAction.ORDER_ID");
                if (stringExtra != null) {
                    f(stringExtra);
                } else {
                    xby.l(jst.e, "WAITING_NOTIFICATION_SERVICE:MISSING_ORDER_ID", null, null, "Intent with action " + str + " didn't have required order id", 6);
                }
            } else {
                xby.l(jst.e, "WAITING_NOTIFICATION_SERVICE:UNSUPPORTED_ACTION", null, null, "Action " + str + " is not supported in service", 6);
            }
            a.close();
            ((ng60) this.a).a(intent);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(a, th);
                throw th2;
            }
        }
    }

    public void f(String str) {
        mg60 mg60Var = (mg60) this.f;
        mg60Var.a.a("Notification.ImComing", new HashMap(), 1, new HashMap());
        TaxiOrder i = ((e0) ((p2y0) this.b)).i(str);
        if (i == null || !((ss21) this.c).a(i)) {
            return;
        }
        ((k) this.d).a(i, false, 0L);
    }

    public /* synthetic */ uio0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public uio0(z4m0 z4m0Var, Set set, wb71 wb71Var, Handler handler) {
        AtomicInteger atomicInteger = new AtomicInteger(set.size());
        fg81 fg81Var = new fg81();
        this.c = z4m0Var;
        this.a = set;
        this.b = wb71Var;
        this.d = handler;
        this.e = atomicInteger;
        this.f = fg81Var;
    }

    public uio0(Context context, yp61 yp61Var, i630 i630Var, fe81 fe81Var, v981 v981Var, d881 d881Var, bl61 bl61Var, fl61 fl61Var, ml71 ml71Var, v881 v881Var, ak81 ak81Var) {
        sbm0 sbm0Var = new sbm0(yp61Var, i630Var, fe81Var, v981Var, d881Var, bl61Var, fl61Var, v881Var, ak81Var);
        tv71 tv71Var = new tv71();
        rr41 rr41Var = new rr41(context.getApplicationContext(), fe81Var, v981Var, d881Var);
        this.c = ml71Var;
        this.a = sbm0Var;
        this.b = tv71Var;
        this.d = rr41Var;
    }

    public uio0(Context context, d881 d881Var, fe81 fe81Var, e971 e971Var, cr71 cr71Var, ge71 ge71Var) {
        a081 a081Var;
        sk71 sk71Var = new sk71(e971Var, 2);
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        this.c = d881Var;
        this.a = fe81Var;
        this.b = cr71Var;
        this.d = ge71Var;
        this.e = sk71Var;
        this.f = a;
    }

    public uio0(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var) {
        a081 a081Var;
        wb81 wb81Var = new wb81();
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        this.c = fe81Var;
        this.a = v981Var;
        this.b = d881Var;
        this.d = wb81Var;
        this.e = a;
        this.f = context.getApplicationContext();
    }

    public uio0(ld71 ld71Var, fe81 fe81Var, v981 v981Var) {
        w881 w881Var = new w881();
        Context context = ((n291) v981Var).a;
        i971 i971Var = new i971(21, wha1.c(context, context));
        cs81 cs81Var = new cs81();
        this.c = ld71Var;
        this.a = fe81Var;
        this.b = v981Var;
        this.d = w881Var;
        this.e = i971Var;
        this.f = cs81Var;
    }

    public uio0(v981 v981Var, d881 d881Var) {
        z4m0 z4m0Var = new z4m0(v981Var, d881Var);
        i971 i971Var = new i971(3, d881Var);
        mz71 mz71Var = new mz71();
        dt71 dt71Var = new dt71();
        this.c = v981Var;
        this.a = d881Var;
        this.b = z4m0Var;
        this.d = i971Var;
        this.e = mz71Var;
        this.f = dt71Var;
    }

    public uio0(fe81 fe81Var, String str, d881 d881Var, qb71 qb71Var, ar81 ar81Var) {
        this.c = fe81Var;
        this.a = str;
        this.b = d881Var;
        this.d = qb71Var;
        this.e = ar81Var;
        this.f = null;
    }

    public uio0(zuj0 zuj0Var, t tVar) {
        this.c = zuj0Var;
        this.a = tVar;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: kh31
            public final /* synthetic */ uio0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i2 = i;
                uio0 uio0Var = this.b;
                switch (i2) {
                    case 0:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_bottom_margin);
                        break;
                    case 2:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_plus_top_offset_padding);
                        break;
                    default:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_surge_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.d = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: kh31
            public final /* synthetic */ uio0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i2;
                uio0 uio0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_bottom_margin);
                        break;
                    case 2:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_plus_top_offset_padding);
                        break;
                    default:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_surge_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i3 = 2;
        this.e = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: kh31
            public final /* synthetic */ uio0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i3;
                uio0 uio0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_bottom_margin);
                        break;
                    case 2:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_plus_top_offset_padding);
                        break;
                    default:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_surge_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i4 = 3;
        this.f = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: kh31
            public final /* synthetic */ uio0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i4;
                uio0 uio0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_route_bottom_margin);
                        break;
                    case 2:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_plus_top_offset_padding);
                        break;
                    default:
                        c = ((avj0) ((zuj0) uio0Var.c)).c(rsg0.summary_surge_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
    }

    public /* synthetic */ uio0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
    }

    public uio0(zuj0 zuj0Var, y9y0 y9y0Var, dsd dsdVar, l3o l3oVar, c cVar, tjt0 tjt0Var, g0j g0jVar) {
        this.c = y9y0Var;
        this.a = dsdVar;
        this.b = l3oVar;
        this.d = cVar;
        this.e = tjt0Var;
        this.f = g0jVar;
    }

    public uio0(e7g e7gVar, mbo0 mbo0Var, k7g k7gVar, mam0 mam0Var, mbo0 mbo0Var2, xvf0 xvf0Var) {
        this.c = e7gVar;
        this.a = mbo0Var;
        this.b = k7gVar;
        this.e = mam0Var;
        this.f = mbo0Var2;
        this.d = xvf0Var;
    }
}
