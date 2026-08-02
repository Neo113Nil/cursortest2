package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.measurement.internal.zzhf;
import com.squareup.cash.db.WireAdapter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt__ExceptionsKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.FailedPlan;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RoutePlanner$ConnectResult;
import okhttp3.internal.connection.RoutePlanner$Plan;

/* loaded from: classes.dex */
public final class zzhf implements ExchangeFinder {
    public final Object zza;
    public final Object zzb;
    public final Object zzc;
    public final Serializable zzd;
    public long zze;

    public /* synthetic */ zzhf(zzhh zzhhVar, long j) {
        this.zzb = zzhhVar;
        zzae.checkNotEmpty("health_monitor");
        zzae.checkArgument(j > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j;
    }

    public void cancelInFlightConnects() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.zzd;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner$Plan routePlanner$Plan = (RoutePlanner$Plan) it.next();
            routePlanner$Plan.cancel();
            RoutePlanner$Plan retry = routePlanner$Plan.retry();
            if (retry != null) {
                ((RealRoutePlanner) this.zza).deferredPlans.addLast(retry);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0058, B:64:0x0066, B:67:0x0073, B:25:0x007c, B:27:0x0082, B:31:0x008b, B:33:0x0096, B:34:0x009c, B:36:0x00a0, B:41:0x00a7, B:44:0x00b1, B:46:0x00b5, B:49:0x00bb, B:50:0x00bf, B:52:0x00c3, B:53:0x00c4, B:56:0x00c8, B:69:0x004c, B:71:0x00d3, B:72:0x00da), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0058, B:64:0x0066, B:67:0x0073, B:25:0x007c, B:27:0x0082, B:31:0x008b, B:33:0x0096, B:34:0x009c, B:36:0x00a0, B:41:0x00a7, B:44:0x00b1, B:46:0x00b5, B:49:0x00bb, B:50:0x00bf, B:52:0x00c3, B:53:0x00c4, B:56:0x00c8, B:69:0x004c, B:71:0x00d3, B:72:0x00da), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0058, B:64:0x0066, B:67:0x0073, B:25:0x007c, B:27:0x0082, B:31:0x008b, B:33:0x0096, B:34:0x009c, B:36:0x00a0, B:41:0x00a7, B:44:0x00b1, B:46:0x00b5, B:49:0x00bb, B:50:0x00bf, B:52:0x00c3, B:53:0x00c4, B:56:0x00c8, B:69:0x004c, B:71:0x00d3, B:72:0x00da), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.ExchangeFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RealConnection find() {
        RoutePlanner$ConnectResult launchTcpConnect;
        long j;
        Throwable th;
        RoutePlanner$Plan routePlanner$Plan;
        RoutePlanner$ConnectResult routePlanner$ConnectResult;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.zzd).isEmpty() && !((RealRoutePlanner) this.zza).hasNext(null)) {
                    cancelInFlightConnects();
                    iOException.getClass();
                    throw iOException;
                }
                if (((RealRoutePlanner) this.zza).call.canceled) {
                    throw new IOException("Canceled");
                }
                WireAdapter wireAdapter = ((TaskRunner) this.zzc).backend;
                long nanoTime = System.nanoTime();
                long j2 = this.zze - nanoTime;
                if (!((CopyOnWriteArrayList) this.zzd).isEmpty() && j2 > 0) {
                    j = j2;
                    launchTcpConnect = null;
                    if (launchTcpConnect != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.zzd;
                        if (!copyOnWriteArrayList.isEmpty() && (routePlanner$ConnectResult = (RoutePlanner$ConnectResult) ((LinkedBlockingDeque) this.zzb).poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(routePlanner$ConnectResult.plan);
                            launchTcpConnect = routePlanner$ConnectResult;
                            if (launchTcpConnect != null) {
                            }
                        }
                        launchTcpConnect = null;
                        if (launchTcpConnect != null) {
                        }
                    }
                    boolean z = false;
                    if (launchTcpConnect.nextPlan != null && launchTcpConnect.throwable == null) {
                        cancelInFlightConnects();
                        if (!launchTcpConnect.plan.isReady()) {
                            launchTcpConnect = launchTcpConnect.plan.connectTlsEtc();
                        }
                        if (launchTcpConnect.nextPlan == null && launchTcpConnect.throwable == null) {
                            z = true;
                        }
                        if (z) {
                            return launchTcpConnect.plan.handleSuccess();
                        }
                    }
                    th = launchTcpConnect.throwable;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            ExceptionsKt__ExceptionsKt.addSuppressed(iOException, th);
                        }
                    }
                    routePlanner$Plan = launchTcpConnect.nextPlan;
                    if (routePlanner$Plan == null) {
                        ((RealRoutePlanner) this.zza).deferredPlans.addFirst(routePlanner$Plan);
                    }
                }
                launchTcpConnect = launchTcpConnect();
                j = 250000000;
                this.zze = nanoTime + 250000000;
                if (launchTcpConnect != null) {
                }
                boolean z2 = false;
                if (launchTcpConnect.nextPlan != null && launchTcpConnect.throwable == null) {
                }
                th = launchTcpConnect.throwable;
                if (th != null) {
                }
                routePlanner$Plan = launchTcpConnect.nextPlan;
                if (routePlanner$Plan == null) {
                }
            } finally {
                cancelInFlightConnects();
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RealRoutePlanner getRoutePlanner() {
        return (RealRoutePlanner) this.zza;
    }

    public RoutePlanner$ConnectResult launchTcpConnect() {
        final RoutePlanner$Plan failedPlan;
        RealRoutePlanner realRoutePlanner = (RealRoutePlanner) this.zza;
        if (realRoutePlanner.hasNext(null)) {
            try {
                failedPlan = realRoutePlanner.plan();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.isReady()) {
                return new RoutePlanner$ConnectResult(failedPlan, (Throwable) null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).result;
            }
            ((CopyOnWriteArrayList) this.zzd).add(failedPlan);
            final String str = _UtilJvmKt.okHttpName + " connect " + realRoutePlanner.address.url.redact();
            ((TaskRunner) this.zzc).newQueue().schedule(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long runOnce() {
                    RoutePlanner$ConnectResult routePlanner$ConnectResult;
                    RoutePlanner$Plan routePlanner$Plan = failedPlan;
                    try {
                        routePlanner$ConnectResult = routePlanner$Plan.connectTcp();
                    } catch (Throwable th2) {
                        routePlanner$ConnectResult = new RoutePlanner$ConnectResult(routePlanner$Plan, th2, 2);
                    }
                    zzhf zzhfVar = this;
                    if (!((CopyOnWriteArrayList) zzhfVar.zzd).contains(routePlanner$Plan)) {
                        return -1L;
                    }
                    ((LinkedBlockingDeque) zzhfVar.zzb).put(routePlanner$ConnectResult);
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }

    public void zzc() {
        zzhh zzhhVar = (zzhh) this.zzb;
        zzhhVar.zzg();
        ((zzic) zzhhVar.$$delegate_0).zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = zzhhVar.zzd().edit();
        edit.remove((String) this.zzc);
        edit.remove((String) this.zzd);
        edit.putLong((String) this.zza, currentTimeMillis);
        edit.apply();
    }

    public zzhf(RealRoutePlanner realRoutePlanner, TaskRunner taskRunner) {
        taskRunner.getClass();
        this.zza = realRoutePlanner;
        this.zzc = taskRunner;
        this.zze = Long.MIN_VALUE;
        this.zzd = new CopyOnWriteArrayList();
        this.zzb = new LinkedBlockingDeque();
    }
}
