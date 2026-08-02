package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class n13 implements p13 {

    @NotNull
    public static final Parcelable.Creator<n13> CREATOR = new i02(11);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public n13(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.p13
    public final boolean B() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(null, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    @Override // defpackage.p13
    public final boolean x() {
        return this.d;
    }

    @Override // defpackage.p13
    public final boolean z() {
        return this.c;
    }
}
