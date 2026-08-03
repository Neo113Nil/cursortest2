package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i1 extends w0.w implements Parcelable, w0.n, d1, w2 {
    public static final Parcelable.Creator<i1> CREATOR = new g1(1);

    /* renamed from: h, reason: collision with root package name */
    public o2 f4613h;

    public i1(int i10) {
        w0.g k3 = w0.m.k();
        o2 o2Var = new o2(i10, k3.g());
        if (!(k3 instanceof w0.b)) {
            o2Var.f7621b = new o2(i10, 1);
        }
        this.f4613h = o2Var;
    }

    @Override // w0.v
    public final w0.x a() {
        return this.f4613h;
    }

    @Override // w0.v
    public final w0.x b(w0.x xVar, w0.x xVar2, w0.x xVar3) {
        if (((o2) xVar2).f4696c == ((o2) xVar3).f4696c) {
            return xVar2;
        }
        return null;
    }

    @Override // w0.v
    public final void c(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4613h = (o2) xVar;
    }

    @Override // w0.n
    public final r2 d() {
        return z0.f4844l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((o2) w0.m.t(this.f4613h, this)).f4696c;
    }

    @Override // m0.w2
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i10) {
        w0.g k3;
        o2 o2Var = (o2) w0.m.i(this.f4613h);
        if (o2Var.f4696c != i10) {
            o2 o2Var2 = this.f4613h;
            synchronized (w0.m.f7580c) {
                k3 = w0.m.k();
                ((o2) w0.m.o(o2Var2, this, k3, o2Var)).f4696c = i10;
            }
            w0.m.n(k3, this);
        }
    }

    @Override // m0.d1
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((o2) w0.m.i(this.f4613h)).f4696c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(g());
    }
}
