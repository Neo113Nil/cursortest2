package com.squareup.cash.card.spendinginsights.viewmodels;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;

/* loaded from: classes6.dex */
public final class StackedBarChartViewModel$Bar$BarImage$Avatar {
    public final StackedAvatarViewModel.Single avatar;

    public StackedBarChartViewModel$Bar$BarImage$Avatar(StackedAvatarViewModel.Single single) {
        this.avatar = single;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StackedBarChartViewModel$Bar$BarImage$Avatar) && this.avatar.equals(((StackedBarChartViewModel$Bar$BarImage$Avatar) obj).avatar);
    }

    public final int hashCode() {
        return this.avatar.avatar.hashCode();
    }

    public final String toString() {
        return "Avatar(avatar=" + this.avatar + ")";
    }
}
