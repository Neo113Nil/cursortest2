package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class akk extends uip {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final AtomicReference b = new AtomicReference(null);

    @Override // defpackage.uip
    public final void a() {
        this.a.offer(new xjk(3));
        f();
    }

    @Override // defpackage.uip
    public final void b() {
        this.a.offer(new xjk(1));
        f();
    }

    @Override // defpackage.uip
    public final void c() {
        this.a.offer(new xjk(0));
        f();
    }

    @Override // defpackage.uip
    public final void d(final Object obj) {
        this.a.offer(new zjk() { // from class: yjk
            @Override // defpackage.zjk
            public final void a(uip uipVar) {
                uipVar.d(obj);
            }
        });
        f();
    }

    @Override // defpackage.uip
    public final void e() {
        this.a.offer(new xjk(2));
        f();
    }

    public final void f() {
        uip uipVar = (uip) this.b.get();
        if (uipVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                try {
                    zjk zjkVar = (zjk) this.a.poll();
                    if (zjkVar != null) {
                        zjkVar.a(uipVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
