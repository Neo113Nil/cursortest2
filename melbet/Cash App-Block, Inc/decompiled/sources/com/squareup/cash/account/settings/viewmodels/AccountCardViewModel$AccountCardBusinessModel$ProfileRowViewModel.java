package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel {
    public final String accessoryLabel;
    public final Icons icon;
    public final boolean showBadge;
    public final String subtitle;
    public final String title;

    public AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel(String str, String str2, Icons icons, String str3, boolean z) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.icon = icons;
        this.accessoryLabel = str3;
        this.showBadge = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel)) {
            return false;
        }
        AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel = (AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel) obj;
        return Intrinsics.areEqual(this.title, accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.title) && this.subtitle.equals(accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.subtitle) && this.icon == accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.icon && this.accessoryLabel.equals(accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.accessoryLabel) && this.showBadge == accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.showBadge;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showBadge) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.accessoryLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileRowViewModel(title=", this.title, ", subtitle=", this.subtitle, ", icon=");
        m.append(this.icon);
        m.append(", accessoryLabel=");
        m.append(this.accessoryLabel);
        m.append(", showBadge=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showBadge, ")");
    }
}
