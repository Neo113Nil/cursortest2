package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4896a;
import r2.C4906k;
import s2.C4938j0;
import s2.C4949p;
import s2.InterfaceC4942l0;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3282gm implements InterfaceC4251ym {

    /* renamed from: A, reason: collision with root package name */
    public final C3925sk f31393A;

    /* renamed from: B, reason: collision with root package name */
    public final C2562El f31394B;

    /* renamed from: C, reason: collision with root package name */
    public final St f31395C;

    /* renamed from: D, reason: collision with root package name */
    public final C5189a f31396D;

    /* renamed from: E, reason: collision with root package name */
    public final C3075cu f31397E;

    /* renamed from: F, reason: collision with root package name */
    public final C2957aj f31398F;

    /* renamed from: G, reason: collision with root package name */
    public final ViewOnClickListenerC2614Hm f31399G;

    /* renamed from: H, reason: collision with root package name */
    public final V2.a f31400H;

    /* renamed from: I, reason: collision with root package name */
    public final C2545Dl f31401I;
    public final C4260yv J;

    /* renamed from: K, reason: collision with root package name */
    public final C2700Mn f31402K;

    /* renamed from: L, reason: collision with root package name */
    public final Vu f31403L;

    /* renamed from: M, reason: collision with root package name */
    public final BinderC2903Yp f31404M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f31406O;

    /* renamed from: V, reason: collision with root package name */
    public C4938j0 f31413V;

    /* renamed from: W, reason: collision with root package name */
    public final C2799Sk f31414W;

    /* renamed from: X, reason: collision with root package name */
    public final C2580Fm f31415X;
    public final C4896a Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C3387ik f31416Z;

    /* renamed from: n, reason: collision with root package name */
    public final Context f31417n;

    /* renamed from: u, reason: collision with root package name */
    public final C2495Am f31418u;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f31419v;

    /* renamed from: w, reason: collision with root package name */
    public final C4036un f31420w;

    /* renamed from: x, reason: collision with root package name */
    public final C4089vm f31421x;

    /* renamed from: y, reason: collision with root package name */
    public final C3464k7 f31422y;

    /* renamed from: z, reason: collision with root package name */
    public final C2527Ck f31423z;

    /* renamed from: N, reason: collision with root package name */
    public boolean f31405N = false;

    /* renamed from: P, reason: collision with root package name */
    public boolean f31407P = false;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f31408Q = false;

    /* renamed from: R, reason: collision with root package name */
    public Point f31409R = new Point();

    /* renamed from: S, reason: collision with root package name */
    public Point f31410S = new Point();

    /* renamed from: T, reason: collision with root package name */
    public long f31411T = 0;

    /* renamed from: U, reason: collision with root package name */
    public long f31412U = 0;

    public C3282gm(Context context, C2495Am c2495Am, JSONObject jSONObject, C4036un c4036un, C4089vm c4089vm, C3464k7 c3464k7, C2527Ck c2527Ck, C3925sk c3925sk, C2562El c2562El, St st, C5189a c5189a, C3075cu c3075cu, C2957aj c2957aj, ViewOnClickListenerC2614Hm viewOnClickListenerC2614Hm, V2.a aVar, C2545Dl c2545Dl, C4260yv c4260yv, Vu vu, BinderC2903Yp binderC2903Yp, C2700Mn c2700Mn, C2580Fm c2580Fm, C2799Sk c2799Sk, C4896a c4896a, C3387ik c3387ik) {
        this.f31417n = context;
        this.f31418u = c2495Am;
        this.f31419v = jSONObject;
        this.f31420w = c4036un;
        this.f31421x = c4089vm;
        this.f31422y = c3464k7;
        this.f31423z = c2527Ck;
        this.f31393A = c3925sk;
        this.f31394B = c2562El;
        this.f31395C = st;
        this.f31396D = c5189a;
        this.f31397E = c3075cu;
        this.f31398F = c2957aj;
        this.f31399G = viewOnClickListenerC2614Hm;
        this.f31400H = aVar;
        this.f31401I = c2545Dl;
        this.J = c4260yv;
        this.f31403L = vu;
        this.f31404M = binderC2903Yp;
        this.f31402K = c2700Mn;
        this.f31415X = c2580Fm;
        this.f31414W = c2799Sk;
        this.Y = c4896a;
        this.f31416Z = c3387ik;
    }

    public final String A(View view) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33144s4)).booleanValue()) {
            return null;
        }
        try {
            return this.f31422y.f32160b.i(this.f31417n, view, null);
        } catch (Exception unused) {
            int i = w2.z.f41712b;
            x2.i.c("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final boolean B() {
        if (y() == 0) {
            return true;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue()) {
            return this.f31397E.f30398j.f32246C;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:2|3|(1:5)(1:81)|6|(1:80)(1:10)|11|8f|16|(2:99|(21:23|24|(1:28)|29|(1:33)|(1:35)|36|(1:38)|39|40|41|(1:43)|44|45|(1:49)|50|(1:54)|55|(3:57|(1:59)|(1:61))|62|63))|74|24|(2:26|28)|29|(2:31|33)|(0)|36|(0)|39|40|41|(0)|44|45|(2:47|49)|50|(2:52|54)|55|(0)|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
    
        r8 = w2.z.f41712b;
        x2.i.d("Exception obtaining click signals", r0);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: JSONException -> 0x0086, TryCatch #2 {JSONException -> 0x0086, blocks: (B:3:0x000a, B:6:0x0050, B:8:0x007e, B:11:0x008a, B:12:0x008f, B:15:0x0092, B:16:0x0093, B:18:0x0099, B:21:0x009c, B:24:0x00a7, B:26:0x00b0, B:28:0x00b8, B:29:0x00bd, B:31:0x00cd, B:33:0x00d7, B:35:0x00de, B:36:0x00e3, B:39:0x00f2, B:45:0x011f, B:47:0x0139, B:49:0x013f, B:50:0x0144, B:52:0x0154, B:54:0x015a, B:55:0x015f, B:57:0x018e, B:59:0x0196, B:61:0x019e, B:62:0x01a3, B:68:0x0117, B:73:0x00a6, B:79:0x01b6, B:20:0x009a, B:14:0x0090, B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:2:0x000a, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[Catch: Exception -> 0x0103, TryCatch #3 {Exception -> 0x0103, blocks: (B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:40:0x00f7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e A[Catch: JSONException -> 0x0086, TryCatch #2 {JSONException -> 0x0086, blocks: (B:3:0x000a, B:6:0x0050, B:8:0x007e, B:11:0x008a, B:12:0x008f, B:15:0x0092, B:16:0x0093, B:18:0x0099, B:21:0x009c, B:24:0x00a7, B:26:0x00b0, B:28:0x00b8, B:29:0x00bd, B:31:0x00cd, B:33:0x00d7, B:35:0x00de, B:36:0x00e3, B:39:0x00f2, B:45:0x011f, B:47:0x0139, B:49:0x013f, B:50:0x0144, B:52:0x0154, B:54:0x015a, B:55:0x015f, B:57:0x018e, B:59:0x0196, B:61:0x019e, B:62:0x01a3, B:68:0x0117, B:73:0x00a6, B:79:0x01b6, B:20:0x009a, B:14:0x0090, B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:2:0x000a, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z6, boolean z9) {
        List list;
        boolean z10;
        C3324ha c3324ha;
        s2.r rVar;
        JSONObject optJSONObject;
        s2.L0 l02;
        V2.a aVar = this.f31400H;
        C4089vm c4089vm = this.f31421x;
        JSONObject jSONObject7 = this.f31419v;
        try {
            x();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            C2495Am c2495Am = this.f31418u;
            jSONObject8.put("has_custom_click_handler", ((InterfaceC2603Hb) c2495Am.f24516g.getOrDefault(c4089vm.g(), null)) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", c4089vm.q());
            jSONObject9.put("view_aware_api_used", z6);
            C3485kb c3485kb = this.f31397E.f30398j;
            jSONObject9.put("custom_mute_requested", c3485kb != null && c3485kb.f32254z);
            synchronized (c4089vm) {
                list = c4089vm.f35490f;
            }
            if (!list.isEmpty()) {
                synchronized (c4089vm) {
                    l02 = c4089vm.f35491g;
                }
                if (l02 != null) {
                    z10 = true;
                    jSONObject9.put("custom_mute_enabled", z10);
                    if (this.f31399G.f26109v != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                        jSONObject9.put("custom_one_point_five_click_eligible", true);
                    }
                    aVar.getClass();
                    jSONObject9.put(com.anythink.expressad.foundation.d.d.f19383u, System.currentTimeMillis());
                    if (this.f31408Q && this.f31419v.optBoolean("allow_custom_click_gesture", false)) {
                        jSONObject9.put("custom_click_gesture_eligible", true);
                    }
                    if (z9) {
                        jSONObject9.put("is_custom_click_gesture", true);
                    }
                    jSONObject9.put("has_custom_click_handler", ((InterfaceC2603Hb) c2495Am.f24516g.getOrDefault(c4089vm.g(), null)) != null);
                    optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    String str2 = this.f31422y.f32160b.h(this.f31417n, optJSONObject.optString("click_string"), view);
                    jSONObject9.put("click_signals", str2);
                    jSONObject9.put("open_chrome_custom_tab", true);
                    c3324ha = AbstractC3592ma.R9;
                    rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && V2.b.g()) {
                        jSONObject9.put("try_fallback_for_deep_link", true);
                    }
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.S9)).booleanValue() && V2.b.g()) {
                        jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
                    }
                    jSONObject8.put("click", jSONObject9);
                    JSONObject jSONObject10 = new JSONObject();
                    aVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.f31411T);
                    jSONObject10.put("time_from_last_touch", currentTimeMillis - this.f31412U);
                    jSONObject8.put("touch_signal", jSONObject10);
                    if (this.f31395C.b()) {
                        JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                        String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                        if (string != null) {
                            this.f31404M.U3(string, c4089vm);
                        }
                    }
                    MA.f(this.f31420w.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", AbstractC3436jg.f32062h);
                }
            }
            z10 = false;
            jSONObject9.put("custom_mute_enabled", z10);
            if (this.f31399G.f26109v != null) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            aVar.getClass();
            jSONObject9.put(com.anythink.expressad.foundation.d.d.f19383u, System.currentTimeMillis());
            if (this.f31408Q) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z9) {
            }
            jSONObject9.put("has_custom_click_handler", ((InterfaceC2603Hb) c2495Am.f24516g.getOrDefault(c4089vm.g(), null)) != null);
            optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
            }
            String str22 = this.f31422y.f32160b.h(this.f31417n, optJSONObject.optString("click_string"), view);
            jSONObject9.put("click_signals", str22);
            jSONObject9.put("open_chrome_custom_tab", true);
            c3324ha = AbstractC3592ma.R9;
            rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.S9)).booleanValue()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject102 = new JSONObject();
            aVar.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            jSONObject102.put("time_from_last_touch_down", currentTimeMillis2 - this.f31411T);
            jSONObject102.put("time_from_last_touch", currentTimeMillis2 - this.f31412U);
            jSONObject8.put("touch_signal", jSONObject102);
            if (this.f31395C.b()) {
            }
            MA.f(this.f31420w.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", AbstractC3436jg.f32062h);
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to create click JSON.", e9);
        }
    }

    public final void D() {
        try {
            C4938j0 c4938j0 = this.f31413V;
            if (c4938j0 != null) {
                c4938j0.d1(c4938j0.F0(), 1);
            }
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void G(String str) {
        C(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void L() {
        C4036un c4036un = this.f31420w;
        synchronized (c4036un) {
            C3955tD c3955tD = c4036un.f35351n;
            if (c3955tD == null) {
                return;
            }
            C3495kl c3495kl = new C3495kl(20);
            c3955tD.a(new LD(0, c3955tD, c3495kl), c4036un.f35343e);
            c4036un.f35351n = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void a(C4938j0 c4938j0) {
        this.f31413V = c4938j0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void b(View view) {
        if (!this.f31419v.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = w2.z.f41712b;
            x2.i.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ViewOnClickListenerC2614Hm viewOnClickListenerC2614Hm = this.f31399G;
            view.setOnClickListener(viewOnClickListenerC2614Hm);
            view.setClickable(true);
            viewOnClickListenerC2614Hm.f26113z = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f31417n;
        JSONObject y7 = t8.g.y(context, map, map2, view, scaleType);
        JSONObject t6 = t8.g.t(context, view);
        JSONObject v9 = t8.g.v(view);
        JSONObject x9 = t8.g.x(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", y7);
            jSONObject.put("ad_view_signal", t6);
            jSONObject.put("scroll_view_signal", v9);
            jSONObject.put("lock_screen_signal", x9);
            return jSONObject;
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to create native ad view signals JSON.", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void d(Bundle bundle) {
        if (bundle == null) {
            int i = w2.z.f41712b;
            x2.i.a("Click data is null. No click is reported.");
        } else if (s("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            C(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C4949p.f40498g.f40499a.m(bundle, null), false, false);
        } else {
            int i4 = w2.z.f41712b;
            x2.i.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void e(C2722Ob c2722Ob) {
        if (!this.f31419v.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = w2.z.f41712b;
            x2.i.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC2614Hm viewOnClickListenerC2614Hm = this.f31399G;
        viewOnClickListenerC2614Hm.f26109v = c2722Ob;
        C3111dc c3111dc = viewOnClickListenerC2614Hm.f26110w;
        C4036un c4036un = viewOnClickListenerC2614Hm.f26107n;
        if (c3111dc != null) {
            c4036un.c("/unconfirmedClick", c3111dc);
        }
        C3111dc c3111dc2 = new C3111dc(4, viewOnClickListenerC2614Hm, c2722Ob);
        viewOnClickListenerC2614Hm.f26110w = c3111dc2;
        c4036un.b("/unconfirmedClick", c3111dc2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void f(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType) {
        Context context = this.f31417n;
        JSONObject y7 = t8.g.y(context, map, map2, view2, scaleType);
        JSONObject t6 = t8.g.t(context, view2);
        JSONObject v9 = t8.g.v(view2);
        JSONObject x9 = t8.g.x(context, view2);
        String w3 = w(view, map);
        C(true == ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33209z4)).booleanValue() ? view2 : view, t6, y7, v9, x9, w3, t8.g.A(w3, context, this.f31410S, this.f31409R), null, z6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final boolean g() {
        return this.f31419v.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void h() {
        this.f31408Q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void i(View view, Map map, Map map2, InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm, InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm2) {
        this.f31409R = new Point();
        this.f31410S = new Point();
        if (!this.f31406O) {
            this.f31401I.R1(view);
            this.f31406O = true;
        }
        view.setOnTouchListener(interfaceViewOnClickListenerC2750Pm);
        view.setClickable(true);
        view.setOnClickListener(interfaceViewOnClickListenerC2750Pm2);
        C2957aj c2957aj = this.f31398F;
        c2957aj.getClass();
        c2957aj.f29856C = new WeakReference(this);
        boolean r9 = t8.g.r(this.f31396D.f41847v);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (r9) {
                        view2.setOnTouchListener(interfaceViewOnClickListenerC2750Pm);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(interfaceViewOnClickListenerC2750Pm2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (r9) {
                        view3.setOnTouchListener(interfaceViewOnClickListenerC2750Pm);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void j() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f31419v);
            MA.f(this.f31420w.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", AbstractC3436jg.f32062h);
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void k(View view) {
        this.f31409R = new Point();
        this.f31410S = new Point();
        if (view != null) {
            C2545Dl c2545Dl = this.f31401I;
            synchronized (c2545Dl) {
                WeakHashMap weakHashMap = c2545Dl.f25199v;
                if (weakHashMap.containsKey(view)) {
                    ((ViewOnAttachStateChangeListenerC4004u8) weakHashMap.get(view)).f35265E.remove(c2545Dl);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f31406O = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject c9 = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f31408Q && this.f31419v.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (c9 != null) {
                jSONObject.put("nas", c9);
                return jSONObject;
            }
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to create native click meta data JSON.", e9);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void m() {
        View view;
        if (this.f31419v.optBoolean("custom_one_point_five_click_enabled", false)) {
            ViewOnClickListenerC2614Hm viewOnClickListenerC2614Hm = this.f31399G;
            if (viewOnClickListenerC2614Hm.f26109v == null || viewOnClickListenerC2614Hm.f26112y == null) {
                return;
            }
            viewOnClickListenerC2614Hm.f26111x = null;
            viewOnClickListenerC2614Hm.f26112y = null;
            WeakReference weakReference = viewOnClickListenerC2614Hm.f26113z;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                viewOnClickListenerC2614Hm.f26113z = null;
            }
            try {
                C2722Ob c2722Ob = viewOnClickListenerC2614Hm.f26109v;
                c2722Ob.d1(c2722Ob.F0(), 2);
            } catch (RemoteException e9) {
                x2.i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType, int i) {
        boolean z9;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f31419v;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue()) {
                z9 = true;
                if (!z9) {
                    if (!this.f31408Q) {
                        int i4 = w2.z.f41712b;
                        x2.i.a("Custom click reporting failed. enableCustomClickGesture is not set.");
                        return;
                    } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                        int i6 = w2.z.f41712b;
                        x2.i.a("Custom click reporting failed. Ad unit id not in the allow list.");
                        return;
                    }
                }
                Context context = this.f31417n;
                JSONObject y7 = t8.g.y(context, map, map2, view2, scaleType);
                JSONObject t6 = t8.g.t(context, view2);
                JSONObject v9 = t8.g.v(view2);
                z10 = z9;
                JSONObject x9 = t8.g.x(context, view2);
                String w3 = w(view, map);
                JSONObject A9 = t8.g.A(w3, context, this.f31410S, this.f31409R);
                if (z10) {
                    try {
                        Point point = this.f31410S;
                        Point point2 = this.f31409R;
                        try {
                            jSONObject = new JSONObject();
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                if (point != null) {
                                    jSONObject3.put("x", point.x);
                                    jSONObject3.put("y", point.y);
                                }
                                if (point2 != null) {
                                    jSONObject4.put("x", point2.x);
                                    jSONObject4.put("y", point2.y);
                                }
                                jSONObject.put("start_point", jSONObject3);
                                jSONObject.put("end_point", jSONObject4);
                                jSONObject.put("duration_ms", i);
                            } catch (Exception e9) {
                                e = e9;
                                int i9 = w2.z.f41712b;
                                x2.i.d("Error occurred while grabbing custom click gesture signals.", e);
                                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                                C(view2, t6, y7, v9, x9, w3, A9, null, z6, true);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            jSONObject = null;
                        }
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    } catch (JSONException e11) {
                        int i10 = w2.z.f41712b;
                        x2.i.d("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                        C4906k.f40186C.f40196h.d("FirstPartyNativeAdCore.performCustomClickGesture", e11);
                    }
                }
                C(view2, t6, y7, v9, x9, w3, A9, null, z6, true);
            }
        }
        z9 = false;
        if (!z9) {
        }
        Context context2 = this.f31417n;
        JSONObject y72 = t8.g.y(context2, map, map2, view2, scaleType);
        JSONObject t62 = t8.g.t(context2, view2);
        JSONObject v92 = t8.g.v(view2);
        z10 = z9;
        JSONObject x92 = t8.g.x(context2, view2);
        String w32 = w(view, map);
        JSONObject A92 = t8.g.A(w32, context2, this.f31410S, this.f31409R);
        if (z10) {
        }
        C(view2, t62, y72, v92, x92, w32, A92, null, z6, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void o(Bundle bundle) {
        if (bundle == null) {
            int i = w2.z.f41712b;
            x2.i.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!s("touch_reporting")) {
                int i4 = w2.z.f41712b;
                x2.i.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f31422y.f32160b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            x();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void p() {
        z(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f31417n;
        JSONObject y7 = t8.g.y(context, map, map2, view, scaleType);
        JSONObject t6 = t8.g.t(context, view);
        JSONObject v9 = t8.g.v(view);
        JSONObject x9 = t8.g.x(context, view);
        boolean C8 = t8.g.C(context, this.f31395C);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f31419v);
            jSONObject.put("asset_view_signal", y7);
            jSONObject.put("ad_view_signal", t6);
            jSONObject.put("scroll_view_signal", v9);
            jSONObject.put("lock_screen_signal", x9);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33144s4)).booleanValue()) {
                jSONObject.put("view_signals", A(view));
            }
            jSONObject.put("policy_validator_enabled", C8);
            jSONObject.put("screen", t8.g.D(context));
            MA.f(this.f31420w.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", AbstractC3436jg.f32062h);
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to create native ad signals logging JSON.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void r(InterfaceC4942l0 interfaceC4942l0) {
        s2.L0 l02;
        s2.L0 l03;
        try {
            if (this.f31407P) {
                return;
            }
            Vu vu = this.f31403L;
            St st = this.f31395C;
            C4260yv c4260yv = this.J;
            if (interfaceC4942l0 == null) {
                C4089vm c4089vm = this.f31421x;
                synchronized (c4089vm) {
                    l02 = c4089vm.f35491g;
                }
                if (l02 != null) {
                    this.f31407P = true;
                    synchronized (c4089vm) {
                        l03 = c4089vm.f35491g;
                    }
                    c4260yv.b(l03.f40363u, st.f28434x0, vu, null);
                    D();
                    return;
                }
            }
            this.f31407P = true;
            c4260yv.b(interfaceC4942l0.e(), st.f28434x0, vu, null);
            D();
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final boolean s(String str) {
        JSONObject optJSONObject = this.f31419v.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f31417n;
        z(t8.g.t(context, view), t8.g.y(context, map, map2, view, scaleType), t8.g.v(view), t8.g.x(context, view), A(view), null, t8.g.C(context, this.f31395C), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final boolean u(Bundle bundle) {
        if (s("impression_reporting")) {
            return z(null, null, null, null, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qc)).booleanValue() ? A(null) : null, C4949p.f40498g.f40499a.m(bundle, null), false, null);
        }
        int i = w2.z.f41712b;
        x2.i.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final void v(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f31409R = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f31400H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.f31412U = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f31402K.f27117a = motionEvent;
            this.f31411T = currentTimeMillis;
            this.f31410S = this.f31409R;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f31409R;
        obtain.setLocation(point.x, point.y);
        this.f31422y.f32160b.b(obtain);
        obtain.recycle();
        x();
    }

    public final String w(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int q8 = this.f31421x.q();
        if (q8 == 1) {
            return "1099";
        }
        if (q8 == 2) {
            return "2099";
        }
        if (q8 != 6) {
            return null;
        }
        return "3099";
    }

    public final void x() {
        C4896a c4896a;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.lf)).booleanValue() || (c4896a = this.Y) == null) {
            return;
        }
        c4896a.f40145b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4251ym
    public final int y() {
        C3485kb c3485kb = this.f31397E.f30398j;
        if (c3485kb == null) {
            return 0;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue()) {
            return c3485kb.f32245B;
        }
        return 0;
    }

    public final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z6, View view) {
        C3387ik c3387ik;
        St st = this.f31395C;
        Context context = this.f31417n;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f31419v);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            C3324ha c3324ha = AbstractC3592ma.f33144s4;
            s2.r rVar = s2.r.f40506e;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar.f40509c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z6);
            jSONObject6.put("screen", t8.g.D(context));
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.nf)).booleanValue() && (c3387ik = this.f31416Z) != null) {
                AtomicLong atomicLong = c3387ik.f31884a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.N9)).booleanValue();
            C4036un c4036un = this.f31420w;
            if (booleanValue) {
                c4036un.b("/clickRecorded", new C3174em(this, 1));
            } else {
                c4036un.b("/logScionEvent", new C3174em(this, 0));
            }
            c4036un.b("/nativeImpression", new C3111dc(this, view));
            c4036un.b("/nativeImpressionFlowControl", new C3228fm(this, this.J, st.f28434x0, this.f31403L));
            MA.f(c4036un.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", AbstractC3436jg.f32062h);
            if (!this.f31405N) {
                this.f31405N = C4906k.f40186C.f40202o.d(context, this.f31396D.f41845n, st.f28361C.toString(), this.f31397E.f30396g);
            }
            return true;
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to create impression JSON.", e9);
            return false;
        }
    }
}
