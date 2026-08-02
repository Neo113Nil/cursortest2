package com.fillr.analytics;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes4.dex */
public class AnalyticsEvent {
    public String action = null;
    public String devKey;

    @SerializedName("cartInfoJson")
    private String extraInfo;

    public final void setExtraInfo(String str) {
        this.extraInfo = str;
    }
}
