package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SavingsFullActivityScreen implements SavingsScreen, RestoringScreen {
    public static final Parcelable.Creator<SavingsFullActivityScreen> CREATOR = new Recipient.Creator(29);
    public final String customerToken;
    public final String filterToken;
    public final ActivityScope scope;
    public final ActivityTokenType tokenType;

    public SavingsFullActivityScreen(ActivityScope activityScope, ActivityTokenType activityTokenType, String str, String str2) {
        activityTokenType.getClass();
        activityScope.getClass();
        this.tokenType = activityTokenType;
        this.filterToken = str;
        this.customerToken = str2;
        this.scope = activityScope;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsFullActivityScreen)) {
            return false;
        }
        SavingsFullActivityScreen savingsFullActivityScreen = (SavingsFullActivityScreen) obj;
        return this.tokenType == savingsFullActivityScreen.tokenType && Intrinsics.areEqual(this.filterToken, savingsFullActivityScreen.filterToken) && Intrinsics.areEqual(this.customerToken, savingsFullActivityScreen.customerToken) && this.scope == savingsFullActivityScreen.scope;
    }

    public final int hashCode() {
        int hashCode = this.tokenType.hashCode() * 31;
        String str = this.filterToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerToken;
        return this.scope.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SavingsFullActivityScreen(tokenType=" + this.tokenType + ", filterToken=" + this.filterToken + ", customerToken=" + this.customerToken + ", scope=" + this.scope + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.tokenType.name());
        parcel.writeString(this.filterToken);
        parcel.writeString(this.customerToken);
        parcel.writeString(this.scope.name());
    }

    public /* synthetic */ SavingsFullActivityScreen(ActivityTokenType activityTokenType, String str, ActivityScope activityScope, int i) {
        this((i & 8) != 0 ? ActivityScope.MY_ACTIVITY : activityScope, activityTokenType, str, (String) null);
    }
}
