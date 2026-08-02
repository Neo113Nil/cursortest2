package defpackage;

import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sfs implements f {
    public final ThreadLocal a;

    public sfs(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfs) && Intrinsics.d(this.a, ((sfs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
