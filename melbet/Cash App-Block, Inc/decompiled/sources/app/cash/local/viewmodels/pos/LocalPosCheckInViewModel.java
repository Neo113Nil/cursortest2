package app.cash.local.viewmodels.pos;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalPosCheckInViewModel {
    public final boolean canStartCamera;
    public final String checkInExplanation;
    public final String localCashAmount;

    public LocalPosCheckInViewModel(String str, String str2, boolean z) {
        str2.getClass();
        this.localCashAmount = str;
        this.checkInExplanation = str2;
        this.canStartCamera = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalPosCheckInViewModel)) {
            return false;
        }
        LocalPosCheckInViewModel localPosCheckInViewModel = (LocalPosCheckInViewModel) obj;
        return this.localCashAmount.equals(localPosCheckInViewModel.localCashAmount) && Intrinsics.areEqual(this.checkInExplanation, localPosCheckInViewModel.checkInExplanation) && this.canStartCamera == localPosCheckInViewModel.canStartCamera;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canStartCamera) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.localCashAmount.hashCode() * 31, 31, this.checkInExplanation);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalPosCheckInViewModel(localCashAmount=", this.localCashAmount, ", checkInExplanation=", this.checkInExplanation, ", canStartCamera="), this.canStartCamera, ")");
    }
}
