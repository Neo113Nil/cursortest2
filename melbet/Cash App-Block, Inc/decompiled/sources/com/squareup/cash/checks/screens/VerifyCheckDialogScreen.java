package com.squareup.cash.checks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.RoutingParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class VerifyCheckDialogScreen implements BlockersScreens.BlockersDialogScreens {
    public static final Parcelable.Creator<VerifyCheckDialogScreen> CREATOR = new RoutingParams.Creator(3);
    public final BlockersData blockersData;
    public final String message;
    public final String negativeLabel;
    public final String positiveLabel;
    public final String title;

    public VerifyCheckDialogScreen(BlockersData blockersData, String str, String str2, String str3, String str4) {
        blockersData.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.blockersData = blockersData;
        this.title = str;
        this.message = str2;
        this.positiveLabel = str3;
        this.negativeLabel = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyCheckDialogScreen)) {
            return false;
        }
        VerifyCheckDialogScreen verifyCheckDialogScreen = (VerifyCheckDialogScreen) obj;
        return Intrinsics.areEqual(this.blockersData, verifyCheckDialogScreen.blockersData) && Intrinsics.areEqual(this.title, verifyCheckDialogScreen.title) && Intrinsics.areEqual(this.message, verifyCheckDialogScreen.message) && Intrinsics.areEqual(this.positiveLabel, verifyCheckDialogScreen.positiveLabel) && Intrinsics.areEqual(this.negativeLabel, verifyCheckDialogScreen.negativeLabel);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.message), 31, this.positiveLabel);
        String str = this.negativeLabel;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "VerifyCheckDialogScreen(blockersData=", ", title=", this.title, ", message=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.message, ", positiveLabel=", this.positiveLabel, ", negativeLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.negativeLabel, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.positiveLabel);
        parcel.writeString(this.negativeLabel);
    }
}
