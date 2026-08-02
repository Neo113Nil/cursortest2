package com.squareup.cash.nearby.backend;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class PermissionState {
    public final boolean granted;
    public final boolean shouldShowRationale;

    public PermissionState(boolean z, boolean z2) {
        this.granted = z;
        this.shouldShowRationale = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionState)) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        return this.granted == permissionState.granted && this.shouldShowRationale == permissionState.shouldShowRationale;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.shouldShowRationale) + (Boolean.hashCode(this.granted) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("PermissionState(granted=", ", shouldShowRationale=", ")", this.granted, this.shouldShowRationale);
    }
}
