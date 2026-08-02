package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.models.ErrorView;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class HeadSpaceClient extends KnotViewClient {
    public static final String TAG = "Knot:HeadSpaceClient";

    public HeadSpaceClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public ErrorView getErrorView() {
        ErrorView errorView = super.getErrorView();
        errorView.setTitle("Account not found");
        errorView.setContent("Your account not found on HeadSpace with this login detail.");
        return errorView;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.contains("missing-profile-fields")) {
            showErrorPage(getErrorView());
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(String str, String str2) {
        try {
            String optString = new JSONObject(str2).optString("branch_session");
            String optString2 = !optString.isEmpty() ? new JSONObject(optString).optString("identity") : "";
            if (str2.contains("branch_session") && new JSONObject(str2).optString("mprtcl-v4_B0C8D5EC-events").equals("") && !optString2.equals("null") && !optString2.isEmpty()) {
                KnotView knotView = this.knotView;
                if (knotView.isUserLoggedIn(knotView.getUrl())) {
                    updateCookieDomain();
                    this.knotView.getMerchantViewListener().sendRunningEvent(str, str2);
                    return;
                }
            }
            this.knotView.getStorageDetails();
        } catch (JSONException | Exception unused) {
        }
    }

    public void updateCookieDomain() {
        List<Cookie> cookies = this.knotView.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("countryCode") || cookie.getName().equals("countryCodeLookupStatus") || cookie.getName().equals("lang") || cookie.getName().equals("OptanonConsent") || cookie.getName().equals("OptanonAlertBoxClosed") || cookie.getName().equals("hsngjwt") || cookie.getName().equals("AWSALBCORS")) {
                cookie.setSecure(true);
            }
        }
        this.knotView.setCookies(cookies);
    }
}
