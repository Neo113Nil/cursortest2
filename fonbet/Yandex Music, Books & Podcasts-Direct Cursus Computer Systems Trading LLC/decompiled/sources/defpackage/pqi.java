package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class pqi implements yt3, hku {
    public final zt3 a;
    public final /* synthetic */ qqi b;

    public pqi(qqi qqiVar, zt3 zt3Var) {
        this.b = qqiVar;
        this.a = zt3Var;
    }

    @Override // defpackage.hku
    public final void a(yap yapVar, int i) {
        this.a.a(yapVar, i);
    }

    @Override // defpackage.yt3
    public final js3 d(Object obj, pyc pycVar) {
        qqi qqiVar = this.b;
        tt5 tt5Var = new tt5(qqiVar, this);
        js3 G = this.a.G((Unit) obj, tt5Var);
        if (G != null) {
            qqi.h.set(qqiVar, null);
        }
        return G;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.a.e;
    }

    @Override // defpackage.yt3
    public final boolean h(Throwable th) {
        return this.a.h(th);
    }

    @Override // defpackage.yt3
    public final void j(Object obj, pyc pycVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qqi.h;
        qqi qqiVar = this.b;
        atomicReferenceFieldUpdater.set(qqiVar, null);
        s8i s8iVar = new s8i(qqiVar, this);
        zt3 zt3Var = this.a;
        zt3Var.D((Unit) obj, zt3Var.c, new u2(18, s8iVar));
    }

    @Override // defpackage.yt3
    public final void r(Object obj) {
        this.a.r(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
