package defpackage;

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
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class umd implements Handler.Callback {
    public static final Status p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status q = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object r = new Object();
    public static umd s;
    public long a;
    public boolean b;
    public p8s c;
    public w8c d;
    public final Context e;
    public final pmd f;
    public final y8p g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public fww k;
    public final cz0 l;
    public final cz0 m;
    public final fsn n;
    public volatile boolean o;

    public umd(Context context, Looper looper) {
        pmd pmdVar = pmd.e;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = null;
        this.l = new cz0(0);
        this.m = new cz0(0);
        this.o = true;
        this.e = context;
        fsn fsnVar = new fsn(looper, this);
        this.n = fsnVar;
        this.f = pmdVar;
        this.g = new y8p(pmdVar);
        PackageManager packageManager = context.getPackageManager();
        if (sj2.o == null) {
            sj2.o = Boolean.valueOf(fxf.F() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (sj2.o.booleanValue()) {
            this.o = false;
        }
        fsnVar.sendMessage(fsnVar.obtainMessage(6));
    }

    public static Status d(wo0 wo0Var, h66 h66Var) {
        return new Status(17, hrg.r("API: ", wo0Var.b.c, " is not available on this device. Connection failed with: ", String.valueOf(h66Var)), h66Var.c, h66Var);
    }

    public static umd g(Context context) {
        umd umdVar;
        HandlerThread handlerThread;
        synchronized (r) {
            if (s == null) {
                synchronized (ilx.g) {
                    try {
                        handlerThread = ilx.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ilx.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ilx.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                int i = pmd.c;
                s = new umd(applicationContext, looper);
            }
            umdVar = s;
        }
        return umdVar;
    }

    public final void a(fww fwwVar) {
        synchronized (r) {
            try {
                if (this.k != fwwVar) {
                    this.k = fwwVar;
                    this.l.clear();
                }
                this.l.addAll(fwwVar.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        ffo ffoVar = (ffo) efo.g().b;
        if (ffoVar != null && !ffoVar.b) {
            return false;
        }
        int i = ((SparseIntArray) this.g.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean c(h66 h66Var, int i) {
        PendingIntent pendingIntent;
        pmd pmdVar = this.f;
        pmdVar.getClass();
        Context context = this.e;
        if (!woe.p(context)) {
            boolean d = h66Var.d();
            int i2 = h66Var.b;
            if (d) {
                pendingIntent = h66Var.c;
            } else {
                pendingIntent = null;
                Intent a = pmdVar.a(context, null, i2);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                pmdVar.h(context, i2, PendingIntent.getActivity(context, 0, intent, tyw.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final axw e(omd omdVar) {
        wo0 wo0Var = omdVar.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        axw axwVar = (axw) concurrentHashMap.get(wo0Var);
        if (axwVar == null) {
            axwVar = new axw(this, omdVar);
            concurrentHashMap.put(wo0Var, axwVar);
        }
        if (axwVar.h.e()) {
            this.m.add(wo0Var);
        }
        axwVar.k();
        return axwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(i8s i8sVar, int i, omd omdVar) {
        oio oioVar;
        umd umdVar;
        if (i == 0) {
            return;
        }
        wo0 wo0Var = omdVar.e;
        if (b()) {
            ffo ffoVar = (ffo) efo.g().b;
            boolean z = true;
            if (ffoVar != null) {
                if (ffoVar.b) {
                    boolean z2 = ffoVar.c;
                    axw axwVar = (axw) this.j.get(wo0Var);
                    if (axwVar != null) {
                        fo0 fo0Var = axwVar.h;
                        if (fo0Var instanceof a) {
                            a aVar = (a) fo0Var;
                            if (aVar.A != null && !aVar.c()) {
                                q66 h = oio.h(axwVar, aVar, i);
                                if (h != null) {
                                    axwVar.r++;
                                    z = h.c;
                                }
                            }
                        }
                    }
                    z = z2;
                }
            }
            umdVar = this;
            oioVar = new oio(umdVar, i, wo0Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            if (oioVar == null) {
                onx onxVar = i8sVar.a;
                fsn fsnVar = umdVar.n;
                fsnVar.getClass();
                onxVar.b(new ks1(fsnVar, 4), oioVar);
                return;
            }
            return;
        }
        oioVar = null;
        umdVar = this;
        if (oioVar == null) {
        }
    }

    public final void h(h66 h66Var, int i) {
        if (c(h66Var, i)) {
            return;
        }
        fsn fsnVar = this.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(5, i, 0, h66Var));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        axw axwVar;
        i6c[] g;
        Context context = this.e;
        cz0 cz0Var = this.m;
        fsn fsnVar = this.n;
        ConcurrentHashMap concurrentHashMap = this.j;
        int i = message.what;
        int i2 = 19;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                fsnVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    fsnVar.sendMessageDelayed(fsnVar.obtainMessage(12, (wo0) it.next()), this.a);
                }
                return true;
            case 2:
                throw ouj.g(message.obj);
            case 3:
                for (axw axwVar2 : concurrentHashMap.values()) {
                    y1g.A(axwVar2.s.n);
                    axwVar2.q = null;
                    axwVar2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                pxw pxwVar = (pxw) message.obj;
                omd omdVar = pxwVar.c;
                jyw jywVar = pxwVar.a;
                axw axwVar3 = (axw) concurrentHashMap.get(omdVar.e);
                if (axwVar3 == null) {
                    axwVar3 = e(pxwVar.c);
                }
                if (!axwVar3.h.e() || this.i.get() == pxwVar.b) {
                    axwVar3.l(jywVar);
                    return true;
                }
                jywVar.a(p);
                axwVar3.o();
                return true;
            case 5:
                int i3 = message.arg1;
                h66 h66Var = (h66) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        axwVar = (axw) it2.next();
                        if (axwVar.m == i3) {
                        }
                    } else {
                        axwVar = null;
                    }
                }
                if (axwVar == null) {
                    Log.wtf("GoogleApiManager", dfi.c(i3, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i4 = h66Var.b;
                if (i4 != 13) {
                    axwVar.c(d(axwVar.i, h66Var));
                    return true;
                }
                this.f.getClass();
                AtomicBoolean atomicBoolean = rnd.a;
                axwVar.c(new Status(17, hrg.r("Error resolution was canceled by the user, original error message: ", h66.f(i4), ": ", h66Var.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    rj2.a((Application) context.getApplicationContext());
                    rj2 rj2Var = rj2.e;
                    zww zwwVar = new zww(this);
                    rj2Var.getClass();
                    synchronized (rj2Var) {
                        rj2Var.c.add(zwwVar);
                    }
                    AtomicBoolean atomicBoolean2 = rj2Var.a;
                    AtomicBoolean atomicBoolean3 = rj2Var.b;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                e((omd) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    axw axwVar4 = (axw) concurrentHashMap.get(message.obj);
                    y1g.A(axwVar4.s.n);
                    if (axwVar4.o) {
                        axwVar4.k();
                        return true;
                    }
                }
                return true;
            case 10:
                cz0Var.getClass();
                ty0 ty0Var = new ty0(cz0Var);
                while (ty0Var.hasNext()) {
                    axw axwVar5 = (axw) concurrentHashMap.remove((wo0) ty0Var.next());
                    if (axwVar5 != null) {
                        axwVar5.o();
                    }
                }
                cz0Var.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    axw axwVar6 = (axw) concurrentHashMap.get(message.obj);
                    umd umdVar = axwVar6.s;
                    y1g.A(umdVar.n);
                    boolean z = axwVar6.o;
                    if (z) {
                        wo0 wo0Var = axwVar6.i;
                        fsn fsnVar2 = axwVar6.s.n;
                        if (z) {
                            fsnVar2.removeMessages(11, wo0Var);
                            fsnVar2.removeMessages(9, wo0Var);
                            axwVar6.o = false;
                        }
                        axwVar6.c(umdVar.f.b(umdVar.e, qmd.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        axwVar6.h.b("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    axw axwVar7 = (axw) concurrentHashMap.get(message.obj);
                    y1g.A(axwVar7.s.n);
                    fo0 fo0Var = axwVar7.h;
                    if (fo0Var.isConnected() && axwVar7.l.isEmpty()) {
                        apo apoVar = axwVar7.j;
                        if (((Map) apoVar.b).isEmpty() && ((Map) apoVar.c).isEmpty()) {
                            fo0Var.b("Timing out service connection.");
                            return true;
                        }
                        axwVar7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                throw ouj.g(message.obj);
            case 15:
                bxw bxwVar = (bxw) message.obj;
                if (concurrentHashMap.containsKey(bxwVar.a)) {
                    axw axwVar8 = (axw) concurrentHashMap.get(bxwVar.a);
                    if (axwVar8.p.contains(bxwVar) && !axwVar8.o) {
                        if (axwVar8.h.isConnected()) {
                            axwVar8.e();
                            return true;
                        }
                        axwVar8.k();
                        return true;
                    }
                }
                return true;
            case 16:
                bxw bxwVar2 = (bxw) message.obj;
                if (concurrentHashMap.containsKey(bxwVar2.a)) {
                    axw axwVar9 = (axw) concurrentHashMap.get(bxwVar2.a);
                    ArrayList arrayList = axwVar9.p;
                    umd umdVar2 = axwVar9.s;
                    LinkedList<jyw> linkedList = axwVar9.a;
                    if (arrayList.remove(bxwVar2)) {
                        umdVar2.n.removeMessages(15, bxwVar2);
                        umdVar2.n.removeMessages(16, bxwVar2);
                        i6c i6cVar = bxwVar2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (jyw jywVar2 : linkedList) {
                            if ((jywVar2 instanceof hxw) && (g = ((hxw) jywVar2).g(axwVar9)) != null) {
                                int length = g.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!ldg.s(g[i5], i6cVar)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList2.add(jywVar2);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            jyw jywVar3 = (jyw) arrayList2.get(i6);
                            linkedList.remove(jywVar3);
                            jywVar3.b(new jmt(i6cVar));
                        }
                    }
                }
                return true;
            case 17:
                p8s p8sVar = this.c;
                if (p8sVar != null) {
                    if (p8sVar.a > 0 || b()) {
                        if (this.d == null) {
                            this.d = new w8c(this.e, null, w8c.l, q8s.a, nmd.c);
                        }
                        w8c w8cVar = this.d;
                        w8cVar.getClass();
                        q5i a = h8s.a();
                        a.d = new i6c[]{yd5.g};
                        a.a = false;
                        a.c = new hjp(i2, p8sVar);
                        w8cVar.c(2, a.c());
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                oxw oxwVar = (oxw) message.obj;
                long j = oxwVar.c;
                o3i o3iVar = oxwVar.a;
                int i7 = oxwVar.b;
                if (j == 0) {
                    p8s p8sVar2 = new p8s(Arrays.asList(o3iVar), i7);
                    if (this.d == null) {
                        this.d = new w8c(this.e, null, w8c.l, q8s.a, nmd.c);
                    }
                    w8c w8cVar2 = this.d;
                    w8cVar2.getClass();
                    q5i a2 = h8s.a();
                    a2.d = new i6c[]{yd5.g};
                    a2.a = false;
                    a2.c = new hjp(i2, p8sVar2);
                    w8cVar2.c(2, a2.c());
                    return true;
                }
                p8s p8sVar3 = this.c;
                if (p8sVar3 != null) {
                    List list = p8sVar3.b;
                    if (p8sVar3.a != i7 || (list != null && list.size() >= oxwVar.d)) {
                        fsnVar.removeMessages(17);
                        p8s p8sVar4 = this.c;
                        if (p8sVar4 != null) {
                            if (p8sVar4.a > 0 || b()) {
                                if (this.d == null) {
                                    this.d = new w8c(this.e, null, w8c.l, q8s.a, nmd.c);
                                }
                                w8c w8cVar3 = this.d;
                                w8cVar3.getClass();
                                q5i a3 = h8s.a();
                                a3.d = new i6c[]{yd5.g};
                                a3.a = false;
                                a3.c = new hjp(i2, p8sVar4);
                                w8cVar3.c(2, a3.c());
                            }
                            this.c = null;
                        }
                    } else {
                        p8s p8sVar5 = this.c;
                        if (p8sVar5.b == null) {
                            p8sVar5.b = new ArrayList();
                        }
                        p8sVar5.b.add(o3iVar);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(o3iVar);
                    this.c = new p8s(arrayList3, i7);
                    fsnVar.sendMessageDelayed(fsnVar.obtainMessage(17), oxwVar.c);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
