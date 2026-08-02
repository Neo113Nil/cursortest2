package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ax3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ax3> CREATOR = new i02(20);
    public final String a;
    public final String b;
    public final int c;
    public final s1u d;
    public final se e;

    public ax3(String str, String str2, int i, s1u s1uVar, se seVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = s1uVar;
        this.e = seVar;
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
        parcel.writeInt(this.c);
        s1u s1uVar = this.d;
        if (s1uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s1uVar.writeToParcel(parcel, i);
        }
        se seVar = this.e;
        if (seVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seVar.writeToParcel(parcel, i);
        }
    }
}
