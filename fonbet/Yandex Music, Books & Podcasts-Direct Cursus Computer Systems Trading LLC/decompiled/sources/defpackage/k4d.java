package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k4d implements mwk {
    public final e5d a;
    public final v80 b;
    public final jyr c;

    public k4d(e5d e5dVar, v80 v80Var) {
        e5dVar.getClass();
        this.a = e5dVar;
        this.b = v80Var;
        this.c = btf.b(wg.v);
    }

    @Override // defpackage.mwk
    public final mqs a() {
        return null;
    }

    @Override // defpackage.mwk
    public final String b() {
        return ((rwk) this.c.getValue()).a;
    }

    @Override // defpackage.mwk
    public final v80 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d)) {
            return false;
        }
        k4d k4dVar = (k4d) obj;
        return Intrinsics.d(this.a, k4dVar.a) && this.b.equals(k4dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GenerativePlayable(playableId=" + rwk.b(b()) + ", generativeStream=" + this.a + ")";
    }
}
