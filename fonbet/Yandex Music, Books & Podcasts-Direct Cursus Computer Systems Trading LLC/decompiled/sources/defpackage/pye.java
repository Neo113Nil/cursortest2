package defpackage;

import io.reactivex.internal.schedulers.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class pye extends ito {
    public final oye b;
    public final qye c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final uq5 a = new uq5(0);

    public pye(oye oyeVar) {
        qye qyeVar;
        qye qyeVar2;
        this.b = oyeVar;
        if (oyeVar.c.b) {
            qyeVar2 = b.e;
        } else {
            while (true) {
                if (oyeVar.b.isEmpty()) {
                    qyeVar = new qye(oyeVar.f);
                    oyeVar.c.b(qyeVar);
                    break;
                } else {
                    qyeVar = (qye) oyeVar.b.poll();
                    if (qyeVar != null) {
                        break;
                    }
                }
            }
            qyeVar2 = qyeVar;
        }
        this.c = qyeVar2;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.a.a();
            oye oyeVar = this.b;
            oyeVar.getClass();
            long nanoTime = System.nanoTime() + oyeVar.a;
            qye qyeVar = this.c;
            qyeVar.c = nanoTime;
            oyeVar.b.offer(qyeVar);
        }
    }

    @Override // defpackage.ito
    public final ka8 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.b ? t4b.a : this.c.e(runnable, j, timeUnit, this.a);
    }
}
