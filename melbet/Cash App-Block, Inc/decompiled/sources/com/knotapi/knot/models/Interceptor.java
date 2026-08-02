package com.knotapi.knot.models;

/* loaded from: classes4.dex */
public class Interceptor {
    String interceptType;
    boolean isSendToServer;
    boolean isUrlRegex;
    String replaceKey;
    String replaceType;
    String replaceValue;
    String serverKey;
    String url;

    public Interceptor(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6) {
        this.url = str;
        this.isUrlRegex = z;
        this.isSendToServer = z2;
        this.serverKey = str2;
        this.interceptType = str3;
        this.replaceType = str4;
        this.replaceKey = str5;
        this.replaceValue = str6;
    }

    public String getInterceptType() {
        return this.interceptType;
    }

    public String getReplaceKey() {
        return this.replaceKey;
    }

    public String getReplaceType() {
        return this.replaceType;
    }

    public String getReplaceValue() {
        return this.replaceValue;
    }

    public String getServerKey() {
        return this.serverKey;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isSendToServer() {
        return this.isSendToServer;
    }

    public boolean isUrlRegex() {
        return this.isUrlRegex;
    }

    public void setInterceptType(String str) {
        this.interceptType = str;
    }

    public void setReplaceKey(String str) {
        this.replaceKey = str;
    }

    public void setReplaceType(String str) {
        this.replaceType = str;
    }

    public void setReplaceValue(String str) {
        this.replaceValue = str;
    }

    public void setSendToServer(boolean z) {
        this.isSendToServer = z;
    }

    public void setServerKey(String str) {
        this.serverKey = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrlRegex(boolean z) {
        this.isUrlRegex = z;
    }
}
