package com.squareup.cash.p2pblocking.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PListRowModel {
    public final StackedAvatarViewModel.Avatar avatar;
    public final Icons badgeIcon;
    public final boolean buttonIsDestructive;
    public final boolean buttonIsProminent;
    public final String buttonLabel;
    public final String customerToken;
    public final String fullName;
    public final P2PListRowTapAvatarEvent onTapAvatarEvent;
    public final P2PListRowTapButtonEvent onTapButtonEvent;
    public final String subtitle;

    public /* synthetic */ P2PListRowModel(String str, StackedAvatarViewModel.Avatar avatar, String str2, String str3, boolean z, String str4, Icons icons, P2PListRowTapButtonEvent p2PListRowTapButtonEvent, P2PListRowTapAvatarEvent p2PListRowTapAvatarEvent, int i) {
        this(str, avatar, str2, str3, (i & 16) != 0 ? false : z, false, str4, (i & 128) != 0 ? null : icons, p2PListRowTapButtonEvent, p2PListRowTapAvatarEvent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PListRowModel)) {
            return false;
        }
        P2PListRowModel p2PListRowModel = (P2PListRowModel) obj;
        return Intrinsics.areEqual(this.customerToken, p2PListRowModel.customerToken) && Intrinsics.areEqual(this.avatar, p2PListRowModel.avatar) && Intrinsics.areEqual(this.fullName, p2PListRowModel.fullName) && Intrinsics.areEqual(this.buttonLabel, p2PListRowModel.buttonLabel) && this.buttonIsProminent == p2PListRowModel.buttonIsProminent && this.buttonIsDestructive == p2PListRowModel.buttonIsDestructive && Intrinsics.areEqual(this.subtitle, p2PListRowModel.subtitle) && this.badgeIcon == p2PListRowModel.badgeIcon && Intrinsics.areEqual(this.onTapButtonEvent, p2PListRowModel.onTapButtonEvent) && Intrinsics.areEqual(this.onTapAvatarEvent, p2PListRowModel.onTapAvatarEvent);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + (this.customerToken.hashCode() * 31)) * 31, 31, this.fullName), 31, this.buttonLabel), 31, this.buttonIsProminent), 31, this.buttonIsDestructive), 31, this.subtitle);
        Icons icons = this.badgeIcon;
        int hashCode = (m + (icons == null ? 0 : icons.hashCode())) * 31;
        P2PListRowTapButtonEvent p2PListRowTapButtonEvent = this.onTapButtonEvent;
        return this.onTapAvatarEvent.customerToken.hashCode() + ((hashCode + (p2PListRowTapButtonEvent != null ? p2PListRowTapButtonEvent.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("P2PListRowModel(customerToken=");
        sb.append(this.customerToken);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", fullName=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.fullName, ", buttonLabel=", this.buttonLabel, ", buttonIsProminent=");
        re$$ExternalSyntheticOutline0.m(sb, this.buttonIsProminent, ", buttonIsDestructive=", this.buttonIsDestructive, ", subtitle=");
        sb.append(this.subtitle);
        sb.append(", badgeIcon=");
        sb.append(this.badgeIcon);
        sb.append(", onTapButtonEvent=");
        sb.append(this.onTapButtonEvent);
        sb.append(", onTapAvatarEvent=");
        sb.append(this.onTapAvatarEvent);
        sb.append(")");
        return sb.toString();
    }

    public P2PListRowModel(String str, StackedAvatarViewModel.Avatar avatar, String str2, String str3, boolean z, boolean z2, String str4, Icons icons, P2PListRowTapButtonEvent p2PListRowTapButtonEvent, P2PListRowTapAvatarEvent p2PListRowTapAvatarEvent) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.customerToken = str;
        this.avatar = avatar;
        this.fullName = str2;
        this.buttonLabel = str3;
        this.buttonIsProminent = z;
        this.buttonIsDestructive = z2;
        this.subtitle = str4;
        this.badgeIcon = icons;
        this.onTapButtonEvent = p2PListRowTapButtonEvent;
        this.onTapAvatarEvent = p2PListRowTapAvatarEvent;
    }
}
