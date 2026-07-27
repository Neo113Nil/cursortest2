package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3927sw extends AbstractC3712ow {

    /* renamed from: e, reason: collision with root package name */
    public WebView f34327e;

    /* renamed from: f, reason: collision with root package name */
    public Long f34328f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f34329g;

    public C3927sw(String str, Map map) {
        super(str);
        this.f34328f = null;
        this.f34329g = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3712ow
    public final void a() {
        WebView webView = new WebView(C3550lw.f32621b.f32622a);
        this.f34327e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f34327e.getSettings().setAllowContentAccess(false);
        this.f34327e.getSettings().setAllowFileAccess(false);
        this.f34327e.setWebViewClient(new C3820qw(this));
        this.f33235b = new Bw(this.f34327e);
        T2.D(this.f34327e, null);
        Map map = this.f34329g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f34328f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3712ow
    public final void b() {
        super.b();
        new Handler().postDelayed(new RunnableC3873rw(this), Math.max(4000 - (this.f34328f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f34328f.longValue(), TimeUnit.NANOSECONDS)), com.anythink.basead.exoplayer.i.a.f8040f));
        this.f34327e = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3712ow
    public final void d(Wv wv, A3 a32) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) a32.f23810w);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(wv, a32, jSONObject);
    }
}
