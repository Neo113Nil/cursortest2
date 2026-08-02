package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.screens.ActivityScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletNotificationScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletNotificationScreen> CREATOR = new ActivityScreen.Creator(13);
    public final String subtitle;
    public final Long timeUntilDismissMillis;
    public final String title;

    public AfterpayAppletScreen$AfterpayAppletNotificationScreen(Long l, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
        this.timeUntilDismissMillis = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletScreen$AfterpayAppletNotificationScreen)) {
            return false;
        }
        AfterpayAppletScreen$AfterpayAppletNotificationScreen afterpayAppletScreen$AfterpayAppletNotificationScreen = (AfterpayAppletScreen$AfterpayAppletNotificationScreen) obj;
        return Intrinsics.areEqual(this.title, afterpayAppletScreen$AfterpayAppletNotificationScreen.title) && Intrinsics.areEqual(this.subtitle, afterpayAppletScreen$AfterpayAppletNotificationScreen.subtitle) && Intrinsics.areEqual(this.timeUntilDismissMillis, afterpayAppletScreen$AfterpayAppletNotificationScreen.timeUntilDismissMillis);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        Long l = this.timeUntilDismissMillis;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletNotificationScreen(title=", this.title, ", subtitle=", this.subtitle, ", timeUntilDismissMillis="), this.timeUntilDismissMillis, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Long l = this.timeUntilDismissMillis;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
    }
}
