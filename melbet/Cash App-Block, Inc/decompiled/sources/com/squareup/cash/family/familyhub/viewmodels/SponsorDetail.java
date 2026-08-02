package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorDetail {
    public final StackedAvatarViewModel.Single avatarViewModel;
    public final BadgeName badgeName;
    public final String requestCashButtonText;
    public final boolean shouldShowRequestCashButton;
    public final String sponsorIntroductionText;

    public SponsorDetail(StackedAvatarViewModel.Single single, String str, BadgeName badgeName, String str2, boolean z) {
        str.getClass();
        this.avatarViewModel = single;
        this.sponsorIntroductionText = str;
        this.badgeName = badgeName;
        this.requestCashButtonText = str2;
        this.shouldShowRequestCashButton = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorDetail)) {
            return false;
        }
        SponsorDetail sponsorDetail = (SponsorDetail) obj;
        return this.avatarViewModel.equals(sponsorDetail.avatarViewModel) && Intrinsics.areEqual(this.sponsorIntroductionText, sponsorDetail.sponsorIntroductionText) && this.badgeName.equals(sponsorDetail.badgeName) && this.requestCashButtonText.equals(sponsorDetail.requestCashButtonText) && this.shouldShowRequestCashButton == sponsorDetail.shouldShowRequestCashButton;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.shouldShowRequestCashButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.badgeName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatarViewModel.avatar.hashCode() * 31, 31, this.sponsorIntroductionText)) * 31, 31, this.requestCashButtonText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SponsorDetail(avatarViewModel=");
        sb.append(this.avatarViewModel);
        sb.append(", sponsorIntroductionText=");
        sb.append(this.sponsorIntroductionText);
        sb.append(", badgeName=");
        sb.append(this.badgeName);
        sb.append(", requestCashButtonText=");
        sb.append(this.requestCashButtonText);
        sb.append(", shouldShowRequestCashButton=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldShowRequestCashButton, ")");
    }
}
