package com.squareup.cash.securityhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.screens.BoostDetailsScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class BookletId implements Parcelable {
    public static final /* synthetic */ BookletId[] $VALUES;
    public static final BookletId BUILT_IN_PROTECTIONS;
    public static final BookletId COMMON_SCAMS;
    public static final Parcelable.Creator<BookletId> CREATOR;
    public static final BookletId PREVENT_FRAUD;
    public static final BookletId SECURITY_FEATURES;
    public static final BookletId SPOT_SCAMS;

    static {
        BookletId bookletId = new BookletId("BUILT_IN_PROTECTIONS", 0);
        BUILT_IN_PROTECTIONS = bookletId;
        BookletId bookletId2 = new BookletId("COMMON_SCAMS", 1);
        COMMON_SCAMS = bookletId2;
        BookletId bookletId3 = new BookletId("SPOT_SCAMS", 2);
        SPOT_SCAMS = bookletId3;
        BookletId bookletId4 = new BookletId("PREVENT_FRAUD", 3);
        PREVENT_FRAUD = bookletId4;
        BookletId bookletId5 = new BookletId("SECURITY_FEATURES", 4);
        SECURITY_FEATURES = bookletId5;
        $VALUES = new BookletId[]{bookletId, bookletId2, bookletId3, bookletId4, bookletId5};
        CREATOR = new BoostDetailsScreen.Creator(20);
    }

    public static BookletId valueOf(String str) {
        return (BookletId) Enum.valueOf(BookletId.class, str);
    }

    public static BookletId[] values() {
        return (BookletId[]) $VALUES.clone();
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
