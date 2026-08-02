package com.squareup.cash.account.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.clientrouting.data.TargetDestination;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSwitcherScreen implements Screen, OnlyOneOverlayTreatment, RestoringScreen {
    public static final Parcelable.Creator<AccountSwitcherScreen> CREATOR = new zzb(23);
    public final AccountSwitchAccountViewSwitcher.Entrypoint entrypoint;
    public final Screen exitScreen;
    public final TargetDestination targetDestination;

    public AccountSwitcherScreen(AccountSwitchAccountViewSwitcher.Entrypoint entrypoint, Screen screen, TargetDestination targetDestination) {
        entrypoint.getClass();
        this.entrypoint = entrypoint;
        this.exitScreen = screen;
        this.targetDestination = targetDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitcherScreen)) {
            return false;
        }
        AccountSwitcherScreen accountSwitcherScreen = (AccountSwitcherScreen) obj;
        return this.entrypoint == accountSwitcherScreen.entrypoint && Intrinsics.areEqual(this.exitScreen, accountSwitcherScreen.exitScreen) && Intrinsics.areEqual(this.targetDestination, accountSwitcherScreen.targetDestination);
    }

    public final int hashCode() {
        int hashCode = this.entrypoint.hashCode() * 31;
        Screen screen = this.exitScreen;
        int hashCode2 = (hashCode + (screen == null ? 0 : screen.hashCode())) * 31;
        TargetDestination targetDestination = this.targetDestination;
        return hashCode2 + (targetDestination != null ? targetDestination.hashCode() : 0);
    }

    public final String toString() {
        return "AccountSwitcherScreen(entrypoint=" + this.entrypoint + ", exitScreen=" + this.exitScreen + ", targetDestination=" + this.targetDestination + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.entrypoint.name());
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.targetDestination, i);
    }
}
