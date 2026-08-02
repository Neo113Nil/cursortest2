package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class lmk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<lmk> CREATOR = new tgk(8);
    public static final lmk e = new lmk(mmk.b, true, true, true);
    public final mmk a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public lmk(mmk mmkVar, boolean z, boolean z2, boolean z3) {
        mmkVar.getClass();
        this.a = mmkVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
