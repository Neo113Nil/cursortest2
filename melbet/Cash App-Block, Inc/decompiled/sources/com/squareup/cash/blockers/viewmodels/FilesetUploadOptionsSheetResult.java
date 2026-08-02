package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FilesetUploadOptionsSheetResult implements Parcelable {
    public static final /* synthetic */ FilesetUploadOptionsSheetResult[] $VALUES;
    public static final FilesetUploadOptionsSheetResult CLOSE;
    public static final Parcelable.Creator<FilesetUploadOptionsSheetResult> CREATOR;
    public static final FilesetUploadOptionsSheetResult TAKE_A_PHOTO;
    public static final FilesetUploadOptionsSheetResult UPLOAD_A_FILE;

    static {
        FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult = new FilesetUploadOptionsSheetResult("TAKE_A_PHOTO", 0);
        TAKE_A_PHOTO = filesetUploadOptionsSheetResult;
        FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult2 = new FilesetUploadOptionsSheetResult("UPLOAD_A_FILE", 1);
        UPLOAD_A_FILE = filesetUploadOptionsSheetResult2;
        FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult3 = new FilesetUploadOptionsSheetResult("CLOSE", 2);
        CLOSE = filesetUploadOptionsSheetResult3;
        $VALUES = new FilesetUploadOptionsSheetResult[]{filesetUploadOptionsSheetResult, filesetUploadOptionsSheetResult2, filesetUploadOptionsSheetResult3};
        CREATOR = new BorrowHome.Creator(11);
    }

    public static FilesetUploadOptionsSheetResult valueOf(String str) {
        return (FilesetUploadOptionsSheetResult) Enum.valueOf(FilesetUploadOptionsSheetResult.class, str);
    }

    public static FilesetUploadOptionsSheetResult[] values() {
        return (FilesetUploadOptionsSheetResult[]) $VALUES.clone();
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
