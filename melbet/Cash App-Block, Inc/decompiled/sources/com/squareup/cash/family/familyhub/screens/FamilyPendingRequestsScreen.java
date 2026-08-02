package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FamilyPendingRequestsScreen implements Screen, SingleInstanceScreen {
    public static final Parcelable.Creator<FamilyPendingRequestsScreen> CREATOR = new FamilyHome.Creator(7);
    public final PendingRequestsParams pendingRequestsParams;

    public FamilyPendingRequestsScreen(PendingRequestsParams pendingRequestsParams) {
        this.pendingRequestsParams = pendingRequestsParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FamilyPendingRequestsScreen) && Intrinsics.areEqual(this.pendingRequestsParams, ((FamilyPendingRequestsScreen) obj).pendingRequestsParams);
    }

    public final int hashCode() {
        PendingRequestsParams pendingRequestsParams = this.pendingRequestsParams;
        if (pendingRequestsParams == null) {
            return 0;
        }
        return pendingRequestsParams.hashCode();
    }

    public final String toString() {
        return "FamilyPendingRequestsScreen(pendingRequestsParams=" + this.pendingRequestsParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.pendingRequestsParams, i);
    }
}
