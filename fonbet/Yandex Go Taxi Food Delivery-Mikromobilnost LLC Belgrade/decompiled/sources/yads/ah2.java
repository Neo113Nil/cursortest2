package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ah2 extends g11 {
    public static final Parcelable.Creator<ah2> CREATOR = new zg2();
    public final String c;
    public final byte[] d;

    public ah2(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.createByteArray();
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
        if (obj != null && ah2.class == obj.getClass()) {
            ah2 ah2Var = (ah2) obj;
            if (rf71.o(this.c, ah2Var.c) && Arrays.equals(this.d, ah2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        return Arrays.hashCode(this.d) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // yads.g11
    public final String toString() {
        return this.b + ": owner=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public ah2(String str, byte[] bArr) {
        super("PRIV");
        this.c = str;
        this.d = bArr;
    }
}
