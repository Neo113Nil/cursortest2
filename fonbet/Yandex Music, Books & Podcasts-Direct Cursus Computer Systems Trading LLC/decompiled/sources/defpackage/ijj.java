package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ijj extends AtomicReference implements wjj {
    private static final long serialVersionUID = 3837284832786408377L;
    public final jjj a;
    public final long b;
    public final int c;
    public volatile qjq d;
    public volatile boolean e;

    public ijj(jjj jjjVar, long j, int i) {
        this.a = jjjVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.g(this, ka8Var)) {
            if (ka8Var instanceof x8n) {
                x8n x8nVar = (x8n) ka8Var;
                int c = x8nVar.c();
                if (c == 1) {
                    this.d = x8nVar;
                    this.e = true;
                    this.a.e();
                    return;
                } else if (c == 2) {
                    this.d = x8nVar;
                    return;
                }
            }
            this.d = new d9r(this.c);
        }
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (this.b == this.a.i) {
            this.e = true;
            this.a.e();
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        jjj jjjVar = this.a;
        jjjVar.getClass();
        if (this.b != jjjVar.i || !jjjVar.d.a(th)) {
            y5g.g0(th);
            return;
        }
        jjjVar.g.a();
        jjjVar.e = true;
        this.e = true;
        jjjVar.e();
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (this.b == this.a.i) {
            if (obj != null) {
                this.d.offer(obj);
            }
            this.a.e();
        }
    }
}
