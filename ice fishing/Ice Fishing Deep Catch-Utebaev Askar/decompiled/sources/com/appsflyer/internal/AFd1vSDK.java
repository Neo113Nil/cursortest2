package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1vSDK {

    public static final class AFa1zSDK {
        public final String AFAdRevenueData;
        public final float getCurrencyIso4217Code;

        public AFa1zSDK(float f2, String str) {
            this.getCurrencyIso4217Code = f2;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Float.compare(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) == 0 && Intrinsics.a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getCurrencyIso4217Code) * 31;
            String str = this.AFAdRevenueData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BatteryData(level=" + this.getCurrencyIso4217Code + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    AFa1zSDK AFAdRevenueData(Context context);
}
