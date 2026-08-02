package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class oqg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(oqg.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new qqg(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            qqg qqgVar = (qqg) atomicReferenceFieldUpdater.get(this);
            int a2 = qqgVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                qqg c = qqgVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, qqgVar, c) && atomicReferenceFieldUpdater.get(this) == qqgVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            qqg qqgVar = (qqg) atomicReferenceFieldUpdater.get(this);
            if (qqgVar.b()) {
                return;
            }
            qqg c = qqgVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qqgVar, c) && atomicReferenceFieldUpdater.get(this) == qqgVar) {
            }
        }
    }

    public final int c() {
        qqg qqgVar = (qqg) a.get(this);
        qqgVar.getClass();
        long j = qqg.f.get(qqgVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            qqg qqgVar = (qqg) atomicReferenceFieldUpdater.get(this);
            Object d = qqgVar.d();
            if (d != qqg.g) {
                return d;
            }
            qqg c = qqgVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qqgVar, c) && atomicReferenceFieldUpdater.get(this) == qqgVar) {
            }
        }
    }
}
