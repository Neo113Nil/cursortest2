package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RewardStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ReferralStatusPresentationArgs$RewardInfo implements Parcelable {
    public static final Parcelable.Creator<ReferralStatusPresentationArgs$RewardInfo> CREATOR = new Alias.Creator(13);
    public final int availablePayments;
    public final int completedPayments;
    public final RewardStatus.Expiration expiration;
    public final String headerText;
    public final String mainText;
    public final Money paymentAmount;

    public ReferralStatusPresentationArgs$RewardInfo(int i, int i2, Money money, RewardStatus.Expiration expiration, String str, String str2) {
        money.getClass();
        this.availablePayments = i;
        this.completedPayments = i2;
        this.paymentAmount = money;
        this.expiration = expiration;
        this.headerText = str;
        this.mainText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralStatusPresentationArgs$RewardInfo)) {
            return false;
        }
        ReferralStatusPresentationArgs$RewardInfo referralStatusPresentationArgs$RewardInfo = (ReferralStatusPresentationArgs$RewardInfo) obj;
        return this.availablePayments == referralStatusPresentationArgs$RewardInfo.availablePayments && this.completedPayments == referralStatusPresentationArgs$RewardInfo.completedPayments && Intrinsics.areEqual(this.paymentAmount, referralStatusPresentationArgs$RewardInfo.paymentAmount) && this.expiration == referralStatusPresentationArgs$RewardInfo.expiration && Intrinsics.areEqual(this.headerText, referralStatusPresentationArgs$RewardInfo.headerText) && Intrinsics.areEqual(this.mainText, referralStatusPresentationArgs$RewardInfo.mainText);
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.paymentAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.completedPayments, Integer.hashCode(this.availablePayments) * 31, 31), 31);
        RewardStatus.Expiration expiration = this.expiration;
        int hashCode = (m + (expiration == null ? 0 : expiration.hashCode())) * 31;
        String str = this.headerText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.availablePayments, this.completedPayments, "RewardInfo(availablePayments=", ", completedPayments=", ", paymentAmount=");
        m107m.append(this.paymentAmount);
        m107m.append(", expiration=");
        m107m.append(this.expiration);
        m107m.append(", headerText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, this.headerText, ", mainText=", this.mainText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.availablePayments);
        parcel.writeInt(this.completedPayments);
        parcel.writeParcelable(this.paymentAmount, i);
        RewardStatus.Expiration expiration = this.expiration;
        if (expiration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(expiration.name());
        }
        parcel.writeString(this.headerText);
        parcel.writeString(this.mainText);
    }
}
