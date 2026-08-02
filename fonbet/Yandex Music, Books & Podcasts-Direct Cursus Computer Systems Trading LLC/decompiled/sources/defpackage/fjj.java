package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class fjj extends aij {
    public final aij a;
    public final AtomicReference b;
    public final xij c;
    public final cjj d;

    public fjj(cjj cjjVar, aij aijVar, AtomicReference atomicReference, xij xijVar) {
        this.d = cjjVar;
        this.a = aijVar;
        this.b = atomicReference;
        this.c = xijVar;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        this.d.a(wjjVar);
    }

    public final void d(ka8 ka8Var) {
        AtomicReference atomicReference;
        bjj bjjVar = (bjj) ka8Var;
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(bjjVar, null)) {
                return;
            }
        } while (atomicReference.get() == bjjVar);
    }
}
