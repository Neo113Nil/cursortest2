package com.knotapi.knot.models;

import java.util.HashMap;

/* loaded from: classes4.dex */
public class ExtraInfo {
    public String interceptedValues;
    public String userAgent;
    public boolean workflowTaskTrigger;
    public HashMap<String, String> interceptedHashmap = new HashMap<>();
    public String loggedInPage = "";
    public String intentRedirection = "";

    public String getIntentRedirection() {
        return this.intentRedirection;
    }

    public HashMap<String, String> getInterceptedHashmap() {
        return this.interceptedHashmap;
    }

    public String getInterceptedValues() {
        return this.interceptedValues;
    }

    public String getLoggedInPage() {
        return this.loggedInPage;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isWorkflowTaskTrigger() {
        return this.workflowTaskTrigger;
    }

    public void setIntentRedirection(String str) {
        this.intentRedirection = str;
    }

    public void setInterceptedHashmap(HashMap<String, String> hashMap) {
        this.interceptedHashmap = hashMap;
    }

    public void setInterceptedValues(String str) {
        this.interceptedValues = str;
    }

    public void setLoggedInPage(String str) {
        this.loggedInPage = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public void setWorkflowTaskTrigger(boolean z) {
        this.workflowTaskTrigger = z;
    }
}
