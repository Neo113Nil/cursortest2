package com.squareup.cash.account.backend;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.clientrouting.data.TargetDestination;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSwitcher$AccountSwitchContinuation implements Parcelable {
    public static final Parcelable.Creator<AccountSwitcher$AccountSwitchContinuation> CREATOR = new zzb(20);
    public final TargetDestination destination;
    public final String flowToken;
    public final AccountSwitcher$AccountSwitchInitiationSource initiationSource;
    public final String originAccountToken;
    public final long startElapsedRealtimeMillis;
    public final String targetAccountCashtag;

    public AccountSwitcher$AccountSwitchContinuation(String str, AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource, String str2, String str3, long j, TargetDestination targetDestination) {
        str.getClass();
        accountSwitcher$AccountSwitchInitiationSource.getClass();
        str2.getClass();
        this.flowToken = str;
        this.initiationSource = accountSwitcher$AccountSwitchInitiationSource;
        this.originAccountToken = str2;
        this.targetAccountCashtag = str3;
        this.startElapsedRealtimeMillis = j;
        this.destination = targetDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitcher$AccountSwitchContinuation)) {
            return false;
        }
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation = (AccountSwitcher$AccountSwitchContinuation) obj;
        return Intrinsics.areEqual(this.flowToken, accountSwitcher$AccountSwitchContinuation.flowToken) && this.initiationSource == accountSwitcher$AccountSwitchContinuation.initiationSource && Intrinsics.areEqual(this.originAccountToken, accountSwitcher$AccountSwitchContinuation.originAccountToken) && Intrinsics.areEqual(this.targetAccountCashtag, accountSwitcher$AccountSwitchContinuation.targetAccountCashtag) && this.startElapsedRealtimeMillis == accountSwitcher$AccountSwitchContinuation.startElapsedRealtimeMillis && Intrinsics.areEqual(this.destination, accountSwitcher$AccountSwitchContinuation.destination);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.initiationSource.hashCode() + (this.flowToken.hashCode() * 31)) * 31, 31, this.originAccountToken);
        String str = this.targetAccountCashtag;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.startElapsedRealtimeMillis);
        TargetDestination targetDestination = this.destination;
        return m2 + (targetDestination != null ? targetDestination.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSwitchContinuation(flowToken=");
        sb.append(this.flowToken);
        sb.append(", initiationSource=");
        sb.append(this.initiationSource);
        sb.append(", originAccountToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.originAccountToken, ", targetAccountCashtag=", this.targetAccountCashtag, ", startElapsedRealtimeMillis=");
        sb.append(this.startElapsedRealtimeMillis);
        sb.append(", destination=");
        sb.append(this.destination);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.flowToken);
        parcel.writeString(this.initiationSource.name());
        parcel.writeString(this.originAccountToken);
        parcel.writeString(this.targetAccountCashtag);
        parcel.writeLong(this.startElapsedRealtimeMillis);
        parcel.writeParcelable(this.destination, i);
    }
}
