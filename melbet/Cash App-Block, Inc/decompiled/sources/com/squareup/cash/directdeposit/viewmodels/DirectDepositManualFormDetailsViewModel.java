package com.squareup.cash.directdeposit.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositManualFormDetailsViewModel {
    public final boolean addSignature;
    public final String companyName;
    public final String name;
    public final String paycheckAmount;

    public DirectDepositManualFormDetailsViewModel(String str, String str2, String str3, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.name = str;
        this.companyName = str2;
        this.paycheckAmount = str3;
        this.addSignature = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositManualFormDetailsViewModel)) {
            return false;
        }
        DirectDepositManualFormDetailsViewModel directDepositManualFormDetailsViewModel = (DirectDepositManualFormDetailsViewModel) obj;
        return Intrinsics.areEqual(this.name, directDepositManualFormDetailsViewModel.name) && Intrinsics.areEqual(this.companyName, directDepositManualFormDetailsViewModel.companyName) && Intrinsics.areEqual(this.paycheckAmount, directDepositManualFormDetailsViewModel.paycheckAmount) && this.addSignature == directDepositManualFormDetailsViewModel.addSignature;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.companyName), 31, this.paycheckAmount), 31, this.addSignature);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DirectDepositManualFormDetailsViewModel(name=", this.name, ", companyName=", this.companyName, ", paycheckAmount="), this.paycheckAmount, ", addSignature=", this.addSignature, ", submitEnabled=true)");
    }
}
