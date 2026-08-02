package defpackage;

import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class im6 extends a {
    public static final ehv d = new ehv(18);
    public final String c;

    public im6(String str) {
        super(d);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im6) && Intrinsics.d(this.c, ((im6) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("CoroutineName("), this.c, ')');
    }
}
