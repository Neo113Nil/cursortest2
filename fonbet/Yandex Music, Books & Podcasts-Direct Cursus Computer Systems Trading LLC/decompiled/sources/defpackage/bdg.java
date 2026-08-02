package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class bdg {
    public final dzr a;
    public final hzr b;
    public final zcg c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public bdg(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, dzr dzrVar, zcg zcgVar, boolean z) {
        this.a = dzrVar;
        this.d = copyOnWriteArraySet;
        this.c = zcgVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = dzrVar.a(looper, new xcg(0, this));
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new adg(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        hzr hzrVar = this.b;
        Handler handler = hzrVar.a;
        Handler handler2 = hzrVar.a;
        if (!handler.hasMessages(1)) {
            gzr d = hzr.d();
            Message obtainMessage = handler2.obtainMessage(1);
            d.a = obtainMessage;
            obtainMessage.getClass();
            handler2.sendMessageAtFrontOfQueue(obtainMessage);
            d.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, ycg ycgVar) {
        g();
        this.f.add(new e02(new CopyOnWriteArraySet(this.d), i, ycgVar, 5));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((adg) it.next()).a(this.c);
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            adg adgVar = (adg) it.next();
            if (adgVar.a.equals(obj)) {
                adgVar.a(this.c);
                copyOnWriteArraySet.remove(adgVar);
            }
        }
    }

    public final void f(int i, ycg ycgVar) {
        c(i, ycgVar);
        b();
    }

    public final void g() {
        if (this.i) {
            vq1.A(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public bdg(Looper looper, dzr dzrVar, zcg zcgVar) {
        this(new CopyOnWriteArraySet(), looper, dzrVar, zcgVar, true);
    }
}
