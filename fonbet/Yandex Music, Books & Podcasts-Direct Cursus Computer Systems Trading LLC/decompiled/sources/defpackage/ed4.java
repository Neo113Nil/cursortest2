package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ed4 extends fd4 {
    public final Throwable a;

    public ed4(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ed4) {
            return Intrinsics.d(this.a, ((ed4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fd4
    public final String toString() {
        return f1d.k(new StringBuilder("Closed("), this.a, ')');
    }
}
