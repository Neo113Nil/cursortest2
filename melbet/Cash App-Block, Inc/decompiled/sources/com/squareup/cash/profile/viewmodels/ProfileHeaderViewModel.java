package com.squareup.cash.profile.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProfileHeaderViewModel {
    public final String avatarContentDescription;
    public final StackedAvatarViewModel.Single avatarViewModel;
    public final Icons badgeIcon;
    public final BadgeName badgeName;
    public final boolean isAvatarClickable;
    public final String subtitle;

    public final class BadgeName {
        public final boolean isBusiness;
        public final boolean isVerified;
        public final String name;

        public BadgeName(String str, boolean z, boolean z2) {
            this.name = str;
            this.isBusiness = z;
            this.isVerified = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadgeName)) {
                return false;
            }
            BadgeName badgeName = (BadgeName) obj;
            return Intrinsics.areEqual(this.name, badgeName.name) && this.isBusiness == badgeName.isBusiness && this.isVerified == badgeName.isVerified;
        }

        public final int hashCode() {
            String str = this.name;
            return Boolean.hashCode(this.isVerified) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.isBusiness);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("BadgeName(name=", this.name, ", isBusiness=", ", isVerified=", this.isBusiness), this.isVerified, ")");
        }
    }

    public /* synthetic */ ProfileHeaderViewModel(StackedAvatarViewModel.Single single, String str, BadgeName badgeName, Icons icons, String str2, int i) {
        this(single, str, badgeName, (i & 8) != 0 ? null : icons, false, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileHeaderViewModel)) {
            return false;
        }
        ProfileHeaderViewModel profileHeaderViewModel = (ProfileHeaderViewModel) obj;
        return Intrinsics.areEqual(this.avatarViewModel, profileHeaderViewModel.avatarViewModel) && Intrinsics.areEqual(this.avatarContentDescription, profileHeaderViewModel.avatarContentDescription) && Intrinsics.areEqual(this.badgeName, profileHeaderViewModel.badgeName) && this.badgeIcon == profileHeaderViewModel.badgeIcon && this.isAvatarClickable == profileHeaderViewModel.isAvatarClickable && Intrinsics.areEqual(this.subtitle, profileHeaderViewModel.subtitle);
    }

    public final int hashCode() {
        StackedAvatarViewModel.Single single = this.avatarViewModel;
        int hashCode = (single == null ? 0 : single.avatar.hashCode()) * 31;
        String str = this.avatarContentDescription;
        int hashCode2 = (this.badgeName.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Icons icons = this.badgeIcon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (icons == null ? 0 : icons.hashCode())) * 31, 31, this.isAvatarClickable);
        String str2 = this.subtitle;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileHeaderViewModel(avatarViewModel=" + this.avatarViewModel + ", avatarContentDescription=" + this.avatarContentDescription + ", badgeName=" + this.badgeName + ", badgeIcon=" + this.badgeIcon + ", isAvatarClickable=" + this.isAvatarClickable + ", subtitle=" + this.subtitle + ")";
    }

    public ProfileHeaderViewModel(StackedAvatarViewModel.Single single, String str, BadgeName badgeName, Icons icons, boolean z, String str2) {
        this.avatarViewModel = single;
        this.avatarContentDescription = str;
        this.badgeName = badgeName;
        this.badgeIcon = icons;
        this.isAvatarClickable = z;
        this.subtitle = str2;
    }
}
