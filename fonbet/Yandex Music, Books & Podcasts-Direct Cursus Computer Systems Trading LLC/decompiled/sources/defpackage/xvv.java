package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xvv implements zvv {
    public final g0w a;

    public xvv(g0w g0wVar) {
        g0wVar.getClass();
        this.a = g0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvv) && Intrinsics.d(this.a, ((xvv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(progress=" + this.a + ")";
    }
}
