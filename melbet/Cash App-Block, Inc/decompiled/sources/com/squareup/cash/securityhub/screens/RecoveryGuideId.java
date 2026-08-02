package com.squareup.cash.securityhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.screens.BoostDetailsScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RecoveryGuideId implements Parcelable {
    public static final /* synthetic */ RecoveryGuideId[] $VALUES;
    public static final Parcelable.Creator<RecoveryGuideId> CREATOR;
    public static final RecoveryGuideId IVE_BEEN_HACKED;
    public static final RecoveryGuideId IVE_BEEN_SCAMMED;

    static {
        RecoveryGuideId recoveryGuideId = new RecoveryGuideId("IVE_BEEN_SCAMMED", 0);
        IVE_BEEN_SCAMMED = recoveryGuideId;
        RecoveryGuideId recoveryGuideId2 = new RecoveryGuideId("IVE_BEEN_HACKED", 1);
        IVE_BEEN_HACKED = recoveryGuideId2;
        $VALUES = new RecoveryGuideId[]{recoveryGuideId, recoveryGuideId2};
        CREATOR = new BoostDetailsScreen.Creator(22);
    }

    public static RecoveryGuideId valueOf(String str) {
        return (RecoveryGuideId) Enum.valueOf(RecoveryGuideId.class, str);
    }

    public static RecoveryGuideId[] values() {
        return (RecoveryGuideId[]) $VALUES.clone();
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
