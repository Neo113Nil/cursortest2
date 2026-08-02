package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.monetization.ads.base.webview.HtmlWebViewClient;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.preorder.extraphone.e;
import ru.yandex.taxi.preorder.repositories.g;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.summary.repository.b;
import ru.yandex.taxi.summary.repository.d;
import yads.h72;
import yads.kz1;
import yads.lv1;
import yads.p9;
import yads.tp0;
import yads.yh0;

/* loaded from: classes7.dex */
public final class z4m0 implements io61, cv81 {
    public Object A;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;
    public Object z;

    public z4m0(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var, p9 p9Var) {
        a081 a081Var;
        this.a = 18;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
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
        f571 f571Var = new f571();
        this.b = fe81Var;
        this.c = d881Var;
        this.w = p9Var;
        this.x = b;
        this.y = a;
        this.z = f571Var;
    }

    @Override // defpackage.io61
    public in71 a(String str, String str2, dj81 dj81Var) {
        Context context = (Context) this.b;
        gh61 gh61Var = ((g271) this.x).c;
        fe81 fe81Var = (fe81) this.c;
        Context context2 = ((n291) ((v981) this.w)).a;
        zy61 zy61Var = new zy61(context, fe81Var, wha1.c(context2, context2), str, str2, new sl81(gh61Var), (i971) this.y, dj81Var, new i871(), null, 7680, 0);
        nl61 nl61Var = ((g271) this.x).a;
        nl61Var.getClass();
        ((ru81) this.A).getClass();
        String str3 = nl61Var.c;
        if (str3 == null) {
            return zy61Var;
        }
        xp71 xp71Var = (xp71) this.z;
        xp71Var.getClass();
        synchronized (xp71.c) {
            xp71Var.a.put(zy61Var, str3);
        }
        return zy61Var;
    }

    public gr71 b(String str, ku71 ku71Var, int i, int i2) {
        HashMap hashMap = (HashMap) this.w;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ny61.r("Must be invoked from the main thread.");
            return null;
        }
        ((ae81) this.A).getClass();
        String a = ae81.a(str);
        Bitmap bitmap = (Bitmap) ((h72) ((i971) this.c).b).get(a);
        if (bitmap != null) {
            gr71 gr71Var = new gr71(this, bitmap, null, null);
            ku71Var.r(gr71Var, true);
            return gr71Var;
        }
        gr71 gr71Var2 = new gr71(this, null, a, ku71Var);
        ku71Var.r(gr71Var2, true);
        lo71 lo71Var = (lo71) hashMap.get(a);
        if (lo71Var == null) {
            lo71Var = (lo71) ((HashMap) this.x).get(a);
        }
        if (lo71Var != null) {
            lo71Var.d.add(gr71Var2);
            return gr71Var2;
        }
        cf71 cf71Var = new cf71(0, this, a);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        ua81 ua81Var = new ua81(str, cf71Var, i, i2, new rr41(this, a));
        ((dy61) this.b).b(ua81Var);
        hashMap.put(a, new lo71(ua81Var, gr71Var2));
        return gr71Var2;
    }

    @Override // defpackage.cv81
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                ((hk61) obj).j(null);
                lv1 lv1Var = (lv1) this.z;
                if (lv1Var != null) {
                    ViewParent parent = lv1Var.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(lv1Var);
                    }
                    lv1Var.b();
                }
                this.z = null;
                break;
            case 20:
                ((hk61) obj).j(null);
                break;
            default:
                mw81 mw81Var = (mw81) obj;
                mw81Var.o(null);
                Iterator it = mw81Var.p().iterator();
                while (it.hasNext()) {
                    ((hk61) it.next()).j(null);
                }
                break;
        }
    }

    public h d() {
        String str;
        amc amcVar = (amc) this.z;
        n0 n0Var = ((axm) this.b).c;
        b bVar = new b(((e9w) ((d9w) this.y)).d);
        n0 n0Var2 = ((g) this.x).c;
        e eVar = (e) this.c;
        pex0 m = ((k) eVar.a).m();
        if (m == null || (str = m.b) == null) {
            str = "";
        }
        return kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{n0Var, bVar, n0Var2, kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.preorder.extraphone.b(eVar.d, eVar, str)), new com.yandex.go.requirements.comment.repositories.b(amcVar.c), new d(new mth(((a) this.w).f, 4)), amcVar.d, ((RequirementsChangedNotifier) this.A).a}, 8));
    }

    @Override // defpackage.cv81
    public void v(ViewGroup viewGroup) {
        int i = this.a;
        Object obj = this.y;
        Object obj2 = this.c;
        Object obj3 = this.x;
        Object obj4 = this.b;
        Object obj5 = this.w;
        switch (i) {
            case 17:
                hk61 hk61Var = (hk61) obj4;
                ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
                try {
                    hk61Var.i(new cf71(3, (Set) null).k(extendedNativeAdView, new yt71()), (t171) obj5);
                    hk61Var.j((nr41) obj2);
                } catch (kz1 e) {
                    ((ge71) obj).d("Failed to bind LightBundle Native Ad", e);
                }
                Context context = extendedNativeAdView.getContext();
                int i2 = lv1.o;
                lv1 lv1Var = new lv1(context, new rp81(), null);
                this.z = lv1Var;
                l071 l071Var = (l071) this.A;
                HtmlWebViewClient htmlWebViewClient = new HtmlWebViewClient(lv1Var, null, 2, null);
                htmlWebViewClient.setWebResourceRequestInterceptor(new hj61("lightBundle.js", new gp51(8, l071Var)));
                lv1Var.setWebViewClient(htmlWebViewClient);
                lv1Var.setHtmlWebViewListener(new ip61(l071Var, lv1Var));
                extendedNativeAdView.addView(lv1Var, new ViewGroup.LayoutParams(-1, -1));
                lv1Var.loadDataWithBaseURL("https://yandex.ru", lv1Var.a((String) obj3), "text/html", "UTF-8", null);
                break;
            case 20:
                hk61 hk61Var2 = (hk61) obj4;
                try {
                    hk61Var2.i(((cf71) this.A).k((ExtendedNativeAdView) viewGroup, (yt71) this.z), (t171) obj3);
                    hk61Var2.j((nr41) obj5);
                    break;
                } catch (kz1 e2) {
                    ((rq81) obj2).e();
                    ((ge71) obj).d("Failed to bind DivKit Native Ad", e2);
                    return;
                }
            default:
                nr41 nr41Var = (nr41) obj5;
                mw81 mw81Var = (mw81) obj4;
                try {
                    xg81 k = ((cf71) this.A).k((ExtendedNativeAdView) viewGroup, (yt71) this.z);
                    mw81Var.getClass();
                    View view = k.c;
                    aj31 aj31Var = new aj31(23, k);
                    mw81Var.e(view, mw81Var.O, aj31Var, (t171) obj3);
                    nr41 nr41Var2 = new nr41(26, nr41Var);
                    Iterator it = mw81Var.p().iterator();
                    while (it.hasNext()) {
                        ((hk61) it.next()).j(nr41Var2);
                    }
                    mw81Var.o(nr41Var);
                    break;
                } catch (kz1 e3) {
                    ((rq81) obj2).e();
                    ((ge71) obj).d("Failed to bind DivKit Slider Ad", e3);
                }
        }
    }

    public z4m0(Context context, se71 se71Var, v881 v881Var, cf71 cf71Var) {
        this.a = 22;
        vb71 vb71Var = new vb71(context);
        v571 v571Var = new v571();
        fp71 fp71Var = new fp71(v881Var, context.getResources());
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.b = se71Var;
        this.c = v881Var;
        this.w = cf71Var;
        this.x = vb71Var;
        this.y = v571Var;
        this.z = fp71Var;
        this.A = copyOnWriteArraySet;
    }

    public z4m0(Context context, fe81 fe81Var, v981 v981Var, g271 g271Var, e971 e971Var) {
        this.a = 15;
        i971 i971Var = new i971(13, e971Var);
        xp71 a = xp71.b.a();
        ru81 ru81Var = new ru81();
        this.b = context;
        this.c = fe81Var;
        this.w = v981Var;
        this.x = g271Var;
        this.y = i971Var;
        this.z = a;
        this.A = ru81Var;
    }

    public /* synthetic */ z4m0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
    }

    public z4m0(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var, d391 d391Var) {
        this.a = 14;
        Context applicationContext = context.getApplicationContext();
        hlx0 hlx0Var = new hlx0(applicationContext, fe81Var, v981Var, d881Var, d391Var, (tp0) null);
        this.b = fe81Var;
        this.c = v981Var;
        this.w = d881Var;
        this.x = d391Var;
        this.y = applicationContext;
        this.z = hlx0Var;
    }

    public z4m0(hk61 hk61Var, nr41 nr41Var, t171 t171Var, nr41 nr41Var2, cf81 cf81Var, String str, ge71 ge71Var) {
        this.a = 17;
        this.b = hk61Var;
        this.c = nr41Var;
        this.w = t171Var;
        this.x = str;
        this.y = ge71Var;
        this.A = new l071(nr41Var2, cf81Var);
    }

    public z4m0(hk61 hk61Var, rq81 rq81Var, nr41 nr41Var, t171 t171Var, ge71 ge71Var) {
        this.a = 20;
        yt71 yt71Var = new yt71();
        cf71 cf71Var = new cf71(2, c5a1.b(hk61Var, null));
        this.b = hk61Var;
        this.c = rq81Var;
        this.w = nr41Var;
        this.x = t171Var;
        this.y = ge71Var;
        this.z = yt71Var;
        this.A = cf71Var;
    }

    public z4m0(dy61 dy61Var, i971 i971Var, ae81 ae81Var) {
        this.a = 16;
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = new Handler(Looper.getMainLooper());
        this.b = dy61Var;
        this.c = i971Var;
        this.A = ae81Var;
    }

    public z4m0(v981 v981Var, d881 d881Var) {
        this.a = 19;
        fc81 fc81Var = new fc81();
        ta81 ta81Var = new ta81();
        nr71 nr71Var = new nr71();
        this.b = v981Var;
        this.c = d881Var;
        this.w = fc81Var;
        this.x = ta81Var;
        this.y = nr71Var;
        this.z = new jr81();
        this.A = new zn81();
    }

    public z4m0(mw81 mw81Var, rq81 rq81Var, nr41 nr41Var, t171 t171Var, ge71 ge71Var) {
        this.a = 21;
        yt71 yt71Var = new yt71();
        cf71 cf71Var = new cf71(2, c5a1.b(mw81Var, yh0.b));
        this.b = mw81Var;
        this.c = rq81Var;
        this.w = nr41Var;
        this.x = t171Var;
        this.y = ge71Var;
        this.z = yt71Var;
        this.A = cf71Var;
    }
}
