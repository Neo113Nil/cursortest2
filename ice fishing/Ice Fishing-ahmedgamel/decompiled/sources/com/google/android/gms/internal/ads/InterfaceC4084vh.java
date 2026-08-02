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
import o1.C4797a;
import r2.InterfaceC4903h;
import s2.InterfaceC4919a;
import v2.BinderC5100d;
import v2.C5101e;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4084vh extends InterfaceC4919a, InterfaceC2579Fl, InterfaceC2672Lc, InterfaceC2757Qc, InterfaceC3950t8, InterfaceC4903h {
    void A0();

    void B0(String str, String str2);

    C5189a C();

    C3232fq C0();

    void D0(Context context);

    BinderC5100d E0();

    C3178eq F0();

    boolean G0();

    int H();

    void H0(int i, boolean z6, boolean z9);

    void I0(int i);

    St J();

    void J0(boolean z6);

    void L0(C3178eq c3178eq);

    void M0(long j6, boolean z6);

    void N0(boolean z6, int i, String str, boolean z9, boolean z10);

    void O0();

    ArrayList P();

    void P0(C3232fq c3232fq);

    void Q(int i);

    C3464k7 Q0();

    String R();

    void R0(BinderC2626Ih binderC2626Ih);

    void S0(String str, InterfaceC3272gc interfaceC3272gc);

    void T0(int i);

    boolean U0();

    View V();

    void V0(InterfaceC3431jb interfaceC3431jb);

    C3887s W0();

    void X0(boolean z6);

    void Y0(St st, Ut ut);

    void Z0(String str, InterfaceC3272gc interfaceC3272gc);

    boolean a1();

    InterfaceC3431jb b1();

    void c1();

    boolean canGoBack();

    Context d0();

    void destroy();

    void e1();

    void f1(A3.r rVar);

    BinderC2626Ih g();

    C3236fu g0();

    void g1(boolean z6);

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    C2677Lh h0();

    void i0(boolean z6, int i, String str, String str2, boolean z9);

    void i1(BinderC5100d binderC5100d);

    boolean isAttachedToWindow();

    Activity j();

    A3.r j0();

    void j1(ViewTreeObserverOnGlobalLayoutListenerC3497kn viewTreeObserverOnGlobalLayoutListenerC3497kn);

    C4797a k();

    void k0();

    boolean k1();

    void l();

    void l0(int i);

    void l1(boolean z6);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    S0.l m();

    void m0(String str, String str2);

    void m1(BinderC5100d binderC5100d);

    boolean n0();

    boolean n1();

    int o0();

    void onPause();

    void onResume();

    String p();

    I8 p0();

    WebView q();

    void q0(I8 i82);

    int r();

    void r0(String str, Qx qx);

    void s0(String str, AbstractC2862Wg abstractC2862Wg);

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void u();

    P3.a u0();

    void v0(C5101e c5101e, boolean z6, boolean z9, String str);

    void w0(boolean z6);

    void x0(int i, boolean z6);

    BinderC5100d y0();

    Ut z0();
}
