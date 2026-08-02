package com.bumptech.glide.manager;

import a.AbstractC0426a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC3093dB;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C3357i6;
import com.google.android.gms.internal.ads.C3447jr;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.C3500kq;
import com.google.android.gms.internal.ads.C3554lq;
import com.google.android.gms.internal.ads.C3557lt;
import com.google.android.gms.internal.ads.C4274z8;
import com.google.android.gms.internal.ads.InterfaceC3146eB;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.QA;
import com.google.android.gms.internal.ads.RA;
import com.google.android.gms.internal.ads.RunnableC3996u0;
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
import s2.C4969z0;
import s2.r;
import w2.z;
import x2.AbstractC5190b;

/* loaded from: classes.dex */
public final class o implements P1.i, KD {

    /* renamed from: x, reason: collision with root package name */
    public static volatile o f24252x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24253n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24254u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24255v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24256w;

    public o(Vu vu, Su su, boolean z6) {
        this.f24253n = 8;
        this.f24255v = vu;
        this.f24256w = su;
        this.f24254u = z6;
    }

    public static o b(Context context) {
        if (f24252x == null) {
            synchronized (o.class) {
                try {
                    if (f24252x == null) {
                        f24252x = new o(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f24252x;
    }

    public static o d(PA pa) {
        return new o(new C3557lt(8, pa));
    }

    public boolean a(L1.c cVar) {
        boolean z6 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f24255v).remove(cVar);
        if (!((HashSet) this.f24256w).remove(cVar) && !remove) {
            z6 = false;
        }
        if (z6) {
            cVar.clear();
        }
        return z6;
    }

    public void c() {
        if (this.f24254u || ((HashSet) this.f24256w).isEmpty()) {
            return;
        }
        n nVar = (n) this.f24255v;
        P1.h hVar = (P1.h) nVar.f24250v;
        boolean z6 = false;
        nVar.f24248n = ((ConnectivityManager) hVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback((Q0.h) nVar.f24251w);
            z6 = true;
        } catch (RuntimeException e9) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e9);
            }
        }
        this.f24254u = z6;
    }

    public void e(Context context) {
        synchronized (this.f24255v) {
            try {
                if (!this.f24254u) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i = z.f41712b;
                        x2.i.f("Can not cast Context to Application");
                        return;
                    }
                    if (((C4274z8) this.f24256w) == null) {
                        this.f24256w = new C4274z8();
                    }
                    C4274z8 c4274z8 = (C4274z8) this.f24256w;
                    if (!c4274z8.f36079B) {
                        application.registerActivityLifecycleCallbacks(c4274z8);
                        if (context instanceof Activity) {
                            c4274z8.a((Activity) context);
                        }
                        c4274z8.f36082u = application;
                        c4274z8.f36080C = ((Long) r.f40506e.f40509c.a(AbstractC3592ma.f32761B1)).longValue();
                        c4274z8.f36079B = true;
                    }
                    this.f24254u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(l3.l lVar) {
        synchronized (this.f24255v) {
            try {
                if (((ArrayDeque) this.f24256w) == null) {
                    this.f24256w = new ArrayDeque();
                }
                ((ArrayDeque) this.f24256w).add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void g() {
        synchronized (this.f24256w) {
            try {
                W8 w82 = (W8) this.f24255v;
                if (w82 == null) {
                    return;
                }
                w82.g();
                this.f24255v = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P1.i
    public Object get() {
        if (this.f24254u) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f24254u = true;
        try {
            return d6.c.c((com.bumptech.glide.c) this.f24255v, (ArrayList) this.f24256w);
        } finally {
            this.f24254u = false;
            Trace.endSection();
        }
    }

    public synchronized void h(int i) {
        if (this.f24254u) {
            return;
        }
        this.f24254u = true;
        o(new C4969z0(i, C3447jr.c(i, ((C3500kq) this.f24255v).f32420a), "undefined", null, null));
    }

    public void i(B8 b82) {
        synchronized (this.f24255v) {
            try {
                if (((C4274z8) this.f24256w) == null) {
                    this.f24256w = new C4274z8();
                }
                C4274z8 c4274z8 = (C4274z8) this.f24256w;
                synchronized (c4274z8.f36083v) {
                    c4274z8.f36086y.add(b82);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(l3.m mVar) {
        l3.l lVar;
        synchronized (this.f24255v) {
            if (((ArrayDeque) this.f24256w) != null && !this.f24254u) {
                this.f24254u = true;
                while (true) {
                    synchronized (this.f24255v) {
                        try {
                            lVar = (l3.l) ((ArrayDeque) this.f24256w).poll();
                            if (lVar == null) {
                                this.f24254u = false;
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
        synchronized (this.f24255v) {
            try {
                C4274z8 c4274z8 = (C4274z8) this.f24256w;
                if (c4274z8 == null) {
                    return;
                }
                synchronized (c4274z8.f36083v) {
                    c4274z8.f36086y.remove(b82);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity l() {
        synchronized (this.f24255v) {
            try {
                C4274z8 c4274z8 = (C4274z8) this.f24256w;
                if (c4274z8 == null) {
                    return null;
                }
                return c4274z8.f36081n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o m(SA sa) {
        sa.getClass();
        return new o((InterfaceC3146eB) this.f24256w, this.f24254u, sa);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        Su su = (Su) this.f24256w;
        su.a(true);
        Vu vu = (Vu) this.f24255v;
        vu.a(su);
        if (this.f24254u) {
            vu.h();
        }
    }

    public synchronized void o(C4969z0 c4969z0) {
        int i = 1;
        if (true == ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.w6)).booleanValue()) {
            i = 3;
        }
        ((C3490kg) this.f24256w).c(new C3554lq(i, c4969z0));
    }

    public boolean p() {
        synchronized (this.f24255v) {
            try {
                C4274z8 c4274z8 = (C4274z8) this.f24256w;
                if (c4274z8 == null) {
                    return false;
                }
                return c4274z8.f36084w.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List q(CharSequence charSequence) {
        charSequence.getClass();
        Iterator j6 = ((InterfaceC3146eB) this.f24256w).j(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) abstractC3093dB.next());
        }
    }

    public String toString() {
        switch (this.f24253n) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f24255v).size() + ", isPaused=" + this.f24254u + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Su su = (Su) this.f24256w;
        if (su.f()) {
            su.d(th);
            su.a(false);
            Vu vu = (Vu) this.f24255v;
            vu.a(su);
            if (this.f24254u) {
                vu.h();
            }
        }
    }

    public o(InterfaceC3146eB interfaceC3146eB, boolean z6, QA qa) {
        this.f24253n = 9;
        this.f24256w = interfaceC3146eB;
        this.f24254u = z6;
        this.f24255v = qa;
    }

    public o(C3357i6 c3357i6) {
        this.f24253n = 3;
        this.f24255v = c3357i6.A();
        this.f24254u = c3357i6.B();
        this.f24256w = c3357i6.C();
        c3357i6.D();
    }

    public o(C3447jr c3447jr, C3500kq c3500kq, C3490kg c3490kg) {
        this.f24253n = 7;
        this.f24255v = c3500kq;
        this.f24256w = c3490kg;
        Objects.requireNonNull(c3447jr);
        this.f24254u = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC3146eB interfaceC3146eB) {
        this(interfaceC3146eB, false, (QA) RA.f27932u);
        this.f24253n = 9;
    }

    public o(int i) {
        this.f24253n = i;
        switch (i) {
            case 4:
                this.f24255v = new Object();
                this.f24256w = null;
                this.f24254u = false;
                break;
            case 6:
                this.f24256w = AbstractC5190b.f41851b;
                break;
            case 10:
                this.f24255v = new ArrayList();
                this.f24256w = new HashMap();
                this.f24254u = false;
                break;
            case 11:
                this.f24255v = new Object();
                break;
            default:
                this.f24255v = Collections.newSetFromMap(new WeakHashMap());
                this.f24256w = new HashSet();
                break;
        }
    }

    public o(Context context, int i) {
        this.f24253n = i;
        switch (i) {
            case 5:
                this.f24256w = new Object();
                break;
            case 6:
                ExecutorService executorService = AbstractC5190b.f41851b;
                this.f24256w = executorService;
                executorService.execute(new RunnableC3996u0(6, this, context));
                break;
            default:
                this.f24256w = new HashSet();
                this.f24255v = new n(new P1.h(new A1.r(context, 2)), new m(this));
                break;
        }
    }

    public o(com.bumptech.glide.c cVar, ArrayList arrayList, AbstractC0426a abstractC0426a) {
        this.f24253n = 1;
        this.f24255v = cVar;
        this.f24256w = arrayList;
    }
}
