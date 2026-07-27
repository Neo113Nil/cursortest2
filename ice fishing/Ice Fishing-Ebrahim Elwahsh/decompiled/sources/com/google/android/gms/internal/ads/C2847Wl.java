package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Wl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2847Wl implements InterfaceC3915sk, InterfaceC4024ul {

    /* renamed from: n, reason: collision with root package name */
    public final C2535Ef f28454n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f28455u;

    /* renamed from: v, reason: collision with root package name */
    public final C2569Gf f28456v;

    /* renamed from: w, reason: collision with root package name */
    public final WebView f28457w;

    /* renamed from: x, reason: collision with root package name */
    public String f28458x;

    /* renamed from: y, reason: collision with root package name */
    public final EnumC2969b9 f28459y;

    /* renamed from: z, reason: collision with root package name */
    public final Ut f28460z;

    public C2847Wl(C2535Ef c2535Ef, Context context, C2569Gf c2569Gf, WebView webView, EnumC2969b9 enumC2969b9, Ut ut) {
        this.f28454n = c2535Ef;
        this.f28455u = context;
        this.f28456v = c2569Gf;
        this.f28457w = webView;
        this.f28459y = enumC2969b9;
        this.f28460z = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
        if (this.f28460z.f28119G0) {
            this.f28454n.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
        if (this.f28460z.f28119G0) {
            WebView webView = this.f28457w;
            if (webView != null && this.f28458x != null) {
                Context context = webView.getContext();
                String str = this.f28458x;
                C2569Gf c2569Gf = this.f28456v;
                if (c2569Gf.a(context) && (context instanceof Activity)) {
                    AtomicReference atomicReference = c2569Gf.f25187h;
                    if (c2569Gf.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                        ConcurrentHashMap concurrentHashMap = c2569Gf.i;
                        Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                        if (method == null) {
                            try {
                                method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                                concurrentHashMap.put("setCurrentScreen", method);
                            } catch (Exception unused) {
                                c2569Gf.l("setCurrentScreen", false);
                                method = null;
                            }
                        }
                        try {
                            method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                        } catch (Exception unused2) {
                            c2569Gf.l("setCurrentScreen", false);
                        }
                    }
                }
            }
            this.f28454n.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024ul
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024ul
    public final void g() {
        EnumC2969b9 enumC2969b9 = EnumC2969b9.APP_OPEN;
        EnumC2969b9 enumC2969b92 = this.f28459y;
        if (enumC2969b92 != enumC2969b9 && this.f28460z.f28119G0) {
            C2569Gf c2569Gf = this.f28456v;
            Context context = this.f28455u;
            String str = "";
            if (c2569Gf.a(context)) {
                AtomicReference atomicReference = c2569Gf.f25186g;
                if (c2569Gf.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) c2569Gf.i(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                        if (str2 == null) {
                            str2 = (String) c2569Gf.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        c2569Gf.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f28458x = str;
            this.f28458x = String.valueOf(str).concat(enumC2969b92 == EnumC2969b9.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
        Context context = this.f28455u;
        C2569Gf c2569Gf = this.f28456v;
        if (c2569Gf.a(context) && this.f28460z.f28119G0) {
            try {
                c2569Gf.e(context, c2569Gf.d(context), this.f28454n.f24779v, binderC2772Se.f27578n, binderC2772Se.f27579u);
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.g("Remote Exception to get reward item.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
    }
}
