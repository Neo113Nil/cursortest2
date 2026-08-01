package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes2.dex */
public final class Yv {

    /* renamed from: a, reason: collision with root package name */
    public final C3731pa f28755a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f28756b;

    /* renamed from: c, reason: collision with root package name */
    public final Aw f28757c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f28758d;

    /* renamed from: e, reason: collision with root package name */
    public final C3375iw f28759e;

    /* JADX WARN: Multi-variable type inference failed */
    public Yv(C3731pa c3731pa, WebView webView) {
        HashMap hashMap = new HashMap();
        this.f28758d = hashMap;
        this.f28759e = new C3375iw();
        if (!MA.f26253E.f27159u) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f28755a = c3731pa;
        this.f28756b = webView;
        Aw aw = this.f28757c;
        if ((aw == null ? null : (View) aw.get()) != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Uv) it.next()).b(webView);
            }
            this.f28757c = new Aw(webView);
        }
        if (!com.bumptech.glide.f.o("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        int i = H0.e.f1084a;
        if (!I0.m.f1269d.b()) {
            throw I0.m.a();
        }
        ((WebViewProviderBoundaryInterface) H0.e.c(this.f28756b).f1264u).removeWebMessageListener("omidJsSessionService");
        H0.e.a(this.f28756b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C4178xq(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        Vv vv = Vv.DEFINED_BY_JAVASCRIPT;
        Xv xv = Xv.DEFINED_BY_JAVASCRIPT;
        Zv zv = Zv.JAVASCRIPT;
        Uv uv = new Uv(Xw.b(vv, xv, zv, zv, false), new C3(this.f28755a, this.f28756b, null, null, Tv.HTML), str);
        this.f28758d.put(str, uv);
        Aw aw = this.f28757c;
        uv.b(aw == null ? null : (View) aw.get());
        Iterator it = this.f28759e.f31136a.iterator();
        while (it.hasNext()) {
            C3323hw c3323hw = (C3323hw) it.next();
            View view = (View) c3323hw.f30970a.get();
            if (!uv.f28041f) {
                uv.f28037b.a(view, c3323hw.f30972c);
            }
        }
        uv.a();
    }
}
