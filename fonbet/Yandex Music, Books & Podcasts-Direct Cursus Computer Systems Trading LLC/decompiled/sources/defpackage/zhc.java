package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zhc {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof zhc) {
            return Intrinsics.d(this.a, ((zhc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
