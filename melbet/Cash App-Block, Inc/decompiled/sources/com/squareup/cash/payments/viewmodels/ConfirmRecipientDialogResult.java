package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.viewmodels.Size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ConfirmRecipientDialogResult implements Parcelable {
    public static final /* synthetic */ ConfirmRecipientDialogResult[] $VALUES;
    public static final ConfirmRecipientDialogResult CANCEL;
    public static final ConfirmRecipientDialogResult CONFIRM;
    public static final Parcelable.Creator<ConfirmRecipientDialogResult> CREATOR;
    public static final ConfirmRecipientDialogResult VIEW_PROFILE;

    static {
        ConfirmRecipientDialogResult confirmRecipientDialogResult = new ConfirmRecipientDialogResult("CONFIRM", 0);
        CONFIRM = confirmRecipientDialogResult;
        ConfirmRecipientDialogResult confirmRecipientDialogResult2 = new ConfirmRecipientDialogResult("CANCEL", 1);
        CANCEL = confirmRecipientDialogResult2;
        ConfirmRecipientDialogResult confirmRecipientDialogResult3 = new ConfirmRecipientDialogResult("VIEW_PROFILE", 2);
        VIEW_PROFILE = confirmRecipientDialogResult3;
        $VALUES = new ConfirmRecipientDialogResult[]{confirmRecipientDialogResult, confirmRecipientDialogResult2, confirmRecipientDialogResult3};
        CREATOR = new Size.Creator(4);
    }

    public static ConfirmRecipientDialogResult valueOf(String str) {
        return (ConfirmRecipientDialogResult) Enum.valueOf(ConfirmRecipientDialogResult.class, str);
    }

    public static ConfirmRecipientDialogResult[] values() {
        return (ConfirmRecipientDialogResult[]) $VALUES.clone();
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
