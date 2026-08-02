package com.squareup.cash.growtools.presenters.manager.roundups;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OriginSpecificData {
    public final boolean active;
    public final GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar avatar;
    public final String emptyText;
    public final boolean isAvatarClickable;
    public final String targetActionButtonText;
    public final String targetName;
    public final String title;
    public final String toggleOffConfirmMessage;
    public final TotalStats totalStats;

    public final class TotalStats {
        public final Money amount;
        public final Integer count;

        public TotalStats(Integer num, Money money) {
            this.count = num;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalStats)) {
                return false;
            }
            TotalStats totalStats = (TotalStats) obj;
            return Intrinsics.areEqual(this.count, totalStats.count) && Intrinsics.areEqual(this.amount, totalStats.amount);
        }

        public final int hashCode() {
            Integer num = this.count;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Money money = this.amount;
            return hashCode + (money != null ? money.hashCode() : 0);
        }

        public final String toString() {
            return "TotalStats(count=" + this.count + ", amount=" + this.amount + ")";
        }
    }

    public OriginSpecificData(String str, String str2, String str3, GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar growToolsAvatar, boolean z, boolean z2, TotalStats totalStats, String str4, String str5) {
        str.getClass();
        str2.getClass();
        growToolsAvatar.getClass();
        str4.getClass();
        str5.getClass();
        this.title = str;
        this.targetName = str2;
        this.targetActionButtonText = str3;
        this.avatar = growToolsAvatar;
        this.isAvatarClickable = z;
        this.active = z2;
        this.totalStats = totalStats;
        this.emptyText = str4;
        this.toggleOffConfirmMessage = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginSpecificData)) {
            return false;
        }
        OriginSpecificData originSpecificData = (OriginSpecificData) obj;
        return Intrinsics.areEqual(this.title, originSpecificData.title) && Intrinsics.areEqual(this.targetName, originSpecificData.targetName) && Intrinsics.areEqual(this.targetActionButtonText, originSpecificData.targetActionButtonText) && Intrinsics.areEqual(this.avatar, originSpecificData.avatar) && this.isAvatarClickable == originSpecificData.isAvatarClickable && this.active == originSpecificData.active && this.totalStats.equals(originSpecificData.totalStats) && Intrinsics.areEqual(this.emptyText, originSpecificData.emptyText) && Intrinsics.areEqual(this.toggleOffConfirmMessage, originSpecificData.toggleOffConfirmMessage);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.targetName);
        String str = this.targetActionButtonText;
        return this.toggleOffConfirmMessage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.totalStats.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.isAvatarClickable), 31, this.active)) * 31, 31, this.emptyText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OriginSpecificData(title=", this.title, ", targetName=", this.targetName, ", targetActionButtonText=");
        m.append(this.targetActionButtonText);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", isAvatarClickable=");
        re$$ExternalSyntheticOutline0.m(m, this.isAvatarClickable, ", active=", this.active, ", totalStats=");
        m.append(this.totalStats);
        m.append(", emptyText=");
        m.append(this.emptyText);
        m.append(", toggleOffConfirmMessage=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.toggleOffConfirmMessage, ")");
    }
}
