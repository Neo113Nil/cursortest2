package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2960am implements InterfaceC4033uk, InterfaceC4142wl {

    /* renamed from: n, reason: collision with root package name */
    public final C2607Hf f29892n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f29893u;

    /* renamed from: v, reason: collision with root package name */
    public final C2641Jf f29894v;

    /* renamed from: w, reason: collision with root package name */
    public final WebView f29895w;

    /* renamed from: x, reason: collision with root package name */
    public String f29896x;

    /* renamed from: y, reason: collision with root package name */
    public final EnumC3144e9 f29897y;

    /* renamed from: z, reason: collision with root package name */
    public final St f29898z;

    public C2960am(C2607Hf c2607Hf, Context context, C2641Jf c2641Jf, WebView webView, EnumC3144e9 enumC3144e9, St st) {
        this.f29892n = c2607Hf;
        this.f29893u = context;
        this.f29894v = c2641Jf;
        this.f29895w = webView;
        this.f29897y = enumC3144e9;
        this.f29898z = st;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void B() {
        if (this.f29898z.f28369G0) {
            WebView webView = this.f29895w;
            if (webView != null && this.f29896x != null) {
                Context context = webView.getContext();
                String str = this.f29896x;
                C2641Jf c2641Jf = this.f29894v;
                if (c2641Jf.a(context) && (context instanceof Activity)) {
                    AtomicReference atomicReference = c2641Jf.f26467h;
                    if (c2641Jf.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                        ConcurrentHashMap concurrentHashMap = c2641Jf.i;
                        Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                        if (method == null) {
                            try {
                                method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                                concurrentHashMap.put("setCurrentScreen", method);
                            } catch (Exception unused) {
                                c2641Jf.l("setCurrentScreen", false);
                                method = null;
                            }
                        }
                        try {
                            method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                        } catch (Exception unused2) {
                            c2641Jf.l("setCurrentScreen", false);
                        }
                    }
                }
            }
            this.f29892n.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4142wl
    public final void g() {
        EnumC3144e9 enumC3144e9 = EnumC3144e9.APP_OPEN;
        EnumC3144e9 enumC3144e92 = this.f29897y;
        if (enumC3144e92 != enumC3144e9 && this.f29898z.f28369G0) {
            C2641Jf c2641Jf = this.f29894v;
            Context context = this.f29893u;
            String str = "";
            if (c2641Jf.a(context)) {
                AtomicReference atomicReference = c2641Jf.f26466g;
                if (c2641Jf.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) c2641Jf.i(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                        if (str2 == null) {
                            str2 = (String) c2641Jf.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        c2641Jf.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f29896x = str;
            this.f29896x = String.valueOf(str).concat(enumC3144e92 == EnumC3144e9.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4142wl
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void t(BinderC2844Ve binderC2844Ve, String str, String str2) {
        Context context = this.f29893u;
        C2641Jf c2641Jf = this.f29894v;
        if (c2641Jf.a(context) && this.f29898z.f28369G0) {
            try {
                c2641Jf.e(context, c2641Jf.d(context), this.f29892n.f26090v, binderC2844Ve.f29011n, binderC2844Ve.f29012u);
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.g("Remote Exception to get reward item.", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033uk
    public final void z() {
        if (this.f29898z.f28369G0) {
            this.f29892n.a(false);
        }
    }
}
