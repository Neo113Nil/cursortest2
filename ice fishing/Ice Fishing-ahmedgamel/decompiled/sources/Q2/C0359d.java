package Q2;

import R2.C0385k;
import R2.C0386l;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359d implements Handler.Callback {

    /* renamed from: H, reason: collision with root package name */
    public static final Status f2545H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: I, reason: collision with root package name */
    public static final Status f2546I = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object J = new Object();

    /* renamed from: K, reason: collision with root package name */
    public static C0359d f2547K;

    /* renamed from: A, reason: collision with root package name */
    public final AtomicInteger f2548A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicInteger f2549B;

    /* renamed from: C, reason: collision with root package name */
    public final ConcurrentHashMap f2550C;

    /* renamed from: D, reason: collision with root package name */
    public final s.c f2551D;

    /* renamed from: E, reason: collision with root package name */
    public final s.c f2552E;

    /* renamed from: F, reason: collision with root package name */
    public final c3.e f2553F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f2554G;

    /* renamed from: n, reason: collision with root package name */
    public long f2555n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2556u;

    /* renamed from: v, reason: collision with root package name */
    public R2.n f2557v;

    /* renamed from: w, reason: collision with root package name */
    public T2.c f2558w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f2559x;

    /* renamed from: y, reason: collision with root package name */
    public final O2.e f2560y;

    /* renamed from: z, reason: collision with root package name */
    public final S0.e f2561z;

    public C0359d(Context context, Looper looper) {
        O2.e eVar = O2.e.f2268d;
        this.f2555n = 10000L;
        this.f2556u = false;
        this.f2548A = new AtomicInteger(1);
        this.f2549B = new AtomicInteger(0);
        this.f2550C = new ConcurrentHashMap(5, 0.75f, 1);
        this.f2551D = new s.c(0);
        this.f2552E = new s.c(0);
        this.f2554G = true;
        this.f2559x = context;
        c3.e eVar2 = new c3.e(looper, this, 0);
        this.f2553F = eVar2;
        this.f2560y = eVar;
        this.f2561z = new S0.e(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (V2.b.f3400g == null) {
            V2.b.f3400g = Boolean.valueOf(V2.b.f() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (V2.b.f3400g.booleanValue()) {
            this.f2554G = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(C0356a c0356a, O2.b bVar) {
        String str = c0356a.f2537b.f2382c;
        String valueOf = String.valueOf(bVar);
        return new Status(17, com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), bVar.f2257v, bVar);
    }

    public static C0359d e(Context context) {
        C0359d c0359d;
        HandlerThread handlerThread;
        synchronized (J) {
            if (f2547K == null) {
                synchronized (R2.I.f2762g) {
                    try {
                        handlerThread = R2.I.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            R2.I.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = R2.I.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = O2.e.f2267c;
                f2547K = new C0359d(applicationContext, looper);
            }
            c0359d = f2547K;
        }
        return c0359d;
    }

    public final boolean a() {
        if (this.f2556u) {
            return false;
        }
        R2.m mVar = (R2.m) C0386l.a().f2836n;
        if (mVar != null && !mVar.f2838u) {
            return false;
        }
        int i = ((SparseIntArray) this.f2561z.f2908u).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(O2.b bVar, int i) {
        PendingIntent pendingIntent;
        O2.e eVar = this.f2560y;
        eVar.getClass();
        Context context = this.f2559x;
        if (!X2.a.m(context)) {
            boolean a9 = bVar.a();
            int i4 = bVar.f2256u;
            if (a9) {
                pendingIntent = bVar.f2257v;
            } else {
                pendingIntent = null;
                Intent b9 = eVar.b(context, null, i4);
                if (b9 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b9, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i6 = GoogleApiActivity.f24390u;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i4, PendingIntent.getActivity(context, 0, intent, c3.d.f5727a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final C d(P2.h hVar) {
        C0356a c0356a = hVar.f2391x;
        ConcurrentHashMap concurrentHashMap = this.f2550C;
        C c9 = (C) concurrentHashMap.get(c0356a);
        if (c9 == null) {
            c9 = new C(this, hVar);
            concurrentHashMap.put(c0356a, c9);
        }
        if (c9.f2490u.m()) {
            this.f2552E.add(c0356a);
        }
        c9.j();
        return c9;
    }

    public final void f(O2.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        c3.e eVar = this.f2553F;
        eVar.sendMessage(eVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04e8 A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        C c9;
        boolean z6;
        boolean isIsolated;
        O2.d[] b9;
        boolean z9;
        int i = 13;
        int i4 = message.what;
        c3.e eVar = this.f2553F;
        ConcurrentHashMap concurrentHashMap = this.f2550C;
        switch (i4) {
            case 1:
                this.f2555n = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (C0356a) it.next()), this.f2555n);
                }
                return true;
            case 2:
                throw D.x.h(message.obj);
            case 3:
                for (C c10 : concurrentHashMap.values()) {
                    R2.w.c(c10.f2488F.f2553F);
                    c10.f2486D = null;
                    c10.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                M m9 = (M) message.obj;
                C c11 = (C) concurrentHashMap.get(m9.f2518c.f2391x);
                if (c11 == null) {
                    c11 = d(m9.f2518c);
                }
                boolean m10 = c11.f2490u.m();
                O o4 = m9.f2516a;
                if (!m10 || this.f2549B.get() == m9.f2517b) {
                    c11.k(o4);
                    return true;
                }
                o4.c(f2545H);
                c11.m();
                return true;
            case 5:
                int i6 = message.arg1;
                O2.b bVar = (O2.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c9 = (C) it2.next();
                        if (c9.f2495z == i6) {
                        }
                    } else {
                        c9 = null;
                    }
                }
                if (c9 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i6);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i9 = bVar.f2256u;
                if (i9 != 13) {
                    c9.b(c(c9.f2491v, bVar));
                    return true;
                }
                this.f2560y.getClass();
                AtomicBoolean atomicBoolean = O2.h.f2271a;
                String c12 = O2.b.c(i9);
                int length = String.valueOf(c12).length();
                String str = bVar.f2258w;
                c9.b(new Status(17, com.IceFishing.LiveIceFishing.k.r(new StringBuilder(length + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", c12, ": ", str), null, null));
                return true;
            case 6:
                Context context = this.f2559x;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0358c.a((Application) context.getApplicationContext());
                    ComponentCallbacks2C0358c componentCallbacks2C0358c = ComponentCallbacks2C0358c.f2540x;
                    B b10 = new B(this);
                    componentCallbacks2C0358c.getClass();
                    synchronized (componentCallbacks2C0358c) {
                        componentCallbacks2C0358c.f2543v.add(b10);
                    }
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0358c.f2542u;
                    boolean z10 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0358c.f2541n;
                    if (!z10) {
                        Boolean bool = V2.b.f3403k;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", new Class[0]).invoke(null, new Object[0]);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new B0.c(X2.a.r("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            V2.b.f3403k = bool;
                        }
                        if (bool.booleanValue()) {
                            z6 = true;
                            if (!z6) {
                                this.f2555n = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean3.set(true);
                            }
                        }
                    }
                    z6 = atomicBoolean3.get();
                    if (!z6) {
                    }
                }
                return true;
            case 7:
                d((P2.h) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C c13 = (C) concurrentHashMap.get(message.obj);
                R2.w.c(c13.f2488F.f2553F);
                if (!c13.f2484B) {
                    return true;
                }
                c13.j();
                return true;
            case 10:
                s.c cVar = this.f2552E;
                Iterator it3 = cVar.iterator();
                while (true) {
                    s.f fVar = (s.f) it3;
                    if (!fVar.hasNext()) {
                        cVar.clear();
                        return true;
                    }
                    C c14 = (C) concurrentHashMap.remove((C0356a) fVar.next());
                    if (c14 != null) {
                        c14.m();
                    }
                }
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C c15 = (C) concurrentHashMap.get(message.obj);
                C0359d c0359d = c15.f2488F;
                R2.w.c(c0359d.f2553F);
                boolean z11 = c15.f2484B;
                if (!z11) {
                    return true;
                }
                if (z11) {
                    C0359d c0359d2 = c15.f2488F;
                    c3.e eVar2 = c0359d2.f2553F;
                    C0356a c0356a = c15.f2491v;
                    eVar2.removeMessages(11, c0356a);
                    c0359d2.f2553F.removeMessages(9, c0356a);
                    c15.f2484B = false;
                }
                c15.b(c0359d.f2560y.c(c0359d.f2559x, O2.f.f2269a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                c15.f2490u.b("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C c16 = (C) concurrentHashMap.get(message.obj);
                R2.w.c(c16.f2488F.f2553F);
                P2.c cVar2 = c16.f2490u;
                if (!cVar2.h() || c16.f2494y.size() != 0) {
                    return true;
                }
                S0.s sVar = c16.f2492w;
                if (((Map) sVar.f2969u).isEmpty() && ((Map) sVar.f2970v).isEmpty()) {
                    cVar2.b("Timing out service connection.");
                    return true;
                }
                c16.g();
                return true;
            case 14:
                throw D.x.h(message.obj);
            case 15:
                D d9 = (D) message.obj;
                if (!concurrentHashMap.containsKey(d9.f2496a)) {
                    return true;
                }
                C c17 = (C) concurrentHashMap.get(d9.f2496a);
                if (!c17.f2485C.contains(d9) || c17.f2484B) {
                    return true;
                }
                if (c17.f2490u.h()) {
                    c17.d();
                    return true;
                }
                c17.j();
                return true;
            case 16:
                D d10 = (D) message.obj;
                if (!concurrentHashMap.containsKey(d10.f2496a)) {
                    return true;
                }
                C c18 = (C) concurrentHashMap.get(d10.f2496a);
                if (!c18.f2485C.remove(d10)) {
                    return true;
                }
                C0359d c0359d3 = c18.f2488F;
                c0359d3.f2553F.removeMessages(15, d10);
                c0359d3.f2553F.removeMessages(16, d10);
                LinkedList linkedList = c18.f2489n;
                ArrayList arrayList = new ArrayList(linkedList.size());
                Iterator it4 = linkedList.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    O2.d dVar = d10.f2497b;
                    if (!hasNext) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            I i11 = (I) arrayList.get(i10);
                            linkedList.remove(i11);
                            i11.d(new P2.l(dVar));
                        }
                        return true;
                    }
                    I i12 = (I) it4.next();
                    if ((i12 instanceof I) && (b9 = i12.b(c18)) != null) {
                        int length2 = b9.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length2) {
                                break;
                            }
                            if (!R2.w.l(b9[i13], dVar)) {
                                i13++;
                            } else if (i13 >= 0) {
                                arrayList.add(i12);
                            }
                        }
                    }
                }
                break;
            case 17:
                R2.n nVar = this.f2557v;
                if (nVar == null) {
                    return true;
                }
                if (nVar.f2842n > 0 || a()) {
                    if (this.f2558w == null) {
                        this.f2558w = new T2.c(this.f2559x, T2.c.f3160B, R2.o.f2844b, P2.g.f2384b);
                    }
                    T2.c cVar3 = this.f2558w;
                    cVar3.getClass();
                    H3.e eVar3 = new H3.e();
                    eVar3.f1246c = 0;
                    O2.d[] dVarArr = {c3.c.f5725a};
                    eVar3.f1248e = dVarArr;
                    eVar3.f1245b = false;
                    eVar3.f1247d = new I0.j(i, nVar);
                    cVar3.b(2, new H3.e(eVar3, dVarArr, false, 0));
                }
                this.f2557v = null;
                return true;
            case 18:
                L l9 = (L) message.obj;
                long j6 = l9.f2514c;
                C0385k c0385k = l9.f2512a;
                int i14 = l9.f2513b;
                if (j6 == 0) {
                    R2.n nVar2 = new R2.n(i14, Arrays.asList(c0385k));
                    if (this.f2558w == null) {
                        this.f2558w = new T2.c(this.f2559x, T2.c.f3160B, R2.o.f2844b, P2.g.f2384b);
                    }
                    T2.c cVar4 = this.f2558w;
                    cVar4.getClass();
                    H3.e eVar4 = new H3.e();
                    eVar4.f1246c = 0;
                    O2.d[] dVarArr2 = {c3.c.f5725a};
                    eVar4.f1248e = dVarArr2;
                    eVar4.f1245b = false;
                    eVar4.f1247d = new I0.j(i, nVar2);
                    cVar4.b(2, new H3.e(eVar4, dVarArr2, false, 0));
                    return true;
                }
                R2.n nVar3 = this.f2557v;
                if (nVar3 != null) {
                    List list = nVar3.f2843u;
                    if (nVar3.f2842n != i14 || (list != null && list.size() >= l9.f2515d)) {
                        eVar.removeMessages(17);
                        R2.n nVar4 = this.f2557v;
                        if (nVar4 != null) {
                            if (nVar4.f2842n > 0 || a()) {
                                if (this.f2558w == null) {
                                    z9 = true;
                                    this.f2558w = new T2.c(this.f2559x, T2.c.f3160B, R2.o.f2844b, P2.g.f2384b);
                                } else {
                                    z9 = true;
                                }
                                T2.c cVar5 = this.f2558w;
                                cVar5.getClass();
                                H3.e eVar5 = new H3.e();
                                eVar5.f1246c = 0;
                                O2.d[] dVarArr3 = {c3.c.f5725a};
                                eVar5.f1248e = dVarArr3;
                                eVar5.f1245b = false;
                                eVar5.f1247d = new I0.j(i, nVar4);
                                cVar5.b(2, new H3.e(eVar5, dVarArr3, false, 0));
                            } else {
                                z9 = true;
                            }
                            this.f2557v = null;
                            if (this.f2557v == null) {
                                return z9;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c0385k);
                            this.f2557v = new R2.n(i14, arrayList2);
                            eVar.sendMessageDelayed(eVar.obtainMessage(17), l9.f2514c);
                            return z9;
                        }
                    } else {
                        R2.n nVar5 = this.f2557v;
                        if (nVar5.f2843u == null) {
                            nVar5.f2843u = new ArrayList();
                        }
                        nVar5.f2843u.add(c0385k);
                    }
                }
                z9 = true;
                if (this.f2557v == null) {
                }
                break;
            case 19:
                this.f2556u = false;
                return true;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown message id: ");
                sb2.append(i4);
                Log.w("GoogleApiManager", sb2.toString());
                return false;
        }
    }
}
