package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xji implements yji {
    public final fji a;
    public final w70 b;

    public xji(fji fjiVar, w70 w70Var) {
        w70Var.getClass();
        this.a = fjiVar;
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
        if (!(obj instanceof xji)) {
            return false;
        }
        xji xjiVar = (xji) obj;
        return this.a.equals(xjiVar.a) && Intrinsics.d(this.b, xjiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Wave(contextShort=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
