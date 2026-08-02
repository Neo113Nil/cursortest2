package com.knotapi.knot.models;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MerchantWebViewData {
    private int botId;
    private String cookies;
    private String eventType;
    private Map<String, String> interactionMap;
    private String localStorage;
    private String message;
    private String screenName;
    private String sessionStorage;
    private String trigger;

    public static class Builder {
        private final MerchantWebViewData data = new MerchantWebViewData();

        public MerchantWebViewData build() {
            return this.data;
        }

        public Builder setBotId(int i) {
            this.data.botId = i;
            return this;
        }

        public Builder setCookies(String str) {
            this.data.cookies = str;
            return this;
        }

        public Builder setEventType(String str) {
            this.data.eventType = str;
            return this;
        }

        public Builder setInteractionMap(Map<String, String> map) {
            this.data.interactionMap = map != null ? new HashMap(map) : null;
            return this;
        }

        public Builder setLocalStorage(String str) {
            this.data.localStorage = str;
            return this;
        }

        public Builder setMessage(String str) {
            this.data.message = str;
            return this;
        }

        public Builder setScreenName(String str) {
            this.data.screenName = str;
            return this;
        }

        public Builder setSessionStorage(String str) {
            this.data.sessionStorage = str;
            return this;
        }

        public Builder setTrigger(String str) {
            this.data.trigger = str;
            return this;
        }
    }

    private MerchantWebViewData() {
        this.message = "";
        this.screenName = "";
        this.cookies = "{}";
        this.eventType = "";
    }

    public int getBotId() {
        return this.botId;
    }

    public String getCookies() {
        return this.cookies;
    }

    public String getEventType() {
        return this.eventType;
    }

    public Map<String, String> getInteractionMap() {
        return this.interactionMap;
    }

    public String getLocalStorage() {
        return this.localStorage;
    }

    public String getMessage() {
        return this.message;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public String getSessionStorage() {
        return this.sessionStorage;
    }

    public String getTrigger() {
        return this.trigger;
    }
}
