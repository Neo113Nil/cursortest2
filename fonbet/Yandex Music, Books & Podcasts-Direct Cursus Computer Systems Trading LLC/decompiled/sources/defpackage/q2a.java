package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q2a {
    public final kb6 a;
    public final sro b;
    public final f0q c;
    public final l2a d;
    public final bsj e;
    public final p2a f;

    public q2a(kb6 kb6Var, sro sroVar, f0q f0qVar, l2a l2aVar, bsj bsjVar, p2a p2aVar) {
        this.a = kb6Var;
        this.b = sroVar;
        this.c = f0qVar;
        this.d = l2aVar;
        this.e = bsjVar;
        this.f = p2aVar;
    }

    public static q2a a(q2a q2aVar, kb6 kb6Var, f0q f0qVar, l2a l2aVar, int i) {
        if ((i & 1) != 0) {
            kb6Var = q2aVar.a;
        }
        kb6 kb6Var2 = kb6Var;
        sro sroVar = (i & 2) != 0 ? q2aVar.b : null;
        if ((i & 4) != 0) {
            f0qVar = q2aVar.c;
        }
        f0q f0qVar2 = f0qVar;
        if ((i & 8) != 0) {
            l2aVar = q2aVar.d;
        }
        l2a l2aVar2 = l2aVar;
        bsj bsjVar = (i & 16) != 0 ? q2aVar.e : null;
        p2a p2aVar = q2aVar.f;
        q2aVar.getClass();
        return new q2a(kb6Var2, sroVar, f0qVar2, l2aVar2, bsjVar, p2aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q2a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        q2a q2aVar = (q2a) obj;
        return Intrinsics.d(this.a, q2aVar.a) && Intrinsics.d(this.b, q2aVar.b) && Intrinsics.d(this.c, q2aVar.c) && Intrinsics.d(this.d, q2aVar.d) && Intrinsics.d(this.e, q2aVar.e) && Intrinsics.d(this.f, q2aVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sro sroVar = this.b;
        int b = f1d.b(this.c.a, (hashCode + (sroVar != null ? sroVar.hashCode() : 0)) * 31, 31);
        l2a l2aVar = this.d;
        int hashCode2 = (b + (l2aVar != null ? l2aVar.hashCode() : 0)) * 31;
        bsj bsjVar = this.e;
        int hashCode3 = (hashCode2 + (bsjVar != null ? bsjVar.a.hashCode() : 0)) * 31;
        p2a p2aVar = this.f;
        return hashCode3 + (p2aVar != null ? p2aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Document(content=" + this.a + ", scaffold=" + this.b + ", shared=" + this.c + ", actions=" + this.d + ", context=" + this.e + ", transitionSettings=" + this.f + ")";
    }
}
