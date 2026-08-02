package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class w87 {
    public final n4t a;
    public final p4t b;
    public final Function0 c;

    public w87(n4t n4tVar, p4t p4tVar) {
        cp5 cp5Var = new cp5(26);
        this.a = n4tVar;
        this.b = p4tVar;
        this.c = cp5Var;
    }

    public final void a(e2j e2jVar) {
        long a = this.b.a(e2jVar);
        long longValue = ((Number) this.c.invoke()).longValue();
        n4t n4tVar = this.a;
        if (a == -1) {
            ssg.a(3, null, "Error while collecting traffic data for type " + e2jVar + ". Reset preferences to not corrupt future data", null);
            n4tVar.a(0L, 0L, e2jVar);
            return;
        }
        ssg.a(3, null, "Set baseline for type " + e2jVar + " as " + a + " at " + longValue, null);
        n4tVar.a(a, longValue, e2jVar);
    }
}
