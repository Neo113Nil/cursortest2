package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c5c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c5c> CREATOR = new a5c(0);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;

    public c5c(String str, String str2, int i, int i2, String str3, String str4, boolean z) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final double d() {
        this.a.getClass();
        this.b.getClass();
        this.e.getClass();
        this.f.getClass();
        return (this.d - this.c) / 100;
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
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
