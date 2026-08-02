package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Alias;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProfileHeaderMenuSheetResult implements Parcelable {
    public static final /* synthetic */ ProfileHeaderMenuSheetResult[] $VALUES;
    public static final ProfileHeaderMenuSheetResult CLEAR_PHOTO;
    public static final Parcelable.Creator<ProfileHeaderMenuSheetResult> CREATOR;
    public static final ProfileHeaderMenuSheetResult EXISTING_PHOTO;
    public static final ProfileHeaderMenuSheetResult TAKE_PHOTO;

    static {
        ProfileHeaderMenuSheetResult profileHeaderMenuSheetResult = new ProfileHeaderMenuSheetResult("TAKE_PHOTO", 0);
        TAKE_PHOTO = profileHeaderMenuSheetResult;
        ProfileHeaderMenuSheetResult profileHeaderMenuSheetResult2 = new ProfileHeaderMenuSheetResult("EXISTING_PHOTO", 1);
        EXISTING_PHOTO = profileHeaderMenuSheetResult2;
        ProfileHeaderMenuSheetResult profileHeaderMenuSheetResult3 = new ProfileHeaderMenuSheetResult("CLEAR_PHOTO", 2);
        CLEAR_PHOTO = profileHeaderMenuSheetResult3;
        $VALUES = new ProfileHeaderMenuSheetResult[]{profileHeaderMenuSheetResult, profileHeaderMenuSheetResult2, profileHeaderMenuSheetResult3};
        CREATOR = new Alias.Creator(22);
    }

    public static ProfileHeaderMenuSheetResult valueOf(String str) {
        return (ProfileHeaderMenuSheetResult) Enum.valueOf(ProfileHeaderMenuSheetResult.class, str);
    }

    public static ProfileHeaderMenuSheetResult[] values() {
        return (ProfileHeaderMenuSheetResult[]) $VALUES.clone();
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
