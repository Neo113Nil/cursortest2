package com.plaid.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/* renamed from: com.plaid.internal.p7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0259p7<R> {
    public final C0242o<R> a;
    public final ExecutorService b = Executors.newCachedThreadPool();
    public final boolean c = true;
    public final E0 d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.plaid.internal.p7$a */
    public class a<T> implements Callable<T> {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            return (T) this.a.call();
        }
    }

    /* renamed from: com.plaid.internal.p7$b */
    public class b implements c<R> {
        public final /* synthetic */ C0251p a;

        public b(C0251p c0251p) {
            this.a = c0251p;
        }

        @Override // com.plaid.internal.C0259p7.c
        public final R call() {
            C0242o<R> c0242o = C0259p7.this.a;
            c0242o.f.a((InterfaceC0270r1) C0242o.a(EnumC0223l7.PRE_CHECK, c0242o.a, new C0188i(), this.a));
            return null;
        }
    }

    /* renamed from: com.plaid.internal.p7$c */
    public interface c<T> {
        T call();
    }

    public C0259p7(C0242o c0242o, E0 e0) {
        this.a = c0242o;
        this.d = e0;
    }

    public final R a() {
        String a2;
        C0251p c0251p = new C0251p();
        try {
            a2 = (String) a(new C0268q7(this, c0251p), c0251p);
        } catch (r e) {
            if (!this.c || e.a != EnumC0223l7.AUTHENTICATION) {
                throw e;
            }
            a2 = H.a(e, c0251p);
        }
        C0242o<R> c0242o = this.a;
        c0242o.getClass();
        try {
            R r = (R) C0242o.a(EnumC0223l7.FINISH, c0242o.e, new C0233n(a2), c0251p);
            C0242o.g.a(W3.INFO, "authentication completed", new Object[0]);
            A7 a7 = c0242o.f;
            synchronized (a7) {
                a7.b();
            }
            return r;
        } catch (r e2) {
            c0242o.f.a();
            throw e2;
        }
    }

    public final void b() {
        C0251p c0251p = new C0251p();
        a(new b(c0251p), c0251p);
    }

    public final <T> T a(c<T> cVar, C0251p c0251p) {
        try {
            return this.b.submit(new a(cVar)).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new r(c0251p.b, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof r) {
                throw ((r) cause);
            }
            throw new r(c0251p.b, cause);
        } catch (TimeoutException unused) {
            c0251p.a = true;
            throw new r(c0251p.b, new C0260q(T0.GENERIC_TIMEOUT));
        }
    }
}
