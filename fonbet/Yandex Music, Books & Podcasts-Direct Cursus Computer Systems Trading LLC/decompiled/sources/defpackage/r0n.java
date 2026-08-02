package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class r0n extends aij implements wjj {
    public static final q0n[] c = new q0n[0];
    public static final q0n[] d = new q0n[0];
    public final AtomicReference a = new AtomicReference(d);
    public Throwable b;

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (this.a.get() == c) {
            ka8Var.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        q0n q0nVar = new q0n(wjjVar, this);
        wjjVar.b(q0nVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            q0n[] q0nVarArr = (q0n[]) atomicReference.get();
            if (q0nVarArr == c) {
                Throwable th = this.b;
                if (th != null) {
                    wjjVar.onError(th);
                    return;
                } else {
                    wjjVar.onComplete();
                    return;
                }
            }
            int length = q0nVarArr.length;
            q0n[] q0nVarArr2 = new q0n[length + 1];
            System.arraycopy(q0nVarArr, 0, q0nVarArr2, 0, length);
            q0nVarArr2[length] = q0nVar;
            while (!atomicReference.compareAndSet(q0nVarArr, q0nVarArr2)) {
                if (atomicReference.get() != q0nVarArr) {
                    break;
                }
            }
            if (q0nVar.get()) {
                d(q0nVar);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(q0n q0nVar) {
        q0n[] q0nVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            q0n[] q0nVarArr2 = (q0n[]) atomicReference.get();
            if (q0nVarArr2 == c || q0nVarArr2 == (q0nVarArr = d)) {
                return;
            }
            int length = q0nVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (q0nVarArr2[i] == q0nVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                q0nVarArr = new q0n[length - 1];
                System.arraycopy(q0nVarArr2, 0, q0nVarArr, 0, i);
                System.arraycopy(q0nVarArr2, i + 1, q0nVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(q0nVarArr2, q0nVarArr)) {
                if (atomicReference.get() != q0nVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        q0n[] q0nVarArr = (q0n[]) atomicReference.getAndSet(obj2);
        for (q0n q0nVar : q0nVarArr) {
            if (!q0nVar.get()) {
                q0nVar.a.onComplete();
            }
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        up6.L(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            y5g.g0(th);
            return;
        }
        this.b = th;
        q0n[] q0nVarArr = (q0n[]) atomicReference.getAndSet(obj2);
        for (q0n q0nVar : q0nVarArr) {
            if (q0nVar.get()) {
                y5g.g0(th);
            } else {
                q0nVar.a.onError(th);
            }
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        up6.L(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (q0n q0nVar : (q0n[]) this.a.get()) {
            if (!q0nVar.get()) {
                q0nVar.a.onNext(obj);
            }
        }
    }
}
