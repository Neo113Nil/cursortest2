package com.knotapi.knot.webview.merchants;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.utilities.WebViewCookieCollector;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class GoogleMassSwitcherClient extends KnotViewClient {
    public GoogleMassSwitcherClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        try {
            Cookie buildCookie = super.buildCookie(str, str2);
            JSONObject cookieData = getCookieData(new JSONArray(this.bot.getAllSettings().get("cookies").toString()), buildCookie.getName());
            if (cookieData != null) {
                buildCookie.setDomain(cookieData.getString("domain"));
                return buildCookie;
            }
            buildCookie.setDomain(str2.split("/")[2]);
            return buildCookie;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject getCookieData(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getString("name").contains(str)) {
                    return jSONObject;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public List<Cookie> getCookies() {
        WebViewCookieCollector webViewCookieCollector = new WebViewCookieCollector(new MaterialButton$$ExternalSyntheticLambda3(this, 11));
        KnotView knotView = this.knotView;
        return webViewCookieCollector.getAllCookiesAsList(knotView, knotView.getUrl());
    }

    public JSONArray getGooglePasswordManagerUrl() {
        try {
            return new JSONArray(this.bot.getAllSettings().get("googlePasswordManagerUrl").toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public String getGooglePasswordManagerUserAgent() {
        try {
            return this.bot.getAllSettings().get("googlePasswordManagerUserAgent").getAsString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public boolean isUserLoggedIn(String str) {
        this.knotView.setCookies(getCookies());
        return super.isUserLoggedIn(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r4.knotView.getSettings().setUserAgentString(getGooglePasswordManagerUserAgent());
     */
    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            JSONArray googlePasswordManagerUrl = getGooglePasswordManagerUrl();
            if (googlePasswordManagerUrl != null) {
                int i = 0;
                while (true) {
                    if (i >= googlePasswordManagerUrl.length()) {
                        break;
                    }
                    String string2 = googlePasswordManagerUrl.getString(i);
                    String url = webView.getUrl();
                    Objects.requireNonNull(url);
                    if (url.contains(string2)) {
                        break;
                    }
                    i++;
                }
            }
        } catch (JSONException unused) {
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
