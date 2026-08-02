package com.squareup.cash.blockers.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VerifyContactsViewModel {
    public final LoadingAnimationDirection animationDirection;
    public final boolean dismissButtonEnabled;
    public final boolean isLoading;
    public final String nextButtonText;
    public final boolean retreatActionEnabled;
    public final boolean showHelp;
    public final String subtitle;
    public final String title;

    public VerifyContactsViewModel(String str, String str2, boolean z, LoadingAnimationDirection loadingAnimationDirection, boolean z2, String str3, boolean z3, boolean z4) {
        str.getClass();
        str3.getClass();
        this.title = str;
        this.subtitle = str2;
        this.isLoading = z;
        this.animationDirection = loadingAnimationDirection;
        this.showHelp = z2;
        this.nextButtonText = str3;
        this.dismissButtonEnabled = z3;
        this.retreatActionEnabled = z4;
    }

    public static VerifyContactsViewModel copy$default(VerifyContactsViewModel verifyContactsViewModel, boolean z, int i) {
        LoadingAnimationDirection loadingAnimationDirection = LoadingAnimationDirection.BACKWARD;
        String str = verifyContactsViewModel.title;
        String str2 = verifyContactsViewModel.subtitle;
        if ((i & 8) != 0) {
            loadingAnimationDirection = verifyContactsViewModel.animationDirection;
        }
        boolean z2 = verifyContactsViewModel.showHelp;
        String str3 = verifyContactsViewModel.nextButtonText;
        boolean z3 = verifyContactsViewModel.dismissButtonEnabled;
        boolean z4 = verifyContactsViewModel.retreatActionEnabled;
        verifyContactsViewModel.getClass();
        str.getClass();
        str3.getClass();
        return new VerifyContactsViewModel(str, str2, z, loadingAnimationDirection, z2, str3, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyContactsViewModel)) {
            return false;
        }
        VerifyContactsViewModel verifyContactsViewModel = (VerifyContactsViewModel) obj;
        return Intrinsics.areEqual(this.title, verifyContactsViewModel.title) && Intrinsics.areEqual(this.subtitle, verifyContactsViewModel.subtitle) && this.isLoading == verifyContactsViewModel.isLoading && this.animationDirection == verifyContactsViewModel.animationDirection && this.showHelp == verifyContactsViewModel.showHelp && Intrinsics.areEqual(this.nextButtonText, verifyContactsViewModel.nextButtonText) && this.dismissButtonEnabled == verifyContactsViewModel.dismissButtonEnabled && this.retreatActionEnabled == verifyContactsViewModel.retreatActionEnabled;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return Boolean.hashCode(this.retreatActionEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.animationDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLoading)) * 31, 31, this.showHelp), 31, this.nextButtonText), 31, this.dismissButtonEnabled);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VerifyContactsViewModel(title=", this.title, ", subtitle=", this.subtitle, ", isLoading=");
        m.append(this.isLoading);
        m.append(", animationDirection=");
        m.append(this.animationDirection);
        m.append(", showHelp=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.showHelp, ", nextButtonText=", this.nextButtonText, ", dismissButtonEnabled=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.dismissButtonEnabled, ", retreatActionEnabled=", this.retreatActionEnabled, ")");
    }
}
