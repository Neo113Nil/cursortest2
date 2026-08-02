package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a extends a0 {
    public final /* synthetic */ z d;

    public a(z zVar) {
        this.d = zVar;
    }

    @Override // j$.time.format.a0
    public final String c(j$.time.chrono.m mVar, j$.time.temporal.o oVar, long j, f0 f0Var, Locale locale) {
        return this.d.a(j, f0Var);
    }

    @Override // j$.time.format.a0
    public final String d(j$.time.temporal.o oVar, long j, f0 f0Var, Locale locale) {
        return this.d.a(j, f0Var);
    }

    @Override // j$.time.format.a0
    public final Iterator e(j$.time.chrono.m mVar, j$.time.temporal.o oVar, f0 f0Var, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(f0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.a0
    public final Iterator f(j$.time.temporal.o oVar, f0 f0Var, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(f0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
