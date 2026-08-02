package com.squareup.cash.savings.backend.api.mappers;

import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.SavingsExternalReference;

/* loaded from: classes10.dex */
public final class SavingsExternalReferenceId {
    public final SavingsExternalReference savingsExternalReference;
    public final SavingsScreen.ScreenType screenType;

    public SavingsExternalReferenceId(SavingsExternalReference savingsExternalReference, SavingsScreen.ScreenType screenType) {
        savingsExternalReference.getClass();
        screenType.getClass();
        this.savingsExternalReference = savingsExternalReference;
        this.screenType = screenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsExternalReferenceId)) {
            return false;
        }
        SavingsExternalReferenceId savingsExternalReferenceId = (SavingsExternalReferenceId) obj;
        return this.savingsExternalReference == savingsExternalReferenceId.savingsExternalReference && Intrinsics.areEqual(this.screenType, savingsExternalReferenceId.screenType);
    }

    public final int hashCode() {
        return this.screenType.hashCode() + (this.savingsExternalReference.hashCode() * 31);
    }

    public final String toString() {
        return "SavingsExternalReferenceId(savingsExternalReference=" + this.savingsExternalReference + ", screenType=" + this.screenType + ")";
    }
}
