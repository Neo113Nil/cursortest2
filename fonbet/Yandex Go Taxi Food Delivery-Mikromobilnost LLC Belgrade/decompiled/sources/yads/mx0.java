package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class mx0 extends g11 {
    public static final Parcelable.Creator<mx0> CREATOR = new lx0();
    public final String c;
    public final String d;
    public final String e;
    public final byte[] f;

    public mx0(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.createByteArray();
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
        if (obj != null && mx0.class == obj.getClass()) {
            mx0 mx0Var = (mx0) obj;
            if (rf71.o(this.c, mx0Var.c) && rf71.o(this.d, mx0Var.d) && rf71.o(this.e, mx0Var.e) && Arrays.equals(this.f, mx0Var.f)) {
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
        return Arrays.hashCode(this.f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.g11
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", filename=" + this.d + ", description=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public mx0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bArr;
    }
}
