package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes9.dex */
public class sdz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(sdz.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = wb4.a.objectFieldOffset(sdz.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new udz(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            atomicReferenceFieldUpdater.getClass();
            udz udzVar = (udz) wb4.a.getObjectVolatile(this, b);
            int a2 = udzVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                nzs.q(atomicReferenceFieldUpdater, this, udzVar, udzVar.d());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            atomicReferenceFieldUpdater.getClass();
            udz udzVar = (udz) wb4.a.getObjectVolatile(this, b);
            if (udzVar.c()) {
                return;
            } else {
                nzs.q(atomicReferenceFieldUpdater, this, udzVar, udzVar.d());
            }
        }
    }

    public final int c() {
        a.getClass();
        udz udzVar = (udz) wb4.a.getObjectVolatile(this, b);
        udzVar.getClass();
        long j = udz.f.get(udzVar);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            atomicReferenceFieldUpdater.getClass();
            udz udzVar = (udz) wb4.a.getObjectVolatile(this, b);
            Object e = udzVar.e();
            if (e != udz.g) {
                return e;
            }
            nzs.q(atomicReferenceFieldUpdater, this, udzVar, udzVar.d());
        }
    }
}
