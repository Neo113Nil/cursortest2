package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Zl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2892Zl implements InterfaceC4010uk, InterfaceC4065vl {

    /* renamed from: n, reason: collision with root package name */
    public final C2587Hf f28946n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f28947u;

    /* renamed from: v, reason: collision with root package name */
    public final C2621Jf f28948v;

    /* renamed from: w, reason: collision with root package name */
    public final WebView f28949w;

    /* renamed from: x, reason: collision with root package name */
    public String f28950x;

    /* renamed from: y, reason: collision with root package name */
    public final EnumC3121e9 f28951y;

    /* renamed from: z, reason: collision with root package name */
    public final St f28952z;

    public C2892Zl(C2587Hf c2587Hf, Context context, C2621Jf c2621Jf, WebView webView, EnumC3121e9 enumC3121e9, St st) {
        this.f28946n = c2587Hf;
        this.f28947u = context;
        this.f28948v = c2621Jf;
        this.f28949w = webView;
        this.f28951y = enumC3121e9;
        this.f28952z = st;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void A() {
        if (this.f28952z.f27586G0) {
            this.f28946n.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void D() {
        if (this.f28952z.f27586G0) {
            WebView webView = this.f28949w;
            if (webView != null && this.f28950x != null) {
                Context context = webView.getContext();
                String str = this.f28950x;
                C2621Jf c2621Jf = this.f28948v;
                if (c2621Jf.a(context) && (context instanceof Activity)) {
                    AtomicReference atomicReference = c2621Jf.f25713h;
                    if (c2621Jf.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                        ConcurrentHashMap concurrentHashMap = c2621Jf.i;
                        Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                        if (method == null) {
                            try {
                                method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                                concurrentHashMap.put("setCurrentScreen", method);
                            } catch (Exception unused) {
                                c2621Jf.l("setCurrentScreen", false);
                                method = null;
                            }
                        }
                        try {
                            method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                        } catch (Exception unused2) {
                            c2621Jf.l("setCurrentScreen", false);
                        }
                    }
                }
            }
            this.f28946n.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4065vl
    public final void g() {
        EnumC3121e9 enumC3121e9 = EnumC3121e9.APP_OPEN;
        EnumC3121e9 enumC3121e92 = this.f28951y;
        if (enumC3121e92 != enumC3121e9 && this.f28952z.f27586G0) {
            C2621Jf c2621Jf = this.f28948v;
            Context context = this.f28947u;
            String str = "";
            if (c2621Jf.a(context)) {
                AtomicReference atomicReference = c2621Jf.f25712g;
                if (c2621Jf.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) c2621Jf.i(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                        if (str2 == null) {
                            str2 = (String) c2621Jf.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        c2621Jf.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f28950x = str;
            this.f28950x = String.valueOf(str).concat(enumC3121e92 == EnumC3121e9.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4065vl
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void t(BinderC2821Ve binderC2821Ve, String str, String str2) {
        Context context = this.f28947u;
        C2621Jf c2621Jf = this.f28948v;
        if (c2621Jf.a(context) && this.f28952z.f27586G0) {
            try {
                c2621Jf.e(context, c2621Jf.d(context), this.f28946n.f25337v, binderC2821Ve.f28214n, binderC2821Ve.f28215u);
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.g("Remote Exception to get reward item.", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4010uk
    public final void z() {
    }
}
