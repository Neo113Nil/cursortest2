package kotlinx.coroutines.sync;

import defpackage.cma1;
import defpackage.dvw;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h050;
import defpackage.j18;
import defpackage.jb20;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.vg10;
import defpackage.wb4;
import defpackage.wwg;
import defpackage.xfo;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class a extends b implements g050 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long D = wb4.a.objectFieldOffset(a.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public a(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : gtq0.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r0.q(r1, r4.b);
     */
    @Override // defpackage.g050
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        boolean h = h();
        zy11 zy11Var = zy11.a;
        if (!h) {
            j18 V = cma1.V(dvw.b(continuation));
            try {
                h050 h050Var = new h050(this, V);
                while (true) {
                    int andDecrement = b.z.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (e(h050Var)) {
                            break;
                        }
                    }
                }
                Object s = V.s();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (s != coroutineSingletons) {
                    s = zy11Var;
                }
                if (s == coroutineSingletons) {
                    return s;
                }
            } catch (Throwable th) {
                V.C();
                throw th;
            }
        }
        return zy11Var;
    }

    @Override // defpackage.g050
    public final boolean c() {
        return Math.max(b.z.get(this), 0) == 0;
    }

    @Override // defpackage.g050
    public final void d(Object obj) {
        while (this.c()) {
            C.getClass();
            Unsafe unsafe = wb4.a;
            long j = D;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            jb20 jb20Var = gtq0.e;
            if (objectVolatile != jb20Var) {
                if (objectVolatile != obj && obj != null) {
                    vg10.k("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = wb4.a;
                    a aVar = this;
                    if (unsafe2.compareAndSwapObject(aVar, D, objectVolatile, jb20Var)) {
                        aVar.f();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(aVar, j) != objectVolatile) {
                            this = aVar;
                            break;
                        }
                        this = aVar;
                    }
                }
            }
        }
        ny61.r("This mutex is not locked");
    }

    public final boolean h() {
        int i = i();
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            ny61.r("unexpected");
            return false;
        }
        xfo.g("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int i() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b.z;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    C.getClass();
                    wb4.a.putObjectVolatile(this, D, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(wwg.s(this));
        sb.append("[isLocked=");
        sb.append(c());
        sb.append(",owner=");
        C.getClass();
        return qv10.r(sb, wb4.a.getObjectVolatile(this, D), ']');
    }
}
