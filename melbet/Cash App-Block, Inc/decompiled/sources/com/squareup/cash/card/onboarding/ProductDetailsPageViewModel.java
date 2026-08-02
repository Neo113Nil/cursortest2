package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProductDetailsPageViewModel {
    public final CtaAction ctaAction;
    public final String ctaLabel;
    public final boolean notified;
    public final String pageTitle;
    public final String paymentDeviceId;
    public final String personalizeLabel;
    public final List sections;
    public final ProductDetailsPageToastLabel toastLabel;

    public ProductDetailsPageViewModel(String str, String str2, List list, String str3, CtaAction ctaAction, String str4, ProductDetailsPageToastLabel productDetailsPageToastLabel, boolean z) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.paymentDeviceId = str;
        this.pageTitle = str2;
        this.sections = list;
        this.ctaLabel = str3;
        this.ctaAction = ctaAction;
        this.personalizeLabel = str4;
        this.toastLabel = productDetailsPageToastLabel;
        this.notified = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsPageViewModel)) {
            return false;
        }
        ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) obj;
        return Intrinsics.areEqual(this.paymentDeviceId, productDetailsPageViewModel.paymentDeviceId) && Intrinsics.areEqual(this.pageTitle, productDetailsPageViewModel.pageTitle) && Intrinsics.areEqual(this.sections, productDetailsPageViewModel.sections) && Intrinsics.areEqual(this.ctaLabel, productDetailsPageViewModel.ctaLabel) && Intrinsics.areEqual(this.ctaAction, productDetailsPageViewModel.ctaAction) && Intrinsics.areEqual(this.personalizeLabel, productDetailsPageViewModel.personalizeLabel) && Intrinsics.areEqual(this.toastLabel, productDetailsPageViewModel.toastLabel) && this.notified == productDetailsPageViewModel.notified;
    }

    public final int hashCode() {
        int hashCode = (this.ctaAction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.paymentDeviceId.hashCode() * 31, 31, this.pageTitle), 31, this.sections), 31, this.ctaLabel)) * 31;
        String str = this.personalizeLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProductDetailsPageToastLabel productDetailsPageToastLabel = this.toastLabel;
        return Boolean.hashCode(this.notified) + ((hashCode2 + (productDetailsPageToastLabel != null ? productDetailsPageToastLabel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProductDetailsPageViewModel(paymentDeviceId=", this.paymentDeviceId, ", pageTitle=", this.pageTitle, ", sections=");
        Recorder$$ExternalSyntheticOutline2.m(", ctaLabel=", this.ctaLabel, ", ctaAction=", m, this.sections);
        m.append(this.ctaAction);
        m.append(", personalizeLabel=");
        m.append(this.personalizeLabel);
        m.append(", toastLabel=");
        m.append(this.toastLabel);
        m.append(", notified=");
        m.append(this.notified);
        m.append(")");
        return m.toString();
    }
}
