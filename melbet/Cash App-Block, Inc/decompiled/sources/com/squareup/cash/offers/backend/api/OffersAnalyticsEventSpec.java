package com.squareup.cash.offers.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersAnalyticsEventSpec {
    public final List clientParameters;
    public final String name;
    public final Map serverParameters;

    public OffersAnalyticsEventSpec(String str, List list, Map map) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.name = str;
        this.serverParameters = map;
        this.clientParameters = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersAnalyticsEventSpec)) {
            return false;
        }
        OffersAnalyticsEventSpec offersAnalyticsEventSpec = (OffersAnalyticsEventSpec) obj;
        return Intrinsics.areEqual(this.name, offersAnalyticsEventSpec.name) && Intrinsics.areEqual(this.serverParameters, offersAnalyticsEventSpec.serverParameters) && Intrinsics.areEqual(this.clientParameters, offersAnalyticsEventSpec.clientParameters);
    }

    public final int hashCode() {
        return this.clientParameters.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.name.hashCode() * 31, this.serverParameters, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersAnalyticsEventSpec(name=");
        sb.append(this.name);
        sb.append(", serverParameters=");
        sb.append(this.serverParameters);
        sb.append(", clientParameters=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.clientParameters, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OffersAnalyticsEventSpec(String str, EmptyMap emptyMap, int i) {
        this(str, EmptyList.INSTANCE, emptyMap);
        if ((i & 2) != 0) {
            emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }
    }
}
