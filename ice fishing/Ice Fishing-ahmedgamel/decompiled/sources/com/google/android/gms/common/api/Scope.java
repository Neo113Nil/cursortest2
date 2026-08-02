package com.google.android.gms.common.api;

import B8.d;
import R2.w;
import S2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.e;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new d(7);

    /* renamed from: n, reason: collision with root package name */
    public final int f24393n;

    /* renamed from: u, reason: collision with root package name */
    public final String f24394u;

    public Scope(int i, String str) {
        w.f(str, "scopeUri must not be null or empty");
        this.f24393n = i;
        this.f24394u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f24394u.equals(((Scope) obj).f24394u);
    }

    public final int hashCode() {
        return this.f24394u.hashCode();
    }

    public final String toString() {
        return this.f24394u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = e.x(parcel, 20293);
        e.w(parcel, 1, 4);
        parcel.writeInt(this.f24393n);
        e.r(parcel, 2, this.f24394u);
        e.z(parcel, x9);
    }
}
