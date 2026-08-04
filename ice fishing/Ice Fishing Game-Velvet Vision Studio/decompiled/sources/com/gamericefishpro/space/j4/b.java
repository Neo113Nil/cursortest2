package com.gamericefishpro.space.j4;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.f1.t;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {
    public final Parcelable d;
    public static final a e = new a();
    public static final Parcelable.Creator<b> CREATOR = new t(2);

    public b() {
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? e : parcelable;
    }
}
