package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class EO implements Comparator, Parcelable {
    public static final Parcelable.Creator<EO> CREATOR = new V8(25);

    /* renamed from: n, reason: collision with root package name */
    public final AO[] f24609n;

    /* renamed from: u, reason: collision with root package name */
    public int f24610u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24611v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24612w;

    public EO(Parcel parcel) {
        this.f24611v = parcel.readString();
        AO[] aoArr = (AO[]) parcel.createTypedArray(AO.CREATOR);
        String str = AbstractC3159eu.f29993a;
        this.f24609n = aoArr;
        this.f24612w = aoArr.length;
    }

    public final EO a(String str) {
        return Objects.equals(this.f24611v, str) ? this : new EO(str, false, this.f24609n);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AO ao = (AO) obj2;
        UUID uuid = Yw.f28760a;
        UUID uuid2 = ((AO) obj).f23671u;
        return uuid.equals(uuid2) ? !uuid.equals(ao.f23671u) ? 1 : 0 : uuid2.compareTo(ao.f23671u);
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
        if (obj != null && EO.class == obj.getClass()) {
            EO eo = (EO) obj;
            if (Objects.equals(this.f24611v, eo.f24611v) && Arrays.equals(this.f24609n, eo.f24609n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24610u;
        if (i != 0) {
            return i;
        }
        String str = this.f24611v;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f24609n);
        this.f24610u = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24611v);
        parcel.writeTypedArray(this.f24609n, 0);
    }

    public EO(String str, boolean z3, AO... aoArr) {
        this.f24611v = str;
        aoArr = z3 ? (AO[]) aoArr.clone() : aoArr;
        this.f24609n = aoArr;
        this.f24612w = aoArr.length;
        Arrays.sort(aoArr, this);
    }
}
