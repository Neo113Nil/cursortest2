package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1w implements w1w {
    public final x1w a;

    public u1w(x1w x1wVar) {
        x1wVar.getClass();
        this.a = x1wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1w) && Intrinsics.d(this.a, ((u1w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(artist=" + this.a + ")";
    }
}
