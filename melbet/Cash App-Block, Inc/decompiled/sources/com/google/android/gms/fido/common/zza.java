package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.fido.common.Transport;

/* loaded from: classes4.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.fromString(parcel.readString());
        } catch (Transport.UnsupportedTransportException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}
