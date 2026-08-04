package com.gamericefishpro.space.y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.f1.t;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<c> CREATOR = new t(9);
    public boolean i;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.i = parcel.readInt() == 1;
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
