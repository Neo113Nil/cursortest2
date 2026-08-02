package com.squareup.cash.merchant.presenters;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantProfilePresenter$HeaderState {
    public final StackedAvatarViewModel.Single avatarViewModel;
    public final String category;
    public final String name;

    public MerchantProfilePresenter$HeaderState(StackedAvatarViewModel.Single single, String str, String str2) {
        str.getClass();
        this.avatarViewModel = single;
        this.name = str;
        this.category = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantProfilePresenter$HeaderState)) {
            return false;
        }
        MerchantProfilePresenter$HeaderState merchantProfilePresenter$HeaderState = (MerchantProfilePresenter$HeaderState) obj;
        return this.avatarViewModel.equals(merchantProfilePresenter$HeaderState.avatarViewModel) && Intrinsics.areEqual(this.name, merchantProfilePresenter$HeaderState.name) && Intrinsics.areEqual(this.category, merchantProfilePresenter$HeaderState.category);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatarViewModel.avatar.hashCode() * 31, 31, this.name);
        String str = this.category;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderState(avatarViewModel=");
        sb.append(this.avatarViewModel);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", category=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.category, ")");
    }
}
