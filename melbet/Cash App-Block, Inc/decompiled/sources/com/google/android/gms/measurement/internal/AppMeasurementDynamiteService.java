package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzcw;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzco {
    public zzic zza;
    public final ArrayMap zzb;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.zza = null;
        this.zzb = new ArrayMap(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void beginAdUnitExposure(String str, long j) {
        zzb$3();
        zzd zzdVar = this.zza.zzq;
        zzic.zzM(zzdVar);
        zzdVar.zza(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzaa(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void clearMeasurementEnabled(long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzb$1();
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        Object obj = null;
        zzhzVar.zzj(new Client.AnonymousClass4(zzljVar, obj, false, 26));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void endAdUnitExposure(String str, long j) {
        zzb$3();
        zzd zzdVar = this.zza.zzq;
        zzic.zzM(zzdVar);
        zzdVar.zzb(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void generateEventId(zzcs zzcsVar) {
        zzb$3();
        zzpp zzppVar = this.zza.zzl;
        zzic.zzN(zzppVar);
        long zzd = zzppVar.zzd();
        zzb$3();
        zzpp zzppVar2 = this.zza.zzl;
        zzic.zzN(zzppVar2);
        zzppVar2.zzap(zzcsVar, zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getAppInstanceId(zzcs zzcsVar) {
        zzb$3();
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzi(this, zzcsVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCachedAppInstanceId(zzcs zzcsVar) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzc((String) zzljVar.zzg.get(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) {
        zzb$3();
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new ProfileAdapter.AnonymousClass8(13, this, zzcsVar, str2, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenClass(zzcs zzcsVar) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzmb zzmbVar = ((zzic) zzljVar.$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        zzlu zzluVar = zzmbVar.zzb;
        zzc(zzluVar != null ? zzluVar.zzb : null, zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getCurrentScreenName(zzcs zzcsVar) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzmb zzmbVar = ((zzic) zzljVar.$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        zzlu zzluVar = zzmbVar.zzb;
        zzc(zzluVar != null ? zzluVar.zza : null, zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getGmpAppId(zzcs zzcsVar) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzc(zzljVar.zzae(), zzcsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getMaxUserProperties(String str, zzcs zzcsVar) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzae.checkNotEmpty(str);
        ((zzic) zzljVar.$$delegate_0).getClass();
        zzb$3();
        zzpp zzppVar = this.zza.zzl;
        zzic.zzN(zzppVar);
        zzppVar.zzaq(zzcsVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getSessionId(zzcs zzcsVar) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new Client.AnonymousClass4(zzljVar, zzcsVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getTestFlag(zzcs zzcsVar, int i) {
        zzb$3();
        if (i == 0) {
            zzpp zzppVar = this.zza.zzl;
            zzic.zzN(zzppVar);
            zzlj zzljVar = this.zza.zzp;
            zzic.zzO(zzljVar);
            AtomicReference atomicReference = new AtomicReference();
            zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
            zzic.zzP(zzhzVar);
            zzppVar.zzao((String) zzhzVar.zzk(atomicReference, 15000L, "String test flag value", new zzke(zzljVar, atomicReference, 1)), zzcsVar);
            return;
        }
        if (i == 1) {
            zzpp zzppVar2 = this.zza.zzl;
            zzic.zzN(zzppVar2);
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            zzhz zzhzVar2 = ((zzic) zzljVar2.$$delegate_0).zzj;
            zzic.zzP(zzhzVar2);
            zzppVar2.zzap(zzcsVar, ((Long) zzhzVar2.zzk(atomicReference2, 15000L, "long test flag value", new zzke(zzljVar2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            zzpp zzppVar3 = this.zza.zzl;
            zzic.zzN(zzppVar3);
            zzlj zzljVar3 = this.zza.zzp;
            zzic.zzO(zzljVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            zzhz zzhzVar3 = ((zzic) zzljVar3.$$delegate_0).zzj;
            zzic.zzP(zzhzVar3);
            double doubleValue = ((Double) zzhzVar3.zzk(atomicReference3, 15000L, "double test flag value", new zzke(zzljVar3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcsVar.zzb(bundle);
                return;
            } catch (RemoteException e) {
                zzgu zzguVar = ((zzic) zzppVar3.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            zzpp zzppVar4 = this.zza.zzl;
            zzic.zzN(zzppVar4);
            zzlj zzljVar4 = this.zza.zzp;
            zzic.zzO(zzljVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            zzhz zzhzVar4 = ((zzic) zzljVar4.$$delegate_0).zzj;
            zzic.zzP(zzhzVar4);
            zzppVar4.zzaq(zzcsVar, ((Integer) zzhzVar4.zzk(atomicReference4, 15000L, "int test flag value", new zzke(zzljVar4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        zzpp zzppVar5 = this.zza.zzl;
        zzic.zzN(zzppVar5);
        zzlj zzljVar5 = this.zza.zzp;
        zzic.zzO(zzljVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        zzhz zzhzVar5 = ((zzic) zzljVar5.$$delegate_0).zzj;
        zzic.zzP(zzhzVar5);
        zzppVar5.zzas(zzcsVar, ((Boolean) zzhzVar5.zzk(atomicReference5, 15000L, "boolean test flag value", new zzke(zzljVar5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void getUserProperties(String str, String str2, boolean z, zzcs zzcsVar) {
        zzb$3();
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzk(this, zzcsVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initForTests(Map map) {
        zzb$3();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j) {
        zzic zzicVar = this.zza;
        if (zzicVar == null) {
            Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            zzae.checkNotNull(context);
            this.zza = zzic.zzy(context, zzdbVar, Long.valueOf(j), null);
        } else {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j, long j2) {
        zzic zzicVar = this.zza;
        if (zzicVar == null) {
            Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            zzae.checkNotNull(context);
            this.zza = zzic.zzy(context, zzdbVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void isDataCollectionEnabled(zzcs zzcsVar) {
        zzb$3();
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzi(this, zzcsVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzB(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcs zzcsVar, long j) {
        zzb$3();
        zzae.checkNotEmpty(str2);
        String str3 = true != this.zza.zzg.zzp(null, zzfy.zzbf) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        zzbh zzbhVar = new zzbh(str2, new zzbf(bundle), str3, j, 0L);
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new ProfileAdapter.AnonymousClass8(this, zzcsVar, zzbhVar, str, 10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzB(str, str2, bundle, z, z2, j, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        zzb$3();
        Object unwrap2 = iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper);
        Object unwrap3 = iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2);
        Object unwrap4 = iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null;
        zzgu zzguVar = this.zza.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzm(i, true, false, str, unwrap2, unwrap3, unwrap4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivityCreatedByScionActivityInfo(zzdd.zza(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzky zzkyVar = zzljVar.zza;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
            zzkyVar.zza(zzddVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivityDestroyedByScionActivityInfo(zzdd.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzky zzkyVar = zzljVar.zza;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
            zzkyVar.zzb(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivityPausedByScionActivityInfo(zzdd.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzky zzkyVar = zzljVar.zza;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
            zzkyVar.zzc(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivityResumedByScionActivityInfo(zzdd.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzky zzkyVar = zzljVar.zza;
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
            zzkyVar.zzd(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcs zzcsVar, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdd.zza(activity), zzcsVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzky zzkyVar = zzljVar.zza;
        Bundle bundle = new Bundle();
        if (zzkyVar != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
            zzkyVar.zze(zzddVar, bundle);
        }
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = this.zza.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivityStartedByScionActivityInfo(zzdd.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        if (zzljVar.zza != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        onActivityStoppedByScionActivityInfo(zzdd.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        if (zzljVar.zza != null) {
            zzlj zzljVar2 = this.zza.zzp;
            zzic.zzO(zzljVar2);
            zzljVar2.zzh();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void performAction(Bundle bundle, zzcs zzcsVar, long j) {
        zzb$3();
        zzcsVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void registerOnMeasurementEventListener(zzcy zzcyVar) {
        zzq zzqVar;
        zzb$3();
        ArrayMap arrayMap = this.zzb;
        synchronized (arrayMap) {
            try {
                zzcw zzcwVar = (zzcw) zzcyVar;
                zzqVar = (zzq) arrayMap.get(Integer.valueOf(zzcwVar.zzf()));
                if (zzqVar == null) {
                    zzqVar = new zzq(this, zzcwVar);
                    arrayMap.put(Integer.valueOf(zzcwVar.zzf()), zzqVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzb$1();
        if (zzljVar.zze.add(zzqVar)) {
            return;
        }
        zzgu zzguVar = ((zzic) zzljVar.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzg.zza("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    @Deprecated
    public void resetAnalyticsData(long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzg.set(null);
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzka(zzljVar, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzg.set(null);
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzka(zzljVar, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void retrieveAndUploadBatches(zzcv zzcvVar) {
        zzlr zzlrVar;
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        boolean z = false;
        int i = 6;
        com.google.android.gms.tasks.zzc zzcVar = new com.google.android.gms.tasks.zzc(this, zzcvVar, false, 6);
        zzljVar.zzb$1();
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        if (zzhzVar.zze()) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        zzhz zzhzVar2 = zzicVar.zzj;
        zzic.zzP(zzhzVar2);
        if (Thread.currentThread() == zzhzVar2.zzb) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zza = Trifle.zza();
        zzgu zzguVar3 = zzicVar.zzi;
        if (zza) {
            zzic.zzP(zzguVar3);
            zzguVar3.zzd.zza("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzic.zzP(zzguVar3);
        zzguVar3.zzl.zza("[sgtm] Started client-side batch upload work.");
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (!z2) {
            zzgu zzguVar4 = zzicVar.zzi;
            zzic.zzP(zzguVar4);
            zzguVar4.zzl.zza("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzhz zzhzVar3 = zzicVar.zzj;
            zzic.zzP(zzhzVar3);
            zzhzVar3.zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new zzke(zzljVar, atomicReference, i, z));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (list.isEmpty()) {
                break;
            }
            zzgu zzguVar5 = zzicVar.zzi;
            zzic.zzP(zzguVar5);
            zzguVar5.zzl.zzb(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i2 += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    z = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.zzc).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    zzgi zzv = ((zzic) zzljVar.$$delegate_0).zzv();
                    zzv.zzb$1();
                    zzae.checkNotNull(zzv.zze);
                    String str = zzv.zze;
                    zzic zzicVar2 = (zzic) zzljVar.$$delegate_0;
                    zzgu zzguVar6 = zzicVar2.zzi;
                    zzic.zzP(zzguVar6);
                    zzgs zzgsVar = zzguVar6.zzl;
                    Long valueOf = Long.valueOf(zzomVar.zza);
                    zzgsVar.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
                    if (!TextUtils.isEmpty(zzomVar.zzg)) {
                        zzgu zzguVar7 = zzicVar2.zzi;
                        zzic.zzP(zzguVar7);
                        zzguVar7.zzl.zzc("[sgtm] Uploading data from app. row_id", valueOf, zzomVar.zzg);
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = zzomVar.zzd;
                    for (String str2 : bundle.keySet()) {
                        String string2 = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string2)) {
                            hashMap.put(str2, string2);
                        }
                    }
                    zzlo zzloVar = zzicVar2.zzr;
                    zzic.zzP(zzloVar);
                    byte[] bArr = zzomVar.zzb;
                    com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(14, zzljVar, atomicReference2, zzomVar);
                    zzloVar.zzw();
                    zzae.checkNotNull(url);
                    zzae.checkNotNull(bArr);
                    zzhz zzhzVar4 = ((zzic) zzloVar.$$delegate_0).zzj;
                    zzic.zzP(zzhzVar4);
                    zzhzVar4.zzm(new zzgy(zzloVar, str, url, bArr, hashMap, zzahVar));
                    try {
                        zzpp zzppVar = zzicVar2.zzl;
                        zzic.zzN(zzppVar);
                        zzic zzicVar3 = (zzic) zzppVar.$$delegate_0;
                        zzicVar3.zzn.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    zzicVar3.zzn.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        zzgu zzguVar8 = ((zzic) zzljVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar8);
                        zzguVar8.zzg.zza("[sgtm] Interrupted waiting for uploading batch");
                    }
                    zzlrVar = atomicReference2.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    zzgu zzguVar9 = ((zzic) zzljVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar9);
                    zzguVar9.zzd.zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e);
                    zzlrVar = zzlr.FAILURE;
                }
                if (zzlrVar != zzlr.SUCCESS) {
                    if (zzlrVar == zzlr.BACKOFF) {
                        z2 = true;
                        z = false;
                        i = 6;
                        break;
                    }
                } else {
                    i3++;
                }
                i = 6;
            }
        }
        zzgu zzguVar10 = zzicVar.zzi;
        zzic.zzP(zzguVar10);
        zzguVar10.zzl.zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i2), Integer.valueOf(i3));
        zzcVar.run();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zzb$3();
        zzic zzicVar = this.zza;
        if (bundle == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Conditional user property must not be null");
        } else {
            zzlj zzljVar = zzicVar.zzp;
            zzic.zzO(zzljVar);
            zzljVar.zzZ(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsent(Bundle bundle, long j) {
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setConsentThirdParty(Bundle bundle, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzp(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        zzb$3();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        zzae.checkNotNull(activity);
        setCurrentScreenByScionActivityInfo(zzdd.zza(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        zzb$3();
        zzmb zzmbVar = this.zza.zzo;
        zzic.zzO(zzmbVar);
        zzic zzicVar = (zzic) zzmbVar.$$delegate_0;
        if (!zzicVar.zzg.zzv()) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzi.zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlu zzluVar = zzmbVar.zzb;
        if (zzluVar == null) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzi.zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = zzmbVar.zzd;
        Integer valueOf = Integer.valueOf(zzddVar.zza);
        if (concurrentHashMap.get(valueOf) == null) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzi.zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzmbVar.zzi(zzddVar.zzb);
        }
        String str3 = zzluVar.zzb;
        String str4 = zzluVar.zza;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            zzgu zzguVar4 = zzicVar.zzi;
            zzic.zzP(zzguVar4);
            zzguVar4.zzi.zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                zzicVar.zzg.getClass();
            }
            zzgu zzguVar5 = zzicVar.zzi;
            zzic.zzP(zzguVar5);
            zzguVar5.zzi.zzb(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            zzicVar.zzg.getClass();
            if (length2 <= 500) {
                zzgu zzguVar6 = zzicVar.zzi;
                zzic.zzP(zzguVar6);
                zzguVar6.zzl.zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzpp zzppVar = zzicVar.zzl;
                zzic.zzN(zzppVar);
                zzlu zzluVar2 = new zzlu(str, str2, zzppVar.zzd());
                concurrentHashMap.put(valueOf, zzluVar2);
                zzmbVar.zzx(zzddVar.zzb, zzluVar2, true);
                return;
            }
        }
        zzgu zzguVar7 = zzicVar.zzi;
        zzic.zzP(zzguVar7);
        zzguVar7.zzi.zzb(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDataCollectionEnabled(boolean z) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzb$1();
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzjy(zzljVar, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setDefaultEventParameters(Bundle bundle) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzki(zzljVar, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setEventInterceptor(zzcy zzcyVar) {
        zzb$3();
        zbc zbcVar = new zbc(16, this, zzcyVar);
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        boolean zze = zzhzVar.zze();
        zzic zzicVar = this.zza;
        if (!zze) {
            zzhz zzhzVar2 = zzicVar.zzj;
            zzic.zzP(zzhzVar2);
            zzhzVar2.zzj(new Client.AnonymousClass4(this, zbcVar, r2, 28));
            return;
        }
        zzlj zzljVar = zzicVar.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzg();
        zzljVar.zzb$1();
        zbc zbcVar2 = zzljVar.zzd;
        if (zbcVar != zbcVar2) {
            zzae.checkState("EventInterceptor already set.", zbcVar2 == null);
        }
        zzljVar.zzd = zbcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setInstanceIdProvider(zzda zzdaVar) {
        zzb$3();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMeasurementEnabled(boolean z, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        Boolean valueOf = Boolean.valueOf(z);
        zzljVar.zzb$1();
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new Client.AnonymousClass4(zzljVar, valueOf, false, 26));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setMinimumSessionDuration(long j) {
        zzb$3();
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSessionTimeoutDuration(long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzhz zzhzVar = ((zzic) zzljVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzka(zzljVar, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setSgtmDebugInfo(Intent intent) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        Uri data = intent.getData();
        if (data == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzj.zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzj.zza("[sgtm] Preview Mode was not enabled.");
            zzicVar.zzg.zzb = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        zzgu zzguVar3 = zzicVar.zzi;
        zzic.zzP(zzguVar3);
        zzguVar3.zzj.zzb(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        zzicVar.zzg.zzb = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserId(String str, long j) {
        zzb$3();
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        if (str != null && TextUtils.isEmpty(str)) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zza("User ID must be non-empty or null");
        } else {
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new Client.AnonymousClass4(29, zzljVar, str));
            zzljVar.zzK(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        zzb$3();
        Object unwrap2 = ObjectWrapper.unwrap(iObjectWrapper);
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzK(str, str2, unwrap2, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public void unregisterOnMeasurementEventListener(zzcy zzcyVar) {
        zzcw zzcwVar;
        zzq zzqVar;
        zzb$3();
        ArrayMap arrayMap = this.zzb;
        synchronized (arrayMap) {
            zzcwVar = (zzcw) zzcyVar;
            zzqVar = (zzq) arrayMap.remove(Integer.valueOf(zzcwVar.zzf()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, zzcwVar);
        }
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzb$1();
        if (zzljVar.zze.remove(zzqVar)) {
            return;
        }
        zzgu zzguVar = ((zzic) zzljVar.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzg.zza("OnEventListener had not been registered");
    }

    public final void zzb$3() {
        if (this.zza != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Attempting to perform action before initialize.");
    }

    public final void zzc(String str, zzcs zzcsVar) {
        zzb$3();
        zzpp zzppVar = this.zza.zzl;
        zzic.zzN(zzppVar);
        zzppVar.zzao(str, zzcsVar);
    }
}
