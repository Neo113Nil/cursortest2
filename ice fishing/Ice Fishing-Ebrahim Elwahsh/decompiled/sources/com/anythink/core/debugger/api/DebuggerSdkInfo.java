package com.anythink.core.debugger.api;

/* loaded from: classes.dex */
public class DebuggerSdkInfo {
    private String debugKey;
    private String[] deniedUploadDeviceInfo;
    private String versionName;
    private String appId = "";
    private String appKey = "";
    private boolean isHavePreInitNetwork = false;
    private boolean isHaveLoadAd = false;
    private boolean isInitSdk = false;

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getDebugKey() {
        return this.debugKey;
    }

    public String[] getDeniedUploadDeviceInfo() {
        return this.deniedUploadDeviceInfo;
    }

    public String getIncompatibleVersion() {
        return "1.0.5";
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean isHaveLoadAd() {
        return this.isHaveLoadAd;
    }

    public boolean isHavePreInitNetwork() {
        return this.isHavePreInitNetwork;
    }

    public boolean isInitSdk() {
        return this.isInitSdk;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setDebugKey(String str) {
        this.debugKey = str;
    }

    public void setDeniedUploadDeviceInfo(String[] strArr) {
        this.deniedUploadDeviceInfo = strArr;
    }

    public void setHaveLoadAd(boolean z8) {
        this.isHaveLoadAd = z8;
    }

    public void setHavePreInitNetwork(boolean z8) {
        this.isHavePreInitNetwork = z8;
    }

    public void setInitSdk(boolean z8) {
        this.isInitSdk = z8;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public boolean shouldRebootForDebugMode() {
        return this.isHavePreInitNetwork || this.isHaveLoadAd;
    }
}
