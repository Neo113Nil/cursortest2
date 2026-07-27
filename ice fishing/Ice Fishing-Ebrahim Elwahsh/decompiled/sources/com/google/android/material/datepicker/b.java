package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new F0.a(23);

    /* renamed from: n, reason: collision with root package name */
    public final o f36098n;

    /* renamed from: u, reason: collision with root package name */
    public final o f36099u;

    /* renamed from: v, reason: collision with root package name */
    public final d f36100v;

    /* renamed from: w, reason: collision with root package name */
    public final o f36101w;

    /* renamed from: x, reason: collision with root package name */
    public final int f36102x;

    /* renamed from: y, reason: collision with root package name */
    public final int f36103y;

    /* renamed from: z, reason: collision with root package name */
    public final int f36104z;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f36098n = oVar;
        this.f36099u = oVar2;
        this.f36101w = oVar3;
        this.f36102x = i;
        this.f36100v = dVar;
        if (oVar3 != null && oVar.f36162n.compareTo(oVar3.f36162n) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f36162n.compareTo(oVar2.f36162n) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > w.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f36104z = oVar.d(oVar2) + 1;
        this.f36103y = (oVar2.f36164v - oVar.f36164v) + 1;
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
        return this.f36098n.equals(bVar.f36098n) && this.f36099u.equals(bVar.f36099u) && Objects.equals(this.f36101w, bVar.f36101w) && this.f36102x == bVar.f36102x && this.f36100v.equals(bVar.f36100v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36098n, this.f36099u, this.f36101w, Integer.valueOf(this.f36102x), this.f36100v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f36098n, 0);
        parcel.writeParcelable(this.f36099u, 0);
        parcel.writeParcelable(this.f36101w, 0);
        parcel.writeParcelable(this.f36100v, 0);
        parcel.writeInt(this.f36102x);
    }
}
