package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class smk implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<smk> CREATOR = new tgk(11);
    private static final long serialVersionUID = 1841516759183323125L;
    public final String a;
    public final cvl b;
    public final boolean c;
    public final boolean d;
    public final tn6 e;
    public final tn6 f;
    public final tn6 g;
    public final String h;
    public final String i;
    public final String j;
    public final ece k;
    public final ece l;

    public smk(String str, cvl cvlVar, boolean z, boolean z2, tn6 tn6Var, tn6 tn6Var2, tn6 tn6Var3, String str2, String str3, String str4, ece eceVar, ece eceVar2) {
        str.getClass();
        cvlVar.getClass();
        eceVar.getClass();
        eceVar2.getClass();
        this.a = str;
        this.b = cvlVar;
        this.c = z;
        this.d = z2;
        this.e = tn6Var;
        this.f = tn6Var2;
        this.g = tn6Var3;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = eceVar;
        this.l = eceVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smk)) {
            return false;
        }
        smk smkVar = (smk) obj;
        return Intrinsics.d(this.a, smkVar.a) && Intrinsics.d(this.b, smkVar.b) && this.c == smkVar.c && this.d == smkVar.d && Intrinsics.d(this.e, smkVar.e) && Intrinsics.d(this.f, smkVar.f) && Intrinsics.d(this.g, smkVar.g) && Intrinsics.d(this.h, smkVar.h) && Intrinsics.d(this.i, smkVar.i) && Intrinsics.d(this.j, smkVar.j) && Intrinsics.d(this.k, smkVar.k) && Intrinsics.d(this.l, smkVar.l);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        tn6 tn6Var = this.e;
        int hashCode = (e + (tn6Var == null ? 0 : tn6Var.hashCode())) * 31;
        tn6 tn6Var2 = this.f;
        int hashCode2 = (hashCode + (tn6Var2 == null ? 0 : tn6Var2.hashCode())) * 31;
        tn6 tn6Var3 = this.g;
        int hashCode3 = (hashCode2 + (tn6Var3 == null ? 0 : tn6Var3.hashCode())) * 31;
        String str = this.h;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return this.l.hashCode() + ((this.k.hashCode() + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalPlaylistHeader(type=");
        sb.append(this.a);
        sb.append(", playlist=");
        sb.append(this.b);
        sb.append(", ready=");
        dfi.t(sb, this.c, ", isUnseen=", this.d, ", cover=");
        sb.append(this.e);
        sb.append(", rolloverCover=");
        sb.append(this.f);
        sb.append(", coverWithoutText=");
        sb.append(this.g);
        sb.append(", previewDescription=");
        sb.append(this.h);
        sb.append(", description=");
        su4.v(sb, this.i, ", idFrom=", this.j, ", background=");
        sb.append(this.k);
        sb.append(", coverMeta=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        this.k.writeToParcel(parcel, i);
        this.l.writeToParcel(parcel, i);
    }
}
