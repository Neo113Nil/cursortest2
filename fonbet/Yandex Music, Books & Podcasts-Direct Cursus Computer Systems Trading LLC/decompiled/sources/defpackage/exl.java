package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class exl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<exl> CREATOR = new tgk(20);
    public final lxl a;
    public final dud b;
    public final String c;
    public final oxl d;

    public exl(lxl lxlVar, dud dudVar, String str, oxl oxlVar) {
        lxlVar.getClass();
        dudVar.getClass();
        oxlVar.getClass();
        this.a = lxlVar;
        this.b = dudVar;
        this.c = str;
        this.d = oxlVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
