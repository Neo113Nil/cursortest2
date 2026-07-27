package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.vv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4088vv implements InterfaceC0365b, InterfaceC0366c {

    /* renamed from: n, reason: collision with root package name */
    public boolean f34897n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34898u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34899v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f34900w;

    /* renamed from: x, reason: collision with root package name */
    public Object f34901x;

    public C4088vv() {
        this.f34897n = false;
        this.f34900w = new WeakHashMap();
        this.f34899v = new Q0.d(this);
    }

    public static IOException a(C4088vv c4088vv, IOException iOException, int i) {
        boolean z8 = (i & 2) == 0;
        boolean z9 = (i & 4) == 0;
        if (iOException != null) {
            c4088vv.e(iOException);
        }
        c4088vv.getClass();
        i8.q call = (i8.q) c4088vv.f34899v;
        if (z9) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        if (z8) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        return call.k(c4088vv, z9, z8, iOException);
    }

    public i8.r b() {
        j8.e f6 = ((j8.f) this.f34901x).f();
        i8.r rVar = f6 instanceof i8.r ? (i8.r) f6 : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public j8.i c(e8.w wVar) {
        j8.f fVar = (j8.f) this.f34901x;
        try {
            String a9 = wVar.f37535y.a("Content-Type");
            if (a9 == null) {
                a9 = null;
            }
            long j9 = fVar.j(wVar);
            return new j8.i(a9, j9, u8.b.b(new i8.h(this, fVar.g(wVar), j9)));
        } catch (IOException e6) {
            i8.q call = (i8.q) this.f34899v;
            kotlin.jvm.internal.h.e(call, "call");
            e(e6);
            throw e6;
        }
    }

    public e8.v d(boolean z8) {
        try {
            e8.v c4 = ((j8.f) this.f34901x).c(z8);
            if (c4 != null) {
                c4.f37520n = this;
            }
            return c4;
        } catch (IOException e6) {
            i8.q call = (i8.q) this.f34899v;
            kotlin.jvm.internal.h.e(call, "call");
            e(e6);
            throw e6;
        }
    }

    public void e(IOException iOException) {
        this.f34898u = true;
        ((j8.f) this.f34901x).f().d((i8.q) this.f34899v, iOException);
    }

    public synchronized void f(Context context) {
        try {
            if (this.f34897n) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f34901x = applicationContext;
            if (applicationContext == null) {
                this.f34901x = context;
            }
            AbstractC3368ia.a((Context) this.f34901x);
            C3151ea c3151ea = AbstractC3368ia.f31461I4;
            q2.r rVar = q2.r.f40116e;
            this.f34898u = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f34901x).registerReceiver((Q0.d) this.f34899v, intentFilter);
            } else {
                ((Context) this.f34901x).registerReceiver((Q0.d) this.f34899v, intentFilter, 4);
            }
            this.f34897n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(boolean z8) {
        if (this.f34898u == z8) {
            return;
        }
        this.f34898u = z8;
        if (this.f34897n) {
            k(true, z8);
        }
    }

    public void h() {
        synchronized (this.f34901x) {
            try {
                Rw rw = (Rw) this.f34899v;
                if (!rw.j()) {
                    if (rw.d()) {
                    }
                    Binder.flushPendingCommands();
                }
                rw.h();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void i(Context context, Q0.d dVar) {
        if (this.f34898u) {
            ((WeakHashMap) this.f34900w).remove(dVar);
        } else {
            context.unregisterReceiver(dVar);
        }
    }

    @Override // O2.InterfaceC0365b
    public void j() {
        synchronized (this.f34901x) {
            try {
                if (this.f34898u) {
                    return;
                }
                this.f34898u = true;
                try {
                    Uw uw = (Uw) ((Rw) this.f34899v).u();
                    Qw qw = new Qw(1, ((Nw) this.f34900w).b());
                    Parcel A02 = uw.A0();
                    AbstractC3241g8.c(A02, qw);
                    uw.G0(A02, 2);
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

    public void k(final boolean z8, final boolean z9) {
        boolean z10 = z8 && z9;
        C3709ot c3709ot = (C3709ot) this.f34900w;
        if (z10) {
            c3709ot.e(new B2.C(this, z8, z9, 1));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((C3709ot) this.f34901x).f33230a.postDelayed(new RunnableC3329hp(11, this, atomicBoolean), 1000L);
        c3709ot.e(new Runnable() { // from class: com.google.android.gms.internal.ads.uu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C4088vv c4088vv = C4088vv.this;
                c4088vv.getClass();
                atomicBoolean.set(false);
                ((C2593Hm) c4088vv.f34899v).m(z8, z9);
            }
        });
    }

    public C4088vv(Context context, Looper looper, T2 t22) {
        this.f34899v = new C2593Hm(20, context.getApplicationContext());
        this.f34900w = t22.A(looper, null);
        this.f34901x = t22.A(Looper.getMainLooper(), null);
    }

    public C4088vv(Context context, Looper looper, Nw nw) {
        this.f34901x = new Object();
        this.f34897n = false;
        this.f34898u = false;
        this.f34900w = nw;
        this.f34899v = new Rw(context, looper, this, this, 12800000);
    }

    public C4088vv(i8.q call, i8.i finder, j8.f fVar) {
        kotlin.jvm.internal.h.e(call, "call");
        kotlin.jvm.internal.h.e(finder, "finder");
        this.f34899v = call;
        this.f34900w = finder;
        this.f34901x = fVar;
    }

    public C4088vv(Context context, String str, F.d callback, boolean z8, boolean z9) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f34899v = context;
        this.f34900w = str;
        this.f34901x = callback;
        this.f34897n = z8;
        this.f34898u = z9;
    }

    @Override // O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
    }
}
