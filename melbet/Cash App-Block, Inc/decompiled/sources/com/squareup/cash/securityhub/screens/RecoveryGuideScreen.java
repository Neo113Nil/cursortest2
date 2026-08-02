package com.squareup.cash.securityhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.screens.BoostDetailsScreen;

/* loaded from: classes.dex */
public final class RecoveryGuideScreen implements Screen {
    public static final Parcelable.Creator<RecoveryGuideScreen> CREATOR = new BoostDetailsScreen.Creator(23);
    public final RecoveryGuideId recoveryGuideId;

    public RecoveryGuideScreen(RecoveryGuideId recoveryGuideId) {
        recoveryGuideId.getClass();
        this.recoveryGuideId = recoveryGuideId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecoveryGuideScreen) && this.recoveryGuideId == ((RecoveryGuideScreen) obj).recoveryGuideId;
    }

    public final int hashCode() {
        return this.recoveryGuideId.hashCode();
    }

    public final String toString() {
        return "RecoveryGuideScreen(recoveryGuideId=" + this.recoveryGuideId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.recoveryGuideId.writeToParcel(parcel, i);
    }
}
