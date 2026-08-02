package com.squareup.cash.limits.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitsViewModel {
    public final List limits;
    public final LimitsType limitsType;
    public final boolean loading;
    public final LimitsMessageViewModel pageletInlineMessageViewModel;

    public LimitsViewModel(List list, LimitsMessageViewModel limitsMessageViewModel, boolean z, LimitsType limitsType) {
        list.getClass();
        this.limits = list;
        this.pageletInlineMessageViewModel = limitsMessageViewModel;
        this.loading = z;
        this.limitsType = limitsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitsViewModel)) {
            return false;
        }
        LimitsViewModel limitsViewModel = (LimitsViewModel) obj;
        return Intrinsics.areEqual(this.limits, limitsViewModel.limits) && Intrinsics.areEqual(this.pageletInlineMessageViewModel, limitsViewModel.pageletInlineMessageViewModel) && this.loading == limitsViewModel.loading && this.limitsType == limitsViewModel.limitsType;
    }

    public final int hashCode() {
        int hashCode = this.limits.hashCode() * 31;
        LimitsMessageViewModel limitsMessageViewModel = this.pageletInlineMessageViewModel;
        return this.limitsType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (limitsMessageViewModel == null ? 0 : limitsMessageViewModel.hashCode())) * 31, 31, this.loading);
    }

    public final String toString() {
        return "LimitsViewModel(limits=" + this.limits + ", pageletInlineMessageViewModel=" + this.pageletInlineMessageViewModel + ", loading=" + this.loading + ", limitsType=" + this.limitsType + ")";
    }
}
