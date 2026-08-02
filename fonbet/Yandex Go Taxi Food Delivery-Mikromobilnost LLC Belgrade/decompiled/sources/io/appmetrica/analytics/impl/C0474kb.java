package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0474kb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
        return new C0503lb(readValue instanceof Boolean ? (Boolean) readValue : null, IdentifierStatus.INSTANCE.from(parcel.readString()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0503lb[i];
    }
}
