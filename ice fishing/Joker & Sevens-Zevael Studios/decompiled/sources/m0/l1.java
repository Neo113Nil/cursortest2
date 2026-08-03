package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l1 extends w0.w implements Parcelable, w0.n {
    public static final Parcelable.Creator<l1> CREATOR = new k1();

    /* renamed from: h, reason: collision with root package name */
    public final r2 f4647h;

    /* renamed from: i, reason: collision with root package name */
    public q2 f4648i;

    public l1(Object obj, r2 r2Var) {
        this.f4647h = r2Var;
        w0.g k3 = w0.m.k();
        q2 q2Var = new q2(k3.g(), obj);
        if (!(k3 instanceof w0.b)) {
            q2Var.f7621b = new q2(1, obj);
        }
        this.f4648i = q2Var;
    }

    @Override // w0.v
    public final w0.x a() {
        return this.f4648i;
    }

    @Override // w0.v
    public final w0.x b(w0.x xVar, w0.x xVar2, w0.x xVar3) {
        if (this.f4647h.a(((q2) xVar2).f4720c, ((q2) xVar3).f4720c)) {
            return xVar2;
        }
        return null;
    }

    @Override // w0.v
    public final void c(w0.x xVar) {
        pc.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f4648i = (q2) xVar;
    }

    @Override // w0.n
    public final r2 d() {
        return this.f4647h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // m0.w2
    public final Object getValue() {
        return ((q2) w0.m.t(this.f4648i, this)).f4720c;
    }

    @Override // m0.d1
    public final void setValue(Object obj) {
        w0.g k3;
        q2 q2Var = (q2) w0.m.i(this.f4648i);
        if (this.f4647h.a(q2Var.f4720c, obj)) {
            return;
        }
        q2 q2Var2 = this.f4648i;
        synchronized (w0.m.f7580c) {
            k3 = w0.m.k();
            ((q2) w0.m.o(q2Var2, this, k3, q2Var)).f4720c = obj;
        }
        w0.m.n(k3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((q2) w0.m.i(this.f4648i)).f4720c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        z0 z0Var = z0.f4841i;
        r2 r2Var = this.f4647h;
        if (pc.j.a(r2Var, z0Var)) {
            i11 = 0;
        } else if (pc.j.a(r2Var, z0.f4844l)) {
            i11 = 1;
        } else {
            if (!pc.j.a(r2Var, z0.f4842j)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
