package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class w6e implements gq60 {
    public static final w6e b = new w6e(null);
    public final hiv a;

    public w6e(Object obj) {
        this.a = ni91.f(obj);
    }

    @Override // defpackage.gq60
    public final void a(dq60 dq60Var) {
    }

    @Override // defpackage.gq60
    public final void b(Executor executor, dq60 dq60Var) {
        this.a.c(new l7a(22, this, dq60Var), executor);
    }

    @Override // defpackage.gq60
    public final euy c() {
        return this.a;
    }
}
