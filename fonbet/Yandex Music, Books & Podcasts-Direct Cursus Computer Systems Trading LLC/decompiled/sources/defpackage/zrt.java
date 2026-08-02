package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zrt {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof zrt) {
            return Intrinsics.d(this.a, ((zrt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("UserContext(userId=", this.a, ")");
    }
}
