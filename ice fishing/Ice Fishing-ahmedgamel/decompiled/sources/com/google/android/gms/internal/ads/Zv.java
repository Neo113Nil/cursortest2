package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes2.dex */
public final class Zv {

    /* renamed from: a, reason: collision with root package name */
    public final C3754pa f29745a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f29746b;

    /* renamed from: c, reason: collision with root package name */
    public final Aw f29747c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f29748d;

    /* renamed from: e, reason: collision with root package name */
    public final C3452jw f29749e;

    /* JADX WARN: Multi-variable type inference failed */
    public Zv(C3754pa c3754pa, WebView webView) {
        HashMap hashMap = new HashMap();
        this.f29748d = hashMap;
        this.f29749e = new C3452jw();
        if (!MA.f27044E.f27915u) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f29745a = c3754pa;
        this.f29746b = webView;
        Aw aw = this.f29747c;
        if ((aw == null ? null : (View) aw.get()) != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Uv) it.next()).b(webView);
            }
            this.f29747c = new Aw(webView);
        }
        if (!com.bumptech.glide.f.m("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        int i = H0.e.f1187a;
        if (!I0.m.f1296d.b()) {
            throw I0.m.a();
        }
        ((WebViewProviderBoundaryInterface) H0.e.c(this.f29746b).f1291u).removeWebMessageListener("omidJsSessionService");
        H0.e.a(this.f29746b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C4201xq(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        Vv vv = Vv.DEFINED_BY_JAVASCRIPT;
        Yv yv = Yv.DEFINED_BY_JAVASCRIPT;
        EnumC2970aw enumC2970aw = EnumC2970aw.JAVASCRIPT;
        Uv uv = new Uv(Xw.c(vv, yv, enumC2970aw, enumC2970aw, false), new C3(this.f29745a, this.f29746b, null, null, Tv.HTML), str);
        this.f29748d.put(str, uv);
        Aw aw = this.f29747c;
        uv.b(aw == null ? null : (View) aw.get());
        Iterator it = this.f29749e.f32130a.iterator();
        while (it.hasNext()) {
            C3398iw c3398iw = (C3398iw) it.next();
            View view = (View) c3398iw.f31920a.get();
            if (!uv.f28838f) {
                uv.f28834b.a(view, c3398iw.f31922c);
            }
        }
        uv.a();
    }
}
