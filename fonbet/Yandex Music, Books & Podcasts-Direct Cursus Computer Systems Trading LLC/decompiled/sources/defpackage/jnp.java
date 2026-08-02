package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jnp implements Application.ActivityLifecycleCallbacks {
    public static final jnp b = new jnp(0);
    public static boolean c;
    public static x3n d;
    public final /* synthetic */ int a;

    public /* synthetic */ jnp(int i) {
        this.a = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 1:
                HashMap hashMap = lsg.d;
                b3i.Q(tsg.b, oh.a, "onActivityCreated");
                oh.b.execute(q.c);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 1:
                HashMap hashMap = lsg.d;
                b3i.Q(tsg.b, oh.a, "onActivityDestroyed");
                teu teuVar = ds4.a;
                Set set = bp6.a;
                if (!set.contains(ds4.class)) {
                    try {
                        gs4 A = gs4.g.A();
                        if (!set.contains(A)) {
                            try {
                                ((HashMap) A.e).remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th) {
                                bp6.a(A, th);
                            }
                        }
                        break;
                    } catch (Throwable th2) {
                        bp6.a(ds4.class, th2);
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                x3n x3nVar = d;
                if (x3nVar != null) {
                    x3nVar.L0(2);
                    break;
                }
                break;
            case 1:
                HashMap hashMap = lsg.d;
                String str = oh.a;
                String str2 = oh.a;
                b3i.Q(tsg.b, str2, "onActivityPaused");
                AtomicInteger atomicInteger = oh.e;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str2, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                oh.a();
                long currentTimeMillis = System.currentTimeMillis();
                String m = gvt.m(activity);
                teu teuVar = ds4.a;
                Set set = bp6.a;
                if (!set.contains(ds4.class)) {
                    try {
                        if (ds4.e.get()) {
                            gs4.g.A().S(activity);
                            seu seuVar = ds4.c;
                            if (seuVar != null && !set.contains(seuVar)) {
                                try {
                                    if (((Activity) seuVar.b.get()) != null) {
                                        try {
                                            Timer timer = seuVar.c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            seuVar.c = null;
                                        } catch (Exception e) {
                                            Log.e(seu.e, "Error unscheduling indexing job", e);
                                        }
                                    }
                                } catch (Throwable th) {
                                    bp6.a(seuVar, th);
                                }
                            }
                            SensorManager sensorManager = ds4.b;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(ds4.a);
                            }
                        }
                    } catch (Throwable th2) {
                        bp6.a(ds4.class, th2);
                    }
                }
                oh.b.execute(new mh(currentTimeMillis, m));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Unit unit;
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                x3n x3nVar = d;
                if (x3nVar != null) {
                    x3nVar.L0(1);
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    c = true;
                    return;
                }
                return;
            case 1:
                HashMap hashMap = lsg.d;
                String str = oh.a;
                b3i.Q(tsg.b, oh.a, "onActivityResumed");
                oh.k = new WeakReference(activity);
                oh.e.incrementAndGet();
                oh.a();
                long currentTimeMillis = System.currentTimeMillis();
                oh.i = currentTimeMillis;
                String m = gvt.m(activity);
                teu teuVar = ds4.a;
                Set set = bp6.a;
                if (!set.contains(ds4.class)) {
                    try {
                        if (ds4.e.get()) {
                            gs4.g.A().h(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String c2 = j3c.c();
                            n8c b2 = q8c.b(c2);
                            if (b2 != null && b2.g) {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                ds4.b = sensorManager;
                                if (sensorManager != null) {
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    ds4.c = new seu(activity);
                                    pt0 pt0Var = new pt0((Object) b2, (Object) c2, false);
                                    if (!set.contains(teuVar)) {
                                        try {
                                            teuVar.a = pt0Var;
                                        } catch (Throwable th) {
                                            bp6.a(teuVar, th);
                                        }
                                    }
                                    SensorManager sensorManager2 = ds4.b;
                                    if (sensorManager2 == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    sensorManager2.registerListener(teuVar, defaultSensor, 2);
                                    if (b2.g) {
                                        seu seuVar = ds4.c;
                                        if (seuVar == null) {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                        seuVar.c();
                                    }
                                    bp6.a.contains(ds4.class);
                                }
                            }
                            set.contains(ds4.class);
                            bp6.a.contains(ds4.class);
                        }
                    } catch (Throwable th2) {
                        bp6.a(ds4.class, th2);
                    }
                }
                boolean z = x2i.b;
                if (!bp6.a.contains(x2i.class)) {
                    try {
                        if (x2i.b) {
                            CopyOnWriteArraySet copyOnWriteArraySet = h3i.d;
                            if (!new HashSet(h3i.a()).isEmpty()) {
                                HashMap hashMap2 = i3i.e;
                                kjn.f(activity);
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        bp6.a(x2i.class, th3);
                    }
                }
                oqr.d(activity);
                vee.a();
                oh.b.execute(new nh(activity.getApplicationContext(), m, currentTimeMillis));
                return;
            default:
                try {
                    j3c.d().execute(q.h);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
        activity.getClass();
        bundle.getClass();
        switch (i) {
            case 1:
                HashMap hashMap = lsg.d;
                b3i.Q(tsg.b, oh.a, "onActivitySaveInstanceState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 1:
                oh.j++;
                HashMap hashMap = lsg.d;
                b3i.Q(tsg.b, oh.a, "onActivityStarted");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                break;
            case 1:
                HashMap hashMap = lsg.d;
                b3i.Q(tsg.b, oh.a, "onActivityStopped");
                pa7 pa7Var = lt0.a;
                if (!bp6.a.contains(lt0.class)) {
                    try {
                        lt0.b.execute(q.f);
                    } catch (Throwable th) {
                        bp6.a(lt0.class, th);
                    }
                }
                oh.j--;
                break;
            default:
                try {
                    AtomicBoolean atomicBoolean = pee.a;
                    if (Intrinsics.d(pee.c, Boolean.TRUE) && Intrinsics.d(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        j3c.d().execute(q.i);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
