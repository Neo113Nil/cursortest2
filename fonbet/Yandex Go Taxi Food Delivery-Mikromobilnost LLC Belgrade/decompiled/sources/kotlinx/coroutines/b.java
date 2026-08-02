package kotlinx.coroutines;

import defpackage.bvf0;
import defpackage.dvw;
import defpackage.fbp0;
import defpackage.ny61;
import defpackage.udq0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes9.dex */
public final class b extends fbp0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(b.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.fbp0, kotlinx.coroutines.c
    public final void p(Object obj) {
        r(obj);
    }

    @Override // defpackage.fbp0, kotlinx.coroutines.c
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = z;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    ny61.r("Already resumed");
                    return;
                } else {
                    bvf0.P(udq0.M(obj), dvw.b(this.y));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
