package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC3298hB;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3129e6;
import com.google.android.gms.internal.ads.C3320hg;
import com.google.android.gms.internal.ads.C3598mq;
import com.google.android.gms.internal.ads.C3599mr;
import com.google.android.gms.internal.ads.C3652nq;
import com.google.android.gms.internal.ads.C4102w8;
import com.google.android.gms.internal.ads.InterfaceC3352iB;
import com.google.android.gms.internal.ads.InterfaceC4156x8;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.Mt;
import com.google.android.gms.internal.ads.T8;
import com.google.android.gms.internal.ads.TA;
import com.google.android.gms.internal.ads.UA;
import com.google.android.gms.internal.ads.VA;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.WA;
import com.google.android.gms.internal.ads.Yu;
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
import q2.C4927z0;
import q2.r;
import t2.C;
import u2.AbstractC5108b;

/* loaded from: classes.dex */
public final class o implements N1.i, LD {

    /* renamed from: x, reason: collision with root package name */
    public static volatile o f23621x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23622n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23623u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23624v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23625w;

    public o(Yu yu, Vu vu, boolean z8) {
        this.f23622n = 8;
        this.f23624v = yu;
        this.f23625w = vu;
        this.f23623u = z8;
    }

    public static o b(Context context) {
        if (f23621x == null) {
            synchronized (o.class) {
                try {
                    if (f23621x == null) {
                        f23621x = new o(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f23621x;
    }

    public static o d(TA ta) {
        return new o(new Mt(7, ta));
    }

    public boolean a(J1.c cVar) {
        boolean z8 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f23624v).remove(cVar);
        if (!((HashSet) this.f23625w).remove(cVar) && !remove) {
            z8 = false;
        }
        if (z8) {
            cVar.clear();
        }
        return z8;
    }

    public void c() {
        if (this.f23623u || ((HashSet) this.f23625w).isEmpty()) {
            return;
        }
        n nVar = (n) this.f23624v;
        N1.h hVar = (N1.h) nVar.f23619v;
        boolean z8 = false;
        nVar.f23617n = ((ConnectivityManager) hVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback((Q0.h) nVar.f23620w);
            z8 = true;
        } catch (RuntimeException e6) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e6);
            }
        }
        this.f23623u = z8;
    }

    public void e(Context context) {
        synchronized (this.f23624v) {
            try {
                if (!this.f23623u) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i = C.f40822b;
                        u2.i.f("Can not cast Context to Application");
                        return;
                    }
                    if (((C4102w8) this.f23625w) == null) {
                        this.f23625w = new C4102w8();
                    }
                    C4102w8 c4102w8 = (C4102w8) this.f23625w;
                    if (!c4102w8.f34944B) {
                        application.registerActivityLifecycleCallbacks(c4102w8);
                        if (context instanceof Activity) {
                            c4102w8.a((Activity) context);
                        }
                        c4102w8.f34947u = application;
                        c4102w8.f34945C = ((Long) r.f40116e.f40119c.a(AbstractC3368ia.f31402B1)).longValue();
                        c4102w8.f34944B = true;
                    }
                    this.f23623u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(h3.m mVar) {
        synchronized (this.f23624v) {
            try {
                if (((ArrayDeque) this.f23625w) == null) {
                    this.f23625w = new ArrayDeque();
                }
                ((ArrayDeque) this.f23625w).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void g() {
        synchronized (this.f23625w) {
            try {
                T8 t82 = (T8) this.f23624v;
                if (t82 == null) {
                    return;
                }
                t82.h();
                this.f23624v = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N1.i
    public Object get() {
        if (this.f23623u) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f23623u = true;
        try {
            return K3.b.e((com.bumptech.glide.c) this.f23624v, (ArrayList) this.f23625w);
        } finally {
            this.f23623u = false;
            Trace.endSection();
        }
    }

    public synchronized void h(int i) {
        if (this.f23623u) {
            return;
        }
        this.f23623u = true;
        o(new C4927z0(i, C3599mr.c(i, ((C3598mq) this.f23624v).f32760a), "undefined", null, null));
    }

    public void i(InterfaceC4156x8 interfaceC4156x8) {
        synchronized (this.f23624v) {
            try {
                if (((C4102w8) this.f23625w) == null) {
                    this.f23625w = new C4102w8();
                }
                C4102w8 c4102w8 = (C4102w8) this.f23625w;
                synchronized (c4102w8.f34948v) {
                    c4102w8.f34951y.add(interfaceC4156x8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(h3.n nVar) {
        h3.m mVar;
        synchronized (this.f23624v) {
            if (((ArrayDeque) this.f23625w) != null && !this.f23623u) {
                this.f23623u = true;
                while (true) {
                    synchronized (this.f23624v) {
                        try {
                            mVar = (h3.m) ((ArrayDeque) this.f23625w).poll();
                            if (mVar == null) {
                                this.f23623u = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    mVar.a(nVar);
                }
            }
        }
    }

    public void k(InterfaceC4156x8 interfaceC4156x8) {
        synchronized (this.f23624v) {
            try {
                C4102w8 c4102w8 = (C4102w8) this.f23625w;
                if (c4102w8 == null) {
                    return;
                }
                synchronized (c4102w8.f34948v) {
                    c4102w8.f34951y.remove(interfaceC4156x8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        Vu vu = (Vu) this.f23625w;
        vu.b(true);
        Yu yu = (Yu) this.f23624v;
        yu.a(vu);
        if (this.f23623u) {
            yu.h();
        }
    }

    public Activity m() {
        synchronized (this.f23624v) {
            try {
                C4102w8 c4102w8 = (C4102w8) this.f23625w;
                if (c4102w8 == null) {
                    return null;
                }
                return c4102w8.f34946n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o n(WA wa) {
        wa.getClass();
        return new o((InterfaceC3352iB) this.f23625w, this.f23623u, wa);
    }

    public synchronized void o(C4927z0 c4927z0) {
        int i = 1;
        if (true == ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31822w6)).booleanValue()) {
            i = 3;
        }
        ((C3320hg) this.f23625w).b(new C3652nq(i, c4927z0));
    }

    public boolean p() {
        synchronized (this.f23624v) {
            try {
                C4102w8 c4102w8 = (C4102w8) this.f23625w;
                if (c4102w8 == null) {
                    return false;
                }
                return c4102w8.f34949w.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        Vu vu = (Vu) this.f23625w;
        if (vu.d()) {
            vu.c(th);
            vu.b(false);
            Yu yu = (Yu) this.f23624v;
            yu.a(vu);
            if (this.f23623u) {
                yu.h();
            }
        }
    }

    public List r(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g9 = ((InterfaceC3352iB) this.f23625w).g(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
            if (!abstractC3298hB.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) abstractC3298hB.next());
        }
    }

    public String toString() {
        switch (this.f23622n) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f23624v).size() + ", isPaused=" + this.f23623u + "}";
            default:
                return super.toString();
        }
    }

    public o(InterfaceC3352iB interfaceC3352iB, boolean z8, UA ua) {
        this.f23622n = 9;
        this.f23625w = interfaceC3352iB;
        this.f23623u = z8;
        this.f23624v = ua;
    }

    public o(C3129e6 c3129e6) {
        this.f23622n = 3;
        this.f23624v = c3129e6.A();
        this.f23623u = c3129e6.B();
        this.f23625w = c3129e6.C();
        c3129e6.D();
    }

    public o(C3599mr c3599mr, C3598mq c3598mq, C3320hg c3320hg) {
        this.f23622n = 7;
        this.f23624v = c3598mq;
        this.f23625w = c3320hg;
        Objects.requireNonNull(c3599mr);
        this.f23623u = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC3352iB interfaceC3352iB) {
        this(interfaceC3352iB, false, (UA) VA.f28217u);
        this.f23622n = 9;
    }

    public o(int i) {
        this.f23622n = i;
        switch (i) {
            case 4:
                this.f23624v = new Object();
                this.f23625w = null;
                this.f23623u = false;
                break;
            case 6:
                this.f23625w = AbstractC5108b.f41223b;
                break;
            case 10:
                this.f23624v = new ArrayList();
                this.f23625w = new HashMap();
                this.f23623u = false;
                break;
            case 11:
                this.f23624v = new Object();
                break;
            default:
                this.f23624v = Collections.newSetFromMap(new WeakHashMap());
                this.f23625w = new HashSet();
                break;
        }
    }

    public o(Context context, int i) {
        this.f23622n = i;
        switch (i) {
            case 5:
                this.f23625w = new Object();
                break;
            case 6:
                ExecutorService executorService = AbstractC5108b.f41223b;
                this.f23625w = executorService;
                executorService.execute(new MD(7, this, context));
                break;
            default:
                this.f23625w = new HashSet();
                this.f23624v = new n(new N1.h(new androidx.emoji2.text.l(context, 1)), new m(this));
                break;
        }
    }

    public o(com.bumptech.glide.c cVar, ArrayList arrayList, p8.g gVar) {
        this.f23622n = 1;
        this.f23624v = cVar;
        this.f23625w = arrayList;
    }
}
