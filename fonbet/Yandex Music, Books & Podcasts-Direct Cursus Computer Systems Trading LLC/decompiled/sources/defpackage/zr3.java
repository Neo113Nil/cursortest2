package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class zr3 {
    public final Function2 a;
    public final fq4 b;

    public zr3(Function2 function2, fq4 fq4Var) {
        this.a = function2;
        this.b = fq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return this.a.equals(zr3Var.a) && this.b.equals(zr3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CalculatedSegment(drawFn=" + this.a + ", range=" + this.b + ")";
    }
}
