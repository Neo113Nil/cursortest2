package defpackage;

import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class vmw0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final r0 b = bvf0.c(Boolean.FALSE);

    public final void a(Object obj) {
        this.a.add(obj);
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void b(Object obj) {
        this.a.remove(obj);
        qv10.B(!r0.isEmpty(), this.b, null);
    }
}
