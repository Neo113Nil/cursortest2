package com.squareup.cash.deposits.physical.viewmodels.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositOnboardingViewModel {
    public final String buttonText;
    public final int page;
    public final List pages;

    public PaperMoneyDepositOnboardingViewModel(String str, List list, int i) {
        str.getClass();
        list.getClass();
        this.buttonText = str;
        this.page = i;
        this.pages = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositOnboardingViewModel)) {
            return false;
        }
        PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj;
        return Intrinsics.areEqual(this.buttonText, paperMoneyDepositOnboardingViewModel.buttonText) && this.page == paperMoneyDepositOnboardingViewModel.page && Intrinsics.areEqual(this.pages, paperMoneyDepositOnboardingViewModel.pages);
    }

    public final int hashCode() {
        return this.pages.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.page, this.buttonText.hashCode() * 31, 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m("PaperMoneyDepositOnboardingViewModel(buttonText=", this.page, this.buttonText, ", page=", ", pages="), this.pages, ")");
    }
}
