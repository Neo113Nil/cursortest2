package com.squareup.cash.shopping.sup.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SingleUsePaymentAddCardViewModel {
    public final String buttonText;
    public final String message;
    public final String title;

    public SingleUsePaymentAddCardViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentAddCardViewModel)) {
            return false;
        }
        SingleUsePaymentAddCardViewModel singleUsePaymentAddCardViewModel = (SingleUsePaymentAddCardViewModel) obj;
        return Intrinsics.areEqual(this.title, singleUsePaymentAddCardViewModel.title) && Intrinsics.areEqual(this.message, singleUsePaymentAddCardViewModel.message) && Intrinsics.areEqual(this.buttonText, singleUsePaymentAddCardViewModel.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SingleUsePaymentAddCardViewModel(title=", this.title, ", message=", this.message, ", buttonText="), this.buttonText, ")");
    }
}
