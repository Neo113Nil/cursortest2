package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r9o extends u9o {

    @NotNull
    public static final Parcelable.Creator<r9o> CREATOR = new z8o(16);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final wds d;
    public final wds e;
    public final wds f;
    public final wds g;
    public final String h;
    public final long i;
    public final bfk j;
    public final q9o k;

    public r9o(String str, boolean z, boolean z2, wds wdsVar, wds wdsVar2, wds wdsVar3, wds wdsVar4, String str2, long j, bfk bfkVar, q9o q9oVar) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = wdsVar;
        this.e = wdsVar2;
        this.f = wdsVar3;
        this.g = wdsVar4;
        this.h = str2;
        this.i = j;
        this.j = bfkVar;
        this.k = q9oVar;
    }

    @Override // defpackage.u9o
    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.u9o
    public final wds e() {
        return this.g;
    }

    @Override // defpackage.u9o
    public final q9o f() {
        return this.k;
    }

    @Override // defpackage.u9o
    public final wds g() {
        return this.f;
    }

    @Override // defpackage.u9o
    public final wds h() {
        return this.e;
    }

    @Override // defpackage.u9o
    public final wds i() {
        return this.d;
    }

    @Override // defpackage.u9o
    public final String j() {
        return this.a;
    }

    @Override // defpackage.u9o
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.u9o
    public final boolean l() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
    }
}
