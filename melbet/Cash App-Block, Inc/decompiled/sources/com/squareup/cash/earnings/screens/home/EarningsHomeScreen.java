package com.squareup.cash.earnings.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;

/* loaded from: classes.dex */
public final class EarningsHomeScreen implements Screen, RestoringScreen {
    public static final Parcelable.Creator<EarningsHomeScreen> CREATOR = new AddPayerCustomersScreen.Creator(15);
    public final Origin origin;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Origin implements Parcelable {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Parcelable.Creator<Origin> CREATOR;
        public static final Origin DEEP_LINK;
        public static final Origin MONEY_TAB_APPLET;
        public static final Origin UNKNOWN;

        static {
            Origin origin = new Origin("MONEY_TAB_APPLET", 0);
            MONEY_TAB_APPLET = origin;
            Origin origin2 = new Origin("DEEP_LINK", 1);
            DEEP_LINK = origin2;
            Origin origin3 = new Origin("ACTIVITY", 2);
            Origin origin4 = new Origin("RECEIPT", 3);
            Origin origin5 = new Origin("PUSH", 4);
            Origin origin6 = new Origin("UNKNOWN", 5);
            UNKNOWN = origin6;
            $VALUES = new Origin[]{origin, origin2, origin3, origin4, origin5, origin6};
            CREATOR = new AddPayerCustomersScreen.Creator(16);
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    public EarningsHomeScreen(Origin origin) {
        origin.getClass();
        this.origin = origin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsHomeScreen) && this.origin == ((EarningsHomeScreen) obj).origin;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "EarningsHomeScreen(origin=" + this.origin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.origin.writeToParcel(parcel, i);
    }
}
