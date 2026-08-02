package com.google.android.libraries.places.api.net.kotlin;

import android.os.SystemClock;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import coil3.request.OneShotDisposable;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzfg;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.zzc;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzf;
import com.google.android.libraries.places.api.net.zzh;
import com.google.android.libraries.places.api.net.zzr;
import com.google.android.libraries.places.api.net.zzs;
import com.google.android.libraries.places.api.net.zzt;
import com.google.android.libraries.places.api.net.zzv;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfa;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzhg;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.libraries.places.internal.zznv;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import com.miteksystems.misnap.camera.a.b;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import okio.Okio;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.AndroidMainExecutor;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a(\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\u0010\u0010\r\u001a@\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0087@¢\u0006\u0004\b \u0010!\u001a(\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0087@¢\u0006\u0004\b \u0010$\u001a@\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010%\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b(\u0010\u0019\u001a@\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010*\u001a\u00020)2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u0001H\u0087@¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/google/android/libraries/places/api/net/PlacesClient;", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/zzj;", "", "actions", "Lcom/google/android/libraries/places/api/net/zzl;", "awaitFindAutocompletePredictions", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "photoMetadata", "Lcom/fillr/n;", "Lcom/google/android/libraries/places/api/net/zzc;", "awaitFetchPhoto", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/PhotoMetadata;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/fillr/featuretoggle/UnleashContext;", "Lcom/google/android/libraries/places/api/net/zzi;", "awaitFetchResolvedPhotoUri", "", "placeId", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "placeFields", "Landroidx/emoji2/text/MetadataRepo;", "Lcom/google/android/libraries/places/api/net/zzf;", "awaitFetchPlace", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/zzo;", "awaitFindCurrentPlace", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "utcTimeMillis", "Lcom/google/android/libraries/places/api/net/zzr;", "awaitIsOpen", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/model/Place;", "place", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "textQuery", "Lcom/google/android/libraries/places/api/net/zzs;", "Lcom/google/android/libraries/places/api/net/zzv;", "awaitSearchByText", "Lcom/google/android/libraries/places/api/model/LocationRestriction;", "locationRestriction", "Lcom/miteksystems/misnap/camera/a/b$a;", "", "awaitSearchNearby", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/LocationRestriction;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlacesClientKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitFetchPhoto(PlacesClient placesClient, PhotoMetadata photoMetadata, Function1<? super n, Unit> function1, Continuation<? super zzc> continuation) {
        zzi zziVar;
        int i;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i2 = zziVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zziVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zziVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zziVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    n nVar = new n();
                    if (photoMetadata == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null photoMetadata");
                        return null;
                    }
                    nVar.c = photoMetadata;
                    nVar.d = (zzb) oneShotDisposable.job;
                    function1.invoke(nVar);
                    PhotoMetadata photoMetadata2 = (PhotoMetadata) nVar.c;
                    if (photoMetadata2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Property \"photoMetadata\" has not been set");
                        return null;
                    }
                    if (((Integer) nVar.a) == null && ((Integer) nVar.b) == null) {
                        zzfg zzfgVar = (zzfg) photoMetadata2;
                        int i3 = zzfgVar.zzc;
                        if (i3 > 0) {
                            nVar.a = Integer.valueOf(i3);
                        }
                        int i4 = zzfgVar.zzb;
                        if (i4 > 0) {
                            nVar.b = Integer.valueOf(i4);
                        }
                    }
                    PhotoMetadata photoMetadata3 = (PhotoMetadata) nVar.c;
                    if (photoMetadata3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: photoMetadata");
                        return null;
                    }
                    com.google.android.libraries.places.api.net.zzb zzbVar = new com.google.android.libraries.places.api.net.zzb((Integer) nVar.a, (Integer) nVar.b, photoMetadata3, (zzb) nVar.d);
                    e0 e0Var = (e0) placesClient;
                    e0Var.getClass();
                    try {
                        zzgb zzgbVar = new zzgb();
                        zzw zzb = ((JWECryptoParts) e0Var.a).zzb(zzbVar);
                        zzhg zzhgVar = new zzhg(e0Var, zzbVar, zzgbVar, 0);
                        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                        Task continueWithTask = ((zzw) zzb.continueWith(androidMainExecutor, zzhgVar)).continueWithTask(androidMainExecutor, zzgc.zza$8);
                        zziVar.zzb = 1;
                        obj = Okio.awaitImpl(continueWithTask, oneShotDisposable, zziVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Error | RuntimeException e) {
                        zznv.zzb(e);
                        throw e;
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
        zziVar = new zzi(continuation);
        Object obj2 = zziVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zziVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitFetchPlace(PlacesClient placesClient, String str, List<? extends Place.Field> list, Function1<? super MetadataRepo, Unit> function1, Continuation<? super zzf> continuation) {
        zzj zzjVar;
        int i;
        if (continuation instanceof zzj) {
            zzjVar = (zzj) continuation;
            int i2 = zzjVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzjVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzjVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzjVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    MetadataRepo builder = zze.builder(str, list);
                    builder.mTypeface = (zzb) oneShotDisposable.job;
                    function1.invoke(builder);
                    Task zzd = ((e0) placesClient).zzd(builder.build(), zzns.zzc);
                    zzjVar.zzb = 1;
                    obj = Okio.awaitImpl(zzd, oneShotDisposable, zzjVar);
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
        zzjVar = new zzj(continuation);
        Object obj2 = zzjVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzjVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitFetchResolvedPhotoUri(PlacesClient placesClient, PhotoMetadata photoMetadata, Function1<? super UnleashContext, Unit> function1, Continuation<? super com.google.android.libraries.places.api.net.zzi> continuation) {
        zzk zzkVar;
        int i;
        if (continuation instanceof zzk) {
            zzkVar = (zzk) continuation;
            int i2 = zzkVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzkVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzkVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzkVar.zzb;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    UnleashContext unleashContext = new UnleashContext();
                    if (photoMetadata == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null photoMetadata");
                        return null;
                    }
                    unleashContext.remoteAddress = photoMetadata;
                    unleashContext.properties = (zzb) oneShotDisposable.job;
                    function1.invoke(unleashContext);
                    PhotoMetadata photoMetadata2 = (PhotoMetadata) unleashContext.remoteAddress;
                    if (photoMetadata2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Property \"photoMetadata\" has not been set");
                        return null;
                    }
                    Integer num = (Integer) unleashContext.userId;
                    Integer num2 = (Integer) unleashContext.sessionId;
                    zzfg zzfgVar = (zzfg) photoMetadata2;
                    Trace.checkArgument("To construct the FetchResolvedPhotoUriRequest, the provided PhotoMetadata must be fetched from Places API (New). You must first call initializeWithNewPlacesApiEnabled to initialize the PlaceClient and retrieve the PhotoMetadata. Once you have the PhotoMetadata, you must pass it into the FetchResolvedPhotoUriRequest.", zzfgVar.zze != null);
                    if (num != null) {
                        Trace.checkArgument("Max width must not be < 1, but was: %s.", num, num.intValue() > 0);
                        if (!(num.intValue() <= 4800)) {
                            a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat("Max width must not be > %s, but was: %s.", 4800, num));
                            return null;
                        }
                    }
                    if (num2 != null) {
                        Trace.checkArgument("Max height must not be < 1, but was: %s.", num2, num2.intValue() > 0);
                        if (!(num2.intValue() <= 4800)) {
                            a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat("Max height must not be > %s, but was: %s.", 4800, num2));
                            return null;
                        }
                    }
                    if (num == null && num2 == null) {
                        int i4 = zzfgVar.zzc;
                        if (i4 > 0) {
                            unleashContext.userId = Integer.valueOf(Math.min(4800, i4));
                        }
                        int i5 = zzfgVar.zzb;
                        if (i5 > 0) {
                            unleashContext.sessionId = Integer.valueOf(Math.min(4800, i5));
                        }
                    }
                    Trace.checkState("Must include max width or max height in the request.", (((Integer) unleashContext.userId) == null && ((Integer) unleashContext.sessionId) == null) ? false : true);
                    PhotoMetadata photoMetadata3 = (PhotoMetadata) unleashContext.remoteAddress;
                    if (photoMetadata3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: photoMetadata");
                        return null;
                    }
                    zzh zzhVar = new zzh((Integer) unleashContext.userId, (Integer) unleashContext.sessionId, photoMetadata3, (zzb) unleashContext.properties);
                    e0 e0Var = (e0) placesClient;
                    e0Var.getClass();
                    try {
                        zzgb zzgbVar = new zzgb();
                        Task zzd = ((SubtreeManager) e0Var.h).zzd(zzhVar);
                        zzhg zzhgVar = new zzhg(e0Var, zzhVar, zzgbVar, i3);
                        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                        Task continueWithTask = ((zzw) ((zzw) zzd).continueWith(androidMainExecutor, zzhgVar)).continueWithTask(androidMainExecutor, zzgc.zza$9);
                        zzkVar.zzb = 1;
                        obj = Okio.awaitImpl(continueWithTask, oneShotDisposable, zzkVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Error | RuntimeException e) {
                        zznv.zzb(e);
                        throw e;
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
        zzkVar = new zzk(continuation);
        Object obj2 = zzkVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzkVar.zzb;
        int i32 = 1;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitFindAutocompletePredictions(PlacesClient placesClient, Function1<? super com.google.android.libraries.places.api.net.zzj, Unit> function1, Continuation<? super com.google.android.libraries.places.api.net.zzl> continuation) {
        zzl zzlVar;
        int i;
        if (continuation instanceof zzl) {
            zzlVar = (zzl) continuation;
            int i2 = zzlVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzlVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzlVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzlVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    com.google.android.libraries.places.api.net.zzj builder = com.google.android.libraries.places.api.net.zzk.builder();
                    builder.zzk = (zzb) oneShotDisposable.job;
                    function1.invoke(builder);
                    Task zza = ((e0) placesClient).zza(builder.build(), zzns.zzc);
                    zzlVar.zzb = 1;
                    obj = Okio.awaitImpl(zza, oneShotDisposable, zzlVar);
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
        zzlVar = new zzl(continuation);
        Object obj2 = zzlVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzlVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitFindCurrentPlace(PlacesClient placesClient, List<? extends Place.Field> list, Continuation<? super com.google.android.libraries.places.api.net.zzo> continuation) {
        zzm zzmVar;
        int i;
        if (continuation instanceof zzm) {
            zzmVar = (zzm) continuation;
            int i2 = zzmVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzmVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzmVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzmVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    list.getClass();
                    zzb zzbVar = (zzb) oneShotDisposable.job;
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
                    if (copyOf == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null placeFields");
                        return null;
                    }
                    com.google.android.libraries.places.api.net.zzn zznVar = new com.google.android.libraries.places.api.net.zzn(copyOf, zzbVar);
                    e0 e0Var = (e0) placesClient;
                    e0Var.getClass();
                    try {
                        ((zzfa) ((zzex) e0Var.f)).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        zzgb zzgbVar = new zzgb();
                        Task onSuccessTask = ((zzah) e0Var.b).zza(zzbVar).onSuccessTask(new Box(28, e0Var, zznVar));
                        RealStrongMemoryCache realStrongMemoryCache = new RealStrongMemoryCache(e0Var, zznVar, elapsedRealtime, zzgbVar);
                        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                        Task continueWithTask = ((zzw) ((zzw) onSuccessTask).continueWith(androidMainExecutor, realStrongMemoryCache)).continueWithTask(androidMainExecutor, zzgc.zza$3);
                        zzmVar.zzb = 1;
                        obj = Okio.awaitImpl(continueWithTask, oneShotDisposable, zzmVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Error | RuntimeException e) {
                        zznv.zzb(e);
                        throw e;
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
        zzmVar = new zzm(continuation);
        Object obj2 = zzmVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzmVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitIsOpen(PlacesClient placesClient, Place place, Long l, Continuation<? super zzr> continuation) {
        zzo zzoVar;
        int i;
        com.google.android.libraries.places.api.net.zzp zzpVar;
        if (continuation instanceof zzo) {
            zzoVar = (zzo) continuation;
            int i2 = zzoVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzoVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzoVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzoVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    place.getClass();
                    if (l == null) {
                        zzpVar = new com.google.android.libraries.places.api.net.zzp();
                        zzpVar.zza = place;
                        zzpVar.zzc = System.currentTimeMillis();
                        zzpVar.zze = (byte) 1;
                    } else {
                        long longValue = l.longValue();
                        zzpVar = new com.google.android.libraries.places.api.net.zzp();
                        zzpVar.zza = place;
                        zzpVar.zzc = longValue;
                        zzpVar.zze = (byte) 1;
                    }
                    zzpVar.zzd = (zzb) oneShotDisposable.job;
                    Task zzg = ((e0) placesClient).zzg(zzpVar.build());
                    zzg.getClass();
                    zzoVar.zzb = 1;
                    obj = Okio.awaitImpl(zzg, oneShotDisposable, zzoVar);
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
        zzoVar = new zzo(continuation);
        Object obj2 = zzoVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzoVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitSearchByText(PlacesClient placesClient, String str, List<? extends Place.Field> list, Function1<? super zzs, Unit> function1, Continuation<? super zzv> continuation) {
        zzp zzpVar;
        int i;
        List list2;
        List list3;
        String str2;
        if (continuation instanceof zzp) {
            zzpVar = (zzp) continuation;
            int i2 = zzpVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzpVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzpVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzpVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i3 = 25;
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    zzs zzsVar = new zzs();
                    zzsVar.zzv = (byte) (zzsVar.zzv | 1);
                    if (list == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null placeFields");
                        return null;
                    }
                    zzsVar.zzh = list;
                    zzsVar.zzi = new ArrayList();
                    if (str == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null textQuery");
                        return null;
                    }
                    zzsVar.zzm = str;
                    byte b = (byte) (((byte) (((byte) (zzsVar.zzv | 2)) | 4)) | 8);
                    zzsVar.zzu = 1;
                    zzsVar.zzv = (byte) (((byte) (b | PnmConstants.PNM_SEPARATOR)) | 16);
                    zzsVar.zza = (zzb) oneShotDisposable.job;
                    function1.invoke(zzsVar);
                    Double valueOf = Double.valueOf(5.0d);
                    Double valueOf2 = Double.valueOf(1.0d);
                    List list4 = zzsVar.zzh;
                    if (list4 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Property \"placeFields\" has not been set");
                        return null;
                    }
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) list4);
                    if (copyOf == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null placeFields");
                        return null;
                    }
                    zzsVar.zzh = copyOf;
                    List list5 = zzsVar.zzi;
                    if (list5 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Property \"priceLevels\" has not been set");
                        return null;
                    }
                    ImmutableList<Integer> copyOf2 = ImmutableList.copyOf((Collection) list5);
                    if (copyOf2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null priceLevels");
                        return null;
                    }
                    zzsVar.zzi = copyOf2;
                    if (!copyOf2.isEmpty()) {
                        for (Integer num : copyOf2) {
                            Trace.checkArgument(Range.closed(0, 4).contains(num), "Price level must not be out of range of %s to %s, but was: %s.", valueOf2, valueOf, num);
                        }
                    }
                    if (zzsVar.zzv != 63 || (list2 = zzsVar.zzh) == null || (list3 = zzsVar.zzi) == null || (str2 = zzsVar.zzm) == null) {
                        StringBuilder sb = new StringBuilder();
                        if ((zzsVar.zzv & 1) == 0) {
                            sb.append(" openNow");
                        }
                        if (zzsVar.zzh == null) {
                            sb.append(" placeFields");
                        }
                        if (zzsVar.zzi == null) {
                            sb.append(" priceLevels");
                        }
                        if ((zzsVar.zzv & 2) == 0) {
                            sb.append(" strictTypeFiltering");
                        }
                        if (zzsVar.zzm == null) {
                            sb.append(" textQuery");
                        }
                        if ((4 & zzsVar.zzv) == 0) {
                            sb.append(" routingSummariesIncluded");
                        }
                        if ((zzsVar.zzv & 8) == 0) {
                            sb.append(" pureServiceAreaBusinessesIncluded");
                        }
                        if ((zzsVar.zzv & 16) == 0) {
                            sb.append(" searchUriIncluded");
                        }
                        if ((zzsVar.zzv & PnmConstants.PNM_SEPARATOR) == 0) {
                            sb.append(" requestPageIndex");
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
                        return null;
                    }
                    zzt zztVar = new zzt(zzsVar.zza, list2, list3, str2, zzsVar.zzu);
                    e0 e0Var = (e0) placesClient;
                    e0Var.getClass();
                    try {
                        zzgb zzgbVar = new zzgb();
                        Task zza = ((SubtreeManager) e0Var.h).zza(zztVar);
                        zbc zbcVar = new zbc(e0Var, zztVar, zzgbVar, i3);
                        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
                        Task continueWithTask = ((zzw) ((zzw) zza).continueWith(androidMainExecutor, zbcVar)).continueWithTask(androidMainExecutor, zzgc.zza$6);
                        zzpVar.zzb = 1;
                        obj = Okio.awaitImpl(continueWithTask, oneShotDisposable, zzpVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Error | RuntimeException e) {
                        zznv.zzb(e);
                        throw e;
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
        zzpVar = new zzp(continuation);
        Object obj2 = zzpVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzpVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitSearchNearby(PlacesClient placesClient, LocationRestriction locationRestriction, List<? extends Place.Field> list, Function1<? super b.a, Unit> function1, Continuation<Object> continuation) {
        zzq zzqVar;
        int i;
        if (continuation instanceof zzq) {
            zzqVar = (zzq) continuation;
            int i2 = zzqVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zzqVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zzqVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zzqVar.zzb;
                if (i == 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj.getClass();
                    return obj;
                }
                SafeTrace.throwOnFailure(obj);
                new zzw();
                b.a aVar = new b.a();
                if (locationRestriction == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null locationRestriction");
                    return null;
                }
                if (list == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null placeFields");
                    return null;
                }
                aVar.a = list;
                function1.invoke(aVar);
                if (aVar.a != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Property \"locationRestriction\" has not been set");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Property \"placeFields\" has not been set");
                return null;
            }
        }
        zzqVar = new zzq(continuation);
        Object obj2 = zzqVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zzqVar.zzb;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitIsOpen(PlacesClient placesClient, String str, Long l, Continuation<? super zzr> continuation) {
        zzn zznVar;
        int i;
        com.google.android.libraries.places.api.net.zzp zzpVar;
        if (continuation instanceof zzn) {
            zznVar = (zzn) continuation;
            int i2 = zznVar.zzb;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                zznVar.zzb = i2 - PKIFailureInfo.systemUnavail;
                Object obj = zznVar.zza;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zznVar.zzb;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
                    str.getClass();
                    if (l == null) {
                        zzpVar = new com.google.android.libraries.places.api.net.zzp();
                        zzpVar.zzb = str;
                        zzpVar.zzc = System.currentTimeMillis();
                        zzpVar.zze = (byte) 1;
                    } else {
                        long longValue = l.longValue();
                        zzpVar = new com.google.android.libraries.places.api.net.zzp();
                        zzpVar.zzb = str;
                        zzpVar.zzc = longValue;
                        zzpVar.zze = (byte) 1;
                    }
                    zzpVar.zzd = (zzb) oneShotDisposable.job;
                    Task zzg = ((e0) placesClient).zzg(zzpVar.build());
                    zzg.getClass();
                    zznVar.zzb = 1;
                    obj = Okio.awaitImpl(zzg, oneShotDisposable, zznVar);
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
        zznVar = new zzn(continuation);
        Object obj2 = zznVar.zza;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zznVar.zzb;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
