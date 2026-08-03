package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e7.c;
import p6.u;
import q6.a;
import x4.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new c(10);

    /* renamed from: g, reason: collision with root package name */
    public final int f1419g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1420h;

    public Scope(String str, int i10) {
        u.d(str, "scopeUri must not be null or empty");
        this.f1419g = i10;
        this.f1420h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1420h.equals(((Scope) obj).f1420h);
    }

    public final int hashCode() {
        return this.f1420h.hashCode();
    }

    public final String toString() {
        return this.f1420h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = f.g0(parcel, 20293);
        f.i0(parcel, 1, 4);
        parcel.writeInt(this.f1419g);
        f.c0(parcel, 2, this.f1420h);
        f.h0(parcel, g02);
    }
}
