package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class f9g implements mhp {
    public final mhp a;

    public f9g(mhp mhpVar) {
        this.a = mhpVar;
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return emr.c;
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        xq0.x(ouj.n(str, " is not a valid list index"));
        return 0;
    }

    @Override // defpackage.mhp
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9g)) {
            return false;
        }
        f9g f9gVar = (f9g) obj;
        return Intrinsics.d(this.a, f9gVar.a) && Intrinsics.d(i(), f9gVar.i());
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        if (i >= 0) {
            return c5b.a;
        }
        StringBuilder q = k5r.q(i, "Illegal index ", ", ");
        q.append(i());
        q.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q.toString().toString());
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return c5b.a;
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder q = k5r.q(i, "Illegal index ", ", ");
        q.append(i());
        q.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q.toString().toString());
    }

    public final int hashCode() {
        return i().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.mhp
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder q = k5r.q(i, "Illegal index ", ", ");
        q.append(i());
        q.append(" expects only non-negative indices");
        throw new IllegalArgumentException(q.toString().toString());
    }

    public final String toString() {
        return i() + '(' + this.a + ')';
    }
}
