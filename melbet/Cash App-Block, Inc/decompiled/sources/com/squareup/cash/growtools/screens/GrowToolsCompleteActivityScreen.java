package com.squareup.cash.growtools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GrowToolsCompleteActivityScreen implements Screen, RestoringScreen {
    public static final Parcelable.Creator<GrowToolsCompleteActivityScreen> CREATOR = new UriString.Creator(12);
    public final GrowToolsManagerScreen managerScreen;

    public GrowToolsCompleteActivityScreen(GrowToolsManagerScreen growToolsManagerScreen) {
        growToolsManagerScreen.getClass();
        this.managerScreen = growToolsManagerScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GrowToolsCompleteActivityScreen) && Intrinsics.areEqual(this.managerScreen, ((GrowToolsCompleteActivityScreen) obj).managerScreen);
    }

    public final int hashCode() {
        return this.managerScreen.hashCode();
    }

    public final String toString() {
        return "GrowToolsCompleteActivityScreen(managerScreen=" + this.managerScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.managerScreen, i);
    }
}
