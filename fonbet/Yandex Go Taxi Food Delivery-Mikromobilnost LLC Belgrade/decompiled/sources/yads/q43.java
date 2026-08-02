package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.dl81;
import defpackage.qd81;

/* loaded from: classes7.dex */
public final class q43 extends m03 {
    public static final Parcelable.Creator<q43> CREATOR = new p43();
    public final long b;
    public final long c;

    public q43(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static long a(dl81 dl81Var, long j) {
        long s = dl81Var.s();
        if ((128 & s) != 0) {
            return 8589934591L & ((((s & 1) << 32) | dl81Var.t()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    @Override // yads.m03, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }
}
