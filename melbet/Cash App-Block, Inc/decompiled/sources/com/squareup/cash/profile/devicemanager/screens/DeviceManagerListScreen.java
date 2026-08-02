package com.squareup.cash.profile.devicemanager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceManagerListScreen implements Screen {
    public static final Parcelable.Creator<DeviceManagerListScreen> CREATOR = new OpenSourceScreen.Creator(4);
    public final List deleteTokens;
    public final int removeAttemptCount;

    public DeviceManagerListScreen(List list, int i) {
        list.getClass();
        this.deleteTokens = list;
        this.removeAttemptCount = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceManagerListScreen)) {
            return false;
        }
        DeviceManagerListScreen deviceManagerListScreen = (DeviceManagerListScreen) obj;
        return Intrinsics.areEqual(this.deleteTokens, deviceManagerListScreen.deleteTokens) && this.removeAttemptCount == deviceManagerListScreen.removeAttemptCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.removeAttemptCount) + (this.deleteTokens.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceManagerListScreen(deleteTokens=" + this.deleteTokens + ", removeAttemptCount=" + this.removeAttemptCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.deleteTokens);
        parcel.writeInt(this.removeAttemptCount);
    }

    public DeviceManagerListScreen() {
        this(EmptyList.INSTANCE, 1);
    }
}
