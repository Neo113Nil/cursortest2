package com.squareup.cash.initialscreenloader.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AppUpgradeRequiredScreen implements AppUpgradeScreen, Screen {
    public static final Parcelable.Creator<AppUpgradeRequiredScreen> CREATOR = new UriString.Creator(23);
    public final String message;
    public final String title;

    public AppUpgradeRequiredScreen(String str, String str2) {
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
        if (!(obj instanceof AppUpgradeRequiredScreen)) {
            return false;
        }
        AppUpgradeRequiredScreen appUpgradeRequiredScreen = (AppUpgradeRequiredScreen) obj;
        return Intrinsics.areEqual(this.title, appUpgradeRequiredScreen.title) && Intrinsics.areEqual(this.message, appUpgradeRequiredScreen.message);
    }

    @Override // com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen
    public final boolean getRequired() {
        return true;
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
        return Boxes$$ExternalSyntheticOutline1.m("AppUpgradeRequiredScreen(title=", this.title, ", message=", this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
    }
}
