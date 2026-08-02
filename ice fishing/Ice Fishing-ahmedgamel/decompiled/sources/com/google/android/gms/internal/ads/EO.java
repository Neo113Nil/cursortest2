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
    public final AO[] f25370n;

    /* renamed from: u, reason: collision with root package name */
    public int f25371u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25372v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25373w;

    public EO(Parcel parcel) {
        this.f25372v = parcel.readString();
        AO[] aoArr = (AO[]) parcel.createTypedArray(AO.CREATOR);
        String str = AbstractC3182eu.f30782a;
        this.f25370n = aoArr;
        this.f25373w = aoArr.length;
    }

    public final EO a(String str) {
        return Objects.equals(this.f25372v, str) ? this : new EO(str, false, this.f25370n);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AO ao = (AO) obj2;
        UUID uuid = Yw.f29540a;
        UUID uuid2 = ((AO) obj).f24451u;
        return uuid.equals(uuid2) ? !uuid.equals(ao.f24451u) ? 1 : 0 : uuid2.compareTo(ao.f24451u);
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
            if (Objects.equals(this.f25372v, eo.f25372v) && Arrays.equals(this.f25370n, eo.f25370n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f25371u;
        if (i != 0) {
            return i;
        }
        String str = this.f25372v;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f25370n);
        this.f25371u = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25372v);
        parcel.writeTypedArray(this.f25370n, 0);
    }

    public EO(String str, boolean z6, AO... aoArr) {
        this.f25372v = str;
        aoArr = z6 ? (AO[]) aoArr.clone() : aoArr;
        this.f25370n = aoArr;
        this.f25373w = aoArr.length;
        Arrays.sort(aoArr, this);
    }
}
