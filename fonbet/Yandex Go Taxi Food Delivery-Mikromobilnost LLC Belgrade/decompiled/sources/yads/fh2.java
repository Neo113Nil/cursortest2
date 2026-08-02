package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;

/* loaded from: classes7.dex */
public final class fh2 extends m03 {
    public static final Parcelable.Creator<fh2> CREATOR = new eh2();
    public final long b;
    public final long c;
    public final byte[] d;

    public fh2(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = rf71.a;
        this.d = createByteArray;
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByteArray(this.d);
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public fh2(long j, byte[] bArr, long j2) {
        this.b = j2;
        this.c = j;
        this.d = bArr;
    }
}
