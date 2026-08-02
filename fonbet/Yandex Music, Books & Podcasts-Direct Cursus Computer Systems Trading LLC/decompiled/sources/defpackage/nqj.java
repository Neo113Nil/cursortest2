package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nqj {
    public final jyr a;
    public mwk b;

    public nqj(jyr jyrVar) {
        this.a = jyrVar;
    }

    public final void a(n7q n7qVar) {
        n7qVar.getClass();
        mwk b = n7qVar.b();
        if (Intrinsics.d(this.b, b)) {
            return;
        }
        this.b = b;
        tfn tfnVar = (tfn) dag.p(b, qee.l);
        if (tfnVar != null) {
            ((yfn) this.a.getValue()).a(tfnVar);
        }
    }
}
