package com.squareup.cash.cashapppay.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.franklin.common.SyncBusinessGrant;

/* loaded from: classes6.dex */
public final class UnlinkResultScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<UnlinkResultScreen> CREATOR = new CheckCaptureQuestion.Creator(21);
    public final SyncBusinessGrant.ActionType actionType;
    public final boolean success;

    public UnlinkResultScreen(boolean z, SyncBusinessGrant.ActionType actionType) {
        actionType.getClass();
        this.success = z;
        this.actionType = actionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlinkResultScreen)) {
            return false;
        }
        UnlinkResultScreen unlinkResultScreen = (UnlinkResultScreen) obj;
        return this.success == unlinkResultScreen.success && this.actionType == unlinkResultScreen.actionType;
    }

    public final int hashCode() {
        return this.actionType.hashCode() + (Boolean.hashCode(this.success) * 31);
    }

    public final String toString() {
        return "UnlinkResultScreen(success=" + this.success + ", actionType=" + this.actionType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.actionType.name());
    }
}
