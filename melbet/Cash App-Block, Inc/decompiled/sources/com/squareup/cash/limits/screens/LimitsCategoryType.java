package com.squareup.cash.limits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.invitations.SmsInvitation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LimitsCategoryType implements Parcelable {
    public static final /* synthetic */ LimitsCategoryType[] $VALUES;
    public static final Parcelable.Creator<LimitsCategoryType> CREATOR;
    public static final LimitsCategoryType LEGACY;
    public static final LimitsCategoryType PROGRESSIVE;

    static {
        LimitsCategoryType limitsCategoryType = new LimitsCategoryType("LEGACY", 0);
        LEGACY = limitsCategoryType;
        LimitsCategoryType limitsCategoryType2 = new LimitsCategoryType("PROGRESSIVE", 1);
        PROGRESSIVE = limitsCategoryType2;
        $VALUES = new LimitsCategoryType[]{limitsCategoryType, limitsCategoryType2};
        CREATOR = new SmsInvitation.Creator(29);
    }

    public static LimitsCategoryType valueOf(String str) {
        return (LimitsCategoryType) Enum.valueOf(LimitsCategoryType.class, str);
    }

    public static LimitsCategoryType[] values() {
        return (LimitsCategoryType[]) $VALUES.clone();
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
