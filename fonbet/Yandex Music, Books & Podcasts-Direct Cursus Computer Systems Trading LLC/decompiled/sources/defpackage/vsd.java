package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class vsd implements mhp {
    public final String a;
    public final mhp b;
    public final mhp c;

    public vsd(String str, mhp mhpVar, mhp mhpVar2) {
        this.a = str;
        this.b = mhpVar;
        this.c = mhpVar2;
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return emr.d;
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
        xq0.x(ouj.n(str, " is not a valid map index"));
        return 0;
    }

    @Override // defpackage.mhp
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsd)) {
            return false;
        }
        vsd vsdVar = (vsd) obj;
        return this.a.equals(vsdVar.a) && Intrinsics.d(this.b, vsdVar.b) && Intrinsics.d(this.c, vsdVar.c);
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
        xq0.o(su4.o(k5r.q(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return c5b.a;
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        if (i < 0) {
            xq0.o(su4.o(k5r.q(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        xq0.q("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.mhp
    public final String i() {
        return this.a;
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
        xq0.o(su4.o(k5r.q(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
