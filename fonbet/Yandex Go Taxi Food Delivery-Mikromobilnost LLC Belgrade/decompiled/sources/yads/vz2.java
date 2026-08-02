package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;

/* loaded from: classes7.dex */
public final class vz2 implements bs1 {
    public static final Parcelable.Creator<vz2> CREATOR = new uz2();
    public final float b;
    public final int c;

    public vz2(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vz2.class == obj.getClass()) {
            vz2 vz2Var = (vz2) obj;
            if (this.b == vz2Var.b && this.c == vz2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.b).hashCode() + 527) * 31) + this.c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.b + ", svcTemporalLayerCount=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public vz2(int i, float f) {
        this.b = f;
        this.c = i;
    }
}
