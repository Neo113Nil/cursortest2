package com.squareup.cash.mooncake.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.music.screens.MusicScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AlertDialogResult implements Parcelable {
    public static final /* synthetic */ AlertDialogResult[] $VALUES;
    public static final Parcelable.Creator<AlertDialogResult> CREATOR;
    public static final AlertDialogResult NEGATIVE;
    public static final AlertDialogResult POSITIVE;

    static {
        AlertDialogResult alertDialogResult = new AlertDialogResult("POSITIVE", 0);
        POSITIVE = alertDialogResult;
        AlertDialogResult alertDialogResult2 = new AlertDialogResult("NEGATIVE", 1);
        NEGATIVE = alertDialogResult2;
        $VALUES = new AlertDialogResult[]{alertDialogResult, alertDialogResult2};
        CREATOR = new MusicScreen.Creator(25);
    }

    public static AlertDialogResult valueOf(String str) {
        return (AlertDialogResult) Enum.valueOf(AlertDialogResult.class, str);
    }

    public static AlertDialogResult[] values() {
        return (AlertDialogResult[]) $VALUES.clone();
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
