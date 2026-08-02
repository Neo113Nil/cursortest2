package com.knotapi.knot.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.utilities.Helper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public class CustomEvent {
    private Bot bot;
    private String botId;
    private List<Cookie> cookies;
    private String localStorage;
    private String merchantId;
    private String sessionStorage;
    private boolean shouldStartBot;

    public CustomEvent(Bot bot) {
        this.bot = bot;
    }

    public String getBotId() {
        return this.botId;
    }

    public List<Cookie> getCookies() {
        return this.cookies;
    }

    public String getLocalStorage() {
        return this.localStorage;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getScript() {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m("merchantId: " + this.bot.getMerchantId(), ", botId: ");
        m108m.append(this.bot.getBotId());
        StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(m108m.toString(), ", shouldStartBot: ");
        m108m2.append(this.shouldStartBot);
        String sb = m108m2.toString();
        List<Cookie> list = this.cookies;
        if (list != null && list.size() > 0) {
            StringBuilder m108m3 = Recorder$$ExternalSyntheticOutline2.m108m(sb, ", cookies: ");
            m108m3.append(Helper.formatCookiesForPuppeteer(this.cookies));
            sb = m108m3.toString();
        }
        String str = this.localStorage;
        if (str != null && !str.isEmpty()) {
            StringBuilder m108m4 = Recorder$$ExternalSyntheticOutline2.m108m(sb, ", localStorage: ");
            m108m4.append(this.localStorage);
            sb = m108m4.toString();
        }
        String str2 = this.sessionStorage;
        if (str2 != null && !str2.isEmpty()) {
            StringBuilder m108m5 = Recorder$$ExternalSyntheticOutline2.m108m(sb, ", sessionStorage: ");
            m108m5.append(this.sessionStorage);
            sb = m108m5.toString();
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("(function() { window.dispatchEvent(   new CustomEvent(       \"mobileBotRun\", {        bubbles: true,        detail: { ", sb, "       }    }));})();");
    }

    public String getSessionStorage() {
        return this.sessionStorage;
    }

    public boolean isShouldStartBot() {
        return this.shouldStartBot;
    }

    public void setBotId(String str) {
        this.botId = str;
    }

    public void setCookies(List<Cookie> list) {
        this.cookies = list;
    }

    public void setLocalStorage(String str) {
        this.localStorage = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setSessionStorage(String str) {
        this.sessionStorage = str;
    }

    public void setShouldStartBot(boolean z) {
        this.shouldStartBot = z;
    }
}
