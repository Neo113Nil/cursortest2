package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: com.google.android.gms.internal.ads.aw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2955aw {

    /* renamed from: a, reason: collision with root package name */
    public final C3582ma f29350a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f29351b;

    /* renamed from: c, reason: collision with root package name */
    public final Bw f29352c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f29353d;

    /* renamed from: e, reason: collision with root package name */
    public final C3496kw f29354e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2955aw(C3582ma c3582ma, WebView webView) {
        HashMap hashMap = new HashMap();
        this.f29353d = hashMap;
        this.f29354e = new C3496kw();
        if (!AbstractC2655Lg.f26175K.f26640u) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f29350a = c3582ma;
        this.f29351b = webView;
        Bw bw = this.f29352c;
        if ((bw == null ? null : (View) bw.get()) != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Wv) it.next()).b(webView);
            }
            this.f29352c = new Bw(webView);
        }
        if (!com.bumptech.glide.h.s("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        int i = H0.e.f1207a;
        if (!I0.m.f1238d.b()) {
            throw I0.m.a();
        }
        ((WebViewProviderBoundaryInterface) H0.e.c(this.f29351b).f37858u).removeWebMessageListener("omidJsSessionService");
        H0.e.a(this.f29351b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C2478Aq(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        Xv xv = Xv.DEFINED_BY_JAVASCRIPT;
        Zv zv = Zv.DEFINED_BY_JAVASCRIPT;
        EnumC3010bw enumC3010bw = EnumC3010bw.JAVASCRIPT;
        Wv wv = new Wv(Zw.a(xv, zv, enumC3010bw, enumC3010bw, false), new A3(this.f29350a, this.f29351b, null, null, Vv.HTML), str);
        this.f29353d.put(str, wv);
        Bw bw = this.f29352c;
        wv.b(bw == null ? null : (View) bw.get());
        Iterator it = this.f29354e.f32487a.iterator();
        while (it.hasNext()) {
            C3442jw c3442jw = (C3442jw) it.next();
            View view = (View) c3442jw.f32218a.get();
            if (!wv.f28531f) {
                wv.f28527b.a(view, c3442jw.f32220c);
            }
        }
        wv.a();
    }
}
