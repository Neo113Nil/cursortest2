package k3;

import B0.c;
import E.e;
import R2.w;
import V2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import g3.C4531a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4643a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f38580n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f38581o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f38582p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f38583a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f38584b;

    /* renamed from: c, reason: collision with root package name */
    public int f38585c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f38586d;

    /* renamed from: e, reason: collision with root package name */
    public long f38587e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f38588f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38589g;

    /* renamed from: h, reason: collision with root package name */
    public C4531a f38590h;
    public final V2.a i;

    /* renamed from: j, reason: collision with root package name */
    public final String f38591j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f38592k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f38593l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f38594m;

    public C4643a(Context context) {
        boolean z6;
        String packageName = context.getPackageName();
        this.f38583a = new Object();
        this.f38585c = 0;
        this.f38588f = new HashSet();
        this.f38589g = true;
        this.i = V2.a.f3393a;
        this.f38592k = new HashMap();
        this.f38593l = new AtomicInteger(0);
        w.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f38590h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f38591j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f38591j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new c(sb.toString());
        }
        this.f38584b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f3405a;
        synchronized (d.class) {
            Boolean bool = d.f3407c;
            if (bool != null) {
                z6 = bool.booleanValue();
            } else {
                z6 = e.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f3407c = Boolean.valueOf(z6);
            }
        }
        if (z6) {
            int i = V2.c.f3404a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo f2 = X2.b.a(context).f(0, packageName);
                    if (f2 == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i4 = f2.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f3406b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i4), packageName);
                            } catch (Exception e9) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
                            }
                        } else {
                            Method method3 = d.f3405a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i4));
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f38584b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f38581o;
        if (scheduledExecutorService == null) {
            synchronized (f38582p) {
                try {
                    scheduledExecutorService = f38581o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f38581o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f38594m = scheduledExecutorService;
    }

    public final void a(long j6) {
        this.f38593l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f38580n), 1L);
        if (j6 > 0) {
            max = Math.min(j6, max);
        }
        synchronized (this.f38583a) {
            try {
                if (!b()) {
                    this.f38590h = C4531a.f37670n;
                    this.f38584b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f38585c++;
                if (this.f38589g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f38592k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f38592k.put(null, bVar);
                }
                bVar.f38595a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j9 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j9 > this.f38587e) {
                    this.f38587e = j9;
                    ScheduledFuture scheduledFuture = this.f38586d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f38586d = this.f38594m.schedule(new G0.c(25, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z6;
        synchronized (this.f38583a) {
            z6 = this.f38585c > 0;
        }
        return z6;
    }

    public final void c() {
        if (this.f38593l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f38591j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f38583a) {
            try {
                if (this.f38589g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f38592k.containsKey(null)) {
                    b bVar = (b) this.f38592k.get(null);
                    if (bVar != null) {
                        int i = bVar.f38595a - 1;
                        bVar.f38595a = i;
                        if (i == 0) {
                            this.f38592k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f38591j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f38588f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f38583a) {
            try {
                if (b()) {
                    if (this.f38589g) {
                        int i = this.f38585c - 1;
                        this.f38585c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f38585c = 0;
                    }
                    d();
                    Iterator it = this.f38592k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f38595a = 0;
                    }
                    this.f38592k.clear();
                    ScheduledFuture scheduledFuture = this.f38586d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f38586d = null;
                        this.f38587e = 0L;
                    }
                    if (this.f38584b.isHeld()) {
                        try {
                            try {
                                this.f38584b.release();
                                if (this.f38590h != null) {
                                    this.f38590h = null;
                                }
                            } catch (RuntimeException e9) {
                                if (!e9.getClass().equals(RuntimeException.class)) {
                                    throw e9;
                                }
                                Log.e("WakeLock", String.valueOf(this.f38591j).concat(" failed to release!"), e9);
                                if (this.f38590h != null) {
                                    this.f38590h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f38590h != null) {
                                this.f38590h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f38591j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
