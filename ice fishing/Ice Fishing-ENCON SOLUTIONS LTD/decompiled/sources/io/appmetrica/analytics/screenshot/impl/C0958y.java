package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0959z(parcel.readByte() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new C0959z[i2];
    }
}
