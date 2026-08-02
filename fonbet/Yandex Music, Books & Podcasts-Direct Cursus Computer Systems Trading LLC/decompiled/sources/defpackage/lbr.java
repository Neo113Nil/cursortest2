package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public abstract class lbr {
    public static final AtomicReference a = new AtomicReference(gcr.a);
    public static final ReentrantLock b = new ReentrantLock();
    public static final ArrayList c = new ArrayList();
    public static final ArrayList d = new ArrayList();
    public static final ReentrantLock e = new ReentrantLock();
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();

    public static void a() {
        AtomicReference atomicReference;
        gcr gcrVar = gcr.a;
        gcr gcrVar2 = gcr.b;
        do {
            atomicReference = a;
            if (atomicReference.compareAndSet(gcrVar, gcrVar2)) {
                if (atomicReference.get() != gcr.a) {
                    pld.a(new nrq(23));
                    return;
                }
                return;
            }
        } while (atomicReference.get() == gcrVar);
    }

    public static void b() {
        if (a.get() == gcr.c) {
            pld.a(new nrq(22));
        }
    }
}
