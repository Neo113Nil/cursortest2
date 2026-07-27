package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import s2.BinderC4996d;
import s2.C4997e;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Bh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2486Bh extends FrameLayout implements InterfaceC3858rh {

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2520Dh f24059n;

    /* renamed from: u, reason: collision with root package name */
    public final r f24060u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f24061v;

    public C2486Bh(ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh, C3165eo c3165eo) {
        super(viewTreeObserverOnGlobalLayoutListenerC2520Dh.getContext());
        this.f24061v = new AtomicBoolean();
        this.f24059n = viewTreeObserverOnGlobalLayoutListenerC2520Dh;
        this.f24060u = new r(viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24490n.f26732c, this, this, c3165eo);
        addView(viewTreeObserverOnGlobalLayoutListenerC2520Dh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        this.f24059n.A(c3671o8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void A0(Context context) {
        this.f24059n.A0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final ArrayList B() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f24059n) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void B0(String str, AbstractC2791Tg abstractC2791Tg) {
        this.f24059n.B0(str, abstractC2791Tg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void C() {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2520Dh.C();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final BinderC4996d C0() {
        return this.f24059n.C0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void E0(String str, InterfaceC2990bc interfaceC2990bc) {
        this.f24059n.E0(str, interfaceC2990bc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C3276gq F0() {
        return this.f24059n.F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final int G() {
        return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31478K4)).booleanValue() ? this.f24059n.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean G0() {
        return this.f24059n.G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void H0(int i, boolean z8, boolean z9) {
        this.f24059n.H0(i, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void I0(int i) {
        this.f24059n.I0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Ut J() {
        return this.f24059n.f24465C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void J0(W2.b bVar) {
        this.f24059n.J0(bVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void K0(String str, Rx rx) {
        this.f24059n.K0(str, rx);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void L() {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2520Dh.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void L0(boolean z8) {
        this.f24059n.L0(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void M0(long j9, boolean z8) {
        this.f24059n.M0(j9, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void N0(String str, InterfaceC2990bc interfaceC2990bc) {
        this.f24059n.N0(str, interfaceC2990bc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void O(int i) {
        C3965tg c3965tg = (C3965tg) this.f24060u.f33923y;
        if (c3965tg != null) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31753p0)).booleanValue()) {
                c3965tg.f34437u.setBackgroundColor(i);
                c3965tg.f34438v.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void O0(boolean z8, int i, String str, boolean z9, boolean z10) {
        this.f24059n.O0(z8, i, str, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final String P() {
        return this.f24059n.P();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void P0() {
        setBackgroundColor(0);
        this.f24059n.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void Q0(Ut ut, Wt wt) {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f24059n;
        viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24465C = ut;
        viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24466D = wt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void S() {
        this.f24059n.S();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C3348i7 S0() {
        return this.f24059n.f24498u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void T0(int i) {
        this.f24059n.T0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean U0() {
        return this.f24061v.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void V0(C4997e c4997e, boolean z8, boolean z9, String str) {
        this.f24059n.V0(c4997e, z8, z9, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C3280gu W0() {
        return this.f24059n.f24500v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final r X0() {
        return this.f24060u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void Y0(boolean z8) {
        this.f24059n.f24472G.f25403X = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C3330hq Z() {
        return this.f24059n.Z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean Z0() {
        return this.f24059n.Z0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2566Gc
    public final void a(String str, Map map) {
        this.f24059n.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final InterfaceC3152eb a1() {
        return this.f24059n.a1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void b(String str, JSONObject jSONObject) {
        this.f24059n.i(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final View b0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void b1() {
        this.f24059n.f24475H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2566Gc
    public final void c(String str, JSONObject jSONObject) {
        this.f24059n.c(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void c0(ViewTreeObserverOnGlobalLayoutListenerC3433jn viewTreeObserverOnGlobalLayoutListenerC3433jn) {
        this.f24059n.c0(viewTreeObserverOnGlobalLayoutListenerC3433jn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void c1() {
        this.f24059n.c1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean canGoBack() {
        return this.f24059n.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void d(String str) {
        this.f24059n.q(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void d0(boolean z8, int i, String str, String str2, boolean z9) {
        this.f24059n.d0(z8, i, str, str2, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void d1(boolean z8) {
        this.f24059n.d1(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void destroy() {
        C3276gq F02;
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f24059n;
        C3330hq Z8 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.Z();
        if (Z8 != null) {
            t2.D d2 = t2.G.f40858l;
            d2.post(new RunnableC3068d(24, Z8));
            d2.postDelayed(new RunnableC2469Ah(viewTreeObserverOnGlobalLayoutListenerC2520Dh, 1), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31693i6)).intValue());
        } else if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.k6)).booleanValue() || (F02 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.F0()) == null) {
            viewTreeObserverOnGlobalLayoutListenerC2520Dh.destroy();
        } else {
            t2.G.f40858l.post(new MD(16, this, F02));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final W2.b e0() {
        return this.f24059n.e0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void e1(BinderC2554Fh binderC2554Fh) {
        this.f24059n.e1(binderC2554Fh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void f0(C3276gq c3276gq) {
        this.f24059n.f0(c3276gq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final BinderC2554Fh g() {
        return this.f24059n.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Context g0() {
        return this.f24059n.f24490n.f26732c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean g1() {
        return this.f24059n.g1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void goBack() {
        this.f24059n.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Activity h() {
        return this.f24059n.f24490n.f26730a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void h0(int i) {
        this.f24059n.h0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void h1(boolean z8) {
        this.f24059n.h1(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void i(String str, String str2) {
        this.f24059n.i("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void i0(String str, String str2) {
        this.f24059n.i0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean i1() {
        return this.f24059n.i1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final S0.s j() {
        return this.f24059n.f24508z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C2588Hh j0() {
        return this.f24059n.f24472G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void j1(InterfaceC3152eb interfaceC3152eb) {
        this.f24059n.j1(interfaceC3152eb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void k() {
        this.f24059n.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void k0(F8 f82) {
        this.f24059n.k0(f82);
    }

    public final void l() {
        r rVar = this.f24060u;
        rVar.getClass();
        O2.w.d("onDestroy must be called from the UI thread.");
        C3965tg c3965tg = (C3965tg) rVar.f33923y;
        if (c3965tg != null) {
            c3965tg.f34440x.a();
            AbstractC3804qg abstractC3804qg = c3965tg.f34442z;
            if (abstractC3804qg != null) {
                abstractC3804qg.g();
            }
            c3965tg.d();
            ((C2486Bh) rVar.f33921w).removeView((C3965tg) rVar.f33923y);
            rVar.f33923y = null;
        }
        this.f24059n.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final F8 l0() {
        return this.f24059n.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void loadData(String str, String str2, String str3) {
        this.f24059n.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f24059n.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void loadUrl(String str) {
        this.f24059n.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final int m() {
        return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31478K4)).booleanValue() ? this.f24059n.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C2881Yl n() {
        return this.f24059n.f24499u0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void n0() {
        this.f24059n.n0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void o0(C3330hq c3330hq) {
        this.f24059n.o0(c3330hq);
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2520Dh.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void onPause() {
        AbstractC3804qg abstractC3804qg;
        r rVar = this.f24060u;
        rVar.getClass();
        O2.w.d("onPause must be called from the UI thread.");
        C3965tg c3965tg = (C3965tg) rVar.f33923y;
        if (c3965tg != null && (abstractC3804qg = c3965tg.f34442z) != null) {
            abstractC3804qg.i();
        }
        this.f24059n.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void onResume() {
        this.f24059n.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final String p() {
        return this.f24059n.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void p0(BinderC4996d binderC4996d) {
        this.f24059n.p0(binderC4996d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void q0(BinderC4996d binderC4996d) {
        this.f24059n.q0(binderC4996d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final int r() {
        return this.f24059n.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean r0() {
        return this.f24059n.r0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final WebView s() {
        return this.f24059n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final J3.a s0() {
        return this.f24059n.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f24059n.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f24059n.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f24059n.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f24059n.setWebViewClient(webViewClient);
    }

    @Override // p2.g
    public final void t() {
        this.f24059n.t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void t0(boolean z8) {
        this.f24059n.t0(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void v0(int i, boolean z8) {
        this.f24059n.v0(i, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C5107a w() {
        return this.f24059n.f24504x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final BinderC4996d w0() {
        return this.f24059n.w0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Wt x0() {
        return this.f24059n.f24466D;
    }

    @Override // p2.g
    public final void y() {
        this.f24059n.y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void y0() {
        C3330hq Z8;
        C3276gq F02;
        TextView textView = new TextView(getContext());
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        Resources c4 = jVar.f39808h.c();
        textView.setText(c4 != null ? c4.getString(C5284R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        C3151ea c3151ea = AbstractC3368ia.k6;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = this.f24059n;
        if (booleanValue && (F02 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.F0()) != null) {
            synchronized (F02) {
                C2955aw c2955aw = F02.f31109f;
                if (c2955aw != null) {
                    jVar.f39823x.getClass();
                    C3431jl.r(new RunnableC3329hp(2, c2955aw, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31703j6)).booleanValue() && (Z8 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.Z()) != null && ((Vv) Z8.f31273b.f23813z) == Vv.HTML) {
            C3431jl c3431jl = jVar.f39823x;
            Wv wv = Z8.f31272a;
            c3431jl.getClass();
            C3431jl.r(new RunnableC3167eq(wv, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void z0(String str, String str2) {
        this.f24059n.z0(str, str2);
    }
}
