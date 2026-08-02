package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0793vc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0822wc(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0822wc[i];
    }
}
