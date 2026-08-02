package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import q2.C4869a;
import q2.C4870b;

/* loaded from: classes.dex */
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z6) {
        this.mId = str;
        this.mLimitAdTracking = z6;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            C4869a a9 = C4870b.a(context);
            return new AdvertisingId(a9.f40039a, a9.f40040b);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
