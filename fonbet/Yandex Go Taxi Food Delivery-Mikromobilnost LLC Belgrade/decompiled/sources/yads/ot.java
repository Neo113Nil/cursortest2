package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ot extends g11 {
    public static final Parcelable.Creator<ot> CREATOR = new nt();
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    public final g11[] g;

    public ot(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.g = new g11[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (g11) parcel.readParcelable(g11.class.getClassLoader());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ot.class == obj.getClass()) {
            ot otVar = (ot) obj;
            if (this.d == otVar.d && this.e == otVar.e && rf71.o(this.c, otVar.c) && Arrays.equals(this.f, otVar.f) && Arrays.equals(this.g, otVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.d ? 1 : 0) + 527) * 31) + (this.e ? 1 : 0)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (g11 g11Var : this.g) {
            parcel.writeParcelable(g11Var, 0);
        }
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public ot(String str, boolean z, boolean z2, String[] strArr, g11[] g11VarArr) {
        super("CTOC");
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = strArr;
        this.g = g11VarArr;
    }
}
