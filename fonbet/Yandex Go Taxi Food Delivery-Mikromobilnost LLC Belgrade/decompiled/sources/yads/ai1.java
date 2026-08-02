package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.z2a1;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ai1 implements bs1 {
    public static final Parcelable.Creator<ai1> CREATOR = new zh1();
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;

    public ai1(Parcel parcel) {
        String readString = parcel.readString();
        int i = rf71.a;
        this.b = readString;
        this.c = parcel.createByteArray();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
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
        if (obj != null && ai1.class == obj.getClass()) {
            ai1 ai1Var = (ai1) obj;
            if (this.b.equals(ai1Var.b) && Arrays.equals(this.c, ai1Var.c) && this.d == ai1Var.d && this.e == ai1Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + z2a1.a(527, this.b)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "mdta: key=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public ai1(int i, int i2, String str, byte[] bArr) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }
}
