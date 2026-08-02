package com.google.android.gms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzi;
import com.squareup.util.Strings;
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

/* loaded from: classes4.dex */
public final class WakeLock {
    public static volatile ScheduledExecutorService zzc;
    public static final Object zzd = new Object();
    public zzb zza;
    public final Object zzf;
    public final PowerManager.WakeLock zzg;
    public int zzh;
    public ScheduledFuture zzi;
    public long zzj;
    public final HashSet zzk;
    public boolean zzl;
    public final DefaultClock zzn;
    public final String zzp;
    public final HashMap zzs;
    public final AtomicInteger zzt;
    public final ScheduledExecutorService zzu;

    public WakeLock(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.zzf = new Object();
        this.zzh = 0;
        this.zzk = new HashSet();
        this.zzl = true;
        this.zzn = DefaultClock.zza;
        this.zzs = new HashMap();
        this.zzt = new AtomicInteger(0);
        zzae.checkNotEmpty("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.zza = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzp = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.zzp = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.zzg = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = WorkSourceUtil.zzb;
        synchronized (WorkSourceUtil.class) {
            Boolean bool = WorkSourceUtil.zzj;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = Strings.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                WorkSourceUtil.zzj = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = com.google.android.gms.common.util.Strings.$r8$clinit;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(0, packageName);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        WorkSourceUtil.add(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.zzg.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = zzc;
        if (scheduledExecutorService == null) {
            synchronized (zzd) {
                try {
                    scheduledExecutorService = zzc;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        zzc = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.zzu = scheduledExecutorService;
    }

    public final void acquire() {
        this.zzt.incrementAndGet();
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.zzf) {
            try {
                if (!isHeld()) {
                    this.zza = zzb.zza;
                    this.zzg.acquire();
                    this.zzn.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.zzh++;
                if (this.zzl) {
                    TextUtils.isEmpty(null);
                }
                zzc zzcVar = (zzc) this.zzs.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc();
                    this.zzs.put(null, zzcVar);
                }
                zzcVar.zza++;
                this.zzn.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.zzj) {
                    this.zzj = j;
                    ScheduledFuture scheduledFuture = this.zzi;
                    int i = 0;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zzi = this.zzu.schedule(new zza(this, i), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isHeld() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzh > 0;
        }
        return z;
    }

    public final void release() {
        if (this.zzt.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.zzp).concat(" release without a matched acquire!"));
        }
        synchronized (this.zzf) {
            try {
                if (this.zzl) {
                    TextUtils.isEmpty(null);
                }
                if (this.zzs.containsKey(null)) {
                    zzc zzcVar = (zzc) this.zzs.get(null);
                    if (zzcVar != null) {
                        int i = zzcVar.zza - 1;
                        zzcVar.zza = i;
                        if (i == 0) {
                            this.zzs.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.zzp).concat(" counter does not exist"));
                }
                zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        HashSet hashSet = this.zzk;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public final void zzd() {
        synchronized (this.zzf) {
            try {
                if (isHeld()) {
                    if (this.zzl) {
                        int i = this.zzh - 1;
                        this.zzh = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.zzh = 0;
                    }
                    zzc();
                    Iterator it = this.zzs.values().iterator();
                    while (it.hasNext()) {
                        ((zzc) it.next()).zza = 0;
                    }
                    this.zzs.clear();
                    ScheduledFuture scheduledFuture = this.zzi;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.zzi = null;
                        this.zzj = 0L;
                    }
                    if (this.zzg.isHeld()) {
                        try {
                            try {
                                this.zzg.release();
                                if (this.zza != null) {
                                    this.zza = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.zzp).concat(" failed to release!"), e);
                                if (this.zza != null) {
                                    this.zza = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.zza != null) {
                                this.zza = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.zzp).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
