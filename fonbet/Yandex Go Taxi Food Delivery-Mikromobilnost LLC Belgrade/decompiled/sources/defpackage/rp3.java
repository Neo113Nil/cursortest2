package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class rp3 implements xbi0 {
    public final AtomicReference a = new AtomicReference();

    public final void a(l8x l8xVar) {
        l8x l8xVar2 = (l8x) this.a.getAndSet(l8xVar);
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        return (l8x) this.a.get();
    }

    @Override // defpackage.xbi0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        a((l8x) obj2);
    }
}
