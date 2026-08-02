package com.squareup.cash.securityhub.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecoveryGuideRowViewModel {
    public final RecoveryGuideRowId id;
    public final boolean isActionable;
    public final String subtitle;
    public final String title;

    public RecoveryGuideRowViewModel(RecoveryGuideRowId recoveryGuideRowId, String str, String str2, boolean z) {
        recoveryGuideRowId.getClass();
        str.getClass();
        this.id = recoveryGuideRowId;
        this.title = str;
        this.subtitle = str2;
        this.isActionable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoveryGuideRowViewModel)) {
            return false;
        }
        RecoveryGuideRowViewModel recoveryGuideRowViewModel = (RecoveryGuideRowViewModel) obj;
        return this.id == recoveryGuideRowViewModel.id && Intrinsics.areEqual(this.title, recoveryGuideRowViewModel.title) && Intrinsics.areEqual(this.subtitle, recoveryGuideRowViewModel.subtitle) && this.isActionable == recoveryGuideRowViewModel.isActionable;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return Boolean.hashCode(this.isActionable) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecoveryGuideRowViewModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return re$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", isActionable=", this.isActionable, ")");
    }
}
