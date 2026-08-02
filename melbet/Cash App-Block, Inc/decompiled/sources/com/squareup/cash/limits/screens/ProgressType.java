package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.limits.screens.LimitsScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ProgressType implements Parcelable {
    public static final /* synthetic */ ProgressType[] $VALUES;
    public static final ProgressType COUNT;
    public static final Parcelable.Creator<ProgressType> CREATOR;
    public static final ProgressType MONEY;
    public static final ProgressType SIMPLE;

    static {
        ProgressType progressType = new ProgressType("SIMPLE", 0);
        SIMPLE = progressType;
        ProgressType progressType2 = new ProgressType("MONEY", 1);
        MONEY = progressType2;
        ProgressType progressType3 = new ProgressType("COUNT", 2);
        COUNT = progressType3;
        $VALUES = new ProgressType[]{progressType, progressType2, progressType3};
        CREATOR = new LimitsScreen.Creator(5);
    }

    public static ProgressType valueOf(String str) {
        return (ProgressType) Enum.valueOf(ProgressType.class, str);
    }

    public static ProgressType[] values() {
        return (ProgressType[]) $VALUES.clone();
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
