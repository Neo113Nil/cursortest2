package com.squareup.cash.gps.backend.real;

import android.app.Application;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.dynamite.zzo;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.vision.common.zzb;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.KotlinExtensions$awaitResponse$2$2;

/* loaded from: classes.dex */
public final class AndroidLocationProvider {
    public final zzbi locationClient;

    public AndroidLocationProvider(Application application) {
        int i = LocationServices.$r8$clinit;
        this.locationClient = new zzbi(application, null, zzbi.zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Object currentLocation(ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        zzbi zzbiVar = this.locationClient;
        zzbiVar.getClass();
        zzo zzoVar = new zzo(5, false);
        zzoVar.setPriority();
        CurrentLocationRequest build = zzoVar.build();
        zacn builder = zacn.builder();
        builder.zaa = new zbc((Object) build, (Object) null, false, 10);
        builder.zac = 2415;
        zzw zae = zzbiVar.zae(0, builder.build());
        zzb zzbVar = new zzb(new AndroidLocationProvider$currentLocation$2$1(cancellableContinuationImpl));
        zae.getClass();
        zae.addOnSuccessListener(TaskExecutors.MAIN_THREAD, zzbVar);
        zae.addOnFailureListener(new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl, 2));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
