package com.squareup.cash.banking.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ConfirmCashOutVersionCode implements Parcelable {
    public static final Parcelable.Creator<ConfirmCashOutVersionCode> CREATOR = new SheetAppMessage.Creator(7);
    public final String versionCode;

    public /* synthetic */ ConfirmCashOutVersionCode(String str) {
        this.versionCode = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConfirmCashOutVersionCode) {
            return Intrinsics.areEqual(this.versionCode, ((ConfirmCashOutVersionCode) obj).versionCode);
        }
        return false;
    }

    public final int hashCode() {
        return this.versionCode.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmCashOutVersionCode(versionCode=", this.versionCode, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        parcel.writeString(this.versionCode);
    }
}
