package com.google.android.gms.common.api;

import A8.b;
import B8.d;
import P2.w;
import Q2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new d(7);

    /* renamed from: n, reason: collision with root package name */
    public final int f23613n;

    /* renamed from: u, reason: collision with root package name */
    public final String f23614u;

    public Scope(int i, String str) {
        w.f(str, "scopeUri must not be null or empty");
        this.f23613n = i;
        this.f23614u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f23614u.equals(((Scope) obj).f23614u);
    }

    public final int hashCode() {
        return this.f23614u.hashCode();
    }

    public final String toString() {
        return this.f23614u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = b.G(parcel, 20293);
        b.F(parcel, 1, 4);
        parcel.writeInt(this.f23613n);
        b.z(parcel, 2, this.f23614u);
        b.I(parcel, G7);
    }
}
