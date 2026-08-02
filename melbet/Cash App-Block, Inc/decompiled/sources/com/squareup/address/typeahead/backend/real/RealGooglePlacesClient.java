package com.squareup.address.typeahead.backend.real;

import android.content.Context;
import androidx.credentials.CredentialManager$createCredential$2$callback$1;
import com.fillr.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.internal.zzns;
import com.google.android.libraries.places.internal.zznv;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import kotlinx.coroutines.rx3.RxAwaitKt$await$5$1;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class RealGooglePlacesClient {
    public final String apiKey;
    public final Context context;
    public final RealGooglePayer$$ExternalSyntheticLambda0 newApiEnabled;
    public e0 placesClient;

    public RealGooglePlacesClient(Context context, String str, RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0) {
        this.context = context;
        this.apiKey = str;
        this.newApiEnabled = realGooglePayer$$ExternalSyntheticLambda0;
    }

    public final Object fetchPlace(zze zzeVar, RealLocationSearchClient$getDetails$1 realLocationSearchClient$getDetails$1) {
        if (this.placesClient == null || !Places.isInitialized()) {
            throw new Exception("Cannot fetch Place as not initialized.");
        }
        int i = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(realLocationSearchClient$getDetails$1));
        cancellableContinuationImpl.initCancellability();
        e0 e0Var = this.placesClient;
        if (e0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placesClient");
            throw null;
        }
        Task zzd = e0Var.zzd(zzeVar, zzns.zza);
        zzw zzwVar = (zzw) zzd;
        zzwVar.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new zzr(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, i), 13));
        zzwVar.addOnFailureListener(new CredentialManager$createCredential$2$callback$1(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public final Object findAutocompletePredictions(zzk zzkVar, RealLocationSearchClient$search$1 realLocationSearchClient$search$1) {
        if (this.placesClient == null || !Places.isInitialized()) {
            throw new Exception("Cannot find autocomplete predictions as not initialized.");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(realLocationSearchClient$search$1));
        cancellableContinuationImpl.initCancellability();
        e0 e0Var = this.placesClient;
        if (e0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placesClient");
            throw null;
        }
        Task zza = e0Var.zza(zzkVar, zzns.zza);
        int i = 2;
        zzw zzwVar = (zzw) zza;
        zzwVar.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new zzr(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, i), 13));
        zzwVar.addOnFailureListener(new RxAwaitKt$await$5$1(cancellableContinuationImpl, i));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|2|3|4|(8:6|7|9|10|11|(1:13)|14|(1:16)(2:18|19))(8:28|29|9|10|11|(0)|14|(0)(0))|34|35|(1:37)|9|10|11|(0)|14|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        timber.log.Timber.Forest.e("Could not create Places Client.", new java.lang.Object[0], r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if ((r1.getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CancelledContinuation) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r7 = kotlin.Result.Companion;
        r1.resumeWith(new kotlin.Result.Failure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(RealLocationSearchClient$initialize$1 realLocationSearchClient$initialize$1) {
        boolean booleanValue;
        String str;
        Context context = this.context;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(realLocationSearchClient$initialize$1));
        cancellableContinuationImpl.initCancellability();
        try {
            booleanValue = ((Boolean) this.newApiEnabled.invoke()).booleanValue();
            str = this.apiKey;
        } catch (IllegalAccessException e) {
            Timber.Forest.e("Could not initialize Places Client.", new Object[0], e);
            if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
            }
        }
        if (booleanValue) {
            try {
                Places.zza(context, str, true);
                this.placesClient = Places.createClient(context);
                if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                }
                Object result = cancellableContinuationImpl.getResult();
                return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
            } catch (Error | RuntimeException e2) {
                zznv.zzb(e2);
                throw e2;
            }
        }
        try {
            Places.zza(context, str, false);
            this.placesClient = Places.createClient(context);
            if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
            }
            Object result2 = cancellableContinuationImpl.getResult();
            if (result2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
        } catch (Error | RuntimeException e3) {
            zznv.zzb(e3);
            throw e3;
        }
        Timber.Forest.e("Could not initialize Places Client.", new Object[0], e);
        if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(e));
        }
        this.placesClient = Places.createClient(context);
        if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
        }
        Object result22 = cancellableContinuationImpl.getResult();
        if (result22 == CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }
}
