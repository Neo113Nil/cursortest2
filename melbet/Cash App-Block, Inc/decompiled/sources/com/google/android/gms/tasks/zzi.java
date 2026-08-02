package com.google.android.gms.tasks;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.runtime.Latch;
import androidx.room.TransactionExecutor;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.background.greedy.DelayedWorkTracker;
import androidx.work.impl.model.WorkSpec;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzaz;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlq;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzx;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.concurrent.SequentialExecutor;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LimitedDispatcher;

/* loaded from: classes.dex */
public final class zzi implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public Object zza;
    public final Object zzb;

    public zzi(zznl zznlVar, zzlu zzluVar) {
        this.$r8$classId = 6;
        this.zza = zzluVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    private final void run$com$google$android$gms$measurement$internal$zzmy() {
        zznf zznfVar = (zznf) this.zzb;
        synchronized (zznfVar) {
            try {
                zznfVar.zzb = false;
                zznl zznlVar = zznfVar.zza;
                if (!zznlVar.zzh()) {
                    zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zza("Connected to service");
                    zzgb zzgbVar = (zzgb) this.zza;
                    zznlVar.zzg();
                    zznlVar.zzb = zzgbVar;
                    zznlVar.zzae();
                    zznlVar.zzag$2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void run$com$google$android$gms$tasks$zzk() {
        zzh zzhVar = (zzh) this.zzb;
        synchronized (zzhVar.zzb) {
            try {
                OnFailureListener onFailureListener = (OnFailureListener) zzhVar.zzc;
                if (onFailureListener != null) {
                    Exception exception = ((Task) this.zza).getException();
                    com.google.android.gms.common.internal.zzae.checkNotNull(exception);
                    onFailureListener.onFailure(exception);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void run$com$google$android$gms$tasks$zzm() {
        zzh zzhVar = (zzh) this.zzb;
        synchronized (zzhVar.zzb) {
            try {
                OnSuccessListener onSuccessListener = (OnSuccessListener) zzhVar.zzc;
                if (onSuccessListener != null) {
                    onSuccessListener.onSuccess(((Task) this.zza).getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void run$com$google$firebase$concurrent$SequentialExecutor$QueueWorker() {
        try {
            workOnQueue();
        } catch (Error e) {
            synchronized (((SequentialExecutor) this.zzb).queue) {
                ((SequentialExecutor) this.zzb).workerRunningState = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:114|(1:116)(8:345|346|347|(1:349)(2:373|(4:375|351|352|(28:354|(2:356|357)(1:370)|358|359|361|362|363|118|(2:120|(2:122|(2:124|(2:126|(2:128|(2:130|(1:132)(1:338))(1:339))(1:340))(1:341))(1:342))(1:343))(1:344)|133|134|135|(1:137)(1:335)|138|(1:140)(1:334)|141|(1:143)|145|146|(1:148)(2:331|(8:333|(3:324|325|(6:327|(5:153|(1:155)(3:315|(3:318|(1:320)(1:321)|316)|322)|(1:157)(1:314)|158|(9:160|(1:162)(1:311)|163|(1:165)|166|(1:168)(1:310)|169|(1:171)|(33:308|173|(28:175|176|(2:303|(18:305|(1:192)(1:302)|193|(1:195)|196|(2:296|(1:301))(1:200)|201|(3:292|(1:294)|295)|205|(1:207)|208|(1:212)|213|(3:215|(7:217|(1:219)(1:248)|220|(1:222)|223|(4:227|(1:229)|230|(1:232))|233)(1:249)|234)(10:250|(4:252|(2:255|(6:257|(1:259)(1:289)|260|(1:262)|263|264))|290|264)(1:291)|265|(1:267)|268|269|270|271|272|(5:274|(1:276)(1:284)|(1:280)|(1:282)|283))|235|(2:237|(5:239|(1:241)|242|(1:244)|245))|246|247))(1:179)|180|(1:189)|190|(0)(0)|193|(0)|196|(1:198)|296|(1:301)|201|(1:203)|292|(0)|295|205|(0)|208|(2:210|212)|213|(0)(0)|235|(0)|246|247)|306|176|(0)|303|(0)|180|(1:189)|190|(0)(0)|193|(0)|196|(0)|296|(0)|201|(0)|292|(0)|295|205|(0)|208|(0)|213|(0)(0)|235|(0)|246|247)(31:309|306|176|(0)|303|(0)|180|(0)|190|(0)(0)|193|(0)|196|(0)|296|(0)|201|(0)|292|(0)|295|205|(0)|208|(0)|213|(0)(0)|235|(0)|246|247))(2:312|313))|323|(0)(0)|158|(0)(0)))|151|(0)|323|(0)(0)|158|(0)(0)))|149|(0)|151|(0)|323|(0)(0)|158|(0)(0))(1:371)))|350|351|352|(0)(0))|117|118|(0)(0)|133|134|135|(0)(0)|138|(0)(0)|141|(0)|145|146|(0)(0)|149|(0)|151|(0)|323|(0)(0)|158|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:345|346|347|(1:349)(2:373|(4:375|351|352|(28:354|(2:356|357)(1:370)|358|359|361|362|363|118|(2:120|(2:122|(2:124|(2:126|(2:128|(2:130|(1:132)(1:338))(1:339))(1:340))(1:341))(1:342))(1:343))(1:344)|133|134|135|(1:137)(1:335)|138|(1:140)(1:334)|141|(1:143)|145|146|(1:148)(2:331|(8:333|(3:324|325|(6:327|(5:153|(1:155)(3:315|(3:318|(1:320)(1:321)|316)|322)|(1:157)(1:314)|158|(9:160|(1:162)(1:311)|163|(1:165)|166|(1:168)(1:310)|169|(1:171)|(33:308|173|(28:175|176|(2:303|(18:305|(1:192)(1:302)|193|(1:195)|196|(2:296|(1:301))(1:200)|201|(3:292|(1:294)|295)|205|(1:207)|208|(1:212)|213|(3:215|(7:217|(1:219)(1:248)|220|(1:222)|223|(4:227|(1:229)|230|(1:232))|233)(1:249)|234)(10:250|(4:252|(2:255|(6:257|(1:259)(1:289)|260|(1:262)|263|264))|290|264)(1:291)|265|(1:267)|268|269|270|271|272|(5:274|(1:276)(1:284)|(1:280)|(1:282)|283))|235|(2:237|(5:239|(1:241)|242|(1:244)|245))|246|247))(1:179)|180|(1:189)|190|(0)(0)|193|(0)|196|(1:198)|296|(1:301)|201|(1:203)|292|(0)|295|205|(0)|208|(2:210|212)|213|(0)(0)|235|(0)|246|247)|306|176|(0)|303|(0)|180|(1:189)|190|(0)(0)|193|(0)|196|(0)|296|(0)|201|(0)|292|(0)|295|205|(0)|208|(0)|213|(0)(0)|235|(0)|246|247)(31:309|306|176|(0)|303|(0)|180|(0)|190|(0)(0)|193|(0)|196|(0)|296|(0)|201|(0)|292|(0)|295|205|(0)|208|(0)|213|(0)(0)|235|(0)|246|247))(2:312|313))|323|(0)(0)|158|(0)(0)))|151|(0)|323|(0)(0)|158|(0)(0)))|149|(0)|151|(0)|323|(0)(0)|158|(0)(0))(1:371)))|350|351|352|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0557, code lost:
    
        if (r11.zzX() == 1) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x03c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x03c8, code lost:
    
        com.google.android.gms.measurement.internal.zzic.zzP(r13);
        r13.zzd.zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r8), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x02f7, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b7 A[Catch: IllegalStateException -> 0x03c7, TRY_LEAVE, TryCatch #20 {IllegalStateException -> 0x03c7, blocks: (B:135:0x039c, B:138:0x03ab, B:141:0x03b3, B:143:0x03b7, B:335:0x03a5), top: B:134:0x039c }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03a5 A[Catch: IllegalStateException -> 0x03c7, TryCatch #20 {IllegalStateException -> 0x03c7, blocks: (B:135:0x039c, B:138:0x03ab, B:141:0x03b3, B:143:0x03b7, B:335:0x03a5), top: B:134:0x039c }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02c8 A[Catch: NameNotFoundException -> 0x02f7, TryCatch #14 {NameNotFoundException -> 0x02f7, blocks: (B:352:0x02bc, B:354:0x02c8, B:356:0x02d4), top: B:351:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x02f1  */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.google.android.gms.measurement.internal.zzle] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        PackageManager packageManager;
        String str5;
        int i;
        String str6;
        String str7;
        PackageInfo packageInfo;
        String str8;
        int zzC;
        Bundle zzq;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        zzlq zzlqVar;
        zzpp zzppVar;
        zzgs zzgsVar;
        zzic zzicVar;
        Latch latch;
        zzji zzw;
        zzji zzjiVar;
        zzic zzicVar2;
        zzic zzicVar3;
        Latch latch2;
        zzjl zzjlVar;
        zzic zzicVar4;
        zzji zzw2;
        zzji zzw3;
        Boolean zzr;
        zzhe zzheVar;
        zzx zzxVar;
        zzpp zzppVar2;
        zzic zzicVar5;
        Latch latch3;
        zzgu zzguVar;
        zzgs zzgsVar2;
        String str9;
        Bundle bundle;
        switch (this.$r8$classId) {
            case 0:
                zzh zzhVar = (zzh) this.zzb;
                synchronized (zzhVar.zzb) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) zzhVar.zzc;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.zza);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                ListenableFuture listenableFuture = (ListenableFuture) this.zza;
                boolean isCancelled = listenableFuture.isCancelled();
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.zzb;
                if (isCancelled) {
                    cancellableContinuationImpl.cancel(null);
                    return;
                }
                try {
                    Result.Companion companion = Result.Companion;
                    Object[] objArr = false;
                    while (true) {
                        try {
                            Object obj = listenableFuture.get();
                            if (objArr != false) {
                                Thread.currentThread().interrupt();
                            }
                            cancellableContinuationImpl.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            objArr = true;
                        } catch (Throwable th) {
                            if (objArr != false) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    Result.Companion companion2 = Result.Companion;
                    Throwable cause = e.getCause();
                    cause.getClass();
                    cancellableContinuationImpl.resumeWith(new Result.Failure(cause));
                    return;
                }
            case 2:
                Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
                String str10 = DelayedWorkTracker.TAG;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                WorkSpec workSpec = (WorkSpec) this.zza;
                sb.append(workSpec.id);
                logger$LogcatLogger.debug(str10, sb.toString());
                ((DelayedWorkTracker) this.zzb).mImmediateScheduler.schedule(workSpec);
                return;
            case 3:
                try {
                    ((Runnable) this.zzb).run();
                    synchronized (((TransactionExecutor) this.zza).syncLock) {
                        ((TransactionExecutor) this.zza).scheduleNext();
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((TransactionExecutor) this.zza).syncLock) {
                        ((TransactionExecutor) this.zza).scheduleNext();
                        throw th2;
                    }
                }
            case 4:
                zzjg zzjgVar = (zzjg) this.zza;
                zzjgVar.zzaV();
                if (Trifle.zza()) {
                    zzjgVar.zzaX().zzj(this);
                    return;
                }
                zzaz zzazVar = (zzaz) this.zzb;
                boolean z = zzazVar.zzd != 0;
                zzazVar.zzd = 0L;
                if (z) {
                    zzazVar.zza();
                    return;
                }
                return;
            case 5:
                zzic zzicVar6 = (zzic) this.zzb;
                zzjs zzjsVar = (zzjs) this.zza;
                String str11 = "";
                zzhz zzhzVar = zzicVar6.zzj;
                zzgu zzguVar2 = zzicVar6.zzi;
                zzhh zzhhVar = zzicVar6.zzh;
                zzpp zzppVar3 = zzicVar6.zzl;
                zzic.zzP(zzhzVar);
                zzhzVar.zzg();
                zzal zzalVar = zzicVar6.zzg;
                ((zzic) zzalVar.$$delegate_0).getClass();
                zzbb zzbbVar = new zzbb(zzicVar6);
                zzbbVar.zzx();
                zzicVar6.zzv = zzbbVar;
                zzdb zzdbVar = zzjsVar.zzd;
                long j2 = zzdbVar == null ? 0L : zzdbVar.zza;
                if (zzdbVar == null || (bundle = zzdbVar.zzd) == null) {
                    j = 0;
                } else {
                    j = 0;
                    str11 = bundle.getString("runtime_google_app_id", "");
                }
                zzgi zzgiVar = new zzgi(zzicVar6, zzjsVar.zzc, j2, str11);
                zzgiVar.zzc();
                zzicVar6.zzw = zzgiVar;
                zzgl zzglVar = new zzgl(zzicVar6);
                zzglVar.zzc();
                zzicVar6.zzt = zzglVar;
                zznl zznlVar = new zznl(zzicVar6);
                zznlVar.zzc();
                zzicVar6.zzu = zznlVar;
                boolean z2 = zzppVar3.zza;
                zzic zzicVar7 = (zzic) zzppVar3.$$delegate_0;
                if (z2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Can't initialize twice");
                    return;
                }
                zzppVar3.zzg();
                SecureRandom secureRandom = new SecureRandom();
                long nextLong = secureRandom.nextLong();
                if (nextLong == j) {
                    nextLong = secureRandom.nextLong();
                    if (nextLong == j) {
                        zzgu zzguVar3 = ((zzic) zzppVar3.$$delegate_0).zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzg.zza("Utils falling back to Random for random id");
                    }
                }
                zzppVar3.zze.set(nextLong);
                zzicVar7.zzF.incrementAndGet();
                zzppVar3.zza = true;
                if (zzhhVar.zza) {
                    a$$ExternalSyntheticBUOutline0.m$1("Can't initialize twice");
                    return;
                }
                SharedPreferences sharedPreferences = ((zzic) zzhhVar.$$delegate_0).zzd.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                zzhhVar.zzv = sharedPreferences;
                boolean z3 = sharedPreferences.getBoolean("has_been_opened", false);
                zzhhVar.zzm = z3;
                if (!z3) {
                    SharedPreferences.Editor edit = zzhhVar.zzv.edit();
                    edit.putBoolean("has_been_opened", true);
                    edit.apply();
                }
                zzhhVar.zzb = new zzhf(zzhhVar, Math.max(j, ((Long) zzfy.zzc.zzb(null)).longValue()));
                ((zzic) zzhhVar.$$delegate_0).zzF.incrementAndGet();
                zzhhVar.zza = true;
                zzgi zzgiVar2 = zzicVar6.zzw;
                if (((zzg) zzgiVar2).zza) {
                    a$$ExternalSyntheticBUOutline0.m$1("Can't initialize twice");
                    return;
                }
                String str12 = "";
                zzic zzicVar8 = (zzic) zzgiVar2.$$delegate_0;
                zzgu zzguVar4 = zzicVar8.zzi;
                zzgu zzguVar5 = zzicVar8.zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zzl.zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(zzgiVar2.zzh), Long.valueOf(zzgiVar2.zzg));
                Context context = zzicVar8.zzd;
                String packageName = context.getPackageName();
                PackageManager packageManager2 = context.getPackageManager();
                if (packageManager2 == null) {
                    zzic.zzP(zzguVar5);
                    str = "Unknown";
                    str2 = "Can't initialize twice";
                    zzguVar5.zzd.zzb(zzgu.zzl(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    packageManager = packageManager2;
                    i = Integer.MIN_VALUE;
                    str6 = "unknown";
                } else {
                    str = "Unknown";
                    str2 = "Can't initialize twice";
                    try {
                        str3 = packageManager2.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused2) {
                        zzic.zzP(zzguVar5);
                        zzguVar5.zzd.zzb(zzgu.zzl(packageName), "Error retrieving app installer package name. appId");
                        str3 = "unknown";
                    }
                    if (str3 == null) {
                        str3 = "manual_install";
                    } else if ("com.android.vending".equals(str3)) {
                        str4 = "";
                        packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo == null) {
                            CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                            String obj2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str;
                            try {
                                str8 = packageInfo.versionName;
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                            try {
                                int i2 = packageInfo.versionCode;
                                String str13 = str4;
                                str7 = str8;
                                str6 = str13;
                                packageManager = packageManager2;
                                i = i2;
                                str5 = obj2;
                            } catch (PackageManager.NameNotFoundException unused4) {
                                str = str8;
                                String str14 = obj2;
                                zzic.zzP(zzguVar5);
                                packageManager = packageManager2;
                                zzguVar5.zzd.zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str14);
                                str5 = str14;
                                i = Integer.MIN_VALUE;
                                str6 = str4;
                                str7 = str;
                                zzgiVar2.zza = packageName;
                                zzgiVar2.zzd = str6;
                                zzgiVar2.zzb = str7;
                                zzgiVar2.zzc = i;
                                zzgiVar2.zze = str5;
                                zzgiVar2.zzf = 0L;
                                zzC = zzicVar8.zzC();
                                if (zzC == 0) {
                                }
                                zzgiVar2.zzm = "";
                                str9 = zzgiVar2.zzk;
                                if (TextUtils.isEmpty(str9)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                zzgiVar2.zzm = str12;
                                if (zzC == 0) {
                                }
                                zzgiVar2.zzi = null;
                                zzal zzalVar2 = zzicVar8.zzg;
                                zzic zzicVar9 = (zzic) zzalVar2.$$delegate_0;
                                com.google.android.gms.common.internal.zzae.checkNotEmpty("analytics.safelisted_events");
                                zzq = zzalVar2.zzq();
                                if (zzq == null) {
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                asList = null;
                                if (asList != null) {
                                }
                                zzgiVar2.zzi = asList;
                                if (packageManager == null) {
                                }
                                ((zzic) zzgiVar2.$$delegate_0).zzF.incrementAndGet();
                                ((zzg) zzgiVar2).zza = true;
                                zzlqVar = new zzlq(zzicVar6);
                                zzlqVar.zzc();
                                zzicVar6.zzx = zzlqVar;
                                if (!((zzg) zzlqVar).zza) {
                                }
                            }
                            zzgiVar2.zza = packageName;
                            zzgiVar2.zzd = str6;
                            zzgiVar2.zzb = str7;
                            zzgiVar2.zzc = i;
                            zzgiVar2.zze = str5;
                            zzgiVar2.zzf = 0L;
                            zzC = zzicVar8.zzC();
                            if (zzC == 0) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzl.zza("App measurement collection enabled");
                            } else if (zzC == 1) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zza("App measurement deactivated via the manifest");
                            } else if (zzC == 3) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                            } else if (zzC == 4) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zza("App measurement disabled via the manifest");
                            } else if (zzC == 6) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzi.zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                            } else if (zzC == 7) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zza("App measurement disabled via the global data collection setting");
                            } else if (zzC != 8) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zza("App measurement disabled");
                                zzic.zzP(zzguVar5);
                                zzguVar5.zze.zza("Invalid scion state in identity");
                            } else {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzj.zza("App measurement disabled due to denied storage consent");
                            }
                            zzgiVar2.zzm = "";
                            str9 = zzgiVar2.zzk;
                            if (TextUtils.isEmpty(str9)) {
                                str9 = Countries.zza(context, zzicVar8.zzs);
                            }
                            if (!TextUtils.isEmpty(str9)) {
                                str12 = str9;
                            }
                            zzgiVar2.zzm = str12;
                            if (zzC == 0) {
                                zzic.zzP(zzguVar5);
                                zzguVar5.zzl.zzc("App measurement enabled for app package, google app id", zzgiVar2.zza, zzgiVar2.zzm);
                            }
                            zzgiVar2.zzi = null;
                            zzal zzalVar22 = zzicVar8.zzg;
                            zzic zzicVar92 = (zzic) zzalVar22.$$delegate_0;
                            com.google.android.gms.common.internal.zzae.checkNotEmpty("analytics.safelisted_events");
                            zzq = zzalVar22.zzq();
                            if (zzq == null) {
                                zzgu zzguVar6 = zzicVar92.zzi;
                                zzic.zzP(zzguVar6);
                                zzguVar6.zzd.zza("Failed to load metadata: Metadata bundle is null");
                            } else if (zzq.containsKey("analytics.safelisted_events")) {
                                valueOf = Integer.valueOf(zzq.getInt("analytics.safelisted_events"));
                                if (valueOf != null) {
                                    try {
                                        stringArray = zzicVar92.zzd.getResources().getStringArray(valueOf.intValue());
                                    } catch (Resources.NotFoundException e2) {
                                        zzgu zzguVar7 = zzicVar92.zzi;
                                        zzic.zzP(zzguVar7);
                                        zzguVar7.zzd.zzb(e2, "Failed to load string array from metadata: resource not found");
                                    }
                                    if (stringArray != null) {
                                        asList = Arrays.asList(stringArray);
                                        if (asList != null) {
                                            if (asList.isEmpty()) {
                                                zzic.zzP(zzguVar5);
                                                zzguVar5.zzi.zza("Safelisted event list is empty. Ignoring");
                                            } else {
                                                for (String str15 : asList) {
                                                    zzpp zzppVar4 = zzicVar8.zzl;
                                                    zzic.zzN(zzppVar4);
                                                    if (!zzppVar4.zzl("safelisted event", str15)) {
                                                    }
                                                }
                                            }
                                            if (packageManager == null) {
                                                zzgiVar2.zzl = DimensionKt.isInstantApp(context) ? 1 : 0;
                                            } else {
                                                zzgiVar2.zzl = 0;
                                            }
                                            ((zzic) zzgiVar2.$$delegate_0).zzF.incrementAndGet();
                                            ((zzg) zzgiVar2).zza = true;
                                            zzlqVar = new zzlq(zzicVar6);
                                            zzlqVar.zzc();
                                            zzicVar6.zzx = zzlqVar;
                                            if (!((zzg) zzlqVar).zza) {
                                                a$$ExternalSyntheticBUOutline0.m$1(str2);
                                                return;
                                            }
                                            zzlqVar.zza = (JobScheduler) ((zzic) zzlqVar.$$delegate_0).zzd.getSystemService("jobscheduler");
                                            ((zzic) zzlqVar.$$delegate_0).zzF.incrementAndGet();
                                            ((zzg) zzlqVar).zza = true;
                                            zzic.zzP(zzguVar2);
                                            zzgs zzgsVar3 = zzguVar2.zzk;
                                            zzgs zzgsVar4 = zzguVar2.zzj;
                                            zzgs zzgsVar5 = zzguVar2.zzl;
                                            zzgs zzgsVar6 = zzguVar2.zzd;
                                            zzalVar.zzi();
                                            zzgsVar4.zzb(161000L, "App measurement initialized, version");
                                            zzic.zzP(zzguVar2);
                                            zzgsVar4.zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                            String zzj = zzgiVar.zzj();
                                            if (zzppVar3.zzad(zzj, zzalVar.zzb)) {
                                                zzic.zzP(zzguVar2);
                                                zzgsVar4.zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                            } else {
                                                zzic.zzP(zzguVar2);
                                                zzgsVar4.zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzj)));
                                            }
                                            zzic.zzP(zzguVar2);
                                            zzgsVar3.zza("Debug-level message logging enabled");
                                            int i3 = zzicVar6.zzD;
                                            AtomicInteger atomicInteger = zzicVar6.zzF;
                                            if (i3 != atomicInteger.get()) {
                                                zzic.zzP(zzguVar2);
                                                zzgsVar6.zzc("Not all components initialized", Integer.valueOf(zzicVar6.zzD), Integer.valueOf(atomicInteger.get()));
                                            }
                                            zzicVar6.zzy = true;
                                            long j3 = zzicVar6.zza;
                                            zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                                            final zzlj zzljVar = zzicVar6.zzp;
                                            zzhz zzhzVar2 = zzicVar6.zzj;
                                            zzic.zzP(zzhzVar2);
                                            zzhzVar2.zzg();
                                            zzic.zzM(zzicVar6.zzx);
                                            int zzj2 = zzicVar6.zzx.zzj();
                                            zzaif.zza();
                                            boolean zzp = zzalVar.zzp(null, zzfy.zzaP);
                                            boolean z4 = zzj2 == 2;
                                            if (zzp) {
                                                zzppVar3.zzg();
                                                break;
                                            }
                                            if (!z4) {
                                                zzppVar = zzppVar3;
                                                zzgsVar = zzgsVar6;
                                                zzicVar = zzicVar6;
                                                latch = zzhhVar.zze;
                                                zzjl zzl = zzhhVar.zzl();
                                                int i4 = zzl.zzc;
                                                zzw = zzalVar.zzw("google_analytics_default_allow_ad_storage", false);
                                                zzji zzw4 = zzalVar.zzw("google_analytics_default_allow_analytics_storage", false);
                                                zzjiVar = zzji.UNINITIALIZED;
                                                zzicVar2 = zzicVar;
                                                if (zzw == zzjiVar) {
                                                }
                                                zzicVar3 = zzicVar7;
                                                latch2 = latch;
                                                if (zzjl.zzu(-10, zzhhVar.zzd().getInt("consent_source", 100))) {
                                                }
                                                if (!TextUtils.isEmpty(zzicVar2.zzv().zzk())) {
                                                }
                                                zzjlVar = null;
                                                if (zzjlVar == null) {
                                                }
                                                zzic.zzO(zzljVar);
                                                zzicVar4 = (zzic) zzljVar.$$delegate_0;
                                                zzljVar.zzz(zzjlVar);
                                                zzhhVar.zzg();
                                                int i5 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzb;
                                                zzw2 = zzalVar.zzw("google_analytics_default_allow_ad_personalization_signals", true);
                                                if (zzw2 != zzjiVar) {
                                                }
                                                zzw3 = zzalVar.zzw("google_analytics_default_allow_ad_user_data", true);
                                                if (zzw3 == zzjiVar) {
                                                }
                                                if (!TextUtils.isEmpty(zzicVar2.zzv().zzk())) {
                                                }
                                                zzr = zzalVar.zzr("google_analytics_tcf_data_enabled");
                                                if (zzr != null) {
                                                }
                                                zzic.zzP(zzguVar2);
                                                zzgsVar3.zza("TCF client enabled.");
                                                zzic.zzO(zzljVar);
                                                zzljVar.zzg();
                                                zzgu zzguVar8 = zzicVar4.zzi;
                                                zzic.zzP(zzguVar8);
                                                zzguVar8.zzk.zza("Register tcfPrefChangeListener.");
                                                if (zzljVar.zzr == null) {
                                                }
                                                zzhh zzhhVar2 = zzicVar4.zzh;
                                                zzic.zzN(zzhhVar2);
                                                zzhhVar2.zze().registerOnSharedPreferenceChangeListener(zzljVar.zzr);
                                                zzic.zzO(zzljVar);
                                                zzljVar.zzC();
                                                zzheVar = zzhhVar.zzc;
                                                if (zzheVar.zza() == 0) {
                                                }
                                                zzic.zzO(zzljVar);
                                                zzxVar = zzljVar.zzb;
                                                if (zzxVar.zze()) {
                                                }
                                                if (zzicVar2.zzH()) {
                                                }
                                                zzaif.zza();
                                                if (zzalVar.zzp(null, zzfy.zzaP)) {
                                                }
                                                zzhhVar.zzj.zzb(true);
                                                return;
                                            }
                                            z4 = true;
                                            zzppVar3.zzg();
                                            IntentFilter intentFilter = new IntentFilter();
                                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            boolean z5 = z4;
                                            zzppVar = zzppVar3;
                                            zzgsVar = zzgsVar6;
                                            Strings.registerReceiver(zzicVar7.zzd, new zzbq(zzicVar7), intentFilter, null, 2);
                                            zzgu zzguVar9 = zzicVar7.zzi;
                                            zzic.zzP(zzguVar9);
                                            zzguVar9.zzk.zza("Registered app receiver");
                                            if (z5) {
                                                zzic.zzM(zzicVar6.zzx);
                                                zzicVar = zzicVar6;
                                                zzicVar6.zzx.zzh(((Long) zzfy.zzB.zzb(null)).longValue());
                                                latch = zzhhVar.zze;
                                                zzjl zzl2 = zzhhVar.zzl();
                                                int i42 = zzl2.zzc;
                                                zzw = zzalVar.zzw("google_analytics_default_allow_ad_storage", false);
                                                zzji zzw42 = zzalVar.zzw("google_analytics_default_allow_analytics_storage", false);
                                                zzjiVar = zzji.UNINITIALIZED;
                                                zzicVar2 = zzicVar;
                                                if (zzw == zzjiVar || zzw42 != zzjiVar) {
                                                    zzicVar3 = zzicVar7;
                                                    latch2 = latch;
                                                    if (zzjl.zzu(-10, zzhhVar.zzd().getInt("consent_source", 100))) {
                                                        EnumMap enumMap = new EnumMap(zzjk.class);
                                                        enumMap.put((EnumMap) zzjk.AD_STORAGE, (zzjk) zzw);
                                                        enumMap.put((EnumMap) zzjkVar, (zzjk) zzw42);
                                                        zzjlVar = new zzjl(enumMap, -10);
                                                        if (zzjlVar == null) {
                                                            zzic.zzO(zzljVar);
                                                            zzljVar.zzs(zzjlVar, true);
                                                        } else {
                                                            zzjlVar = zzl2;
                                                        }
                                                        zzic.zzO(zzljVar);
                                                        zzicVar4 = (zzic) zzljVar.$$delegate_0;
                                                        zzljVar.zzz(zzjlVar);
                                                        zzhhVar.zzg();
                                                        int i52 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzb;
                                                        zzw2 = zzalVar.zzw("google_analytics_default_allow_ad_personalization_signals", true);
                                                        if (zzw2 != zzjiVar) {
                                                            zzic.zzP(zzguVar2);
                                                            zzgsVar5.zzb(zzw2, "Default ad personalization consent from Manifest");
                                                        }
                                                        zzw3 = zzalVar.zzw("google_analytics_default_allow_ad_user_data", true);
                                                        if (zzw3 == zzjiVar && zzjl.zzu(-10, i52)) {
                                                            zzic.zzO(zzljVar);
                                                            EnumMap enumMap2 = new EnumMap(zzjk.class);
                                                            enumMap2.put((EnumMap) zzjk.AD_USER_DATA, (zzjk) zzw3);
                                                            zzljVar.zzq(new zzba(enumMap2, -10, (Boolean) null, (String) null), true);
                                                        } else if (!TextUtils.isEmpty(zzicVar2.zzv().zzk()) && (i52 == 0 || i52 == 30)) {
                                                            zzic.zzO(zzljVar);
                                                            zzljVar.zzq(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                        }
                                                        zzr = zzalVar.zzr("google_analytics_tcf_data_enabled");
                                                        if (zzr != null || zzr.booleanValue()) {
                                                            zzic.zzP(zzguVar2);
                                                            zzgsVar3.zza("TCF client enabled.");
                                                            zzic.zzO(zzljVar);
                                                            zzljVar.zzg();
                                                            zzgu zzguVar82 = zzicVar4.zzi;
                                                            zzic.zzP(zzguVar82);
                                                            zzguVar82.zzk.zza("Register tcfPrefChangeListener.");
                                                            if (zzljVar.zzr == null) {
                                                                zzljVar.zzs = new zzkb(zzljVar, zzicVar4);
                                                                zzljVar.zzr = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str16) {
                                                                        zzlj zzljVar2 = zzlj.this;
                                                                        zzljVar2.getClass();
                                                                        if (Objects.equals(str16, "IABTCF_TCString") || Objects.equals(str16, "IABTCF_gdprApplies") || Objects.equals(str16, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                            zzgu zzguVar10 = ((zzic) zzljVar2.$$delegate_0).zzi;
                                                                            zzic.zzP(zzguVar10);
                                                                            zzguVar10.zzl.zza("IABTCF_TCString change picked up in listener.");
                                                                            zzkb zzkbVar = zzljVar2.zzs;
                                                                            zzae.checkNotNull(zzkbVar);
                                                                            zzkbVar.zzb(500L);
                                                                        }
                                                                    }
                                                                };
                                                            }
                                                            zzhh zzhhVar22 = zzicVar4.zzh;
                                                            zzic.zzN(zzhhVar22);
                                                            zzhhVar22.zze().registerOnSharedPreferenceChangeListener(zzljVar.zzr);
                                                            zzic.zzO(zzljVar);
                                                            zzljVar.zzC();
                                                        }
                                                        zzheVar = zzhhVar.zzc;
                                                        if (zzheVar.zza() == 0) {
                                                            zzic.zzP(zzguVar2);
                                                            zzgsVar5.zzb(Long.valueOf(j3), "Persisting first open");
                                                            zzheVar.zzb(j3);
                                                        }
                                                        zzic.zzO(zzljVar);
                                                        zzxVar = zzljVar.zzb;
                                                        if (zzxVar.zze() && zzxVar.zzd()) {
                                                            zzhh zzhhVar3 = zzxVar.zza.zzh;
                                                            zzic.zzN(zzhhVar3);
                                                            zzhhVar3.zzr.zzb(null);
                                                        }
                                                        if (zzicVar2.zzH()) {
                                                            if (zzicVar2.zzB()) {
                                                                zzppVar2 = zzppVar;
                                                                if (zzppVar2.zzab("android.permission.INTERNET")) {
                                                                    zzgsVar2 = zzgsVar;
                                                                } else {
                                                                    zzic.zzP(zzguVar2);
                                                                    zzgsVar2 = zzgsVar;
                                                                    zzgsVar2.zza("App is missing INTERNET permission");
                                                                }
                                                                if (!zzppVar2.zzab("android.permission.ACCESS_NETWORK_STATE")) {
                                                                    zzic.zzP(zzguVar2);
                                                                    zzgsVar2.zza("App is missing ACCESS_NETWORK_STATE permission");
                                                                }
                                                                zzicVar5 = zzicVar2;
                                                                Context context2 = zzicVar5.zzd;
                                                                if (!Wrappers.packageManager(context2).isCallerInstantApp() && !zzalVar.zzE()) {
                                                                    if (!zzpp.zzax(context2)) {
                                                                        zzic.zzP(zzguVar2);
                                                                        zzgsVar2.zza("AppMeasurementReceiver not registered/enabled");
                                                                    }
                                                                    if (!zzpp.zzT(context2)) {
                                                                        zzic.zzP(zzguVar2);
                                                                        zzgsVar2.zza("AppMeasurementService not registered/enabled");
                                                                    }
                                                                }
                                                                zzic.zzP(zzguVar2);
                                                                zzgsVar2.zza("Uploading is not possible. App measurement disabled");
                                                            } else {
                                                                zzppVar2 = zzppVar;
                                                                zzicVar5 = zzicVar2;
                                                            }
                                                            zzguVar = zzguVar2;
                                                        } else {
                                                            zzppVar2 = zzppVar;
                                                            zzicVar5 = zzicVar2;
                                                            if (TextUtils.isEmpty(zzicVar5.zzv().zzk())) {
                                                                latch3 = latch2;
                                                            } else {
                                                                String zzk = zzicVar5.zzv().zzk();
                                                                zzhhVar.zzg();
                                                                String string2 = zzhhVar.zzd().getString("gmp_app_id", null);
                                                                boolean isEmpty = TextUtils.isEmpty(zzk);
                                                                boolean isEmpty2 = TextUtils.isEmpty(string2);
                                                                if (!isEmpty && !isEmpty2) {
                                                                    com.google.android.gms.common.internal.zzae.checkNotNull(zzk);
                                                                    if (!zzk.equals(string2)) {
                                                                        zzic.zzP(zzguVar2);
                                                                        zzgsVar4.zza("Rechecking which service to use due to a GMP App Id change");
                                                                        zzhhVar.zzg();
                                                                        zzhhVar.zzg();
                                                                        Boolean valueOf2 = zzhhVar.zzd().contains("measurement_enabled") ? Boolean.valueOf(zzhhVar.zzd().getBoolean("measurement_enabled", true)) : null;
                                                                        SharedPreferences.Editor edit2 = zzhhVar.zzd().edit();
                                                                        edit2.clear();
                                                                        edit2.apply();
                                                                        if (valueOf2 != null) {
                                                                            zzhhVar.zzg();
                                                                            SharedPreferences.Editor edit3 = zzhhVar.zzd().edit();
                                                                            edit3.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                                            edit3.apply();
                                                                        }
                                                                        zzicVar5.zzm().zzh();
                                                                        zzicVar5.zzu.zzM();
                                                                        zzicVar5.zzu.zzI();
                                                                        zzheVar.zzb(j3);
                                                                        latch3 = latch2;
                                                                        latch3.zzb(null);
                                                                        String zzk2 = zzicVar5.zzv().zzk();
                                                                        zzhhVar.zzg();
                                                                        SharedPreferences.Editor edit4 = zzhhVar.zzd().edit();
                                                                        edit4.putString("gmp_app_id", zzk2);
                                                                        edit4.apply();
                                                                    }
                                                                }
                                                                latch3 = latch2;
                                                                String zzk22 = zzicVar5.zzv().zzk();
                                                                zzhhVar.zzg();
                                                                SharedPreferences.Editor edit42 = zzhhVar.zzd().edit();
                                                                edit42.putString("gmp_app_id", zzk22);
                                                                edit42.apply();
                                                            }
                                                            if (!zzhhVar.zzl().zzo(zzjkVar)) {
                                                                latch3.zzb(null);
                                                            }
                                                            zzic.zzO(zzljVar);
                                                            zzljVar.zzg.set(latch3.zza());
                                                            try {
                                                                zzicVar3.zzd.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                            } catch (ClassNotFoundException unused5) {
                                                                Latch latch4 = zzhhVar.zzq;
                                                                if (!TextUtils.isEmpty(latch4.zza())) {
                                                                    zzic.zzP(zzguVar2);
                                                                    zzguVar = zzguVar2;
                                                                    zzguVar.zzg.zza("Remote config removed with active feature rollouts");
                                                                    latch4.zzb(null);
                                                                }
                                                            }
                                                            zzguVar = zzguVar2;
                                                            if (!TextUtils.isEmpty(zzicVar5.zzv().zzk())) {
                                                                boolean zzB = zzicVar5.zzB();
                                                                SharedPreferences sharedPreferences2 = zzhhVar.zzv;
                                                                if (!(sharedPreferences2 == null ? false : sharedPreferences2.contains("deferred_analytics_collection")) && !zzalVar.zzt()) {
                                                                    zzhhVar.zzm(!zzB);
                                                                }
                                                                if (zzB) {
                                                                    zzic.zzO(zzljVar);
                                                                    zzljVar.zzT();
                                                                }
                                                                zzoc zzocVar = zzicVar5.zzk;
                                                                zzic.zzO(zzocVar);
                                                                zzocVar.zza.zza();
                                                                zzicVar5.zzt().zzC(new AtomicReference());
                                                                zzicVar5.zzt().zzH(zzhhVar.zzt.zza());
                                                            }
                                                        }
                                                        zzaif.zza();
                                                        if (zzalVar.zzp(null, zzfy.zzaP)) {
                                                            zzppVar2.zzg();
                                                            if (zzppVar2.zzX() == 1) {
                                                                long intValue = ((Integer) zzfy.zzaw.zzb(null)).intValue();
                                                                long nextInt = new Random().nextInt(5000);
                                                                zzicVar5.zzn.getClass();
                                                                long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                                if (max > 500) {
                                                                    zzic.zzP(zzguVar);
                                                                    zzgsVar5.zzb(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                                }
                                                                zzic.zzO(zzljVar);
                                                                zzljVar.zzg();
                                                                if (zzljVar.zzl == null) {
                                                                    zzljVar.zzl = new zzju(zzljVar, (zzjg) zzicVar4, 0);
                                                                }
                                                                zzljVar.zzl.zzb(max);
                                                            }
                                                        }
                                                        zzhhVar.zzj.zzb(true);
                                                        return;
                                                    }
                                                } else {
                                                    latch2 = latch;
                                                    zzicVar3 = zzicVar7;
                                                }
                                                if (!TextUtils.isEmpty(zzicVar2.zzv().zzk()) && (i42 == 0 || i42 == 30 || i42 == 10 || i42 == 40)) {
                                                    zzic.zzO(zzljVar);
                                                    zzljVar.zzs(new zzjl(-10), false);
                                                }
                                                zzjlVar = null;
                                                if (zzjlVar == null) {
                                                }
                                                zzic.zzO(zzljVar);
                                                zzicVar4 = (zzic) zzljVar.$$delegate_0;
                                                zzljVar.zzz(zzjlVar);
                                                zzhhVar.zzg();
                                                int i522 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzb;
                                                zzw2 = zzalVar.zzw("google_analytics_default_allow_ad_personalization_signals", true);
                                                if (zzw2 != zzjiVar) {
                                                }
                                                zzw3 = zzalVar.zzw("google_analytics_default_allow_ad_user_data", true);
                                                if (zzw3 == zzjiVar) {
                                                }
                                                if (!TextUtils.isEmpty(zzicVar2.zzv().zzk())) {
                                                    zzic.zzO(zzljVar);
                                                    zzljVar.zzq(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                }
                                                zzr = zzalVar.zzr("google_analytics_tcf_data_enabled");
                                                if (zzr != null) {
                                                }
                                                zzic.zzP(zzguVar2);
                                                zzgsVar3.zza("TCF client enabled.");
                                                zzic.zzO(zzljVar);
                                                zzljVar.zzg();
                                                zzgu zzguVar822 = zzicVar4.zzi;
                                                zzic.zzP(zzguVar822);
                                                zzguVar822.zzk.zza("Register tcfPrefChangeListener.");
                                                if (zzljVar.zzr == null) {
                                                }
                                                zzhh zzhhVar222 = zzicVar4.zzh;
                                                zzic.zzN(zzhhVar222);
                                                zzhhVar222.zze().registerOnSharedPreferenceChangeListener(zzljVar.zzr);
                                                zzic.zzO(zzljVar);
                                                zzljVar.zzC();
                                                zzheVar = zzhhVar.zzc;
                                                if (zzheVar.zza() == 0) {
                                                }
                                                zzic.zzO(zzljVar);
                                                zzxVar = zzljVar.zzb;
                                                if (zzxVar.zze()) {
                                                    zzhh zzhhVar32 = zzxVar.zza.zzh;
                                                    zzic.zzN(zzhhVar32);
                                                    zzhhVar32.zzr.zzb(null);
                                                }
                                                if (zzicVar2.zzH()) {
                                                }
                                                zzaif.zza();
                                                if (zzalVar.zzp(null, zzfy.zzaP)) {
                                                }
                                                zzhhVar.zzj.zzb(true);
                                                return;
                                            }
                                            zzicVar = zzicVar6;
                                            latch = zzhhVar.zze;
                                            zzjl zzl22 = zzhhVar.zzl();
                                            int i422 = zzl22.zzc;
                                            zzw = zzalVar.zzw("google_analytics_default_allow_ad_storage", false);
                                            zzji zzw422 = zzalVar.zzw("google_analytics_default_allow_analytics_storage", false);
                                            zzjiVar = zzji.UNINITIALIZED;
                                            zzicVar2 = zzicVar;
                                            if (zzw == zzjiVar) {
                                            }
                                            zzicVar3 = zzicVar7;
                                            latch2 = latch;
                                            if (zzjl.zzu(-10, zzhhVar.zzd().getInt("consent_source", 100))) {
                                            }
                                            if (!TextUtils.isEmpty(zzicVar2.zzv().zzk())) {
                                                zzic.zzO(zzljVar);
                                                zzljVar.zzs(new zzjl(-10), false);
                                            }
                                            zzjlVar = null;
                                            if (zzjlVar == null) {
                                            }
                                            zzic.zzO(zzljVar);
                                            zzicVar4 = (zzic) zzljVar.$$delegate_0;
                                            zzljVar.zzz(zzjlVar);
                                            zzhhVar.zzg();
                                            int i5222 = zzba.zzg(zzhhVar.zzd().getString("dma_consent_settings", null)).zzb;
                                            zzw2 = zzalVar.zzw("google_analytics_default_allow_ad_personalization_signals", true);
                                            if (zzw2 != zzjiVar) {
                                            }
                                            zzw3 = zzalVar.zzw("google_analytics_default_allow_ad_user_data", true);
                                            if (zzw3 == zzjiVar) {
                                            }
                                            if (!TextUtils.isEmpty(zzicVar2.zzv().zzk())) {
                                            }
                                            zzr = zzalVar.zzr("google_analytics_tcf_data_enabled");
                                            if (zzr != null) {
                                            }
                                            zzic.zzP(zzguVar2);
                                            zzgsVar3.zza("TCF client enabled.");
                                            zzic.zzO(zzljVar);
                                            zzljVar.zzg();
                                            zzgu zzguVar8222 = zzicVar4.zzi;
                                            zzic.zzP(zzguVar8222);
                                            zzguVar8222.zzk.zza("Register tcfPrefChangeListener.");
                                            if (zzljVar.zzr == null) {
                                            }
                                            zzhh zzhhVar2222 = zzicVar4.zzh;
                                            zzic.zzN(zzhhVar2222);
                                            zzhhVar2222.zze().registerOnSharedPreferenceChangeListener(zzljVar.zzr);
                                            zzic.zzO(zzljVar);
                                            zzljVar.zzC();
                                            zzheVar = zzhhVar.zzc;
                                            if (zzheVar.zza() == 0) {
                                            }
                                            zzic.zzO(zzljVar);
                                            zzxVar = zzljVar.zzb;
                                            if (zzxVar.zze()) {
                                            }
                                            if (zzicVar2.zzH()) {
                                            }
                                            zzaif.zza();
                                            if (zzalVar.zzp(null, zzfy.zzaP)) {
                                            }
                                            zzhhVar.zzj.zzb(true);
                                            return;
                                        }
                                        zzgiVar2.zzi = asList;
                                        if (packageManager == null) {
                                        }
                                        ((zzic) zzgiVar2.$$delegate_0).zzF.incrementAndGet();
                                        ((zzg) zzgiVar2).zza = true;
                                        zzlqVar = new zzlq(zzicVar6);
                                        zzlqVar.zzc();
                                        zzicVar6.zzx = zzlqVar;
                                        if (!((zzg) zzlqVar).zza) {
                                        }
                                    }
                                }
                                asList = null;
                                if (asList != null) {
                                }
                                zzgiVar2.zzi = asList;
                                if (packageManager == null) {
                                }
                                ((zzic) zzgiVar2.$$delegate_0).zzF.incrementAndGet();
                                ((zzg) zzgiVar2).zza = true;
                                zzlqVar = new zzlq(zzicVar6);
                                zzlqVar.zzc();
                                zzicVar6.zzx = zzlqVar;
                                if (!((zzg) zzlqVar).zza) {
                                }
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            asList = null;
                            if (asList != null) {
                            }
                            zzgiVar2.zzi = asList;
                            if (packageManager == null) {
                            }
                            ((zzic) zzgiVar2.$$delegate_0).zzF.incrementAndGet();
                            ((zzg) zzgiVar2).zza = true;
                            zzlqVar = new zzlq(zzicVar6);
                            zzlqVar.zzc();
                            zzicVar6.zzx = zzlqVar;
                            if (!((zzg) zzlqVar).zza) {
                            }
                        } else {
                            str6 = str4;
                            packageManager = packageManager2;
                            i = Integer.MIN_VALUE;
                        }
                    }
                    str4 = str3;
                    packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo == null) {
                    }
                }
                str7 = str;
                str5 = str7;
                zzgiVar2.zza = packageName;
                zzgiVar2.zzd = str6;
                zzgiVar2.zzb = str7;
                zzgiVar2.zzc = i;
                zzgiVar2.zze = str5;
                zzgiVar2.zzf = 0L;
                zzC = zzicVar8.zzC();
                if (zzC == 0) {
                }
                zzgiVar2.zzm = "";
                str9 = zzgiVar2.zzk;
                if (TextUtils.isEmpty(str9)) {
                }
                if (!TextUtils.isEmpty(str9)) {
                }
                zzgiVar2.zzm = str12;
                if (zzC == 0) {
                }
                zzgiVar2.zzi = null;
                zzal zzalVar222 = zzicVar8.zzg;
                zzic zzicVar922 = (zzic) zzalVar222.$$delegate_0;
                com.google.android.gms.common.internal.zzae.checkNotEmpty("analytics.safelisted_events");
                zzq = zzalVar222.zzq();
                if (zzq == null) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                asList = null;
                if (asList != null) {
                }
                zzgiVar2.zzi = asList;
                if (packageManager == null) {
                }
                ((zzic) zzgiVar2.$$delegate_0).zzF.incrementAndGet();
                ((zzg) zzgiVar2).zza = true;
                zzlqVar = new zzlq(zzicVar6);
                zzlqVar.zzc();
                zzicVar6.zzx = zzlqVar;
                if (!((zzg) zzlqVar).zza) {
                }
                break;
            case 6:
                zznl zznlVar2 = (zznl) this.zzb;
                zzgb zzgbVar = zznlVar2.zzb;
                zzic zzicVar10 = (zzic) zznlVar2.$$delegate_0;
                if (zzgbVar == null) {
                    zzgu zzguVar10 = zzicVar10.zzi;
                    zzic.zzP(zzguVar10);
                    zzguVar10.zzd.zza("Failed to send current screen to service");
                    return;
                }
                try {
                    zzlu zzluVar = (zzlu) this.zza;
                    if (zzluVar == null) {
                        zzgbVar.zzl(null, 0L, null, zzicVar10.zzd.getPackageName());
                    } else {
                        zzgbVar.zzl(zzluVar.zza, zzluVar.zzc, zzluVar.zzb, zzicVar10.zzd.getPackageName());
                    }
                    zznlVar2.zzae();
                    return;
                } catch (RemoteException e3) {
                    zzgu zzguVar11 = ((zzic) zznlVar2.$$delegate_0).zzi;
                    zzic.zzP(zzguVar11);
                    zzguVar11.zzd.zzb(e3, "Failed to send current screen to the service");
                    return;
                }
            case 7:
                run$com$google$android$gms$measurement$internal$zzmy();
                return;
            case 8:
                run$com$google$android$gms$tasks$zzk();
                return;
            case 9:
                run$com$google$android$gms$tasks$zzm();
                return;
            case 10:
                zzh zzhVar2 = (zzh) this.zzb;
                try {
                    Task then = ((SuccessContinuation) zzhVar2.zzb).then(((Task) this.zza).getResult());
                    if (then == null) {
                        ((zzw) zzhVar2.zzc).zzc(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    zzt zztVar = TaskExecutors.zza;
                    then.addOnSuccessListener(zztVar, zzhVar2);
                    then.addOnFailureListener(zztVar, zzhVar2);
                    then.addOnCanceledListener(zztVar, zzhVar2);
                    return;
                } catch (RuntimeExecutionException e4) {
                    if (e4.getCause() instanceof Exception) {
                        zzhVar2.onFailure((Exception) e4.getCause());
                        return;
                    } else {
                        ((zzw) zzhVar2.zzc).zzc(e4);
                        return;
                    }
                } catch (CancellationException unused6) {
                    zzhVar2.onCanceled();
                    return;
                } catch (Exception e5) {
                    ((zzw) zzhVar2.zzc).zzc(e5);
                    return;
                }
            case 11:
                zzw zzwVar = (zzw) this.zza;
                try {
                    zzwVar.zza(((Callable) this.zzb).call());
                    return;
                } catch (Exception e6) {
                    zzwVar.zzc(e6);
                    return;
                } catch (Throwable th3) {
                    zzwVar.zzc(new RuntimeException(th3));
                    return;
                }
            case 12:
                run$com$google$firebase$concurrent$SequentialExecutor$QueueWorker();
                return;
            default:
                int i6 = 0;
                while (true) {
                    try {
                        ((Runnable) this.zza).run();
                    } catch (Throwable th4) {
                        JobKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th4);
                    }
                    Runnable obtainTaskOrDeallocateWorker = ((LimitedDispatcher) this.zzb).obtainTaskOrDeallocateWorker();
                    if (obtainTaskOrDeallocateWorker == null) {
                        return;
                    }
                    try {
                        this.zza = obtainTaskOrDeallocateWorker;
                        i6++;
                        if (i6 >= 16) {
                            LimitedDispatcher limitedDispatcher = (LimitedDispatcher) this.zzb;
                            if (InlineList.safeIsDispatchNeeded(limitedDispatcher.dispatcher, limitedDispatcher)) {
                                LimitedDispatcher limitedDispatcher2 = (LimitedDispatcher) this.zzb;
                                InlineList.safeDispatch(limitedDispatcher2.dispatcher, limitedDispatcher2, this);
                                return;
                            }
                        }
                    } catch (Throwable th5) {
                        LimitedDispatcher limitedDispatcher3 = (LimitedDispatcher) this.zzb;
                        synchronized (limitedDispatcher3.workerAllocationLock) {
                            LimitedDispatcher.runningWorkers$volatile$FU.decrementAndGet(limitedDispatcher3);
                            throw th5;
                        }
                    }
                }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 12:
                Runnable runnable = (Runnable) this.zza;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + zzel$EnumUnboxingLocalUtility.stringValueOf$5(((SequentialExecutor) this.zzb).workerRunningState) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.zza).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.zza = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        com.google.firebase.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.zza), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void workOnQueue() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((SequentialExecutor) this.zzb).queue) {
                    if (!z) {
                        SequentialExecutor sequentialExecutor = (SequentialExecutor) this.zzb;
                        if (sequentialExecutor.workerRunningState != 4) {
                            sequentialExecutor.workerRunCount++;
                            sequentialExecutor.workerRunningState = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((SequentialExecutor) this.zzb).queue.poll();
                    this.zza = runnable;
                    if (runnable == null) {
                        ((SequentialExecutor) this.zzb).workerRunningState = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public /* synthetic */ zzi(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }

    public /* synthetic */ zzi(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zzb = obj;
        this.zza = obj2;
    }

    public zzi(SequentialExecutor sequentialExecutor) {
        this.$r8$classId = 12;
        this.zzb = sequentialExecutor;
    }

    public zzi(ListenableFuture listenableFuture, CancellableContinuationImpl cancellableContinuationImpl) {
        this.$r8$classId = 1;
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cancellableContinuationImpl;
    }
}
