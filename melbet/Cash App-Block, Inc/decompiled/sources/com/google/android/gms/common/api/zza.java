package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;

/* loaded from: classes4.dex */
public final class zza implements Parcelable.Creator {
    public static final zza zzb = new zza(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zza(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ComplianceOptions complianceOptions = null;
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return ApiMetadata.zzb;
                }
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        complianceOptions = (ComplianceOptions) ComposeUtilsKt.createParcelable(parcel, readInt, ComplianceOptions.CREATOR);
                    } else if (c != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        z = ComposeUtilsKt.readBoolean(parcel, readInt);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new ApiMetadata(complianceOptions, z);
            case 1:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                boolean z2 = true;
                int i3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readInt2);
                    } else if (c2 == 2) {
                        i3 = ComposeUtilsKt.readInt(parcel, readInt2);
                    } else if (c2 == 3) {
                        i4 = ComposeUtilsKt.readInt(parcel, readInt2);
                    } else if (c2 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt2);
                    } else {
                        z2 = ComposeUtilsKt.readBoolean(parcel, readInt2);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new ComplianceOptions(i2, i3, z2, i4);
            default:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readInt3);
                    } else if (c3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        str = ComposeUtilsKt.createString(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new Scope(i, str);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new ApiMetadata[i];
            case 1:
                return new ComplianceOptions[i];
            default:
                return new Scope[i];
        }
    }
}
