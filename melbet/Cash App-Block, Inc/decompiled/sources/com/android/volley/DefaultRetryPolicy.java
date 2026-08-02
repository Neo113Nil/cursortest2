package com.android.volley;

/* loaded from: classes3.dex */
public final class DefaultRetryPolicy {
    public final float mBackoffMultiplier;
    public int mCurrentRetryCount;
    public int mCurrentTimeoutMs;
    public final int mMaxNumRetries;

    public DefaultRetryPolicy(float f, int i, int i2) {
        this.mCurrentTimeoutMs = i;
        this.mMaxNumRetries = i2;
        this.mBackoffMultiplier = f;
    }
}
