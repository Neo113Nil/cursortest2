package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InstrumentSelectionDetailsSheetViewModel {
    public final InstrumentAvatarViewModel avatar;
    public final String closeButtonText;
    public final BlockerAction continueButtonAction;
    public final String continueButtonText;
    public final int optionId;
    public final String subtitle;
    public final String title;

    public InstrumentSelectionDetailsSheetViewModel(int i, InstrumentAvatarViewModel instrumentAvatarViewModel, String str, String str2, String str3, BlockerAction blockerAction, String str4) {
        str.getClass();
        blockerAction.getClass();
        str4.getClass();
        this.optionId = i;
        this.avatar = instrumentAvatarViewModel;
        this.title = str;
        this.subtitle = str2;
        this.continueButtonText = str3;
        this.continueButtonAction = blockerAction;
        this.closeButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionDetailsSheetViewModel)) {
            return false;
        }
        InstrumentSelectionDetailsSheetViewModel instrumentSelectionDetailsSheetViewModel = (InstrumentSelectionDetailsSheetViewModel) obj;
        return this.optionId == instrumentSelectionDetailsSheetViewModel.optionId && this.avatar.equals(instrumentSelectionDetailsSheetViewModel.avatar) && Intrinsics.areEqual(this.title, instrumentSelectionDetailsSheetViewModel.title) && Intrinsics.areEqual(this.subtitle, instrumentSelectionDetailsSheetViewModel.subtitle) && Intrinsics.areEqual(this.continueButtonText, instrumentSelectionDetailsSheetViewModel.continueButtonText) && Intrinsics.areEqual(this.continueButtonAction, instrumentSelectionDetailsSheetViewModel.continueButtonAction) && Intrinsics.areEqual(this.closeButtonText, instrumentSelectionDetailsSheetViewModel.closeButtonText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + (Integer.hashCode(this.optionId) * 31)) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.continueButtonText;
        return this.closeButtonText.hashCode() + ((this.continueButtonAction.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentSelectionDetailsSheetViewModel(optionId=");
        sb.append(this.optionId);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", continueButtonText=");
        sb.append(this.continueButtonText);
        sb.append(", continueButtonAction=");
        sb.append(this.continueButtonAction);
        sb.append(", closeButtonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.closeButtonText, ")");
    }
}
