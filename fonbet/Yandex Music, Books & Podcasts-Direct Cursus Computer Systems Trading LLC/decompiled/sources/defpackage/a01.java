package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a01 implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<a01> CREATOR = new l(22);
    public static final a01 h = new a01(-1, -1, -1, 0, -1, -1, -1);
    private static final long serialVersionUID = 1831549306385168022L;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public a01(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a01)) {
            return false;
        }
        a01 a01Var = (a01) obj;
        return this.a == a01Var.a && this.b == a01Var.b && this.c == a01Var.c && this.d == a01Var.d && this.e == a01Var.e && this.f == a01Var.f && this.g == a01Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + f1d.a(this.f, f1d.a(this.e, f1d.a(this.d, f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("Counts(tracks=", this.a, this.b, ", directAlbums=", ", alsoAlbums=");
        hrg.w(this.c, this.d, ", discographyAlbums=", ", phonotekaTracks=", l);
        hrg.w(this.e, this.f, ", phonotekaCachedTracks=", ", phonotekaAlbums=", l);
        return f1d.i(l, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public /* synthetic */ a01(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, -1, -1, -1);
    }
}
