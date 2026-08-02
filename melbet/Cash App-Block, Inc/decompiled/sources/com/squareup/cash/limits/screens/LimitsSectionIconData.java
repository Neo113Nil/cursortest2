package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.limits.screens.LimitsScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LimitsSectionIconData implements Parcelable {
    public static final /* synthetic */ LimitsSectionIconData[] $VALUES;
    public static final LimitsSectionIconData BITCOIN;
    public static final LimitsSectionIconData CASH_CARD;
    public static final Parcelable.Creator<LimitsSectionIconData> CREATOR;
    public static final LimitsSectionIconData DEPOSIT_AND_WITHDRAW;
    public static final LimitsSectionIconData SEND_AND_RECEIVE;
    public static final LimitsSectionIconData STOCKS;
    public static final LimitsSectionIconData UNKNOWN;

    static {
        LimitsSectionIconData limitsSectionIconData = new LimitsSectionIconData("SEND_AND_RECEIVE", 0);
        SEND_AND_RECEIVE = limitsSectionIconData;
        LimitsSectionIconData limitsSectionIconData2 = new LimitsSectionIconData("DEPOSIT_AND_WITHDRAW", 1);
        DEPOSIT_AND_WITHDRAW = limitsSectionIconData2;
        LimitsSectionIconData limitsSectionIconData3 = new LimitsSectionIconData("CASH_CARD", 2);
        CASH_CARD = limitsSectionIconData3;
        LimitsSectionIconData limitsSectionIconData4 = new LimitsSectionIconData("BITCOIN", 3);
        BITCOIN = limitsSectionIconData4;
        LimitsSectionIconData limitsSectionIconData5 = new LimitsSectionIconData("STOCKS", 4);
        STOCKS = limitsSectionIconData5;
        LimitsSectionIconData limitsSectionIconData6 = new LimitsSectionIconData("UNKNOWN", 5);
        UNKNOWN = limitsSectionIconData6;
        $VALUES = new LimitsSectionIconData[]{limitsSectionIconData, limitsSectionIconData2, limitsSectionIconData3, limitsSectionIconData4, limitsSectionIconData5, limitsSectionIconData6};
        CREATOR = new LimitsScreen.Creator(2);
    }

    public static LimitsSectionIconData valueOf(String str) {
        return (LimitsSectionIconData) Enum.valueOf(LimitsSectionIconData.class, str);
    }

    public static LimitsSectionIconData[] values() {
        return (LimitsSectionIconData[]) $VALUES.clone();
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
