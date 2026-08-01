package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC3070dB;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C3334i6;
import com.google.android.gms.internal.ads.C3424jr;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.C3477kq;
import com.google.android.gms.internal.ads.C3531lq;
import com.google.android.gms.internal.ads.C3534lt;
import com.google.android.gms.internal.ads.C4251z8;
import com.google.android.gms.internal.ads.InterfaceC3123eB;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.QA;
import com.google.android.gms.internal.ads.RA;
import com.google.android.gms.internal.ads.RunnableC3973u0;
import com.google.android.gms.internal.ads.SA;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.W8;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import q2.C4920z0;
import q2.r;
import u2.z;
import v2.AbstractC5111b;

/* loaded from: classes.dex */
public final class p implements N1.i, KD {

    /* renamed from: x, reason: collision with root package name */
    public static volatile p f23467x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23468n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23469u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23470v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23471w;

    public p(Vu vu, Su su, boolean z3) {
        this.f23468n = 8;
        this.f23470v = vu;
        this.f23471w = su;
        this.f23469u = z3;
    }

    public static p b(Context context) {
        if (f23467x == null) {
            synchronized (p.class) {
                try {
                    if (f23467x == null) {
                        f23467x = new p(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f23467x;
    }

    public static p d(PA pa) {
        return new p(new C3534lt(8, pa));
    }

    public boolean a(J1.c cVar) {
        boolean z3 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f23470v).remove(cVar);
        if (!((HashSet) this.f23471w).remove(cVar) && !remove) {
            z3 = false;
        }
        if (z3) {
            cVar.clear();
        }
        return z3;
    }

    public void c() {
        if (this.f23469u || ((HashSet) this.f23471w).isEmpty()) {
            return;
        }
        o oVar = (o) this.f23470v;
        N1.h hVar = (N1.h) oVar.f23465v;
        boolean z3 = false;
        oVar.f23463n = ((ConnectivityManager) hVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback((Q0.h) oVar.f23466w);
            z3 = true;
        } catch (RuntimeException e9) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e9);
            }
        }
        this.f23469u = z3;
    }

    public void e(Context context) {
        synchronized (this.f23470v) {
            try {
                if (!this.f23469u) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i = z.f41322b;
                        v2.i.f("Can not cast Context to Application");
                        return;
                    }
                    if (((C4251z8) this.f23471w) == null) {
                        this.f23471w = new C4251z8();
                    }
                    C4251z8 c4251z8 = (C4251z8) this.f23471w;
                    if (!c4251z8.f35295B) {
                        application.registerActivityLifecycleCallbacks(c4251z8);
                        if (context instanceof Activity) {
                            c4251z8.a((Activity) context);
                        }
                        c4251z8.f35298u = application;
                        c4251z8.f35296C = ((Long) r.f40207e.f40210c.a(AbstractC3569ma.f31980B1)).longValue();
                        c4251z8.f35295B = true;
                    }
                    this.f23469u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(j3.l lVar) {
        synchronized (this.f23470v) {
            try {
                if (((ArrayDeque) this.f23471w) == null) {
                    this.f23471w = new ArrayDeque();
                }
                ((ArrayDeque) this.f23471w).add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void g() {
        synchronized (this.f23471w) {
            try {
                W8 w82 = (W8) this.f23470v;
                if (w82 == null) {
                    return;
                }
                w82.h();
                this.f23470v = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N1.i
    public Object get() {
        if (this.f23469u) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f23469u = true;
        try {
            return A8.b.e((com.bumptech.glide.c) this.f23470v, (ArrayList) this.f23471w);
        } finally {
            this.f23469u = false;
            Trace.endSection();
        }
    }

    public synchronized void h(int i) {
        if (this.f23469u) {
            return;
        }
        this.f23469u = true;
        o(new C4920z0(i, C3424jr.c(i, ((C3477kq) this.f23470v).f31638a), "undefined", null, null));
    }

    public void i(B8 b82) {
        synchronized (this.f23470v) {
            try {
                if (((C4251z8) this.f23471w) == null) {
                    this.f23471w = new C4251z8();
                }
                C4251z8 c4251z8 = (C4251z8) this.f23471w;
                synchronized (c4251z8.f35299v) {
                    c4251z8.f35302y.add(b82);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(j3.m mVar) {
        j3.l lVar;
        synchronized (this.f23470v) {
            if (((ArrayDeque) this.f23471w) != null && !this.f23469u) {
                this.f23469u = true;
                while (true) {
                    synchronized (this.f23470v) {
                        try {
                            lVar = (j3.l) ((ArrayDeque) this.f23471w).poll();
                            if (lVar == null) {
                                this.f23469u = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.a(mVar);
                }
            }
        }
    }

    public void k(B8 b82) {
        synchronized (this.f23470v) {
            try {
                C4251z8 c4251z8 = (C4251z8) this.f23471w;
                if (c4251z8 == null) {
                    return;
                }
                synchronized (c4251z8.f35299v) {
                    c4251z8.f35302y.remove(b82);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity l() {
        synchronized (this.f23470v) {
            try {
                C4251z8 c4251z8 = (C4251z8) this.f23471w;
                if (c4251z8 == null) {
                    return null;
                }
                return c4251z8.f35297n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public p m(SA sa) {
        sa.getClass();
        return new p((InterfaceC3123eB) this.f23471w, this.f23469u, sa);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        Su su = (Su) this.f23471w;
        su.a(true);
        Vu vu = (Vu) this.f23470v;
        vu.a(su);
        if (this.f23469u) {
            vu.h();
        }
    }

    public synchronized void o(C4920z0 c4920z0) {
        int i = 1;
        if (true == ((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.w6)).booleanValue()) {
            i = 3;
        }
        ((C3467kg) this.f23471w).c(new C3531lq(i, c4920z0));
    }

    public boolean p() {
        synchronized (this.f23470v) {
            try {
                C4251z8 c4251z8 = (C4251z8) this.f23471w;
                if (c4251z8 == null) {
                    return false;
                }
                return c4251z8.f35300w.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List q(CharSequence charSequence) {
        charSequence.getClass();
        Iterator j6 = ((InterfaceC3123eB) this.f23471w).j(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) abstractC3070dB.next());
        }
    }

    public String toString() {
        switch (this.f23468n) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f23470v).size() + ", isPaused=" + this.f23469u + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Su su = (Su) this.f23471w;
        if (su.f()) {
            su.d(th);
            su.a(false);
            Vu vu = (Vu) this.f23470v;
            vu.a(su);
            if (this.f23469u) {
                vu.h();
            }
        }
    }

    public p(InterfaceC3123eB interfaceC3123eB, boolean z3, QA qa) {
        this.f23468n = 9;
        this.f23471w = interfaceC3123eB;
        this.f23469u = z3;
        this.f23470v = qa;
    }

    public p(C3334i6 c3334i6) {
        this.f23468n = 3;
        this.f23470v = c3334i6.A();
        this.f23469u = c3334i6.B();
        this.f23471w = c3334i6.C();
        c3334i6.D();
    }

    public p(C3424jr c3424jr, C3477kq c3477kq, C3467kg c3467kg) {
        this.f23468n = 7;
        this.f23470v = c3477kq;
        this.f23471w = c3467kg;
        Objects.requireNonNull(c3424jr);
        this.f23469u = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC3123eB interfaceC3123eB) {
        this(interfaceC3123eB, false, (QA) RA.f27176u);
        this.f23468n = 9;
    }

    public p(int i) {
        this.f23468n = i;
        switch (i) {
            case 4:
                this.f23470v = new Object();
                this.f23471w = null;
                this.f23469u = false;
                break;
            case 6:
                this.f23471w = AbstractC5111b.f41397b;
                break;
            case 10:
                this.f23470v = new ArrayList();
                this.f23471w = new HashMap();
                this.f23469u = false;
                break;
            case 11:
                this.f23470v = new Object();
                break;
            default:
                this.f23470v = Collections.newSetFromMap(new WeakHashMap());
                this.f23471w = new HashSet();
                break;
        }
    }

    public p(Context context, int i) {
        this.f23468n = i;
        switch (i) {
            case 5:
                this.f23471w = new Object();
                break;
            case 6:
                ExecutorService executorService = AbstractC5111b.f41397b;
                this.f23471w = executorService;
                executorService.execute(new RunnableC3973u0(6, this, context));
                break;
            default:
                this.f23471w = new HashSet();
                this.f23470v = new o(new N1.h(new m(context, 0)), new n(this));
                break;
        }
    }

    public p(com.bumptech.glide.c cVar, ArrayList arrayList, com.bumptech.glide.g gVar) {
        this.f23468n = 1;
        this.f23470v = cVar;
        this.f23471w = arrayList;
    }
}
