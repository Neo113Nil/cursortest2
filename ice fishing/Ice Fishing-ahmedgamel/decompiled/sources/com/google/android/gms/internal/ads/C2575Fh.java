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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.C4797a;
import org.json.JSONObject;
import r2.C4906k;
import v2.BinderC5100d;
import v2.C5101e;
import w2.HandlerC5139A;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2575Fh extends FrameLayout implements InterfaceC4084vh {

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2592Gh f25606n;

    /* renamed from: u, reason: collision with root package name */
    public final C3887s f25607u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f25608v;

    public C2575Fh(ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh, C3230fo c3230fo) {
        super(viewTreeObserverOnGlobalLayoutListenerC2592Gh.getContext());
        this.f25608v = new AtomicBoolean();
        this.f25606n = viewTreeObserverOnGlobalLayoutListenerC2592Gh;
        this.f25607u = new C3887s(viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25866n.f28002c, this, this, c3230fo);
        addView(viewTreeObserverOnGlobalLayoutListenerC2592Gh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void A0() {
        C3232fq C0;
        C3178eq F02;
        TextView textView = new TextView(getContext());
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        Resources c9 = c4906k.f40196h.c();
        textView.setText(c9 != null ? c9.getString(C5248R.string.s7) : "Test Ad");
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
        C3324ha c3324ha = AbstractC3592ma.f33072k6;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f25606n;
        if (booleanValue && (F02 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.F0()) != null) {
            synchronized (F02) {
                Zv zv = F02.f30774f;
                if (zv != null) {
                    c4906k.f40211x.getClass();
                    C3495kl.p(new RunnableC3071cq(1, zv, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.j6)).booleanValue() && (C0 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.C0()) != null && ((Tv) C0.f31220b.f24789z) == Tv.HTML) {
            C3495kl c3495kl = c4906k.f40211x;
            Uv uv = C0.f31219a;
            c3495kl.getClass();
            C3495kl.p(new RunnableC3018bq(uv, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void B0(String str, String str2) {
        this.f25606n.B0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C5189a C() {
        return this.f25606n.f25880x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3232fq C0() {
        return this.f25606n.C0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void D() {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2592Gh.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void D0(Context context) {
        this.f25606n.D0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final BinderC5100d E0() {
        return this.f25606n.E0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3178eq F0() {
        return this.f25606n.F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean G0() {
        return this.f25606n.G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final int H() {
        return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32839K4)).booleanValue() ? this.f25606n.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void H0(int i, boolean z6, boolean z9) {
        this.f25606n.H0(i, z6, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void I0(int i) {
        this.f25606n.I0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final St J() {
        return this.f25606n.f25842C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void J0(boolean z6) {
        this.f25606n.J0(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final void L() {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2592Gh.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void L0(C3178eq c3178eq) {
        this.f25606n.L0(c3178eq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void M0(long j6, boolean z6) {
        this.f25606n.M0(j6, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void N0(boolean z6, int i, String str, boolean z9, boolean z10) {
        this.f25606n.N0(z6, i, str, z9, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void O0() {
        setBackgroundColor(0);
        this.f25606n.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final ArrayList P() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f25606n) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void P0(C3232fq c3232fq) {
        this.f25606n.P0(c3232fq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void Q(int i) {
        C4137wg c4137wg = (C4137wg) this.f25607u.f34558y;
        if (c4137wg != null) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33113p0)).booleanValue()) {
                c4137wg.f35635u.setBackgroundColor(i);
                c4137wg.f35636v.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3464k7 Q0() {
        return this.f25606n.f25874u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final String R() {
        return this.f25606n.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void R0(BinderC2626Ih binderC2626Ih) {
        this.f25606n.R0(binderC2626Ih);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void S0(String str, InterfaceC3272gc interfaceC3272gc) {
        this.f25606n.S0(str, interfaceC3272gc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void T0(int i) {
        this.f25606n.T0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean U0() {
        return this.f25608v.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final View V() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void V0(InterfaceC3431jb interfaceC3431jb) {
        this.f25606n.V0(interfaceC3431jb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3887s W0() {
        return this.f25607u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void X0(boolean z6) {
        this.f25606n.f25846G.f26947X = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void Y0(St st, Ut ut) {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f25606n;
        viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25842C = st;
        viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25843D = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void Z0(String str, InterfaceC3272gc interfaceC3272gc) {
        this.f25606n.Z0(str, interfaceC3272gc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void a(String str, JSONObject jSONObject) {
        this.f25606n.c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean a1() {
        return this.f25606n.a1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void b(String str) {
        this.f25606n.s(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final InterfaceC3431jb b1() {
        return this.f25606n.b1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void c(String str, String str2) {
        this.f25606n.c("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void c1() {
        this.f25606n.C0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean canGoBack() {
        return this.f25606n.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2672Lc
    public final void d(String str, Map map) {
        this.f25606n.d(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final Context d0() {
        return this.f25606n.f25866n.f28002c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void destroy() {
        C3178eq F02;
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f25606n;
        C3232fq C0 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.C0();
        if (C0 != null) {
            HandlerC5139A handlerC5139A = w2.D.f41627l;
            handlerC5139A.post(new RunnableC3134e(24, C0));
            handlerC5139A.postDelayed(new RunnableC2558Eh(viewTreeObserverOnGlobalLayoutListenerC2592Gh, 1), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.i6)).intValue());
        } else if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33072k6)).booleanValue() || (F02 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.F0()) == null) {
            viewTreeObserverOnGlobalLayoutListenerC2592Gh.destroy();
        } else {
            w2.D.f41627l.post(new RunnableC3996u0(15, this, F02));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2672Lc
    public final void e(String str, JSONObject jSONObject) {
        this.f25606n.e(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void e1() {
        this.f25606n.e1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        this.f25606n.f(c3896s8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void f1(A3.r rVar) {
        this.f25606n.f1(rVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final BinderC2626Ih g() {
        return this.f25606n.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C3236fu g0() {
        return this.f25606n.f25876v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void g1(boolean z6) {
        this.f25606n.g1(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void goBack() {
        this.f25606n.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C2677Lh h0() {
        return this.f25606n.f25846G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void i0(boolean z6, int i, String str, String str2, boolean z9) {
        this.f25606n.i0(z6, i, str, str2, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void i1(BinderC5100d binderC5100d) {
        this.f25606n.i1(binderC5100d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final Activity j() {
        return this.f25606n.f25866n.f28000a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final A3.r j0() {
        return this.f25606n.j0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void j1(ViewTreeObserverOnGlobalLayoutListenerC3497kn viewTreeObserverOnGlobalLayoutListenerC3497kn) {
        this.f25606n.j1(viewTreeObserverOnGlobalLayoutListenerC3497kn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final C4797a k() {
        return this.f25606n.f25884z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void k0() {
        this.f25606n.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean k1() {
        return this.f25606n.k1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void l() {
        this.f25606n.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void l0(int i) {
        this.f25606n.l0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void l1(boolean z6) {
        this.f25606n.l1(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void loadData(String str, String str2, String str3) {
        this.f25606n.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f25606n.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void loadUrl(String str) {
        this.f25606n.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final S0.l m() {
        return this.f25606n.f25869p0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void m0(String str, String str2) {
        this.f25606n.m0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void m1(BinderC5100d binderC5100d) {
        this.f25606n.m1(binderC5100d);
    }

    public final void n() {
        C3887s c3887s = this.f25607u;
        c3887s.getClass();
        R2.w.d("onDestroy must be called from the UI thread.");
        C4137wg c4137wg = (C4137wg) c3887s.f34558y;
        if (c4137wg != null) {
            c4137wg.f35638x.a();
            AbstractC3975tg abstractC3975tg = c4137wg.f35640z;
            if (abstractC3975tg != null) {
                abstractC3975tg.g();
            }
            c4137wg.d();
            ((C2575Fh) c3887s.f34556w).removeView((C4137wg) c3887s.f34558y);
            c3887s.f34558y = null;
        }
        this.f25606n.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean n0() {
        return this.f25606n.n0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final boolean n1() {
        return this.f25606n.n1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final int o0() {
        return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32839K4)).booleanValue() ? this.f25606n.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh != null) {
            viewTreeObserverOnGlobalLayoutListenerC2592Gh.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void onPause() {
        AbstractC3975tg abstractC3975tg;
        C3887s c3887s = this.f25607u;
        c3887s.getClass();
        R2.w.d("onPause must be called from the UI thread.");
        C4137wg c4137wg = (C4137wg) c3887s.f34558y;
        if (c4137wg != null && (abstractC3975tg = c4137wg.f35640z) != null) {
            abstractC3975tg.i();
        }
        this.f25606n.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void onResume() {
        this.f25606n.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final String p() {
        return this.f25606n.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final I8 p0() {
        return this.f25606n.p0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final WebView q() {
        return this.f25606n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void q0(I8 i82) {
        this.f25606n.q0(i82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final int r() {
        return this.f25606n.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void r0(String str, Qx qx) {
        this.f25606n.r0(str, qx);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void s0(String str, AbstractC2862Wg abstractC2862Wg) {
        this.f25606n.s0(str, abstractC2862Wg);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f25606n.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f25606n.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f25606n.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f25606n.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void u() {
        this.f25606n.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final P3.a u0() {
        return this.f25606n.u0();
    }

    @Override // r2.InterfaceC4903h
    public final void v() {
        this.f25606n.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void v0(C5101e c5101e, boolean z6, boolean z9, String str) {
        this.f25606n.v0(c5101e, z6, z9, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void w0(boolean z6) {
        this.f25606n.w0(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final void x0(int i, boolean z6) {
        this.f25606n.x0(i, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final BinderC5100d y0() {
        return this.f25606n.y0();
    }

    @Override // r2.InterfaceC4903h
    public final void z() {
        this.f25606n.z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4084vh
    public final Ut z0() {
        return this.f25606n.f25843D;
    }
}
