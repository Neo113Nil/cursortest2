package com.squareup.cash.investing.viewmodels.ordertype;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingOrderTypeSelectionViewModel {
    public final List orderTypes;
    public final String title;

    public InvestingOrderTypeSelectionViewModel(String str, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.orderTypes = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingOrderTypeSelectionViewModel)) {
            return false;
        }
        InvestingOrderTypeSelectionViewModel investingOrderTypeSelectionViewModel = (InvestingOrderTypeSelectionViewModel) obj;
        return Intrinsics.areEqual(this.title, investingOrderTypeSelectionViewModel.title) && Intrinsics.areEqual(this.orderTypes, investingOrderTypeSelectionViewModel.orderTypes);
    }

    public final int hashCode() {
        return this.orderTypes.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("InvestingOrderTypeSelectionViewModel(title=", this.title, ", orderTypes=", ")", this.orderTypes);
    }
}
