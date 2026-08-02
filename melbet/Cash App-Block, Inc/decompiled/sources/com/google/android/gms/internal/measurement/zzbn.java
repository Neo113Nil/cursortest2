package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class zzbn {
    public static final ClassLoader zzb = zzbn.class.getClassLoader();

    public static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
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

    public static void zzd(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static HashMap zze(Parcel parcel) {
        return parcel.readHashMap(zzb);
    }

    public static void zzf(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(Boxes$$ExternalSyntheticOutline1.m(dataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(dataAvail).length() + 45)));
        }
    }
}
