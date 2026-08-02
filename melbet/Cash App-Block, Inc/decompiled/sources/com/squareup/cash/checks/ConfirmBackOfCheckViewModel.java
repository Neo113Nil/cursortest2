package com.squareup.cash.checks;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmBackOfCheckViewModel {
    public final String callToAction;
    public final String confirmation;
    public final String description;
    public final String endorsementInstructions;
    public final boolean isCallToActionEnabled;
    public final boolean isConfirmationChecked;
    public final String title;

    public ConfirmBackOfCheckViewModel(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.title = str;
        this.description = str2;
        this.confirmation = str3;
        this.callToAction = str4;
        this.isCallToActionEnabled = z;
        this.endorsementInstructions = str5;
        this.isConfirmationChecked = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmBackOfCheckViewModel)) {
            return false;
        }
        ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = (ConfirmBackOfCheckViewModel) obj;
        return Intrinsics.areEqual(this.title, confirmBackOfCheckViewModel.title) && Intrinsics.areEqual(this.description, confirmBackOfCheckViewModel.description) && Intrinsics.areEqual(this.confirmation, confirmBackOfCheckViewModel.confirmation) && Intrinsics.areEqual(this.callToAction, confirmBackOfCheckViewModel.callToAction) && this.isCallToActionEnabled == confirmBackOfCheckViewModel.isCallToActionEnabled && Intrinsics.areEqual(this.endorsementInstructions, confirmBackOfCheckViewModel.endorsementInstructions) && this.isConfirmationChecked == confirmBackOfCheckViewModel.isConfirmationChecked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isConfirmationChecked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.confirmation), 31, this.callToAction), 31, this.isCallToActionEnabled), 31, this.endorsementInstructions);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmBackOfCheckViewModel(title=", this.title, ", description=", this.description, ", confirmation=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.confirmation, ", callToAction=", this.callToAction, ", isCallToActionEnabled=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.isCallToActionEnabled, ", endorsementInstructions=", this.endorsementInstructions, ", isConfirmationChecked=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isConfirmationChecked, ")");
    }
}
