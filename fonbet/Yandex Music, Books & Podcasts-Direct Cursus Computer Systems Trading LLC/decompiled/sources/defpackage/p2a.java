package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p2a {
    public final o2a a;
    public final o2a b;

    public p2a(o2a o2aVar, o2a o2aVar2) {
        this.a = o2aVar;
        this.b = o2aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p2a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        p2a p2aVar = (p2a) obj;
        return Intrinsics.d(this.a, p2aVar.a) && Intrinsics.d(this.b, p2aVar.b);
    }

    public final int hashCode() {
        o2a o2aVar = this.a;
        int hashCode = (o2aVar != null ? o2aVar.hashCode() : 0) * 31;
        o2a o2aVar2 = this.b;
        return hashCode + (o2aVar2 != null ? o2aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TransitionSettings(onShow=" + this.a + ", onHide=" + this.b + ")";
    }
}
