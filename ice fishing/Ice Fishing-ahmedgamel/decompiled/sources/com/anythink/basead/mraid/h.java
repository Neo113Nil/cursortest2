package com.anythink.basead.mraid;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f9639a = "MraidJSBridge";

    /* renamed from: d, reason: collision with root package name */
    public static int f9640d = 1500;

    /* renamed from: b, reason: collision with root package name */
    protected Context f9641b;

    /* renamed from: c, reason: collision with root package name */
    protected MraidBaseWebView f9642c;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.core.express.b.b f9643e;

    private void d(String str) {
        String str2;
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f9642c, "setOrientationProperties");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.f9643e == null) {
                return;
            }
            optString.toLowerCase().equals("true");
            String lowerCase = optString2.toLowerCase();
            int hashCode = lowerCase.hashCode();
            if (hashCode == 729267099) {
                str2 = "portrait";
            } else if (hashCode != 1430647483) {
                return;
            } else {
                str2 = "landscape";
            }
            lowerCase.equals(str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, MraidBaseWebView mraidBaseWebView) {
        this.f9641b = context;
        this.f9642c = mraidBaseWebView;
        try {
            if (context instanceof com.anythink.core.express.b.b) {
                this.f9643e = (com.anythink.core.express.b.b) context;
                return;
            }
            if (mraidBaseWebView.getObject() != null && (mraidBaseWebView.getObject() instanceof com.anythink.core.express.b.b)) {
                this.f9643e = (com.anythink.core.express.b.b) mraidBaseWebView.getObject();
            }
            if (mraidBaseWebView.getMraidObject() == null || !(mraidBaseWebView.getMraidObject() instanceof com.anythink.core.express.b.b)) {
                return;
            }
            this.f9643e = (com.anythink.core.express.b.b) mraidBaseWebView.getMraidObject();
        } catch (Exception unused) {
        }
    }

    public final void b() {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f9642c, "unload");
        try {
            com.anythink.core.express.b.b bVar = this.f9643e;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable unused) {
        }
    }

    public final void c(String str) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f9642c, "expand");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.f9643e == null) {
                return;
            }
            this.f9643e.expand(optString, optString2.toLowerCase().equals("true"));
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f9642c, "useCustomClose");
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(optString) || this.f9643e == null) {
                return;
            }
            this.f9643e.useCustomClose(optString.toLowerCase().equals("true"));
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        MraidBaseWebView mraidBaseWebView = this.f9642c;
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(mraidBaseWebView, "open");
        try {
            String optString = new JSONObject(str).optString("url");
            if (this.f9643e == null || TextUtils.isEmpty(optString)) {
                return;
            }
            this.f9643e.open(optString);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f9642c, com.anythink.expressad.foundation.d.d.cs);
        try {
            com.anythink.core.express.b.b bVar = this.f9643e;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable unused) {
        }
    }
}
