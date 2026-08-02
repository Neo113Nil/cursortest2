package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class whl implements xhl {
    public final n7q a;

    public whl(n7q n7qVar) {
        n7qVar.getClass();
        this.a = n7qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whl) && Intrinsics.d(this.a, ((whl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(sharedQueueState=" + this.a + ")";
    }
}
