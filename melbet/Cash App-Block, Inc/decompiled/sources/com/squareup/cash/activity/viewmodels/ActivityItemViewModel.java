package com.squareup.cash.activity.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityItemViewModel {
    public final ItemAccessory accessory;
    public final StackedAvatarViewModel avatar;
    public final AvatarBadgeViewModel avatarBadge;
    public final boolean compact;
    public final String contentDescription;
    public final boolean isBadged;
    public final ActivityItemPresentationContext presentationContext;
    public final String primaryLabel;
    public final Icons primaryLabelIcon;
    public final ReactionsState reactionsState;
    public final String rowId;
    public final String secondaryLabel;
    public final String tertiaryLabel;

    public ActivityItemViewModel(String str, String str2, String str3, String str4, ItemAccessory itemAccessory, StackedAvatarViewModel stackedAvatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, boolean z, ActivityItemPresentationContext activityItemPresentationContext, Icons icons, ReactionsState reactionsState, String str5, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        stackedAvatarViewModel.getClass();
        activityItemPresentationContext.getClass();
        reactionsState.getClass();
        str5.getClass();
        this.rowId = str;
        this.primaryLabel = str2;
        this.secondaryLabel = str3;
        this.tertiaryLabel = str4;
        this.accessory = itemAccessory;
        this.avatar = stackedAvatarViewModel;
        this.avatarBadge = avatarBadgeViewModel;
        this.isBadged = z;
        this.presentationContext = activityItemPresentationContext;
        this.primaryLabelIcon = icons;
        this.reactionsState = reactionsState;
        this.contentDescription = str5;
        this.compact = z2;
    }

    public static ActivityItemViewModel copy$default(ActivityItemViewModel activityItemViewModel, String str, ItemAccessory itemAccessory, boolean z, int i) {
        String str2 = (i & 1) != 0 ? activityItemViewModel.rowId : str;
        String str3 = activityItemViewModel.primaryLabel;
        String str4 = activityItemViewModel.secondaryLabel;
        String str5 = activityItemViewModel.tertiaryLabel;
        ItemAccessory itemAccessory2 = (i & 16) != 0 ? activityItemViewModel.accessory : itemAccessory;
        StackedAvatarViewModel stackedAvatarViewModel = activityItemViewModel.avatar;
        AvatarBadgeViewModel avatarBadgeViewModel = activityItemViewModel.avatarBadge;
        boolean z2 = (i & 128) != 0 ? activityItemViewModel.isBadged : false;
        ActivityItemPresentationContext activityItemPresentationContext = activityItemViewModel.presentationContext;
        Icons icons = activityItemViewModel.primaryLabelIcon;
        ReactionsState reactionsState = activityItemViewModel.reactionsState;
        String str6 = activityItemViewModel.contentDescription;
        boolean z3 = (i & 4096) != 0 ? activityItemViewModel.compact : z;
        activityItemViewModel.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        stackedAvatarViewModel.getClass();
        activityItemPresentationContext.getClass();
        reactionsState.getClass();
        str6.getClass();
        return new ActivityItemViewModel(str2, str3, str4, str5, itemAccessory2, stackedAvatarViewModel, avatarBadgeViewModel, z2, activityItemPresentationContext, icons, reactionsState, str6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityItemViewModel)) {
            return false;
        }
        ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) obj;
        return Intrinsics.areEqual(this.rowId, activityItemViewModel.rowId) && Intrinsics.areEqual(this.primaryLabel, activityItemViewModel.primaryLabel) && Intrinsics.areEqual(this.secondaryLabel, activityItemViewModel.secondaryLabel) && Intrinsics.areEqual(this.tertiaryLabel, activityItemViewModel.tertiaryLabel) && Intrinsics.areEqual(this.accessory, activityItemViewModel.accessory) && Intrinsics.areEqual(this.avatar, activityItemViewModel.avatar) && Intrinsics.areEqual(this.avatarBadge, activityItemViewModel.avatarBadge) && this.isBadged == activityItemViewModel.isBadged && Intrinsics.areEqual(this.presentationContext, activityItemViewModel.presentationContext) && this.primaryLabelIcon == activityItemViewModel.primaryLabelIcon && Intrinsics.areEqual(this.reactionsState, activityItemViewModel.reactionsState) && Intrinsics.areEqual(this.contentDescription, activityItemViewModel.contentDescription) && this.compact == activityItemViewModel.compact;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rowId.hashCode() * 31, 31, this.primaryLabel), 31, this.secondaryLabel);
        String str = this.tertiaryLabel;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        ItemAccessory itemAccessory = this.accessory;
        int hashCode2 = (this.avatar.hashCode() + ((hashCode + (itemAccessory == null ? 0 : itemAccessory.hashCode())) * 31)) * 31;
        AvatarBadgeViewModel avatarBadgeViewModel = this.avatarBadge;
        int hashCode3 = (this.presentationContext.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31, 31, this.isBadged)) * 31;
        Icons icons = this.primaryLabelIcon;
        return Boolean.hashCode(this.compact) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.reactionsState.hashCode() + ((hashCode3 + (icons != null ? icons.hashCode() : 0)) * 31)) * 31, 31, this.contentDescription);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityItemViewModel(rowId=", this.rowId, ", primaryLabel=", this.primaryLabel, ", secondaryLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.secondaryLabel, ", tertiaryLabel=", this.tertiaryLabel, ", accessory=");
        m.append(this.accessory);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", avatarBadge=");
        m.append(this.avatarBadge);
        m.append(", isBadged=");
        m.append(this.isBadged);
        m.append(", presentationContext=");
        m.append(this.presentationContext);
        m.append(", primaryLabelIcon=");
        m.append(this.primaryLabelIcon);
        m.append(", reactionsState=");
        m.append(this.reactionsState);
        m.append(", contentDescription=");
        m.append(this.contentDescription);
        m.append(", compact=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.compact, ")");
    }

    public /* synthetic */ ActivityItemViewModel(String str, String str2, String str3, String str4, ItemAccessory itemAccessory, StackedAvatarViewModel stackedAvatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, boolean z, ActivityItemPresentationContext activityItemPresentationContext, Icons icons, ReactionsState reactionsState, String str5, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, itemAccessory, stackedAvatarViewModel, avatarBadgeViewModel, z, activityItemPresentationContext, (i & 512) != 0 ? null : icons, (i & 1024) != 0 ? ReactionsState.Hidden.INSTANCE : reactionsState, str5, (i & 4096) == 0);
    }
}
