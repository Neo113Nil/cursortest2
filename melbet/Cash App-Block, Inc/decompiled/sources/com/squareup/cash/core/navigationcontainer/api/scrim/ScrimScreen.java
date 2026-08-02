package com.squareup.cash.core.navigationcontainer.api.scrim;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.composable.adapter.ViewStateId;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface ScrimScreen extends Parcelable {

    public final class ManagedAccountSwitchScrimScreen implements ScrimScreen {
        public static final Parcelable.Creator<ManagedAccountSwitchScrimScreen> CREATOR = new ViewStateId.Creator(8);
        public final ManagedAccountAnimationInfo animationInfo;

        public ManagedAccountSwitchScrimScreen(ManagedAccountAnimationInfo managedAccountAnimationInfo) {
            managedAccountAnimationInfo.getClass();
            this.animationInfo = managedAccountAnimationInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManagedAccountSwitchScrimScreen) && Intrinsics.areEqual(this.animationInfo, ((ManagedAccountSwitchScrimScreen) obj).animationInfo);
        }

        public final int hashCode() {
            return this.animationInfo.hashCode();
        }

        public final String toString() {
            return "ManagedAccountSwitchScrimScreen(animationInfo=" + this.animationInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.animationInfo, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class SwitchFullAccountLoadingScrimScreen implements ScrimScreen {
        public static final Parcelable.Creator<SwitchFullAccountLoadingScrimScreen> CREATOR = new ViewStateId.Creator(9);
        public final FullAccount account;

        public SwitchFullAccountLoadingScrimScreen(FullAccount fullAccount) {
            this.account = fullAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SwitchFullAccountLoadingScrimScreen) && Intrinsics.areEqual(this.account, ((SwitchFullAccountLoadingScrimScreen) obj).account);
        }

        public final FullAccount getAccount() {
            return this.account;
        }

        public final int hashCode() {
            FullAccount fullAccount = this.account;
            if (fullAccount == null) {
                return 0;
            }
            return fullAccount.hashCode();
        }

        public final String toString() {
            return "SwitchFullAccountLoadingScrimScreen(account=" + this.account + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.account, i);
        }
    }
}
