package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.z2a1;

/* loaded from: classes7.dex */
public class zk3 implements bs1 {
    public static final Parcelable.Creator<zk3> CREATOR = new xk3();
    public final String b;
    public final String c;

    public zk3(Parcel parcel) {
        String readString = parcel.readString();
        int i = rf71.a;
        this.b = readString;
        this.c = parcel.readString();
    }

    @Override // yads.bs1
    public final void a(a291 a291Var) {
        String str = this.b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                a291Var.c = this.c;
                break;
            case "TITLE":
                a291Var.a = this.c;
                break;
            case "DESCRIPTION":
                a291Var.g = this.c;
                break;
            case "ALBUMARTIST":
                a291Var.d = this.c;
                break;
            case "ARTIST":
                a291Var.b = this.c;
                break;
        }
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
        if (obj != null && getClass() == obj.getClass()) {
            zk3 zk3Var = (zk3) obj;
            if (this.b.equals(zk3Var.b) && this.c.equals(zk3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + z2a1.a(527, this.b);
    }

    public final String toString() {
        return "VC: " + this.b + "=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public zk3(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }
}
