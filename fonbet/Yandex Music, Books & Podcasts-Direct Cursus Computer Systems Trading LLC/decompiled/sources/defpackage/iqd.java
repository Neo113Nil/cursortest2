package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iqd {
    public final lvf a;

    static {
        int i = lvf.f;
    }

    public iqd(lvf lvfVar) {
        lvfVar.getClass();
        this.a = lvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqd) && Intrinsics.d(this.a, ((iqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PagingRow(lazyItems=" + this.a + ")";
    }
}
