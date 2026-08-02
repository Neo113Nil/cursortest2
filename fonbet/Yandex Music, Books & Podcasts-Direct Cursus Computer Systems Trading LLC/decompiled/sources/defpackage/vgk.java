package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class vgk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<vgk> CREATOR = new tgk(1);
    public final String a;
    public final String b;
    public final String c;
    public final hd d;
    public final String e;
    public final syh f;
    public final yhk g;
    public final String h;
    public final boolean i;
    public final String j;

    public vgk(String str, String str2, String str3, hd hdVar, String str4, syh syhVar, yhk yhkVar, String str5, boolean z, String str6) {
        dfi.s(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hdVar;
        this.e = str4;
        this.f = syhVar;
        this.g = yhkVar;
        this.h = str5;
        this.i = z;
        this.j = str6;
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
        hd hdVar = this.d;
        if (hdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hdVar.name());
        }
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
    }
}
