package o6;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f5251o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f5252p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f5253q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static d f5254r;

    /* renamed from: a, reason: collision with root package name */
    public long f5255a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5256b;

    /* renamed from: c, reason: collision with root package name */
    public p6.k f5257c;

    /* renamed from: d, reason: collision with root package name */
    public r6.b f5258d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5259e;

    /* renamed from: f, reason: collision with root package name */
    public final m6.e f5260f;

    /* renamed from: g, reason: collision with root package name */
    public final x4.e f5261g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f5262h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f5263i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f5264j;

    /* renamed from: k, reason: collision with root package name */
    public final s.g f5265k;

    /* renamed from: l, reason: collision with root package name */
    public final s.g f5266l;

    /* renamed from: m, reason: collision with root package name */
    public final a7.c f5267m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f5268n;

    public d(Context context, Looper looper) {
        m6.e eVar = m6.e.f4913d;
        this.f5255a = 10000L;
        this.f5256b = false;
        this.f5262h = new AtomicInteger(1);
        this.f5263i = new AtomicInteger(0);
        this.f5264j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5265k = new s.g(0);
        this.f5266l = new s.g(0);
        this.f5268n = true;
        this.f5259e = context;
        a7.c cVar = new a7.c(looper, this);
        this.f5267m = cVar;
        this.f5260f = eVar;
        this.f5261g = new x4.e(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (t6.b.f6536e == null) {
            t6.b.f6536e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (t6.b.f6536e.booleanValue()) {
            this.f5268n = false;
        }
        cVar.sendMessage(cVar.obtainMessage(6));
    }

    public static Status b(a aVar, m6.b bVar) {
        return new Status(17, "API: " + aVar.f5228b.f5073c + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f4904i, bVar);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f5253q) {
            if (f5254r == null) {
                synchronized (p6.d0.f5562g) {
                    try {
                        handlerThread = p6.d0.f5564i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            p6.d0.f5564i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = p6.d0.f5564i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = m6.e.f4912c;
                f5254r = new d(applicationContext, looper);
            }
            dVar = f5254r;
        }
        return dVar;
    }

    public final boolean a(m6.b bVar, int i10) {
        boolean z10;
        PendingIntent activity;
        Boolean bool;
        m6.e eVar = this.f5260f;
        Context context = this.f5259e;
        eVar.getClass();
        synchronized (v6.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = v6.a.f7300a;
            if (context2 != null && (bool = v6.a.f7301b) != null && context2 == applicationContext) {
                z10 = bool.booleanValue();
            }
            v6.a.f7301b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            v6.a.f7301b = Boolean.valueOf(isInstantApp);
            v6.a.f7300a = applicationContext;
            z10 = isInstantApp;
        }
        if (!z10) {
            if (bVar.a()) {
                activity = bVar.f4904i;
            } else {
                Intent a6 = eVar.a(bVar.f4903h, context, null);
                activity = a6 != null ? PendingIntent.getActivity(context, 0, a6, 201326592) : null;
            }
            if (activity != null) {
                int i11 = bVar.f4903h;
                int i12 = GoogleApiActivity.f1416h;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i11, PendingIntent.getActivity(context, 0, intent, y6.d.f8795a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final b0 c(r6.b bVar) {
        a aVar = bVar.f6090e;
        ConcurrentHashMap concurrentHashMap = this.f5264j;
        b0 b0Var = (b0) concurrentHashMap.get(aVar);
        if (b0Var == null) {
            b0Var = new b0(this, bVar);
            concurrentHashMap.put(aVar, b0Var);
        }
        if (b0Var.f5233e.n()) {
            this.f5266l.add(aVar);
        }
        b0Var.j();
        return b0Var;
    }

    public final void e(m6.b bVar, int i10) {
        if (a(bVar, i10)) {
            return;
        }
        a7.c cVar = this.f5267m;
        cVar.sendMessage(cVar.obtainMessage(5, i10, 0, bVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0126, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        b0 b0Var;
        m6.d[] b2;
        p6.i iVar;
        p6.i iVar2;
        Context context = this.f5259e;
        s.g gVar = this.f5266l;
        a7.c cVar = this.f5267m;
        ConcurrentHashMap concurrentHashMap = this.f5264j;
        int i10 = message.what;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f5255a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                cVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    cVar.sendMessageDelayed(cVar.obtainMessage(12, (a) it.next()), this.f5255a);
                }
                return true;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                throw v.f.c(message.obj);
            case 3:
                for (b0 b0Var2 : concurrentHashMap.values()) {
                    p6.u.b(b0Var2.f5243o.f5267m);
                    b0Var2.f5242n = null;
                    b0Var2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                k0 k0Var = (k0) message.obj;
                r6.b bVar = k0Var.f5292c;
                m0 m0Var = k0Var.f5290a;
                b0 b0Var3 = (b0) concurrentHashMap.get(bVar.f6090e);
                if (b0Var3 == null) {
                    b0Var3 = c(k0Var.f5292c);
                }
                if (!b0Var3.f5233e.n() || this.f5263i.get() == k0Var.f5291b) {
                    b0Var3.k(m0Var);
                    return true;
                }
                m0Var.c(f5251o);
                b0Var3.n();
                return true;
            case 5:
                int i11 = message.arg1;
                m6.b bVar2 = (m6.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b0Var = (b0) it2.next();
                        if (b0Var.f5238j == i11) {
                        }
                    } else {
                        b0Var = null;
                    }
                }
                if (b0Var == null) {
                    Log.wtf("GoogleApiManager", a4.d.h("Could not find API instance ", i11, " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i12 = bVar2.f4903h;
                if (i12 != 13) {
                    b0Var.b(b(b0Var.f5234f, bVar2));
                    return true;
                }
                this.f5260f.getClass();
                int i13 = m6.h.f4918c;
                b0Var.b(new Status(17, "Error resolution was canceled by the user, original error message: " + m6.b.c(i12) + ": " + bVar2.f4905j, null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar2 = c.f5244k;
                    a0 a0Var = new a0(this);
                    cVar2.getClass();
                    synchronized (cVar2) {
                        cVar2.f5247i.add(a0Var);
                    }
                    AtomicBoolean atomicBoolean = cVar2.f5245g;
                    AtomicBoolean atomicBoolean2 = cVar2.f5246h;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.f5255a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                c((r6.b) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var4 = (b0) concurrentHashMap.get(message.obj);
                    p6.u.b(b0Var4.f5243o.f5267m);
                    if (b0Var4.f5240l) {
                        b0Var4.j();
                        return true;
                    }
                }
                return true;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                gVar.getClass();
                s.b bVar3 = new s.b(gVar);
                while (bVar3.hasNext()) {
                    b0 b0Var5 = (b0) concurrentHashMap.remove((a) bVar3.next());
                    if (b0Var5 != null) {
                        b0Var5.n();
                    }
                }
                gVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var6 = (b0) concurrentHashMap.get(message.obj);
                    d dVar = b0Var6.f5243o;
                    p6.u.b(dVar.f5267m);
                    boolean z10 = b0Var6.f5240l;
                    if (z10) {
                        a aVar = b0Var6.f5234f;
                        a7.c cVar3 = b0Var6.f5243o.f5267m;
                        if (z10) {
                            cVar3.removeMessages(11, aVar);
                            cVar3.removeMessages(9, aVar);
                            b0Var6.f5240l = false;
                        }
                        b0Var6.b(dVar.f5260f.b(dVar.f5259e, m6.f.f4914a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        b0Var6.f5233e.c("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var7 = (b0) concurrentHashMap.get(message.obj);
                    p6.u.b(b0Var7.f5243o.f5267m);
                    n6.a aVar2 = b0Var7.f5233e;
                    if (aVar2.a() && b0Var7.f5237i.isEmpty()) {
                        x4.c cVar4 = b0Var7.f5235g;
                        if (((Map) cVar4.f8290g).isEmpty() && ((Map) cVar4.f8291h).isEmpty()) {
                            aVar2.c("Timing out service connection.");
                            return true;
                        }
                        b0Var7.g();
                    }
                    return true;
                }
                return true;
            case 14:
                throw v.f.c(message.obj);
            case 15:
                c0 c0Var = (c0) message.obj;
                if (concurrentHashMap.containsKey(c0Var.f5249a)) {
                    b0 b0Var8 = (b0) concurrentHashMap.get(c0Var.f5249a);
                    if (b0Var8.f5241m.contains(c0Var) && !b0Var8.f5240l) {
                        if (b0Var8.f5233e.a()) {
                            b0Var8.d();
                            return true;
                        }
                        b0Var8.j();
                        return true;
                    }
                }
                return true;
            case 16:
                c0 c0Var2 = (c0) message.obj;
                if (concurrentHashMap.containsKey(c0Var2.f5249a)) {
                    b0 b0Var9 = (b0) concurrentHashMap.get(c0Var2.f5249a);
                    ArrayList arrayList = b0Var9.f5241m;
                    d dVar2 = b0Var9.f5243o;
                    LinkedList<h0> linkedList = b0Var9.f5232d;
                    if (arrayList.remove(c0Var2)) {
                        dVar2.f5267m.removeMessages(15, c0Var2);
                        dVar2.f5267m.removeMessages(16, c0Var2);
                        m6.d dVar3 = c0Var2.f5250b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (h0 h0Var : linkedList) {
                            if ((h0Var instanceof h0) && (b2 = h0Var.b(b0Var9)) != null) {
                                int length = b2.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= length) {
                                        break;
                                    }
                                    if (!p6.u.j(b2[i14], dVar3)) {
                                        i14++;
                                    } else if (i14 >= 0) {
                                        arrayList2.add(h0Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            h0 h0Var2 = (h0) arrayList2.get(i15);
                            linkedList.remove(h0Var2);
                            h0Var2.d(new n6.i(dVar3));
                        }
                    }
                }
                return true;
            case 17:
                p6.k kVar = this.f5257c;
                if (kVar != null) {
                    if (kVar.f5609g <= 0) {
                        if (!this.f5256b) {
                            synchronized (p6.i.class) {
                                try {
                                    if (p6.i.f5603g == null) {
                                        p6.i.f5603g = new p6.i();
                                    }
                                    iVar = p6.i.f5603g;
                                } finally {
                                }
                            }
                            iVar.getClass();
                            int i16 = ((SparseIntArray) this.f5261g.f8294g).get(203400000, -1);
                            if (i16 != -1) {
                            }
                        }
                        this.f5257c = null;
                        return true;
                    }
                    if (this.f5258d == null) {
                        this.f5258d = new r6.b(this.f5259e, r6.b.f6085i, p6.l.f5611b, n6.e.f5075b);
                    }
                    this.f5258d.b(kVar);
                    this.f5257c = null;
                    return true;
                }
                return true;
            case 18:
                ((j0) message.obj).getClass();
                if (0 == 0) {
                    p6.k kVar2 = new p6.k(0, Arrays.asList(null));
                    if (this.f5258d == null) {
                        this.f5258d = new r6.b(this.f5259e, r6.b.f6085i, p6.l.f5611b, n6.e.f5075b);
                    }
                    this.f5258d.b(kVar2);
                    return true;
                }
                p6.k kVar3 = this.f5257c;
                if (kVar3 != null) {
                    List list = kVar3.f5610h;
                    if (kVar3.f5609g != 0 || (list != null && list.size() >= 0)) {
                        cVar.removeMessages(17);
                        p6.k kVar4 = this.f5257c;
                        if (kVar4 != null) {
                            if (kVar4.f5609g <= 0) {
                                if (!this.f5256b) {
                                    synchronized (p6.i.class) {
                                        try {
                                            if (p6.i.f5603g == null) {
                                                p6.i.f5603g = new p6.i();
                                            }
                                            iVar2 = p6.i.f5603g;
                                        } finally {
                                        }
                                    }
                                    iVar2.getClass();
                                    int i17 = ((SparseIntArray) this.f5261g.f8294g).get(203400000, -1);
                                    if (i17 != -1) {
                                    }
                                }
                                this.f5257c = null;
                            }
                            if (this.f5258d == null) {
                                this.f5258d = new r6.b(this.f5259e, r6.b.f6085i, p6.l.f5611b, n6.e.f5075b);
                            }
                            this.f5258d.b(kVar4);
                            this.f5257c = null;
                        }
                    } else {
                        p6.k kVar5 = this.f5257c;
                        if (kVar5.f5610h == null) {
                            kVar5.f5610h = new ArrayList();
                        }
                        kVar5.f5610h.add(null);
                    }
                }
                if (this.f5257c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.f5257c = new p6.k(0, arrayList3);
                    cVar.sendMessageDelayed(cVar.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.f5256b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }
}
