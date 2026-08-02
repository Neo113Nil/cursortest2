package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import R2.InterfaceC0377c;
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
public final class C3451jv implements InterfaceC0376b, InterfaceC0377c {

    /* renamed from: n, reason: collision with root package name */
    public boolean f32124n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f32125u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f32126v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f32127w;

    /* renamed from: x, reason: collision with root package name */
    public Object f32128x;

    public C3451jv() {
        this.f32124n = false;
        this.f32127w = new WeakHashMap();
        this.f32126v = new Q0.d(this);
    }

    public static IOException a(C3451jv c3451jv, IOException iOException, int i) {
        boolean z6 = (i & 2) == 0;
        boolean z9 = (i & 4) == 0;
        if (iOException != null) {
            c3451jv.e(iOException);
        }
        c3451jv.getClass();
        m8.p call = (m8.p) c3451jv.f32126v;
        if (z9) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        if (z6) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        return call.k(c3451jv, z9, z6, iOException);
    }

    public m8.q b() {
        n8.e j6 = ((n8.f) this.f32128x).j();
        m8.q qVar = j6 instanceof m8.q ? (m8.q) j6 : null;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public n8.i c(i8.v vVar) {
        n8.f fVar = (n8.f) this.f32128x;
        try {
            String a9 = vVar.f38376y.a("Content-Type");
            if (a9 == null) {
                a9 = null;
            }
            long d9 = fVar.d(vVar);
            return new n8.i(a9, d9, y8.b.b(new m8.h(this, fVar.e(vVar), d9)));
        } catch (IOException e9) {
            m8.p call = (m8.p) this.f32126v;
            kotlin.jvm.internal.h.e(call, "call");
            e(e9);
            throw e9;
        }
    }

    public i8.u d(boolean z6) {
        try {
            i8.u f2 = ((n8.f) this.f32128x).f(z6);
            if (f2 != null) {
                f2.f38361n = this;
            }
            return f2;
        } catch (IOException e9) {
            m8.p call = (m8.p) this.f32126v;
            kotlin.jvm.internal.h.e(call, "call");
            e(e9);
            throw e9;
        }
    }

    public void e(IOException iOException) {
        this.f32125u = true;
        ((n8.f) this.f32128x).j().f((m8.p) this.f32126v, iOException);
    }

    public synchronized void f(Context context) {
        try {
            if (this.f32124n) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f32128x = applicationContext;
            if (applicationContext == null) {
                this.f32128x = context;
            }
            AbstractC3592ma.a((Context) this.f32128x);
            C3324ha c3324ha = AbstractC3592ma.f32823I4;
            s2.r rVar = s2.r.f40506e;
            this.f32125u = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.f32128x).registerReceiver((Q0.d) this.f32126v, intentFilter);
            } else {
                ((Context) this.f32128x).registerReceiver((Q0.d) this.f32126v, intentFilter, 4);
            }
            this.f32124n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(boolean z6) {
        if (this.f32125u == z6) {
            return;
        }
        this.f32125u = z6;
        if (this.f32124n) {
            j(true, z6);
        }
    }

    public void h() {
        synchronized (this.f32128x) {
            try {
                Qw qw = (Qw) this.f32126v;
                if (!qw.h()) {
                    if (qw.d()) {
                    }
                    Binder.flushPendingCommands();
                }
                qw.g();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void i(Context context, Q0.d dVar) {
        if (this.f32125u) {
            ((WeakHashMap) this.f32127w).remove(dVar);
        } else {
            context.unregisterReceiver(dVar);
        }
    }

    public void j(final boolean z6, final boolean z9) {
        boolean z10 = z6 && z9;
        C3235ft c3235ft = (C3235ft) this.f32127w;
        if (z10) {
            c3235ft.e(new E2.A(this, z6, z9, 1));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((C3235ft) this.f32128x).f31231a.postDelayed(new RunnableC3071cq(10, this, atomicBoolean), 1000L);
        c3235ft.e(new Runnable() { // from class: com.google.android.gms.internal.ads.nu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C3451jv c3451jv = C3451jv.this;
                c3451jv.getClass();
                atomicBoolean.set(false);
                ((S0.c) c3451jv.f32126v).l(z6, z9);
            }
        });
    }

    @Override // R2.InterfaceC0376b
    public void z() {
        synchronized (this.f32128x) {
            try {
                if (this.f32125u) {
                    return;
                }
                this.f32125u = true;
                try {
                    Tw tw = (Tw) ((Qw) this.f32126v).u();
                    Pw pw = new Pw(1, ((Mw) this.f32127w).b());
                    Parcel F02 = tw.F0();
                    AbstractC3411j8.c(F02, pw);
                    tw.d1(F02, 2);
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

    public C3451jv(Context context, Looper looper, V2 v22) {
        this.f32126v = new S0.c((Object) context.getApplicationContext(), 23, (byte) 0);
        this.f32127w = v22.x(looper, null);
        this.f32128x = v22.x(Looper.getMainLooper(), null);
    }

    public C3451jv(Context context, Looper looper, Mw mw) {
        this.f32128x = new Object();
        this.f32124n = false;
        this.f32125u = false;
        this.f32127w = mw;
        this.f32126v = new Qw(context, looper, this, this, 12800000);
    }

    public C3451jv(m8.p call, m8.i finder, n8.f fVar) {
        kotlin.jvm.internal.h.e(call, "call");
        kotlin.jvm.internal.h.e(finder, "finder");
        this.f32126v = call;
        this.f32127w = finder;
        this.f32128x = fVar;
    }

    public C3451jv(Context context, String str, F.d callback, boolean z6, boolean z9) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f32126v = context;
        this.f32127w = str;
        this.f32128x = callback;
        this.f32124n = z6;
        this.f32125u = z9;
    }

    @Override // R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
    }
}
