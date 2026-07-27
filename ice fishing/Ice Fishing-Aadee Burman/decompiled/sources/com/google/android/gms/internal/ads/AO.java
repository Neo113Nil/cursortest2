package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AO implements Parcelable {
    public static final Parcelable.Creator<AO> CREATOR = new V8(26);

    /* renamed from: n, reason: collision with root package name */
    public int f23670n;

    /* renamed from: u, reason: collision with root package name */
    public final UUID f23671u;

    /* renamed from: v, reason: collision with root package name */
    public final String f23672v;

    /* renamed from: w, reason: collision with root package name */
    public final String f23673w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f23674x;

    public AO(Parcel parcel) {
        this.f23671u = new UUID(parcel.readLong(), parcel.readLong());
        this.f23672v = parcel.readString();
        String readString = parcel.readString();
        String str = AbstractC3159eu.f29993a;
        this.f23673w = readString;
        this.f23674x = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AO)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AO ao = (AO) obj;
        return Objects.equals(this.f23672v, ao.f23672v) && Objects.equals(this.f23673w, ao.f23673w) && Objects.equals(this.f23671u, ao.f23671u) && Arrays.equals(this.f23674x, ao.f23674x);
    }

    public final int hashCode() {
        int i = this.f23670n;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f23671u.hashCode() * 31;
        String str = this.f23672v;
        int hashCode2 = Arrays.hashCode(this.f23674x) + u1.h.k((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f23673w);
        this.f23670n = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f23671u;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f23672v);
        parcel.writeString(this.f23673w);
        parcel.writeByteArray(this.f23674x);
    }

    public AO(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f23671u = uuid;
        this.f23672v = null;
        this.f23673w = H4.h(str);
        this.f23674x = bArr;
    }
}
