package io.appmetrica.analytics.push.impl;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1047k extends C1039i {
    public final String b;
    public final String c;
    public final String d;

    public C1047k(String str, String str2, String str3) {
        super(4);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // io.appmetrica.analytics.push.impl.C1039i
    public final JSONObject a() {
        return super.a().put("id", this.b).put(LaunchBrowserActivity.KEY_URI, this.c).put("text", this.d);
    }
}
