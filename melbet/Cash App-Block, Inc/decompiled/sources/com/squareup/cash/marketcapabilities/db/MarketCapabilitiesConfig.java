package com.squareup.cash.marketcapabilities.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MarketCapabilitiesConfig {
    public final List capabilities;
    public final String id;

    public MarketCapabilitiesConfig(String str, List list) {
        str.getClass();
        list.getClass();
        this.id = str;
        this.capabilities = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCapabilitiesConfig)) {
            return false;
        }
        MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
        return Intrinsics.areEqual(this.id, marketCapabilitiesConfig.id) && Intrinsics.areEqual(this.capabilities, marketCapabilitiesConfig.capabilities);
    }

    public final int hashCode() {
        return this.capabilities.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("MarketCapabilitiesConfig(id=", this.id, ", capabilities=", ")", this.capabilities);
    }
}
