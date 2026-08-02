package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class VerifyHelpItem implements Parcelable {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ VerifyHelpItem[] $VALUES;
    public static final Parcelable.Creator<VerifyHelpItem> CREATOR;

    static {
        VerifyHelpItem[] verifyHelpItemArr = {new VerifyHelpItem("EDIT_EMAIL", 0), new VerifyHelpItem("EDIT_SMS", 1), new VerifyHelpItem("CALL", 2), new VerifyHelpItem("SKIP", 3)};
        $VALUES = verifyHelpItemArr;
        $ENTRIES = new EnumEntriesList(verifyHelpItemArr);
        CREATOR = new BorrowHome.Creator(21);
    }

    public static VerifyHelpItem valueOf(String str) {
        return (VerifyHelpItem) Enum.valueOf(VerifyHelpItem.class, str);
    }

    public static VerifyHelpItem[] values() {
        return (VerifyHelpItem[]) $VALUES.clone();
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
