package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class QuickBookClient extends KnotViewClient {
    public QuickBookClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        Cookie buildCookie = super.buildCookie(str, str2);
        if (!buildCookie.getName().equals("hosted-shell") && !buildCookie.getName().equals("qbo.clientType")) {
            return buildCookie;
        }
        buildCookie.setDomain("app.qbo.intuit.com");
        return buildCookie;
    }
}
