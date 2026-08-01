package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class ZC extends HD implements Runnable {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f28851D = 0;

    /* renamed from: A, reason: collision with root package name */
    public N3.a f28852A;

    /* renamed from: B, reason: collision with root package name */
    public Class f28853B;

    /* renamed from: C, reason: collision with root package name */
    public Object f28854C;

    public ZC(N3.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.f28852A = aVar;
        this.f28853B = cls;
        this.f28854C = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final void f() {
        o(this.f28852A);
        this.f28852A = null;
        this.f28853B = null;
        this.f28854C = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String g() {
        String str;
        N3.a aVar = this.f28852A;
        Class cls = this.f28853B;
        Object obj = this.f28854C;
        String g4 = super.g();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = D.y.s(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (g4 != null) {
                return str.concat(g4);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb = new StringBuilder(obj4.length() + length + 15 + length2 + 13 + 1);
        u1.h.i(sb, str, "exceptionType=[", obj3, "], fallback=[");
        return u1.h.g(sb, obj4, "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        N3.a aVar = this.f28852A;
        Class cls = this.f28853B;
        Object obj2 = this.f28854C;
        if (((obj2 == null) || ((aVar == 0) | (cls == null))) || (this.f33220n instanceof C2911aD)) {
            return;
        }
        this.f28852A = null;
        try {
            th = aVar instanceof AbstractC3019cE ? ((AbstractC3019cE) aVar).b() : null;
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(aVar.getClass());
                String valueOf2 = String.valueOf(e9.getClass());
                StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 19 + 16);
                u1.h.i(sb, "Future type ", valueOf, " threw ", valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = QC.v(aVar);
            if (th != null) {
                d(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                n(aVar);
                return;
            }
            try {
                Object u3 = u(obj2, th);
                this.f28853B = null;
                this.f28854C = null;
                t(u3);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th2);
                    return;
                } finally {
                    this.f28853B = null;
                    this.f28854C = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Throwable th);
}
