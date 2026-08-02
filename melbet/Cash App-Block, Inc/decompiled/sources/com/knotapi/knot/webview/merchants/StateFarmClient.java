package com.knotapi.knot.webview.merchants;

import com.google.gson.JsonElement;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class StateFarmClient extends KnotViewClient {
    private int MAX_RETRIES;
    private List<Cookie> cookies;
    private int foundCookieCount;
    private List<String> requiredCookieNames;
    private int retryCount;

    public StateFarmClient(KnotView knotView) {
        super(knotView);
        this.MAX_RETRIES = 3;
        this.cookies = new ArrayList();
        this.retryCount = 0;
        this.foundCookieCount = 0;
    }

    private List<String> getCookieNames() {
        ArrayList arrayList = new ArrayList();
        JsonElement jsonElement = this.bot.getAllSettings().get("cookieName");
        if (jsonElement != null && jsonElement.isJsonArray()) {
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("sf-cauth1");
        }
        return arrayList;
    }

    private void startFetchingCookie(String str, String str2) {
        JsonElement jsonElement = this.bot.getAllSettings().get("cookieFetchUrl");
        String asString = (jsonElement == null || jsonElement.getAsString().isEmpty()) ? "https://apps.statefarm.com" : jsonElement.getAsString();
        this.foundCookieCount = 0;
        for (int i = 0; i < this.requiredCookieNames.size(); i++) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 >= this.MAX_RETRIES || z) {
                    break;
                }
                this.cookies.addAll(getCookies(asString));
                z = isCookiePresent(this.cookies, this.requiredCookieNames.get(i), true);
                if (z) {
                    this.foundCookieCount++;
                    break;
                }
                i2++;
            }
            if (!z) {
                break;
            }
        }
        if (this.foundCookieCount >= this.requiredCookieNames.size()) {
            this.knotView.getViewClient().onStorageDetails(str, str2);
            return;
        }
        int i3 = this.retryCount + 1;
        this.retryCount = i3;
        if (i3 < this.MAX_RETRIES) {
            startFetchingCookie(str, str2);
        } else {
            this.knotView.getViewClient().onStorageDetails(str, str2);
        }
    }

    public boolean isCookiePresent(List<Cookie> list, String str, boolean z) {
        for (Cookie cookie : list) {
            if (cookie.getName().equals(str)) {
                if (!z) {
                    return true;
                }
                this.knotView.getCookies().add(cookie);
                return true;
            }
        }
        return false;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(String str, String str2) {
        List<String> cookieNames = getCookieNames();
        this.requiredCookieNames = cookieNames;
        this.foundCookieCount = 0;
        Iterator<String> it = cookieNames.iterator();
        while (it.hasNext()) {
            if (isCookiePresent(this.knotView.getCookies(), it.next(), false)) {
                this.foundCookieCount++;
            }
        }
        if (this.foundCookieCount == this.requiredCookieNames.size() || this.retryCount >= this.MAX_RETRIES) {
            super.onStorageDetails(str, str2);
        } else {
            startFetchingCookie(str, str2);
        }
    }
}
