package com.squareup.cash.banking.sections;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class MoreWaysToAddMoneySectionItemViewModel {
    public final Icons icon;
    public final String id;
    public final NavigationAction navigationAction;
    public final String title;

    public MoreWaysToAddMoneySectionItemViewModel(String str, String str2, Icons icons, NavigationAction navigationAction) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.icon = icons;
        this.navigationAction = navigationAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreWaysToAddMoneySectionItemViewModel)) {
            return false;
        }
        MoreWaysToAddMoneySectionItemViewModel moreWaysToAddMoneySectionItemViewModel = (MoreWaysToAddMoneySectionItemViewModel) obj;
        return Intrinsics.areEqual(this.id, moreWaysToAddMoneySectionItemViewModel.id) && Intrinsics.areEqual(this.title, moreWaysToAddMoneySectionItemViewModel.title) && this.icon == moreWaysToAddMoneySectionItemViewModel.icon && this.navigationAction.equals(moreWaysToAddMoneySectionItemViewModel.navigationAction);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        Icons icons = this.icon;
        return this.navigationAction.hashCode() + ((m + (icons == null ? 0 : icons.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoreWaysToAddMoneySectionItemViewModel(id=", this.id, ", title=", this.title, ", icon=");
        m.append(this.icon);
        m.append(", navigationAction=");
        m.append(this.navigationAction);
        m.append(")");
        return m.toString();
    }
}
