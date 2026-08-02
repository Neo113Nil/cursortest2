package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class GithubClient extends KnotViewClient {
    public GithubClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        Cookie buildCookie = super.buildCookie(str, str2);
        buildCookie.setSecure(true);
        return buildCookie;
    }
}
