package com.google.android.gms.common.api;

import O2.w;
import P2.a;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new F0.a(5);

    /* renamed from: n, reason: collision with root package name */
    public final int f23766n;

    /* renamed from: u, reason: collision with root package name */
    public final String f23767u;

    public Scope(int i, String str) {
        w.f(str, "scopeUri must not be null or empty");
        this.f23766n = i;
        this.f23767u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f23767u.equals(((Scope) obj).f23767u);
    }

    public final int hashCode() {
        return this.f23767u.hashCode();
    }

    public final String toString() {
        return this.f23767u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = f.B(parcel, 20293);
        f.A(parcel, 1, 4);
        parcel.writeInt(this.f23766n);
        f.u(parcel, 2, this.f23767u);
        f.C(parcel, B8);
    }
}
