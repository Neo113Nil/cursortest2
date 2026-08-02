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
import com.icefishingapp.icefishing.C5275R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p2.C4835j;
import t2.BinderC5036d;
import t2.C5037e;
import u2.HandlerC5068A;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2555Fh extends FrameLayout implements InterfaceC4061vh {

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2572Gh f24817n;

    /* renamed from: u, reason: collision with root package name */
    public final C3864s f24818u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f24819v;

    public C2555Fh(ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh, C3153eo c3153eo) {
        super(viewTreeObserverOnGlobalLayoutListenerC2572Gh.getContext());
        this.f24819v = new AtomicBoolean();
        this.f24817n = viewTreeObserverOnGlobalLayoutListenerC2572Gh;
        this.f24818u = new C3864s(viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25079n.f27318c, this, this, c3153eo);
        addView(viewTreeObserverOnGlobalLayoutListenerC2572Gh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final Ut A0() {
        return this.f24817n.f25055D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void B0() {
        C3209fq D02;
        C3155eq G02;
        TextView textView = new TextView(getContext());
        C4835j c4835j = C4835j.f39733C;
        u2.D d2 = c4835j.f39738c;
        Resources c9 = c4835j.f39743h.c();
        textView.setText(c9 != null ? c9.getString(C5275R.string.s7) : "Test Ad");
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
        C3301ha c3301ha = AbstractC3569ma.f32293k6;
        q2.r rVar = q2.r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f24817n;
        if (booleanValue && (G02 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.G0()) != null) {
            synchronized (G02) {
                Yv yv = G02.f29985f;
                if (yv != null) {
                    c4835j.f39758x.getClass();
                    C3472kl.p(new RunnableC3048cq(1, yv, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.j6)).booleanValue() && (D02 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.D0()) != null && ((Tv) D02.f30457b.f24026z) == Tv.HTML) {
            C3472kl c3472kl = c4835j.f39758x;
            Uv uv = D02.f30456a;
            c3472kl.getClass();
            C3472kl.p(new RunnableC2995bq(uv, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C5110a C() {
        return this.f24817n.f25093x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void C0(String str, String str2) {
        this.f24817n.C0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3209fq D0() {
        return this.f24817n.D0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void E0(Context context) {
        this.f24817n.E0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final BinderC5036d F0() {
        return this.f24817n.F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3155eq G0() {
        return this.f24817n.G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean H0() {
        return this.f24817n.H0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final int I() {
        return ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32059K4)).booleanValue() ? this.f24817n.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void I0(int i, boolean z3, boolean z6) {
        this.f24817n.I0(i, z3, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void J() {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2572Gh.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void J0(int i) {
        this.f24817n.J0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final St K() {
        return this.f24817n.f25054C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void K0(boolean z3) {
        this.f24817n.K0(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void L0(C3155eq c3155eq) {
        this.f24817n.L0(c3155eq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final void M() {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2572Gh.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void N0(long j6, boolean z3) {
        this.f24817n.N0(j6, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void O0(boolean z3, int i, String str, boolean z6, boolean z9) {
        this.f24817n.O0(z3, i, str, z6, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final ArrayList P() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f24817n) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void P0() {
        setBackgroundColor(0);
        this.f24817n.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Q(int i) {
        C4114wg c4114wg = (C4114wg) this.f24818u.f33790y;
        if (c4114wg != null) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32333p0)).booleanValue()) {
                c4114wg.f34858u.setBackgroundColor(i);
                c4114wg.f34859v.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Q0(C3209fq c3209fq) {
        this.f24817n.Q0(c3209fq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final String R() {
        return this.f24817n.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3441k7 R0() {
        return this.f24817n.f25087u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void S0(BinderC2606Ih binderC2606Ih) {
        this.f24817n.S0(binderC2606Ih);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void T0(String str, InterfaceC3249gc interfaceC3249gc) {
        this.f24817n.T0(str, interfaceC3249gc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void U0(int i) {
        this.f24817n.U0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final View V() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean V0() {
        return this.f24819v.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void W0(InterfaceC3408jb interfaceC3408jb) {
        this.f24817n.W0(interfaceC3408jb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3864s X0() {
        return this.f24818u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Y0(boolean z3) {
        this.f24817n.f25061G.f26150X = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void Z0(St st, Ut ut) {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f24817n;
        viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25054C = st;
        viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25055D = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void a(String str, JSONObject jSONObject) {
        this.f24817n.c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void a1(String str, InterfaceC3249gc interfaceC3249gc) {
        this.f24817n.a1(str, interfaceC3249gc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void b(String str) {
        this.f24817n.s(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean b1() {
        return this.f24817n.b1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void c(String str, String str2) {
        this.f24817n.c("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final InterfaceC3408jb c1() {
        return this.f24817n.c1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean canGoBack() {
        return this.f24817n.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2652Lc
    public final void d(String str, Map map) {
        this.f24817n.d(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final Context d0() {
        return this.f24817n.f25079n.f27318c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void d1() {
        this.f24817n.f25064H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void destroy() {
        C3155eq G02;
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f24817n;
        C3209fq D02 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.D0();
        if (D02 != null) {
            HandlerC5068A handlerC5068A = u2.D.f41237l;
            handlerC5068A.post(new RunnableC3111e(24, D02));
            handlerC5068A.postDelayed(new RunnableC2538Eh(viewTreeObserverOnGlobalLayoutListenerC2572Gh, 1), ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.i6)).intValue());
        } else if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32293k6)).booleanValue() || (G02 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.G0()) == null) {
            viewTreeObserverOnGlobalLayoutListenerC2572Gh.destroy();
        } else {
            u2.D.f41237l.post(new RunnableC3973u0(15, this, G02));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2652Lc
    public final void e(String str, JSONObject jSONObject) {
        this.f24817n.e(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void e1() {
        this.f24817n.e1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        this.f24817n.f(c3873s8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C3213fu f0() {
        return this.f24817n.f25089v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final BinderC2606Ih g() {
        return this.f24817n.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final C2657Lh g0() {
        return this.f24817n.f25061G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void g1(C5037e c5037e, boolean z3, boolean z6, String str) {
        this.f24817n.g1(c5037e, z3, z6, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void goBack() {
        this.f24817n.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void h0(boolean z3, int i, String str, String str2, boolean z6) {
        this.f24817n.h0(z3, i, str, str2, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final X2.b i0() {
        return this.f24817n.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void i1(boolean z3) {
        this.f24817n.i1(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final Activity j() {
        return this.f24817n.f25079n.f27316a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void j0(BinderC5036d binderC5036d) {
        this.f24817n.j0(binderC5036d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void j1(ViewTreeObserverOnGlobalLayoutListenerC3420jn viewTreeObserverOnGlobalLayoutListenerC3420jn) {
        this.f24817n.j1(viewTreeObserverOnGlobalLayoutListenerC3420jn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final k8.b k() {
        return this.f24817n.f25097z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void k0() {
        this.f24817n.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean k1() {
        return this.f24817n.k1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void l() {
        this.f24817n.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void l0(int i) {
        this.f24817n.l0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void l1(boolean z3) {
        this.f24817n.l1(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void loadData(String str, String str2, String str3) {
        this.f24817n.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f24817n.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void loadUrl(String str) {
        this.f24817n.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final S0.l m() {
        return this.f24817n.f25088u0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void m0(String str, String str2) {
        this.f24817n.m0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean m1() {
        return this.f24817n.m1();
    }

    public final void n() {
        C3864s c3864s = this.f24818u;
        c3864s.getClass();
        P2.w.d("onDestroy must be called from the UI thread.");
        C4114wg c4114wg = (C4114wg) c3864s.f33790y;
        if (c4114wg != null) {
            c4114wg.f34861x.a();
            AbstractC3952tg abstractC3952tg = c4114wg.f34863z;
            if (abstractC3952tg != null) {
                abstractC3952tg.g();
            }
            c4114wg.d();
            ((C2555Fh) c3864s.f33788w).removeView((C4114wg) c3864s.f33790y);
            c3864s.f33790y = null;
        }
        this.f24817n.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final boolean n0() {
        return this.f24817n.n0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void o0(X2.b bVar) {
        this.f24817n.o0(bVar);
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2572Gh.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void onPause() {
        AbstractC3952tg abstractC3952tg;
        C3864s c3864s = this.f24818u;
        c3864s.getClass();
        P2.w.d("onPause must be called from the UI thread.");
        C4114wg c4114wg = (C4114wg) c3864s.f33790y;
        if (c4114wg != null && (abstractC3952tg = c4114wg.f34863z) != null) {
            abstractC3952tg.i();
        }
        this.f24817n.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void onResume() {
        this.f24817n.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final String p() {
        return this.f24817n.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final int p0() {
        return ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32059K4)).booleanValue() ? this.f24817n.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final WebView q() {
        return this.f24817n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final I8 q0() {
        return this.f24817n.q0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final int r() {
        return this.f24817n.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void r0(I8 i82) {
        this.f24817n.r0(i82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void s0(String str, Qx qx) {
        this.f24817n.s0(str, qx);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f24817n.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f24817n.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f24817n.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f24817n.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void t0(BinderC5036d binderC5036d) {
        this.f24817n.t0(binderC5036d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void u() {
        this.f24817n.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void u0(String str, AbstractC2839Wg abstractC2839Wg) {
        this.f24817n.u0(str, abstractC2839Wg);
    }

    @Override // p2.InterfaceC4832g
    public final void v() {
        this.f24817n.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final N3.a v0() {
        return this.f24817n.v0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void x0(boolean z3) {
        this.f24817n.x0(z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final void y0(int i, boolean z3) {
        this.f24817n.y0(i, z3);
    }

    @Override // p2.InterfaceC4832g
    public final void z() {
        this.f24817n.z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061vh
    public final BinderC5036d z0() {
        return this.f24817n.z0();
    }
}
