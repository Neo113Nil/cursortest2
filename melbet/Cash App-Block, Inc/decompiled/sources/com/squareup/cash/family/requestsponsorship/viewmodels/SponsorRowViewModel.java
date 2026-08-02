package com.squareup.cash.family.requestsponsorship.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorRowViewModel {
    public final StackedAvatarViewModel.Single avatar;
    public final SelectSponsorViewEvent.SponsorRowTapped clickEvent;
    public final boolean showCashLogo;
    public final String subtitle;
    public final String title;

    public SponsorRowViewModel(StackedAvatarViewModel.Single single, String str, String str2, boolean z, SelectSponsorViewEvent.SponsorRowTapped sponsorRowTapped) {
        str.getClass();
        str2.getClass();
        this.avatar = single;
        this.title = str;
        this.subtitle = str2;
        this.showCashLogo = z;
        this.clickEvent = sponsorRowTapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorRowViewModel)) {
            return false;
        }
        SponsorRowViewModel sponsorRowViewModel = (SponsorRowViewModel) obj;
        return this.avatar.equals(sponsorRowViewModel.avatar) && Intrinsics.areEqual(this.title, sponsorRowViewModel.title) && Intrinsics.areEqual(this.subtitle, sponsorRowViewModel.subtitle) && this.showCashLogo == sponsorRowViewModel.showCashLogo && this.clickEvent.equals(sponsorRowViewModel.clickEvent);
    }

    public final int hashCode() {
        return this.clickEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.avatar.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.showCashLogo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SponsorRowViewModel(avatar=");
        sb.append(this.avatar);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", showCashLogo=", this.showCashLogo, ", clickEvent=");
        sb.append(this.clickEvent);
        sb.append(")");
        return sb.toString();
    }
}
