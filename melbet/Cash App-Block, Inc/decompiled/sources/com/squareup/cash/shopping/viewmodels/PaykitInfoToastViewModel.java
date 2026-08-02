package com.squareup.cash.shopping.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PaykitInfoToastViewModel {
    public final String description;
    public final int legacyIcon;
    public final String title;

    public PaykitInfoToastViewModel(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.legacyIcon = i;
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaykitInfoToastViewModel)) {
            return false;
        }
        PaykitInfoToastViewModel paykitInfoToastViewModel = (PaykitInfoToastViewModel) obj;
        return this.legacyIcon == paykitInfoToastViewModel.legacyIcon && Intrinsics.areEqual(this.title, paykitInfoToastViewModel.title) && Intrinsics.areEqual(this.description, paykitInfoToastViewModel.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.legacyIcon) * 31, 31, this.title);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("PaykitInfoToastViewModel(legacyIcon=", this.legacyIcon, ", title=", this.title, ", description="), this.description, ")");
    }
}
