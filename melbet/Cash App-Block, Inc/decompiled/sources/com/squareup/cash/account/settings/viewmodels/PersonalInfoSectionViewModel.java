package com.squareup.cash.account.settings.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PersonalInfoSectionViewModel {
    public final PersonalInfoConfirmationViewModel confirmationViewModel;
    public final List rows;

    public PersonalInfoSectionViewModel(PersonalInfoConfirmationViewModel personalInfoConfirmationViewModel, List list) {
        list.getClass();
        this.confirmationViewModel = personalInfoConfirmationViewModel;
        this.rows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalInfoSectionViewModel)) {
            return false;
        }
        PersonalInfoSectionViewModel personalInfoSectionViewModel = (PersonalInfoSectionViewModel) obj;
        return Intrinsics.areEqual(this.confirmationViewModel, personalInfoSectionViewModel.confirmationViewModel) && Intrinsics.areEqual(this.rows, personalInfoSectionViewModel.rows);
    }

    public final int hashCode() {
        PersonalInfoConfirmationViewModel personalInfoConfirmationViewModel = this.confirmationViewModel;
        return this.rows.hashCode() + ((personalInfoConfirmationViewModel == null ? 0 : personalInfoConfirmationViewModel.hashCode()) * 31);
    }

    public final String toString() {
        return "PersonalInfoSectionViewModel(confirmationViewModel=" + this.confirmationViewModel + ", rows=" + this.rows + ")";
    }
}
