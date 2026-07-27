package com.appsflyer.internal;

import android.content.SharedPreferences;
import androidx.compose.material3.MenuKt;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFd1sSDK implements AFd1rSDK {
    private final Lazy AFAdRevenueData;
    private final AFd1mSDK<SharedPreferences> getMonetizationNetwork;

    public AFd1sSDK(AFd1mSDK<SharedPreferences> aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.getMonetizationNetwork = aFd1mSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFd1sSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: t_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFd1sSDK.this.getMonetizationNetwork.getCurrencyIso4217Code.invoke();
            }

            {
                super(0);
            }
        });
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str, String str2) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getString(str, str2);
        } catch (ClassCastException e) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, MenuKt.InTransitionDuration, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getMediationNetwork(String str) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getBoolean(str, false);
        } catch (ClassCastException e) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, MenuKt.InTransitionDuration, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getRevenue(String str, boolean z) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final long getMediationNetwork(String str, long j) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, MenuKt.InTransitionDuration, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getMonetizationNetwork(String str, long j) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str, int i) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final int getMediationNetwork(String str, int i) {
        try {
            return ((SharedPreferences) this.AFAdRevenueData.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, MenuKt.InTransitionDuration, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) this.AFAdRevenueData.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str) {
        ((SharedPreferences) this.AFAdRevenueData.getValue()).edit().remove(str).apply();
    }
}
