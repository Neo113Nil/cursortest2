package com.squareup.cash.investing.viewmodels.ordertype.autoinvest;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentAutoInvestInfoViewModel {
    public final String description;
    public final String title;

    public DependentAutoInvestInfoViewModel(String str, String str2) {
        str.getClass();
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentAutoInvestInfoViewModel)) {
            return false;
        }
        DependentAutoInvestInfoViewModel dependentAutoInvestInfoViewModel = (DependentAutoInvestInfoViewModel) obj;
        return Intrinsics.areEqual(this.title, dependentAutoInvestInfoViewModel.title) && this.description.equals(dependentAutoInvestInfoViewModel.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DependentAutoInvestInfoViewModel(title=", this.title, ", description=", this.description, ")");
    }
}
