package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zzb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FuelPrice$FuelType implements Parcelable {
    public static final FuelPrice$FuelType BIO_DIESEL;
    public static final Parcelable.Creator<FuelPrice$FuelType> CREATOR;
    public static final FuelPrice$FuelType DIESEL;
    public static final FuelPrice$FuelType E80;
    public static final FuelPrice$FuelType E85;
    public static final FuelPrice$FuelType FUEL_TYPE_UNSPECIFIED;
    public static final FuelPrice$FuelType LPG;
    public static final FuelPrice$FuelType METHANE;
    public static final FuelPrice$FuelType MIDGRADE;
    public static final FuelPrice$FuelType PREMIUM;
    public static final FuelPrice$FuelType REGULAR_UNLEADED;
    public static final FuelPrice$FuelType SP100;
    public static final FuelPrice$FuelType SP91;
    public static final FuelPrice$FuelType SP91_E10;
    public static final FuelPrice$FuelType SP92;
    public static final FuelPrice$FuelType SP95;
    public static final FuelPrice$FuelType SP95_E10;
    public static final FuelPrice$FuelType SP98;
    public static final FuelPrice$FuelType SP99;
    public static final FuelPrice$FuelType TRUCK_DIESEL;
    public static final /* synthetic */ FuelPrice$FuelType[] zza;

    static {
        FuelPrice$FuelType fuelPrice$FuelType = new FuelPrice$FuelType("FUEL_TYPE_UNSPECIFIED", 0);
        FUEL_TYPE_UNSPECIFIED = fuelPrice$FuelType;
        FuelPrice$FuelType fuelPrice$FuelType2 = new FuelPrice$FuelType("DIESEL", 1);
        DIESEL = fuelPrice$FuelType2;
        FuelPrice$FuelType fuelPrice$FuelType3 = new FuelPrice$FuelType("REGULAR_UNLEADED", 2);
        REGULAR_UNLEADED = fuelPrice$FuelType3;
        FuelPrice$FuelType fuelPrice$FuelType4 = new FuelPrice$FuelType("MIDGRADE", 3);
        MIDGRADE = fuelPrice$FuelType4;
        FuelPrice$FuelType fuelPrice$FuelType5 = new FuelPrice$FuelType("PREMIUM", 4);
        PREMIUM = fuelPrice$FuelType5;
        FuelPrice$FuelType fuelPrice$FuelType6 = new FuelPrice$FuelType("SP91", 5);
        SP91 = fuelPrice$FuelType6;
        FuelPrice$FuelType fuelPrice$FuelType7 = new FuelPrice$FuelType("SP91_E10", 6);
        SP91_E10 = fuelPrice$FuelType7;
        FuelPrice$FuelType fuelPrice$FuelType8 = new FuelPrice$FuelType("SP92", 7);
        SP92 = fuelPrice$FuelType8;
        FuelPrice$FuelType fuelPrice$FuelType9 = new FuelPrice$FuelType("SP95", 8);
        SP95 = fuelPrice$FuelType9;
        FuelPrice$FuelType fuelPrice$FuelType10 = new FuelPrice$FuelType("SP95_E10", 9);
        SP95_E10 = fuelPrice$FuelType10;
        FuelPrice$FuelType fuelPrice$FuelType11 = new FuelPrice$FuelType("SP98", 10);
        SP98 = fuelPrice$FuelType11;
        FuelPrice$FuelType fuelPrice$FuelType12 = new FuelPrice$FuelType("SP99", 11);
        SP99 = fuelPrice$FuelType12;
        FuelPrice$FuelType fuelPrice$FuelType13 = new FuelPrice$FuelType("SP100", 12);
        SP100 = fuelPrice$FuelType13;
        FuelPrice$FuelType fuelPrice$FuelType14 = new FuelPrice$FuelType("LPG", 13);
        LPG = fuelPrice$FuelType14;
        FuelPrice$FuelType fuelPrice$FuelType15 = new FuelPrice$FuelType("E80", 14);
        E80 = fuelPrice$FuelType15;
        FuelPrice$FuelType fuelPrice$FuelType16 = new FuelPrice$FuelType("E85", 15);
        E85 = fuelPrice$FuelType16;
        FuelPrice$FuelType fuelPrice$FuelType17 = new FuelPrice$FuelType("METHANE", 16);
        METHANE = fuelPrice$FuelType17;
        FuelPrice$FuelType fuelPrice$FuelType18 = new FuelPrice$FuelType("BIO_DIESEL", 17);
        BIO_DIESEL = fuelPrice$FuelType18;
        FuelPrice$FuelType fuelPrice$FuelType19 = new FuelPrice$FuelType("TRUCK_DIESEL", 18);
        TRUCK_DIESEL = fuelPrice$FuelType19;
        zza = new FuelPrice$FuelType[]{fuelPrice$FuelType, fuelPrice$FuelType2, fuelPrice$FuelType3, fuelPrice$FuelType4, fuelPrice$FuelType5, fuelPrice$FuelType6, fuelPrice$FuelType7, fuelPrice$FuelType8, fuelPrice$FuelType9, fuelPrice$FuelType10, fuelPrice$FuelType11, fuelPrice$FuelType12, fuelPrice$FuelType13, fuelPrice$FuelType14, fuelPrice$FuelType15, fuelPrice$FuelType16, fuelPrice$FuelType17, fuelPrice$FuelType18, fuelPrice$FuelType19};
        CREATOR = new zzb(3);
    }

    public static FuelPrice$FuelType valueOf(String str) {
        return (FuelPrice$FuelType) Enum.valueOf(FuelPrice$FuelType.class, str);
    }

    public static FuelPrice$FuelType[] values() {
        return (FuelPrice$FuelType[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
