package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j1 extends w0.w implements Parcelable, w0.n, d1, w2 {
    public static final Parcelable.Creator<j1> CREATOR = new g1(2);

    /* renamed from: h, reason: collision with root package name */
    public p2 f4630h;

    public j1(long j3) {
        w0.g k3 = w0.m.k();
        p2 p2Var = new p2(k3.g(), j3);
        if (!(k3 instanceof w0.b)) {
            p2Var.f7621b = new p2(1, j3);
        }
        this.f4630h = p2Var;
    }

    @Override // w0.v
    public final w0.x a() {
        return this.f4630h;
    }

    @Override // w0.v
    public final w0.x b(w0.x xVar, w0.x xVar2, w0.x xVar3) {
        if (((p2) xVar2).f4710c == ((p2) xVar3).f4710c) {
            return xVar2;
        }
        return null;
    }

    @Override // w0.v
    public final void c(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f4630h = (p2) xVar;
    }

    @Override // w0.n
    public final r2 d() {
        return z0.f4844l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j3) {
        w0.g k3;
        p2 p2Var = (p2) w0.m.i(this.f4630h);
        if (p2Var.f4710c != j3) {
            p2 p2Var2 = this.f4630h;
            synchronized (w0.m.f7580c) {
                k3 = w0.m.k();
                ((p2) w0.m.o(p2Var2, this, k3, p2Var)).f4710c = j3;
            }
            w0.m.n(k3, this);
        }
    }

    @Override // m0.w2
    public Object getValue() {
        return Long.valueOf(((p2) w0.m.t(this.f4630h, this)).f4710c);
    }

    @Override // m0.d1
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((p2) w0.m.i(this.f4630h)).f4710c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(((p2) w0.m.t(this.f4630h, this)).f4710c);
    }
}
