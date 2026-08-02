package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class qyf implements uyf, mm6 {
    public final nyf a;
    public final CoroutineContext b;

    public qyf(nyf nyfVar, CoroutineContext coroutineContext) {
        nyfVar.getClass();
        coroutineContext.getClass();
        this.a = nyfVar;
        this.b = coroutineContext;
        if (nyfVar.b() == lyf.a) {
            saf.B(coroutineContext, null);
        }
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        nyf nyfVar = this.a;
        if (nyfVar.b().compareTo(lyf.a) <= 0) {
            nyfVar.d(this);
            saf.B(this.b, null);
        }
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
