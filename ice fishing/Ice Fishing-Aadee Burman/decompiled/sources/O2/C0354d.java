package O2;

import P2.C0381k;
import P2.C0382l;
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
import g1.C4523c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: O2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354d implements Handler.Callback {

    /* renamed from: H, reason: collision with root package name */
    public static final Status f2227H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: I, reason: collision with root package name */
    public static final Status f2228I = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object J = new Object();

    /* renamed from: K, reason: collision with root package name */
    public static C0354d f2229K;

    /* renamed from: A, reason: collision with root package name */
    public final AtomicInteger f2230A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicInteger f2231B;

    /* renamed from: C, reason: collision with root package name */
    public final ConcurrentHashMap f2232C;

    /* renamed from: D, reason: collision with root package name */
    public final s.c f2233D;

    /* renamed from: E, reason: collision with root package name */
    public final s.c f2234E;

    /* renamed from: F, reason: collision with root package name */
    public final a3.e f2235F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f2236G;

    /* renamed from: n, reason: collision with root package name */
    public long f2237n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2238u;

    /* renamed from: v, reason: collision with root package name */
    public P2.n f2239v;

    /* renamed from: w, reason: collision with root package name */
    public R2.c f2240w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f2241x;

    /* renamed from: y, reason: collision with root package name */
    public final M2.e f2242y;

    /* renamed from: z, reason: collision with root package name */
    public final S0.c f2243z;

    public C0354d(Context context, Looper looper) {
        M2.e eVar = M2.e.f1842d;
        this.f2237n = 10000L;
        this.f2238u = false;
        this.f2230A = new AtomicInteger(1);
        this.f2231B = new AtomicInteger(0);
        this.f2232C = new ConcurrentHashMap(5, 0.75f, 1);
        this.f2233D = new s.c(0);
        this.f2234E = new s.c(0);
        this.f2236G = true;
        this.f2241x = context;
        a3.e eVar2 = new a3.e(looper, this, 0);
        this.f2235F = eVar2;
        this.f2242y = eVar;
        this.f2243z = new S0.c(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (T2.b.f3084g == null) {
            T2.b.f3084g = Boolean.valueOf(T2.b.f() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (T2.b.f3084g.booleanValue()) {
            this.f2236G = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(C0351a c0351a, M2.b bVar) {
        String str = c0351a.f2219b.f1938c;
        String valueOf = String.valueOf(bVar);
        return new Status(17, com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), bVar.f1831v, bVar);
    }

    public static C0354d e(Context context) {
        C0354d c0354d;
        HandlerThread handlerThread;
        synchronized (J) {
            if (f2229K == null) {
                synchronized (P2.I.f2441g) {
                    try {
                        handlerThread = P2.I.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            P2.I.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = P2.I.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = M2.e.f1841c;
                f2229K = new C0354d(applicationContext, looper);
            }
            c0354d = f2229K;
        }
        return c0354d;
    }

    public final boolean a() {
        if (this.f2238u) {
            return false;
        }
        P2.m mVar = (P2.m) C0382l.a().f2515n;
        if (mVar != null && !mVar.f2517u) {
            return false;
        }
        int i = ((SparseIntArray) this.f2243z.f2775u).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(M2.b bVar, int i) {
        PendingIntent pendingIntent;
        M2.e eVar = this.f2242y;
        eVar.getClass();
        Context context = this.f2241x;
        if (!V2.a.q(context)) {
            boolean a9 = bVar.a();
            int i6 = bVar.f1830u;
            if (a9) {
                pendingIntent = bVar.f1831v;
            } else {
                pendingIntent = null;
                Intent b9 = eVar.b(context, null, i6);
                if (b9 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b9, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i9 = GoogleApiActivity.f23610u;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i6, PendingIntent.getActivity(context, 0, intent, a3.d.f4334a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final D d(N2.h hVar) {
        C0351a c0351a = hVar.f1947x;
        ConcurrentHashMap concurrentHashMap = this.f2232C;
        D d2 = (D) concurrentHashMap.get(c0351a);
        if (d2 == null) {
            d2 = new D(this, hVar);
            concurrentHashMap.put(c0351a, d2);
        }
        if (d2.f2172u.m()) {
            this.f2234E.add(c0351a);
        }
        d2.j();
        return d2;
    }

    public final void f(M2.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        a3.e eVar = this.f2235F;
        eVar.sendMessage(eVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x04e6 A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        D d2;
        boolean z3;
        boolean isIsolated;
        M2.d[] b9;
        boolean z6;
        int i = 10;
        int i6 = message.what;
        a3.e eVar = this.f2235F;
        ConcurrentHashMap concurrentHashMap = this.f2232C;
        switch (i6) {
            case 1:
                this.f2237n = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (C0351a) it.next()), this.f2237n);
                }
                return true;
            case 2:
                throw D.y.i(message.obj);
            case 3:
                for (D d9 : concurrentHashMap.values()) {
                    P2.w.c(d9.f2170F.f2235F);
                    d9.f2168D = null;
                    d9.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                N n9 = (N) message.obj;
                D d10 = (D) concurrentHashMap.get(n9.f2200c.f1947x);
                if (d10 == null) {
                    d10 = d(n9.f2200c);
                }
                boolean m4 = d10.f2172u.m();
                P p9 = n9.f2198a;
                if (!m4 || this.f2231B.get() == n9.f2199b) {
                    d10.k(p9);
                    return true;
                }
                p9.c(f2227H);
                d10.m();
                return true;
            case 5:
                int i9 = message.arg1;
                M2.b bVar = (M2.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        d2 = (D) it2.next();
                        if (d2.f2177z == i9) {
                        }
                    } else {
                        d2 = null;
                    }
                }
                if (d2 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i9);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i10 = bVar.f1830u;
                if (i10 != 13) {
                    d2.b(c(d2.f2173v, bVar));
                    return true;
                }
                this.f2242y.getClass();
                int i11 = M2.h.f1847c;
                String c9 = M2.b.c(i10);
                int length = String.valueOf(c9).length();
                String str = bVar.f1832w;
                d2.b(new Status(17, com.anythink.basead.exoplayer.f.f.o(new StringBuilder(length + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", c9, ": ", str), null, null));
                return true;
            case 6:
                Context context = this.f2241x;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0353c.a((Application) context.getApplicationContext());
                    ComponentCallbacks2C0353c componentCallbacks2C0353c = ComponentCallbacks2C0353c.f2222x;
                    C c10 = new C(this);
                    componentCallbacks2C0353c.getClass();
                    synchronized (componentCallbacks2C0353c) {
                        componentCallbacks2C0353c.f2225v.add(c10);
                    }
                    AtomicBoolean atomicBoolean = componentCallbacks2C0353c.f2224u;
                    boolean z9 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0353c.f2223n;
                    if (!z9) {
                        Boolean bool = T2.b.f3087k;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", new Class[0]).invoke(null, new Object[0]);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new B0.c(com.bumptech.glide.f.B("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            T2.b.f3087k = bool;
                        }
                        if (bool.booleanValue()) {
                            z3 = true;
                            if (!z3) {
                                this.f2237n = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z3 = atomicBoolean2.get();
                    if (!z3) {
                    }
                }
                return true;
            case 7:
                d((N2.h) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d11 = (D) concurrentHashMap.get(message.obj);
                P2.w.c(d11.f2170F.f2235F);
                if (!d11.f2166B) {
                    return true;
                }
                d11.j();
                return true;
            case 10:
                s.c cVar = this.f2234E;
                Iterator it3 = cVar.iterator();
                while (true) {
                    s.f fVar = (s.f) it3;
                    if (!fVar.hasNext()) {
                        cVar.clear();
                        return true;
                    }
                    D d12 = (D) concurrentHashMap.remove((C0351a) fVar.next());
                    if (d12 != null) {
                        d12.m();
                    }
                }
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d13 = (D) concurrentHashMap.get(message.obj);
                C0354d c0354d = d13.f2170F;
                P2.w.c(c0354d.f2235F);
                boolean z10 = d13.f2166B;
                if (!z10) {
                    return true;
                }
                if (z10) {
                    C0354d c0354d2 = d13.f2170F;
                    a3.e eVar2 = c0354d2.f2235F;
                    C0351a c0351a = d13.f2173v;
                    eVar2.removeMessages(11, c0351a);
                    c0354d2.f2235F.removeMessages(9, c0351a);
                    d13.f2166B = false;
                }
                d13.b(c0354d.f2242y.c(c0354d.f2241x, M2.f.f1843a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                d13.f2172u.d("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d14 = (D) concurrentHashMap.get(message.obj);
                P2.w.c(d14.f2170F.f2235F);
                N2.c cVar2 = d14.f2172u;
                if (!cVar2.i() || d14.f2176y.size() != 0) {
                    return true;
                }
                C0361k c0361k = d14.f2174w;
                if (c0361k.f2255a.isEmpty() && c0361k.f2256b.isEmpty()) {
                    cVar2.d("Timing out service connection.");
                    return true;
                }
                d14.g();
                return true;
            case 14:
                throw D.y.i(message.obj);
            case 15:
                E e9 = (E) message.obj;
                if (!concurrentHashMap.containsKey(e9.f2178a)) {
                    return true;
                }
                D d15 = (D) concurrentHashMap.get(e9.f2178a);
                if (!d15.f2167C.contains(e9) || d15.f2166B) {
                    return true;
                }
                if (d15.f2172u.i()) {
                    d15.d();
                    return true;
                }
                d15.j();
                return true;
            case 16:
                E e10 = (E) message.obj;
                if (!concurrentHashMap.containsKey(e10.f2178a)) {
                    return true;
                }
                D d16 = (D) concurrentHashMap.get(e10.f2178a);
                if (!d16.f2167C.remove(e10)) {
                    return true;
                }
                C0354d c0354d3 = d16.f2170F;
                c0354d3.f2235F.removeMessages(15, e10);
                c0354d3.f2235F.removeMessages(16, e10);
                LinkedList linkedList = d16.f2171n;
                ArrayList arrayList = new ArrayList(linkedList.size());
                Iterator it4 = linkedList.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    M2.d dVar = e10.f2179b;
                    if (!hasNext) {
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            J j6 = (J) arrayList.get(i12);
                            linkedList.remove(j6);
                            j6.d(new N2.l(dVar));
                        }
                        return true;
                    }
                    J j9 = (J) it4.next();
                    if ((j9 instanceof J) && (b9 = j9.b(d16)) != null) {
                        int length2 = b9.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length2) {
                                break;
                            }
                            if (!P2.w.l(b9[i13], dVar)) {
                                i13++;
                            } else if (i13 >= 0) {
                                arrayList.add(j9);
                            }
                        }
                    }
                }
                break;
            case 17:
                P2.n nVar = this.f2239v;
                if (nVar == null) {
                    return true;
                }
                if (nVar.f2521n > 0 || a()) {
                    if (this.f2240w == null) {
                        this.f2240w = new R2.c(this.f2241x, R2.c.f2705B, P2.o.f2523b, N2.g.f1940b);
                    }
                    R2.c cVar3 = this.f2240w;
                    cVar3.getClass();
                    F3.e eVar3 = new F3.e();
                    eVar3.f961c = 0;
                    M2.d[] dVarArr = {a3.c.f4332a};
                    eVar3.f963e = dVarArr;
                    eVar3.f960b = false;
                    eVar3.f962d = new C4523c(i, nVar);
                    cVar3.c(2, new F3.e(eVar3, dVarArr, false, 0));
                }
                this.f2239v = null;
                return true;
            case 18:
                M m9 = (M) message.obj;
                long j10 = m9.f2196c;
                C0381k c0381k = m9.f2194a;
                int i14 = m9.f2195b;
                if (j10 == 0) {
                    P2.n nVar2 = new P2.n(i14, Arrays.asList(c0381k));
                    if (this.f2240w == null) {
                        this.f2240w = new R2.c(this.f2241x, R2.c.f2705B, P2.o.f2523b, N2.g.f1940b);
                    }
                    R2.c cVar4 = this.f2240w;
                    cVar4.getClass();
                    F3.e eVar4 = new F3.e();
                    eVar4.f961c = 0;
                    M2.d[] dVarArr2 = {a3.c.f4332a};
                    eVar4.f963e = dVarArr2;
                    eVar4.f960b = false;
                    eVar4.f962d = new C4523c(i, nVar2);
                    cVar4.c(2, new F3.e(eVar4, dVarArr2, false, 0));
                    return true;
                }
                P2.n nVar3 = this.f2239v;
                if (nVar3 != null) {
                    List list = nVar3.f2522u;
                    if (nVar3.f2521n != i14 || (list != null && list.size() >= m9.f2197d)) {
                        eVar.removeMessages(17);
                        P2.n nVar4 = this.f2239v;
                        if (nVar4 != null) {
                            if (nVar4.f2521n > 0 || a()) {
                                if (this.f2240w == null) {
                                    z6 = true;
                                    this.f2240w = new R2.c(this.f2241x, R2.c.f2705B, P2.o.f2523b, N2.g.f1940b);
                                } else {
                                    z6 = true;
                                }
                                R2.c cVar5 = this.f2240w;
                                cVar5.getClass();
                                F3.e eVar5 = new F3.e();
                                eVar5.f961c = 0;
                                M2.d[] dVarArr3 = {a3.c.f4332a};
                                eVar5.f963e = dVarArr3;
                                eVar5.f960b = false;
                                eVar5.f962d = new C4523c(i, nVar4);
                                cVar5.c(2, new F3.e(eVar5, dVarArr3, false, 0));
                            } else {
                                z6 = true;
                            }
                            this.f2239v = null;
                            if (this.f2239v == null) {
                                return z6;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c0381k);
                            this.f2239v = new P2.n(i14, arrayList2);
                            eVar.sendMessageDelayed(eVar.obtainMessage(17), m9.f2196c);
                            return z6;
                        }
                    } else {
                        P2.n nVar5 = this.f2239v;
                        if (nVar5.f2522u == null) {
                            nVar5.f2522u = new ArrayList();
                        }
                        nVar5.f2522u.add(c0381k);
                    }
                }
                z6 = true;
                if (this.f2239v == null) {
                }
                break;
            case 19:
                this.f2238u = false;
                return true;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown message id: ");
                sb2.append(i6);
                Log.w("GoogleApiManager", sb2.toString());
                return false;
        }
    }
}
