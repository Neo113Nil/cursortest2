package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;

/* loaded from: classes7.dex */
public final class ua1 extends g11 {
    public static final Parcelable.Creator<ua1> CREATOR = new ta1();
    public final String c;
    public final String d;
    public final String e;

    public ua1(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ua1.class == obj.getClass()) {
            ua1 ua1Var = (ua1) obj;
            if (rf71.o(this.d, ua1Var.d) && rf71.o(this.c, ua1Var.c) && rf71.o(this.e, ua1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.b + ": domain=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public ua1(String str, String str2, String str3) {
        super("----");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
