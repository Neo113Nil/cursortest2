package com.google.mlkit.common.sdkinternal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.trifle.KeyHandle$keyPair$2;
import coil3.request.OneShotDisposable;
import com.bugsnag.android.AnrDetailsCollector;
import com.bugsnag.android.Client;
import com.bugsnag.android.Error;
import com.bugsnag.android.Event;
import com.bugsnag.android.EventInternal;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$1;
import com.datadog.android.core.internal.utils.MiscUtilsKt;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.internal.zzbor;
import com.google.android.libraries.places.internal.zzbqm;
import com.google.android.libraries.places.internal.zzbtq;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbty;
import com.google.android.libraries.places.internal.zzbzg;
import com.google.android.libraries.places.internal.zzchc;
import com.google.android.libraries.places.internal.zzchs;
import com.google.android.libraries.places.internal.zzchy;
import com.google.android.libraries.places.internal.zzcid;
import com.google.android.libraries.places.internal.zzcif;
import com.google.android.libraries.places.internal.zzciq;
import com.google.android.libraries.places.internal.zzciu;
import com.google.android.libraries.places.internal.zzcjb;
import com.google.android.libraries.places.internal.zzcje;
import com.google.android.libraries.places.internal.zzcjo;
import com.google.android.libraries.places.internal.zzcll;
import com.google.android.libraries.places.internal.zzclm;
import com.google.android.libraries.places.internal.zzclt;
import com.google.android.libraries.places.internal.zzclv;
import com.google.android.libraries.places.internal.zzclw;
import com.google.android.libraries.places.internal.zzcly;
import com.google.android.libraries.places.internal.zzcmd;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzie;
import com.google.android.libraries.places.internal.zzjn;
import com.google.mlkit.common.MlKitException;
import com.squareup.util.Strings;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzn implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public final Object zzb;
    public final Object zzc;
    public final Object zzd;
    public final Object zze;

    public zzn(File file, File file2, FileMover fileMover, InternalLogger internalLogger, Strings strings) {
        this.$r8$classId = 2;
        internalLogger.getClass();
        strings.getClass();
        this.zza = file;
        this.zzb = file2;
        this.zzc = fileMover;
        this.zzd = internalLogger;
        this.zze = strings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        if (r4 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void run$com$bugsnag$android$AnrDetailsCollector$collectAnrErrorDetails$1() {
        Object failure;
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        Object obj;
        Event event = (Event) this.zze;
        EventInternal eventInternal = event.impl;
        AnrDetailsCollector anrDetailsCollector = (AnrDetailsCollector) this.zza;
        Client client = (Client) this.zzb;
        Context context = client.appContext;
        anrDetailsCollector.getClass();
        try {
            Result.Companion companion = Result.Companion;
            Object systemService = context.getSystemService("activity");
            failure = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        ActivityManager activityManager = (ActivityManager) failure;
        int myPid = Process.myPid();
        if (activityManager != null) {
            try {
                processesInErrorState = activityManager.getProcessesInErrorState();
            } catch (RuntimeException unused) {
                processErrorStateInfo = null;
            }
        }
        processesInErrorState = EmptyList.INSTANCE;
        Iterator<T> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ActivityManager.ProcessErrorStateInfo) obj).pid == myPid) {
                    break;
                }
            }
        }
        processErrorStateInfo = (ActivityManager.ProcessErrorStateInfo) obj;
        if (processErrorStateInfo == null) {
            if (((AtomicInteger) this.zzc).getAndIncrement() < 300) {
                ((Handler) this.zzd).postDelayed(this, 100L);
                return;
            }
            return;
        }
        String str = processErrorStateInfo.shortMsg;
        if (!eventInternal.errors.isEmpty()) {
            Error error = (Error) eventInternal.errors.get(0);
            if (StringsKt__StringsJVMKt.startsWith(str, "ANR", false)) {
                str = StringsKt__StringsJVMKt.replaceFirst(str, "ANR", "", false);
            }
            error.impl.errorMessage = str;
        }
        client.populateAndNotifyAndroidEvent(event, null);
    }

    private final void run$com$google$android$gms$measurement$internal$zzmv() {
        AtomicReference atomicReference;
        zznl zznlVar;
        zzgb zzgbVar;
        AtomicReference atomicReference2 = (AtomicReference) this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznlVar = (zznl) this.zze;
                    zzgbVar = zznlVar.zzb;
                } catch (RemoteException e) {
                    zzgu zzguVar = ((zzic) ((zznl) this.zze).$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zzd("(legacy) Failed to get conditional properties; remote exception", null, (String) this.zzb, e);
                    ((AtomicReference) this.zza).set(Collections.EMPTY_LIST);
                    atomicReference = (AtomicReference) this.zza;
                }
                if (zzgbVar == null) {
                    zzgu zzguVar2 = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzd("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.zzb, (String) this.zzc);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    atomicReference2.set(zzgbVar.zzr((String) this.zzb, (String) this.zzc, (zzr) this.zzd));
                } else {
                    atomicReference2.set(zzgbVar.zzs(null, (String) this.zzb, (String) this.zzc));
                }
                zznlVar.zzae();
                atomicReference = (AtomicReference) this.zza;
                atomicReference.notify();
            } catch (Throwable th) {
                ((AtomicReference) this.zza).notify();
                throw th;
            }
        }
    }

    private final void run$com$google$android$gms$measurement$internal$zzmw() {
        zzpp zzppVar;
        zzgb zzgbVar;
        zzcs zzcsVar = (zzcs) this.zzd;
        String str = (String) this.zzb;
        String str2 = (String) this.zza;
        zznl zznlVar = (zznl) this.zze;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzgbVar = zznlVar.zzb;
            } catch (RemoteException e) {
                zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zzd("Failed to get conditional properties; remote exception", str2, str, e);
            }
            if (zzgbVar != null) {
                arrayList = zzpp.zzav(zzgbVar.zzr(str2, str, (zzr) this.zzc));
                zznlVar.zzae();
                zzppVar = ((zzic) zznlVar.$$delegate_0).zzl;
                zzic.zzN(zzppVar);
                zzppVar.zzau(zzcsVar, arrayList);
            }
            zzic zzicVar = (zzic) zznlVar.$$delegate_0;
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Failed to get conditional properties; not connected to service", str2, str);
            zzppVar = zzicVar.zzl;
            zzic.zzN(zzppVar);
            zzppVar.zzau(zzcsVar, arrayList);
        } catch (Throwable th) {
            zzpp zzppVar2 = ((zzic) zznlVar.$$delegate_0).zzl;
            zzic.zzN(zzppVar2);
            zzppVar2.zzau(zzcsVar, arrayList);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchy zzchyVar;
        com.google.android.gms.cloudmessaging.zzh zzhVar;
        switch (this.$r8$classId) {
            case 0:
                MLTask mLTask = (MLTask) this.zza;
                com.google.android.gms.tasks.zzb zzbVar = (com.google.android.gms.tasks.zzb) this.zzb;
                OneShotDisposable oneShotDisposable = (OneShotDisposable) this.zzc;
                Callable callable = (Callable) this.zzd;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zze;
                AtomicBoolean atomicBoolean = mLTask.zzb;
                zzw zzwVar = (zzw) zzbVar.zza;
                try {
                    if (zzwVar.isComplete()) {
                        oneShotDisposable.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            mLTask.load();
                            atomicBoolean.set(true);
                        }
                        if (zzwVar.isComplete()) {
                            oneShotDisposable.cancel();
                            return;
                        }
                        Object call = callable.call();
                        if (zzwVar.isComplete()) {
                            oneShotDisposable.cancel();
                            return;
                        } else {
                            taskCompletionSource.setResult(call);
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw new MlKitException(13, e, "Internal error has occurred when executing ML Kit tasks");
                    }
                } catch (Exception e2) {
                    if (zzwVar.isComplete()) {
                        oneShotDisposable.cancel();
                        return;
                    } else {
                        taskCompletionSource.setException(e2);
                        return;
                    }
                }
            case 1:
                run$com$bugsnag$android$AnrDetailsCollector$collectAnrErrorDetails$1();
                return;
            case 2:
                InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
                if (((File) this.zza) == null) {
                    DBUtil.log$default((InternalLogger) this.zzd, 4, target, MoveDataMigrationOperation$run$1.INSTANCE, null, false, 56);
                    return;
                }
                File file = (File) this.zzb;
                InternalLogger internalLogger = (InternalLogger) this.zzd;
                if (file == null) {
                    DBUtil.log$default(internalLogger, 4, target, MoveDataMigrationOperation$run$1.INSTANCE$1, null, false, 56);
                    return;
                } else {
                    MiscUtilsKt.retryWithDelay(internalLogger, (Strings) this.zze, new KeyHandle$keyPair$2(this, 15));
                    return;
                }
            case 3:
                zzjd zzjdVar = (zzjd) this.zza;
                zzr zzrVar = (zzr) this.zzb;
                Bundle bundle = (Bundle) this.zzc;
                zzge zzgeVar = (zzge) this.zzd;
                String str = (String) this.zze;
                zzpg zzpgVar = zzjdVar.zza;
                zzpgVar.zzaa$1();
                try {
                    zzgeVar.zze(zzpgVar.zzar(bundle, zzrVar));
                    return;
                } catch (RemoteException e3) {
                    zzpgVar.zzaW().zzd.zzc("Failed to return trigger URIs for app", str, e3);
                    return;
                }
            case 4:
                run$com$google$android$gms$measurement$internal$zzmv();
                return;
            case 5:
                run$com$google$android$gms$measurement$internal$zzmw();
                return;
            default:
                zzcly zzclyVar = new zzcly(new zzchs());
                try {
                } catch (zzbty e4) {
                    e = e4;
                } catch (Exception e5) {
                    e = e5;
                }
                try {
                    try {
                        ((CountDownLatch) this.zza).await();
                        ((CyclicBarrier) this.zzb).await(1000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        th = th;
                        zzchy zzchyVar2 = (zzchy) this.zze;
                        zzchyVar2.zzo.getClass();
                        zzchyVar2.zzB = new com.google.android.gms.cloudmessaging.zzh(zzchyVar2, new zzcjo(zzclyVar));
                        ((CountDownLatch) this.zzd).countDown();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (BrokenBarrierException | TimeoutException unused2) {
                    zzchyVar = (zzchy) this.zze;
                    zzchyVar.zzag(0, zzcje.INTERNAL_ERROR, zzbtx.zzi.zze("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                    zzchyVar.zzo.getClass();
                    zzhVar = new com.google.android.gms.cloudmessaging.zzh(zzchyVar, new zzcjo(zzclyVar));
                    zzchyVar.zzB = zzhVar;
                    ((CountDownLatch) this.zzd).countDown();
                    return;
                }
                zzchy zzchyVar3 = (zzchy) this.zze;
                zzbqm zzbqmVar = zzchyVar3.zzb;
                if (zzbqmVar == null) {
                    zzchyVar3.zzg = zzchyVar3.zzI.createSocket(zzchyVar3.zzi.getAddress(), zzchyVar3.zzi.getPort());
                } else {
                    SocketAddress socketAddress = zzbqmVar.zza;
                    if (!(socketAddress instanceof InetSocketAddress)) {
                        zzbtx zzbtxVar = zzbtx.zzh;
                        String valueOf = String.valueOf(socketAddress.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 41);
                        sb.append("Unsupported SocketAddress implementation ");
                        sb.append(valueOf);
                        throw new zzbty(zzbtxVar.zze(sb.toString()));
                    }
                    zzchyVar3.zzg = zzchyVar3.zzt(zzbqmVar.zzb, (InetSocketAddress) socketAddress, zzbqmVar.zzd, zzbqmVar.zze);
                }
                SSLSocketFactory sSLSocketFactory = zzchyVar3.zzJ;
                if (sSLSocketFactory != null) {
                    zzciu zzciuVar = zzchyVar3.zzK;
                    Socket socket = zzchyVar3.zzg;
                    String str2 = zzchyVar3.zzj;
                    URI zzb = zzbzg.zzb(str2);
                    if (zzb.getHost() != null) {
                        str2 = zzb.getHost();
                    }
                    int zzl = zzchyVar3.zzl();
                    zzciq zzciqVar = zzchyVar3.zzO;
                    List list = zzcif.zza;
                    Trace.checkNotNull(socket, "socket");
                    Trace.checkNotNull(zzciqVar, "spec");
                    SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str2, zzl, true);
                    zzciqVar.zzb(sSLSocket);
                    String zza = zzcid.zzd.zza(sSLSocket, str2, zzciqVar.zzc ? zzcif.zza : null);
                    List list2 = zzcif.zza;
                    boolean contains = list2.contains(zzcjb.zza(zza));
                    String valueOf2 = String.valueOf(list2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 50);
                    sb2.append("Only ");
                    sb2.append(valueOf2);
                    sb2.append(" are supported, but negotiated protocol is %s");
                    Trace.checkState(sb2.toString(), zza, contains);
                    if (!zzciuVar.verify((str2.startsWith("[") && str2.endsWith("]")) ? str2.substring(1, str2.length() - 1) : str2, sSLSocket.getSession())) {
                        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str2));
                    }
                    zzchyVar3.zzh = sSLSocket.getSession();
                    zzchyVar3.zzg = sSLSocket;
                }
                zzchyVar3.zzg.setTcpNoDelay(true);
                Socket socket2 = zzchyVar3.zzg;
                int i = zzclv.$r8$clinit;
                socket2.getClass();
                zzcmd zzcmdVar = new zzcmd();
                InputStream inputStream = socket2.getInputStream();
                inputStream.getClass();
                zzcly zzclyVar2 = new zzcly(new zzclm(new zzclt(inputStream, zzcmdVar)));
                try {
                    zzchc zzchcVar = (zzchc) this.zzc;
                    Socket socket3 = zzchyVar3.zzg;
                    socket3.getClass();
                    zzcmd zzcmdVar2 = new zzcmd();
                    OutputStream outputStream = socket3.getOutputStream();
                    outputStream.getClass();
                    zzchcVar.zzb(new zzcll(new zzclw(outputStream, zzcmdVar2)), zzchyVar3.zzg);
                    zzbor zzborVar = zzchyVar3.zzC;
                    zzborVar.getClass();
                    zbc zbcVar = new zbc(zzborVar);
                    zbcVar.zza(zzie.zza, zzchyVar3.zzg.getRemoteSocketAddress());
                    zbcVar.zza(zzie.zzb, zzchyVar3.zzg.getLocalSocketAddress());
                    zbcVar.zza(zzie.zzc, zzchyVar3.zzh);
                    zbcVar.zza(zzjn.zza, zzchyVar3.zzh == null ? zzbtq.zza : zzbtq.zzc);
                    zzchyVar3.zzC = zbcVar.zzc();
                    zzchyVar3.zzo.getClass();
                    zzchyVar3.zzB = new com.google.android.gms.cloudmessaging.zzh(zzchyVar3, new zzcjo(zzclyVar2));
                    ((CountDownLatch) this.zzd).countDown();
                    synchronized (zzchyVar3.zzs) {
                        try {
                            Socket socket4 = zzchyVar3.zzg;
                            Trace.checkNotNull(socket4, "socket");
                            zzchyVar3.zzL = socket4;
                            SSLSession sSLSession = zzchyVar3.zzh;
                            if (sSLSession != null) {
                                new zzgc(sSLSession);
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (zzbty e6) {
                    e = e6;
                    zzclyVar = zzclyVar2;
                    ((zzchy) this.zze).zzag(0, zzcje.INTERNAL_ERROR, e.zza);
                    zzchyVar = (zzchy) this.zze;
                    zzchyVar.zzo.getClass();
                    zzhVar = new com.google.android.gms.cloudmessaging.zzh(zzchyVar, new zzcjo(zzclyVar));
                    zzchyVar.zzB = zzhVar;
                    ((CountDownLatch) this.zzd).countDown();
                    return;
                } catch (Exception e7) {
                    e = e7;
                    zzclyVar = zzclyVar2;
                    zzchy zzchyVar4 = (zzchy) this.zze;
                    zzchyVar4.zzg(e);
                    zzchyVar = zzchyVar4;
                    zzchyVar.zzo.getClass();
                    zzhVar = new com.google.android.gms.cloudmessaging.zzh(zzchyVar, new zzcjo(zzclyVar));
                    zzchyVar.zzB = zzhVar;
                    ((CountDownLatch) this.zzd).countDown();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    zzclyVar = zzclyVar2;
                    zzchy zzchyVar22 = (zzchy) this.zze;
                    zzchyVar22.zzo.getClass();
                    zzchyVar22.zzB = new com.google.android.gms.cloudmessaging.zzh(zzchyVar22, new zzcjo(zzclyVar));
                    ((CountDownLatch) this.zzd).countDown();
                    throw th;
                }
        }
    }

    public /* synthetic */ zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
        this.zzd = obj4;
        this.zze = obj5;
    }

    public /* synthetic */ zzn(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.$r8$classId = i;
        this.zza = obj2;
        this.zzb = obj3;
        this.zzc = obj4;
        this.zzd = obj5;
        this.zze = obj;
    }
}
