package com.squareup.cash.account.settings.viewmodels.business;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BusinessInfoViewModel {
    public final String businessAddress;
    public final ConfirmationSheetViewModel confirmationSheetViewModel;
    public final boolean showDowngradeToPersonal;
    public final boolean showTaxInfo;

    public final class ConfirmationSheetViewModel {
        public final String businessAddress;

        public ConfirmationSheetViewModel(String str) {
            str.getClass();
            this.businessAddress = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmationSheetViewModel) && Intrinsics.areEqual(this.businessAddress, ((ConfirmationSheetViewModel) obj).businessAddress);
        }

        public final int hashCode() {
            return this.businessAddress.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmationSheetViewModel(businessAddress=", this.businessAddress, ")");
        }
    }

    public BusinessInfoViewModel(boolean z, boolean z2, String str, ConfirmationSheetViewModel confirmationSheetViewModel) {
        this.showTaxInfo = z;
        this.showDowngradeToPersonal = z2;
        this.businessAddress = str;
        this.confirmationSheetViewModel = confirmationSheetViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessInfoViewModel)) {
            return false;
        }
        BusinessInfoViewModel businessInfoViewModel = (BusinessInfoViewModel) obj;
        return this.showTaxInfo == businessInfoViewModel.showTaxInfo && this.showDowngradeToPersonal == businessInfoViewModel.showDowngradeToPersonal && Intrinsics.areEqual(this.businessAddress, businessInfoViewModel.businessAddress) && Intrinsics.areEqual(this.confirmationSheetViewModel, businessInfoViewModel.confirmationSheetViewModel);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showTaxInfo) * 31, 31, this.showDowngradeToPersonal);
        String str = this.businessAddress;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        ConfirmationSheetViewModel confirmationSheetViewModel = this.confirmationSheetViewModel;
        return hashCode + (confirmationSheetViewModel != null ? confirmationSheetViewModel.businessAddress.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("BusinessInfoViewModel(showTaxInfo=", ", showDowngradeToPersonal=", ", businessAddress=", this.showTaxInfo, this.showDowngradeToPersonal);
        m.append(this.businessAddress);
        m.append(", confirmationSheetViewModel=");
        m.append(this.confirmationSheetViewModel);
        m.append(")");
        return m.toString();
    }
}
