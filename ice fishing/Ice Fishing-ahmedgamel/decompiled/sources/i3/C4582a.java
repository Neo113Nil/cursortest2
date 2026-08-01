package i3;

import B0.c;
import E.e;
import P2.w;
import T2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import e3.C4462a;
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

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4582a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f38043n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f38044o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f38045p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f38046a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f38047b;

    /* renamed from: c, reason: collision with root package name */
    public int f38048c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f38049d;

    /* renamed from: e, reason: collision with root package name */
    public long f38050e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f38051f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38052g;

    /* renamed from: h, reason: collision with root package name */
    public C4462a f38053h;
    public final T2.a i;

    /* renamed from: j, reason: collision with root package name */
    public final String f38054j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f38055k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f38056l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f38057m;

    public C4582a(Context context) {
        boolean z3;
        String packageName = context.getPackageName();
        this.f38046a = new Object();
        this.f38048c = 0;
        this.f38051f = new HashSet();
        this.f38052g = true;
        this.i = T2.a.f3077a;
        this.f38055k = new HashMap();
        this.f38056l = new AtomicInteger(0);
        w.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f38053h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f38054j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f38054j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new c(sb.toString());
        }
        this.f38047b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f3089a;
        synchronized (d.class) {
            Boolean bool = d.f3091c;
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                z3 = e.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f3091c = Boolean.valueOf(z3);
            }
        }
        if (z3) {
            int i = T2.c.f3088a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo b9 = V2.c.a(context).b(0, packageName);
                    if (b9 == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i6 = b9.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f3090b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i6), packageName);
                            } catch (Exception e9) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
                            }
                        } else {
                            Method method3 = d.f3089a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i6));
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
                    this.f38047b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f38044o;
        if (scheduledExecutorService == null) {
            synchronized (f38045p) {
                try {
                    scheduledExecutorService = f38044o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f38044o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f38057m = scheduledExecutorService;
    }

    public final void a(long j6) {
        this.f38056l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f38043n), 1L);
        if (j6 > 0) {
            max = Math.min(j6, max);
        }
        synchronized (this.f38046a) {
            try {
                if (!b()) {
                    this.f38053h = C4462a.f37194n;
                    this.f38047b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f38048c++;
                if (this.f38052g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f38055k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f38055k.put(null, bVar);
                }
                bVar.f38058a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j9 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j9 > this.f38050e) {
                    this.f38050e = j9;
                    ScheduledFuture scheduledFuture = this.f38049d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f38049d = this.f38057m.schedule(new G0.c(25, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f38046a) {
            z3 = this.f38048c > 0;
        }
        return z3;
    }

    public final void c() {
        if (this.f38056l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f38054j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f38046a) {
            try {
                if (this.f38052g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f38055k.containsKey(null)) {
                    b bVar = (b) this.f38055k.get(null);
                    if (bVar != null) {
                        int i = bVar.f38058a - 1;
                        bVar.f38058a = i;
                        if (i == 0) {
                            this.f38055k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f38054j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f38051f;
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
        synchronized (this.f38046a) {
            try {
                if (b()) {
                    if (this.f38052g) {
                        int i = this.f38048c - 1;
                        this.f38048c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f38048c = 0;
                    }
                    d();
                    Iterator it = this.f38055k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f38058a = 0;
                    }
                    this.f38055k.clear();
                    ScheduledFuture scheduledFuture = this.f38049d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f38049d = null;
                        this.f38050e = 0L;
                    }
                    if (this.f38047b.isHeld()) {
                        try {
                            try {
                                this.f38047b.release();
                                if (this.f38053h != null) {
                                    this.f38053h = null;
                                }
                            } catch (RuntimeException e9) {
                                if (!e9.getClass().equals(RuntimeException.class)) {
                                    throw e9;
                                }
                                Log.e("WakeLock", String.valueOf(this.f38054j).concat(" failed to release!"), e9);
                                if (this.f38053h != null) {
                                    this.f38053h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f38053h != null) {
                                this.f38053h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f38054j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
