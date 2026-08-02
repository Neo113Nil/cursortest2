package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.express.d.a;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.bt.a.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTLayout extends BTBaseView {

    /* renamed from: p, reason: collision with root package name */
    private static final String f21740p = "portrait";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21741q = "landscape";

    /* renamed from: r, reason: collision with root package name */
    private WebView f21742r;

    public AnythinkBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f21742r != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f21830n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                h.a();
                a.a(this.f21742r, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a(this.f21742r, "broadcast", getInstanceId());
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.f21742r;
        if (webView != null) {
            BTBaseView.a(webView, str, this.f21836d);
        }
    }

    public void onBackPressed() {
        if (this.f21742r != null) {
            c.a();
            c.a(this.f21742r, "onSystemBackPressed", this.f21836d);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f21742r != null) {
            try {
                d dVar = this.f21834b;
                if (dVar == null || !dVar.j()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", f21741q);
                    } else {
                        jSONObject.put("orientation", f21740p);
                    }
                    jSONObject.put("instanceId", this.f21836d);
                    String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                    h.a();
                    a.a(this.f21742r, "orientation", encodeToString);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.f21742r = webView;
    }

    public AnythinkBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
