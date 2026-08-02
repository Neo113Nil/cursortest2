package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DirectDepositUpdateManualFormScreen implements DirectDepositManualSetupScreen {
    public static final Parcelable.Creator<DirectDepositUpdateManualFormScreen> CREATOR = new Limit.Creator(19);
    public final String token;

    public DirectDepositUpdateManualFormScreen(String str) {
        str.getClass();
        this.token = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectDepositUpdateManualFormScreen) && Intrinsics.areEqual(this.token, ((DirectDepositUpdateManualFormScreen) obj).token);
    }

    @Override // com.squareup.cash.directdeposit.screens.DirectDepositManualSetupScreen
    public final String getToken() {
        throw null;
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DirectDepositUpdateManualFormScreen(token=", this.token, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
    }
}
