package com.yandex.plus.pay.ui.feature.tarifficator.mobile.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        UUID uuid = (UUID) parcel.readSerializable();
        PlusPayCompositeOffers.Offer offer = (PlusPayCompositeOffers.Offer) parcel.readParcelable(d.class.getClassLoader());
        com.yandex.plus.pay.api.analytics.d dVar = (com.yandex.plus.pay.api.analytics.d) parcel.readParcelable(d.class.getClassLoader());
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        int i = 0;
        while (i != readInt) {
            i = com.appsflyer.internal.k.b(parcel, linkedHashMap, parcel.readString(), i, 1);
        }
        int readInt2 = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
        for (int i2 = 0; i2 != readInt2; i2++) {
            linkedHashSet.add(c.valueOf(parcel.readString()));
        }
        return new d(uuid, offer, dVar, linkedHashMap, linkedHashSet, b.valueOf(parcel.readString()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new d[i];
    }
}
