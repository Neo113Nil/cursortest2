package defpackage;

import java.util.Iterator;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class tne implements p8w {
    public final n0 a = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        e3n e3nVar;
        zci0 zci0Var = (zci0) m8wVar;
        kvj0 b = zci0Var.b(zci0Var.e);
        Iterator it = b.y.g("X-Yandex-Plus-Invalidate-Stored-Values").iterator();
        do {
            e3nVar = null;
            if (!it.hasNext()) {
                break;
            }
            Long m = bvu0.m(10, (String) it.next());
            if (m != null) {
                o430 o430Var = e3n.b;
                e3nVar = new e3n(kp50.V(m.longValue(), DurationUnit.SECONDS));
            }
        } while (e3nVar == null);
        if (e3nVar != null) {
            this.a.g(new e3n(e3nVar.a));
        }
        return b;
    }
}
