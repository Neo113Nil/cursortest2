package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class mt extends g11 {
    public static final Parcelable.Creator<mt> CREATOR = new lt();
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final g11[] h;

    public mt(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new g11[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h[i2] = (g11) parcel.readParcelable(g11.class.getClassLoader());
        }
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // yads.g11, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mt.class == obj.getClass()) {
            mt mtVar = (mt) obj;
            if (this.d == mtVar.d && this.e == mtVar.e && this.f == mtVar.f && this.g == mtVar.g && rf71.o(this.c, mtVar.c) && Arrays.equals(this.h, mtVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.d + 527) * 31) + this.e) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (g11 g11Var : this.h) {
            parcel.writeParcelable(g11Var, 0);
        }
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public mt(String str, int i, int i2, long j, long j2, g11[] g11VarArr) {
        super("CHAP");
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = g11VarArr;
    }
}
