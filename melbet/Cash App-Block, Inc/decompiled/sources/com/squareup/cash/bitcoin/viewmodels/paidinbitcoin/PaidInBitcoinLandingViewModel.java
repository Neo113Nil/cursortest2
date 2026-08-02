package com.squareup.cash.bitcoin.viewmodels.paidinbitcoin;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PaidInBitcoinLandingViewModel {
    public final String selectPercentageButton;
    public final boolean showSignUpContent;
    public final String subtitle;

    public PaidInBitcoinLandingViewModel(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.showSignUpContent = z;
        this.subtitle = str;
        this.selectPercentageButton = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidInBitcoinLandingViewModel)) {
            return false;
        }
        PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel = (PaidInBitcoinLandingViewModel) obj;
        return this.showSignUpContent == paidInBitcoinLandingViewModel.showSignUpContent && Intrinsics.areEqual(this.subtitle, paidInBitcoinLandingViewModel.subtitle) && Intrinsics.areEqual(this.selectPercentageButton, paidInBitcoinLandingViewModel.selectPercentageButton);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_graph) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.drawable.ic_percent, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showSignUpContent) * 31, 31, this.subtitle), 31, this.selectPercentageButton), 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PaidInBitcoinLandingViewModel(showSignUpContent=", ", subtitle=", this.subtitle, ", selectPercentageButton=", this.showSignUpContent);
        Boxes$$ExternalSyntheticOutline1.m(m, this.selectPercentageButton, ", percentRes=", R.drawable.ic_percent, ", graphRes=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.drawable.ic_graph, ")", m);
    }
}
