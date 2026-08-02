package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zgj implements t9f {
    public final t9f a;
    public final nhp b;

    public zgj(t9f t9fVar) {
        t9fVar.getClass();
        this.a = t9fVar;
        this.b = new nhp(t9fVar.getDescriptor());
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return eg7Var.C() ? eg7Var.e(this.a) : eg7Var.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zgj.class == obj.getClass() && Intrinsics.d(this.a, ((zgj) obj).a);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        if (obj != null) {
            l6bVar.v(this.a, obj);
        } else {
            l6bVar.u();
        }
    }
}
