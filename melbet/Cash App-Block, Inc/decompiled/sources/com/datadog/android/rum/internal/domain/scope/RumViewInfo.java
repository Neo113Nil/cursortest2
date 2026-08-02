package com.datadog.android.rum.internal.domain.scope;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RumViewInfo {
    public final Map attributes;
    public final boolean isActive;
    public final RumScopeKey key;

    public RumViewInfo(RumScopeKey rumScopeKey, Map map, boolean z) {
        rumScopeKey.getClass();
        map.getClass();
        this.key = rumScopeKey;
        this.attributes = map;
        this.isActive = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumViewInfo)) {
            return false;
        }
        RumViewInfo rumViewInfo = (RumViewInfo) obj;
        return Intrinsics.areEqual(this.key, rumViewInfo.key) && Intrinsics.areEqual(this.attributes, rumViewInfo.attributes) && this.isActive == rumViewInfo.isActive;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isActive) + CameraState$Type$EnumUnboxingLocalUtility.m(this.key.hashCode() * 31, this.attributes, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RumViewInfo(key=");
        sb.append(this.key);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", isActive=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isActive, ")");
    }
}
