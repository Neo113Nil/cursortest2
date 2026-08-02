package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0k implements zci, cdi {
    public final x6k a = szf.g0(new wfc());
    public final q0k b;

    public p0k(q0k q0kVar) {
        this.b = q0kVar;
    }

    @Override // defpackage.zci
    public final void d(ddi ddiVar) {
        this.a.setValue(new um(new r0k(this.b), (opv) ddiVar.d(sqv.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0k) {
            return Intrinsics.d(((p0k) obj).b, this.b);
        }
        return false;
    }

    @Override // defpackage.cdi
    public final opv g() {
        return (opv) this.a.getValue();
    }

    @Override // defpackage.cdi
    public final pzm getKey() {
        return sqv.a;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
