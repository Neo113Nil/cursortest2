package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rrh {
    public final long a;

    public /* synthetic */ rrh(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrh) && this.a == ((rrh) obj).a && ldg.s(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, Boolean.FALSE, null});
    }
}
