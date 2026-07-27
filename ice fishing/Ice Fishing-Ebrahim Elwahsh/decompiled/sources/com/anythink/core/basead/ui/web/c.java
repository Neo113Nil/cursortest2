package com.anythink.core.basead.ui.web;

import android.webkit.WebView;
import com.anythink.core.common.h.w;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    w f12153a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f12154b;

    /* renamed from: c, reason: collision with root package name */
    HashMap<String, Boolean> f12155c = new HashMap<>(3);

    public c(w wVar) {
        JSONObject jSONObject;
        this.f12153a = wVar;
        if (wVar != null) {
            try {
                jSONObject = new JSONObject(wVar.U());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.f12154b = jSONObject;
    }

    public final void a(WebView webView, String str) {
        JSONObject jSONObject = this.f12154b;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && str != null && str.contains(next) && this.f12155c.get(next) == null) {
                    this.f12155c.put(next, Boolean.TRUE);
                    webView.loadUrl(this.f12154b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
