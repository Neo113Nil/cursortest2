package com.google.android.gms.common.api;

import C.l;
import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC1035a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f2678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2679b;

    public Scope(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f2678a = i2;
        this.f2679b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2679b.equals(((Scope) obj).f2679b);
    }

    public final int hashCode() {
        return this.f2679b.hashCode();
    }

    public final String toString() {
        return this.f2679b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f2678a);
        AbstractC0083a.v(parcel, 2, this.f2679b);
        AbstractC0083a.z(parcel, y2);
    }
}
