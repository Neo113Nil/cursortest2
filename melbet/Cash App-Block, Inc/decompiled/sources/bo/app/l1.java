package bo.app;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l1 implements l9 {
    public final LinkedHashSet a;
    public final boolean b;

    public l1(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        this.a = linkedHashSet;
        this.b = linkedHashSet.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.areEqual(this.a, ((l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        return this.b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.a + ")";
    }
}
