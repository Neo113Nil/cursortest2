package com.squareup.cash.securityhub.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SecurityHubUiModel {
    public final ProtectionsSectionUiModel protections;

    public SecurityHubUiModel(ProtectionsSectionUiModel protectionsSectionUiModel) {
        protectionsSectionUiModel.getClass();
        this.protections = protectionsSectionUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityHubUiModel) && Intrinsics.areEqual(this.protections, ((SecurityHubUiModel) obj).protections);
    }

    public final int hashCode() {
        return this.protections.hashCode();
    }

    public final String toString() {
        return "SecurityHubUiModel(protections=" + this.protections + ")";
    }
}
