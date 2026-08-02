package com.squareup.cash.money.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.common.viewmodels.CashTagSymbol;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class HypeWelcomeScreen implements Screen {
    public static final Parcelable.Creator<HypeWelcomeScreen> CREATOR = new LimitsScreen.Creator(15);
    public final String launchDateString;
    public final String notifyDeviceId;
    public final CashTagSymbol symbol;

    public HypeWelcomeScreen(String str, CashTagSymbol cashTagSymbol, String str2) {
        str.getClass();
        cashTagSymbol.getClass();
        str2.getClass();
        this.launchDateString = str;
        this.symbol = cashTagSymbol;
        this.notifyDeviceId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HypeWelcomeScreen)) {
            return false;
        }
        HypeWelcomeScreen hypeWelcomeScreen = (HypeWelcomeScreen) obj;
        return Intrinsics.areEqual(this.launchDateString, hypeWelcomeScreen.launchDateString) && this.symbol == hypeWelcomeScreen.symbol && Intrinsics.areEqual(this.notifyDeviceId, hypeWelcomeScreen.notifyDeviceId);
    }

    public final int hashCode() {
        return this.notifyDeviceId.hashCode() + ((this.symbol.hashCode() + (this.launchDateString.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HypeWelcomeScreen(launchDateString=");
        sb.append(this.launchDateString);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", notifyDeviceId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.notifyDeviceId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.launchDateString);
        parcel.writeString(this.symbol.name());
        parcel.writeString(this.notifyDeviceId);
    }
}
