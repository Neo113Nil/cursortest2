package com.squareup.cash.onboarding.accountpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.nearby.viewmodels.ListSection;

/* loaded from: classes.dex */
public final class OnboardingAccountPickerOptionsMenuScreen implements BottomSheetScreen {
    public static final OnboardingAccountPickerOptionsMenuScreen INSTANCE = new OnboardingAccountPickerOptionsMenuScreen();
    public static final Parcelable.Creator<OnboardingAccountPickerOptionsMenuScreen> CREATOR = new ListSection.Creator(22);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Result implements Parcelable {
        public static final /* synthetic */ Result[] $VALUES;
        public static final Parcelable.Creator<Result> CREATOR;
        public static final Result ENABLE_EDIT_MODE;

        static {
            Result result = new Result("ENABLE_EDIT_MODE", 0);
            ENABLE_EDIT_MODE = result;
            $VALUES = new Result[]{result, new Result("CLOSE", 1)};
            CREATOR = new ListSection.Creator(23);
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
