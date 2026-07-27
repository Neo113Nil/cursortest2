package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
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
import r7.AbstractC4979j;
import v1.C5118b;
import v1.C5120d;
import v1.C5121e;

/* renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3112dq implements InterfaceC3222fq {

    /* renamed from: n, reason: collision with root package name */
    public final int f30232n;

    /* renamed from: u, reason: collision with root package name */
    public int f30233u;

    /* renamed from: v, reason: collision with root package name */
    public Object f30234v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f30235w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f30236x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f30237y;

    public /* synthetic */ C3112dq(int i, int i4, WebView webView, String str, String str2, String str3) {
        this.f30234v = str;
        this.f30232n = i;
        this.f30235w = str2;
        this.f30237y = webView;
        this.f30236x = str3;
        this.f30233u = i4;
    }

    public static void j(C3112dq c3112dq, i8.n nVar, i8.n nVar2, int i) {
        e8.k kVar;
        if ((i & 1) != 0) {
            nVar = null;
        }
        if ((i & 4) != 0) {
            nVar2 = null;
        }
        c3112dq.getClass();
        TimeZone timeZone = f8.d.f37815a;
        boolean isShutdown = ((ThreadPoolExecutor) c3112dq.d()).isShutdown();
        synchronized (c3112dq) {
            if (nVar2 != null) {
                try {
                    nVar2.f38386u.decrementAndGet();
                    if (!((ArrayDeque) c3112dq.f30236x).remove(nVar2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (nVar != null) {
                ((ArrayDeque) c3112dq.f30235w).add(nVar);
                i8.n e6 = c3112dq.e(((e8.o) nVar.f38387v.f38400u.f40101u).f37440d);
                if (e6 != null) {
                    nVar.f38386u = e6.f38386u;
                }
            }
            if (nVar2 != null && (isShutdown || ((ArrayDeque) c3112dq.f30236x).isEmpty())) {
                ((ArrayDeque) c3112dq.f30237y).isEmpty();
            }
            if (isShutdown) {
                List R8 = AbstractC4979j.R((ArrayDeque) c3112dq.f30235w);
                ((ArrayDeque) c3112dq.f30235w).clear();
                kVar = new e8.k(R8);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c3112dq.f30235w).iterator();
                kotlin.jvm.internal.h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    i8.n nVar3 = (i8.n) it.next();
                    if (((ArrayDeque) c3112dq.f30236x).size() >= c3112dq.f30232n) {
                        break;
                    }
                    if (nVar3.f38386u.get() < c3112dq.f30233u) {
                        it.remove();
                        nVar3.f38386u.incrementAndGet();
                        arrayList.add(nVar3);
                        ((ArrayDeque) c3112dq.f30236x).add(nVar3);
                    }
                }
                kVar = new e8.k(arrayList);
            }
        }
        int size = kVar.f37422a.size();
        for (int i4 = 0; i4 < size; i4++) {
            i8.n nVar4 = (i8.n) kVar.f37422a.get(i4);
            if (nVar4 != nVar) {
                i8.q qVar = nVar4.f38387v;
            }
            if (isShutdown) {
                nVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                nVar4.f38387v.l(interruptedIOException);
                ((I6.a) nVar4.f38385n.f2891u).accept(interruptedIOException);
            } else {
                ExecutorService d2 = c3112dq.d();
                nVar4.getClass();
                i8.q qVar2 = nVar4.f38387v;
                kotlin.jvm.internal.h.e(qVar2.f38399n.f37473a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) d2).execute(nVar4);
                    } catch (RejectedExecutionException e9) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e9);
                        nVar4.f38387v.l(interruptedIOException2);
                        ((I6.a) nVar4.f38385n.f2891u).accept(interruptedIOException2);
                        C3112dq c3112dq2 = qVar2.f38399n.f37473a;
                        c3112dq2.getClass();
                        j(c3112dq2, null, nVar4, 3);
                    }
                } catch (Throwable th2) {
                    C3112dq c3112dq3 = qVar2.f38399n.f37473a;
                    c3112dq3.getClass();
                    j(c3112dq3, null, nVar4, 3);
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3222fq
    public Object a() {
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str = (String) this.f30234v;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        C3582ma c3582ma = new C3582ma("Google", str, 3);
        EnumC3010bw m8 = C3431jl.m("javascript");
        int i = this.f30232n;
        Xv o9 = C3431jl.o(com.anythink.basead.b.c.i.b(i));
        EnumC3010bw enumC3010bw = EnumC3010bw.NONE;
        if (m8 == enumC3010bw) {
            int i4 = t2.C.f40822b;
            u2.i.f("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (o9 == null) {
            String z8 = com.anythink.basead.b.c.i.z(i);
            int i9 = t2.C.f40822b;
            u2.i.f("Omid html session error; Unable to parse creative type: ".concat(z8));
            return null;
        }
        String str2 = (String) this.f30235w;
        EnumC3010bw m9 = C3431jl.m(str2);
        if (o9 == Xv.VIDEO && m9 == enumC3010bw) {
            String valueOf = String.valueOf(str2);
            int i10 = t2.C.f40822b;
            u2.i.f("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf));
            return null;
        }
        A3 a32 = new A3(c3582ma, (WebView) this.f30237y, (String) this.f30236x, "", Vv.HTML);
        Zw a9 = Zw.a(o9, C3431jl.n(com.anythink.basead.b.c.i.c(this.f30233u)), m8, m9, true);
        if (AbstractC2655Lg.f26175K.f26640u) {
            return new C3330hq(new Wv(a9, a32, UUID.randomUUID().toString()), a32);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public void b(int i, Class cls) {
        NavigableMap i4 = i(cls);
        Integer num = (Integer) i4.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                i4.remove(Integer.valueOf(i));
                return;
            } else {
                i4.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        while (this.f30233u > i) {
            Object B8 = ((S0.c) this.f30234v).B();
            N1.g.b(B8);
            C5118b g9 = g(B8.getClass());
            this.f30233u -= g9.b() * g9.a(B8);
            b(g9.a(B8), B8.getClass());
            if (Log.isLoggable(g9.c(), 2)) {
                Log.v(g9.c(), "evicted: " + g9.a(B8));
            }
        }
    }

    public synchronized ExecutorService d() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f30234v) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = f8.d.f37816b + " Dispatcher";
                kotlin.jvm.internal.h.e(name, "name");
                this.f30234v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new com.anythink.core.common.n.b.a.e(1, name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f30234v;
            kotlin.jvm.internal.h.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public i8.n e(String str) {
        Iterator it = ((ArrayDeque) this.f30236x).iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            i8.n nVar = (i8.n) it.next();
            if (kotlin.jvm.internal.h.a(((e8.o) nVar.f38387v.f38400u.f40101u).f37440d, str)) {
                return nVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f30235w).iterator();
        kotlin.jvm.internal.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            i8.n nVar2 = (i8.n) it2.next();
            if (kotlin.jvm.internal.h.a(((e8.o) nVar2.f38387v.f38400u.f40101u).f37440d, str)) {
                return nVar2;
            }
        }
        return null;
    }

    public synchronized Object f(int i, Class cls) {
        C5120d c5120d;
        int i4;
        try {
            Integer num = (Integer) i(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i4 = this.f30233u) != 0 && this.f30232n / i4 < 2 && num.intValue() > i * 8)) {
                C5121e c5121e = (C5121e) this.f30235w;
                v1.g gVar = (v1.g) ((ArrayDeque) c5121e.f37200u).poll();
                if (gVar == null) {
                    gVar = c5121e.m();
                }
                c5120d = (C5120d) gVar;
                c5120d.f41336b = i;
                c5120d.f41337c = cls;
            }
            C5121e c5121e2 = (C5121e) this.f30235w;
            int intValue = num.intValue();
            v1.g gVar2 = (v1.g) ((ArrayDeque) c5121e2.f37200u).poll();
            if (gVar2 == null) {
                gVar2 = c5121e2.m();
            }
            c5120d = (C5120d) gVar2;
            c5120d.f41336b = intValue;
            c5120d.f41337c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return h(c5120d, cls);
    }

    public C5118b g(Class cls) {
        C5118b c5118b;
        HashMap hashMap = (HashMap) this.f30237y;
        C5118b c5118b2 = (C5118b) hashMap.get(cls);
        if (c5118b2 != null) {
            return c5118b2;
        }
        if (cls.equals(int[].class)) {
            c5118b = new C5118b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c5118b = new C5118b(0);
        }
        hashMap.put(cls, c5118b);
        return c5118b;
    }

    public Object h(C5120d c5120d, Class cls) {
        C5118b g9 = g(cls);
        Object u7 = ((S0.c) this.f30234v).u(c5120d);
        if (u7 != null) {
            this.f30233u -= g9.b() * g9.a(u7);
            b(g9.a(u7), cls);
        }
        if (u7 != null) {
            return u7;
        }
        if (Log.isLoggable(g9.c(), 2)) {
            Log.v(g9.c(), "Allocated " + c5120d.f41336b + " bytes");
        }
        int i = c5120d.f41336b;
        switch (g9.f41330a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap i(Class cls) {
        HashMap hashMap = (HashMap) this.f30236x;
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
        C5118b g9 = g(cls);
        int a9 = g9.a(obj);
        int b9 = g9.b() * a9;
        if (b9 <= this.f30232n / 2) {
            C5121e c5121e = (C5121e) this.f30235w;
            v1.g gVar = (v1.g) ((ArrayDeque) c5121e.f37200u).poll();
            if (gVar == null) {
                gVar = c5121e.m();
            }
            C5120d c5120d = (C5120d) gVar;
            c5120d.f41336b = a9;
            c5120d.f41337c = cls;
            ((S0.c) this.f30234v).A(c5120d, obj);
            NavigableMap i = i(cls);
            Integer num = (Integer) i.get(Integer.valueOf(c5120d.f41336b));
            Integer valueOf = Integer.valueOf(c5120d.f41336b);
            int i4 = 1;
            if (num != null) {
                i4 = 1 + num.intValue();
            }
            i.put(valueOf, Integer.valueOf(i4));
            this.f30233u += b9;
            c(this.f30232n);
        }
    }

    public C3112dq() {
        this.f30232n = 64;
        this.f30233u = 5;
        this.f30235w = new ArrayDeque();
        this.f30236x = new ArrayDeque();
        this.f30237y = new ArrayDeque();
    }

    public C3112dq(int i) {
        this.f30234v = new S0.c(19);
        this.f30235w = new C5121e(0);
        this.f30236x = new HashMap();
        this.f30237y = new HashMap();
        this.f30232n = i;
    }
}
