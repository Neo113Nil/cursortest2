package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pbf {
    public static final pbf b = new pbf(63, null);
    public final Function1 a;

    public pbf(int i, Function1 function1) {
        this.a = (i & 1) != 0 ? null : function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pbf) {
            return this.a == ((pbf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        return (function1 != null ? function1.hashCode() : 0) * 28629151;
    }
}
