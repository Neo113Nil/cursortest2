package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.genai.common.GenAiException;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import com.nimbusds.jose.JWECryptoParts;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Duration;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.guava.ListenableFutureKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public abstract class zzajh implements AutoCloseable {
    public final zzfn zza;
    public final int zzb;
    public final zzlq zzc;
    public volatile zzct zzd;
    public zzer zze;
    public boolean zzf = true;

    public zzajh(int i, zzlq zzlqVar) {
        Context applicationContext = MlKitContext.getInstance().getApplicationContext();
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new zzck("AiCoreClientWorker"));
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new zzck("AiCoreClientScheduler"));
        Optional.empty();
        if (applicationContext == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null context");
            throw null;
        }
        zzcj zzcjVar = zzcj.zza;
        if (zzcjVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null callbackExecutor");
            throw null;
        }
        if (newCachedThreadPool == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null workerExecutor");
            throw null;
        }
        if (Duration.ZERO == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null autoUnbindTimeoutMs");
            throw null;
        }
        if (newScheduledThreadPool == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null autoUnbindScheduledExecutor");
            throw null;
        }
        Optional empty = Optional.empty();
        if (empty == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null autoDownloadEnabled");
            throw null;
        }
        Duration ofMinutes = Duration.ofMinutes(10L);
        if (ofMinutes == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null autoUnbindTimeoutMs");
            throw null;
        }
        this.zza = new zzfn(new zzcr(applicationContext, newCachedThreadPool, zzcjVar, ofMinutes, newScheduledThreadPool, empty));
        this.zzb = i;
        this.zzc = zzlqVar;
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        zzafk zzafkVar = new zzafk();
        zzafkVar.zza = (zzagc) zzlqVar.zzd;
        jWECryptoParts.cipherText = new zzafs(zzafkVar);
        ((zzajt) zzlqVar.zze).zzc(new zzfr(jWECryptoParts), zzlq.zzh((zzpb) zzlqVar.zzc, zznl.zza));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzG(zzajh zzajhVar, ContinuationImpl continuationImpl) {
        zzaje zzajeVar;
        int i;
        ListenableFuture zzd;
        if (continuationImpl instanceof zzaje) {
            zzajeVar = (zzaje) continuationImpl;
            int i2 = zzajeVar.zzc;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzajeVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzajeVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzajeVar.zzc;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzfn zzfnVar = zzajhVar.zza;
                    if (zzfnVar.zza.getPackageManager().getPackageInfo("com.google.android.aicore", 0).versionCode >= 193575) {
                        zzd = zzajhVar.zzc(zzki.zzh(zzajhVar.zze(), new zzeu(zzajhVar, 2), zzfnVar.zzf), zzajc.zzb);
                        zzajeVar.zzc = 1;
                        obj = ListenableFutureKt.await(zzd, zzajeVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    zzd = zzki.zzd(0);
                    zzajeVar.zzc = 1;
                    obj = ListenableFutureKt.await(zzd, zzajeVar);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        zzajeVar = new zzaje(zzajhVar, continuationImpl);
        Object obj2 = zzajeVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzajeVar.zzc;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.zza.zzq();
        this.zzf = true;
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        zzafk zzafkVar = new zzafk();
        zzlq zzlqVar = this.zzc;
        zzafkVar.zza = (zzagc) zzlqVar.zzd;
        jWECryptoParts.authenticationTag = new zzafm(zzafkVar);
        ((zzajt) zzlqVar.zze).zzc(new zzfr(jWECryptoParts), zzlq.zzh((zzpb) zzlqVar.zzc, zznl.zzd));
    }

    public final zzja zzB(GenerateContentRequest generateContentRequest, RealStrongMemoryCache realStrongMemoryCache) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = new AtomicLong();
        RealStrongMemoryCache realStrongMemoryCache2 = realStrongMemoryCache != null ? new RealStrongMemoryCache(atomicLong, elapsedRealtime, realStrongMemoryCache) : null;
        zzer zzerVar = this.zze;
        int i = 0;
        ListenableFuture zzd = zzerVar != null ? zzki.zzd(zzerVar) : zzki.zzg(zze(), new zzaii(this, 0), this.zza.zzf);
        zzex zzexVar = new zzex(this, generateContentRequest, realStrongMemoryCache2, 2);
        zzfn zzfnVar = this.zza;
        zzjj zzh = zzki.zzh(zzd, zzexVar, zzfnVar.zzf);
        zzij zzijVar = zzil.zza;
        Object[] objArr = (Object[]) new ListenableFuture[]{zzd, zzh}.clone();
        int length = objArr.length;
        WalletJsonParser.zza(length, objArr);
        zzir zzi = zzil.zzi(length, objArr);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zza = zzd;
        zzfrVar.zzb = zzh;
        zzku zzkuVar = zzfnVar.zzf;
        int i2 = zzi.zzc;
        zzjw zzjwVar = new zzjw();
        zzjwVar.seenExceptionsField = null;
        zzjwVar.remainingField = i2;
        zzjwVar.zzb = zzi;
        zzjwVar.zza = new zzju(zzjwVar, zzfrVar, zzkuVar);
        Objects.requireNonNull(zzjwVar.zzb);
        if (zzjwVar.zzb.isEmpty()) {
            zzju zzjuVar = zzjwVar.zza;
            if (zzjuVar != null) {
                try {
                    zzjuVar.zza$1.execute(zzjuVar);
                } catch (RejectedExecutionException e) {
                    zzjuVar.zzb.zzm(e);
                }
            }
        } else {
            zzij listIterator = zzjwVar.zzb.listIterator(0);
            while (listIterator.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) listIterator.next();
                int i3 = i + 1;
                if (listenableFuture.isDone()) {
                    zzjwVar.zzE(listenableFuture);
                } else {
                    listenableFuture.addListener(new zzfq(zzjwVar, i, listenableFuture), zzjx.zza);
                }
                i = i3;
            }
        }
        return zzc(zzki.zzg(zzjwVar, new zzait(this, atomicLong, elapsedRealtime, generateContentRequest), this.zza.zzf), new zzeo(this));
    }

    public abstract zzer zzb(zzfn zzfnVar, zzct zzctVar);

    public final zzja zzc(zzjl zzjlVar, zzajc zzajcVar) {
        zzeu zzeuVar = new zzeu(zzajcVar, 1);
        Executor executor = this.zza.zzf;
        zzja zzjaVar = new zzja();
        zzjaVar.zza = zzjlVar;
        zzjaVar.zzb = Throwable.class;
        zzjaVar.zzc = zzeuVar;
        executor.getClass();
        if (executor != zzjx.zza) {
            executor = new zzkt(executor, zzjaVar);
        }
        zzjlVar.addListener(zzjaVar, executor);
        return zzjaVar;
    }

    public ListenableFuture zzd(Object obj, RealStrongMemoryCache realStrongMemoryCache) {
        try {
            return zzki.zzd(zzi(obj, realStrongMemoryCache));
        } catch (GenAiException e) {
            return zzki.zzc(e);
        }
    }

    public final synchronized ListenableFuture zze() {
        if (this.zzd != null) {
            return zzki.zzd(this.zzd);
        }
        zzfn zzfnVar = this.zza;
        boolean z = false;
        try {
            if (zzfnVar.zza.getPackageManager().getPackageInfo("com.google.android.aicore", 0).versionCode >= 193575) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!z) {
            return zzki.zzc(new GenAiException(null, -101));
        }
        final int i = this.zzb;
        zzfnVar.zzv();
        return zzki.zzg(zzki.zzh(zzki.zzg(zzjz.zzw(zzfnVar.zzu().zza()), new zzet(), zzjx.zza), new zzjt() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzes
            @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjt
            public final ListenableFuture zza(Object obj) {
                int i2 = i;
                try {
                    zzab zzabVar = (zzab) ((zzad) obj);
                    Parcel zzb = zzabVar.zzb(zzabVar.zza(), 11);
                    int readInt = zzb.readInt();
                    zzb.recycle();
                    if (readInt < 6) {
                        return zzki.zzc(new zzcm(3, 8, "getFeatureOrControl is not supported before AICoreVersion V7", null));
                    }
                    Parcel zza = zzabVar.zza();
                    zza.writeInt(i2);
                    zza.writeInt(-1);
                    Parcel zzb2 = zzabVar.zzb(zza, 32);
                    zzm zzmVar = (zzm) zzl.zza(zzb2, zzm.CREATOR);
                    zzb2.recycle();
                    if (zzmVar != null) {
                        return zzki.zzd(new zzct(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf));
                    }
                    Locale locale = Locale.ENGLISH;
                    return zzki.zzc(new zzcm(3, 606, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Feature ", " is not available."), null));
                } catch (RemoteException e) {
                    Log.e("zzfn", "AiCore service failed to get feature.", e);
                    return zzki.zzc(new zzcm(3, 6, "AiCore service failed to get feature.", e));
                }
            }
        }, zzfnVar.zzf), new zzaii(this, 1), zzfnVar.zzf);
    }

    public Object zzg(zznb zznbVar) {
        return zzG(this, zznbVar);
    }

    public abstract Object zzi(Object obj, RealStrongMemoryCache realStrongMemoryCache);

    public abstract GenerateContentResponse zzk(Object obj);
}
