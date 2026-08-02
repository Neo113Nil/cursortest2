package com.squareup.cash.family.familyhub.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorDetailViewModel {
    public final AllowanceSectionViewModel allowanceSectionViewModel;
    public final DependentGraduationViewModel graduationViewModel;
    public final String inviteFriendsButtonText;
    public final Image inviteFriendsImage;
    public final String inviteFriendsSectionTitle;
    public final String inviteFriendsSubtitle;
    public final String inviteFriendsTitle;
    public final SponsorDetail sponsorDetail;

    public SponsorDetailViewModel(DependentGraduationViewModel dependentGraduationViewModel, SponsorDetail sponsorDetail, AllowanceSectionViewModel allowanceSectionViewModel, String str, Image image, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.graduationViewModel = dependentGraduationViewModel;
        this.sponsorDetail = sponsorDetail;
        this.allowanceSectionViewModel = allowanceSectionViewModel;
        this.inviteFriendsSectionTitle = str;
        this.inviteFriendsImage = image;
        this.inviteFriendsTitle = str2;
        this.inviteFriendsSubtitle = str3;
        this.inviteFriendsButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorDetailViewModel)) {
            return false;
        }
        SponsorDetailViewModel sponsorDetailViewModel = (SponsorDetailViewModel) obj;
        return Intrinsics.areEqual(this.graduationViewModel, sponsorDetailViewModel.graduationViewModel) && Intrinsics.areEqual(this.sponsorDetail, sponsorDetailViewModel.sponsorDetail) && Intrinsics.areEqual(this.allowanceSectionViewModel, sponsorDetailViewModel.allowanceSectionViewModel) && Intrinsics.areEqual(this.inviteFriendsSectionTitle, sponsorDetailViewModel.inviteFriendsSectionTitle) && this.inviteFriendsImage.equals(sponsorDetailViewModel.inviteFriendsImage) && Intrinsics.areEqual(this.inviteFriendsTitle, sponsorDetailViewModel.inviteFriendsTitle) && Intrinsics.areEqual(this.inviteFriendsSubtitle, sponsorDetailViewModel.inviteFriendsSubtitle) && Intrinsics.areEqual(this.inviteFriendsButtonText, sponsorDetailViewModel.inviteFriendsButtonText);
    }

    public final int hashCode() {
        DependentGraduationViewModel dependentGraduationViewModel = this.graduationViewModel;
        int hashCode = (dependentGraduationViewModel == null ? 0 : dependentGraduationViewModel.hashCode()) * 31;
        SponsorDetail sponsorDetail = this.sponsorDetail;
        int hashCode2 = (hashCode + (sponsorDetail == null ? 0 : sponsorDetail.hashCode())) * 31;
        AllowanceSectionViewModel allowanceSectionViewModel = this.allowanceSectionViewModel;
        return this.inviteFriendsButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.inviteFriendsImage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (allowanceSectionViewModel != null ? allowanceSectionViewModel.hashCode() : 0)) * 31, 31, this.inviteFriendsSectionTitle)) * 31, 31, this.inviteFriendsTitle), 31, this.inviteFriendsSubtitle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SponsorDetailViewModel(graduationViewModel=");
        sb.append(this.graduationViewModel);
        sb.append(", sponsorDetail=");
        sb.append(this.sponsorDetail);
        sb.append(", allowanceSectionViewModel=");
        sb.append(this.allowanceSectionViewModel);
        sb.append(", inviteFriendsSectionTitle=");
        sb.append(this.inviteFriendsSectionTitle);
        sb.append(", inviteFriendsImage=");
        sb.append(this.inviteFriendsImage);
        sb.append(", inviteFriendsTitle=");
        sb.append(this.inviteFriendsTitle);
        sb.append(", inviteFriendsSubtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.inviteFriendsSubtitle, ", inviteFriendsButtonText=", this.inviteFriendsButtonText, ")");
    }
}
