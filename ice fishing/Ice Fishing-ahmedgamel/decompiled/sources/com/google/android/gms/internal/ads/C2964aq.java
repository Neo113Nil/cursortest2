package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import i1.C4586c;
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
import k1.C4639a;
import v7.AbstractC5119j;
import x1.C5185c;
import x1.C5187e;
import x1.C5188f;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2964aq implements InterfaceC3124dq {

    /* renamed from: n, reason: collision with root package name */
    public final int f29916n;

    /* renamed from: u, reason: collision with root package name */
    public int f29917u;

    /* renamed from: v, reason: collision with root package name */
    public Object f29918v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29919w;

    /* renamed from: x, reason: collision with root package name */
    public final Serializable f29920x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f29921y;

    public /* synthetic */ C2964aq(int i, int i4, WebView webView, String str, String str2, String str3) {
        this.f29918v = str;
        this.f29916n = i;
        this.f29919w = str2;
        this.f29921y = webView;
        this.f29920x = str3;
        this.f29917u = i4;
    }

    public static void j(C2964aq c2964aq, m8.m mVar, m8.m mVar2, int i) {
        C4586c c4586c;
        int i4 = 24;
        if ((i & 1) != 0) {
            mVar = null;
        }
        if ((i & 4) != 0) {
            mVar2 = null;
        }
        c2964aq.getClass();
        TimeZone timeZone = j8.d.f38495a;
        boolean isShutdown = ((ThreadPoolExecutor) c2964aq.d()).isShutdown();
        synchronized (c2964aq) {
            if (mVar2 != null) {
                try {
                    mVar2.f39531u.decrementAndGet();
                    if (!((ArrayDeque) c2964aq.f29920x).remove(mVar2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mVar != null) {
                ((ArrayDeque) c2964aq.f29919w).add(mVar);
                m8.m e9 = c2964aq.e(((i8.n) mVar.f39532v.f39545u.f40491u).f38281d);
                if (e9 != null) {
                    mVar.f39531u = e9.f39531u;
                }
            }
            if (mVar2 != null && (isShutdown || ((ArrayDeque) c2964aq.f29920x).isEmpty())) {
                ((ArrayDeque) c2964aq.f29921y).isEmpty();
            }
            if (isShutdown) {
                List J = AbstractC5119j.J((ArrayDeque) c2964aq.f29919w);
                ((ArrayDeque) c2964aq.f29919w).clear();
                c4586c = new C4586c(i4, J);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c2964aq.f29919w).iterator();
                kotlin.jvm.internal.h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    m8.m mVar3 = (m8.m) it.next();
                    if (((ArrayDeque) c2964aq.f29920x).size() >= c2964aq.f29916n) {
                        break;
                    }
                    if (mVar3.f39531u.get() < c2964aq.f29917u) {
                        it.remove();
                        mVar3.f39531u.incrementAndGet();
                        arrayList.add(mVar3);
                        ((ArrayDeque) c2964aq.f29920x).add(mVar3);
                    }
                }
                c4586c = new C4586c(i4, arrayList);
            }
        }
        int size = ((List) c4586c.f38154u).size();
        for (int i6 = 0; i6 < size; i6++) {
            m8.m mVar4 = (m8.m) ((List) c4586c.f38154u).get(i6);
            if (mVar4 != mVar) {
                m8.p pVar = mVar4.f39532v;
            }
            if (isShutdown) {
                mVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                mVar4.f39532v.l(interruptedIOException);
                ((M6.a) mVar4.f39530n.f2969u).accept(interruptedIOException);
            } else {
                ExecutorService d9 = c2964aq.d();
                mVar4.getClass();
                m8.p pVar2 = mVar4.f39532v;
                kotlin.jvm.internal.h.e(pVar2.f39544n.f38314a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) d9).execute(mVar4);
                    } catch (Throwable th2) {
                        C2964aq c2964aq2 = pVar2.f39544n.f38314a;
                        c2964aq2.getClass();
                        j(c2964aq2, null, mVar4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e10);
                    mVar4.f39532v.l(interruptedIOException2);
                    ((M6.a) mVar4.f39530n.f2969u).accept(interruptedIOException2);
                    C2964aq c2964aq3 = pVar2.f39544n.f38314a;
                    c2964aq3.getClass();
                    j(c2964aq3, null, mVar4, 3);
                }
            }
        }
    }

    public void a(int i, Class cls) {
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

    public void b(int i) {
        while (this.f29917u > i) {
            Object f2 = ((C4639a) this.f29918v).f();
            P1.g.b(f2);
            C5185c g9 = g(f2.getClass());
            this.f29917u -= g9.b() * g9.a(f2);
            a(g9.a(f2), f2.getClass());
            if (Log.isLoggable(g9.c(), 2)) {
                Log.v(g9.c(), "evicted: " + g9.a(f2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3124dq
    /* renamed from: c */
    public Object mo2c() {
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str = (String) this.f29918v;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        C3754pa c3754pa = new C3754pa("Google", str);
        EnumC2970aw k9 = C3495kl.k("javascript");
        int i = this.f29916n;
        Vv m9 = C3495kl.m(com.IceFishing.LiveIceFishing.k.b(i));
        EnumC2970aw enumC2970aw = EnumC2970aw.NONE;
        if (k9 == enumC2970aw) {
            int i4 = w2.z.f41712b;
            x2.i.f("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (m9 == null) {
            String B3 = com.IceFishing.LiveIceFishing.k.B(i);
            int i6 = w2.z.f41712b;
            x2.i.f("Omid html session error; Unable to parse creative type: ".concat(B3));
            return null;
        }
        String str2 = (String) this.f29919w;
        EnumC2970aw k10 = C3495kl.k(str2);
        if (m9 == Vv.VIDEO && k10 == enumC2970aw) {
            String valueOf = String.valueOf(str2);
            int i9 = w2.z.f41712b;
            x2.i.f("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf));
            return null;
        }
        C3 c32 = new C3(c3754pa, (WebView) this.f29921y, (String) this.f29920x, "", Tv.HTML);
        Xw c9 = Xw.c(m9, C3495kl.l(com.IceFishing.LiveIceFishing.k.c(this.f29917u)), k9, k10, true);
        if (MA.f27044E.f27915u) {
            return new C3232fq(new Uv(c9, c32, UUID.randomUUID().toString()), c32);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public synchronized ExecutorService d() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f29918v) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = j8.d.f38496b + " Dispatcher";
                kotlin.jvm.internal.h.e(name, "name");
                this.f29918v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new com.anythink.core.common.n.b.a.e(1, name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f29918v;
            kotlin.jvm.internal.h.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public m8.m e(String str) {
        Iterator it = ((ArrayDeque) this.f29920x).iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            m8.m mVar = (m8.m) it.next();
            if (kotlin.jvm.internal.h.a(((i8.n) mVar.f39532v.f39545u.f40491u).f38281d, str)) {
                return mVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f29919w).iterator();
        kotlin.jvm.internal.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            m8.m mVar2 = (m8.m) it2.next();
            if (kotlin.jvm.internal.h.a(((i8.n) mVar2.f39532v.f39545u.f40491u).f38281d, str)) {
                return mVar2;
            }
        }
        return null;
    }

    public synchronized Object f(int i, Class cls) {
        C5187e c5187e;
        int i4;
        try {
            Integer num = (Integer) i(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i4 = this.f29917u) != 0 && this.f29916n / i4 < 2 && num.intValue() > i * 8)) {
                C5188f c5188f = (C5188f) this.f29919w;
                x1.i iVar = (x1.i) ((ArrayDeque) c5188f.f67u).poll();
                if (iVar == null) {
                    iVar = c5188f.m();
                }
                c5187e = (C5187e) iVar;
                c5187e.f41820b = i;
                c5187e.f41821c = cls;
            }
            C5188f c5188f2 = (C5188f) this.f29919w;
            int intValue = num.intValue();
            x1.i iVar2 = (x1.i) ((ArrayDeque) c5188f2.f67u).poll();
            if (iVar2 == null) {
                iVar2 = c5188f2.m();
            }
            c5187e = (C5187e) iVar2;
            c5187e.f41820b = intValue;
            c5187e.f41821c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return h(c5187e, cls);
    }

    public C5185c g(Class cls) {
        C5185c c5185c;
        HashMap hashMap = (HashMap) this.f29921y;
        C5185c c5185c2 = (C5185c) hashMap.get(cls);
        if (c5185c2 != null) {
            return c5185c2;
        }
        if (cls.equals(int[].class)) {
            c5185c = new C5185c(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c5185c = new C5185c(0);
        }
        hashMap.put(cls, c5185c);
        return c5185c;
    }

    public Object h(C5187e c5187e, Class cls) {
        C5185c g9 = g(cls);
        Object a9 = ((C4639a) this.f29918v).a(c5187e);
        if (a9 != null) {
            this.f29917u -= g9.b() * g9.a(a9);
            a(g9.a(a9), cls);
        }
        if (a9 != null) {
            return a9;
        }
        if (Log.isLoggable(g9.c(), 2)) {
            Log.v(g9.c(), "Allocated " + c5187e.f41820b + " bytes");
        }
        int i = c5187e.f41820b;
        switch (g9.f41814a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap i(Class cls) {
        HashMap hashMap = (HashMap) this.f29920x;
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
        C5185c g9 = g(cls);
        int a9 = g9.a(obj);
        int b9 = g9.b() * a9;
        if (b9 <= this.f29916n / 2) {
            C5188f c5188f = (C5188f) this.f29919w;
            x1.i iVar = (x1.i) ((ArrayDeque) c5188f.f67u).poll();
            if (iVar == null) {
                iVar = c5188f.m();
            }
            C5187e c5187e = (C5187e) iVar;
            c5187e.f41820b = a9;
            c5187e.f41821c = cls;
            ((C4639a) this.f29918v).e(c5187e, obj);
            NavigableMap i = i(cls);
            Integer num = (Integer) i.get(Integer.valueOf(c5187e.f41820b));
            Integer valueOf = Integer.valueOf(c5187e.f41820b);
            int i4 = 1;
            if (num != null) {
                i4 = 1 + num.intValue();
            }
            i.put(valueOf, Integer.valueOf(i4));
            this.f29917u += b9;
            b(this.f29916n);
        }
    }

    public C2964aq() {
        this.f29916n = 64;
        this.f29917u = 5;
        this.f29919w = new ArrayDeque();
        this.f29920x = new ArrayDeque();
        this.f29921y = new ArrayDeque();
    }

    public C2964aq(int i) {
        this.f29918v = new C4639a(4);
        this.f29919w = new C5188f(0);
        this.f29920x = new HashMap();
        this.f29921y = new HashMap();
        this.f29916n = i;
    }
}
