package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SetPinViewModel {
    public final ColorModel accentColor;
    public final String helpButtonText;
    public final boolean isLoading;
    public final String labelText;
    public final int pinEntryId;
    public final String primaryButtonText;
    public final String titleText;

    public SetPinViewModel(String str, String str2, String str3, String str4, ColorModel colorModel, boolean z, int i) {
        str.getClass();
        this.titleText = str;
        this.labelText = str2;
        this.primaryButtonText = str3;
        this.helpButtonText = str4;
        this.accentColor = colorModel;
        this.isLoading = z;
        this.pinEntryId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPinViewModel)) {
            return false;
        }
        SetPinViewModel setPinViewModel = (SetPinViewModel) obj;
        return Intrinsics.areEqual(this.titleText, setPinViewModel.titleText) && Intrinsics.areEqual(this.labelText, setPinViewModel.labelText) && Intrinsics.areEqual(this.primaryButtonText, setPinViewModel.primaryButtonText) && Intrinsics.areEqual(this.helpButtonText, setPinViewModel.helpButtonText) && Intrinsics.areEqual(this.accentColor, setPinViewModel.accentColor) && this.isLoading == setPinViewModel.isLoading && this.pinEntryId == setPinViewModel.pinEntryId;
    }

    public final int hashCode() {
        int hashCode = this.titleText.hashCode() * 31;
        String str = this.labelText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryButtonText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.helpButtonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ColorModel colorModel = this.accentColor;
        return Integer.hashCode(this.pinEntryId) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (colorModel != null ? colorModel.hashCode() : 0)) * 31, 31, this.isLoading);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SetPinViewModel(titleText=", this.titleText, ", labelText=", this.labelText, ", primaryButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.primaryButtonText, ", helpButtonText=", this.helpButtonText, ", accentColor=");
        m.append(this.accentColor);
        m.append(", isLoading=");
        m.append(this.isLoading);
        m.append(", pinEntryId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pinEntryId, ")", m);
    }
}
