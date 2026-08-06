package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jm extends qx0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater rQPn8YBR = AtomicIntegerFieldUpdater.newUpdater(jm.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.qx0, defpackage.m40
    public final void WdrkLMV3xh(Object obj) {
        arNh8D4Z5gB(obj);
    }

    @Override // defpackage.qx0, defpackage.m40
    public final void arNh8D4Z5gB(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = rQPn8YBR;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    o30.TpUsjqg3bxO(rj0.M3K9sHhK(this.JFJ3QoxA), vc0.ozMwhSAI(obj));
                    return;
                } else {
                    o4.jivtDDk9H("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
