package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import o2.C4783a;
import o2.C4784b;

/* loaded from: classes.dex */
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z3) {
        this.mId = str;
        this.mLimitAdTracking = z3;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            C4783a a9 = C4784b.a(context);
            return new AdvertisingId(a9.f39556a, a9.f39557b);
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
