package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class wgk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<wgk> CREATOR = new tgk(2);
    public final String a;
    public final String b;
    public final Uri c;
    public final id d;
    public final String e;
    public final tyh f;
    public final eck g;
    public final String h;
    public final String i;

    public wgk(String str, String str2, Uri uri, id idVar, String str3, tyh tyhVar, eck eckVar, String str4, String str5) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = idVar;
        this.e = str3;
        this.f = tyhVar;
        this.g = eckVar;
        this.h = str4;
        this.i = str5;
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
        parcel.writeParcelable(this.c, i);
        id idVar = this.d;
        if (idVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(idVar.name());
        }
        parcel.writeString(this.e);
        tyh tyhVar = this.f;
        if (tyhVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tyhVar.writeToParcel(parcel, i);
        }
        eck eckVar = this.g;
        if (eckVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eckVar.a);
        }
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
