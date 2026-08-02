package com.squareup.cash.history.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.fileupload.api.UriString;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ReportAbuseResult implements Parcelable {
    public static final /* synthetic */ ReportAbuseResult[] $VALUES;
    public static final Parcelable.Creator<ReportAbuseResult> CREATOR;
    public static final ReportAbuseResult FAILURE;
    public static final ReportAbuseResult SUCCESS;

    static {
        ReportAbuseResult reportAbuseResult = new ReportAbuseResult("SUCCESS", 0);
        SUCCESS = reportAbuseResult;
        ReportAbuseResult reportAbuseResult2 = new ReportAbuseResult("FAILURE", 1);
        FAILURE = reportAbuseResult2;
        $VALUES = new ReportAbuseResult[]{reportAbuseResult, reportAbuseResult2};
        CREATOR = new UriString.Creator(22);
    }

    public static ReportAbuseResult valueOf(String str) {
        return (ReportAbuseResult) Enum.valueOf(ReportAbuseResult.class, str);
    }

    public static ReportAbuseResult[] values() {
        return (ReportAbuseResult[]) $VALUES.clone();
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
