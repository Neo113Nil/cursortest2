package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3883rw extends AbstractC3722ow {

    /* renamed from: e, reason: collision with root package name */
    public WebView f34542e;

    /* renamed from: f, reason: collision with root package name */
    public Long f34543f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f34544g;

    public C3883rw(String str, Map map) {
        super(str);
        this.f34543f = null;
        this.f34544g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3722ow
    public final void a() {
        WebView webView = new WebView(C3506kw.f32448b.f32449a);
        this.f34542e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f34542e.getSettings().setAllowContentAccess(false);
        this.f34542e.getSettings().setAllowFileAccess(false);
        this.f34542e.setWebViewClient(new com.IceFishing.LiveIceFishing.t(this));
        this.f33766b = new Aw(this.f34542e);
        V2.E(this.f34542e, null);
        Map map = this.f34544g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f34543f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3722ow
    public final void b() {
        super.b();
        new Handler().postDelayed(new RunnableC3830qw(this), Math.max(4000 - (this.f34543f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f34543f.longValue(), TimeUnit.NANOSECONDS)), com.anythink.basead.exoplayer.i.a.f8669f));
        this.f34542e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3722ow
    public final void d(Uv uv, C3 c32) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) c32.f24786w);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(uv, c32, jSONObject);
    }
}
