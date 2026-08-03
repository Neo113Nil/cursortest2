package f7;

import ac.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b4.g;
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
import p6.u;
import t6.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f2317n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f2318o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f2319p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2320a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f2321b;

    /* renamed from: c, reason: collision with root package name */
    public int f2322c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f2323d;

    /* renamed from: e, reason: collision with root package name */
    public long f2324e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f2325f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2326g;

    /* renamed from: h, reason: collision with root package name */
    public b7.a f2327h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.a f2328i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2329j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f2330k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f2331l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f2332m;

    public a(Context context) {
        boolean z10;
        String packageName = context.getPackageName();
        this.f2320a = new Object();
        this.f2322c = 0;
        this.f2325f = new HashSet();
        this.f2326g = true;
        this.f2328i = t6.a.f6531a;
        this.f2330k = new HashMap();
        this.f2331l = new AtomicInteger(0);
        u.d("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f2327h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f2329j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f2329j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new d(sb.toString());
        }
        this.f2321b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = t6.d.f6540a;
        synchronized (t6.d.class) {
            Boolean bool = t6.d.f6542c;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = y2.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                t6.d.f6542c = Boolean.valueOf(z10);
            }
        }
        if (z10) {
            int i10 = c.f6539a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = v6.b.a(context).f5771a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i11 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = t6.d.f6541b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method3 = t6.d.f6540a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
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
                    this.f2321b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f2318o;
        if (scheduledExecutorService == null) {
            synchronized (f2319p) {
                try {
                    scheduledExecutorService = f2318o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f2318o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f2332m = scheduledExecutorService;
    }

    public final void a(long j3) {
        this.f2331l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f2317n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f2320a) {
            try {
                if (!b()) {
                    this.f2327h = b7.a.f1041g;
                    this.f2321b.acquire();
                    this.f2328i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f2322c++;
                if (this.f2326g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f2330k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f2330k.put(null, bVar);
                }
                bVar.f2333a++;
                this.f2328i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j6 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j6 > this.f2324e) {
                    this.f2324e = j6;
                    ScheduledFuture scheduledFuture = this.f2323d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f2323d = this.f2332m.schedule(new g(1, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f2320a) {
            z10 = this.f2322c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f2331l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f2329j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f2320a) {
            try {
                if (this.f2326g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f2330k.containsKey(null)) {
                    b bVar = (b) this.f2330k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f2333a - 1;
                        bVar.f2333a = i10;
                        if (i10 == 0) {
                            this.f2330k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f2329j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f2325f;
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
        synchronized (this.f2320a) {
            try {
                if (b()) {
                    if (this.f2326g) {
                        int i10 = this.f2322c - 1;
                        this.f2322c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f2322c = 0;
                    }
                    d();
                    Iterator it = this.f2330k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f2333a = 0;
                    }
                    this.f2330k.clear();
                    ScheduledFuture scheduledFuture = this.f2323d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f2323d = null;
                        this.f2324e = 0L;
                    }
                    if (this.f2321b.isHeld()) {
                        try {
                            try {
                                this.f2321b.release();
                                if (this.f2327h != null) {
                                    this.f2327h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f2329j).concat(" failed to release!"), e10);
                                if (this.f2327h != null) {
                                    this.f2327h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f2327h != null) {
                                this.f2327h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f2329j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
