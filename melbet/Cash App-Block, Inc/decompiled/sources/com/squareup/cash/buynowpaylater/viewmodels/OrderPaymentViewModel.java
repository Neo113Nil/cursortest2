package com.squareup.cash.buynowpaylater.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OrderPaymentViewModel implements Parcelable {
    public static final Parcelable.Creator<OrderPaymentViewModel> CREATOR = new BorrowLimitHub.Creator(19);
    public final TextModel details;
    public final Image image;
    public final TextModel infoText;
    public final TextModel infoTitle;
    public final TextModel name;
    public final String paymentMethodId;

    public OrderPaymentViewModel(Image image, TextModel textModel, TextModel textModel2, TextModel textModel3, TextModel textModel4, String str) {
        this.image = image;
        this.name = textModel;
        this.details = textModel2;
        this.infoTitle = textModel3;
        this.infoText = textModel4;
        this.paymentMethodId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPaymentViewModel)) {
            return false;
        }
        OrderPaymentViewModel orderPaymentViewModel = (OrderPaymentViewModel) obj;
        return Intrinsics.areEqual(this.image, orderPaymentViewModel.image) && Intrinsics.areEqual(this.name, orderPaymentViewModel.name) && Intrinsics.areEqual(this.details, orderPaymentViewModel.details) && Intrinsics.areEqual(this.infoTitle, orderPaymentViewModel.infoTitle) && Intrinsics.areEqual(this.infoText, orderPaymentViewModel.infoText) && Intrinsics.areEqual(this.paymentMethodId, orderPaymentViewModel.paymentMethodId);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        TextModel textModel = this.name;
        int hashCode2 = (hashCode + (textModel == null ? 0 : textModel.hashCode())) * 31;
        TextModel textModel2 = this.details;
        int hashCode3 = (hashCode2 + (textModel2 == null ? 0 : textModel2.hashCode())) * 31;
        TextModel textModel3 = this.infoTitle;
        int hashCode4 = (hashCode3 + (textModel3 == null ? 0 : textModel3.hashCode())) * 31;
        TextModel textModel4 = this.infoText;
        int hashCode5 = (hashCode4 + (textModel4 == null ? 0 : textModel4.hashCode())) * 31;
        String str = this.paymentMethodId;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OrderPaymentViewModel(image=" + this.image + ", name=" + this.name + ", details=" + this.details + ", infoTitle=" + this.infoTitle + ", infoText=" + this.infoText + ", paymentMethodId=" + this.paymentMethodId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.image, i);
        TextModel textModel = this.name;
        if (textModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textModel.writeToParcel(parcel, i);
        }
        TextModel textModel2 = this.details;
        if (textModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textModel2.writeToParcel(parcel, i);
        }
        TextModel textModel3 = this.infoTitle;
        if (textModel3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textModel3.writeToParcel(parcel, i);
        }
        TextModel textModel4 = this.infoText;
        if (textModel4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textModel4.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentMethodId);
    }
}
