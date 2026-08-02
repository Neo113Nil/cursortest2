package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseSurface;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletHomeScreen implements Screen, SingleInstanceScreen, PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletHomeScreen> CREATOR = new ActivityScreen.Creator(10);
    public final PrepurchaseCashCardScreen$PrepurchaseSurface prepurchaseSurface;
    public final String referrerFlowToken;

    public AfterpayAppletScreen$AfterpayAppletHomeScreen(String str) {
        str.getClass();
        this.referrerFlowToken = str;
        this.prepurchaseSurface = PrepurchaseCashCardScreen$PrepurchaseSurface.AFTERPAY_APPLET;
    }

    @Override // com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent
    public final PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent copyWithOrWithoutSheet(boolean z) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletScreen$AfterpayAppletHomeScreen) && Intrinsics.areEqual(this.referrerFlowToken, ((AfterpayAppletScreen$AfterpayAppletHomeScreen) obj).referrerFlowToken);
    }

    @Override // com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent
    public final PrepurchaseCashCardScreen$PrepurchaseSurface getPrepurchaseSurface() {
        return this.prepurchaseSurface;
    }

    public final int hashCode() {
        return this.referrerFlowToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletHomeScreen(referrerFlowToken=", this.referrerFlowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.referrerFlowToken);
    }
}
