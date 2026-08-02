package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyMemberRowViewModel {
    public final StackedAvatarViewModel.Avatar avatar;
    public final String balanceText;
    public final boolean cashForKidsUxEnabled;
    public final String customerToken;
    public final String fullName;
    public final FamilyHomeViewEvent onClickEvent;
    public final boolean shouldAnimateHighlightEntry;
    public final String sponsorshipTierText;

    public FamilyMemberRowViewModel(String str, StackedAvatarViewModel.Avatar avatar, String str2, String str3, String str4, FamilyHomeViewEvent familyHomeViewEvent, boolean z, boolean z2) {
        this.customerToken = str;
        this.avatar = avatar;
        this.fullName = str2;
        this.balanceText = str3;
        this.sponsorshipTierText = str4;
        this.onClickEvent = familyHomeViewEvent;
        this.cashForKidsUxEnabled = z;
        this.shouldAnimateHighlightEntry = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyMemberRowViewModel)) {
            return false;
        }
        FamilyMemberRowViewModel familyMemberRowViewModel = (FamilyMemberRowViewModel) obj;
        return Intrinsics.areEqual(this.customerToken, familyMemberRowViewModel.customerToken) && Intrinsics.areEqual(this.avatar, familyMemberRowViewModel.avatar) && Intrinsics.areEqual(this.fullName, familyMemberRowViewModel.fullName) && Intrinsics.areEqual(this.balanceText, familyMemberRowViewModel.balanceText) && Intrinsics.areEqual(this.sponsorshipTierText, familyMemberRowViewModel.sponsorshipTierText) && Intrinsics.areEqual(this.onClickEvent, familyMemberRowViewModel.onClickEvent) && this.cashForKidsUxEnabled == familyMemberRowViewModel.cashForKidsUxEnabled && this.shouldAnimateHighlightEntry == familyMemberRowViewModel.shouldAnimateHighlightEntry;
    }

    public final int hashCode() {
        String str = this.customerToken;
        int hashCode = (this.avatar.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.fullName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.balanceText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sponsorshipTierText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FamilyHomeViewEvent familyHomeViewEvent = this.onClickEvent;
        return Boolean.hashCode(this.shouldAnimateHighlightEntry) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (familyHomeViewEvent != null ? familyHomeViewEvent.hashCode() : 0)) * 31, 31, this.cashForKidsUxEnabled);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyMemberRowViewModel(customerToken=");
        sb.append(this.customerToken);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", fullName=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.fullName, ", balanceText=", this.balanceText, ", sponsorshipTierText=");
        sb.append(this.sponsorshipTierText);
        sb.append(", onClickEvent=");
        sb.append(this.onClickEvent);
        sb.append(", cashForKidsUxEnabled=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.cashForKidsUxEnabled, ", shouldAnimateHighlightEntry=", this.shouldAnimateHighlightEntry, ")");
    }

    public /* synthetic */ FamilyMemberRowViewModel(String str, StackedAvatarViewModel.Avatar avatar, String str2, String str3, String str4, FamilyHomeViewEvent.TapDependent tapDependent, boolean z, int i) {
        this((i & 1) != 0 ? null : str, avatar, str2, str3, str4, (FamilyHomeViewEvent) tapDependent, z, false);
    }
}
