package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import o2.C4828a;
import o2.C4829b;

/* loaded from: classes.dex */
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z8) {
        this.mId = str;
        this.mLimitAdTracking = z8;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            C4828a a9 = C4829b.a(context);
            return new AdvertisingId(a9.f39687a, a9.f39688b);
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
