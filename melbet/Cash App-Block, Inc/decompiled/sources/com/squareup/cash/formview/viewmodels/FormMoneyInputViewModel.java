package com.squareup.cash.formview.viewmodels;

import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormMoneyInputViewModel {
    public final String errorMessage;
    public final boolean isValid;
    public final Money money;

    public FormMoneyInputViewModel(Money money, String str, boolean z) {
        this.money = money;
        this.isValid = z;
        this.errorMessage = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormMoneyInputViewModel)) {
            return false;
        }
        FormMoneyInputViewModel formMoneyInputViewModel = (FormMoneyInputViewModel) obj;
        return Intrinsics.areEqual(this.money, formMoneyInputViewModel.money) && this.isValid == formMoneyInputViewModel.isValid && Intrinsics.areEqual(this.errorMessage, formMoneyInputViewModel.errorMessage);
    }

    public final int hashCode() {
        Money money = this.money;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((money == null ? 0 : money.hashCode()) * 31, 31, this.isValid);
        String str = this.errorMessage;
        return m + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormMoneyInputViewModel(money=");
        sb.append(this.money);
        sb.append(", isValid=");
        sb.append(this.isValid);
        sb.append(", errorMessage=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ")");
    }
}
