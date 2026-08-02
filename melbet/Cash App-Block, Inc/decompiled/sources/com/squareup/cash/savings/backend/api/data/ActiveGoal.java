package com.squareup.cash.savings.backend.api.data;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ActiveGoal {
    public final Money amountRemaining;
    public final String completionToken;
    public final String goalFlowParameters;
    public final boolean hasBeenCelebrated;
    public final String iconId;
    public final boolean isMet;
    public final String label;
    public final LastSeenStatus lastSeenStatus;
    public final float progress;
    public final String token;

    public final class LastSeenStatus {
        public final Money amountRemaining;
        public final Money balance;
        public final Float progress;

        public LastSeenStatus(Money money, Float f, Money money2) {
            this.balance = money;
            this.progress = f;
            this.amountRemaining = money2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastSeenStatus)) {
                return false;
            }
            LastSeenStatus lastSeenStatus = (LastSeenStatus) obj;
            return Intrinsics.areEqual(this.balance, lastSeenStatus.balance) && Intrinsics.areEqual((Object) this.progress, (Object) lastSeenStatus.progress) && Intrinsics.areEqual(this.amountRemaining, lastSeenStatus.amountRemaining);
        }

        public final int hashCode() {
            Money money = this.balance;
            int hashCode = (money == null ? 0 : money.hashCode()) * 31;
            Float f = this.progress;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Money money2 = this.amountRemaining;
            return hashCode2 + (money2 != null ? money2.hashCode() : 0);
        }

        public final String toString() {
            return "LastSeenStatus(balance=" + this.balance + ", progress=" + this.progress + ", amountRemaining=" + this.amountRemaining + ")";
        }
    }

    public ActiveGoal(String str, boolean z, String str2, String str3, float f, Money money, String str4, boolean z2, String str5, LastSeenStatus lastSeenStatus) {
        str.getClass();
        this.token = str;
        this.isMet = z;
        this.iconId = str2;
        this.label = str3;
        this.progress = f;
        this.amountRemaining = money;
        this.goalFlowParameters = str4;
        this.hasBeenCelebrated = z2;
        this.completionToken = str5;
        this.lastSeenStatus = lastSeenStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveGoal)) {
            return false;
        }
        ActiveGoal activeGoal = (ActiveGoal) obj;
        return Intrinsics.areEqual(this.token, activeGoal.token) && this.isMet == activeGoal.isMet && Intrinsics.areEqual(this.iconId, activeGoal.iconId) && this.label.equals(activeGoal.label) && Float.compare(this.progress, activeGoal.progress) == 0 && this.amountRemaining.equals(activeGoal.amountRemaining) && this.goalFlowParameters.equals(activeGoal.goalFlowParameters) && this.hasBeenCelebrated == activeGoal.hasBeenCelebrated && Intrinsics.areEqual(this.completionToken, activeGoal.completionToken) && Intrinsics.areEqual(this.lastSeenStatus, activeGoal.lastSeenStatus);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.isMet);
        String str = this.iconId;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amountRemaining, CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.label), 31), 31), 31, this.goalFlowParameters), 31, this.hasBeenCelebrated);
        String str2 = this.completionToken;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LastSeenStatus lastSeenStatus = this.lastSeenStatus;
        return hashCode + (lastSeenStatus != null ? lastSeenStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("ActiveGoal(token=", this.token, ", isMet=", ", iconId=", this.isMet);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.iconId, ", label=", this.label, ", progress=");
        m1540m.append(this.progress);
        m1540m.append(", amountRemaining=");
        m1540m.append(this.amountRemaining);
        m1540m.append(", goalFlowParameters=");
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.goalFlowParameters, ", hasBeenCelebrated=", this.hasBeenCelebrated, ", completionToken=");
        m1540m.append(this.completionToken);
        m1540m.append(", lastSeenStatus=");
        m1540m.append(this.lastSeenStatus);
        m1540m.append(")");
        return m1540m.toString();
    }
}
