package com.squareup.cash.family.familyhub.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.family.familyhub.screens.FamilyHome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DependentControlInfo implements Parcelable {
    public static final /* synthetic */ DependentControlInfo[] $VALUES;
    public static final DependentControlInfo Bitcoin;
    public static final Parcelable.Creator<DependentControlInfo> CREATOR;
    public static final DependentControlInfo Card;
    public static final DependentControlInfo P2P;
    public static final DependentControlInfo Stock;

    static {
        DependentControlInfo dependentControlInfo = new DependentControlInfo("Bitcoin", 0);
        Bitcoin = dependentControlInfo;
        DependentControlInfo dependentControlInfo2 = new DependentControlInfo("Stock", 1);
        Stock = dependentControlInfo2;
        DependentControlInfo dependentControlInfo3 = new DependentControlInfo("P2P", 2);
        P2P = dependentControlInfo3;
        DependentControlInfo dependentControlInfo4 = new DependentControlInfo("Card", 3);
        Card = dependentControlInfo4;
        $VALUES = new DependentControlInfo[]{dependentControlInfo, dependentControlInfo2, dependentControlInfo3, dependentControlInfo4};
        CREATOR = new FamilyHome.Creator(21);
    }

    public static DependentControlInfo valueOf(String str) {
        return (DependentControlInfo) Enum.valueOf(DependentControlInfo.class, str);
    }

    public static DependentControlInfo[] values() {
        return (DependentControlInfo[]) $VALUES.clone();
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
