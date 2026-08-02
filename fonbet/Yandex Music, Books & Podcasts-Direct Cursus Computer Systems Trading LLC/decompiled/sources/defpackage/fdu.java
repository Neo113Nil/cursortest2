package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fdu {
    public d23 a = new d23(null, dw8.b);
    public final ArrayList b = new ArrayList();

    public final void a(rv8 rv8Var, dw8 dw8Var) {
        if (Intrinsics.d(dw8Var, this.a.a) && this.a.b == rv8Var) {
            return;
        }
        this.a = new d23(rv8Var, dw8Var);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.a);
        }
    }
}
