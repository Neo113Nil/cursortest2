package com.squareup.cash.gps.backend.real;

import android.app.Activity;
import android.os.WorkSource;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.m1;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzda;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.kotterknife.Lazy;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class AndroidLocationSettingsChecker {
    public final Activity activity;
    public final zzda settingsClient;
    public final LocationSettingsRequest settingsRequest;

    public AndroidLocationSettingsChecker(Activity activity) {
        this.activity = activity;
        zzae.checkArgument("intervalMillis must be greater than or equal to 0", 3600000 >= 0);
        zzo.zza(100);
        LocationRequest locationRequest = new LocationRequest(100, 3600000L, -1 == -1 ? 3600000L : Math.min(-1L, 3600000L), Math.max(0L, 3600000L), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.DECELERATION_RATE, true, -1 == -1 ? 3600000L : -1L, 0, 0, false, new WorkSource(null), null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequest);
        this.settingsRequest = new LocationSettingsRequest(arrayList, false, false);
        int i = LocationServices.$r8$clinit;
        this.settingsClient = new zzda(activity, activity, zzbi.zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Object check(ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        zzda zzdaVar = this.settingsClient;
        zzdaVar.getClass();
        zacn builder = zacn.builder();
        int i = 22;
        builder.zaa = new m1(this.settingsRequest, i);
        builder.zac = 2426;
        zzw zae = zzdaVar.zae(0, builder.build());
        JCAContext jCAContext = new JCAContext(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, 0), i);
        zae.getClass();
        zae.addOnSuccessListener(TaskExecutors.MAIN_THREAD, jCAContext);
        zae.addOnFailureListener(new Lazy(3, this, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
