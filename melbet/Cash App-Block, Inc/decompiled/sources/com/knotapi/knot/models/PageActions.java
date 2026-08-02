package com.knotapi.knot.models;

/* loaded from: classes4.dex */
public class PageActions {
    boolean complete;
    boolean isUrlRegex;
    String redirectUrl;
    String url;

    public PageActions(String str, String str2, boolean z, boolean z2) {
        this.url = str;
        this.redirectUrl = str2;
        this.isUrlRegex = z;
        this.complete = z2;
    }

    public boolean getComplete() {
        return this.complete;
    }

    public boolean getIsUrlRegex() {
        return this.isUrlRegex;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public void setComplete(boolean z) {
        this.complete = z;
    }

    public void setIsUrlRegex(boolean z) {
        this.isUrlRegex = z;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
