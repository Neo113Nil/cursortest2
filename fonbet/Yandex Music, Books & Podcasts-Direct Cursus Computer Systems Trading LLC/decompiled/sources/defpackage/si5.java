package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class si5 implements erc {
    public final /* synthetic */ int a;

    public /* synthetic */ si5(int i) {
        this.a = i;
    }

    @Override // defpackage.erc
    public final void a() {
        ReentrantLock reentrantLock;
        switch (this.a) {
            case 0:
                if (ti5.c) {
                    return;
                }
                ti5.c = true;
                ym4 ym4Var = new ym4(18);
                if (lbr.a.get() == gcr.c) {
                    ym4Var.invoke();
                    return;
                }
                reentrantLock = lbr.e;
                reentrantLock.lock();
                try {
                    lbr.f.add(ym4Var);
                    reentrantLock.unlock();
                    lbr.b();
                    return;
                } finally {
                }
            default:
                if (f7r.b) {
                    return;
                }
                f7r.b = true;
                nrq nrqVar = new nrq(16);
                if (lbr.a.get() == gcr.c) {
                    nrqVar.invoke();
                    return;
                }
                reentrantLock = lbr.e;
                reentrantLock.lock();
                try {
                    lbr.f.add(nrqVar);
                    reentrantLock.unlock();
                    lbr.b();
                    return;
                } finally {
                }
        }
    }

    @Override // defpackage.erc
    public final void b() {
        int i = this.a;
    }

    private final void c() {
    }

    private final void d() {
    }
}
