package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ControlDisablingConfirmationViewModel {
    public final String cancelButtonText;
    public final String confirmButtonText;
    public final String message;
    public final boolean showDarkConfirm;
    public final String title;

    public ControlDisablingConfirmationViewModel(String str, String str2, String str3, String str4, boolean z) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.confirmButtonText = str3;
        this.cancelButtonText = str4;
        this.showDarkConfirm = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlDisablingConfirmationViewModel)) {
            return false;
        }
        ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel = (ControlDisablingConfirmationViewModel) obj;
        return Intrinsics.areEqual(this.title, controlDisablingConfirmationViewModel.title) && Intrinsics.areEqual(this.message, controlDisablingConfirmationViewModel.message) && Intrinsics.areEqual(this.confirmButtonText, controlDisablingConfirmationViewModel.confirmButtonText) && Intrinsics.areEqual(this.cancelButtonText, controlDisablingConfirmationViewModel.cancelButtonText) && this.showDarkConfirm == controlDisablingConfirmationViewModel.showDarkConfirm;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showDarkConfirm) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.confirmButtonText), 31, this.cancelButtonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ControlDisablingConfirmationViewModel(title=", this.title, ", message=", this.message, ", confirmButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.confirmButtonText, ", cancelButtonText=", this.cancelButtonText, ", showDarkConfirm=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showDarkConfirm, ")");
    }
}
