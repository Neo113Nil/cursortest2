package com.squareup.cash.maps.views;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MapEngineConfig {
    public final String mapboxAccessToken;
    public final String mapboxStyleUriDark;
    public final String mapboxStyleUriLight;

    public MapEngineConfig(String str, String str2, String str3) {
        this.mapboxAccessToken = str;
        this.mapboxStyleUriLight = str2;
        this.mapboxStyleUriDark = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapEngineConfig)) {
            return false;
        }
        MapEngineConfig mapEngineConfig = (MapEngineConfig) obj;
        return Intrinsics.areEqual(this.mapboxAccessToken, mapEngineConfig.mapboxAccessToken) && Intrinsics.areEqual(this.mapboxStyleUriLight, mapEngineConfig.mapboxStyleUriLight) && Intrinsics.areEqual(this.mapboxStyleUriDark, mapEngineConfig.mapboxStyleUriDark);
    }

    public final int hashCode() {
        String str = this.mapboxAccessToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mapboxStyleUriLight;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mapboxStyleUriDark;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MapEngineConfig(mapboxAccessToken=", this.mapboxAccessToken, ", mapboxStyleUriLight=", this.mapboxStyleUriLight, ", mapboxStyleUriDark="), this.mapboxStyleUriDark, ")");
    }
}
