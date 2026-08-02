package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StablecoinWithdrawalOptionRow implements Parcelable {
    public static final Parcelable.Creator<StablecoinWithdrawalOptionRow> CREATOR = new Size.Creator(23);
    public final PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel avatar;
    public final String body;
    public final String label;
    public final StablecoinWithdrawalOption option;

    public StablecoinWithdrawalOptionRow(StablecoinWithdrawalOption stablecoinWithdrawalOption, PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel avatarViewModel, String str, String str2) {
        stablecoinWithdrawalOption.getClass();
        avatarViewModel.getClass();
        str.getClass();
        str2.getClass();
        this.option = stablecoinWithdrawalOption;
        this.avatar = avatarViewModel;
        this.label = str;
        this.body = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinWithdrawalOptionRow)) {
            return false;
        }
        StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow = (StablecoinWithdrawalOptionRow) obj;
        return Intrinsics.areEqual(this.option, stablecoinWithdrawalOptionRow.option) && Intrinsics.areEqual(this.avatar, stablecoinWithdrawalOptionRow.avatar) && Intrinsics.areEqual(this.label, stablecoinWithdrawalOptionRow.label) && Intrinsics.areEqual(this.body, stablecoinWithdrawalOptionRow.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + (this.option.hashCode() * 31)) * 31, 31, this.label);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StablecoinWithdrawalOptionRow(option=");
        sb.append(this.option);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", label=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.label, ", body=", this.body, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.option, i);
        this.avatar.writeToParcel(parcel, i);
        parcel.writeString(this.label);
        parcel.writeString(this.body);
    }
}
