package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public final class uuy {
    public final y3c a;
    public final a3x0 b;
    public final suy c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public uuy(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y3c y3cVar, suy suyVar, boolean z) {
        this.a = y3cVar;
        this.d = copyOnWriteArraySet;
        this.c = suyVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = ((o2x0) y3cVar).a(looper, new j7m(1, this));
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new tuy(obj));
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
        a3x0 a3x0Var = this.b;
        if (!a3x0Var.a.hasMessages(1)) {
            a3x0Var.getClass();
            z2x0 d = a3x0.d();
            Message obtainMessage = a3x0Var.a.obtainMessage(1);
            d.a = obtainMessage;
            Handler handler = a3x0Var.a;
            obtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(obtainMessage);
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

    public final void c(int i, ruy ruyVar) {
        g();
        this.f.add(new z50(new CopyOnWriteArraySet(this.d), i, ruyVar, 8));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            tuy tuyVar = (tuy) it.next();
            suy suyVar = this.c;
            tuyVar.d = true;
            if (tuyVar.c) {
                tuyVar.c = false;
                suyVar.e(tuyVar.a, tuyVar.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            tuy tuyVar = (tuy) it.next();
            if (tuyVar.a.equals(obj)) {
                tuyVar.d = true;
                if (tuyVar.c) {
                    tuyVar.c = false;
                    this.c.e(tuyVar.a, tuyVar.b.b());
                }
                copyOnWriteArraySet.remove(tuyVar);
            }
        }
    }

    public final void f(int i, ruy ruyVar) {
        c(i, ruyVar);
        b();
    }

    public final void g() {
        if (this.i) {
            d6z.x(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public uuy(Looper looper, y3c y3cVar, suy suyVar) {
        this(new CopyOnWriteArraySet(), looper, y3cVar, suyVar, true);
    }
}
