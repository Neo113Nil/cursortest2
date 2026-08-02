package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class bjj extends AtomicReference implements wjj, ka8 {
    public static final yij[] e = new yij[0];
    public static final yij[] f = new yij[0];
    private static final long serialVersionUID = -533785617179540163L;
    public final ajj a;
    public boolean b;
    public final AtomicReference c = new AtomicReference(e);
    public final AtomicBoolean d = new AtomicBoolean();

    public bjj(ajj ajjVar) {
        this.a = ajjVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.c.set(f);
        ra8.b(this);
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.g(this, ka8Var)) {
            e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(yij yijVar) {
        yij[] yijVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            yij[] yijVarArr2 = (yij[]) atomicReference.get();
            int length = yijVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (yijVarArr2[i].equals(yijVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                yijVarArr = e;
            } else {
                yij[] yijVarArr3 = new yij[length - 1];
                System.arraycopy(yijVarArr2, 0, yijVarArr3, 0, i);
                System.arraycopy(yijVarArr2, i + 1, yijVarArr3, i, (length - i) - 1);
                yijVarArr = yijVarArr3;
            }
            while (!atomicReference.compareAndSet(yijVarArr2, yijVarArr)) {
                if (atomicReference.get() != yijVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    public final void e() {
        for (yij yijVar : (yij[]) this.c.get()) {
            this.a.n(yijVar);
        }
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (this.b) {
            return;
        }
        this.b = true;
        ajj ajjVar = this.a;
        ajjVar.g();
        for (yij yijVar : (yij[]) this.c.getAndSet(f)) {
            ajjVar.n(yijVar);
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (this.b) {
            y5g.g0(th);
            return;
        }
        this.b = true;
        ajj ajjVar = this.a;
        ajjVar.q(th);
        for (yij yijVar : (yij[]) this.c.getAndSet(f)) {
            ajjVar.n(yijVar);
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (this.b) {
            return;
        }
        this.a.r(obj);
        e();
    }
}
