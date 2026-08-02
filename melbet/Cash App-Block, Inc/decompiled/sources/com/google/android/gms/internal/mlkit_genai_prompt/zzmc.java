package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import coil3.memory.RealStrongMemoryCache;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.genai.common.GenAiException;
import com.google.mlkit.genai.prompt.Candidate;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.guava.ListenableFutureKt;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class zzmc extends zzajh {
    public final Context zza;
    public final zzmz zzb;
    public final ConcurrentHashMap zzc;
    public final ContextScope zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmc(Context context, int i, zzlq zzlqVar) {
        super(i, zzlqVar);
        context.getClass();
        zzmz m2023zza = zzmz.zza.m2023zza();
        this.zza = context;
        this.zzb = m2023zza;
        this.zzc = new ConcurrentHashMap();
        zzku zzkuVar = super.zza.zzf;
        zzkuVar.getClass();
        this.zzd = JobKt.CoroutineScope(new ExecutorCoroutineDispatcherImpl(zzkuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzdb zzf(zzmc zzmcVar, GenerateContentRequest generateContentRequest, ContinuationImpl continuationImpl) {
        zzlw zzlwVar;
        int i;
        if (continuationImpl instanceof zzlw) {
            zzlwVar = (zzlw) continuationImpl;
            int i2 = zzlwVar.zzc;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzlwVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzlwVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzlwVar.zzc;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    generateContentRequest.getClass();
                    a$$ExternalSyntheticBUOutline0.m$3("Prompt prefix is null");
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                if (parcelFileDescriptor != null) {
                    return new zzdb(parcelFileDescriptor, new zzeo(zzmcVar));
                }
                throw new GenAiException(-103, "Failed to open cache file descriptor to create cache for prefix: ".concat("null"), null);
            }
        }
        zzlwVar = new zzlw(zzmcVar, continuationImpl);
        Object obj2 = zzlwVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzlwVar.zzc;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzh(zzmc zzmcVar, ContinuationImpl continuationImpl) {
        zzlu zzluVar;
        int i;
        try {
            if (continuationImpl instanceof zzlu) {
                zzluVar = (zzlu) continuationImpl;
                int i2 = zzluVar.zzc;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    zzluVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = zzluVar.zza;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zzluVar.zzc;
                    if (i == 0) {
                        if (i == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    zzluVar.zzc = 1;
                    zzmcVar.getClass();
                    Object zzG = zzajh.zzG(zzmcVar, zzluVar);
                    return zzG == coroutineSingletons ? coroutineSingletons : zzG;
                }
            }
            if (i == 0) {
            }
        } catch (GenAiException unused) {
            return new Integer(0);
        }
        zzluVar = new zzlu(zzmcVar, continuationImpl);
        Object obj2 = zzluVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzluVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzj(zzmc zzmcVar, GenerateContentRequest generateContentRequest, ContinuationImpl continuationImpl) {
        zzly zzlyVar;
        int i;
        if (continuationImpl instanceof zzly) {
            zzlyVar = (zzly) continuationImpl;
            int i2 = zzlyVar.zzc;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzlyVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzlyVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzlyVar.zzc;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(zzmcVar, generateContentRequest, continuation, 19);
                    zzlyVar.zzc = 1;
                    obj = JobKt.coroutineScope(realImageLoader$execute$result$1, zzlyVar);
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
                obj.getClass();
                return obj;
            }
        }
        zzlyVar = new zzly(zzmcVar, continuationImpl);
        Object obj2 = zzlyVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzlyVar.zzc;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final zzer zzb(zzfn zzfnVar, zzct zzctVar) {
        zzfnVar.getClass();
        zzctVar.getClass();
        return new zzdn(zzctVar, zzfnVar, new zzzx(12));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ ListenableFuture zzd(Object obj, RealStrongMemoryCache realStrongMemoryCache) {
        GenerateContentRequest generateContentRequest = (GenerateContentRequest) obj;
        generateContentRequest.getClass();
        return ListenableFutureKt.future$default(this.zzd, new NetworkFetcher$doFetch$2(this, generateContentRequest, null, 1));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final Object zzg(zznb zznbVar) {
        return zzh(this, zznbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ Object zzi(Object obj, RealStrongMemoryCache realStrongMemoryCache) {
        ((GenerateContentRequest) obj).getClass();
        throw new UnsupportedOperationException("Use createAiCoreRequestAsync instead.");
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final GenerateContentResponse zzk(Object obj) {
        ((zzdc) obj).getClass();
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Candidate(""));
        listOf.getClass();
        return new GenerateContentResponse(listOf);
    }
}
