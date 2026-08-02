package defpackage;

/* loaded from: classes5.dex */
public final class pij extends av2 {
    public final qyc e;

    public pij(wjj wjjVar, qyc qycVar) {
        super(wjjVar);
        this.e = qycVar;
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        try {
            Object apply = this.e.apply(obj);
            up6.L(apply, "The mapper function returned a null value.");
            this.a.onNext(apply);
        } catch (Throwable th) {
            leu.a0(th);
            this.b.a();
            onError(th);
        }
    }

    @Override // defpackage.qjq
    public final Object poll() {
        Object poll = this.c.poll();
        if (poll == null) {
            return null;
        }
        Object apply = this.e.apply(poll);
        up6.L(apply, "The mapper function returned a null value.");
        return apply;
    }
}
