package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new B8.d(25);

    /* renamed from: n, reason: collision with root package name */
    public final n f35935n;

    /* renamed from: u, reason: collision with root package name */
    public final n f35936u;

    /* renamed from: v, reason: collision with root package name */
    public final d f35937v;

    /* renamed from: w, reason: collision with root package name */
    public final n f35938w;

    /* renamed from: x, reason: collision with root package name */
    public final int f35939x;

    /* renamed from: y, reason: collision with root package name */
    public final int f35940y;

    /* renamed from: z, reason: collision with root package name */
    public final int f35941z;

    public b(n nVar, n nVar2, d dVar, n nVar3, int i) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f35935n = nVar;
        this.f35936u = nVar2;
        this.f35938w = nVar3;
        this.f35939x = i;
        this.f35937v = dVar;
        if (nVar3 != null && nVar.f35997n.compareTo(nVar3.f35997n) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f35997n.compareTo(nVar2.f35997n) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > v.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f35941z = nVar.d(nVar2) + 1;
        this.f35940y = (nVar2.f35999v - nVar.f35999v) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35935n.equals(bVar.f35935n) && this.f35936u.equals(bVar.f35936u) && Objects.equals(this.f35938w, bVar.f35938w) && this.f35939x == bVar.f35939x && this.f35937v.equals(bVar.f35937v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35935n, this.f35936u, this.f35938w, Integer.valueOf(this.f35939x), this.f35937v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f35935n, 0);
        parcel.writeParcelable(this.f35936u, 0);
        parcel.writeParcelable(this.f35938w, 0);
        parcel.writeParcelable(this.f35937v, 0);
        parcel.writeInt(this.f35939x);
    }
}
