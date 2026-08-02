package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen implements Screen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen> CREATOR = new ActivityScreen.Creator(18);
    public final String referrerFlowToken;

    public AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen(String str) {
        str.getClass();
        this.referrerFlowToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) && Intrinsics.areEqual(this.referrerFlowToken, ((AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) obj).referrerFlowToken);
    }

    public final int hashCode() {
        return this.referrerFlowToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayRetroOrderSelectionScreen(referrerFlowToken=", this.referrerFlowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.referrerFlowToken);
    }
}
