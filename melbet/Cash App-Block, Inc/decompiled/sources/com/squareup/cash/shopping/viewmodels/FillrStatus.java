package com.squareup.cash.shopping.viewmodels;

import com.squareup.cash.fillr.api.FillrWebManager$FillrVersions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FillrStatus {
    public final boolean fillrEnabled;
    public final FillrWebManager$FillrVersions fillrVersions;

    public FillrStatus(boolean z, FillrWebManager$FillrVersions fillrWebManager$FillrVersions) {
        fillrWebManager$FillrVersions.getClass();
        this.fillrEnabled = z;
        this.fillrVersions = fillrWebManager$FillrVersions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillrStatus)) {
            return false;
        }
        FillrStatus fillrStatus = (FillrStatus) obj;
        return this.fillrEnabled == fillrStatus.fillrEnabled && Intrinsics.areEqual(this.fillrVersions, fillrStatus.fillrVersions);
    }

    public final int hashCode() {
        return this.fillrVersions.hashCode() + (Boolean.hashCode(this.fillrEnabled) * 31);
    }

    public final String toString() {
        return "FillrStatus(fillrEnabled=" + this.fillrEnabled + ", fillrVersions=" + this.fillrVersions + ")";
    }
}
