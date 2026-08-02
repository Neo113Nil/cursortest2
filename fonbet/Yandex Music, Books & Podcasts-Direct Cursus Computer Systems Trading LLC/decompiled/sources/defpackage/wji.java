package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wji implements yji {
    public final eji a;
    public final w70 b;

    public wji(eji ejiVar, w70 w70Var) {
        w70Var.getClass();
        this.a = ejiVar;
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
        if (!(obj instanceof wji)) {
            return false;
        }
        wji wjiVar = (wji) obj;
        return this.a.equals(wjiVar.a) && Intrinsics.d(this.b, wjiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueryToVibe(contextShort=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
