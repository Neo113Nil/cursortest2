package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uo8 extends wo8 {
    public final hag a;
    public final hag b;
    public final la5 c;
    public final pcg d;

    public uo8(hag hagVar, hag hagVar2, la5 la5Var, pcg pcgVar) {
        this.a = hagVar;
        this.b = hagVar2;
        this.c = la5Var;
        this.d = pcgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo8)) {
            return false;
        }
        uo8 uo8Var = (uo8) obj;
        return this.a.equals(uo8Var.a) && this.b.equals(uo8Var.b) && Intrinsics.d(this.c, uo8Var.c) && this.d.equals(uo8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RadialGradient(centerX=" + this.a + ", centerY=" + this.b + ", colormap=" + this.c + ", radius=" + this.d + ')';
    }
}
