package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f22588g = "orientation";

    /* renamed from: h, reason: collision with root package name */
    private static final String f22589h = "onSystemPause";
    private static final String i = "onSystemResume";

    /* renamed from: j, reason: collision with root package name */
    private static final String f22590j = "onSystemDestory";

    /* renamed from: k, reason: collision with root package name */
    private static final String f22591k = "onSystemBackPressed";

    /* renamed from: l, reason: collision with root package name */
    private static final String f22592l = "portrait";

    /* renamed from: m, reason: collision with root package name */
    private static final String f22593m = "landscape";

    /* renamed from: n, reason: collision with root package name */
    private WebView f22594n;

    /* renamed from: o, reason: collision with root package name */
    private int f22595o = 0;

    public h(WebView webView) {
        this.f22594n = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a() {
        super.a();
        this.f22595o = 1;
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f22594n, "onSystemPause", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void b() {
        super.b();
        this.f22595o = 0;
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f22594n, "onSystemResume", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void c() {
        super.c();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f22594n, "onSystemDestory", "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void g() {
        super.g();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f22594n, f22591k, "");
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final int h() {
        return this.f22595o;
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", f22593m);
            } else {
                jSONObject.put("orientation", f22592l);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f22594n, "orientation", encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.a, com.anythink.expressad.video.signal.a
    public final void a(int i4) {
        super.a(i4);
        this.f22595o = i4;
    }
}
