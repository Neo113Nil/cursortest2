package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
import P2.InterfaceC0373c;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.jv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3428jv implements InterfaceC0372b, InterfaceC0373c {

    /* renamed from: n, reason: collision with root package name */
    public boolean f31345n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31346u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f31347v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f31348w;

    /* renamed from: x, reason: collision with root package name */
    public Object f31349x;

    public C3428jv() {
        this.f31345n = false;
        this.f31348w = new WeakHashMap();
        this.f31347v = new Q0.d(this);
    }

    public static IOException a(C3428jv c3428jv, IOException iOException, int i) {
        boolean z3 = (i & 2) == 0;
        boolean z6 = (i & 4) == 0;
        if (iOException != null) {
            c3428jv.e(iOException);
        }
        c3428jv.getClass();
        m8.q call = (m8.q) c3428jv.f31347v;
        if (z6) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        if (z3) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        return call.k(c3428jv, z6, z3, iOException);
    }

    public m8.r b() {
        n8.e h9 = ((n8.f) this.f31349x).h();
        m8.r rVar = h9 instanceof m8.r ? (m8.r) h9 : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public n8.i c(i8.v vVar) {
        n8.f fVar = (n8.f) this.f31349x;
        try {
            String a9 = vVar.f38257y.a("Content-Type");
            if (a9 == null) {
                a9 = null;
            }
            long c9 = fVar.c(vVar);
            return new n8.i(a9, c9, y8.b.b(new m8.h(this, fVar.d(vVar), c9)));
        } catch (IOException e9) {
            m8.q call = (m8.q) this.f31347v;
            kotlin.jvm.internal.h.e(call, "call");
            e(e9);
            throw e9;
        }
    }

    public i8.u d(boolean z3) {
        try {
            i8.u e9 = ((n8.f) this.f31349x).e(z3);
            if (e9 != null) {
                e9.f38242n = this;
            }
            return e9;
        } catch (IOException e10) {
            m8.q call = (m8.q) this.f31347v;
            kotlin.jvm.internal.h.e(call, "call");
            e(e10);
            throw e10;
        }
    }

    public void e(IOException iOException) {
        this.f31346u = true;
        ((n8.f) this.f31349x).h().f((m8.q) this.f31347v, iOException);
    }

    public synchronized void f(Context context) {
        try {
            if (this.f31345n) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f31349x = applicationContext;
            if (applicationContext == null) {
                this.f31349x = context;
            }
            AbstractC3569ma.a((Context) this.f31349x);
            C3301ha c3301ha = AbstractC3569ma.f32043I4;
            q2.r rVar = q2.r.f40204e;
            this.f31346u = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f31349x).registerReceiver((Q0.d) this.f31347v, intentFilter);
            } else {
                ((Context) this.f31349x).registerReceiver((Q0.d) this.f31347v, intentFilter, 4);
            }
            this.f31345n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(boolean z3) {
        if (this.f31346u == z3) {
            return;
        }
        this.f31346u = z3;
        if (this.f31345n) {
            j(true, z3);
        }
    }

    public void h() {
        synchronized (this.f31349x) {
            try {
                Qw qw = (Qw) this.f31347v;
                if (!qw.i()) {
                    if (qw.e()) {
                    }
                    Binder.flushPendingCommands();
                }
                qw.h();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void i(Context context, Q0.d dVar) {
        if (this.f31346u) {
            ((WeakHashMap) this.f31348w).remove(dVar);
        } else {
            context.unregisterReceiver(dVar);
        }
    }

    public void j(final boolean z3, final boolean z6) {
        boolean z9 = z3 && z6;
        C3212ft c3212ft = (C3212ft) this.f31348w;
        if (z9) {
            c3212ft.e(new C2.B(this, z3, z6, 1));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((C3212ft) this.f31349x).f30468a.postDelayed(new RunnableC3048cq(10, this, atomicBoolean), 1000L);
        c3212ft.e(new Runnable() { // from class: com.google.android.gms.internal.ads.nu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C3428jv c3428jv = C3428jv.this;
                c3428jv.getClass();
                atomicBoolean.set(false);
                ((S0.c) c3428jv.f31347v).u(z3, z6);
            }
        });
    }

    @Override // P2.InterfaceC0372b
    public void r() {
        synchronized (this.f31349x) {
            try {
                if (this.f31346u) {
                    return;
                }
                this.f31346u = true;
                try {
                    Tw tw = (Tw) ((Qw) this.f31347v).u();
                    Pw pw = new Pw(1, ((Mw) this.f31348w).b());
                    Parcel H02 = tw.H0();
                    AbstractC3388j8.c(H02, pw);
                    tw.f1(H02, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    h();
                    throw th;
                }
                h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C3428jv(Context context, Looper looper, V2 v22) {
        this.f31347v = new S0.c(20, context.getApplicationContext());
        this.f31348w = v22.x(looper, null);
        this.f31349x = v22.x(Looper.getMainLooper(), null);
    }

    public C3428jv(Context context, Looper looper, Mw mw) {
        this.f31349x = new Object();
        this.f31345n = false;
        this.f31346u = false;
        this.f31348w = mw;
        this.f31347v = new Qw(context, looper, this, this, 12800000);
    }

    public C3428jv(m8.q call, m8.j finder, n8.f fVar) {
        kotlin.jvm.internal.h.e(call, "call");
        kotlin.jvm.internal.h.e(finder, "finder");
        this.f31347v = call;
        this.f31348w = finder;
        this.f31349x = fVar;
    }

    public C3428jv(Context context, String str, F.d callback, boolean z3, boolean z6) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f31347v = context;
        this.f31348w = str;
        this.f31349x = callback;
        this.f31345n = z3;
        this.f31346u = z6;
    }

    @Override // P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
    }
}
