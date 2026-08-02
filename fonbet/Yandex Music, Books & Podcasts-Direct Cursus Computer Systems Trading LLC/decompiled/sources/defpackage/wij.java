package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class wij extends AtomicReference implements ajj {
    private static final long serialVersionUID = 2346567790059478686L;
    public zij a;
    public int b;

    @Override // defpackage.ajj
    public final void g() {
        zij zijVar = new zij(jfj.a);
        this.a.set(zijVar);
        this.a = zijVar;
        this.b++;
        zij zijVar2 = (zij) get();
        if (zijVar2.a != null) {
            zij zijVar3 = new zij(null);
            zijVar3.lazySet(zijVar2.get());
            set(zijVar3);
        }
    }

    @Override // defpackage.ajj
    public final void n(yij yijVar) {
        if (yijVar.getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        do {
            zij zijVar = (zij) yijVar.c;
            if (zijVar == null) {
                zijVar = (zij) get();
                yijVar.c = zijVar;
            }
            while (!yijVar.d) {
                zij zijVar2 = (zij) zijVar.get();
                if (zijVar2 != null) {
                    if (jfj.a(yijVar.b, zijVar2.a)) {
                        yijVar.c = null;
                        return;
                    }
                    zijVar = zijVar2;
                } else {
                    yijVar.c = zijVar;
                    i = yijVar.addAndGet(-i);
                }
            }
            yijVar.c = null;
            return;
        } while (i != 0);
    }

    @Override // defpackage.ajj
    public final void q(Throwable th) {
        zij zijVar = new zij(new ifj(th));
        this.a.set(zijVar);
        this.a = zijVar;
        this.b++;
        zij zijVar2 = (zij) get();
        if (zijVar2.a != null) {
            zij zijVar3 = new zij(null);
            zijVar3.lazySet(zijVar2.get());
            set(zijVar3);
        }
    }

    @Override // defpackage.ajj
    public final void r(Object obj) {
        zij zijVar = new zij(obj);
        this.a.set(zijVar);
        this.a = zijVar;
        this.b++;
        djj djjVar = (djj) this;
        if (djjVar.b > djjVar.c) {
            djjVar.b--;
            djjVar.set((zij) ((zij) djjVar.get()).get());
        }
    }
}
