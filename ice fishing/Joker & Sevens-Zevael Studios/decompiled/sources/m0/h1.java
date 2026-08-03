package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h1 extends w0.w implements Parcelable, w0.n, d1, w2 {
    public static final Parcelable.Creator<h1> CREATOR = new g1(0);

    /* renamed from: h, reason: collision with root package name */
    public n2 f4604h;

    public h1(float f10) {
        w0.g k3 = w0.m.k();
        n2 n2Var = new n2(k3.g(), f10);
        if (!(k3 instanceof w0.b)) {
            n2Var.f7621b = new n2(1, f10);
        }
        this.f4604h = n2Var;
    }

    @Override // w0.v
    public final w0.x a() {
        return this.f4604h;
    }

    @Override // w0.v
    public final w0.x b(w0.x xVar, w0.x xVar2, w0.x xVar3) {
        if (((n2) xVar2).f4687c == ((n2) xVar3).f4687c) {
            return xVar2;
        }
        return null;
    }

    @Override // w0.v
    public final void c(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4604h = (n2) xVar;
    }

    @Override // w0.n
    public final r2 d() {
        return z0.f4844l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(float f10) {
        w0.g k3;
        n2 n2Var = (n2) w0.m.i(this.f4604h);
        if (n2Var.f4687c == f10) {
            return;
        }
        n2 n2Var2 = this.f4604h;
        synchronized (w0.m.f7580c) {
            k3 = w0.m.k();
            ((n2) w0.m.o(n2Var2, this, k3, n2Var)).f4687c = f10;
        }
        w0.m.n(k3, this);
    }

    @Override // m0.w2
    public Object getValue() {
        return Float.valueOf(((n2) w0.m.t(this.f4604h, this)).f4687c);
    }

    @Override // m0.d1
    public void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((n2) w0.m.i(this.f4604h)).f4687c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(((n2) w0.m.t(this.f4604h, this)).f4687c);
    }
}
