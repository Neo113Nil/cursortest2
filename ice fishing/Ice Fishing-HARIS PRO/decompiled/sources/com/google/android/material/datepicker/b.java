package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new F0.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final k f2504a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2505b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2506c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2507d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2508f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2509g;

    public b(k kVar, k kVar2, d dVar, k kVar3, int i) {
        Objects.requireNonNull(kVar, "start cannot be null");
        Objects.requireNonNull(kVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2504a = kVar;
        this.f2505b = kVar2;
        this.f2507d = kVar3;
        this.e = i;
        this.f2506c = dVar;
        if (kVar3 != null && kVar.f2528a.compareTo(kVar3.f2528a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kVar3 != null && kVar3.f2528a.compareTo(kVar2.f2528a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > r.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2509g = kVar.d(kVar2) + 1;
        this.f2508f = (kVar2.f2530c - kVar.f2530c) + 1;
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
        return this.f2504a.equals(bVar.f2504a) && this.f2505b.equals(bVar.f2505b) && Objects.equals(this.f2507d, bVar.f2507d) && this.e == bVar.e && this.f2506c.equals(bVar.f2506c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2504a, this.f2505b, this.f2507d, Integer.valueOf(this.e), this.f2506c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2504a, 0);
        parcel.writeParcelable(this.f2505b, 0);
        parcel.writeParcelable(this.f2507d, 0);
        parcel.writeParcelable(this.f2506c, 0);
        parcel.writeInt(this.e);
    }
}
