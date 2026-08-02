package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutSpecialInstructionsViewModel {
    public final String brandName;
    public final String notes;

    public LocalCheckoutSpecialInstructionsViewModel(String str) {
        str.getClass();
        this.brandName = str;
        this.notes = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutSpecialInstructionsViewModel)) {
            return false;
        }
        LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel = (LocalCheckoutSpecialInstructionsViewModel) obj;
        return Intrinsics.areEqual(this.brandName, localCheckoutSpecialInstructionsViewModel.brandName) && this.notes.equals(localCheckoutSpecialInstructionsViewModel.notes);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brandName.hashCode() * 31, 31, this.notes), 31, false);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalCheckoutSpecialInstructionsViewModel(brandName=", this.brandName, ", notes=", this.notes, ", isChecked=false, isEnabled=true)");
    }
}
