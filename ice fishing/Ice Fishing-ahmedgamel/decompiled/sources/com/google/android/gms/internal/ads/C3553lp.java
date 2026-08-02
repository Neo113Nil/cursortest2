package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.lp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3553lp {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f32631a;

    /* renamed from: b, reason: collision with root package name */
    public final C3235ft f32632b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3983to f32633c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f32634d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f32635e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f32636f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f32637g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32638h;
    public final boolean i;

    public C3553lp(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f32637g) {
            try {
                if (this.f32638h) {
                    return;
                }
                this.f32634d.add(new C2599Go(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        if (this.i) {
            AbstractC2792Sd.H(Thread.currentThread() == this.f32631a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f32634d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2599Go c2599Go = (C2599Go) it.next();
            if (c2599Go.f25891a.equals(obj)) {
                c2599Go.f25894d = true;
                InterfaceC3983to interfaceC3983to = this.f32633c;
                if (interfaceC3983to != null && c2599Go.f25893c) {
                    c2599Go.f25893c = false;
                    interfaceC3983to.a(c2599Go.f25891a, c2599Go.f25892b.u());
                }
                copyOnWriteArraySet.remove(c2599Go);
            }
        }
    }

    public final void c(int i, InterfaceC3606mo interfaceC3606mo) {
        if (this.i) {
            AbstractC2792Sd.H(Thread.currentThread() == this.f32631a);
        }
        this.f32636f.add(new RunnableC2803So(i, 0, new CopyOnWriteArraySet(this.f32634d), interfaceC3606mo));
    }

    public final void d() {
        if (this.i) {
            AbstractC2792Sd.H(Thread.currentThread() == this.f32631a);
        }
        ArrayDeque arrayDeque = this.f32636f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f32633c != null) {
            C3235ft c3235ft = this.f32632b;
            c3235ft.getClass();
            Handler handler = c3235ft.f31231a;
            if (!handler.hasMessages(1)) {
                C3127dt g9 = C3235ft.g();
                Message obtainMessage = handler.obtainMessage(1);
                g9.f30645a = obtainMessage;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                g9.f30645a = null;
                C3235ft.f(g9);
            }
        }
        ArrayDeque arrayDeque2 = this.f32635e;
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

    public final void e() {
        if (this.i) {
            AbstractC2792Sd.H(Thread.currentThread() == this.f32631a);
        }
        synchronized (this.f32637g) {
            this.f32638h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f32634d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2599Go c2599Go = (C2599Go) it.next();
            InterfaceC3983to interfaceC3983to = this.f32633c;
            c2599Go.f25894d = true;
            if (interfaceC3983to != null && c2599Go.f25893c) {
                c2599Go.f25893c = false;
                interfaceC3983to.a(c2599Go.f25891a, c2599Go.f25892b.u());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public C3553lp(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, V2 v22, InterfaceC3983to interfaceC3983to, boolean z6) {
        this.f32631a = thread;
        this.f32634d = copyOnWriteArraySet;
        this.f32633c = interfaceC3983to;
        this.f32637g = new Object();
        this.f32635e = new ArrayDeque();
        this.f32636f = new ArrayDeque();
        this.f32632b = (looper == null || v22 == null || interfaceC3983to == null) ? null : v22.x(looper, new C3177ep(0, this));
        this.i = z6;
    }
}
