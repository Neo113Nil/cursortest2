package com.squareup.cash.money.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.money.analytics.MoneyAnalyticsService$Companion$Source;

/* loaded from: classes.dex */
public final class MoneyTabScreen implements Screen {
    public static final Parcelable.Creator<MoneyTabScreen> CREATOR = new LimitsScreen.Creator(16);
    public final MoneyAnalyticsService$Companion$Source source;

    public MoneyTabScreen(MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source) {
        this.source = moneyAnalyticsService$Companion$Source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyTabScreen) && this.source == ((MoneyTabScreen) obj).source;
    }

    public final int hashCode() {
        MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source = this.source;
        if (moneyAnalyticsService$Companion$Source == null) {
            return 0;
        }
        return moneyAnalyticsService$Companion$Source.hashCode();
    }

    public final String toString() {
        return "MoneyTabScreen(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source = this.source;
        if (moneyAnalyticsService$Companion$Source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(moneyAnalyticsService$Companion$Source.name());
        }
    }
}
