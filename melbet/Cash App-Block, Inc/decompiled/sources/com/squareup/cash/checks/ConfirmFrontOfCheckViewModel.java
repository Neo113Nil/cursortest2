package com.squareup.cash.checks;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmFrontOfCheckViewModel {
    public final String amountConfirmation;
    public final String callToAction;
    public final String confirmation;
    public final String description;
    public final boolean isCallToActionEnabled;
    public final boolean isConfirmationChecked;
    public final String nameConfirmation;
    public final String title;

    public ConfirmFrontOfCheckViewModel(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str4, str5, str6);
        this.title = str;
        this.description = str2;
        this.amountConfirmation = str3;
        this.nameConfirmation = str4;
        this.confirmation = str5;
        this.callToAction = str6;
        this.isCallToActionEnabled = z;
        this.isConfirmationChecked = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmFrontOfCheckViewModel)) {
            return false;
        }
        ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = (ConfirmFrontOfCheckViewModel) obj;
        return Intrinsics.areEqual(this.title, confirmFrontOfCheckViewModel.title) && Intrinsics.areEqual(this.description, confirmFrontOfCheckViewModel.description) && this.amountConfirmation.equals(confirmFrontOfCheckViewModel.amountConfirmation) && Intrinsics.areEqual(this.nameConfirmation, confirmFrontOfCheckViewModel.nameConfirmation) && Intrinsics.areEqual(this.confirmation, confirmFrontOfCheckViewModel.confirmation) && Intrinsics.areEqual(this.callToAction, confirmFrontOfCheckViewModel.callToAction) && this.isCallToActionEnabled == confirmFrontOfCheckViewModel.isCallToActionEnabled && this.isConfirmationChecked == confirmFrontOfCheckViewModel.isConfirmationChecked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isConfirmationChecked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.amountConfirmation), 31, this.nameConfirmation), 31, this.confirmation), 31, this.callToAction), 31, this.isCallToActionEnabled);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmFrontOfCheckViewModel(title=", this.title, ", description=", this.description, ", amountConfirmation=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.amountConfirmation, ", nameConfirmation=", this.nameConfirmation, ", confirmation=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.confirmation, ", callToAction=", this.callToAction, ", isCallToActionEnabled=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isCallToActionEnabled, ", isConfirmationChecked=", this.isConfirmationChecked, ")");
    }
}
