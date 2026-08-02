package com.squareup.cash.paychecks.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.common.PaymentRecipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaychecksAlertUi implements Parcelable {
    public static final Parcelable.Creator<PaychecksAlertUi> CREATOR = new PaymentRecipient.Creator(1);
    public final String acknowledgeText;
    public final String detail;
    public final String title;

    public PaychecksAlertUi(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.detail = str2;
        this.acknowledgeText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksAlertUi)) {
            return false;
        }
        PaychecksAlertUi paychecksAlertUi = (PaychecksAlertUi) obj;
        return Intrinsics.areEqual(this.title, paychecksAlertUi.title) && Intrinsics.areEqual(this.detail, paychecksAlertUi.detail) && Intrinsics.areEqual(this.acknowledgeText, paychecksAlertUi.acknowledgeText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.acknowledgeText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.detail);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaychecksAlertUi(title=", this.title, ", detail=", this.detail, ", acknowledgeText="), this.acknowledgeText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.detail);
        parcel.writeString(this.acknowledgeText);
    }
}
