package defpackage;

/* loaded from: classes5.dex */
public final class lij implements wjj, ka8 {
    public final xeh a;
    public ka8 b;
    public long c;
    public boolean d;

    public lij(xeh xehVar) {
        this.a = xehVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.h(this.b, ka8Var)) {
            this.b = ka8Var;
            this.a.b(this);
        }
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (this.d) {
            y5g.g0(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.a();
        this.a.onSuccess(obj);
    }
}
