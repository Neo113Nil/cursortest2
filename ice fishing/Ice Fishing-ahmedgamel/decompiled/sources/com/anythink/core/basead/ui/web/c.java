package com.anythink.core.basead.ui.web;

import android.webkit.WebView;
import com.anythink.core.common.h.w;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    w f12782a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f12783b;

    /* renamed from: c, reason: collision with root package name */
    HashMap<String, Boolean> f12784c = new HashMap<>(3);

    public c(w wVar) {
        JSONObject jSONObject;
        this.f12782a = wVar;
        if (wVar != null) {
            try {
                jSONObject = new JSONObject(wVar.U());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.f12783b = jSONObject;
    }

    public final void a(WebView webView, String str) {
        JSONObject jSONObject = this.f12783b;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && str != null && str.contains(next) && this.f12784c.get(next) == null) {
                    this.f12784c.put(next, Boolean.TRUE);
                    webView.loadUrl(this.f12783b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
