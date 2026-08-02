package com.squareup.cash.earnings.screens.streamdetail;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EarningsStreamDetailScreen implements Screen {
    public static final Parcelable.Creator<EarningsStreamDetailScreen> CREATOR = new AddPayerCustomersScreen.Creator(17);
    public final String avatarUrl;
    public final String streamId;
    public final String streamName;

    public EarningsStreamDetailScreen(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.streamId = str;
        this.streamName = str2;
        this.avatarUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsStreamDetailScreen)) {
            return false;
        }
        EarningsStreamDetailScreen earningsStreamDetailScreen = (EarningsStreamDetailScreen) obj;
        return Intrinsics.areEqual(this.streamId, earningsStreamDetailScreen.streamId) && Intrinsics.areEqual(this.streamName, earningsStreamDetailScreen.streamName) && Intrinsics.areEqual(this.avatarUrl, earningsStreamDetailScreen.avatarUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.streamId.hashCode() * 31, 31, this.streamName);
        String str = this.avatarUrl;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarningsStreamDetailScreen(streamId=", this.streamId, ", streamName=", this.streamName, ", avatarUrl="), this.avatarUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.streamId);
        parcel.writeString(this.streamName);
        parcel.writeString(this.avatarUrl);
    }
}
