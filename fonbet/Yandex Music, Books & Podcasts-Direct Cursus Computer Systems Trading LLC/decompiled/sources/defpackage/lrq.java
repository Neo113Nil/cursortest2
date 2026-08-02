package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lrq {
    public final hq5 a;

    public /* synthetic */ lrq(hq5 hq5Var) {
        this.a = hq5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lrq) {
            return Intrinsics.d(this.a, ((lrq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
