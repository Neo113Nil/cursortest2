package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uji implements yji {
    public final cji a;
    public final w70 b;

    public uji(cji cjiVar, w70 w70Var) {
        w70Var.getClass();
        this.a = cjiVar;
        this.b = w70Var;
    }

    @Override // defpackage.yji
    public final w70 a() {
        return this.b;
    }

    @Override // defpackage.yji
    public final gji d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uji)) {
            return false;
        }
        uji ujiVar = (uji) obj;
        return this.a.equals(ujiVar.a) && Intrinsics.d(this.b, ujiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Multiwave(contextShort=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
