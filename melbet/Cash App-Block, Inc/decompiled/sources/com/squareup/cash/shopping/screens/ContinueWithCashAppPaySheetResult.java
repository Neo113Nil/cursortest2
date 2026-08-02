package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.shopping.screens.AutofillQuestion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ContinueWithCashAppPaySheetResult implements Parcelable {
    public static final /* synthetic */ ContinueWithCashAppPaySheetResult[] $VALUES;
    public static final ContinueWithCashAppPaySheetResult CONTINUE;
    public static final Parcelable.Creator<ContinueWithCashAppPaySheetResult> CREATOR;
    public static final ContinueWithCashAppPaySheetResult DISMISSED;

    static {
        ContinueWithCashAppPaySheetResult continueWithCashAppPaySheetResult = new ContinueWithCashAppPaySheetResult("CONTINUE", 0);
        CONTINUE = continueWithCashAppPaySheetResult;
        ContinueWithCashAppPaySheetResult continueWithCashAppPaySheetResult2 = new ContinueWithCashAppPaySheetResult("DISMISSED", 1);
        DISMISSED = continueWithCashAppPaySheetResult2;
        $VALUES = new ContinueWithCashAppPaySheetResult[]{continueWithCashAppPaySheetResult, continueWithCashAppPaySheetResult2};
        CREATOR = new AutofillQuestion.Creator(5);
    }

    public static ContinueWithCashAppPaySheetResult valueOf(String str) {
        return (ContinueWithCashAppPaySheetResult) Enum.valueOf(ContinueWithCashAppPaySheetResult.class, str);
    }

    public static ContinueWithCashAppPaySheetResult[] values() {
        return (ContinueWithCashAppPaySheetResult[]) $VALUES.clone();
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
