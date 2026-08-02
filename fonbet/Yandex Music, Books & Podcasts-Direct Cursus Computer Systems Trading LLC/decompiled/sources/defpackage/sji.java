package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sji implements yji {
    public final aji a;
    public final w70 b;

    public sji(aji ajiVar, w70 w70Var) {
        w70Var.getClass();
        this.a = ajiVar;
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
        if (!(obj instanceof sji)) {
            return false;
        }
        sji sjiVar = (sji) obj;
        return this.a.equals(sjiVar.a) && Intrinsics.d(this.b, sjiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(contextShort=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
