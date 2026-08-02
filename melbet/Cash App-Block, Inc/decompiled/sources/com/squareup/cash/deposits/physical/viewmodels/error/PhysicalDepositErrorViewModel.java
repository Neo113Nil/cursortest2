package com.squareup.cash.deposits.physical.viewmodels.error;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PhysicalDepositErrorViewModel {
    public final String actionNegativeText;
    public final String actionPositiveText;
    public final String description;
    public final String title;

    public PhysicalDepositErrorViewModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.description = str2;
        this.actionPositiveText = str3;
        this.actionNegativeText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhysicalDepositErrorViewModel)) {
            return false;
        }
        PhysicalDepositErrorViewModel physicalDepositErrorViewModel = (PhysicalDepositErrorViewModel) obj;
        return Intrinsics.areEqual(this.title, physicalDepositErrorViewModel.title) && Intrinsics.areEqual(this.description, physicalDepositErrorViewModel.description) && Intrinsics.areEqual(this.actionPositiveText, physicalDepositErrorViewModel.actionPositiveText) && Intrinsics.areEqual(this.actionNegativeText, physicalDepositErrorViewModel.actionNegativeText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.actionPositiveText);
        String str = this.actionNegativeText;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PhysicalDepositErrorViewModel(title=", this.title, ", description=", this.description, ", actionPositiveText="), this.actionPositiveText, ", actionNegativeText=", this.actionNegativeText, ")");
    }
}
