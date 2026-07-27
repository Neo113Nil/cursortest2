package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class RO implements Comparator, Parcelable {
    public static final Parcelable.Creator<RO> CREATOR = new S8(25);

    /* renamed from: n, reason: collision with root package name */
    public final NO[] f27357n;

    /* renamed from: u, reason: collision with root package name */
    public int f27358u;

    /* renamed from: v, reason: collision with root package name */
    public final String f27359v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27360w;

    public RO(Parcel parcel) {
        this.f27359v = parcel.readString();
        NO[] noArr = (NO[]) parcel.createTypedArray(NO.CREATOR);
        String str = AbstractC3548lu.f32613a;
        this.f27357n = noArr;
        this.f27360w = noArr.length;
    }

    public final RO a(String str) {
        return Objects.equals(this.f27359v, str) ? this : new RO(str, false, this.f27357n);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        NO no = (NO) obj2;
        UUID uuid = AbstractC3389ix.f32028a;
        UUID uuid2 = ((NO) obj).f26539u;
        return uuid.equals(uuid2) ? !uuid.equals(no.f26539u) ? 1 : 0 : uuid2.compareTo(no.f26539u);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RO.class == obj.getClass()) {
            RO ro = (RO) obj;
            if (Objects.equals(this.f27359v, ro.f27359v) && Arrays.equals(this.f27357n, ro.f27357n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f27358u;
        if (i != 0) {
            return i;
        }
        String str = this.f27359v;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f27357n);
        this.f27358u = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27359v);
        parcel.writeTypedArray(this.f27357n, 0);
    }

    public RO(String str, boolean z8, NO... noArr) {
        this.f27359v = str;
        noArr = z8 ? (NO[]) noArr.clone() : noArr;
        this.f27357n = noArr;
        this.f27360w = noArr.length;
        Arrays.sort(noArr, this);
    }
}
