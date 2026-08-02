package com.squareup.cash.cashapppay.settings.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BusinessGrantClicked extends CashAppPaySettingsViewEvent {
    public final CashAppPaySettingsRowViewModel$BusinessViewModel businessViewModel;

    public BusinessGrantClicked(CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel) {
        cashAppPaySettingsRowViewModel$BusinessViewModel.getClass();
        this.businessViewModel = cashAppPaySettingsRowViewModel$BusinessViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BusinessGrantClicked) && Intrinsics.areEqual(this.businessViewModel, ((BusinessGrantClicked) obj).businessViewModel);
    }

    public final int hashCode() {
        return this.businessViewModel.hashCode();
    }

    public final String toString() {
        return "BusinessGrantClicked(businessViewModel=" + this.businessViewModel + ")";
    }
}
