package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC3986uD extends HD implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f34506C = 0;

    /* renamed from: A, reason: collision with root package name */
    public N3.a f34507A;

    /* renamed from: B, reason: collision with root package name */
    public Object f34508B;

    public AbstractRunnableC3986uD(N3.a aVar, Object obj) {
        aVar.getClass();
        this.f34507A = aVar;
        this.f34508B = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final void f() {
        o(this.f34507A);
        this.f34507A = null;
        this.f34508B = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String g() {
        String str;
        N3.a aVar = this.f34507A;
        Object obj = this.f34508B;
        String g4 = super.g();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = D.y.s(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (obj == null) {
            if (g4 != null) {
                return str.concat(g4);
            }
            return null;
        }
        int length = str.length();
        String obj3 = obj.toString();
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(obj3.length() + length + 10 + 1), str, "function=[", obj3, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3.a aVar = this.f34507A;
        Object obj = this.f34508B;
        if (((this.f33220n instanceof C2911aD) | (aVar == null)) || (obj == null)) {
            return;
        }
        this.f34507A = null;
        if (aVar.isCancelled()) {
            n(aVar);
            return;
        }
        try {
            try {
                Object u3 = u(obj, QC.v(aVar));
                this.f34508B = null;
                t(u3);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.f34508B = null;
                }
            }
        } catch (Error e9) {
            e(e9);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            e(e10.getCause());
        } catch (Exception e11) {
            e(e11);
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Object obj2);
}
