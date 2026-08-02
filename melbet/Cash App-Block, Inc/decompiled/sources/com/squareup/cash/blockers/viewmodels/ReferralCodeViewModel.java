package com.squareup.cash.blockers.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ReferralCodeViewModel {
    public final boolean allowCodeInput;
    public final boolean allowSubmission;
    public final boolean animateHeaderIn;
    public final String codeOverride;
    public final Header header;
    public final boolean invalidSubmission;
    public final boolean preventSkipping;
    public final boolean showLoadingScreen;

    public ReferralCodeViewModel(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, Header header, boolean z6) {
        header.getClass();
        this.preventSkipping = z;
        this.allowSubmission = z2;
        this.codeOverride = str;
        this.allowCodeInput = z3;
        this.showLoadingScreen = z4;
        this.invalidSubmission = z5;
        this.header = header;
        this.animateHeaderIn = z6;
    }

    public static ReferralCodeViewModel copy$default(ReferralCodeViewModel referralCodeViewModel, boolean z, boolean z2, boolean z3, boolean z4, Header header, boolean z5, int i) {
        boolean z6 = referralCodeViewModel.preventSkipping;
        if ((i & 2) != 0) {
            z = referralCodeViewModel.allowSubmission;
        }
        boolean z7 = z;
        String str = (i & 4) != 0 ? referralCodeViewModel.codeOverride : null;
        if ((i & 8) != 0) {
            z2 = referralCodeViewModel.allowCodeInput;
        }
        boolean z8 = z2;
        if ((i & 16) != 0) {
            z3 = referralCodeViewModel.showLoadingScreen;
        }
        boolean z9 = z3;
        if ((i & 32) != 0) {
            z4 = referralCodeViewModel.invalidSubmission;
        }
        boolean z10 = z4;
        if ((i & 64) != 0) {
            header = referralCodeViewModel.header;
        }
        Header header2 = header;
        boolean z11 = (i & 128) != 0 ? referralCodeViewModel.animateHeaderIn : z5;
        referralCodeViewModel.getClass();
        header2.getClass();
        return new ReferralCodeViewModel(z6, z7, str, z8, z9, z10, header2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralCodeViewModel)) {
            return false;
        }
        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
        return this.preventSkipping == referralCodeViewModel.preventSkipping && this.allowSubmission == referralCodeViewModel.allowSubmission && Intrinsics.areEqual(this.codeOverride, referralCodeViewModel.codeOverride) && this.allowCodeInput == referralCodeViewModel.allowCodeInput && this.showLoadingScreen == referralCodeViewModel.showLoadingScreen && this.invalidSubmission == referralCodeViewModel.invalidSubmission && Intrinsics.areEqual(this.header, referralCodeViewModel.header) && this.animateHeaderIn == referralCodeViewModel.animateHeaderIn;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.preventSkipping) * 31, 31, this.allowSubmission);
        String str = this.codeOverride;
        return Boolean.hashCode(this.animateHeaderIn) + ((this.header.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.allowCodeInput), 31, this.showLoadingScreen), 31, this.invalidSubmission)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ReferralCodeViewModel(preventSkipping=", ", allowSubmission=", ", codeOverride=", this.preventSkipping, this.allowSubmission);
        NavAction$$ExternalSyntheticOutline0.m(m, this.codeOverride, ", allowCodeInput=", this.allowCodeInput, ", showLoadingScreen=");
        re$$ExternalSyntheticOutline0.m(m, this.showLoadingScreen, ", invalidSubmission=", this.invalidSubmission, ", header=");
        m.append(this.header);
        m.append(", animateHeaderIn=");
        m.append(this.animateHeaderIn);
        m.append(")");
        return m.toString();
    }
}
