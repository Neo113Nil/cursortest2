package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class SteamClient extends KnotViewClient {
    public SteamClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        Cookie buildCookie = super.buildCookie(str, str2);
        String str3 = str2.contains("checkout") ? ".checkout.steampowered.com" : str2.contains("store") ? ".store.steampowered.com" : ".help.steampowered.com";
        if (buildCookie.getName().equals("steamLoginSecure")) {
            buildCookie.setDomain(str3);
            buildCookie.setSecure(true);
        }
        return buildCookie;
    }
}
