package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mwg implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<mwg> CREATOR = new pnf(13);
    public final String a;
    public final String b;
    public final String c;
    public final qo6 d;
    public final jzb e;
    public final boolean f;

    public mwg(String str, String str2, String str3, qo6 qo6Var, jzb jzbVar, boolean z) {
        str.getClass();
        str3.getClass();
        qo6Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qo6Var;
        this.e = jzbVar;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwg)) {
            return false;
        }
        mwg mwgVar = (mwg) obj;
        return Intrinsics.d(this.a, mwgVar.a) && Intrinsics.d(this.b, mwgVar.b) && Intrinsics.d(this.c, mwgVar.c) && this.d == mwgVar.d && this.e == mwgVar.e && this.f == mwgVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        jzb jzbVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("LongTapHeaderUiData(title=", this.a, ", subtitle=", this.b, ", coverUrl=");
        m.append(this.c);
        m.append(", coverType=");
        m.append(this.d);
        m.append(", explicitType=");
        m.append(this.e);
        m.append(", hasExplicitMark=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        jzb jzbVar = this.e;
        if (jzbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jzbVar.name());
        }
        parcel.writeInt(this.f ? 1 : 0);
    }
}
