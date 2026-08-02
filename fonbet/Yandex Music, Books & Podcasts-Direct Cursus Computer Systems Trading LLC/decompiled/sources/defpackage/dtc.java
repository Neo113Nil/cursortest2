package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dtc extends zh {
    public final /* synthetic */ AtomicReference a;

    public dtc(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.zh
    public final void a(Object obj) {
        zh zhVar = (zh) this.a.get();
        if (zhVar != null) {
            zhVar.a(obj);
        } else {
            xq0.q("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // defpackage.zh
    public final void b() {
        zh zhVar = (zh) this.a.getAndSet(null);
        if (zhVar != null) {
            zhVar.b();
        }
    }
}
