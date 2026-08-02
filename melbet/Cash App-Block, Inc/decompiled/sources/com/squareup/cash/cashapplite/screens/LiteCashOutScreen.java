package com.squareup.cash.cashapplite.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LiteCashOutScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LiteCashOutScreen> CREATOR = new CheckCaptureQuestion.Creator(16);
    public final Money balance;

    public LiteCashOutScreen(Money money) {
        money.getClass();
        this.balance = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiteCashOutScreen) && Intrinsics.areEqual(this.balance, ((LiteCashOutScreen) obj).balance);
    }

    public final int hashCode() {
        return this.balance.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.balance, "LiteCashOutScreen(balance=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.balance, i);
    }
}
