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
public final class C3860rw extends AbstractC3645nw {

    /* renamed from: e, reason: collision with root package name */
    public WebView f33774e;

    /* renamed from: f, reason: collision with root package name */
    public Long f33775f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f33776g;

    public C3860rw(String str, Map map) {
        super(str);
        this.f33775f = null;
        this.f33776g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3645nw
    public final void a() {
        WebView webView = new WebView(C3429jw.f31350b.f31351a);
        this.f33774e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f33774e.getSettings().setAllowContentAccess(false);
        this.f33774e.getSettings().setAllowFileAccess(false);
        this.f33774e.setWebViewClient(new C3753pw(this));
        this.f32809b = new Aw(this.f33774e);
        V2.E(this.f33774e, null);
        Map map = this.f33776g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f33775f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3645nw
    public final void b() {
        super.b();
        new Handler().postDelayed(new RunnableC3807qw(this), Math.max(4000 - (this.f33775f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f33775f.longValue(), TimeUnit.NANOSECONDS)), com.anythink.basead.exoplayer.i.a.f7883f));
        this.f33774e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3645nw
    public final void d(Uv uv, C3 c32) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) c32.f24023w);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(uv, c32, jSONObject);
    }
}
