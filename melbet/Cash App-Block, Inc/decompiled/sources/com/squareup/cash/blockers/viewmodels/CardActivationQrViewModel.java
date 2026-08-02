package com.squareup.cash.blockers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class CardActivationQrViewModel {
    public final String button;
    public final boolean cameraPermissions;
    public final String instruction;
    public final String title;

    public CardActivationQrViewModel(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.button = str;
        this.title = str2;
        this.instruction = str3;
        this.cameraPermissions = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardActivationQrViewModel)) {
            return false;
        }
        CardActivationQrViewModel cardActivationQrViewModel = (CardActivationQrViewModel) obj;
        return Intrinsics.areEqual(this.button, cardActivationQrViewModel.button) && this.title.equals(cardActivationQrViewModel.title) && Intrinsics.areEqual(this.instruction, cardActivationQrViewModel.instruction) && this.cameraPermissions == cardActivationQrViewModel.cameraPermissions;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.cameraPermissions) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.button.hashCode() * 31, 31, this.title), 31, this.instruction);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardActivationQrViewModel(button=", this.button, ", title=", this.title, ", instruction="), this.instruction, ", cameraPermissions=", this.cameraPermissions, ")");
    }
}
