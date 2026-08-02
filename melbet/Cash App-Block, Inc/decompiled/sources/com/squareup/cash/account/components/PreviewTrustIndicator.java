package com.squareup.cash.account.components;

import com.squareup.util.compose.StableHolder;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PreviewTrustIndicator {
    public final String arcadeIconId;
    public final StableHolder icon;
    public final String title;

    public PreviewTrustIndicator(String str, String str2, StableHolder stableHolder) {
        str.getClass();
        this.title = str;
        this.arcadeIconId = str2;
        this.icon = stableHolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewTrustIndicator)) {
            return false;
        }
        PreviewTrustIndicator previewTrustIndicator = (PreviewTrustIndicator) obj;
        return Intrinsics.areEqual(this.title, previewTrustIndicator.title) && Intrinsics.areEqual(this.arcadeIconId, previewTrustIndicator.arcadeIconId) && Intrinsics.areEqual(this.icon, previewTrustIndicator.icon);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.arcadeIconId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StableHolder stableHolder = this.icon;
        return hashCode2 + (stableHolder != null ? stableHolder.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PreviewTrustIndicator(title=", this.title, ", arcadeIconId=", this.arcadeIconId, ", icon=");
        m.append(this.icon);
        m.append(")");
        return m.toString();
    }
}
