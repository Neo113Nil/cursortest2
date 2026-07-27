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
import p2.C4826a;
import p2.C4835j;
import q2.C4889j0;
import q2.C4900p;
import q2.InterfaceC4893l0;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.fm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3205fm implements InterfaceC4174xm {

    /* renamed from: A, reason: collision with root package name */
    public final C3902sk f30420A;

    /* renamed from: B, reason: collision with root package name */
    public final C2525Dl f30421B;

    /* renamed from: C, reason: collision with root package name */
    public final St f30422C;

    /* renamed from: D, reason: collision with root package name */
    public final C5110a f30423D;

    /* renamed from: E, reason: collision with root package name */
    public final C3052cu f30424E;

    /* renamed from: F, reason: collision with root package name */
    public final C2934aj f30425F;

    /* renamed from: G, reason: collision with root package name */
    public final ViewOnClickListenerC2577Gm f30426G;

    /* renamed from: H, reason: collision with root package name */
    public final T2.a f30427H;

    /* renamed from: I, reason: collision with root package name */
    public final C2508Cl f30428I;
    public final C4237yv J;

    /* renamed from: K, reason: collision with root package name */
    public final C2663Ln f30429K;

    /* renamed from: L, reason: collision with root package name */
    public final Vu f30430L;

    /* renamed from: M, reason: collision with root package name */
    public final BinderC2880Yp f30431M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f30433O;

    /* renamed from: V, reason: collision with root package name */
    public C4889j0 f30440V;

    /* renamed from: W, reason: collision with root package name */
    public final C2779Sk f30441W;

    /* renamed from: X, reason: collision with root package name */
    public final C2543Em f30442X;
    public final C4826a Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C3364ik f30443Z;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30444n;

    /* renamed from: u, reason: collision with root package name */
    public final C4282zm f30445u;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f30446v;

    /* renamed from: w, reason: collision with root package name */
    public final C3959tn f30447w;

    /* renamed from: x, reason: collision with root package name */
    public final C4012um f30448x;

    /* renamed from: y, reason: collision with root package name */
    public final C3441k7 f30449y;

    /* renamed from: z, reason: collision with root package name */
    public final C2507Ck f30450z;

    /* renamed from: N, reason: collision with root package name */
    public boolean f30432N = false;

    /* renamed from: P, reason: collision with root package name */
    public boolean f30434P = false;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f30435Q = false;

    /* renamed from: R, reason: collision with root package name */
    public Point f30436R = new Point();

    /* renamed from: S, reason: collision with root package name */
    public Point f30437S = new Point();

    /* renamed from: T, reason: collision with root package name */
    public long f30438T = 0;

    /* renamed from: U, reason: collision with root package name */
    public long f30439U = 0;

    public C3205fm(Context context, C4282zm c4282zm, JSONObject jSONObject, C3959tn c3959tn, C4012um c4012um, C3441k7 c3441k7, C2507Ck c2507Ck, C3902sk c3902sk, C2525Dl c2525Dl, St st, C5110a c5110a, C3052cu c3052cu, C2934aj c2934aj, ViewOnClickListenerC2577Gm viewOnClickListenerC2577Gm, T2.a aVar, C2508Cl c2508Cl, C4237yv c4237yv, Vu vu, BinderC2880Yp binderC2880Yp, C2663Ln c2663Ln, C2543Em c2543Em, C2779Sk c2779Sk, C4826a c4826a, C3364ik c3364ik) {
        this.f30444n = context;
        this.f30445u = c4282zm;
        this.f30446v = jSONObject;
        this.f30447w = c3959tn;
        this.f30448x = c4012um;
        this.f30449y = c3441k7;
        this.f30450z = c2507Ck;
        this.f30420A = c3902sk;
        this.f30421B = c2525Dl;
        this.f30422C = st;
        this.f30423D = c5110a;
        this.f30424E = c3052cu;
        this.f30425F = c2934aj;
        this.f30426G = viewOnClickListenerC2577Gm;
        this.f30427H = aVar;
        this.f30428I = c2508Cl;
        this.J = c4237yv;
        this.f30430L = vu;
        this.f30431M = binderC2880Yp;
        this.f30429K = c2663Ln;
        this.f30442X = c2543Em;
        this.f30441W = c2779Sk;
        this.Y = c4826a;
        this.f30443Z = c3364ik;
    }

    public final String A(View view) {
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32365s4)).booleanValue()) {
            return null;
        }
        try {
            return this.f30449y.f31381b.i(this.f30444n, view, null);
        } catch (Exception unused) {
            int i = u2.z.f41319b;
            v2.i.c("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final boolean B() {
        if (y() == 0) {
            return true;
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Xc)).booleanValue()) {
            return this.f30424E.f29628j.f31469C;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:2|3|(1:5)(1:81)|6|(1:80)(1:10)|11|8f|16|(2:99|(21:23|24|(1:28)|29|(1:33)|(1:35)|36|(1:38)|39|40|41|(1:43)|44|45|(1:49)|50|(1:54)|55|(3:57|(1:59)|(1:61))|62|63))|74|24|(2:26|28)|29|(2:31|33)|(0)|36|(0)|39|40|41|(0)|44|45|(2:47|49)|50|(2:52|54)|55|(0)|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
    
        r8 = u2.z.f41319b;
        v2.i.d("Exception obtaining click signals", r0);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: JSONException -> 0x0086, TryCatch #2 {JSONException -> 0x0086, blocks: (B:3:0x000a, B:6:0x0050, B:8:0x007e, B:11:0x008a, B:12:0x008f, B:15:0x0092, B:16:0x0093, B:18:0x0099, B:21:0x009c, B:24:0x00a7, B:26:0x00b0, B:28:0x00b8, B:29:0x00bd, B:31:0x00cd, B:33:0x00d7, B:35:0x00de, B:36:0x00e3, B:39:0x00f2, B:45:0x011f, B:47:0x0139, B:49:0x013f, B:50:0x0144, B:52:0x0154, B:54:0x015a, B:55:0x015f, B:57:0x018e, B:59:0x0196, B:61:0x019e, B:62:0x01a3, B:68:0x0117, B:73:0x00a6, B:79:0x01b6, B:20:0x009a, B:14:0x0090, B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:2:0x000a, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[Catch: Exception -> 0x0103, TryCatch #3 {Exception -> 0x0103, blocks: (B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:40:0x00f7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e A[Catch: JSONException -> 0x0086, TryCatch #2 {JSONException -> 0x0086, blocks: (B:3:0x000a, B:6:0x0050, B:8:0x007e, B:11:0x008a, B:12:0x008f, B:15:0x0092, B:16:0x0093, B:18:0x0099, B:21:0x009c, B:24:0x00a7, B:26:0x00b0, B:28:0x00b8, B:29:0x00bd, B:31:0x00cd, B:33:0x00d7, B:35:0x00de, B:36:0x00e3, B:39:0x00f2, B:45:0x011f, B:47:0x0139, B:49:0x013f, B:50:0x0144, B:52:0x0154, B:54:0x015a, B:55:0x015f, B:57:0x018e, B:59:0x0196, B:61:0x019e, B:62:0x01a3, B:68:0x0117, B:73:0x00a6, B:79:0x01b6, B:20:0x009a, B:14:0x0090, B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:2:0x000a, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z3, boolean z6) {
        List list;
        boolean z9;
        C3301ha c3301ha;
        q2.r rVar;
        JSONObject optJSONObject;
        q2.L0 l02;
        T2.a aVar = this.f30427H;
        C4012um c4012um = this.f30448x;
        JSONObject jSONObject7 = this.f30446v;
        try {
            x();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            C4282zm c4282zm = this.f30445u;
            jSONObject8.put("has_custom_click_handler", ((InterfaceC2583Hb) c4282zm.f35450g.getOrDefault(c4012um.g(), null)) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", c4012um.q());
            jSONObject9.put("view_aware_api_used", z3);
            C3462kb c3462kb = this.f30424E.f29628j;
            jSONObject9.put("custom_mute_requested", c3462kb != null && c3462kb.f31477z);
            synchronized (c4012um) {
                list = c4012um.f34569f;
            }
            if (!list.isEmpty()) {
                synchronized (c4012um) {
                    l02 = c4012um.f34570g;
                }
                if (l02 != null) {
                    z9 = true;
                    jSONObject9.put("custom_mute_enabled", z9);
                    if (this.f30426G.f25108v != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                        jSONObject9.put("custom_one_point_five_click_eligible", true);
                    }
                    aVar.getClass();
                    jSONObject9.put(com.anythink.expressad.foundation.d.d.f18596u, System.currentTimeMillis());
                    if (this.f30435Q && this.f30446v.optBoolean("allow_custom_click_gesture", false)) {
                        jSONObject9.put("custom_click_gesture_eligible", true);
                    }
                    if (z6) {
                        jSONObject9.put("is_custom_click_gesture", true);
                    }
                    jSONObject9.put("has_custom_click_handler", ((InterfaceC2583Hb) c4282zm.f35450g.getOrDefault(c4012um.g(), null)) != null);
                    optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    String str2 = this.f30449y.f31381b.h(this.f30444n, optJSONObject.optString("click_string"), view);
                    jSONObject9.put("click_signals", str2);
                    jSONObject9.put("open_chrome_custom_tab", true);
                    c3301ha = AbstractC3569ma.R9;
                    rVar = q2.r.f40204e;
                    if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && T2.b.g()) {
                        jSONObject9.put("try_fallback_for_deep_link", true);
                    }
                    if (((Boolean) rVar.f40207c.a(AbstractC3569ma.S9)).booleanValue() && T2.b.g()) {
                        jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
                    }
                    jSONObject8.put("click", jSONObject9);
                    JSONObject jSONObject10 = new JSONObject();
                    aVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.f30438T);
                    jSONObject10.put("time_from_last_touch", currentTimeMillis - this.f30439U);
                    jSONObject8.put("touch_signal", jSONObject10);
                    if (this.f30422C.b()) {
                        JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                        String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                        if (string != null) {
                            this.f30431M.U3(string, c4012um);
                        }
                    }
                    MA.f(this.f30447w.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", AbstractC3413jg.f31275h);
                }
            }
            z9 = false;
            jSONObject9.put("custom_mute_enabled", z9);
            if (this.f30426G.f25108v != null) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            aVar.getClass();
            jSONObject9.put(com.anythink.expressad.foundation.d.d.f18596u, System.currentTimeMillis());
            if (this.f30435Q) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z6) {
            }
            jSONObject9.put("has_custom_click_handler", ((InterfaceC2583Hb) c4282zm.f35450g.getOrDefault(c4012um.g(), null)) != null);
            optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
            }
            String str22 = this.f30449y.f31381b.h(this.f30444n, optJSONObject.optString("click_string"), view);
            jSONObject9.put("click_signals", str22);
            jSONObject9.put("open_chrome_custom_tab", true);
            c3301ha = AbstractC3569ma.R9;
            rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.S9)).booleanValue()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject102 = new JSONObject();
            aVar.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            jSONObject102.put("time_from_last_touch_down", currentTimeMillis2 - this.f30438T);
            jSONObject102.put("time_from_last_touch", currentTimeMillis2 - this.f30439U);
            jSONObject8.put("touch_signal", jSONObject102);
            if (this.f30422C.b()) {
            }
            MA.f(this.f30447w.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", AbstractC3413jg.f31275h);
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to create click JSON.", e9);
        }
    }

    public final void D() {
        try {
            C4889j0 c4889j0 = this.f30440V;
            if (c4889j0 != null) {
                c4889j0.f1(c4889j0.H0(), 1);
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void H(String str) {
        C(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void M() {
        C3959tn c3959tn = this.f30447w;
        synchronized (c3959tn) {
            C3932tD c3932tD = c3959tn.f34398n;
            if (c3932tD == null) {
                return;
            }
            C3472kl c3472kl = new C3472kl(20);
            c3932tD.a(new LD(0, c3932tD, c3472kl), c3959tn.f34390e);
            c3959tn.f34398n = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void a(View view) {
        if (!this.f30446v.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = u2.z.f41319b;
            v2.i.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ViewOnClickListenerC2577Gm viewOnClickListenerC2577Gm = this.f30426G;
            view.setOnClickListener(viewOnClickListenerC2577Gm);
            view.setClickable(true);
            viewOnClickListenerC2577Gm.f25112z = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void b(InterfaceC4893l0 interfaceC4893l0) {
        q2.L0 l02;
        q2.L0 l03;
        try {
            if (this.f30434P) {
                return;
            }
            Vu vu = this.f30430L;
            St st = this.f30422C;
            C4237yv c4237yv = this.J;
            if (interfaceC4893l0 == null) {
                C4012um c4012um = this.f30448x;
                synchronized (c4012um) {
                    l02 = c4012um.f34570g;
                }
                if (l02 != null) {
                    this.f30434P = true;
                    synchronized (c4012um) {
                        l03 = c4012um.f34570g;
                    }
                    c4237yv.b(l03.f40061u, st.f27651x0, vu, null);
                    D();
                    return;
                }
            }
            this.f30434P = true;
            c4237yv.b(interfaceC4893l0.e(), st.f27651x0, vu, null);
            D();
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f30444n;
        JSONObject y7 = L3.F.y(context, map, map2, view, scaleType);
        JSONObject v9 = L3.F.v(context, view);
        JSONObject w6 = L3.F.w(view);
        JSONObject x9 = L3.F.x(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", y7);
            jSONObject.put("ad_view_signal", v9);
            jSONObject.put("scroll_view_signal", w6);
            jSONObject.put("lock_screen_signal", x9);
            return jSONObject;
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to create native ad view signals JSON.", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void d(Bundle bundle) {
        if (bundle == null) {
            int i = u2.z.f41319b;
            v2.i.a("Click data is null. No click is reported.");
        } else if (s("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            C(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C4900p.f40196g.f40197a.m(bundle, null), false, false);
        } else {
            int i6 = u2.z.f41319b;
            v2.i.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void e(C2702Ob c2702Ob) {
        if (!this.f30446v.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = u2.z.f41319b;
            v2.i.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC2577Gm viewOnClickListenerC2577Gm = this.f30426G;
        viewOnClickListenerC2577Gm.f25108v = c2702Ob;
        C3088dc c3088dc = viewOnClickListenerC2577Gm.f25109w;
        C3959tn c3959tn = viewOnClickListenerC2577Gm.f25106n;
        if (c3088dc != null) {
            c3959tn.c("/unconfirmedClick", c3088dc);
        }
        C3088dc c3088dc2 = new C3088dc(4, viewOnClickListenerC2577Gm, c2702Ob);
        viewOnClickListenerC2577Gm.f25109w = c3088dc2;
        c3959tn.b("/unconfirmedClick", c3088dc2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void f(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        Context context = this.f30444n;
        JSONObject y7 = L3.F.y(context, map, map2, view2, scaleType);
        JSONObject v9 = L3.F.v(context, view2);
        JSONObject w6 = L3.F.w(view2);
        JSONObject x9 = L3.F.x(context, view2);
        String v10 = v(view, map);
        C(true == ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32429z4)).booleanValue() ? view2 : view, v9, y7, w6, x9, v10, L3.F.z(v10, context, this.f30437S, this.f30436R), null, z3, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final boolean g() {
        return this.f30446v.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void h() {
        this.f30435Q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void i(View view, Map map, Map map2, InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om, InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om2) {
        this.f30436R = new Point();
        this.f30437S = new Point();
        if (!this.f30433O) {
            this.f30428I.Q1(view);
            this.f30433O = true;
        }
        view.setOnTouchListener(interfaceViewOnClickListenerC2713Om);
        view.setClickable(true);
        view.setOnClickListener(interfaceViewOnClickListenerC2713Om2);
        C2934aj c2934aj = this.f30425F;
        c2934aj.getClass();
        c2934aj.f29081C = new WeakReference(this);
        boolean u3 = L3.F.u(this.f30423D.f41390v);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (u3) {
                        view2.setOnTouchListener(interfaceViewOnClickListenerC2713Om);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(interfaceViewOnClickListenerC2713Om2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (u3) {
                        view3.setOnTouchListener(interfaceViewOnClickListenerC2713Om);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void j() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f30446v);
            MA.f(this.f30447w.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", AbstractC3413jg.f31275h);
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void k(View view) {
        this.f30436R = new Point();
        this.f30437S = new Point();
        if (view != null) {
            C2508Cl c2508Cl = this.f30428I;
            synchronized (c2508Cl) {
                WeakHashMap weakHashMap = c2508Cl.f24213v;
                if (weakHashMap.containsKey(view)) {
                    ((ViewOnAttachStateChangeListenerC3981u8) weakHashMap.get(view)).f34491E.remove(c2508Cl);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f30433O = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject c9 = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f30435Q && this.f30446v.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (c9 != null) {
                jSONObject.put("nas", c9);
                return jSONObject;
            }
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to create native click meta data JSON.", e9);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void m() {
        View view;
        if (this.f30446v.optBoolean("custom_one_point_five_click_enabled", false)) {
            ViewOnClickListenerC2577Gm viewOnClickListenerC2577Gm = this.f30426G;
            if (viewOnClickListenerC2577Gm.f25108v == null || viewOnClickListenerC2577Gm.f25111y == null) {
                return;
            }
            viewOnClickListenerC2577Gm.f25110x = null;
            viewOnClickListenerC2577Gm.f25111y = null;
            WeakReference weakReference = viewOnClickListenerC2577Gm.f25112z;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                viewOnClickListenerC2577Gm.f25112z = null;
            }
            try {
                C2702Ob c2702Ob = viewOnClickListenerC2577Gm.f25108v;
                c2702Ob.f1(c2702Ob.H0(), 2);
            } catch (RemoteException e9) {
                v2.i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i) {
        boolean z6;
        boolean z9;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f30446v;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Xc)).booleanValue()) {
                z6 = true;
                if (!z6) {
                    if (!this.f30435Q) {
                        int i6 = u2.z.f41319b;
                        v2.i.a("Custom click reporting failed. enableCustomClickGesture is not set.");
                        return;
                    } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                        int i9 = u2.z.f41319b;
                        v2.i.a("Custom click reporting failed. Ad unit id not in the allow list.");
                        return;
                    }
                }
                Context context = this.f30444n;
                JSONObject y7 = L3.F.y(context, map, map2, view2, scaleType);
                JSONObject v9 = L3.F.v(context, view2);
                JSONObject w6 = L3.F.w(view2);
                z9 = z6;
                JSONObject x9 = L3.F.x(context, view2);
                String v10 = v(view, map);
                JSONObject z10 = L3.F.z(v10, context, this.f30437S, this.f30436R);
                if (z9) {
                    try {
                        Point point = this.f30437S;
                        Point point2 = this.f30436R;
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
                                int i10 = u2.z.f41319b;
                                v2.i.d("Error occurred while grabbing custom click gesture signals.", e);
                                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                                C(view2, v9, y7, w6, x9, v10, z10, null, z3, true);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            jSONObject = null;
                        }
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    } catch (JSONException e11) {
                        int i11 = u2.z.f41319b;
                        v2.i.d("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                        C4835j.f39730C.f39740h.d("FirstPartyNativeAdCore.performCustomClickGesture", e11);
                    }
                }
                C(view2, v9, y7, w6, x9, v10, z10, null, z3, true);
            }
        }
        z6 = false;
        if (!z6) {
        }
        Context context2 = this.f30444n;
        JSONObject y72 = L3.F.y(context2, map, map2, view2, scaleType);
        JSONObject v92 = L3.F.v(context2, view2);
        JSONObject w62 = L3.F.w(view2);
        z9 = z6;
        JSONObject x92 = L3.F.x(context2, view2);
        String v102 = v(view, map);
        JSONObject z102 = L3.F.z(v102, context2, this.f30437S, this.f30436R);
        if (z9) {
        }
        C(view2, v92, y72, w62, x92, v102, z102, null, z3, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void o(Bundle bundle) {
        if (bundle == null) {
            int i = u2.z.f41319b;
            v2.i.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!s("touch_reporting")) {
                int i6 = u2.z.f41319b;
                v2.i.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f30449y.f31381b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            x();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void p() {
        z(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void q(C4889j0 c4889j0) {
        this.f30440V = c4889j0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f30444n;
        JSONObject y7 = L3.F.y(context, map, map2, view, scaleType);
        JSONObject v9 = L3.F.v(context, view);
        JSONObject w6 = L3.F.w(view);
        JSONObject x9 = L3.F.x(context, view);
        boolean A9 = L3.F.A(context, this.f30422C);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f30446v);
            jSONObject.put("asset_view_signal", y7);
            jSONObject.put("ad_view_signal", v9);
            jSONObject.put("scroll_view_signal", w6);
            jSONObject.put("lock_screen_signal", x9);
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32365s4)).booleanValue()) {
                jSONObject.put("view_signals", A(view));
            }
            jSONObject.put("policy_validator_enabled", A9);
            jSONObject.put("screen", L3.F.B(context));
            MA.f(this.f30447w.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", AbstractC3413jg.f31275h);
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to create native ad signals logging JSON.", e9);
        }
    }

    public final boolean s(String str) {
        JSONObject optJSONObject = this.f30446v.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f30444n;
        z(L3.F.v(context, view), L3.F.y(context, map, map2, view, scaleType), L3.F.w(view), L3.F.x(context, view), A(view), null, L3.F.A(context, this.f30422C), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final boolean u(Bundle bundle) {
        if (s("impression_reporting")) {
            return z(null, null, null, null, ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Qc)).booleanValue() ? A(null) : null, C4900p.f40196g.f40197a.m(bundle, null), false, null);
        }
        int i = u2.z.f41319b;
        v2.i.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    public final String v(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int q8 = this.f30448x.q();
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

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final void w(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f30436R = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f30427H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.f30439U = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f30429K.f26171a = motionEvent;
            this.f30438T = currentTimeMillis;
            this.f30437S = this.f30436R;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f30436R;
        obtain.setLocation(point.x, point.y);
        this.f30449y.f31381b.b(obtain);
        obtain.recycle();
        x();
    }

    public final void x() {
        C4826a c4826a;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.lf)).booleanValue() || (c4826a = this.Y) == null) {
            return;
        }
        c4826a.f39690b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4174xm
    public final int y() {
        C3462kb c3462kb = this.f30424E.f29628j;
        if (c3462kb == null) {
            return 0;
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Xc)).booleanValue()) {
            return c3462kb.f31468B;
        }
        return 0;
    }

    public final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z3, View view) {
        C3364ik c3364ik;
        St st = this.f30422C;
        Context context = this.f30444n;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f30446v);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            C3301ha c3301ha = AbstractC3569ma.f32365s4;
            q2.r rVar = q2.r.f40204e;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar.f40207c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z3);
            jSONObject6.put("screen", L3.F.B(context));
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.nf)).booleanValue() && (c3364ik = this.f30443Z) != null) {
                AtomicLong atomicLong = c3364ik.f31114a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.N9)).booleanValue();
            C3959tn c3959tn = this.f30447w;
            if (booleanValue) {
                c3959tn.b("/clickRecorded", new C3098dm(this, 1));
            } else {
                c3959tn.b("/logScionEvent", new C3098dm(this, 0));
            }
            c3959tn.b("/nativeImpression", new C3088dc(this, view));
            c3959tn.b("/nativeImpressionFlowControl", new C3151em(this, this.J, st.f27651x0, this.f30430L));
            MA.f(c3959tn.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", AbstractC3413jg.f31275h);
            if (!this.f30432N) {
                this.f30432N = C4835j.f39730C.f39746o.d(context, this.f30423D.f41388n, st.f27578C.toString(), this.f30424E.f29626g);
            }
            return true;
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Unable to create impression JSON.", e9);
            return false;
        }
    }
}
