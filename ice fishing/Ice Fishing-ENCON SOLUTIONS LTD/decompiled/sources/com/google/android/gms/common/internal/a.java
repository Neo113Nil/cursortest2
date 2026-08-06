package com.google.android.gms.common.internal;

import P0.A;
import Q0.c;
import Z0.i;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m0.b;
import m0.d;
import m0.f;
import n0.InterfaceC0989c;
import n0.g;
import n0.h;
import o0.l;
import p0.AbstractC1018o;
import p0.AbstractC1021r;
import p0.BinderC1023t;
import p0.C1002B;
import p0.C1003C;
import p0.C1007d;
import p0.C1010g;
import p0.C1020q;
import p0.C1025v;
import p0.C1026w;
import p0.C1027x;
import p0.C1028y;
import p0.HandlerC1022s;
import p0.InterfaceC1005b;
import p0.InterfaceC1008e;
import p0.ServiceConnectionC1024u;
import x0.C1065b;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC0989c {

    /* renamed from: x, reason: collision with root package name */
    public static final d[] f2684x = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2685a;

    /* renamed from: b, reason: collision with root package name */
    public A f2686b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2687c;

    /* renamed from: d, reason: collision with root package name */
    public final C1002B f2688d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerC1022s f2689e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2690f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2691g;

    /* renamed from: h, reason: collision with root package name */
    public C1020q f2692h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1005b f2693i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f2694j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2695k;

    /* renamed from: l, reason: collision with root package name */
    public ServiceConnectionC1024u f2696l;

    /* renamed from: m, reason: collision with root package name */
    public int f2697m;

    /* renamed from: n, reason: collision with root package name */
    public final C1010g f2698n;

    /* renamed from: o, reason: collision with root package name */
    public final C1010g f2699o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2700p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2701q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f2702r;

    /* renamed from: s, reason: collision with root package name */
    public b f2703s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public volatile C1027x f2704u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f2705v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2706w;

    public a(Context context, Looper looper, int i2, c cVar, g gVar, h hVar) {
        synchronized (C1002B.f8332g) {
            try {
                if (C1002B.f8333h == null) {
                    C1002B.f8333h = new C1002B(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1002B c1002b = C1002B.f8333h;
        Object obj = f.f8172c;
        AbstractC1021r.c(gVar);
        AbstractC1021r.c(hVar);
        C1010g c1010g = new C1010g(gVar);
        C1010g c1010g2 = new C1010g(hVar);
        String str = (String) cVar.f1521d;
        this.f2685a = null;
        this.f2690f = new Object();
        this.f2691g = new Object();
        this.f2695k = new ArrayList();
        this.f2697m = 1;
        this.f2703s = null;
        this.t = false;
        this.f2704u = null;
        this.f2705v = new AtomicInteger(0);
        AbstractC1021r.d(context, "Context must not be null");
        this.f2687c = context;
        AbstractC1021r.d(looper, "Looper must not be null");
        AbstractC1021r.d(c1002b, "Supervisor must not be null");
        this.f2688d = c1002b;
        this.f2689e = new HandlerC1022s(this, looper);
        this.f2700p = i2;
        this.f2698n = c1010g;
        this.f2699o = c1010g2;
        this.f2701q = str;
        Set set = (Set) cVar.f1519b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2706w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i2, int i3, IInterface iInterface) {
        synchronized (aVar.f2690f) {
            try {
                if (aVar.f2697m != i2) {
                    return false;
                }
                aVar.v(i3, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // n0.InterfaceC0989c
    public final void a(i iVar) {
        ((l) iVar.f1992b).f8286m.f8269m.post(new C.b(10, iVar));
    }

    @Override // n0.InterfaceC0989c
    public final boolean b() {
        boolean z2;
        synchronized (this.f2690f) {
            int i2 = this.f2697m;
            z2 = true;
            if (i2 != 2 && i2 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // n0.InterfaceC0989c
    public final d[] c() {
        C1027x c1027x = this.f2704u;
        if (c1027x == null) {
            return null;
        }
        return c1027x.f8418b;
    }

    @Override // n0.InterfaceC0989c
    public final boolean d() {
        boolean z2;
        synchronized (this.f2690f) {
            z2 = this.f2697m == 4;
        }
        return z2;
    }

    @Override // n0.InterfaceC0989c
    public final void e() {
        if (!d() || this.f2686b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // n0.InterfaceC0989c
    public final String f() {
        return this.f2685a;
    }

    @Override // n0.InterfaceC0989c
    public final Set g() {
        return j() ? this.f2706w : Collections.emptySet();
    }

    @Override // n0.InterfaceC0989c
    public final void h() {
        this.f2705v.incrementAndGet();
        synchronized (this.f2695k) {
            try {
                int size = this.f2695k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1018o abstractC1018o = (AbstractC1018o) this.f2695k.get(i2);
                    synchronized (abstractC1018o) {
                        abstractC1018o.f8399a = null;
                    }
                }
                this.f2695k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2691g) {
            this.f2692h = null;
        }
        v(1, null);
    }

    @Override // n0.InterfaceC0989c
    public final void i(String str) {
        this.f2685a = str;
        h();
    }

    @Override // n0.InterfaceC0989c
    public boolean j() {
        return false;
    }

    @Override // n0.InterfaceC0989c
    public final void k(InterfaceC1005b interfaceC1005b) {
        this.f2693i = interfaceC1005b;
        v(2, null);
    }

    @Override // n0.InterfaceC0989c
    public final void l(InterfaceC1008e interfaceC1008e, Set set) {
        Bundle p2 = p();
        String str = this.f2702r;
        int i2 = m0.g.f8174a;
        Scope[] scopeArr = C1007d.f8349o;
        Bundle bundle = new Bundle();
        int i3 = this.f2700p;
        d[] dVarArr = C1007d.f8350p;
        C1007d c1007d = new C1007d(6, i3, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c1007d.f8354d = this.f2687c.getPackageName();
        c1007d.f8357g = p2;
        if (set != null) {
            c1007d.f8356f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            c1007d.f8358h = new Account("<<default account>>", "com.google");
            if (interfaceC1008e != null) {
                c1007d.f8355e = ((C1003C) interfaceC1008e).f8341a;
            }
        }
        c1007d.f8359i = f2684x;
        c1007d.f8360j = o();
        if (this instanceof C1065b) {
            c1007d.f8363m = true;
        }
        try {
            synchronized (this.f2691g) {
                try {
                    C1020q c1020q = this.f2692h;
                    if (c1020q != null) {
                        c1020q.a(new BinderC1023t(this, this.f2705v.get()), c1007d);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i4 = this.f2705v.get();
            HandlerC1022s handlerC1022s = this.f2689e;
            handlerC1022s.sendMessage(handlerC1022s.obtainMessage(6, i4, 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.f2705v.get();
            C1025v c1025v = new C1025v(this, 8, null, null);
            HandlerC1022s handlerC1022s2 = this.f2689e;
            handlerC1022s2.sendMessage(handlerC1022s2.obtainMessage(1, i5, -1, c1025v));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i52 = this.f2705v.get();
            C1025v c1025v2 = new C1025v(this, 8, null, null);
            HandlerC1022s handlerC1022s22 = this.f2689e;
            handlerC1022s22.sendMessage(handlerC1022s22.obtainMessage(1, i52, -1, c1025v2));
        }
    }

    public abstract IInterface n(IBinder iBinder);

    public d[] o() {
        return f2684x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f2690f) {
            try {
                if (this.f2697m == 5) {
                    throw new DeadObjectException();
                }
                if (!d()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2694j;
                AbstractC1021r.d(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return m() >= 211700000;
    }

    public final void v(int i2, IInterface iInterface) {
        A a2;
        if ((i2 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f2690f) {
            try {
                this.f2697m = i2;
                this.f2694j = iInterface;
                if (i2 == 1) {
                    ServiceConnectionC1024u serviceConnectionC1024u = this.f2696l;
                    if (serviceConnectionC1024u != null) {
                        C1002B c1002b = this.f2688d;
                        String str = (String) this.f2686b.f1382b;
                        AbstractC1021r.c(str);
                        this.f2686b.getClass();
                        if (this.f2701q == null) {
                            this.f2687c.getClass();
                        }
                        c1002b.a(str, serviceConnectionC1024u, this.f2686b.f1381a);
                        this.f2696l = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    ServiceConnectionC1024u serviceConnectionC1024u2 = this.f2696l;
                    if (serviceConnectionC1024u2 != null && (a2 = this.f2686b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) a2.f1382b) + " on com.google.android.gms");
                        C1002B c1002b2 = this.f2688d;
                        String str2 = (String) this.f2686b.f1382b;
                        AbstractC1021r.c(str2);
                        this.f2686b.getClass();
                        if (this.f2701q == null) {
                            this.f2687c.getClass();
                        }
                        c1002b2.a(str2, serviceConnectionC1024u2, this.f2686b.f1381a);
                        this.f2705v.incrementAndGet();
                    }
                    ServiceConnectionC1024u serviceConnectionC1024u3 = new ServiceConnectionC1024u(this, this.f2705v.get());
                    this.f2696l = serviceConnectionC1024u3;
                    String s2 = s();
                    boolean t = t();
                    this.f2686b = new A(s2, t);
                    if (t && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2686b.f1382b)));
                    }
                    C1002B c1002b3 = this.f2688d;
                    String str3 = (String) this.f2686b.f1382b;
                    AbstractC1021r.c(str3);
                    this.f2686b.getClass();
                    String str4 = this.f2701q;
                    if (str4 == null) {
                        str4 = this.f2687c.getClass().getName();
                    }
                    if (!c1002b3.b(new C1028y(str3, this.f2686b.f1381a), serviceConnectionC1024u3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f2686b.f1382b) + " on com.google.android.gms");
                        int i3 = this.f2705v.get();
                        C1026w c1026w = new C1026w(this, 16);
                        HandlerC1022s handlerC1022s = this.f2689e;
                        handlerC1022s.sendMessage(handlerC1022s.obtainMessage(7, i3, -1, c1026w));
                    }
                } else if (i2 == 4) {
                    AbstractC1021r.c(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
