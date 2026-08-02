package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class yiq implements vqi, gyf {
    public final ReentrantLock a = new ReentrantLock();
    public volatile boolean b = true;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public CopyOnWriteArrayList d;

    @Override // defpackage.gyf
    public final void D(Function0 function0) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.b) {
                this.c.add(function0);
            } else {
                function0.invoke();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        r0.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        throw r1;
     */
    @Override // defpackage.vqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.b) {
                this.b = false;
                reentrantLock = this.a;
                reentrantLock.lock();
                CopyOnWriteArrayList copyOnWriteArrayList = this.d;
                if (copyOnWriteArrayList != null) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((vqi) it.next()).V();
                    }
                    copyOnWriteArrayList.clear();
                }
                reentrantLock.unlock();
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.c;
                reentrantLock = this.a;
                reentrantLock.lock();
                Iterator it2 = copyOnWriteArrayList2.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                copyOnWriteArrayList2.clear();
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    @Override // defpackage.gyf
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.gyf
    public final vqi z() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (!this.b) {
                return zd7.a;
            }
            if (this.d == null) {
                this.d = new CopyOnWriteArrayList();
            }
            yiq yiqVar = new yiq();
            yiqVar.D(new ap1(8, this, yiqVar));
            CopyOnWriteArrayList copyOnWriteArrayList = this.d;
            copyOnWriteArrayList.getClass();
            copyOnWriteArrayList.add(yiqVar);
            return yiqVar;
        } finally {
            reentrantLock.unlock();
        }
    }
}
