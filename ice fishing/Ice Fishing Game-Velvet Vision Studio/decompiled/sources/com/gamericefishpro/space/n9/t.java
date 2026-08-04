package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.gamericefishpro.space.w8.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new com.gamericefishpro.space.h.a(7);
    public final Bundle d;

    public t(Bundle bundle) {
        this.d = bundle;
    }

    public final Object b(String str) {
        return this.d.get(str);
    }

    public final Double c() {
        return Double.valueOf(this.d.getDouble("value"));
    }

    public final String d() {
        return this.d.getString("currency");
    }

    public final Bundle f() {
        return new Bundle(this.d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.N(parcel, 2, f());
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }
}
