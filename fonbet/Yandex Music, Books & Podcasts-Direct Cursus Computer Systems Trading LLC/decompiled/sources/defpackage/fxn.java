package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fxn implements q5a {
    public final m4a a;
    public final t5a b;
    public final r2a c;
    public final r2a d;

    public fxn(m4a m4aVar, t5a t5aVar, r2a r2aVar, r2a r2aVar2) {
        this.a = m4aVar;
        this.b = t5aVar;
        this.c = r2aVar;
        this.d = r2aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxn)) {
            return false;
        }
        fxn fxnVar = (fxn) obj;
        return Intrinsics.d(this.a, fxnVar.a) && Intrinsics.d(this.b, fxnVar.b) && Intrinsics.d(this.c, fxnVar.c) && Intrinsics.d(this.d, fxnVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t5a t5aVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (t5aVar == null ? 0 : t5aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "RenderedDocumentOrigin(render=" + this.a + ", targetQuery=" + this.b + ", documentLifecycleCallbacksConfig=" + this.c + ", previousDocumentActionsCallbacksConfig=" + this.d + ")";
    }
}
