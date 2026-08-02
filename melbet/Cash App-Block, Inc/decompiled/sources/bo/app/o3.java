package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3 {
    public final re a;
    public final re b;

    public o3(re reVar, re reVar2) {
        reVar.getClass();
        reVar2.getClass();
        this.a = reVar;
        this.b = reVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.a, o3Var.a) && Intrinsics.areEqual(this.b, o3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigChangeEvent(oldConfig=" + this.a + ", newConfig=" + this.b + ")";
    }
}
