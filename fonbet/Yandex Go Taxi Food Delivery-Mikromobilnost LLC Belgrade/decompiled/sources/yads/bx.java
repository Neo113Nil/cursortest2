package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;

/* loaded from: classes7.dex */
public final class bx extends g11 {
    public static final Parcelable.Creator<bx> CREATOR = new ax();
    public final String c;
    public final String d;
    public final String e;

    public bx(Parcel parcel) {
        super("COMM");
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
        if (obj != null && bx.class == obj.getClass()) {
            bx bxVar = (bx) obj;
            if (rf71.o(this.d, bxVar.d) && rf71.o(this.c, bxVar.c) && rf71.o(this.e, bxVar.e)) {
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
        return this.b + ": language=" + this.c + ", description=" + this.d;
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

    public bx(String str, String str2, String str3) {
        super("COMM");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
