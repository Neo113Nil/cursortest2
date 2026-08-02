package com.google.android.libraries.places.internal;

import android.content.Context;
import com.caverock.androidsvg.SVG;
import com.fillr.e0;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.TransportImpl;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.location.LocationServices;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzmx {
    public final Object zzb;
    public final Object zzc;
    public final Object zzd;
    public final Object zzg;
    public final Object zzh;
    public final Object zzi;
    public final Object zzj;
    public final Object zzk;
    public final Object zzl;
    public final Object zzm;
    public final Object zzn;
    public final Object zzp;
    public final Object zzq;
    public final Object zzt;
    public final Object zzu;
    public final Object zzw;
    public final Object zzy;
    public final Object zzz;

    public zzmx(Context context, zznq zznqVar) {
        this.zzy = context;
        this.zzz = zznqVar;
        zzfz zza = zzfz.zza(context);
        zzbog zza2 = zzbog.zza(new zznm(zza, 1));
        this.zzb = zza2;
        zzez zzezVar = zzey.zza;
        zzboo zzbooVar = new zzboo();
        zzbooVar.zzc = zzboo.zza;
        zzbooVar.zzb = zzezVar;
        this.zzc = zzbooVar;
        this.zzd = zzbog.zza(zzie.zza$1);
        zzbog zza3 = zzbog.zza(zzwr.zza);
        zzbog zza4 = zzbog.zza(new zzfy(zza3, 2));
        this.zzg = zzbog.zza(new zzki(zza3, zza4, 1));
        this.zzh = zzbog.zza(new zzki(zza3, zza4, 0));
        this.zzi = zzbog.zza(zzie.f70zza);
        this.zzj = zzbog.zza(zzib.zza);
        this.zzk = zzbog.zza(new zzfy(zza3, 1));
        this.zzl = zzbog.zza(zzjn.f72zza);
        this.zzm = zzbog.zza(zzkf.zza);
        this.zzn = zzbog.zza(zzey.zza$1);
        zznm zznmVar = new zznm(zza, 0);
        zzbog zza5 = zzbog.zza(zzib.zza$1);
        this.zzp = zza5;
        this.zzq = zzbog.zza(new zzki(zznmVar, zza5));
        zzfy zzfyVar = new zzfy(zza2, 0);
        int i = zzbon.$r8$clinit;
        ArrayList arrayList = new ArrayList(1);
        List list = Collections.EMPTY_LIST;
        arrayList.add(zzfyVar);
        this.zzt = new zzfx(new zzbon(arrayList, list));
        this.zzu = zzbog.zza(zzwr.zza$1);
        this.zzw = zzbog.zza(new zzfz(zzmy.zza, 0));
    }

    public zbc zza() {
        TransportImpl transportImpl;
        zzbog zzbogVar = (zzbog) this.zzb;
        TransportRuntime.initialize(((Context) this.zzy).getApplicationContext());
        TransportRuntime transportRuntime = TransportRuntime.getInstance();
        transportRuntime.getClass();
        Set singleton = Collections.singleton(new Encoding("proto"));
        SVG builder = AutoValue_TransportContext.builder();
        builder.rootElement = "cct";
        AutoValue_TransportContext build = builder.build();
        Encoding encoding2 = new Encoding("proto");
        if (singleton.contains(encoding2)) {
            transportImpl = new TransportImpl(build, "LE", encoding2, zzmg.zza, transportRuntime);
        } else {
            JWK$$ExternalSyntheticBUOutline0.m("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{encoding2, singleton});
            transportImpl = null;
        }
        boolean z = false;
        return new zbc(new zbc(transportImpl, (zzfp) zzbogVar.zzb(), z, 28), (zznq) this.zzz, z, 23);
    }

    public e0 zzc() {
        Context context = (Context) this.zzy;
        boolean z = false;
        zzje zzjeVar = new zzje(context, false);
        Context applicationContext = context.getApplicationContext();
        zzkf.zza(applicationContext);
        zbc zbcVar = new zbc(zzfi.zza(applicationContext), new zzlw(), z, 26);
        Context applicationContext2 = context.getApplicationContext();
        zzkf.zza(applicationContext2);
        zzfv zzfvVar = new zzfv(zzfi.zza(applicationContext2), 15);
        zzboo zzbooVar = (zzboo) this.zzc;
        zbc zza = zza();
        zzex zzexVar = (zzex) zzbooVar.zzb();
        new zzkt();
        new zzmk();
        new zzlb();
        new zzmk();
        JWECryptoParts jWECryptoParts = new JWECryptoParts(zzjeVar, zbcVar, zzfvVar, zza, zzexVar);
        Context applicationContext3 = context.getApplicationContext();
        zzkf.zza(applicationContext3);
        Context applicationContext4 = context.getApplicationContext();
        zzkf.zza(applicationContext4);
        int i = LocationServices.$r8$clinit;
        boolean z2 = false;
        com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(applicationContext3, new com.google.android.gms.internal.location.zzbi(applicationContext4, null, com.google.android.gms.internal.location.zzbi.zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS), new zzmv(0), z2, 25);
        Context applicationContext5 = context.getApplicationContext();
        zzkf.zza(applicationContext5);
        Box box = new Box(applicationContext5, (zzex) zzbooVar.zzb(), z, 27);
        zbc zza2 = zza();
        zzex zzexVar2 = (zzex) zzbooVar.zzb();
        zzbsd zzbsdVar = (zzbsd) ((zzbog) this.zzd).zzb();
        zbc zza3 = zza();
        zzex zzexVar3 = (zzex) zzbooVar.zzb();
        zzbog zzbogVar = (zzbog) this.zzp;
        zzbog zzbogVar2 = (zzbog) this.zzq;
        zzbog zzbogVar3 = (zzbog) this.zzn;
        zzbog zzbogVar4 = (zzbog) this.zzm;
        zzbog zzbogVar5 = (zzbog) this.zzl;
        zzbog zzbogVar6 = (zzbog) this.zzk;
        zzbog zzbogVar7 = (zzbog) this.zzj;
        zzbog zzbogVar8 = (zzbog) this.zzi;
        zzbog zzbogVar9 = (zzbog) this.zzh;
        Object zzb = ((zzbog) this.zzg).zzb();
        Object zzb2 = zzbogVar9.zzb();
        Object zzb3 = zzbogVar8.zzb();
        Object zzb4 = zzbogVar7.zzb();
        Object zzb5 = zzbogVar6.zzb();
        Object zzb6 = zzbogVar5.zzb();
        Object zzb7 = zzbogVar4.zzb();
        Object zzb8 = zzbogVar3.zzb();
        Context applicationContext6 = context.getApplicationContext();
        zzkf.zza(applicationContext6);
        zzje zzjeVar2 = new zzje(applicationContext6, false);
        Object zzb9 = zzbogVar2.zzb();
        Context applicationContext7 = context.getApplicationContext();
        zzkf.zza(applicationContext7);
        zzbsd zzbsdVar2 = (zzbsd) zzbogVar.zzb();
        Context applicationContext8 = context.getApplicationContext();
        zzkf.zza(applicationContext8);
        zzka zzkaVar = new zzka(applicationContext7, zzbsdVar2, new zzje(applicationContext8, false), (zzjt) zzbogVar2.zzb());
        zzayi zzayiVar = new zzayi(new zzfv((zzfx) this.zzt, 2), 0);
        zzkf.zza(context.getApplicationContext());
        new zzgc(24);
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.snapshotCache = new zzbgl(zzbsdVar, zzbov.zza.zzh(zzcko.zza, zzckm.zzb), 0);
        subtreeManager.contextForChildren = zzjeVar2;
        subtreeManager.emitActionToParent = zza3;
        subtreeManager.workflowSession = zzexVar3;
        subtreeManager.interceptor = (zzjm) zzb6;
        subtreeManager.idCounter = zzkaVar;
        subtreeManager.children = zzayiVar;
        return new e0(jWECryptoParts, zzahVar, box, zza2, zzexVar2, subtreeManager, new com.google.android.gms.maps.zzah((zzbsd) ((zzbog) this.zzw).zzb(), (zzfp) ((zzbog) this.zzb).zzb(), zzfi.zzc()));
    }

    public zzmx(DocumentCameraWorker_Factory documentCameraWorker_Factory, DocumentCameraWorker_Factory documentCameraWorker_Factory2, DocumentCameraWorker_Factory documentCameraWorker_Factory3, DocumentCameraWorker_Factory documentCameraWorker_Factory4, Provider provider, Provider provider2, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, DocumentCameraWorker_Factory documentCameraWorker_Factory5, LookupAccount_Factory lookupAccount_Factory, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory, SetupIntentFlowResultProcessor_Factory setupIntentFlowResultProcessor_Factory, Provider provider3, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory2, Provider provider4, DocumentCameraWorker_Factory documentCameraWorker_Factory6, Provider provider5, DocumentCameraWorker_Factory documentCameraWorker_Factory7, Provider provider6) {
        this.zzy = documentCameraWorker_Factory;
        this.zzz = documentCameraWorker_Factory2;
        this.zzb = documentCameraWorker_Factory3;
        this.zzd = documentCameraWorker_Factory4;
        this.zzg = provider;
        this.zzh = provider2;
        this.zzi = selfieDirectionFeed_Factory;
        this.zzj = documentCameraWorker_Factory5;
        this.zzk = lookupAccount_Factory;
        this.zzl = cameraModule_CameraStatsManagerFactory;
        this.zzm = setupIntentFlowResultProcessor_Factory;
        this.zzn = provider3;
        this.zzp = selfieDirectionFeed_Factory2;
        this.zzq = provider4;
        this.zzu = documentCameraWorker_Factory6;
        this.zzw = provider5;
        this.zzc = documentCameraWorker_Factory7;
        this.zzt = provider6;
    }
}
