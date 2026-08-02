package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4009uD extends HD implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f35280C = 0;

    /* renamed from: A, reason: collision with root package name */
    public P3.a f35281A;

    /* renamed from: B, reason: collision with root package name */
    public Object f35282B;

    public AbstractRunnableC4009uD(P3.a aVar, Object obj) {
        aVar.getClass();
        this.f35281A = aVar;
        this.f35282B = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final void f() {
        o(this.f35281A);
        this.f35281A = null;
        this.f35282B = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String g() {
        String str;
        P3.a aVar = this.f35281A;
        Object obj = this.f35282B;
        String g9 = super.g();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = D.x.p(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
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
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(obj3.length() + length + 10 + 1), str, "function=[", obj3, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        P3.a aVar = this.f35281A;
        Object obj = this.f35282B;
        if (((this.f34004n instanceof C2934aD) | (aVar == null)) || (obj == null)) {
            return;
        }
        this.f35281A = null;
        if (aVar.isCancelled()) {
            n(aVar);
            return;
        }
        try {
            try {
                Object u6 = u(obj, QC.v(aVar));
                this.f35282B = null;
                t(u6);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.f35282B = null;
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
