package com.squareup.cash.history.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProfileTransactionsBarViewModel {
    public final float percentageFilled;
    public final boolean shouldReverseDirection;
    public final String totalReceived;
    public final String totalSent;
    public final String totalTransactionAmountLabel;
    public final String totalTransactionDescriptionLabel;
    public final String totalTransactionsLabel;
    public final BarColorState transactionBarColor;

    public ProfileTransactionsBarViewModel(String str, String str2, String str3, String str4, String str5, float f, boolean z, BarColorState barColorState) {
        str3.getClass();
        this.totalTransactionsLabel = str;
        this.totalTransactionAmountLabel = str2;
        this.totalTransactionDescriptionLabel = str3;
        this.totalReceived = str4;
        this.totalSent = str5;
        this.percentageFilled = f;
        this.shouldReverseDirection = z;
        this.transactionBarColor = barColorState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileTransactionsBarViewModel)) {
            return false;
        }
        ProfileTransactionsBarViewModel profileTransactionsBarViewModel = (ProfileTransactionsBarViewModel) obj;
        return Intrinsics.areEqual(this.totalTransactionsLabel, profileTransactionsBarViewModel.totalTransactionsLabel) && Intrinsics.areEqual(this.totalTransactionAmountLabel, profileTransactionsBarViewModel.totalTransactionAmountLabel) && Intrinsics.areEqual(this.totalTransactionDescriptionLabel, profileTransactionsBarViewModel.totalTransactionDescriptionLabel) && Intrinsics.areEqual(this.totalReceived, profileTransactionsBarViewModel.totalReceived) && Intrinsics.areEqual(this.totalSent, profileTransactionsBarViewModel.totalSent) && Float.compare(this.percentageFilled, profileTransactionsBarViewModel.percentageFilled) == 0 && this.shouldReverseDirection == profileTransactionsBarViewModel.shouldReverseDirection && this.transactionBarColor == profileTransactionsBarViewModel.transactionBarColor;
    }

    public final int hashCode() {
        int hashCode = this.totalTransactionsLabel.hashCode() * 31;
        String str = this.totalTransactionAmountLabel;
        return this.transactionBarColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.percentageFilled, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.totalTransactionDescriptionLabel), 31, this.totalReceived), 31, this.totalSent), 31), 31, this.shouldReverseDirection);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileTransactionsBarViewModel(totalTransactionsLabel=", this.totalTransactionsLabel, ", totalTransactionAmountLabel=", this.totalTransactionAmountLabel, ", totalTransactionDescriptionLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.totalTransactionDescriptionLabel, ", totalReceived=", this.totalReceived, ", totalSent=");
        m.append(this.totalSent);
        m.append(", percentageFilled=");
        m.append(this.percentageFilled);
        m.append(", shouldReverseDirection=");
        m.append(this.shouldReverseDirection);
        m.append(", transactionBarColor=");
        m.append(this.transactionBarColor);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ ProfileTransactionsBarViewModel(String str, String str2, String str3, String str4, float f, boolean z, BarColorState barColorState, int i) {
        this(str, (i & 2) != 0 ? null : str2, str, str3, str4, f, z, barColorState);
    }
}
