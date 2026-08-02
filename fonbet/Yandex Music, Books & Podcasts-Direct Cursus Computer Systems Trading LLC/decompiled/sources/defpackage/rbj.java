package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rbj implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<rbj> CREATOR = new mmh(26);
    public final lik a;
    public final String b;
    public final String c;
    public final dud d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final ubj h;

    public rbj(lik likVar, String str, String str2, dud dudVar, String str3, boolean z, boolean z2, ubj ubjVar) {
        likVar.getClass();
        str.getClass();
        str2.getClass();
        dudVar.getClass();
        ubjVar.getClass();
        this.a = likVar;
        this.b = str;
        this.c = str2;
        this.d = dudVar;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = ubjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
    }
}
