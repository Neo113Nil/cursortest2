package com.squareup.cash.pools.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContributionAnimation {
    public final boolean animationCompleted;
    public final Money contributionAmount;
    public final String contributionAmountFormatted;
    public final Money originalAmount;
    public final String originalAmountFormatted;
    public final float percentage;

    public ContributionAnimation(Money money, String str, Money money2, String str2, float f, boolean z) {
        str.getClass();
        money2.getClass();
        str2.getClass();
        this.contributionAmount = money;
        this.contributionAmountFormatted = str;
        this.originalAmount = money2;
        this.originalAmountFormatted = str2;
        this.percentage = f;
        this.animationCompleted = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContributionAnimation)) {
            return false;
        }
        ContributionAnimation contributionAnimation = (ContributionAnimation) obj;
        return this.contributionAmount.equals(contributionAnimation.contributionAmount) && Intrinsics.areEqual(this.contributionAmountFormatted, contributionAnimation.contributionAmountFormatted) && Intrinsics.areEqual(this.originalAmount, contributionAnimation.originalAmount) && Intrinsics.areEqual(this.originalAmountFormatted, contributionAnimation.originalAmountFormatted) && Float.compare(this.percentage, contributionAnimation.percentage) == 0 && this.animationCompleted == contributionAnimation.animationCompleted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.animationCompleted) + CameraState$Type$EnumUnboxingLocalUtility.m(this.percentage, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.originalAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.contributionAmount.hashCode() * 31, 31, this.contributionAmountFormatted), 31), 31, this.originalAmountFormatted), 31);
    }

    public final String toString() {
        return "ContributionAnimation(contributionAmount=" + this.contributionAmount + ", contributionAmountFormatted=" + this.contributionAmountFormatted + ", originalAmount=" + this.originalAmount + ", originalAmountFormatted=" + this.originalAmountFormatted + ", percentage=" + this.percentage + ", animationCompleted=" + this.animationCompleted + ")";
    }
}
