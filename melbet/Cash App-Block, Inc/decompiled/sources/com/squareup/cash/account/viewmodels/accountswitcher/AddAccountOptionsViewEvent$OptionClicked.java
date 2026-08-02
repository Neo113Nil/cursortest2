package com.squareup.cash.account.viewmodels.accountswitcher;

import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;

/* loaded from: classes5.dex */
public final class AddAccountOptionsViewEvent$OptionClicked {
    public final AddAccountOptionsViewModel.Loaded.AccountOption.OptionType option;

    public AddAccountOptionsViewEvent$OptionClicked(AddAccountOptionsViewModel.Loaded.AccountOption.OptionType optionType) {
        optionType.getClass();
        this.option = optionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddAccountOptionsViewEvent$OptionClicked) && this.option == ((AddAccountOptionsViewEvent$OptionClicked) obj).option;
    }

    public final int hashCode() {
        return this.option.hashCode();
    }

    public final String toString() {
        return "OptionClicked(option=" + this.option + ")";
    }
}
