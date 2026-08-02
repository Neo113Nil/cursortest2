package com.squareup.cash.identityverification.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.IdentityHubState;

/* loaded from: classes.dex */
public final class IdentityVerificationStatus {
    public final IdentityHubState.EntrypointStatus entrypointStatus;
    public final boolean shouldShowBadge;
    public final long version;

    public IdentityVerificationStatus(boolean z, IdentityHubState.EntrypointStatus entrypointStatus, long j) {
        entrypointStatus.getClass();
        this.shouldShowBadge = z;
        this.entrypointStatus = entrypointStatus;
        this.version = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityVerificationStatus)) {
            return false;
        }
        IdentityVerificationStatus identityVerificationStatus = (IdentityVerificationStatus) obj;
        return this.shouldShowBadge == identityVerificationStatus.shouldShowBadge && this.entrypointStatus == identityVerificationStatus.entrypointStatus && this.version == identityVerificationStatus.version;
    }

    public final int hashCode() {
        return Long.hashCode(this.version) + ((this.entrypointStatus.hashCode() + (Boolean.hashCode(this.shouldShowBadge) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityVerificationStatus(shouldShowBadge=");
        sb.append(this.shouldShowBadge);
        sb.append(", entrypointStatus=");
        sb.append(this.entrypointStatus);
        sb.append(", version=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.version, ")", sb);
    }
}
