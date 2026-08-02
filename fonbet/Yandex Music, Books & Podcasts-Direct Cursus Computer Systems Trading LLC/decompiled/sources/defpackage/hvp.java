package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hvp {
    public final tgo a;
    public final tgo b;
    public final tgo c;
    public final tgo d;
    public final tgo e;

    public hvp(tgo tgoVar, tgo tgoVar2, tgo tgoVar3, tgo tgoVar4, tgo tgoVar5) {
        this.a = tgoVar;
        this.b = tgoVar2;
        this.c = tgoVar3;
        this.d = tgoVar4;
        this.e = tgoVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvp)) {
            return false;
        }
        hvp hvpVar = (hvp) obj;
        return Intrinsics.d(this.a, hvpVar.a) && Intrinsics.d(this.b, hvpVar.b) && Intrinsics.d(this.c, hvpVar.c) && Intrinsics.d(this.d, hvpVar.d) && Intrinsics.d(this.e, hvpVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
