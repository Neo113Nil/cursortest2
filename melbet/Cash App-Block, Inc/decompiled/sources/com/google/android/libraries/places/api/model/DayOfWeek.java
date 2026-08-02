package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zzb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DayOfWeek implements Parcelable {
    public static final Parcelable.Creator<DayOfWeek> CREATOR;
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;
    public static final /* synthetic */ DayOfWeek[] zza;

    static {
        DayOfWeek dayOfWeek = new DayOfWeek("SUNDAY", 0);
        SUNDAY = dayOfWeek;
        DayOfWeek dayOfWeek2 = new DayOfWeek("MONDAY", 1);
        MONDAY = dayOfWeek2;
        DayOfWeek dayOfWeek3 = new DayOfWeek("TUESDAY", 2);
        TUESDAY = dayOfWeek3;
        DayOfWeek dayOfWeek4 = new DayOfWeek("WEDNESDAY", 3);
        WEDNESDAY = dayOfWeek4;
        DayOfWeek dayOfWeek5 = new DayOfWeek("THURSDAY", 4);
        THURSDAY = dayOfWeek5;
        DayOfWeek dayOfWeek6 = new DayOfWeek("FRIDAY", 5);
        FRIDAY = dayOfWeek6;
        DayOfWeek dayOfWeek7 = new DayOfWeek("SATURDAY", 6);
        SATURDAY = dayOfWeek7;
        zza = new DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        CREATOR = new zzb(1);
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) zza.clone();
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
