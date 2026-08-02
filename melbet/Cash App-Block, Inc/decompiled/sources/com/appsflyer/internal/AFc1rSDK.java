package com.appsflyer.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1rSDK {
    final List<AFc1sSDK> getMediationNetwork;

    public AFc1rSDK(List<AFc1sSDK> list) {
        list.getClass();
        this.getMediationNetwork = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1rSDK) && Intrinsics.areEqual(this.getMediationNetwork, ((AFc1rSDK) obj).getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StorageConfig(typeEntries=", ")", this.getMediationNetwork);
    }
}
