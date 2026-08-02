package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class eyk implements gyk {
    public final List a;

    public eyk(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            su4.s(2, null, "PlaybackCommandsBatch.Basic commands must be not empty", null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyk) && Intrinsics.d(this.a, ((eyk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("Basic(commands=", ")", this.a);
    }
}
