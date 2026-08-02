package com.squareup.cash.activity.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class BalanceFeedScreen implements Screen {
    public static final Parcelable.Creator<BalanceFeedScreen> CREATOR = new ActivityScreen.Creator(7);
    public final BalanceType balanceType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class BalanceType {
        public static final /* synthetic */ BalanceType[] $VALUES;
        public static final BalanceType CashBalance;

        static {
            BalanceType balanceType = new BalanceType("CashBalance", 0);
            CashBalance = balanceType;
            $VALUES = new BalanceType[]{balanceType};
        }

        public static BalanceType valueOf(String str) {
            return (BalanceType) Enum.valueOf(BalanceType.class, str);
        }

        public static BalanceType[] values() {
            return (BalanceType[]) $VALUES.clone();
        }
    }

    public BalanceFeedScreen(BalanceType balanceType) {
        balanceType.getClass();
        this.balanceType = balanceType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceFeedScreen) && this.balanceType == ((BalanceFeedScreen) obj).balanceType;
    }

    public final int hashCode() {
        return this.balanceType.hashCode();
    }

    public final String toString() {
        return "BalanceFeedScreen(balanceType=" + this.balanceType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.balanceType.name());
    }
}
