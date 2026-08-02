package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.fileupload.api.UriString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AppUpgradeSuggestedScreen implements AppUpgradeScreen, DialogScreen {
    public static final Parcelable.Creator<AppUpgradeSuggestedScreen> CREATOR = new UriString.Creator(24);
    public final String message;
    public final String title;

    public AppUpgradeSuggestedScreen(String str, String str2) {
        this.title = str;
        this.message = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppUpgradeSuggestedScreen)) {
            return false;
        }
        AppUpgradeSuggestedScreen appUpgradeSuggestedScreen = (AppUpgradeSuggestedScreen) obj;
        return Intrinsics.areEqual(this.title, appUpgradeSuggestedScreen.title) && Intrinsics.areEqual(this.message, appUpgradeSuggestedScreen.message);
    }

    @Override // com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen
    public final boolean getRequired() {
        return false;
    }

    @Override // com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AppUpgradeSuggestedScreen(title=", this.title, ", message=", this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
    }
}
