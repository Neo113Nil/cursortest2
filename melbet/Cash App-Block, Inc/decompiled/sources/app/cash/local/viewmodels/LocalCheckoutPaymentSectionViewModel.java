package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.primitives.PaymentMethodToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutPaymentSectionViewModel {
    public final List paymentMethods;
    public final String selectedPaymentMethodToken;

    public LocalCheckoutPaymentSectionViewModel(String str, List list) {
        str.getClass();
        list.getClass();
        this.selectedPaymentMethodToken = str;
        this.paymentMethods = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutPaymentSectionViewModel)) {
            return false;
        }
        LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = (LocalCheckoutPaymentSectionViewModel) obj;
        return Intrinsics.areEqual(this.selectedPaymentMethodToken, localCheckoutPaymentSectionViewModel.selectedPaymentMethodToken) && Intrinsics.areEqual(this.paymentMethods, localCheckoutPaymentSectionViewModel.paymentMethods);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.selectedPaymentMethodToken.hashCode() * 31, 31, this.paymentMethods), 31, false);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("LocalCheckoutPaymentSectionViewModel(selectedPaymentMethodToken=", PaymentMethodToken.m1282toStringimpl(this.selectedPaymentMethodToken), ", paymentMethods=", ", isExpanded=false, isEnabled=true)", this.paymentMethods);
    }
}
