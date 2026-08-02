package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class uij extends AtomicBoolean implements wjj, ka8 {
    private static final long serialVersionUID = -7419642935409022375L;
    public final wjj a;
    public final vij b;
    public final tij c;
    public ka8 d;

    public uij(wjj wjjVar, vij vijVar, tij tijVar) {
        this.a = wjjVar;
        this.b = vijVar;
        this.c = tijVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.d.a();
        if (compareAndSet(false, true)) {
            vij vijVar = this.b;
            tij tijVar = this.c;
            synchronized (vijVar) {
                try {
                    tij tijVar2 = vijVar.e;
                    if (tijVar2 != null && tijVar2 == tijVar) {
                        long j = tijVar.c - 1;
                        tijVar.c = j;
                        if (j == 0 && tijVar.d) {
                            if (vijVar.b == 0) {
                                vijVar.e(tijVar);
                                return;
                            }
                            khp khpVar = new khp();
                            tijVar.b = khpVar;
                            ra8.e(khpVar, vijVar.d.c(tijVar, vijVar.b, vijVar.c));
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.h(this.d, ka8Var)) {
            this.d = ka8Var;
            this.a.b(this);
        }
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.b.d(this.c);
            this.a.onComplete();
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (!compareAndSet(false, true)) {
            y5g.g0(th);
        } else {
            this.b.d(this.c);
            this.a.onError(th);
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        this.a.onNext(obj);
    }
}
