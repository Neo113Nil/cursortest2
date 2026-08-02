package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.genai.common.GenAiException;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.guava.ListenableFutureKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class zzot {
    public static final Lazy zzb;
    public final zzou zzd;
    public final zzmc zze;
    public final zzpa zzf;
    public final zzlq zzi;

    static {
        final int i = 0;
        LazyKt.lazy(new Function0() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzoc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Lazy lazy = zzot.zzb;
                        Executor mainExecutor = MlKitContext.getInstance().getApplicationContext().getMainExecutor();
                        mainExecutor.getClass();
                        return mainExecutor;
                    default:
                        Lazy lazy2 = zzot.zzb;
                        return MlKitContext.getInstance().getApplicationContext();
                }
            }
        });
        final int i2 = 1;
        zzb = LazyKt.lazy(new Function0() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzoc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Lazy lazy = zzot.zzb;
                        Executor mainExecutor = MlKitContext.getInstance().getApplicationContext().getMainExecutor();
                        mainExecutor.getClass();
                        return mainExecutor;
                    default:
                        Lazy lazy2 = zzot.zzb;
                        return MlKitContext.getInstance().getApplicationContext();
                }
            }
        });
    }

    public zzot(com.google.mlkit.vision.text.zza zzaVar) {
        zzou zzouVar = new zzou(zzzx.zza(zznk.zza), new zzlq(zzaVar, zzpb.zza));
        Lazy lazy = zzb;
        Object value = lazy.getValue();
        value.getClass();
        zzmc zzmcVar = new zzmc((Context) value, zzzx.zza(zznk.zzb), new zzlq(zzaVar, zzpb.zzb));
        Object value2 = lazy.getValue();
        value2.getClass();
        zzpa zzpaVar = new zzpa((Context) value2, zzzx.zza(zznk.zzc), new zzlq(zzaVar, zzpb.zzc));
        this.zzd = zzouVar;
        this.zze = zzmcVar;
        this.zzf = zzpaVar;
        JobKt.CoroutineScope(new ExecutorCoroutineDispatcherImpl(new MlKitThreadPool()));
        this.zzi = new zzlq(zzouVar, CollectionsKt__CollectionsKt.listOf((Object[]) new zzajh[]{zzmcVar, zzpaVar}));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(ContinuationImpl continuationImpl) {
        zzof zzofVar;
        int i;
        if (continuationImpl instanceof zzof) {
            zzofVar = (zzof) continuationImpl;
            int i2 = zzofVar.zzc;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzofVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzofVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzofVar.zzc;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzofVar.zzc = 1;
                    zzlq zzlqVar = this.zzi;
                    zzlqVar.getClass();
                    zzmc zzmcVar = this.zze;
                    zzmcVar.getClass();
                    obj = Intrinsics.areEqual(((LinkedHashMap) zzlqVar.zze).get(zzmcVar), Boolean.TRUE) ? new Integer(0) : zzmc.zzh(zzmcVar, zzofVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() == 3);
            }
        }
        zzofVar = new zzof(this, continuationImpl);
        Object obj2 = zzofVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzofVar.zzc;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() == 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|67|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        if (com.google.android.gms.internal.mlkit_genai_prompt.zzmc.zzj(r0, r12, r2) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0085, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
    
        okio.Okio.boxInt(android.util.Log.w("GenerativeModel", "Failed to create cache for prefix: ".concat(java.lang.String.valueOf(r10)), r0));
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4 A[Catch: GenAiException -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {GenAiException -> 0x004e, blocks: (B:33:0x0049, B:49:0x00b4), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.mlkit_genai_prompt.zzot] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzq(GenerateContentRequest generateContentRequest, ContinuationImpl continuationImpl) {
        zzon zzonVar;
        int i;
        GenerateContentRequest generateContentRequest2;
        RealStrongMemoryCache realStrongMemoryCache;
        ?? r0;
        RealStrongMemoryCache realStrongMemoryCache2;
        GenerateContentRequest generateContentRequest3;
        RealStrongMemoryCache realStrongMemoryCache3;
        String str;
        GenerateContentRequest generateContentRequest4;
        ?? r4;
        String str2;
        if (continuationImpl instanceof zzon) {
            zzonVar = (zzon) continuationImpl;
            int i2 = zzonVar.zze;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzonVar.zze = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzonVar.zzc;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzonVar.zze;
                zzpa zzpaVar = this.zzf;
                int i3 = 1;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        generateContentRequest.getClass();
                        generateContentRequest3 = generateContentRequest;
                        realStrongMemoryCache3 = null;
                        zzonVar.zzf = null;
                        zzonVar.zza = null;
                        zzonVar.zzg = null;
                        zzonVar.zze = 6;
                        zzou zzouVar = this.zzd;
                        zzouVar.getClass();
                        zzfn zzfnVar = zzouVar.zza;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        AtomicLong atomicLong = new AtomicLong();
                        RealStrongMemoryCache realStrongMemoryCache4 = realStrongMemoryCache3 != null ? new RealStrongMemoryCache(atomicLong, elapsedRealtime, realStrongMemoryCache3) : null;
                        zzer zzerVar = zzouVar.zze;
                        Object await = ListenableFutureKt.await(zzouVar.zzc(zzki.zzg(zzki.zzh(zzerVar != null ? zzki.zzd(zzerVar) : zzki.zzg(zzouVar.zze(), new zzaii(zzouVar, 0), zzfnVar.zzf), new zzex(zzouVar, generateContentRequest3, realStrongMemoryCache4, i3), zzfnVar.zzf), new zzait(zzouVar, atomicLong, elapsedRealtime, generateContentRequest3), zzfnVar.zzf), new zzeo(zzouVar)), zzonVar);
                        return await == coroutineSingletons ? coroutineSingletons : await;
                    case 1:
                        str = zzonVar.zzg;
                        realStrongMemoryCache3 = zzonVar.zza;
                        generateContentRequest4 = zzonVar.zzf;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            zzonVar.zzf = generateContentRequest4;
                            zzonVar.zza = realStrongMemoryCache3;
                            zzonVar.zzg = str;
                            zzonVar.zze = 2;
                            obj = zzpa.zzf(zzpaVar, str, zzonVar);
                            break;
                        } else {
                            generateContentRequest3 = generateContentRequest4;
                            zzonVar.zzf = null;
                            zzonVar.zza = null;
                            zzonVar.zzg = null;
                            zzonVar.zze = 6;
                            zzou zzouVar2 = this.zzd;
                            zzouVar2.getClass();
                            zzfn zzfnVar2 = zzouVar2.zza;
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            AtomicLong atomicLong2 = new AtomicLong();
                            if (realStrongMemoryCache3 != null) {
                            }
                            zzer zzerVar2 = zzouVar2.zze;
                            Object await2 = ListenableFutureKt.await(zzouVar2.zzc(zzki.zzg(zzki.zzh(zzerVar2 != null ? zzki.zzd(zzerVar2) : zzki.zzg(zzouVar2.zze(), new zzaii(zzouVar2, 0), zzfnVar2.zzf), new zzex(zzouVar2, generateContentRequest3, realStrongMemoryCache4, i3), zzfnVar2.zzf), new zzait(zzouVar2, atomicLong2, elapsedRealtime2, generateContentRequest3), zzfnVar2.zzf), new zzeo(zzouVar2)), zzonVar);
                            if (await2 == coroutineSingletons) {
                            }
                        }
                        break;
                    case 2:
                        str = zzonVar.zzg;
                        realStrongMemoryCache3 = zzonVar.zza;
                        generateContentRequest4 = zzonVar.zzf;
                        SafeTrace.throwOnFailure(obj);
                        r0 = ((Boolean) obj).booleanValue();
                        if (r0 != true) {
                            zzonVar.zzf = generateContentRequest4;
                            zzonVar.zza = realStrongMemoryCache3;
                            zzonVar.zzg = str;
                            zzonVar.zzb = false;
                            zzonVar.zze = 3;
                            Object zzo = zzo(zzonVar);
                            if (zzo != coroutineSingletons) {
                                String str3 = str;
                                r4 = r0;
                                obj = zzo;
                                generateContentRequest2 = generateContentRequest4;
                                realStrongMemoryCache = realStrongMemoryCache3;
                                str2 = str3;
                                int i4 = r4;
                                if (((Boolean) obj).booleanValue()) {
                                    zzmc zzmcVar = this.zze;
                                    zzonVar.zzf = generateContentRequest2;
                                    zzonVar.zza = realStrongMemoryCache;
                                    zzonVar.zzg = str2;
                                    zzonVar.zzb = r4;
                                    zzonVar.zze = 4;
                                    i = r4;
                                    break;
                                }
                                r0 = i4;
                                realStrongMemoryCache2 = realStrongMemoryCache;
                                if (r0 == true) {
                                    realStrongMemoryCache3 = realStrongMemoryCache2;
                                    generateContentRequest3 = generateContentRequest2;
                                    zzonVar.zzf = null;
                                    zzonVar.zza = null;
                                    zzonVar.zzg = null;
                                    zzonVar.zze = 6;
                                    zzou zzouVar22 = this.zzd;
                                    zzouVar22.getClass();
                                    zzfn zzfnVar22 = zzouVar22.zza;
                                    long elapsedRealtime22 = SystemClock.elapsedRealtime();
                                    AtomicLong atomicLong22 = new AtomicLong();
                                    if (realStrongMemoryCache3 != null) {
                                    }
                                    zzer zzerVar22 = zzouVar22.zze;
                                    Object await22 = ListenableFutureKt.await(zzouVar22.zzc(zzki.zzg(zzki.zzh(zzerVar22 != null ? zzki.zzd(zzerVar22) : zzki.zzg(zzouVar22.zze(), new zzaii(zzouVar22, 0), zzfnVar22.zzf), new zzex(zzouVar22, generateContentRequest3, realStrongMemoryCache4, i3), zzfnVar22.zzf), new zzait(zzouVar22, atomicLong22, elapsedRealtime22, generateContentRequest3), zzfnVar22.zzf), new zzeo(zzouVar22)), zzonVar);
                                    if (await22 == coroutineSingletons) {
                                    }
                                } else {
                                    try {
                                        zzonVar.zzf = generateContentRequest2;
                                        zzonVar.zza = realStrongMemoryCache2;
                                        zzonVar.zzg = null;
                                        zzonVar.zze = 5;
                                        Object zzh = zzpa.zzh(zzpaVar, generateContentRequest2, realStrongMemoryCache2, zzonVar);
                                        if (zzh != coroutineSingletons) {
                                            return zzh;
                                        }
                                    } catch (GenAiException e) {
                                        e = e;
                                        generateContentRequest3 = generateContentRequest2;
                                        Log.w("GenerativeModel", "Inference failed with prefix cache, retry without cache.", e);
                                        realStrongMemoryCache3 = realStrongMemoryCache2;
                                        zzonVar.zzf = null;
                                        zzonVar.zza = null;
                                        zzonVar.zzg = null;
                                        zzonVar.zze = 6;
                                        zzou zzouVar222 = this.zzd;
                                        zzouVar222.getClass();
                                        zzfn zzfnVar222 = zzouVar222.zza;
                                        long elapsedRealtime222 = SystemClock.elapsedRealtime();
                                        AtomicLong atomicLong222 = new AtomicLong();
                                        if (realStrongMemoryCache3 != null) {
                                        }
                                        zzer zzerVar222 = zzouVar222.zze;
                                        Object await222 = ListenableFutureKt.await(zzouVar222.zzc(zzki.zzg(zzki.zzh(zzerVar222 != null ? zzki.zzd(zzerVar222) : zzki.zzg(zzouVar222.zze(), new zzaii(zzouVar222, 0), zzfnVar222.zzf), new zzex(zzouVar222, generateContentRequest3, realStrongMemoryCache4, i3), zzfnVar222.zzf), new zzait(zzouVar222, atomicLong222, elapsedRealtime222, generateContentRequest3), zzfnVar222.zzf), new zzeo(zzouVar222)), zzonVar);
                                        if (await222 == coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                        realStrongMemoryCache2 = realStrongMemoryCache3;
                        generateContentRequest2 = generateContentRequest4;
                        if (r0 == true) {
                        }
                        break;
                    case 3:
                        boolean z = zzonVar.zzb;
                        str2 = zzonVar.zzg;
                        realStrongMemoryCache = zzonVar.zza;
                        generateContentRequest2 = zzonVar.zzf;
                        SafeTrace.throwOnFailure(obj);
                        r4 = z;
                        int i42 = r4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        r0 = i42;
                        realStrongMemoryCache2 = realStrongMemoryCache;
                        if (r0 == true) {
                        }
                        break;
                    case 4:
                        ?? r42 = zzonVar.zzb;
                        str2 = zzonVar.zzg;
                        realStrongMemoryCache = zzonVar.zza;
                        generateContentRequest2 = zzonVar.zzf;
                        SafeTrace.throwOnFailure(obj);
                        i = r42;
                        r0 = true;
                        realStrongMemoryCache2 = realStrongMemoryCache;
                        if (r0 == true) {
                        }
                        break;
                    case 5:
                        realStrongMemoryCache2 = zzonVar.zza;
                        generateContentRequest3 = zzonVar.zzf;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        } catch (GenAiException e2) {
                            e = e2;
                            Log.w("GenerativeModel", "Inference failed with prefix cache, retry without cache.", e);
                            realStrongMemoryCache3 = realStrongMemoryCache2;
                            zzonVar.zzf = null;
                            zzonVar.zza = null;
                            zzonVar.zzg = null;
                            zzonVar.zze = 6;
                            zzou zzouVar2222 = this.zzd;
                            zzouVar2222.getClass();
                            zzfn zzfnVar2222 = zzouVar2222.zza;
                            long elapsedRealtime2222 = SystemClock.elapsedRealtime();
                            AtomicLong atomicLong2222 = new AtomicLong();
                            if (realStrongMemoryCache3 != null) {
                            }
                            zzer zzerVar2222 = zzouVar2222.zze;
                            Object await2222 = ListenableFutureKt.await(zzouVar2222.zzc(zzki.zzg(zzki.zzh(zzerVar2222 != null ? zzki.zzd(zzerVar2222) : zzki.zzg(zzouVar2222.zze(), new zzaii(zzouVar2222, 0), zzfnVar2222.zzf), new zzex(zzouVar2222, generateContentRequest3, realStrongMemoryCache4, i3), zzfnVar2222.zzf), new zzait(zzouVar2222, atomicLong2222, elapsedRealtime2222, generateContentRequest3), zzfnVar2222.zzf), new zzeo(zzouVar2222)), zzonVar);
                            if (await2222 == coroutineSingletons) {
                            }
                        }
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        zzonVar = new zzon(this, continuationImpl);
        Object obj2 = zzonVar.zzc;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzonVar.zze;
        zzpa zzpaVar2 = this.zzf;
        int i32 = 1;
        switch (i) {
        }
    }
}
