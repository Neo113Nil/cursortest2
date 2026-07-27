package N2;

import O2.C0374k;
import O2.C0375l;
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

/* renamed from: N2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318d implements Handler.Callback {

    /* renamed from: H, reason: collision with root package name */
    public static final Status f2044H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: I, reason: collision with root package name */
    public static final Status f2045I = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object J = new Object();

    /* renamed from: K, reason: collision with root package name */
    public static C0318d f2046K;

    /* renamed from: A, reason: collision with root package name */
    public final AtomicInteger f2047A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicInteger f2048B;

    /* renamed from: C, reason: collision with root package name */
    public final ConcurrentHashMap f2049C;

    /* renamed from: D, reason: collision with root package name */
    public final s.c f2050D;

    /* renamed from: E, reason: collision with root package name */
    public final s.c f2051E;

    /* renamed from: F, reason: collision with root package name */
    public final Z2.e f2052F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f2053G;

    /* renamed from: n, reason: collision with root package name */
    public long f2054n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2055u;

    /* renamed from: v, reason: collision with root package name */
    public O2.n f2056v;

    /* renamed from: w, reason: collision with root package name */
    public Q2.c f2057w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f2058x;

    /* renamed from: y, reason: collision with root package name */
    public final L2.e f2059y;

    /* renamed from: z, reason: collision with root package name */
    public final S0.c f2060z;

    public C0318d(Context context, Looper looper) {
        L2.e eVar = L2.e.f1724d;
        this.f2054n = 10000L;
        this.f2055u = false;
        this.f2047A = new AtomicInteger(1);
        this.f2048B = new AtomicInteger(0);
        this.f2049C = new ConcurrentHashMap(5, 0.75f, 1);
        this.f2050D = new s.c(0);
        this.f2051E = new s.c(0);
        this.f2053G = true;
        this.f2058x = context;
        Z2.e eVar2 = new Z2.e(looper, this, 0);
        this.f2052F = eVar2;
        this.f2059y = eVar;
        this.f2060z = new S0.c(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (S2.b.f2970g == null) {
            S2.b.f2970g = Boolean.valueOf(S2.b.f() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (S2.b.f2970g.booleanValue()) {
            this.f2053G = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(C0315a c0315a, L2.b bVar) {
        String str = c0315a.f2036b.f1883c;
        String valueOf = String.valueOf(bVar);
        return new Status(17, com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), bVar.f1713v, bVar);
    }

    public static C0318d e(Context context) {
        C0318d c0318d;
        HandlerThread handlerThread;
        synchronized (J) {
            if (f2046K == null) {
                synchronized (O2.I.f2369g) {
                    try {
                        handlerThread = O2.I.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            O2.I.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = O2.I.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = L2.e.f1723c;
                f2046K = new C0318d(applicationContext, looper);
            }
            c0318d = f2046K;
        }
        return c0318d;
    }

    public final boolean a() {
        if (this.f2055u) {
            return false;
        }
        O2.m mVar = (O2.m) C0375l.a().f2443n;
        if (mVar != null && !mVar.f2445u) {
            return false;
        }
        int i = ((SparseIntArray) this.f2060z.f2886u).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(L2.b bVar, int i) {
        PendingIntent pendingIntent;
        L2.e eVar = this.f2059y;
        eVar.getClass();
        Context context = this.f2058x;
        if (!U2.a.l(context)) {
            boolean a9 = bVar.a();
            int i4 = bVar.f1712u;
            if (a9) {
                pendingIntent = bVar.f1713v;
            } else {
                pendingIntent = null;
                Intent b9 = eVar.b(context, null, i4);
                if (b9 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b9, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i9 = GoogleApiActivity.f23763u;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i4, PendingIntent.getActivity(context, 0, intent, Z2.d.f4248a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final C d(M2.h hVar) {
        C0315a c0315a = hVar.f1892x;
        ConcurrentHashMap concurrentHashMap = this.f2049C;
        C c4 = (C) concurrentHashMap.get(c0315a);
        if (c4 == null) {
            c4 = new C(this, hVar);
            concurrentHashMap.put(c0315a, c4);
        }
        if (c4.f1989u.n()) {
            this.f2051E.add(c0315a);
        }
        c4.j();
        return c4;
    }

    public final void f(L2.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        Z2.e eVar = this.f2052F;
        eVar.sendMessage(eVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04e8 A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        C c4;
        boolean z8;
        boolean isIsolated;
        L2.d[] b9;
        boolean z9;
        int i = 11;
        int i4 = message.what;
        Z2.e eVar = this.f2052F;
        ConcurrentHashMap concurrentHashMap = this.f2049C;
        switch (i4) {
            case 1:
                this.f2054n = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (C0315a) it.next()), this.f2054n);
                }
                return true;
            case 2:
                throw D.y.g(message.obj);
            case 3:
                for (C c9 : concurrentHashMap.values()) {
                    O2.w.c(c9.f1987F.f2052F);
                    c9.f1985D = null;
                    c9.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                M m8 = (M) message.obj;
                C c10 = (C) concurrentHashMap.get(m8.f2017c.f1892x);
                if (c10 == null) {
                    c10 = d(m8.f2017c);
                }
                boolean n9 = c10.f1989u.n();
                O o9 = m8.f2015a;
                if (!n9 || this.f2048B.get() == m8.f2016b) {
                    c10.k(o9);
                    return true;
                }
                o9.c(f2044H);
                c10.m();
                return true;
            case 5:
                int i9 = message.arg1;
                L2.b bVar = (L2.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c4 = (C) it2.next();
                        if (c4.f1994z == i9) {
                        }
                    } else {
                        c4 = null;
                    }
                }
                if (c4 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i9);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i10 = bVar.f1712u;
                if (i10 != 13) {
                    c4.b(c(c4.f1990v, bVar));
                    return true;
                }
                this.f2059y.getClass();
                AtomicBoolean atomicBoolean = L2.h.f1727a;
                String c11 = L2.b.c(i10);
                int length = String.valueOf(c11).length();
                String str = bVar.f1714w;
                c4.b(new Status(17, com.anythink.basead.b.c.i.q(new StringBuilder(length + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", c11, ": ", str), null, null));
                return true;
            case 6:
                Context context = this.f2058x;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0317c.a((Application) context.getApplicationContext());
                    ComponentCallbacks2C0317c componentCallbacks2C0317c = ComponentCallbacks2C0317c.f2039x;
                    B b10 = new B(this);
                    componentCallbacks2C0317c.getClass();
                    synchronized (componentCallbacks2C0317c) {
                        componentCallbacks2C0317c.f2042v.add(b10);
                    }
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0317c.f2041u;
                    boolean z10 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0317c.f2040n;
                    if (!z10) {
                        Boolean bool = S2.b.f2973k;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", new Class[0]).invoke(null, new Object[0]);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new B0.c(com.bumptech.glide.h.D("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            S2.b.f2973k = bool;
                        }
                        if (bool.booleanValue()) {
                            z8 = true;
                            if (!z8) {
                                this.f2054n = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean3.set(true);
                            }
                        }
                    }
                    z8 = atomicBoolean3.get();
                    if (!z8) {
                    }
                }
                return true;
            case 7:
                d((M2.h) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C c12 = (C) concurrentHashMap.get(message.obj);
                O2.w.c(c12.f1987F.f2052F);
                if (!c12.f1983B) {
                    return true;
                }
                c12.j();
                return true;
            case 10:
                s.c cVar = this.f2051E;
                Iterator it3 = cVar.iterator();
                while (true) {
                    s.f fVar = (s.f) it3;
                    if (!fVar.hasNext()) {
                        cVar.clear();
                        return true;
                    }
                    C c13 = (C) concurrentHashMap.remove((C0315a) fVar.next());
                    if (c13 != null) {
                        c13.m();
                    }
                }
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C c14 = (C) concurrentHashMap.get(message.obj);
                C0318d c0318d = c14.f1987F;
                O2.w.c(c0318d.f2052F);
                boolean z11 = c14.f1983B;
                if (!z11) {
                    return true;
                }
                if (z11) {
                    C0318d c0318d2 = c14.f1987F;
                    Z2.e eVar2 = c0318d2.f2052F;
                    C0315a c0315a = c14.f1990v;
                    eVar2.removeMessages(11, c0315a);
                    c0318d2.f2052F.removeMessages(9, c0315a);
                    c14.f1983B = false;
                }
                c14.b(c0318d.f2059y.c(c0318d.f2058x, L2.f.f1725a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                c14.f1989u.c("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C c15 = (C) concurrentHashMap.get(message.obj);
                O2.w.c(c15.f1987F.f2052F);
                M2.c cVar2 = c15.f1989u;
                if (!cVar2.j() || c15.f1993y.size() != 0) {
                    return true;
                }
                S0.c cVar3 = c15.f1991w;
                if (((Map) cVar3.f2886u).isEmpty() && ((Map) cVar3.f2887v).isEmpty()) {
                    cVar2.c("Timing out service connection.");
                    return true;
                }
                c15.g();
                return true;
            case 14:
                throw D.y.g(message.obj);
            case 15:
                D d2 = (D) message.obj;
                if (!concurrentHashMap.containsKey(d2.f1995a)) {
                    return true;
                }
                C c16 = (C) concurrentHashMap.get(d2.f1995a);
                if (!c16.f1984C.contains(d2) || c16.f1983B) {
                    return true;
                }
                if (c16.f1989u.j()) {
                    c16.d();
                    return true;
                }
                c16.j();
                return true;
            case 16:
                D d3 = (D) message.obj;
                if (!concurrentHashMap.containsKey(d3.f1995a)) {
                    return true;
                }
                C c17 = (C) concurrentHashMap.get(d3.f1995a);
                if (!c17.f1984C.remove(d3)) {
                    return true;
                }
                C0318d c0318d3 = c17.f1987F;
                c0318d3.f2052F.removeMessages(15, d3);
                c0318d3.f2052F.removeMessages(16, d3);
                LinkedList linkedList = c17.f1988n;
                ArrayList arrayList = new ArrayList(linkedList.size());
                Iterator it4 = linkedList.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    L2.d dVar = d3.f1996b;
                    if (!hasNext) {
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            I i12 = (I) arrayList.get(i11);
                            linkedList.remove(i12);
                            i12.d(new M2.l(dVar));
                        }
                        return true;
                    }
                    I i13 = (I) it4.next();
                    if ((i13 instanceof I) && (b9 = i13.b(c17)) != null) {
                        int length2 = b9.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                break;
                            }
                            if (!O2.w.l(b9[i14], dVar)) {
                                i14++;
                            } else if (i14 >= 0) {
                                arrayList.add(i13);
                            }
                        }
                    }
                }
                break;
            case 17:
                O2.n nVar = this.f2056v;
                if (nVar == null) {
                    return true;
                }
                if (nVar.f2449n > 0 || a()) {
                    if (this.f2057w == null) {
                        this.f2057w = new Q2.c(this.f2058x, Q2.c.f2715B, O2.o.f2451b, M2.g.f1885b);
                    }
                    Q2.c cVar4 = this.f2057w;
                    cVar4.getClass();
                    D3.f fVar2 = new D3.f();
                    fVar2.f697c = 0;
                    L2.d[] dVarArr = {Z2.c.f4246a};
                    fVar2.f699e = dVarArr;
                    fVar2.f696b = false;
                    fVar2.f698d = new h4.c(i, nVar);
                    cVar4.c(2, new D3.f(fVar2, dVarArr, false, 0));
                }
                this.f2056v = null;
                return true;
            case 18:
                L l9 = (L) message.obj;
                long j9 = l9.f2013c;
                C0374k c0374k = l9.f2011a;
                int i15 = l9.f2012b;
                if (j9 == 0) {
                    O2.n nVar2 = new O2.n(i15, Arrays.asList(c0374k));
                    if (this.f2057w == null) {
                        this.f2057w = new Q2.c(this.f2058x, Q2.c.f2715B, O2.o.f2451b, M2.g.f1885b);
                    }
                    Q2.c cVar5 = this.f2057w;
                    cVar5.getClass();
                    D3.f fVar3 = new D3.f();
                    fVar3.f697c = 0;
                    L2.d[] dVarArr2 = {Z2.c.f4246a};
                    fVar3.f699e = dVarArr2;
                    fVar3.f696b = false;
                    fVar3.f698d = new h4.c(i, nVar2);
                    cVar5.c(2, new D3.f(fVar3, dVarArr2, false, 0));
                    return true;
                }
                O2.n nVar3 = this.f2056v;
                if (nVar3 != null) {
                    List list = nVar3.f2450u;
                    if (nVar3.f2449n != i15 || (list != null && list.size() >= l9.f2014d)) {
                        eVar.removeMessages(17);
                        O2.n nVar4 = this.f2056v;
                        if (nVar4 != null) {
                            if (nVar4.f2449n > 0 || a()) {
                                if (this.f2057w == null) {
                                    z9 = true;
                                    this.f2057w = new Q2.c(this.f2058x, Q2.c.f2715B, O2.o.f2451b, M2.g.f1885b);
                                } else {
                                    z9 = true;
                                }
                                Q2.c cVar6 = this.f2057w;
                                cVar6.getClass();
                                D3.f fVar4 = new D3.f();
                                fVar4.f697c = 0;
                                L2.d[] dVarArr3 = {Z2.c.f4246a};
                                fVar4.f699e = dVarArr3;
                                fVar4.f696b = false;
                                fVar4.f698d = new h4.c(i, nVar4);
                                cVar6.c(2, new D3.f(fVar4, dVarArr3, false, 0));
                            } else {
                                z9 = true;
                            }
                            this.f2056v = null;
                            if (this.f2056v == null) {
                                return z9;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c0374k);
                            this.f2056v = new O2.n(i15, arrayList2);
                            eVar.sendMessageDelayed(eVar.obtainMessage(17), l9.f2013c);
                            return z9;
                        }
                    } else {
                        O2.n nVar5 = this.f2056v;
                        if (nVar5.f2450u == null) {
                            nVar5.f2450u = new ArrayList();
                        }
                        nVar5.f2450u.add(c0374k);
                    }
                }
                z9 = true;
                if (this.f2056v == null) {
                }
                break;
            case 19:
                this.f2055u = false;
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
