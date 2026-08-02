package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class ZC extends HD implements Runnable {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f29631D = 0;

    /* renamed from: A, reason: collision with root package name */
    public P3.a f29632A;

    /* renamed from: B, reason: collision with root package name */
    public Class f29633B;

    /* renamed from: C, reason: collision with root package name */
    public Object f29634C;

    public ZC(P3.a aVar, Class cls, Object obj) {
        aVar.getClass();
        this.f29632A = aVar;
        this.f29633B = cls;
        this.f29634C = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final void f() {
        o(this.f29632A);
        this.f29632A = null;
        this.f29633B = null;
        this.f29634C = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String g() {
        String str;
        P3.a aVar = this.f29632A;
        Class cls = this.f29633B;
        Object obj = this.f29634C;
        String g9 = super.g();
        if (aVar != null) {
            String obj2 = aVar.toString();
            str = D.x.p(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
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
        AbstractC5128c.h(sb, str, "exceptionType=[", obj3, "], fallback=[");
        return Wv.i(sb, obj4, "]");
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
        P3.a aVar = this.f29632A;
        Class cls = this.f29633B;
        Object obj2 = this.f29634C;
        if (((obj2 == null) || ((aVar == 0) | (cls == null))) || (this.f34004n instanceof C2934aD)) {
            return;
        }
        this.f29632A = null;
        try {
            th = aVar instanceof AbstractC3042cE ? ((AbstractC3042cE) aVar).b() : null;
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(aVar.getClass());
                String valueOf2 = String.valueOf(e9.getClass());
                StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 19 + 16);
                AbstractC5128c.h(sb, "Future type ", valueOf, " threw ", valueOf2);
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
                Object u6 = u(obj2, th);
                this.f29633B = null;
                this.f29634C = null;
                t(u6);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th2);
                    return;
                } finally {
                    this.f29633B = null;
                    this.f29634C = null;
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
