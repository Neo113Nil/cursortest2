package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ts1 extends g11 {
    public static final Parcelable.Creator<ts1> CREATOR = new ss1();
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;

    public ts1(Parcel parcel) {
        super("MLLT");
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = rf71.a;
        this.f = createIntArray;
        this.g = parcel.createIntArray();
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
        if (obj != null && ts1.class == obj.getClass()) {
            ts1 ts1Var = (ts1) obj;
            if (this.c == ts1Var.c && this.d == ts1Var.d && this.e == ts1Var.e && Arrays.equals(this.f, ts1Var.f) && Arrays.equals(this.g, ts1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((((((this.c + 527) * 31) + this.d) * 31) + this.e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public ts1(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iArr;
        this.g = iArr2;
    }
}
