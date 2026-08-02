package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.memory.RealStrongMemoryCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.genai.common.GenAiException;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import kotlin.Unit;
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
public final class zzpa extends zzajh {
    public final Context zza;
    public final zzmz zzb;
    public final ContextScope zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpa(Context context, int i, zzlq zzlqVar) {
        super(i, zzlqVar);
        context.getClass();
        zzmz m2023zza = zzmz.zza.m2023zza();
        this.zza = context;
        this.zzb = m2023zza;
        zzku zzkuVar = super.zza.zzf;
        zzkuVar.getClass();
        this.zzc = JobKt.CoroutineScope(new ExecutorCoroutineDispatcherImpl(zzkuVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r0 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zza(zzpa zzpaVar, String str, ContinuationImpl continuationImpl) {
        zzox zzoxVar;
        int i;
        zzfz zzfzVar;
        Object zzp;
        zzmd zzmdVar;
        String str2;
        zzfz zzfzVar2;
        ParcelFileDescriptor parcelFileDescriptor;
        Context context = zzpaVar.zza;
        zzmz zzmzVar = zzpaVar.zzb;
        if (continuationImpl instanceof zzox) {
            zzoxVar = (zzox) continuationImpl;
            int i2 = zzoxVar.zzd;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzoxVar.zzd = i2 - PKIFailureInfo.systemUnavail;
                zzox zzoxVar2 = zzoxVar;
                Object obj = zzoxVar2.zzb;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzoxVar2.zzd;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str.length() == 0) {
                        throw new GenAiException(0, "Prompt prefix is empty", null);
                    }
                    if (str.length() > 32000) {
                        throw new GenAiException(12, "Prompt prefix length exceeds the limit. Please check the countTokens API.", null);
                    }
                    zzfzVar = new zzfz(str, 0);
                    zzoxVar2.zze = str;
                    zzoxVar2.zza = zzfzVar;
                    zzoxVar2.zzd = 1;
                    zzp = zzmz.zzp(zzmzVar, context, str, zzoxVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zzfzVar2 = zzoxVar2.zza;
                        str2 = zzoxVar2.zze;
                        SafeTrace.throwOnFailure(obj);
                        parcelFileDescriptor = (ParcelFileDescriptor) obj;
                        if (parcelFileDescriptor != null) {
                            throw new GenAiException(-103, "Failed to open cache file descriptor for ".concat(String.valueOf(str2)), null);
                        }
                        zzij zzijVar = zzil.zza;
                        zzil.zzj(zzir.zza);
                        zzil zzj = zzil.zzj(CollectionsKt__CollectionsJVMKt.listOf(zzfzVar2));
                        if (zzj != null) {
                            return new zzgc(zzj, parcelFileDescriptor);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: promptPrefix");
                        return null;
                    }
                    zzfz zzfzVar3 = zzoxVar2.zza;
                    String str3 = zzoxVar2.zze;
                    SafeTrace.throwOnFailure(obj);
                    zzfzVar = zzfzVar3;
                    str = str3;
                    zzp = obj;
                }
                zzmdVar = (zzmd) zzp;
                if (zzmdVar != null) {
                    throw new GenAiException(-103, "Failed to find cache for ".concat(String.valueOf(str)), null);
                }
                zzoxVar2.zze = str;
                zzoxVar2.zza = zzfzVar;
                zzoxVar2.zzd = 2;
                Object withContext = JobKt.withContext(((ContextScope) zzmzVar.zzj).coroutineContext, new zzmo(zzmdVar, zzmzVar, context, continuation, 0), zzoxVar2);
                if (withContext != coroutineSingletons) {
                    zzfz zzfzVar4 = zzfzVar;
                    obj = withContext;
                    str2 = str;
                    zzfzVar2 = zzfzVar4;
                    parcelFileDescriptor = (ParcelFileDescriptor) obj;
                    if (parcelFileDescriptor != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        zzoxVar = new zzox(zzpaVar, continuationImpl);
        zzox zzoxVar22 = zzoxVar;
        Object obj2 = zzoxVar22.zzb;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzoxVar22.zzd;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        zzmdVar = (zzmd) zzp;
        if (zzmdVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzpa zzpaVar, ContinuationImpl continuationImpl) {
        zzov zzovVar;
        int i;
        try {
            if (continuationImpl instanceof zzov) {
                zzovVar = (zzov) continuationImpl;
                int i2 = zzovVar.zzc;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    zzovVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = zzovVar.zza;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zzovVar.zzc;
                    if (i == 0) {
                        if (i == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    zzovVar.zzc = 1;
                    zzpaVar.getClass();
                    Object zzG = zzajh.zzG(zzpaVar, zzovVar);
                    return zzG == coroutineSingletons ? coroutineSingletons : zzG;
                }
            }
            if (i == 0) {
            }
        } catch (GenAiException unused) {
            return new Integer(0);
        }
        zzovVar = new zzov(zzpaVar, continuationImpl);
        Object obj2 = zzovVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzovVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzf(zzpa zzpaVar, String str, ContinuationImpl continuationImpl) {
        zzoy zzoyVar;
        int i;
        if (continuationImpl instanceof zzoy) {
            zzoyVar = (zzoy) continuationImpl;
            int i2 = zzoyVar.zzc;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzoyVar.zzc = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzoyVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzoyVar.zzc;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzmz zzmzVar = zzpaVar.zzb;
                    Context context = zzpaVar.zza;
                    zzoyVar.zzc = 1;
                    obj = zzmz.zzp(zzmzVar, context, str, zzoyVar);
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
                return Boolean.valueOf(((zzmd) obj) != null);
            }
        }
        zzoyVar = new zzoy(zzpaVar, continuationImpl);
        Object obj2 = zzoyVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzoyVar.zzc;
        if (i != 0) {
        }
        return Boolean.valueOf(((zzmd) obj2) != null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(3:17|18|(3:20|(1:22)|(1:24)(1:25))(1:26)))(2:27|28))(3:32|33|(2:35|24))|29|30))|40|6|7|(0)(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
    
        r8.getClass();
        r8 = r7.zzb;
        r10 = r7.zza;
        r0.zza = r7;
        r0.zzb = r9;
        r0.zze = 2;
        r10 = com.google.android.gms.internal.mlkit_genai_prompt.zzmz.zzp(r8, r10, "", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        r8 = r7;
        r7 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzh(zzpa zzpaVar, GenerateContentRequest generateContentRequest, RealStrongMemoryCache realStrongMemoryCache, ContinuationImpl continuationImpl) {
        zzoz zzozVar;
        int i;
        if (continuationImpl instanceof zzoz) {
            zzozVar = (zzoz) continuationImpl;
            int i2 = zzozVar.zze;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzozVar.zze = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzozVar.zzc;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzozVar.zze;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzja zzB = zzpaVar.zzB(generateContentRequest, realStrongMemoryCache);
                    zzozVar.zza = zzpaVar;
                    zzozVar.zzb = generateContentRequest;
                    zzozVar.zze = 1;
                    obj = ListenableFutureKt.await(zzB, zzozVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            GenAiException genAiException = (GenAiException) zzozVar.zza;
                            SafeTrace.throwOnFailure(obj);
                            throw genAiException;
                        }
                        GenAiException genAiException2 = (GenAiException) zzozVar.zzb;
                        zzpa zzpaVar2 = (zzpa) zzozVar.zza;
                        SafeTrace.throwOnFailure(obj);
                        zzmd zzmdVar = (zzmd) obj;
                        if (zzmdVar == null) {
                            throw genAiException2;
                        }
                        zzmz zzmzVar = zzpaVar2.zzb;
                        Context context = zzpaVar2.zza;
                        zzozVar.zza = genAiException2;
                        zzozVar.zzb = null;
                        zzozVar.zze = 3;
                        Object zzu = zzmzVar.zzu(context, zzmdVar.zza, zzozVar);
                        if (zzu != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            zzu = Unit.INSTANCE;
                        }
                        if (zzu == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        throw genAiException2;
                    }
                    generateContentRequest = (GenerateContentRequest) zzozVar.zzb;
                    zzpaVar = (zzpa) zzozVar.zza;
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        zzozVar = new zzoz(zzpaVar, continuationImpl);
        Object obj2 = zzozVar.zzc;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzozVar.zze;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final zzer zzb(zzfn zzfnVar, zzct zzctVar) {
        zzfnVar.getClass();
        zzctVar.getClass();
        zzgk zzgkVar = new zzgk(zzctVar, zzfnVar, new zzzx(15));
        return new zzgw(zzgkVar.zzc, zzgkVar.zza, zzgkVar.zzb);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ ListenableFuture zzd(Object obj, RealStrongMemoryCache realStrongMemoryCache) {
        GenerateContentRequest generateContentRequest = (GenerateContentRequest) obj;
        generateContentRequest.getClass();
        return ListenableFutureKt.future$default(this.zzc, new RealImageLoader$execute$2(generateContentRequest, this, realStrongMemoryCache, null, 24));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final Object zzg(zznb zznbVar) {
        return zzc(this, zznbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ Object zzi(Object obj, RealStrongMemoryCache realStrongMemoryCache) {
        ((GenerateContentRequest) obj).getClass();
        throw new UnsupportedOperationException("Use createAiCoreRequestAsync instead.");
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ GenerateContentResponse zzk(Object obj) {
        zzgh zzghVar = (zzgh) obj;
        zzghVar.getClass();
        return zznv.zzb(zzghVar);
    }
}
