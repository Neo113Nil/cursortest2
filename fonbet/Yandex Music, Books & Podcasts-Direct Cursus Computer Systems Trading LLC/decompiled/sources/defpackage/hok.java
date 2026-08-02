package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hok {
    public static final hok b = new hok(xz0.Y(new n43[]{j43.a, g43.a, h43.a, i43.a, l43.a, m43.a, f43.a, k43.a}));
    public final Set a;

    public hok(Set set) {
        set.getClass();
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hok) && Intrinsics.d(this.a, ((hok) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + tlm.c(86400000L, Long.hashCode(1800000L) * 31, 31);
    }

    public final String toString() {
        return "PhonotekaSyncConfiguration(minPartialUpdatePeriodMills=1800000, minFullUpdatePeriodMills=86400000, supportBlocks=" + this.a + ")";
    }
}
