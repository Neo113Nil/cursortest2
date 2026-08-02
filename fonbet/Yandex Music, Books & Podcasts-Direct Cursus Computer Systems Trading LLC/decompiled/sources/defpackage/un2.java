package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class un2 {
    public final rn2 a;
    public final AtomicBoolean b;
    public final pjc c;

    public un2() {
        rn2 rn2Var = new rn2(0);
        this.a = rn2Var;
        this.b = new AtomicBoolean(false);
        this.c = zsd.b0(zsd.M0(rn2Var.e, new tn2(3, 0, null)));
    }

    public final void a(cn2 cn2Var) {
        rn2 rn2Var = this.a;
        rn2Var.getClass();
        ArrayList arrayList = rn2Var.c;
        ReentrantLock reentrantLock = rn2Var.a;
        reentrantLock.lock();
        try {
            if (rn2Var.b) {
                arrayList.add(cn2Var);
            } else {
                rn2Var.d.add(cn2Var);
            }
            boolean z = rn2Var.b;
            reentrantLock.unlock();
            if (z) {
                cn2Var.start();
            }
            rn2Var.e.l(rn2Var.b ? CollectionsKt.w0(arrayList) : c5b.a);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
