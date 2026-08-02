package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.fragment.app.FragmentActivity;
import app.cash.trifle.Trifle;
import coil3.Extras;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zaab;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.squareup.wire.GrpcMethod;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class GoogleApi {
    public final GoogleApiManager zaa;
    public final Context zab;
    public final String zac;
    public final Extras.Key zad;
    public final Api zae;
    public final Api.ApiOptions zaf;
    public final ApiKey zag;
    public final Looper zah;
    public final int zai;
    public final zabq zaj;
    public final Trifle zak;

    public final class Settings {
        public static final Settings DEFAULT_SETTINGS = new Settings(new Trifle(10), Looper.getMainLooper());
        public final Trifle zaa;
        public final Looper zab;

        public Settings(Trifle trifle, Looper looper) {
            this.zaa = trifle;
            this.zab = looper;
        }
    }

    public GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        zzae.checkNotNull(context, "Null context is not permitted.");
        zzae.checkNotNull(api, "Api must not be null.");
        zzae.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        zzae.checkNotNull(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.zac = attributionTag;
        this.zad = i >= 31 ? new Extras.Key(context.getAttributionSource()) : null;
        this.zae = api;
        this.zaf = apiOptions;
        this.zah = settings.zab;
        ApiKey apiKey = new ApiKey(api, apiOptions, attributionTag);
        this.zag = apiKey;
        this.zaj = new zabq(this);
        GoogleApiManager zaa = GoogleApiManager.zaa(applicationContext);
        this.zaa = zaa;
        this.zai = zaa.zam.getAndIncrement();
        this.zak = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            LifecycleFragment zza = activity instanceof FragmentActivity ? zzd.zza((FragmentActivity) activity) : com.google.android.gms.common.api.internal.zza.zza(activity);
            zaab zaabVar = (zaab) zza.getCallbackOrNull(zaab.class, "ConnectionlessLifecycleHelper");
            zaabVar = zaabVar == null ? new zaab(zza, zaa, GoogleApiAvailability.getInstance()) : zaabVar;
            zaabVar.zad.add(apiKey);
            zaa.zae(zaabVar);
        }
        zao zaoVar = zaa.zas;
        zaoVar.sendMessage(zaoVar.obtainMessage(7, this));
    }

    public final GrpcMethod createClientSettingsBuilder() {
        GrpcMethod grpcMethod = new GrpcMethod();
        Set set = Collections.EMPTY_SET;
        if (((ArraySet) grpcMethod.requestAdapter) == null) {
            grpcMethod.requestAdapter = new ArraySet(0);
        }
        ((ArraySet) grpcMethod.requestAdapter).addAll(set);
        Context context = this.zab;
        grpcMethod.responseAdapter = context.getClass().getName();
        grpcMethod.path = context.getPackageName();
        return grpcMethod;
    }

    public final zzw zae(int i, zacn zacnVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.getClass();
        googleApiManager.zaI(taskCompletionSource, zacnVar.zac, this);
        zacc zaccVar = new zacc(new zag(i, zacnVar, taskCompletionSource, this.zak), googleApiManager.zan.get(), this);
        zao zaoVar = googleApiManager.zas;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
        return taskCompletionSource.zza;
    }
}
