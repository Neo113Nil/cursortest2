package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tji implements yji {
    public final bji a;
    public final w70 b;

    public tji(bji bjiVar, w70 w70Var) {
        w70Var.getClass();
        this.a = bjiVar;
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
        if (!(obj instanceof tji)) {
            return false;
        }
        tji tjiVar = (tji) obj;
        return this.a.equals(tjiVar.a) && Intrinsics.d(this.b, tjiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Artist(contextShort=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
