package com.squareup.cash.account.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SwitchFullAccountLoadingScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<SwitchFullAccountLoadingScreen> CREATOR = new zzb(29);
    public final FullAccount account;
    public final String customerToken;
    public final TargetDestination destination;
    public final String flowToken;
    public final AccountSwitcher$AccountSwitchInitiationSource initiationSource;
    public final ManagedAccountAnimationInfo managedAccountAnimationInfo;

    public SwitchFullAccountLoadingScreen(FullAccount fullAccount, String str, String str2, TargetDestination targetDestination, AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource, ManagedAccountAnimationInfo managedAccountAnimationInfo) {
        accountSwitcher$AccountSwitchInitiationSource.getClass();
        this.account = fullAccount;
        this.customerToken = str;
        this.flowToken = str2;
        this.destination = targetDestination;
        this.initiationSource = accountSwitcher$AccountSwitchInitiationSource;
        this.managedAccountAnimationInfo = managedAccountAnimationInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchFullAccountLoadingScreen)) {
            return false;
        }
        SwitchFullAccountLoadingScreen switchFullAccountLoadingScreen = (SwitchFullAccountLoadingScreen) obj;
        return Intrinsics.areEqual(this.account, switchFullAccountLoadingScreen.account) && Intrinsics.areEqual(this.customerToken, switchFullAccountLoadingScreen.customerToken) && Intrinsics.areEqual(this.flowToken, switchFullAccountLoadingScreen.flowToken) && Intrinsics.areEqual(this.destination, switchFullAccountLoadingScreen.destination) && this.initiationSource == switchFullAccountLoadingScreen.initiationSource && Intrinsics.areEqual(this.managedAccountAnimationInfo, switchFullAccountLoadingScreen.managedAccountAnimationInfo);
    }

    public final int hashCode() {
        FullAccount fullAccount = this.account;
        int hashCode = (fullAccount == null ? 0 : fullAccount.hashCode()) * 31;
        String str = this.customerToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flowToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TargetDestination targetDestination = this.destination;
        int hashCode4 = (this.initiationSource.hashCode() + ((hashCode3 + (targetDestination == null ? 0 : targetDestination.hashCode())) * 31)) * 31;
        ManagedAccountAnimationInfo managedAccountAnimationInfo = this.managedAccountAnimationInfo;
        return hashCode4 + (managedAccountAnimationInfo != null ? managedAccountAnimationInfo.hashCode() : 0);
    }

    public final String toString() {
        return "SwitchFullAccountLoadingScreen(account=" + this.account + ", customerToken=" + this.customerToken + ", flowToken=" + this.flowToken + ", destination=" + this.destination + ", initiationSource=" + this.initiationSource + ", managedAccountAnimationInfo=" + this.managedAccountAnimationInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.account, i);
        parcel.writeString(this.customerToken);
        parcel.writeString(this.flowToken);
        parcel.writeParcelable(this.destination, i);
        parcel.writeString(this.initiationSource.name());
        ManagedAccountAnimationInfo managedAccountAnimationInfo = this.managedAccountAnimationInfo;
        if (managedAccountAnimationInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            managedAccountAnimationInfo.writeToParcel(parcel, i);
        }
    }
}
