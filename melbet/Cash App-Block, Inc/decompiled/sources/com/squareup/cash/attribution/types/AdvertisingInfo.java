package com.squareup.cash.attribution.types;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AdvertisingInfo {
    public final String id;
    public final boolean optedOut;

    public AdvertisingInfo(String str, boolean z) {
        this.id = str;
        this.optedOut = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisingInfo)) {
            return false;
        }
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
        return Intrinsics.areEqual(this.id, advertisingInfo.id) && this.optedOut == advertisingInfo.optedOut;
    }

    public final int hashCode() {
        String str = this.id;
        return Boolean.hashCode(this.optedOut) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("AdvertisingInfo(id=", this.id, ", optedOut=", ")", this.optedOut);
    }
}
