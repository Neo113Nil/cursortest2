package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vji implements yji {
    public final dji a;
    public final w70 b;

    public vji(dji djiVar, w70 w70Var) {
        w70Var.getClass();
        this.a = djiVar;
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
        if (!(obj instanceof vji)) {
            return false;
        }
        vji vjiVar = (vji) obj;
        return this.a.equals(vjiVar.a) && Intrinsics.d(this.b, vjiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(contextShort=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
