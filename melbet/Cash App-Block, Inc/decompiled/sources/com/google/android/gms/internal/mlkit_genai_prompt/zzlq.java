package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.RemoteException;
import android.util.Log;
import androidx.camera.video.VideoCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public class zzlq implements EncoderConfig, CallbackToFutureAdapter$Resolver, zzke {
    public static final zzyj zzb = new zzyj(3);
    public final /* synthetic */ int $r8$classId;
    public Object zzc;
    public Object zzd;
    public Object zze;

    public zzlq(com.google.mlkit.vision.text.zza zzaVar, zzpb zzpbVar) {
        zzajt zzajtVar;
        this.$r8$classId = 9;
        this.zzc = zzpbVar;
        zzeo zzeoVar = new zzeo();
        zzeoVar.f67zza = zzaga.GENERATION_MODE_REGENERATIVE;
        this.zzd = new zzagc(zzeoVar);
        synchronized (CurveFit.class) {
            zzajk zzajkVar = new zzajk();
            synchronized (CurveFit.class) {
                try {
                    if (CurveFit.zza == null) {
                        CurveFit.zza = new com.google.android.gms.internal.mlkit_common.zzsr(1);
                    }
                    zzajtVar = (zzajt) CurveFit.zza.get(zzajkVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzajtVar.getClass();
            this.zze = zzajtVar;
        }
        zzajtVar.getClass();
        this.zze = zzajtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0056, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009c -> B:12:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b4 -> B:11:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzlq zzlqVar, ContinuationImpl continuationImpl) {
        zznb zznbVar;
        int i;
        int intValue;
        Iterator it;
        Collection collection;
        zzlq zzlqVar2;
        int i2;
        if (continuationImpl instanceof zznb) {
            zznbVar = (zznb) continuationImpl;
            int i3 = zznbVar.zzg;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                zznbVar.zzg = i3 - PKIFailureInfo.systemUnavail;
                Object obj = zznbVar.zze;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zznbVar.zzg;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzou zzouVar = (zzou) zzlqVar.zzc;
                    zznbVar.zzh = zzlqVar;
                    zznbVar.zzg = 1;
                    obj = zzajh.zzG(zzouVar, zznbVar);
                } else if (i == 1) {
                    zzlqVar = zznbVar.zzh;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = zznbVar.zzd;
                    collection = zznbVar.zzc;
                    it = zznbVar.zzb;
                    Collection collection2 = zznbVar.zza;
                    zzlqVar2 = zznbVar.zzh;
                    SafeTrace.throwOnFailure(obj);
                    int i4 = ((Number) obj).intValue();
                    collection.add(new Integer(i4));
                    collection = collection2;
                    if (!it.hasNext()) {
                        zzajh zzajhVar = (zzajh) it.next();
                        if (!Intrinsics.areEqual(((LinkedHashMap) zzlqVar2.zze).get(zzajhVar), Boolean.TRUE)) {
                            zznbVar.zzh = zzlqVar2;
                            Collection collection3 = collection;
                            zznbVar.zza = collection3;
                            zznbVar.zzb = it;
                            zznbVar.zzc = collection3;
                            zznbVar.zzd = i2;
                            zznbVar.zzg = 2;
                            obj = zzajhVar.zzg(zznbVar);
                            if (obj != coroutineSingletons) {
                                collection2 = collection;
                                int i42 = ((Number) obj).intValue();
                                collection.add(new Integer(i42));
                                collection = collection2;
                                if (!it.hasNext()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        i42 = 0;
                        collection.add(new Integer(i42));
                        collection = collection2;
                        if (!it.hasNext()) {
                            List list = (List) collection;
                            if (i2 != 1) {
                                List list2 = list;
                                boolean z = list2 instanceof Collection;
                                if (!z || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((Number) it2.next()).intValue() == 1) {
                                        }
                                    }
                                }
                                if (i2 != 2) {
                                    if (!z || !list2.isEmpty()) {
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            if (((Number) it3.next()).intValue() == 2) {
                                            }
                                        }
                                    }
                                    return new Integer(3);
                                }
                                return new Integer(2);
                            }
                            return new Integer(1);
                        }
                    }
                }
                intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                    return new Integer(0);
                }
                List list3 = (List) zzlqVar.zzd;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                collection = arrayList;
                zzlqVar2 = zzlqVar;
                i2 = intValue;
                if (!it.hasNext()) {
                }
            }
        }
        zznbVar = new zznb(zzlqVar, continuationImpl);
        Object obj2 = zznbVar.zze;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zznbVar.zzg;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue != 0) {
        }
    }

    public static final zzaca zzh(zzpb zzpbVar, zznl zznlVar) {
        zzpb zzpbVar2 = zzpb.zza;
        zznl zznlVar2 = zznl.zza;
        int ordinal = zzpbVar.ordinal();
        if (ordinal == 0) {
            int ordinal2 = zznlVar.ordinal();
            if (ordinal2 == 0) {
                return zzaca.SAPI_PROMPT_CREATE;
            }
            if (ordinal2 == 1) {
                return zzaca.SAPI_PROMPT_INFERENCE;
            }
            if (ordinal2 == 2) {
                return zzaca.SAPI_PROMPT_COUNT_TOKENS;
            }
            if (ordinal2 == 3) {
                return zzaca.SAPI_PROMPT_CLOSE;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (ordinal == 1) {
            int ordinal3 = zznlVar.ordinal();
            if (ordinal3 == 0) {
                return zzaca.SAPI_PROMPT_CACHE_CREATION_CREATE;
            }
            if (ordinal3 == 1) {
                return zzaca.SAPI_PROMPT_CACHE_CREATION_INFERENCE;
            }
            if (ordinal3 == 2) {
                return zzaca.SAPI_PROMPT_COUNT_TOKENS;
            }
            if (ordinal3 == 3) {
                return zzaca.SAPI_PROMPT_CACHE_CREATION_CLOSE;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal4 = zznlVar.ordinal();
        if (ordinal4 == 0) {
            return zzaca.SAPI_PROMPT_INFERENCE_WITH_CACHE_CREATE;
        }
        if (ordinal4 == 1) {
            return zzaca.SAPI_PROMPT_INFERENCE_WITH_CACHE_INFERENCE;
        }
        if (ordinal4 == 2) {
            return zzaca.SAPI_PROMPT_COUNT_TOKENS;
        }
        if (ordinal4 == 3) {
            return zzaca.SAPI_PROMPT_INFERENCE_WITH_CACHE_CLOSE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        switch (this.$r8$classId) {
            case 3:
                zzer zzerVar = (zzer) this.zzc;
                zzfo zzfoVar = (zzfo) this.zzd;
                Object obj = this.zze;
                try {
                    Object obj2 = zzfoVar.zza;
                    zzeo zzeoVar = new zzeo();
                    zzeoVar.f67zza = callbackToFutureAdapter$Completer;
                    callbackToFutureAdapter$Completer.addCancellationListener(new zzek(zzerVar.zze(obj2, obj, zzeoVar), 0), zzerVar.zzb);
                    return "runInferenceFuture";
                } catch (RemoteException e) {
                    Log.e("zzer", "Failed to run inference.", e);
                    callbackToFutureAdapter$Completer.setException(new zzcm(2, 6, "Failed to run inference.", e));
                    return null;
                } catch (RuntimeException e2) {
                    Log.e("zzer", "Failed to run inference.", e2);
                    callbackToFutureAdapter$Completer.setException(new zzcm(2, 0, "Failed to run inference.", e2));
                    return null;
                }
            default:
                VideoCapture.AnonymousClass3 anonymousClass3 = (VideoCapture.AnonymousClass3) this.zzc;
                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) this.zzd;
                zzzx zzzxVar = (zzzx) this.zze;
                zzek zzekVar = new zzek(callbackToFutureAdapter$SafeFuture, 2);
                zzjx zzjxVar = zzjx.zza;
                callbackToFutureAdapter$Completer.addCancellationListener(zzekVar, zzjxVar);
                zzfq zzfqVar = new zzfq(1, callbackToFutureAdapter$Completer, zzzxVar);
                synchronized (anonymousClass3.val$surfaceUpdateFuture) {
                    try {
                        if (anonymousClass3.val$isStreamActive) {
                            zzfqVar.run();
                        } else {
                            ((ArrayList) anonymousClass3.this$0).add(zzfqVar);
                        }
                    } finally {
                    }
                }
                callbackToFutureAdapter$SafeFuture.addListener(new zzfq(3, callbackToFutureAdapter$SafeFuture, new zzlq(anonymousClass3, callbackToFutureAdapter$Completer, zzfqVar)), zzjxVar);
                return "FailureSignal.propagate";
        }
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
        ((HashMap) this.zzc).put(cls, objectEncoder);
        ((HashMap) this.zzd).remove(cls);
        return this;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 7:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.zzc);
                sb.append('{');
                zzlq zzlqVar = (zzlq) ((zzlq) this.zzd).zze;
                String str = "";
                while (zzlqVar != null) {
                    Object obj = zzlqVar.zzd;
                    sb.append(str);
                    String str2 = (String) zzlqVar.zzc;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                    }
                    zzlqVar = (zzlq) zzlqVar.zze;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzke
    public void zza(Throwable th) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.zzc;
        if (th instanceof zzcm) {
            callbackToFutureAdapter$Completer.setException(th);
        } else if (th instanceof CancellationException) {
            callbackToFutureAdapter$Completer.setException(zzcm.zzb(7, "Operation was cancelled.", th));
        } else {
            callbackToFutureAdapter$Completer.setException(zzcm.zzb(0, "AiCore request could not be completed.", th));
        }
        VideoCapture.AnonymousClass3.zzc((VideoCapture.AnonymousClass3) this.zze, (zzfq) this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzke
    public void zzb(Object obj) {
        ((CallbackToFutureAdapter$Completer) this.zzc).set(obj);
        VideoCapture.AnonymousClass3.zzc((VideoCapture.AnonymousClass3) this.zze, (zzfq) this.zzd);
    }

    public int zzg(GenerateContentRequest generateContentRequest) {
        generateContentRequest.getClass();
        int length = generateContentRequest.zzh.zza.length();
        zzpb zzpbVar = (zzpb) this.zzc;
        zzpb zzpbVar2 = zzpb.zza;
        zznl zznlVar = zznl.zza;
        int ordinal = zzpbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
            return 0;
        }
        return length;
    }

    public void zza(int i, String str) {
        String valueOf = String.valueOf(i);
        zzhq zzhqVar = new zzhq(6);
        ((zzlq) this.zze).zze = zzhqVar;
        this.zze = zzhqVar;
        zzhqVar.zzd = valueOf;
        zzhqVar.zzc = str;
    }

    public /* synthetic */ zzlq(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    public zzlq() {
        this.$r8$classId = 0;
        this.zzc = new HashMap();
        this.zzd = new HashMap();
        this.zze = zzb;
    }

    public zzlq(VideoCapture.AnonymousClass3 anonymousClass3, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, zzfq zzfqVar) {
        this.$r8$classId = 5;
        this.zzc = callbackToFutureAdapter$Completer;
        this.zzd = zzfqVar;
        this.zze = anonymousClass3;
    }

    public zzlq(zzou zzouVar, List list) {
        this.$r8$classId = 8;
        list.getClass();
        this.zzc = zzouVar;
        this.zzd = list;
        this.zze = new LinkedHashMap();
    }

    public /* synthetic */ zzlq(int i) {
        this.$r8$classId = i;
    }

    public zzlq(String str) {
        this.$r8$classId = 7;
        zzlq zzlqVar = new zzlq(6);
        this.zzd = zzlqVar;
        this.zze = zzlqVar;
        this.zzc = str;
    }
}
