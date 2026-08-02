package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g3j implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g3j> CREATOR = new mmh(24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final cm2 f;

    public g3j(String str, String str2, String str3, String str4, boolean z, cm2 cm2Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        cm2Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = cm2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
    }
}
