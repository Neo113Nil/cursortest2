package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class cjj implements hjj {
    public final AtomicReference a;
    public final xij b;

    public cjj(AtomicReference atomicReference, xij xijVar) {
        this.a = atomicReference;
        this.b = xijVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjj
    public final void a(wjj wjjVar) {
        bjj bjjVar;
        loop0: while (true) {
            bjjVar = (bjj) this.a.get();
            if (bjjVar != null) {
                break;
            }
            bjj bjjVar2 = new bjj(this.b.call());
            AtomicReference atomicReference = this.a;
            while (!atomicReference.compareAndSet(null, bjjVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            bjjVar = bjjVar2;
            break loop0;
        }
        yij yijVar = new yij(bjjVar, wjjVar);
        wjjVar.b(yijVar);
        AtomicReference atomicReference2 = bjjVar.c;
        loop2: while (true) {
            yij[] yijVarArr = (yij[]) atomicReference2.get();
            if (yijVarArr != bjj.f) {
                int length = yijVarArr.length;
                yij[] yijVarArr2 = new yij[length + 1];
                System.arraycopy(yijVarArr, 0, yijVarArr2, 0, length);
                yijVarArr2[length] = yijVar;
                while (!atomicReference2.compareAndSet(yijVarArr, yijVarArr2)) {
                    if (atomicReference2.get() != yijVarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (yijVar.d) {
            bjjVar.d(yijVar);
        } else {
            bjjVar.a.n(yijVar);
        }
    }
}
