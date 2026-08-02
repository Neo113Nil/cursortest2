package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zzb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OpeningHours$HoursType implements Parcelable {
    public static final OpeningHours$HoursType ACCESS;
    public static final OpeningHours$HoursType BREAKFAST;
    public static final OpeningHours$HoursType BRUNCH;
    public static final Parcelable.Creator<OpeningHours$HoursType> CREATOR;
    public static final OpeningHours$HoursType DELIVERY;
    public static final OpeningHours$HoursType DINNER;
    public static final OpeningHours$HoursType DRIVE_THROUGH;
    public static final OpeningHours$HoursType HAPPY_HOUR;
    public static final OpeningHours$HoursType KITCHEN;
    public static final OpeningHours$HoursType LUNCH;
    public static final OpeningHours$HoursType ONLINE_SERVICE_HOURS;
    public static final OpeningHours$HoursType PICKUP;
    public static final OpeningHours$HoursType SENIOR_HOURS;
    public static final OpeningHours$HoursType TAKEOUT;
    public static final /* synthetic */ OpeningHours$HoursType[] zza;

    static {
        OpeningHours$HoursType openingHours$HoursType = new OpeningHours$HoursType("ACCESS", 0);
        ACCESS = openingHours$HoursType;
        OpeningHours$HoursType openingHours$HoursType2 = new OpeningHours$HoursType("BREAKFAST", 1);
        BREAKFAST = openingHours$HoursType2;
        OpeningHours$HoursType openingHours$HoursType3 = new OpeningHours$HoursType("BRUNCH", 2);
        BRUNCH = openingHours$HoursType3;
        OpeningHours$HoursType openingHours$HoursType4 = new OpeningHours$HoursType("DELIVERY", 3);
        DELIVERY = openingHours$HoursType4;
        OpeningHours$HoursType openingHours$HoursType5 = new OpeningHours$HoursType("DINNER", 4);
        DINNER = openingHours$HoursType5;
        OpeningHours$HoursType openingHours$HoursType6 = new OpeningHours$HoursType("DRIVE_THROUGH", 5);
        DRIVE_THROUGH = openingHours$HoursType6;
        OpeningHours$HoursType openingHours$HoursType7 = new OpeningHours$HoursType("HAPPY_HOUR", 6);
        HAPPY_HOUR = openingHours$HoursType7;
        OpeningHours$HoursType openingHours$HoursType8 = new OpeningHours$HoursType("KITCHEN", 7);
        KITCHEN = openingHours$HoursType8;
        OpeningHours$HoursType openingHours$HoursType9 = new OpeningHours$HoursType("LUNCH", 8);
        LUNCH = openingHours$HoursType9;
        OpeningHours$HoursType openingHours$HoursType10 = new OpeningHours$HoursType("ONLINE_SERVICE_HOURS", 9);
        ONLINE_SERVICE_HOURS = openingHours$HoursType10;
        OpeningHours$HoursType openingHours$HoursType11 = new OpeningHours$HoursType("PICKUP", 10);
        PICKUP = openingHours$HoursType11;
        OpeningHours$HoursType openingHours$HoursType12 = new OpeningHours$HoursType("SENIOR_HOURS", 11);
        SENIOR_HOURS = openingHours$HoursType12;
        OpeningHours$HoursType openingHours$HoursType13 = new OpeningHours$HoursType("TAKEOUT", 12);
        TAKEOUT = openingHours$HoursType13;
        zza = new OpeningHours$HoursType[]{openingHours$HoursType, openingHours$HoursType2, openingHours$HoursType3, openingHours$HoursType4, openingHours$HoursType5, openingHours$HoursType6, openingHours$HoursType7, openingHours$HoursType8, openingHours$HoursType9, openingHours$HoursType10, openingHours$HoursType11, openingHours$HoursType12, openingHours$HoursType13};
        CREATOR = new zzb(4);
    }

    public static OpeningHours$HoursType valueOf(String str) {
        return (OpeningHours$HoursType) Enum.valueOf(OpeningHours$HoursType.class, str);
    }

    public static OpeningHours$HoursType[] values() {
        return (OpeningHours$HoursType[]) zza.clone();
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
