package defpackage;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mwj {
    public static final mwj b = new mwj();
    public final Pair a;

    public mwj() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwj)) {
            return false;
        }
        return Intrinsics.d(this.a, ((mwj) obj).a);
    }

    public final int hashCode() {
        Pair pair = this.a;
        if (pair != null) {
            return pair.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Pair pair = this.a;
        return pair != null ? String.format("Optional[%s]", Arrays.copyOf(new Object[]{pair}, 1)) : "Optional.empty";
    }

    public mwj(Pair pair) {
        this.a = pair;
    }
}
