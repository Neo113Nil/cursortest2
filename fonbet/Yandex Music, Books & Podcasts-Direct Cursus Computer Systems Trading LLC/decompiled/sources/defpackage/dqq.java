package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dqq implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<dqq> CREATOR = new bwp(14);
    public final String a;
    public final String b;
    public final String c;
    public final c0p d;

    public dqq(String str, String str2, String str3, c0p c0pVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c0pVar;
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
        c0p c0pVar = this.d;
        if (c0pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c0pVar.name());
        }
    }
}
