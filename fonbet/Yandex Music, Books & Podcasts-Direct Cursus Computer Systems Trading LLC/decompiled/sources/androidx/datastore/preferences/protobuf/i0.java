package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s;
import defpackage.a1c;
import defpackage.eta;
import defpackage.wzh;

/* loaded from: classes.dex */
final class i0<T> implements r0<T> {
    public final wzh a;
    public final x0 b;
    public final m c;

    public i0(x0 x0Var, m mVar, wzh wzhVar) {
        this.b = x0Var;
        mVar.getClass();
        this.c = mVar;
        this.a = wzhVar;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void a(Object obj) {
        ((z0) this.b).getClass();
        ((s) obj).unknownFields.e = false;
        ((n) this.c).getClass();
        eta.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Object obj) {
        ((n) this.c).getClass();
        eta.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final Object c() {
        return ((s.a) ((s) this.a).d(s.c.e)).c();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void d(Object obj, q0 q0Var, a1c a1cVar) {
        ((z0) this.b).getClass();
        s sVar = (s) obj;
        if (sVar.unknownFields == y0.f) {
            sVar.unknownFields = y0.b();
        }
        ((n) this.c).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final int e(a aVar) {
        ((z0) this.b).getClass();
        y0 y0Var = ((s) aVar).unknownFields;
        int i = y0Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < y0Var.a; i3++) {
            int i4 = y0Var.b[i3] >>> 3;
            i2 += j.b(3, (g) y0Var.c[i3]) + j.j(i4) + j.i(2) + (j.i(1) * 2);
        }
        y0Var.d = i2;
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void f(s sVar, s sVar2) {
        s0.w(this.b, sVar, sVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final int g(s sVar) {
        ((z0) this.b).getClass();
        return sVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void h(Object obj, d1 d1Var) {
        ((n) this.c).getClass();
        eta.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean i(s sVar, s sVar2) {
        z0 z0Var = (z0) this.b;
        z0Var.getClass();
        y0 y0Var = sVar.unknownFields;
        z0Var.getClass();
        return y0Var.equals(sVar2.unknownFields);
    }
}
