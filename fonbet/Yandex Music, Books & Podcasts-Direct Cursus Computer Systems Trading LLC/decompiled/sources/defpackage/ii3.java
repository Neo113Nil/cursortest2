package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ii3 implements ki3 {
    public final List a;
    public final int b;

    public ii3(List list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
        if (list.isEmpty()) {
            su4.s(2, null, "BufferEntry.Batch commands must be not empty", null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii3)) {
            return false;
        }
        ii3 ii3Var = (ii3) obj;
        return Intrinsics.d(this.a, ii3Var.a) && this.b == ii3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Batch(commands=" + this.a + ", batchId=" + this.b + ")";
    }
}
