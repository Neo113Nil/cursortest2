package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uyb {
    public final long a;
    public final Integer b;

    public uyb(long j, Integer num) {
        this.a = j;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyb)) {
            return false;
        }
        uyb uybVar = (uyb) obj;
        return this.a == uybVar.a && Intrinsics.d(this.b, uybVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return this.a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.b;
    }
}
