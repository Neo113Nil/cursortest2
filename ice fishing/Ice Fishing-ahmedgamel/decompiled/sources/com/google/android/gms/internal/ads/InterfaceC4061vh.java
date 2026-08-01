package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import p2.InterfaceC4832g;
import q2.InterfaceC4870a;
import t2.BinderC5036d;
import t2.C5037e;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4061vh extends InterfaceC4870a, InterfaceC2542El, InterfaceC2652Lc, InterfaceC2737Qc, InterfaceC3927t8, InterfaceC4832g {
    Ut A0();

    void B0();

    C5110a C();

    void C0(String str, String str2);

    C3209fq D0();

    void E0(Context context);

    BinderC5036d F0();

    C3155eq G0();

    boolean H0();

    int I();

    void I0(int i, boolean z3, boolean z6);

    void J0(int i);

    St K();

    void K0(boolean z3);

    void L0(C3155eq c3155eq);

    void N0(long j6, boolean z3);

    void O0(boolean z3, int i, String str, boolean z6, boolean z9);

    ArrayList P();

    void P0();

    void Q(int i);

    void Q0(C3209fq c3209fq);

    String R();

    C3441k7 R0();

    void S0(BinderC2606Ih binderC2606Ih);

    void T0(String str, InterfaceC3249gc interfaceC3249gc);

    void U0(int i);

    View V();

    boolean V0();

    void W0(InterfaceC3408jb interfaceC3408jb);

    C3864s X0();

    void Y0(boolean z3);

    void Z0(St st, Ut ut);

    void a1(String str, InterfaceC3249gc interfaceC3249gc);

    boolean b1();

    InterfaceC3408jb c1();

    boolean canGoBack();

    Context d0();

    void d1();

    void destroy();

    void e1();

    C3213fu f0();

    BinderC2606Ih g();

    C2657Lh g0();

    void g1(C5037e c5037e, boolean z3, boolean z6, String str);

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h0(boolean z3, int i, String str, String str2, boolean z6);

    X2.b i0();

    void i1(boolean z3);

    boolean isAttachedToWindow();

    Activity j();

    void j0(BinderC5036d binderC5036d);

    void j1(ViewTreeObserverOnGlobalLayoutListenerC3420jn viewTreeObserverOnGlobalLayoutListenerC3420jn);

    k8.b k();

    void k0();

    boolean k1();

    void l();

    void l0(int i);

    void l1(boolean z3);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    S0.l m();

    void m0(String str, String str2);

    boolean m1();

    boolean n0();

    void o0(X2.b bVar);

    void onPause();

    void onResume();

    String p();

    int p0();

    WebView q();

    I8 q0();

    int r();

    void r0(I8 i82);

    void s0(String str, Qx qx);

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0(BinderC5036d binderC5036d);

    void u();

    void u0(String str, AbstractC2839Wg abstractC2839Wg);

    N3.a v0();

    void x0(boolean z3);

    void y0(int i, boolean z3);

    BinderC5036d z0();
}
