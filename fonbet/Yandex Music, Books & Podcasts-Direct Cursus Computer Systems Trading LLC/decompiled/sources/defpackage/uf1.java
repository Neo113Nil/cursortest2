package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uf1 implements wf1 {
    public final boolean a;
    public final ikm b;
    public final e73 c;
    public final p43 d;

    public uf1(boolean z, ikm ikmVar, e73 e73Var, p43 p43Var) {
        e73Var.getClass();
        this.a = z;
        this.b = ikmVar;
        this.c = e73Var;
        this.d = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf1)) {
            return false;
        }
        uf1 uf1Var = (uf1) obj;
        return this.a == uf1Var.a && this.b.equals(uf1Var.b) && Intrinsics.d(this.c, uf1Var.c) && Intrinsics.d(this.d, uf1Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        p43 p43Var = this.d;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "Loaded(presaved=" + this.a + ", release=" + this.b + ", result=" + this.c + ", analyticsData=" + this.d + ")";
    }
}
