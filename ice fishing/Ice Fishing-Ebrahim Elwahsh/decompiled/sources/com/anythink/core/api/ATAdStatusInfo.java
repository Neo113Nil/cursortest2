package com.anythink.core.api;

/* loaded from: classes.dex */
public class ATAdStatusInfo {
    private ATAdInfo mATTopAdInfo;
    private boolean mIsLoading;
    private boolean mIsReady;

    public ATAdStatusInfo(boolean z8, boolean z9, ATAdInfo aTAdInfo) {
        this.mIsLoading = z8;
        this.mIsReady = z9;
        this.mATTopAdInfo = aTAdInfo;
    }

    public ATAdInfo getATTopAdInfo() {
        return this.mATTopAdInfo;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isReady() {
        return this.mIsReady;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ATAdStatusInfo{isLoading=");
        sb.append(this.mIsLoading);
        sb.append(", isReady=");
        sb.append(this.mIsReady);
        sb.append(", topAdInfo=");
        Object obj = this.mATTopAdInfo;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
