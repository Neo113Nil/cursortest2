package com.google.android.gms.internal.wallet;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public abstract class zzc {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        zzc.class.getClassLoader();
    }

    public static Parcelable zzb(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zze(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(Boxes$$ExternalSyntheticOutline1.m(dataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(dataAvail).length() + 45)));
        }
    }
}
