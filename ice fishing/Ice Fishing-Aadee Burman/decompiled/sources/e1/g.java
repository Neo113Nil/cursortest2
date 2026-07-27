package e1;

import X0.v;
import X0.w;
import f1.AbstractC4498a;
import j1.AbstractC4599c;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37136b;

    public g(int i, String str, boolean z3) {
        this.f37135a = i;
        this.f37136b = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        if (vVar.f3670E.f38919a.contains(w.f3708n)) {
            return new Z0.l(this);
        }
        AbstractC4599c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f37135a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
