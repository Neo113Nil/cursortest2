package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class f implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new g(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new g[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new g(parcel, classLoader);
    }
}
