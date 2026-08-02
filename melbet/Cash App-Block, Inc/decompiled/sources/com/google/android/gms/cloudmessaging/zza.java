package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;

/* loaded from: classes4.dex */
public final class zza implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt);
                    } else {
                        intent = (Intent) ComposeUtilsKt.createParcelable(parcel, readInt, Intent.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new CloudMessage(intent);
            default:
                return new zzd(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new CloudMessage[i];
            default:
                return new zzd[i];
        }
    }
}
