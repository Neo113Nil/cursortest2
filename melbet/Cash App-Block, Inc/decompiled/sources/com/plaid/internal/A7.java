package com.plaid.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class A7 {
    public static final C0323x0 d;
    public a a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final int c = 120000;

    public static class a {
        public final InterfaceC0270r1 a;
        public final RunnableC0011a b = new RunnableC0011a();
        public boolean c = false;

        /* renamed from: com.plaid.internal.A7$a$a, reason: collision with other inner class name */
        public class RunnableC0011a implements Runnable {
            public RunnableC0011a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                if (aVar.c) {
                    return;
                }
                A7.d.a(W3.INFO, "release http client", new Object[0]);
                aVar.c = true;
                aVar.a.a();
            }
        }

        public a(InterfaceC0270r1 interfaceC0270r1) {
            this.a = interfaceC0270r1;
        }
    }

    static {
        W3 w3 = Z3.a;
        d = new C0323x0("reuse-network");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: all -> 0x0007, TRY_LEAVE, TryCatch #0 {all -> 0x0007, blocks: (B:4:0x0003, B:8:0x0009, B:10:0x000e, B:14:0x0018, B:15:0x0042, B:17:0x0046, B:18:0x0014, B:19:0x002d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(InterfaceC0270r1 interfaceC0270r1) {
        int i;
        try {
            if (interfaceC0270r1 == null) {
                b();
            } else {
                a aVar = this.a;
                if (aVar != null) {
                    if ((aVar.c ? null : aVar.a) == interfaceC0270r1) {
                        d.a(W3.INFO, "reuse cached http client", new Object[0]);
                        this.b.removeCallbacks(this.a.b);
                        i = this.c;
                        if (i > 0) {
                            d.a(W3.INFO, "schedule http client release in %d ms", Integer.valueOf(i));
                            this.b.postDelayed(this.a.b, this.c);
                        }
                    }
                }
                b();
                d.a(W3.INFO, "cache http client", new Object[0]);
                this.a = new a(interfaceC0270r1);
                i = this.c;
                if (i > 0) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.a != null) {
                C0323x0 c0323x0 = d;
                c0323x0.a(W3.DEBUG, "release cached http client", new Object[0]);
                this.b.removeCallbacks(this.a.b);
                a aVar = this.a;
                if (!aVar.c) {
                    c0323x0.a(W3.INFO, "release http client", new Object[0]);
                    aVar.c = true;
                    aVar.a.a();
                }
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a() {
        synchronized (this) {
            b();
        }
    }
}
