package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class rjq implements vqi, gyf {
    public final ReentrantLock a = new ReentrantLock();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public volatile vqi d;

    public rjq(boolean z) {
        this.d = z ? new yiq() : zd7.a;
    }

    @Override // defpackage.gyf
    public final void D(Function0 function0) {
        this.d.D(function0);
    }

    @Override // defpackage.vqi
    public final void V() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.d.V();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.gyf
    public final boolean a() {
        return this.d.a();
    }

    public final void b(Function0 function0) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.c.add(function0);
            this.d.D(function0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void g() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            V();
            yiq yiqVar = new yiq();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                Function0 function0 = (Function0) it.next();
                function0.getClass();
                yiqVar.D(function0);
            }
            this.d = yiqVar;
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.gyf
    public final vqi z() {
        return this.d.z();
    }
}
