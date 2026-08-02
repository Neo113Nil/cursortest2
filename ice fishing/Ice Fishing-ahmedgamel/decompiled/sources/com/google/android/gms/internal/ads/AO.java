package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class AO implements Parcelable {
    public static final Parcelable.Creator<AO> CREATOR = new V8(26);

    /* renamed from: n, reason: collision with root package name */
    public int f24450n;

    /* renamed from: u, reason: collision with root package name */
    public final UUID f24451u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24452v;

    /* renamed from: w, reason: collision with root package name */
    public final String f24453w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f24454x;

    public AO(Parcel parcel) {
        this.f24451u = new UUID(parcel.readLong(), parcel.readLong());
        this.f24452v = parcel.readString();
        String readString = parcel.readString();
        String str = AbstractC3182eu.f30782a;
        this.f24453w = readString;
        this.f24454x = parcel.createByteArray();
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
        return Objects.equals(this.f24452v, ao.f24452v) && Objects.equals(this.f24453w, ao.f24453w) && Objects.equals(this.f24451u, ao.f24451u) && Arrays.equals(this.f24454x, ao.f24454x);
    }

    public final int hashCode() {
        int i = this.f24450n;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f24451u.hashCode() * 31;
        String str = this.f24452v;
        int hashCode2 = Arrays.hashCode(this.f24454x) + AbstractC5128c.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f24453w);
        this.f24450n = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f24451u;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f24452v);
        parcel.writeString(this.f24453w);
        parcel.writeByteArray(this.f24454x);
    }

    public AO(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f24451u = uuid;
        this.f24452v = null;
        this.f24453w = H4.h(str);
        this.f24454x = bArr;
    }
}
