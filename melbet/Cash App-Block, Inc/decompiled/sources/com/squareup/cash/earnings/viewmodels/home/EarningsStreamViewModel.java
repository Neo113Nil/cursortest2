package com.squareup.cash.earnings.viewmodels.home;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsStreamViewModel {
    public final String amount;
    public final StackedAvatarViewModel.Single avatar;
    public final String name;
    public final String streamId;

    public EarningsStreamViewModel(StackedAvatarViewModel.Single single, String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.streamId = str;
        this.avatar = single;
        this.name = str2;
        this.amount = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsStreamViewModel)) {
            return false;
        }
        EarningsStreamViewModel earningsStreamViewModel = (EarningsStreamViewModel) obj;
        return Intrinsics.areEqual(this.streamId, earningsStreamViewModel.streamId) && this.avatar.equals(earningsStreamViewModel.avatar) && Intrinsics.areEqual(this.name, earningsStreamViewModel.name) && Intrinsics.areEqual(this.amount, earningsStreamViewModel.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.avatar.hashCode() + (this.streamId.hashCode() * 31)) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsStreamViewModel(streamId=");
        sb.append(this.streamId);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", name=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.name, ", amount=", this.amount, ")");
    }
}
