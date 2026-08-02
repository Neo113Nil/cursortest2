package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hy implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<hy> CREATOR = new l(14);
    public final String a;
    public final String b;
    public final dud c;
    public final String d;
    public final boolean e;
    public final ky f;
    public final String g;

    public hy(String str, String str2, dud dudVar, String str3, boolean z, ky kyVar, String str4) {
        str.getClass();
        str2.getClass();
        dudVar.getClass();
        kyVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = dudVar;
        this.d = str3;
        this.e = z;
        this.f = kyVar;
        this.g = str4;
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
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
    }
}
