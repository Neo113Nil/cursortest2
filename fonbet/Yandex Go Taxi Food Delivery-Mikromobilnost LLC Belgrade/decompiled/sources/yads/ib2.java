package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.z2a1;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ib2 implements bs1 {
    public static final Parcelable.Creator<ib2> CREATOR = new hb2();
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

    public ib2(Parcel parcel) {
        this.b = parcel.readInt();
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.createByteArray();
    }

    @Override // yads.bs1
    public final void a(a291 a291Var) {
        byte[] bArr = this.i;
        int i = this.b;
        if (a291Var.j != null) {
            Integer valueOf = Integer.valueOf(i);
            int i2 = rf71.a;
            if (!valueOf.equals(3) && rf71.o(a291Var.k, 3)) {
                return;
            }
        }
        a291Var.j = (byte[]) bArr.clone();
        a291Var.k = Integer.valueOf(i);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ib2.class == obj.getClass()) {
            ib2 ib2Var = (ib2) obj;
            if (this.b == ib2Var.b && this.c.equals(ib2Var.c) && this.d.equals(ib2Var.d) && this.e == ib2Var.e && this.f == ib2Var.f && this.g == ib2Var.g && this.h == ib2Var.h && Arrays.equals(this.i, ib2Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.i) + ((((((((z2a1.a(z2a1.a((this.b + 527) * 31, this.c), this.d) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    public ib2(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = bArr;
    }
}
