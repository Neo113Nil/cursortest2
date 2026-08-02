package com.anythink.basead.exoplayer.d;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface c {
    void a(Exception exc);

    void d();

    void e();

    void f();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0019a> f7597a = new CopyOnWriteArrayList<>();

        /* renamed from: com.anythink.basead.exoplayer.d.c$a$a, reason: collision with other inner class name */
        public static final class C0019a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f7607a;

            /* renamed from: b, reason: collision with root package name */
            public final c f7608b;

            public C0019a(Handler handler, c cVar) {
                this.f7607a = handler;
                this.f7608b = cVar;
            }
        }

        public final void a(Handler handler, c cVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || cVar == null) ? false : true);
            this.f7597a.add(new C0019a(handler, cVar));
        }

        public final void b() {
            Iterator<C0019a> it = this.f7597a.iterator();
            while (it.hasNext()) {
                C0019a next = it.next();
                final c cVar = next.f7608b;
                next.f7607a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        public final void c() {
            Iterator<C0019a> it = this.f7597a.iterator();
            while (it.hasNext()) {
                C0019a next = it.next();
                final c cVar = next.f7608b;
                next.f7607a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.f();
                    }
                });
            }
        }

        public final void a(c cVar) {
            Iterator<C0019a> it = this.f7597a.iterator();
            while (it.hasNext()) {
                C0019a next = it.next();
                if (next.f7608b == cVar) {
                    this.f7597a.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0019a> it = this.f7597a.iterator();
            while (it.hasNext()) {
                C0019a next = it.next();
                final c cVar = next.f7608b;
                next.f7607a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.d();
                    }
                });
            }
        }

        public final void a(final Exception exc) {
            Iterator<C0019a> it = this.f7597a.iterator();
            while (it.hasNext()) {
                C0019a next = it.next();
                final c cVar = next.f7608b;
                next.f7607a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a(exc);
                    }
                });
            }
        }
    }
}
