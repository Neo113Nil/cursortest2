package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class z3w {
    public final j4w a;
    public final htm b;
    public final x4w c;

    static {
        jsg.n("WMFgUpdater");
    }

    public z3w(WorkDatabase workDatabase, htm htmVar, j4w j4wVar) {
        this.b = htmVar;
        this.a = j4wVar;
        this.c = workDatabase.A();
    }
}
