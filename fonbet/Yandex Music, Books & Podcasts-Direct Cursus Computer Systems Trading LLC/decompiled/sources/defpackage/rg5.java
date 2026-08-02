package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rg5 implements tg5 {
    public final Set a;
    public final LinkedHashSet b;

    public rg5(Set set, LinkedHashSet linkedHashSet) {
        set.getClass();
        this.a = set;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg5)) {
            return false;
        }
        rg5 rg5Var = (rg5) obj;
        return Intrinsics.d(this.a, rg5Var.a) && this.b.equals(rg5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Active(openedTriggers=" + this.a + ", delayedTriggers=" + this.b + ")";
    }
}
