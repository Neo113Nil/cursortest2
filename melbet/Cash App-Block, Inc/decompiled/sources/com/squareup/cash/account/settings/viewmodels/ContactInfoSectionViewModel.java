package com.squareup.cash.account.settings.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContactInfoSectionViewModel {
    public final AliasesSectionViewModel aliasSection;

    public ContactInfoSectionViewModel(AliasesSectionViewModel aliasesSectionViewModel) {
        aliasesSectionViewModel.getClass();
        this.aliasSection = aliasesSectionViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactInfoSectionViewModel) && Intrinsics.areEqual(this.aliasSection, ((ContactInfoSectionViewModel) obj).aliasSection);
    }

    public final int hashCode() {
        return this.aliasSection.aliases.hashCode();
    }

    public final String toString() {
        return "ContactInfoSectionViewModel(aliasSection=" + this.aliasSection + ")";
    }
}
