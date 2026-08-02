package defpackage;

import android.content.Context;
import java.util.Map;

/* loaded from: classes12.dex */
public final class r151 implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final jx50 c;
    public final ze d;

    public r151(q151 q151Var, n3w n3wVar, ei00 ei00Var, jx50 jx50Var, ze zeVar) {
        this.a = n3wVar;
        this.b = ei00Var;
        this.c = jx50Var;
        this.d = zeVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Context context = (Context) this.a.get();
        Map map = (Map) this.b.get();
        this.c.get();
        return new wxk(context, map, (vh5) this.d.get());
    }
}
