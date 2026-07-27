package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import g1.C4522b;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.C5019n;
import v1.C5105b;
import v1.C5107d;
import v1.C5108e;
import v7.AbstractC5129j;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2941aq implements InterfaceC3101dq {

    /* renamed from: n, reason: collision with root package name */
    public final int f29131n;

    /* renamed from: u, reason: collision with root package name */
    public int f29132u;

    /* renamed from: v, reason: collision with root package name */
    public Object f29133v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29134w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f29135x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f29136y;

    public /* synthetic */ C2941aq(int i, int i6, WebView webView, String str, String str2, String str3) {
        this.f29133v = str;
        this.f29131n = i;
        this.f29134w = str2;
        this.f29136y = webView;
        this.f29135x = str3;
        this.f29132u = i6;
    }

    public static void j(C2941aq c2941aq, m8.n nVar, m8.n nVar2, int i) {
        C4522b c4522b;
        int i6 = 21;
        if ((i & 1) != 0) {
            nVar = null;
        }
        if ((i & 4) != 0) {
            nVar2 = null;
        }
        c2941aq.getClass();
        TimeZone timeZone = j8.d.f38483a;
        boolean isShutdown = ((ThreadPoolExecutor) c2941aq.d()).isShutdown();
        synchronized (c2941aq) {
            if (nVar2 != null) {
                try {
                    nVar2.f39374u.decrementAndGet();
                    if (!((ArrayDeque) c2941aq.f29135x).remove(nVar2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (nVar != null) {
                ((ArrayDeque) c2941aq.f29134w).add(nVar);
                m8.n e9 = c2941aq.e(((i8.n) nVar.f39375v.f39388u.f40189u).f38162d);
                if (e9 != null) {
                    nVar.f39374u = e9.f39374u;
                }
            }
            if (nVar2 != null && (isShutdown || ((ArrayDeque) c2941aq.f29135x).isEmpty())) {
                ((ArrayDeque) c2941aq.f29136y).isEmpty();
            }
            if (isShutdown) {
                List L6 = AbstractC5129j.L((ArrayDeque) c2941aq.f29134w);
                ((ArrayDeque) c2941aq.f29134w).clear();
                c4522b = new C4522b(i6, L6);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c2941aq.f29134w).iterator();
                kotlin.jvm.internal.h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    m8.n nVar3 = (m8.n) it.next();
                    if (((ArrayDeque) c2941aq.f29135x).size() >= c2941aq.f29131n) {
                        break;
                    }
                    if (nVar3.f39374u.get() < c2941aq.f29132u) {
                        it.remove();
                        nVar3.f39374u.incrementAndGet();
                        arrayList.add(nVar3);
                        ((ArrayDeque) c2941aq.f29135x).add(nVar3);
                    }
                }
                c4522b = new C4522b(i6, arrayList);
            }
        }
        int size = ((List) c4522b.f37625u).size();
        for (int i9 = 0; i9 < size; i9++) {
            m8.n nVar4 = (m8.n) ((List) c4522b.f37625u).get(i9);
            if (nVar4 != nVar) {
                m8.q qVar = nVar4.f39375v;
            }
            if (isShutdown) {
                nVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                nVar4.f39375v.l(interruptedIOException);
                ((M6.a) nVar4.f39373n.f2797u).accept(interruptedIOException);
            } else {
                ExecutorService d2 = c2941aq.d();
                nVar4.getClass();
                m8.q qVar2 = nVar4.f39375v;
                kotlin.jvm.internal.h.e(qVar2.f39387n.f38195a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) d2).execute(nVar4);
                    } catch (Throwable th2) {
                        C2941aq c2941aq2 = qVar2.f39387n.f38195a;
                        c2941aq2.getClass();
                        j(c2941aq2, null, nVar4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e10);
                    nVar4.f39375v.l(interruptedIOException2);
                    ((M6.a) nVar4.f39373n.f2797u).accept(interruptedIOException2);
                    C2941aq c2941aq3 = qVar2.f39387n.f38195a;
                    c2941aq3.getClass();
                    j(c2941aq3, null, nVar4, 3);
                }
            }
        }
    }

    public void a(int i, Class cls) {
        NavigableMap i6 = i(cls);
        Integer num = (Integer) i6.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                i6.remove(Integer.valueOf(i));
                return;
            } else {
                i6.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void b(int i) {
        while (this.f29132u > i) {
            Object h9 = ((C5019n) this.f29133v).h();
            N1.g.b(h9);
            C5105b g4 = g(h9.getClass());
            this.f29132u -= g4.b() * g4.a(h9);
            a(g4.a(h9), h9.getClass());
            if (Log.isLoggable(g4.c(), 2)) {
                Log.v(g4.c(), "evicted: " + g4.a(h9));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101dq
    /* renamed from: c */
    public Object mo3c() {
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str = (String) this.f29133v;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        C3731pa c3731pa = new C3731pa("Google", str);
        Zv k9 = C3472kl.k("javascript");
        int i = this.f29131n;
        Vv m4 = C3472kl.m(com.anythink.basead.exoplayer.f.f.b(i));
        Zv zv = Zv.NONE;
        if (k9 == zv) {
            int i6 = u2.z.f41319b;
            v2.i.f("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (m4 == null) {
            String A9 = com.anythink.basead.exoplayer.f.f.A(i);
            int i9 = u2.z.f41319b;
            v2.i.f("Omid html session error; Unable to parse creative type: ".concat(A9));
            return null;
        }
        String str2 = (String) this.f29134w;
        Zv k10 = C3472kl.k(str2);
        if (m4 == Vv.VIDEO && k10 == zv) {
            String valueOf = String.valueOf(str2);
            int i10 = u2.z.f41319b;
            v2.i.f("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf));
            return null;
        }
        C3 c32 = new C3(c3731pa, (WebView) this.f29136y, (String) this.f29135x, "", Tv.HTML);
        Xw b9 = Xw.b(m4, C3472kl.l(com.anythink.basead.exoplayer.f.f.c(this.f29132u)), k9, k10, true);
        if (MA.f26253E.f27159u) {
            return new C3209fq(new Uv(b9, c32, UUID.randomUUID().toString()), c32);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public synchronized ExecutorService d() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f29133v) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = j8.d.f38484b + " Dispatcher";
                kotlin.jvm.internal.h.e(name, "name");
                this.f29133v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new com.anythink.core.common.n.b.a.e(1, name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f29133v;
            kotlin.jvm.internal.h.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public m8.n e(String str) {
        Iterator it = ((ArrayDeque) this.f29135x).iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            m8.n nVar = (m8.n) it.next();
            if (kotlin.jvm.internal.h.a(((i8.n) nVar.f39375v.f39388u.f40189u).f38162d, str)) {
                return nVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f29134w).iterator();
        kotlin.jvm.internal.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            m8.n nVar2 = (m8.n) it2.next();
            if (kotlin.jvm.internal.h.a(((i8.n) nVar2.f39375v.f39388u.f40189u).f38162d, str)) {
                return nVar2;
            }
        }
        return null;
    }

    public synchronized Object f(int i, Class cls) {
        C5107d c5107d;
        int i6;
        try {
            Integer num = (Integer) i(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i6 = this.f29132u) != 0 && this.f29131n / i6 < 2 && num.intValue() > i * 8)) {
                C5108e c5108e = (C5108e) this.f29134w;
                v1.g gVar = (v1.g) ((ArrayDeque) c5108e.f1720u).poll();
                if (gVar == null) {
                    gVar = c5108e.m();
                }
                c5107d = (C5107d) gVar;
                c5107d.f41363b = i;
                c5107d.f41364c = cls;
            }
            C5108e c5108e2 = (C5108e) this.f29134w;
            int intValue = num.intValue();
            v1.g gVar2 = (v1.g) ((ArrayDeque) c5108e2.f1720u).poll();
            if (gVar2 == null) {
                gVar2 = c5108e2.m();
            }
            c5107d = (C5107d) gVar2;
            c5107d.f41363b = intValue;
            c5107d.f41364c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return h(c5107d, cls);
    }

    public C5105b g(Class cls) {
        C5105b c5105b;
        HashMap hashMap = (HashMap) this.f29136y;
        C5105b c5105b2 = (C5105b) hashMap.get(cls);
        if (c5105b2 != null) {
            return c5105b2;
        }
        if (cls.equals(int[].class)) {
            c5105b = new C5105b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c5105b = new C5105b(0);
        }
        hashMap.put(cls, c5105b);
        return c5105b;
    }

    public Object h(C5107d c5107d, Class cls) {
        C5105b g4 = g(cls);
        Object a9 = ((C5019n) this.f29133v).a(c5107d);
        if (a9 != null) {
            this.f29132u -= g4.b() * g4.a(a9);
            a(g4.a(a9), cls);
        }
        if (a9 != null) {
            return a9;
        }
        if (Log.isLoggable(g4.c(), 2)) {
            Log.v(g4.c(), "Allocated " + c5107d.f41363b + " bytes");
        }
        int i = c5107d.f41363b;
        switch (g4.f41357a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap i(Class cls) {
        HashMap hashMap = (HashMap) this.f29135x;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void k(Object obj) {
        Class<?> cls = obj.getClass();
        C5105b g4 = g(cls);
        int a9 = g4.a(obj);
        int b9 = g4.b() * a9;
        if (b9 <= this.f29131n / 2) {
            C5108e c5108e = (C5108e) this.f29134w;
            v1.g gVar = (v1.g) ((ArrayDeque) c5108e.f1720u).poll();
            if (gVar == null) {
                gVar = c5108e.m();
            }
            C5107d c5107d = (C5107d) gVar;
            c5107d.f41363b = a9;
            c5107d.f41364c = cls;
            ((C5019n) this.f29133v).g(c5107d, obj);
            NavigableMap i = i(cls);
            Integer num = (Integer) i.get(Integer.valueOf(c5107d.f41363b));
            Integer valueOf = Integer.valueOf(c5107d.f41363b);
            int i6 = 1;
            if (num != null) {
                i6 = 1 + num.intValue();
            }
            i.put(valueOf, Integer.valueOf(i6));
            this.f29132u += b9;
            b(this.f29131n);
        }
    }

    public C2941aq() {
        this.f29131n = 64;
        this.f29132u = 5;
        this.f29134w = new ArrayDeque();
        this.f29135x = new ArrayDeque();
        this.f29136y = new ArrayDeque();
    }

    public C2941aq(int i) {
        this.f29133v = new C5019n(2);
        this.f29134w = new C5108e(0);
        this.f29135x = new HashMap();
        this.f29136y = new HashMap();
        this.f29131n = i;
    }
}
