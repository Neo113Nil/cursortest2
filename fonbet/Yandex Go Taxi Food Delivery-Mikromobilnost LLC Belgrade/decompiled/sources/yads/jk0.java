package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rf71;
import defpackage.sm81;
import defpackage.z2a1;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class jk0 implements Parcelable {
    public static final Parcelable.Creator<jk0> CREATOR = new ik0();
    public int b;
    public final UUID c;
    public final String d;
    public final String e;
    public final byte[] f;

    public jk0(Parcel parcel) {
        this.c = new UUID(parcel.readLong(), parcel.readLong());
        this.d = parcel.readString();
        String readString = parcel.readString();
        int i = rf71.a;
        this.e = readString;
        this.f = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return sm81.a.equals(this.c) || uuid.equals(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        jk0 jk0Var = (jk0) obj;
        return rf71.o(this.d, jk0Var.d) && rf71.o(this.e, jk0Var.e) && rf71.o(this.c, jk0Var.c) && Arrays.equals(this.f, jk0Var.f);
    }

    public final int hashCode() {
        if (this.b == 0) {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            this.b = Arrays.hashCode(this.f) + z2a1.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.e);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c.getMostSignificantBits());
        parcel.writeLong(this.c.getLeastSignificantBits());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    public jk0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.c = uuid;
        this.d = str;
        str2.getClass();
        this.e = str2;
        this.f = bArr;
    }
}
