package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.aD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC2918aD extends ID implements Runnable {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f29183D = 0;

    /* renamed from: A, reason: collision with root package name */
    public J3.a f29184A;

    /* renamed from: B, reason: collision with root package name */
    public Class f29185B;

    /* renamed from: C, reason: collision with root package name */
    public Object f29186C;

    public AbstractRunnableC2918aD(J3.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.f29184A = aVar;
        this.f29185B = cls;
        this.f29186C = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final void f() {
        o(this.f29184A);
        this.f29184A = null;
        this.f29185B = null;
        this.f29186C = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String g() {
        String str;
        J3.a aVar = this.f29184A;
        Class cls = this.f29185B;
        Object obj = this.f29186C;
        String g9 = super.g();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = D.y.o(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (g9 != null) {
                return str.concat(g9);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb = new StringBuilder(obj4.length() + length + 15 + length2 + 13 + 1);
        AbstractC5051n.j(sb, str, "exceptionType=[", obj3, "], fallback=[");
        return AbstractC5051n.g(sb, obj4, "]");
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
        J3.a aVar = this.f29184A;
        Class cls = this.f29185B;
        Object obj2 = this.f29186C;
        if (((obj2 == null) || ((aVar == 0) | (cls == null))) || (this.f33992n instanceof C2973bD)) {
            return;
        }
        this.f29184A = null;
        try {
            th = aVar instanceof AbstractC3192fE ? ((AbstractC3192fE) aVar).a() : null;
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(aVar.getClass());
                String valueOf2 = String.valueOf(e6.getClass());
                StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 19 + 16);
                AbstractC5051n.j(sb, "Future type ", valueOf, " threw ", valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = C3686oN.H(aVar);
            if (th != null) {
                d(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                n(aVar);
                return;
            }
            try {
                Object u7 = u(obj2, th);
                this.f29185B = null;
                this.f29186C = null;
                t(u7);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th2);
                    return;
                } finally {
                    this.f29185B = null;
                    this.f29186C = null;
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
