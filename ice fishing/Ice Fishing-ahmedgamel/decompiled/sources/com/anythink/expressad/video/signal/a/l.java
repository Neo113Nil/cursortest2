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
    private static final String f22613n = "onVideoStatusNotify";

    /* renamed from: o, reason: collision with root package name */
    private static final String f22614o = "onJSClick";

    /* renamed from: p, reason: collision with root package name */
    private static final String f22615p = "onVideoProgressNotify";

    /* renamed from: q, reason: collision with root package name */
    private static final String f22616q = "webviewshow";

    /* renamed from: r, reason: collision with root package name */
    private static final String f22617r = "showDataInfo";

    /* renamed from: s, reason: collision with root package name */
    private static final String f22618s = "portrait";

    /* renamed from: t, reason: collision with root package name */
    private static final String f22619t = "landscape";

    /* renamed from: u, reason: collision with root package name */
    private WebView f22620u;

    public l(WebView webView) {
        this.f22620u = webView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a() {
        super.a();
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        com.anythink.core.express.d.a.a(this.f22620u);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i) {
        super.a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f22620u, f22613n, encodeToString);
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
            com.anythink.core.express.d.a.a(this.f22620u, f22614o, encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(AnythinkVideoView.a aVar) {
        super.a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.a.f13735C, a(aVar.f22482a, aVar.f22483b));
            jSONObject.put("time", String.valueOf(aVar.f22482a));
            jSONObject.put("duration", String.valueOf(aVar.f22483b));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f22620u, f22615p, encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static String a(int i, int i4) {
        if (i4 != 0) {
            double d9 = i / i4;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.a(Double.valueOf(d9)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i4);
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
        com.anythink.core.express.d.a.a(this.f22620u, f22616q, str);
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i, int i4, int i6, int i9) {
        super.a(i, i4, i6, i9);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = f22619t;
            if (i != 2 ? i4 != 2 : i4 == 1) {
                str = f22618s;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i6);
            jSONObject2.put("screen_height", i9);
            jSONObject.put("data", jSONObject2);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a(this.f22620u, f22617r, encodeToString);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }
}
