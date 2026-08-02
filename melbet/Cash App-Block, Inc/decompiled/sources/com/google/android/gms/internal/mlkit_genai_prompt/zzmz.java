package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.util.Log;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.network.NetworkFetcher$doFetch$2;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class zzmz {
    public static final zzzx zza = new zzzx(16);
    public static volatile zzmz zzb;
    public Object zzc;
    public Object zzf = new MutexImpl();
    public Serializable zzg = new LinkedHashMap();
    public Object zzh = new MutexImpl();
    public Object zzi;
    public Object zzj;

    public zzmz(ExecutorService executorService) {
        this.zzc = executorService;
        this.zzj = JobKt.CoroutineScope(new ExecutorCoroutineDispatcherImpl(executorService));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r6.zzz(r7, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzg(zzmz zzmzVar, Context context, ContinuationImpl continuationImpl) {
        zzml zzmlVar;
        int i;
        if (continuationImpl instanceof zzml) {
            zzmlVar = (zzml) continuationImpl;
            int i2 = zzmlVar.zzc;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzmlVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzmlVar.zza;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzmlVar.zzc;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzmlVar.zzc = 1;
                    obj = JobKt.withContext(((ContextScope) zzmzVar.zzj).coroutineContext, new EventBridge$sendEvent$1(zzmzVar, context, continuation, 26), zzmlVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Function2 eventBridge$sendEvent$1 = new EventBridge$sendEvent$1((Map) obj, continuation, 25);
                zzmlVar.zzc = 2;
            }
        }
        zzmlVar = new zzml(zzmzVar, continuationImpl);
        Object obj3 = zzmlVar.zza;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzmlVar.zzc;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Function2 eventBridge$sendEvent$12 = new EventBridge$sendEvent$1((Map) obj3, continuation2, 25);
        zzmlVar.zzc = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r10.zzv(r11, r0) != r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzi(zzmz zzmzVar, Context context, Function2 function2, ContinuationImpl continuationImpl) {
        zzmv zzmvVar;
        int i;
        Function2 function22;
        zzmzVar.getClass();
        if (continuationImpl instanceof zzmv) {
            zzmvVar = (zzmv) continuationImpl;
            int i2 = zzmvVar.zze;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzmvVar.zze = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzmvVar.zzc;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzmvVar.zze;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzmvVar.zza = context;
                    zzmvVar.zzb = (SuspendLambda) function2;
                    zzmvVar.zze = 1;
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) zzmvVar.zzb;
                    context = zzmvVar.zza;
                    SafeTrace.throwOnFailure(obj);
                    function22 = function23;
                }
                Function2 zzmoVar = new zzmo(function22, zzmzVar, context, (Continuation) null, 16);
                zzmvVar.zza = null;
                zzmvVar.zzb = null;
                zzmvVar.zze = 2;
                Object zzz = zzmzVar.zzz(zzmoVar, zzmvVar);
                return zzz != obj2 ? obj2 : zzz;
            }
        }
        zzmvVar = new zzmv(zzmzVar, continuationImpl);
        Object obj3 = zzmvVar.zzc;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzmvVar.zze;
        if (i != 0) {
        }
        Function2 zzmoVar2 = new zzmo(function22, zzmzVar, context, (Continuation) null, 16);
        zzmvVar.zza = null;
        zzmvVar.zzb = null;
        zzmvVar.zze = 2;
        Object zzz2 = zzmzVar.zzz(zzmoVar2, zzmvVar);
        if (zzz2 != obj22) {
        }
    }

    public static /* synthetic */ Object zzp(zzmz zzmzVar, Context context, String str, ContinuationImpl continuationImpl) {
        Continuation continuation = null;
        if (str.length() == 0) {
            return null;
        }
        return zzmzVar.zzx(context, new zzms(str, continuation, 0), continuationImpl);
    }

    public static final void zzr(Context context, zzmd zzmdVar) {
        File zzt = zzt(context);
        String str = zzmdVar.zzb;
        File file = new File(zzt, str);
        if (!file.exists() || file.delete()) {
            return;
        }
        Log.w("CacheManager", "Failed to delete cache file: " + str + ".");
    }

    public static File zzt(Context context) {
        File file = new File(context.getApplicationContext().getFilesDir(), ".mlkit_prefix_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public Object zzu(Context context, String str, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(((ContextScope) this.zzj).coroutineContext, new RealImageLoader$execute$2(this, context, str, null, 23), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r6.join(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r8.lock(r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:18:0x004e, B:20:0x0054), top: B:17:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object zzv(Context context, ContinuationImpl continuationImpl) {
        zzmj zzmjVar;
        int i;
        MutexImpl mutexImpl;
        StandaloneCoroutine standaloneCoroutine;
        try {
            if (continuationImpl instanceof zzmj) {
                zzmjVar = (zzmj) continuationImpl;
                int i2 = zzmjVar.zze;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    zzmjVar.zze = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = zzmjVar.zzc;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zzmjVar.zze;
                    int i3 = 2;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = (MutexImpl) this.zzh;
                        zzmjVar.zza = context;
                        zzmjVar.zzb = mutexImpl;
                        zzmjVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = zzmjVar.zzb;
                        Context context2 = zzmjVar.zza;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        context = context2;
                    }
                    if (((StandaloneCoroutine) this.zzi) == null) {
                        this.zzi = JobKt.launch$default((ContextScope) this.zzj, null, null, new NetworkFetcher$doFetch$2(this, context, continuation, i3), 3);
                    }
                    mutexImpl.unlock(null);
                    standaloneCoroutine = (StandaloneCoroutine) this.zzi;
                    if (standaloneCoroutine != null) {
                        return Unit.INSTANCE;
                    }
                    zzmjVar.zza = null;
                    zzmjVar.zzb = null;
                    zzmjVar.zze = 2;
                }
            }
            if (((StandaloneCoroutine) this.zzi) == null) {
            }
            mutexImpl.unlock(null);
            standaloneCoroutine = (StandaloneCoroutine) this.zzi;
            if (standaloneCoroutine != null) {
            }
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        zzmjVar = new zzmj(this, continuationImpl);
        Object obj2 = zzmjVar.zzc;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzmjVar.zze;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r9.lock(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (zzv(r9, r0) != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.mlkit_genai_prompt.zzmz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object zzx(Context context, zzms zzmsVar, ContinuationImpl continuationImpl) {
        zzmu zzmuVar;
        int i;
        zzms zzmsVar2;
        MutexImpl mutexImpl;
        Function2 function2;
        Throwable th;
        Mutex mutex;
        if (continuationImpl instanceof zzmu) {
            zzmuVar = (zzmu) continuationImpl;
            int i2 = zzmuVar.zze;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzmuVar.zze = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzmuVar.zzc;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzmuVar.zze;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzmuVar.zza = zzmsVar;
                    zzmuVar.zze = 1;
                    zzmsVar2 = zzmsVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = (Mutex) zzmuVar.zza;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        mutexImpl = zzmuVar.zzb;
                        Function2 function22 = (Function2) zzmuVar.zza;
                        SafeTrace.throwOnFailure(obj);
                        function2 = function22;
                        try {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) this.zzg;
                            zzmuVar.zza = mutexImpl;
                            zzmuVar.zzb = null;
                            zzmuVar.zze = 3;
                            obj = function2.invoke(linkedHashMap, zzmuVar);
                            if (obj != coroutineSingletons) {
                                mutex = mutexImpl;
                                mutex.unlock(null);
                                return obj;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            MutexImpl mutexImpl2 = mutexImpl;
                            th = th3;
                            mutex = mutexImpl2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    ?? r10 = (Function2) zzmuVar.zza;
                    SafeTrace.throwOnFailure(obj);
                    zzmsVar2 = r10;
                }
                mutexImpl = (MutexImpl) this.zzf;
                zzmuVar.zza = zzmsVar2;
                zzmuVar.zzb = mutexImpl;
                zzmuVar.zze = 2;
                function2 = zzmsVar2;
            }
        }
        zzmuVar = new zzmu(this, continuationImpl);
        Object obj2 = zzmuVar.zzc;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzmuVar.zze;
        if (i != 0) {
        }
        mutexImpl = (MutexImpl) this.zzf;
        zzmuVar.zza = zzmsVar2;
        zzmuVar.zzb = mutexImpl;
        zzmuVar.zze = 2;
        function2 = zzmsVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object zzz(Function2 function2, ContinuationImpl continuationImpl) {
        zzmx zzmxVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Function2 function22;
        MutexImpl mutexImpl;
        Throwable th;
        Mutex mutex;
        try {
            if (continuationImpl instanceof zzmx) {
                zzmxVar = (zzmx) continuationImpl;
                int i2 = zzmxVar.zze;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    zzmxVar.zze = i2 - PKIFailureInfo.systemUnavail;
                    obj = zzmxVar.zzc;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zzmxVar.zze;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        MutexImpl mutexImpl2 = (MutexImpl) this.zzf;
                        zzmxVar.zza = function2;
                        zzmxVar.zzb = mutexImpl2;
                        zzmxVar.zze = 1;
                        if (mutexImpl2.lock(zzmxVar) != coroutineSingletons) {
                            function22 = function2;
                            mutexImpl = mutexImpl2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = (Mutex) zzmxVar.zza;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    mutexImpl = zzmxVar.zzb;
                    function22 = (Function2) zzmxVar.zza;
                    SafeTrace.throwOnFailure(obj);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.zzg;
                    zzmxVar.zza = mutexImpl;
                    zzmxVar.zzb = null;
                    zzmxVar.zze = 2;
                    obj = function22.invoke(linkedHashMap, zzmxVar);
                    if (obj != coroutineSingletons) {
                        mutex = mutexImpl;
                        mutex.unlock(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.zzg;
            zzmxVar.zza = mutexImpl;
            zzmxVar.zzb = null;
            zzmxVar.zze = 2;
            obj = function22.invoke(linkedHashMap2, zzmxVar);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            MutexImpl mutexImpl3 = mutexImpl;
            th = th3;
            mutex = mutexImpl3;
            mutex.unlock(null);
            throw th;
        }
        zzmxVar = new zzmx(this, continuationImpl);
        obj = zzmxVar.zzc;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzmxVar.zze;
        if (i != 0) {
        }
    }
}
