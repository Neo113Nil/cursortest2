package com.squareup.cash.account.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ManagedAccountAnimationInfo implements Parcelable {
    public static final Parcelable.Creator<ManagedAccountAnimationInfo> CREATOR = new zzb(28);
    public final ManagedAccountFlipDirection flipDirection;
    public final String welcomeMessage;

    public ManagedAccountAnimationInfo(String str, ManagedAccountFlipDirection managedAccountFlipDirection) {
        str.getClass();
        managedAccountFlipDirection.getClass();
        this.welcomeMessage = str;
        this.flipDirection = managedAccountFlipDirection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagedAccountAnimationInfo)) {
            return false;
        }
        ManagedAccountAnimationInfo managedAccountAnimationInfo = (ManagedAccountAnimationInfo) obj;
        return Intrinsics.areEqual(this.welcomeMessage, managedAccountAnimationInfo.welcomeMessage) && this.flipDirection == managedAccountAnimationInfo.flipDirection;
    }

    public final int hashCode() {
        return this.flipDirection.hashCode() + (this.welcomeMessage.hashCode() * 31);
    }

    public final String toString() {
        return "ManagedAccountAnimationInfo(welcomeMessage=" + this.welcomeMessage + ", flipDirection=" + this.flipDirection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.welcomeMessage);
        parcel.writeString(this.flipDirection.name());
    }
}
