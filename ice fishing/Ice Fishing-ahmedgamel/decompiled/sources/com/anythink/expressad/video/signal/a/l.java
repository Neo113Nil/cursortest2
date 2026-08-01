package com.anythink.expressad.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.e.g;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.AnythinkVideoView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21826n = "onVideoStatusNotify";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21827o = "onJSClick";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21828p = "onVideoProgressNotify";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21829q = "webviewshow";

    /* renamed from: r, reason: collision with root package name */
    private static final String f21830r = "showDataInfo";

    /* renamed from: s, reason: collision with root package name */
    private static final String f21831s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21832t = "landscape";

    /* renamed from: u, reason: collision with root package name */
    private WebView f21833u;

    public l(WebView webView) {
        this.f21833u = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a() {
        super.a();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21833u);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i) {
        super.a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21833u, f21826n, encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, String str) {
        super.a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21833u, f21827o, encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(AnythinkVideoView.a aVar) {
        super.a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.a.f12949C, a(aVar.f21695a, aVar.f21696b));
            jSONObject.put("time", String.valueOf(aVar.f21695a));
            jSONObject.put("duration", String.valueOf(aVar.f21696b));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21833u, f21828p, encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static String a(int i, int i6) {
        if (i6 != 0) {
            double d2 = i / i6;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.a(Double.valueOf(d2)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i6);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(Object obj) {
        String str;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            str = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            str = "";
        }
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f21833u, f21829q, str);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, int i6, int i9, int i10) {
        super.a(i, i6, i9, i10);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = f21832t;
            if (i != 2 ? i6 != 2 : i6 == 1) {
                str = f21831s;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i9);
            jSONObject2.put("screen_height", i10);
            jSONObject.put("data", jSONObject2);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f21833u, f21830r, encodeToString);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }
}
