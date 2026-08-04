package com.gamericefishpro.space.t0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Parcelable.ClassLoaderCreator {
    public static f1 a(Parcel parcel, ClassLoader classLoader) {
        f fVar;
        if (classLoader == null) {
            classLoader = e1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            fVar = f.v;
        } else if (i == 1) {
            fVar = f.z;
        } else {
            if (i != 2) {
                throw new IllegalStateException(y0.f(i, "Unsupported MutableState policy ", " was restored"));
            }
            fVar = f.w;
        }
        return new f1(value, fVar);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new f1[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
