package kotlinx.coroutines.internal;

import defpackage.de60;
import defpackage.hxi0;
import defpackage.nzs;
import defpackage.uqy;
import defpackage.wb4;
import defpackage.wwg;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public class a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = wb4.a;
        w = unsafe.objectFieldOffset(a.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_prev$volatile");
        x = unsafe.objectFieldOffset(a.class.getDeclaredField("_prev$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_removedRef$volatile");
        y = unsafe.objectFieldOffset(a.class.getDeclaredField("_removedRef$volatile"));
    }

    public static a g(a aVar) {
        while (aVar.l()) {
            b.getClass();
            aVar = (a) wb4.a.getObjectVolatile(aVar, x);
        }
        return aVar;
    }

    public final boolean c(a aVar, int i) {
        a k;
        do {
            k = k();
            if (k instanceof uqy) {
                return (((uqy) k).z & i) == 0 && k.c(aVar, i);
            }
        } while (!k.d(aVar, this));
        return true;
    }

    public final boolean d(a aVar, a aVar2) {
        b.getClass();
        Unsafe unsafe = wb4.a;
        unsafe.putObjectVolatile(aVar, x, this);
        a.getClass();
        long j = w;
        unsafe.putObjectVolatile(aVar, j, aVar2);
        while (true) {
            Unsafe unsafe2 = wb4.a;
            a aVar3 = this;
            a aVar4 = aVar;
            a aVar5 = aVar2;
            if (unsafe2.compareAndSwapObject(aVar3, w, aVar5, aVar4)) {
                aVar4.h(aVar5);
                return true;
            }
            if (unsafe2.getObjectVolatile(aVar3, j) != aVar5) {
                return false;
            }
            this = aVar3;
            aVar2 = aVar5;
            aVar = aVar4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(de60 de60Var) {
        b.getClass();
        Unsafe unsafe = wb4.a;
        unsafe.putObjectVolatile(de60Var, x, this);
        a.getClass();
        long j = w;
        unsafe.putObjectVolatile(de60Var, j, this);
        while (this.i() == this) {
            while (true) {
                Unsafe unsafe2 = wb4.a;
                a aVar = this;
                de60 de60Var2 = de60Var;
                if (unsafe2.compareAndSwapObject(aVar, w, this, de60Var2)) {
                    de60Var2.h(aVar);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(aVar, j) != aVar) {
                        break;
                    }
                    this = aVar;
                    de60Var = de60Var2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (defpackage.nzs.C(r7, r6, r5, ((defpackage.hxi0) r9).a) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = wb4.a;
            long j = x;
            a aVar = (a) unsafe.getObjectVolatile(this, j);
            a aVar2 = aVar;
            while (true) {
                a aVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    atomicReferenceFieldUpdater2.getClass();
                    nzs.r(aVar2);
                    Unsafe unsafe2 = wb4.a;
                    Object objectVolatile = unsafe2.getObjectVolatile(aVar2, w);
                    if (objectVolatile == this) {
                        if (aVar != aVar2 && !nzs.B(atomicReferenceFieldUpdater, this, aVar, aVar2)) {
                        }
                    } else {
                        if (l()) {
                            return null;
                        }
                        if (!(objectVolatile instanceof hxi0)) {
                            aVar3 = aVar2;
                            aVar2 = (a) objectVolatile;
                        } else {
                            if (aVar3 != null) {
                                break;
                            }
                            nzs.r(aVar2);
                            aVar2 = (a) unsafe2.getObjectVolatile(aVar2, j);
                        }
                    }
                }
                aVar2 = aVar3;
            }
        }
    }

    public final void h(a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a aVar2;
        do {
            atomicReferenceFieldUpdater = b;
            atomicReferenceFieldUpdater.getClass();
            nzs.r(aVar);
            aVar2 = (a) wb4.a.getObjectVolatile(aVar, x);
            if (i() != aVar) {
                return;
            }
        } while (!nzs.D(atomicReferenceFieldUpdater, aVar, aVar2, this));
        if (l()) {
            aVar.f();
        }
    }

    public final Object i() {
        a.getClass();
        return wb4.a.getObjectVolatile(this, w);
    }

    public final a j() {
        Object i = i();
        hxi0 hxi0Var = i instanceof hxi0 ? (hxi0) i : null;
        return hxi0Var != null ? hxi0Var.a : (a) i;
    }

    public final a k() {
        a f = f();
        if (f != null) {
            return f;
        }
        b.getClass();
        return g((a) wb4.a.getObjectVolatile(this, x));
    }

    public boolean l() {
        return i() instanceof hxi0;
    }

    public final hxi0 m() {
        c.getClass();
        Unsafe unsafe = wb4.a;
        long j = y;
        hxi0 hxi0Var = (hxi0) unsafe.getObjectVolatile(this, j);
        if (hxi0Var != null) {
            return hxi0Var;
        }
        hxi0 hxi0Var2 = new hxi0(this);
        unsafe.putObjectVolatile(this, j, hxi0Var2);
        return hxi0Var2;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            {
                super(this, wwg.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
            }

            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + wwg.s(this);
    }
}
