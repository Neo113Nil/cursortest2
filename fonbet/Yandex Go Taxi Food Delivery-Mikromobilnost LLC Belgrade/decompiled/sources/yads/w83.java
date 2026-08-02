package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.z2a1;

/* loaded from: classes7.dex */
public final class w83 extends g11 {
    public static final Parcelable.Creator<w83> CREATOR = new v83();
    public final String c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w83(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = parcel.readString();
        this.d = parcel.readString();
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
        if (obj != null && w83.class == obj.getClass()) {
            w83 w83Var = (w83) obj;
            if (this.b.equals(w83Var.b) && rf71.o(this.c, w83Var.c) && rf71.o(this.d, w83Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = z2a1.a(527, this.b);
        String str = this.c;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.b + ": url=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public w83(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }
}
