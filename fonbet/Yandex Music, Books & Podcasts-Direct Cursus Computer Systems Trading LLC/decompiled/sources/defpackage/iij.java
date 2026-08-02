package defpackage;

/* loaded from: classes5.dex */
public final class iij implements wjj, ka8 {
    public final wjj a;
    public final uvg b;
    public ka8 c;
    public boolean d;

    public iij(wjj wjjVar, uvg uvgVar) {
        this.a = wjjVar;
        this.b = uvgVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.h(this.c, ka8Var)) {
            this.c = ka8Var;
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
        try {
            this.b.accept(obj);
            this.a.onNext(obj);
        } catch (Throwable th) {
            leu.a0(th);
            this.c.a();
            onError(th);
        }
    }
}
