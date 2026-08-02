package com.squareup.cash.deposits.physical.viewmodels.map;

import com.squareup.protos.cash.ui.Icon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel {
    public final Icon icon;
    public final String text;

    public PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel(Icon icon, String str) {
        str.getClass();
        icon.getClass();
        this.text = str;
        this.icon = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel)) {
            return false;
        }
        PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel paperMoneyDepositMapSectionViewModel$FeeInformationViewModel = (PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel) obj;
        return Intrinsics.areEqual(this.text, paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.text) && Intrinsics.areEqual(this.icon, paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.icon);
    }

    public final int hashCode() {
        return this.icon.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "FeeInformationViewModel(text=" + this.text + ", icon=" + this.icon + ")";
    }
}
