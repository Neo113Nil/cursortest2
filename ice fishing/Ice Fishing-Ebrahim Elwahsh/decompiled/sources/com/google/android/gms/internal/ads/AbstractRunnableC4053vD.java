package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4053vD extends ID implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f34741C = 0;

    /* renamed from: A, reason: collision with root package name */
    public J3.a f34742A;

    /* renamed from: B, reason: collision with root package name */
    public Object f34743B;

    public AbstractRunnableC4053vD(J3.a aVar, Object obj) {
        aVar.getClass();
        this.f34742A = aVar;
        this.f34743B = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final void f() {
        o(this.f34742A);
        this.f34742A = null;
        this.f34743B = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String g() {
        String str;
        J3.a aVar = this.f34742A;
        Object obj = this.f34743B;
        String g9 = super.g();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = D.y.o(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (obj == null) {
            if (g9 != null) {
                return str.concat(g9);
            }
            return null;
        }
        int length = str.length();
        String obj3 = obj.toString();
        return com.anythink.basead.b.c.i.q(new StringBuilder(obj3.length() + length + 10 + 1), str, "function=[", obj3, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        J3.a aVar = this.f34742A;
        Object obj = this.f34743B;
        if (((this.f33992n instanceof C2973bD) | (aVar == null)) || (obj == null)) {
            return;
        }
        this.f34742A = null;
        if (aVar.isCancelled()) {
            n(aVar);
            return;
        }
        try {
            try {
                Object u7 = u(obj, C3686oN.H(aVar));
                this.f34743B = null;
                t(u7);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.f34743B = null;
                }
            }
        } catch (Error e6) {
            e(e6);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e9) {
            e(e9.getCause());
        } catch (Exception e10) {
            e(e10);
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Object obj2);
}
