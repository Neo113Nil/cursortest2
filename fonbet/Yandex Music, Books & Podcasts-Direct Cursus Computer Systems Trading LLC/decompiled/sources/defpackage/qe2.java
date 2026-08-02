package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class qe2 implements erc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qe2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.erc
    public final void a() {
        switch (this.a) {
            case 0:
                ((oc4) ((ltm) this.b)).c(Boolean.TRUE);
                return;
            default:
                iyb iybVar = new iyb((mmo) this.b, 3);
                if (lbr.a.get() == gcr.c) {
                    iybVar.invoke();
                    return;
                }
                ReentrantLock reentrantLock = lbr.e;
                reentrantLock.lock();
                try {
                    lbr.f.add(iybVar);
                    reentrantLock.unlock();
                    lbr.b();
                    return;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    @Override // defpackage.erc
    public final void b() {
        switch (this.a) {
            case 0:
                ((oc4) ((ltm) this.b)).c(Boolean.FALSE);
                break;
        }
    }

    private final void c() {
    }
}
