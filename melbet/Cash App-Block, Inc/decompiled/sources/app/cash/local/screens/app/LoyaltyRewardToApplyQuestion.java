package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import app.cash.passcode.screens.EndAppLock;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LoyaltyRewardToApplyQuestion implements Question {
    public static final Parcelable.Creator<LoyaltyRewardToApplyQuestion> CREATOR = new EndAppLock.Creator(11);
    public final LocalLoyaltyAccount loyaltyAccount;
    public final LocalLoyaltyProgram loyaltyProgram;

    public LoyaltyRewardToApplyQuestion(LocalLoyaltyProgram localLoyaltyProgram, LocalLoyaltyAccount localLoyaltyAccount) {
        localLoyaltyProgram.getClass();
        localLoyaltyAccount.getClass();
        this.loyaltyProgram = localLoyaltyProgram;
        this.loyaltyAccount = localLoyaltyAccount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyRewardToApplyQuestion)) {
            return false;
        }
        LoyaltyRewardToApplyQuestion loyaltyRewardToApplyQuestion = (LoyaltyRewardToApplyQuestion) obj;
        return Intrinsics.areEqual(this.loyaltyProgram, loyaltyRewardToApplyQuestion.loyaltyProgram) && Intrinsics.areEqual(this.loyaltyAccount, loyaltyRewardToApplyQuestion.loyaltyAccount);
    }

    public final int hashCode() {
        return this.loyaltyAccount.hashCode() + (this.loyaltyProgram.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyRewardToApplyQuestion(loyaltyProgram=" + this.loyaltyProgram + ", loyaltyAccount=" + this.loyaltyAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.loyaltyProgram, i);
        parcel.writeParcelable(this.loyaltyAccount, i);
    }
}
