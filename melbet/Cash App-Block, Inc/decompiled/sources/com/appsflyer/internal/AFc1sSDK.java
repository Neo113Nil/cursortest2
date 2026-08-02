package com.appsflyer.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1sSDK {
    final String AFAdRevenueData;
    final List<AFe1pSDK> getMediationNetwork;
    final int getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1sSDK(String str, List<? extends AFe1pSDK> list, int i) {
        str.getClass();
        list.getClass();
        this.AFAdRevenueData = str;
        this.getMediationNetwork = list;
        this.getMonetizationNetwork = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1sSDK)) {
            return false;
        }
        AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFc1sSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFc1sSDK.getMediationNetwork) && this.getMonetizationNetwork == aFc1sSDK.getMonetizationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMonetizationNetwork) + Recorder$$ExternalSyntheticOutline2.m(this.AFAdRevenueData.hashCode() * 31, 31, this.getMediationNetwork);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.getMonetizationNetwork, ")", NavAction$$ExternalSyntheticOutline0.m("StorageConfigTypeEntry(cacheDirName=", this.AFAdRevenueData, ", eventTypes=", ", maxCapacity=", this.getMediationNetwork));
    }
}
