package com.squareup.cash.family.familyhub.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AllowanceSectionViewModel {
    public final List allowanceViewModels;
    public final String initializationUrl;

    public AllowanceSectionViewModel(List list, String str) {
        list.getClass();
        this.allowanceViewModels = list;
        this.initializationUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowanceSectionViewModel)) {
            return false;
        }
        AllowanceSectionViewModel allowanceSectionViewModel = (AllowanceSectionViewModel) obj;
        return Intrinsics.areEqual(this.allowanceViewModels, allowanceSectionViewModel.allowanceViewModels) && Intrinsics.areEqual(this.initializationUrl, allowanceSectionViewModel.initializationUrl);
    }

    public final int hashCode() {
        int hashCode = this.allowanceViewModels.hashCode() * 31;
        String str = this.initializationUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AllowanceSectionViewModel(allowanceViewModels=" + this.allowanceViewModels + ", initializationUrl=" + this.initializationUrl + ")";
    }
}
