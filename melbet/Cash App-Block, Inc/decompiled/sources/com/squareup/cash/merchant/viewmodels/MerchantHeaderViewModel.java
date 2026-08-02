package com.squareup.cash.merchant.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantHeaderViewModel {
    public final StackedAvatarViewModel.Single avatarViewModel;
    public final boolean isAvatarClickable;
    public final String name;
    public final String subtitle;

    public MerchantHeaderViewModel(StackedAvatarViewModel.Single single, String str, String str2, boolean z) {
        this.avatarViewModel = single;
        this.name = str;
        this.subtitle = str2;
        this.isAvatarClickable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantHeaderViewModel)) {
            return false;
        }
        MerchantHeaderViewModel merchantHeaderViewModel = (MerchantHeaderViewModel) obj;
        return this.avatarViewModel.equals(merchantHeaderViewModel.avatarViewModel) && Intrinsics.areEqual(this.name, merchantHeaderViewModel.name) && Intrinsics.areEqual(this.subtitle, merchantHeaderViewModel.subtitle) && this.isAvatarClickable == merchantHeaderViewModel.isAvatarClickable;
    }

    public final int hashCode() {
        int hashCode = this.avatarViewModel.avatar.hashCode() * 961;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return Boolean.hashCode(this.isAvatarClickable) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantHeaderViewModel(avatarViewModel=");
        sb.append(this.avatarViewModel);
        sb.append(", avatarContentDescription=null, name=");
        sb.append(this.name);
        sb.append(", subtitle=");
        return re$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", isAvatarClickable=", this.isAvatarClickable, ")");
    }
}
