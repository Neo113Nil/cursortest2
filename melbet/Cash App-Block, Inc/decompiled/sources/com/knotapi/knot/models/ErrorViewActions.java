package com.knotapi.knot.models;

import com.google.gson.JsonObject;

/* loaded from: classes4.dex */
public class ErrorViewActions {
    JsonObject errorView;
    boolean isUrlRegex;
    String url;

    public ErrorViewActions(String str, boolean z, JsonObject jsonObject) {
        this.url = str;
        this.isUrlRegex = z;
        this.errorView = jsonObject;
    }

    public JsonObject getErrorView() {
        return this.errorView;
    }

    public boolean getIsUrlRegex() {
        return this.isUrlRegex;
    }

    public String getUrl() {
        return this.url;
    }

    public void setErrorView(JsonObject jsonObject) {
        this.errorView = jsonObject;
    }

    public void setIsUrlRegex(boolean z) {
        this.isUrlRegex = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public ErrorViewActions() {
    }
}
