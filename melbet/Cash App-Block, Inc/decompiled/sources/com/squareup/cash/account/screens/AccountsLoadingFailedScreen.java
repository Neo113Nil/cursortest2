package com.squareup.cash.account.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.google.android.play.core.review.zzb;

/* loaded from: classes.dex */
public final class AccountsLoadingFailedScreen implements Screen, NeverInBackStackScreen {
    public static final AccountsLoadingFailedScreen INSTANCE = new AccountsLoadingFailedScreen();
    public static final Parcelable.Creator<AccountsLoadingFailedScreen> CREATOR = new zzb(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
