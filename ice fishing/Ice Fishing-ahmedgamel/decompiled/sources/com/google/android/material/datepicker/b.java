package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new B8.d(25);

    /* renamed from: n, reason: collision with root package name */
    public final n f36703n;

    /* renamed from: u, reason: collision with root package name */
    public final n f36704u;

    /* renamed from: v, reason: collision with root package name */
    public final d f36705v;

    /* renamed from: w, reason: collision with root package name */
    public final n f36706w;

    /* renamed from: x, reason: collision with root package name */
    public final int f36707x;

    /* renamed from: y, reason: collision with root package name */
    public final int f36708y;

    /* renamed from: z, reason: collision with root package name */
    public final int f36709z;

    public b(n nVar, n nVar2, d dVar, n nVar3, int i) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f36703n = nVar;
        this.f36704u = nVar2;
        this.f36706w = nVar3;
        this.f36707x = i;
        this.f36705v = dVar;
        if (nVar3 != null && nVar.f36765n.compareTo(nVar3.f36765n) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f36765n.compareTo(nVar2.f36765n) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > v.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f36709z = nVar.d(nVar2) + 1;
        this.f36708y = (nVar2.f36767v - nVar.f36767v) + 1;
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
        return this.f36703n.equals(bVar.f36703n) && this.f36704u.equals(bVar.f36704u) && Objects.equals(this.f36706w, bVar.f36706w) && this.f36707x == bVar.f36707x && this.f36705v.equals(bVar.f36705v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36703n, this.f36704u, this.f36706w, Integer.valueOf(this.f36707x), this.f36705v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f36703n, 0);
        parcel.writeParcelable(this.f36704u, 0);
        parcel.writeParcelable(this.f36706w, 0);
        parcel.writeParcelable(this.f36705v, 0);
        parcel.writeInt(this.f36707x);
    }
}
