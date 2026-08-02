package com.knotapi.knot.webview.merchants;

import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import java.util.List;

/* loaded from: classes4.dex */
public class LowesClient extends KnotViewClient {
    private String cookieValue;
    private String defaultCookieValue;

    public LowesClient(KnotView knotView) {
        super(knotView);
        this.cookieValue = "";
        this.defaultCookieValue = "";
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        Cookie buildCookie = super.buildCookie(str, str2);
        if (buildCookie.getName().equals("_abck")) {
            if (buildCookie.getValue().contains("~0~") && (str2.equals(this.bot.getLoggedInUrl()) || str2.equals(this.bot.getPaymentUrl()))) {
                this.cookieValue = buildCookie.getValue();
                return buildCookie;
            }
            this.defaultCookieValue = buildCookie.getValue();
            buildCookie.setValue("");
        }
        return buildCookie;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(String str, String str2) {
        updateCookieValue();
    }

    public void updateCookieValue() {
        List<Cookie> cookies = this.knotView.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("_abck")) {
                if (this.cookieValue.isEmpty()) {
                    cookie.setValue(this.defaultCookieValue);
                } else {
                    cookie.setValue(this.cookieValue);
                }
            }
        }
        this.knotView.setCookies(cookies);
        this.knotView.getMerchantViewListener().sendRunningEvent("{}", "{}");
    }
}
