package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.lp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3530lp {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f31851a;

    /* renamed from: b, reason: collision with root package name */
    public final C3212ft f31852b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3906so f31853c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f31854d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f31855e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f31856f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f31857g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31858h;
    public final boolean i;

    public C3530lp(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f31857g) {
            try {
                if (this.f31858h) {
                    return;
                }
                this.f31854d.add(new C2562Fo(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        if (this.i) {
            AbstractC2772Sd.H(Thread.currentThread() == this.f31851a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f31854d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2562Fo c2562Fo = (C2562Fo) it.next();
            if (c2562Fo.f24845a.equals(obj)) {
                c2562Fo.f24848d = true;
                InterfaceC3906so interfaceC3906so = this.f31853c;
                if (interfaceC3906so != null && c2562Fo.f24847c) {
                    c2562Fo.f24847c = false;
                    interfaceC3906so.a(c2562Fo.f24845a, c2562Fo.f24846b.u());
                }
                copyOnWriteArraySet.remove(c2562Fo);
            }
        }
    }

    public final void c(int i, InterfaceC3529lo interfaceC3529lo) {
        if (this.i) {
            AbstractC2772Sd.H(Thread.currentThread() == this.f31851a);
        }
        this.f31856f.add(new RunnableC2766Ro(i, 0, new CopyOnWriteArraySet(this.f31854d), interfaceC3529lo));
    }

    public final void d() {
        if (this.i) {
            AbstractC2772Sd.H(Thread.currentThread() == this.f31851a);
        }
        ArrayDeque arrayDeque = this.f31856f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f31853c != null) {
            C3212ft c3212ft = this.f31852b;
            c3212ft.getClass();
            Handler handler = c3212ft.f30468a;
            if (!handler.hasMessages(1)) {
                C3104dt g4 = C3212ft.g();
                Message obtainMessage = handler.obtainMessage(1);
                g4.f29857a = obtainMessage;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                g4.f29857a = null;
                C3212ft.f(g4);
            }
        }
        ArrayDeque arrayDeque2 = this.f31855e;
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
            AbstractC2772Sd.H(Thread.currentThread() == this.f31851a);
        }
        synchronized (this.f31857g) {
            this.f31858h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f31854d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2562Fo c2562Fo = (C2562Fo) it.next();
            InterfaceC3906so interfaceC3906so = this.f31853c;
            c2562Fo.f24848d = true;
            if (interfaceC3906so != null && c2562Fo.f24847c) {
                c2562Fo.f24847c = false;
                interfaceC3906so.a(c2562Fo.f24845a, c2562Fo.f24846b.u());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public C3530lp(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, V2 v22, InterfaceC3906so interfaceC3906so, boolean z3) {
        this.f31851a = thread;
        this.f31854d = copyOnWriteArraySet;
        this.f31853c = interfaceC3906so;
        this.f31857g = new Object();
        this.f31855e = new ArrayDeque();
        this.f31856f = new ArrayDeque();
        this.f31852b = (looper == null || v22 == null || interfaceC3906so == null) ? null : v22.x(looper, new C3154ep(0, this));
        this.i = z3;
    }
}
