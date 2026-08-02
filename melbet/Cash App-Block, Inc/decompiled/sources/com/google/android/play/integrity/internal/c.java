package com.google.android.play.integrity.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public abstract class c {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        c.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
