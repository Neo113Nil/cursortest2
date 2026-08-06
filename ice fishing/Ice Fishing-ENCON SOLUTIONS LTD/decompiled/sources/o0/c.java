package o0;

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
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.impl.C0376e9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0979c;
import n0.InterfaceC0989c;
import p0.AbstractC1021r;
import p0.C1002B;
import p0.C1009f;
import p0.C1010g;
import p0.C1011h;
import p0.C1012i;
import p0.C1013j;
import r0.C1040b;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f8253o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f8254p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f8255q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static c f8256r;

    /* renamed from: a, reason: collision with root package name */
    public long f8257a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8258b;

    /* renamed from: c, reason: collision with root package name */
    public C1012i f8259c;

    /* renamed from: d, reason: collision with root package name */
    public C1040b f8260d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8261e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.f f8262f;

    /* renamed from: g, reason: collision with root package name */
    public final o.b f8263g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f8264h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f8265i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f8266j;

    /* renamed from: k, reason: collision with root package name */
    public final C0979c f8267k;

    /* renamed from: l, reason: collision with root package name */
    public final C0979c f8268l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.a f8269m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f8270n;

    public c(Context context, Looper looper) {
        m0.f fVar = m0.f.f8173d;
        this.f8257a = 10000L;
        this.f8258b = false;
        this.f8264h = new AtomicInteger(1);
        this.f8265i = new AtomicInteger(0);
        this.f8266j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f8267k = new C0979c(0);
        this.f8268l = new C0979c(0);
        this.f8270n = true;
        this.f8261e = context;
        A0.a aVar = new A0.a(looper, this);
        Looper.getMainLooper();
        this.f8269m = aVar;
        this.f8262f = fVar;
        this.f8263g = new o.b(5);
        PackageManager packageManager = context.getPackageManager();
        if (R1.l.f1769h == null) {
            R1.l.f1769h = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (R1.l.f1769h.booleanValue()) {
            this.f8270n = false;
        }
        aVar.sendMessage(aVar.obtainMessage(6));
    }

    public static Status c(C0997a c0997a, m0.b bVar) {
        return new Status(17, "API: " + ((String) c0997a.f8245b.f8531c) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f8164c, bVar);
    }

    public static c e(Context context) {
        c cVar;
        HandlerThread handlerThread;
        synchronized (f8255q) {
            if (f8256r == null) {
                synchronized (C1002B.f8332g) {
                    try {
                        handlerThread = C1002B.f8334i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C1002B.f8334i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C1002B.f8334i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = m0.f.f8172c;
                f8256r = new c(applicationContext, looper);
            }
            cVar = f8256r;
        }
        return cVar;
    }

    public final boolean a() {
        if (this.f8258b) {
            return false;
        }
        C1011h c1011h = (C1011h) C1010g.b().f8376a;
        if (c1011h != null && !c1011h.f8378b) {
            return false;
        }
        int i2 = ((SparseIntArray) this.f8263g.f8226b).get(203400000, -1);
        return i2 == -1 || i2 == 0;
    }

    public final boolean b(m0.b bVar, int i2) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        m0.f fVar = this.f8262f;
        Context context = this.f8261e;
        fVar.getClass();
        synchronized (AbstractC1050a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC1050a.f8476a;
            if (context2 != null && (bool = AbstractC1050a.f8477b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC1050a.f8477b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC1050a.f8477b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC1050a.f8477b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC1050a.f8477b = Boolean.FALSE;
                }
            }
            AbstractC1050a.f8476a = applicationContext;
            booleanValue = AbstractC1050a.f8477b.booleanValue();
        }
        if (!booleanValue) {
            int i3 = bVar.f8163b;
            if (i3 == 0 || (activity = bVar.f8164c) == null) {
                Intent a2 = fVar.a(context, null, i3);
                activity = a2 != null ? PendingIntent.getActivity(context, 0, a2, 201326592) : null;
            }
            if (activity != null) {
                int i4 = bVar.f8163b;
                int i5 = GoogleApiActivity.f2676b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i2);
                intent.putExtra("notify_manager", true);
                fVar.f(context, i4, PendingIntent.getActivity(context, 0, intent, y0.d.f8603a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final l d(n0.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f8266j;
        C0997a c0997a = fVar.f8206e;
        l lVar = (l) concurrentHashMap.get(c0997a);
        if (lVar == null) {
            lVar = new l(this, fVar);
            concurrentHashMap.put(c0997a, lVar);
        }
        if (lVar.f8275b.j()) {
            this.f8268l.add(c0997a);
        }
        lVar.m();
        return lVar;
    }

    public final void f(m0.b bVar, int i2) {
        if (b(bVar, i2)) {
            return;
        }
        A0.a aVar = this.f8269m;
        aVar.sendMessage(aVar.obtainMessage(5, i2, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        l lVar;
        m0.d[] b2;
        int i2 = 27;
        int i3 = message.what;
        switch (i3) {
            case 1:
                this.f8257a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f8269m.removeMessages(12);
                for (C0997a c0997a : this.f8266j.keySet()) {
                    A0.a aVar = this.f8269m;
                    aVar.sendMessageDelayed(aVar.obtainMessage(12, c0997a), this.f8257a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (l lVar2 : this.f8266j.values()) {
                    AbstractC1021r.a(lVar2.f8286m.f8269m);
                    lVar2.f8284k = null;
                    lVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t tVar = (t) message.obj;
                l lVar3 = (l) this.f8266j.get(tVar.f8309c.f8206e);
                if (lVar3 == null) {
                    lVar3 = d(tVar.f8309c);
                }
                if (!lVar3.f8275b.j() || this.f8265i.get() == tVar.f8308b) {
                    lVar3.n(tVar.f8307a);
                } else {
                    tVar.f8307a.c(f8253o);
                    lVar3.q();
                }
                return true;
            case 5:
                int i4 = message.arg1;
                m0.b bVar = (m0.b) message.obj;
                Iterator it = this.f8266j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        lVar = (l) it.next();
                        if (lVar.f8280g == i4) {
                        }
                    } else {
                        lVar = null;
                    }
                }
                if (lVar != null) {
                    int i5 = bVar.f8163b;
                    if (i5 == 13) {
                        this.f8262f.getClass();
                        AtomicBoolean atomicBoolean = m0.i.f8176a;
                        lVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + m0.b.a(i5) + ": " + bVar.f8165d, null, null));
                    } else {
                        lVar.e(c(lVar.f8276c, bVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", C1.a.g(i4, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case 6:
                if (this.f8261e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f8261e.getApplicationContext();
                    b bVar2 = b.f8248e;
                    synchronized (bVar2) {
                        try {
                            if (!bVar2.f8252d) {
                                application.registerActivityLifecycleCallbacks(bVar2);
                                application.registerComponentCallbacks(bVar2);
                                bVar2.f8252d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j jVar = new j(this);
                    synchronized (bVar2) {
                        bVar2.f8251c.add(jVar);
                    }
                    AtomicBoolean atomicBoolean2 = bVar2.f8250b;
                    boolean z2 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = bVar2.f8249a;
                    if (!z2) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f8257a = 300000L;
                    }
                }
                return true;
            case 7:
                d((n0.f) message.obj);
                return true;
            case 9:
                if (this.f8266j.containsKey(message.obj)) {
                    l lVar4 = (l) this.f8266j.get(message.obj);
                    AbstractC1021r.a(lVar4.f8286m.f8269m);
                    if (lVar4.f8282i) {
                        lVar4.m();
                    }
                }
                return true;
            case 10:
                Iterator it2 = this.f8268l.iterator();
                while (true) {
                    l.g gVar = (l.g) it2;
                    if (!gVar.hasNext()) {
                        this.f8268l.clear();
                        return true;
                    }
                    l lVar5 = (l) this.f8266j.remove((C0997a) gVar.next());
                    if (lVar5 != null) {
                        lVar5.q();
                    }
                }
            case 11:
                if (this.f8266j.containsKey(message.obj)) {
                    l lVar6 = (l) this.f8266j.get(message.obj);
                    c cVar = lVar6.f8286m;
                    AbstractC1021r.a(cVar.f8269m);
                    boolean z3 = lVar6.f8282i;
                    if (z3) {
                        if (z3) {
                            c cVar2 = lVar6.f8286m;
                            A0.a aVar2 = cVar2.f8269m;
                            C0997a c0997a2 = lVar6.f8276c;
                            aVar2.removeMessages(11, c0997a2);
                            cVar2.f8269m.removeMessages(9, c0997a2);
                            lVar6.f8282i = false;
                        }
                        lVar6.e(cVar.f8262f.b(cVar.f8261e, m0.g.f8174a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        lVar6.f8275b.i("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f8266j.containsKey(message.obj)) {
                    l lVar7 = (l) this.f8266j.get(message.obj);
                    AbstractC1021r.a(lVar7.f8286m.f8269m);
                    InterfaceC0989c interfaceC0989c = lVar7.f8275b;
                    if (interfaceC0989c.d() && lVar7.f8279f.isEmpty()) {
                        o.b bVar3 = lVar7.f8277d;
                        if (((Map) bVar3.f8226b).isEmpty() && ((Map) bVar3.f8227c).isEmpty()) {
                            interfaceC0989c.i("Timing out service connection.");
                        } else {
                            lVar7.j();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                m mVar = (m) message.obj;
                if (this.f8266j.containsKey(mVar.f8287a)) {
                    l lVar8 = (l) this.f8266j.get(mVar.f8287a);
                    if (lVar8.f8283j.contains(mVar) && !lVar8.f8282i) {
                        if (lVar8.f8275b.d()) {
                            lVar8.g();
                        } else {
                            lVar8.m();
                        }
                    }
                }
                return true;
            case 16:
                m mVar2 = (m) message.obj;
                if (this.f8266j.containsKey(mVar2.f8287a)) {
                    l lVar9 = (l) this.f8266j.get(mVar2.f8287a);
                    if (lVar9.f8283j.remove(mVar2)) {
                        c cVar3 = lVar9.f8286m;
                        cVar3.f8269m.removeMessages(15, mVar2);
                        cVar3.f8269m.removeMessages(16, mVar2);
                        m0.d dVar = mVar2.f8288b;
                        LinkedList<q> linkedList = lVar9.f8274a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (q qVar : linkedList) {
                            if (qVar != null && (b2 = qVar.b(lVar9)) != null) {
                                int length = b2.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!AbstractC1021r.e(b2[i6], dVar)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList.add(qVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            q qVar2 = (q) arrayList.get(i7);
                            linkedList.remove(qVar2);
                            qVar2.d(new n0.k(dVar));
                        }
                    }
                }
                return true;
            case 17:
                C1012i c1012i = this.f8259c;
                if (c1012i != null) {
                    if (c1012i.f8382a > 0 || a()) {
                        if (this.f8260d == null) {
                            this.f8260d = new C1040b(this.f8261e, C1040b.f8470i, C1013j.f8384b, n0.e.f8200b);
                        }
                        C1040b c1040b = this.f8260d;
                        c1040b.getClass();
                        K.a aVar3 = new K.a();
                        aVar3.f1017b = 0;
                        aVar3.f1020e = new m0.d[]{y0.c.f8601a};
                        aVar3.f1018c = false;
                        aVar3.f1019d = new Z0.i(i2, c1012i);
                        c1040b.b(2, aVar3.a());
                    }
                    this.f8259c = null;
                }
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f8305c == 0) {
                    C1012i c1012i2 = new C1012i(sVar.f8304b, Arrays.asList(sVar.f8303a));
                    if (this.f8260d == null) {
                        this.f8260d = new C1040b(this.f8261e, C1040b.f8470i, C1013j.f8384b, n0.e.f8200b);
                    }
                    C1040b c1040b2 = this.f8260d;
                    c1040b2.getClass();
                    K.a aVar4 = new K.a();
                    aVar4.f1017b = 0;
                    aVar4.f1020e = new m0.d[]{y0.c.f8601a};
                    aVar4.f1018c = false;
                    aVar4.f1019d = new Z0.i(i2, c1012i2);
                    c1040b2.b(2, aVar4.a());
                } else {
                    C1012i c1012i3 = this.f8259c;
                    if (c1012i3 != null) {
                        List list = c1012i3.f8383b;
                        if (c1012i3.f8382a != sVar.f8304b || (list != null && list.size() >= sVar.f8306d)) {
                            this.f8269m.removeMessages(17);
                            C1012i c1012i4 = this.f8259c;
                            if (c1012i4 != null) {
                                if (c1012i4.f8382a > 0 || a()) {
                                    if (this.f8260d == null) {
                                        this.f8260d = new C1040b(this.f8261e, C1040b.f8470i, C1013j.f8384b, n0.e.f8200b);
                                    }
                                    C1040b c1040b3 = this.f8260d;
                                    c1040b3.getClass();
                                    K.a aVar5 = new K.a();
                                    aVar5.f1017b = 0;
                                    aVar5.f1020e = new m0.d[]{y0.c.f8601a};
                                    aVar5.f1018c = false;
                                    aVar5.f1019d = new Z0.i(i2, c1012i4);
                                    c1040b3.b(2, aVar5.a());
                                }
                                this.f8259c = null;
                            }
                        } else {
                            C1012i c1012i5 = this.f8259c;
                            C1009f c1009f = sVar.f8303a;
                            if (c1012i5.f8383b == null) {
                                c1012i5.f8383b = new ArrayList();
                            }
                            c1012i5.f8383b.add(c1009f);
                        }
                    }
                    if (this.f8259c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(sVar.f8303a);
                        this.f8259c = new C1012i(sVar.f8304b, arrayList2);
                        A0.a aVar6 = this.f8269m;
                        aVar6.sendMessageDelayed(aVar6.obtainMessage(17), sVar.f8305c);
                    }
                }
                return true;
            case C0376e9.f5882C /* 19 */:
                this.f8258b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i3);
                return false;
        }
    }
}
