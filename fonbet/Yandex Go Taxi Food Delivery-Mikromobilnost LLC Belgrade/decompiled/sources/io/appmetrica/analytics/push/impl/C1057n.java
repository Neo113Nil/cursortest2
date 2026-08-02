package io.appmetrica.analytics.push.impl;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1057n extends C1039i {
    public final String b;

    public C1057n(String str) {
        super(3);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.push.impl.C1039i
    public final JSONObject a() {
        return super.a().put(LaunchBrowserActivity.KEY_URI, this.b);
    }
}
