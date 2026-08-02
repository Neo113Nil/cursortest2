package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.os.BundleKt;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzjx;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzld;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzma;
import com.squareup.util.Strings;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class zzic implements zzjg {
    public static volatile zzic zzc;
    public long zzA;
    public volatile Boolean zzB;
    public volatile boolean zzC;
    public int zzD;
    public int zzE;
    public final long zza;
    public final long zzb;
    public final Context zzd;
    public final boolean zze;
    public final Trifle zzf;
    public final zzal zzg;
    public final zzhh zzh;
    public final zzgu zzi;
    public final zzhz zzj;
    public final zzoc zzk;
    public final zzpp zzl;
    public final zzgn zzm;
    public final DefaultClock zzn;
    public final zzmb zzo;
    public final zzlj zzp;
    public final zzd zzq;
    public final zzlo zzr;
    public final String zzs;
    public zzgl zzt;
    public zznl zzu;
    public zzbb zzv;
    public zzgi zzw;
    public zzlq zzx;
    public Boolean zzz;
    public boolean zzy = false;
    public final AtomicInteger zzF = new AtomicInteger(0);

    public zzic(zzjs zzjsVar) {
        long currentTimeMillis;
        long elapsedRealtime;
        Context context;
        int i = 0;
        Context context2 = zzjsVar.zza;
        Trifle trifle = new Trifle(12);
        this.zzf = trifle;
        BundleKt.zza = trifle;
        this.zzd = context2;
        this.zze = zzjsVar.zze;
        this.zzB = zzjsVar.zzb;
        this.zzs = zzjsVar.zzh;
        boolean z = true;
        this.zzC = true;
        if (com.google.android.gms.internal.measurement.zzlw.zzc == null && context2 != null) {
            Object obj = com.google.android.gms.internal.measurement.zzlw.zzb;
            synchronized (obj) {
                try {
                    if (com.google.android.gms.internal.measurement.zzlw.zzc == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.zzlc zzlcVar = com.google.android.gms.internal.measurement.zzlw.zzc;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (zzlcVar != null) {
                                if (zzlcVar.zza != applicationContext) {
                                }
                            }
                            if (zzlcVar != null) {
                                zzld.zza();
                                zzma.zza();
                            }
                            com.google.android.gms.internal.measurement.zzlw.zzc = new com.google.android.gms.internal.measurement.zzlc(applicationContext, Strings.memoize(new com.google.android.gms.internal.measurement.zzll(applicationContext, 2)));
                            com.google.android.gms.internal.measurement.zzlw.zze.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.zzn = DefaultClock.zza;
        zzkk zzkkVar = new zzkk(context2, null, zzjx.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        String concat = "com.google.android.gms.measurement#".concat(String.valueOf(context2.getPackageName()));
        zacn builder = zacn.builder();
        builder.zaa = new WorkLauncherImpl(27, concat, new String[0]);
        zzkkVar.zae(0, builder.build());
        AtomicReference atomicReference = com.google.android.gms.internal.measurement.zzlk.zzc;
        if (atomicReference.get() == null) {
            try {
                context = context2.getApplicationContext();
            } catch (NullPointerException unused) {
                com.google.android.gms.internal.measurement.zzlk.zzl();
                zzlf.zzc(Level.WARNING, (Executor) com.google.android.gms.internal.measurement.zzlk.zzf.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                context = null;
            }
            if (context != null) {
                while (!atomicReference.compareAndSet(null, context) && atomicReference.get() == null) {
                }
            }
        }
        Long l = zzjsVar.zzf;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            this.zzn.getClass();
            currentTimeMillis = System.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        Long l2 = zzjsVar.zzg;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        } else {
            this.zzn.getClass();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzb = elapsedRealtime;
        zzal zzalVar = new zzal(this);
        zzalVar.zzc = com.google.android.gms.dynamite.zzf.zza;
        this.zzg = zzalVar;
        zzhh zzhhVar = new zzhh(this);
        zzhhVar.zzx();
        this.zzh = zzhhVar;
        zzgu zzguVar = new zzgu(this);
        zzguVar.zzx();
        this.zzi = zzguVar;
        zzpp zzppVar = new zzpp(this);
        zzppVar.zzx();
        this.zzl = zzppVar;
        this.zzm = new zzgn(new zzx(zzjsVar, this));
        this.zzq = new zzd(this);
        zzmb zzmbVar = new zzmb(this);
        zzmbVar.zzc();
        this.zzo = zzmbVar;
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzc();
        this.zzp = zzljVar;
        zzoc zzocVar = new zzoc(this);
        zzocVar.zzc();
        this.zzk = zzocVar;
        zzlo zzloVar = new zzlo(this);
        zzloVar.zzx();
        this.zzr = zzloVar;
        zzhz zzhzVar = new zzhz(this);
        zzhzVar.zzx();
        this.zzj = zzhzVar;
        zzdb zzdbVar = zzjsVar.zzd;
        if (zzdbVar != null && zzdbVar.zzb != 0) {
            z = false;
        }
        if (this.zzd.getApplicationContext() instanceof Application) {
            zzO(zzljVar);
            if (((zzic) zzljVar.$$delegate_0).zzd.getApplicationContext() instanceof Application) {
                Application application = (Application) ((zzic) zzljVar.$$delegate_0).zzd.getApplicationContext();
                if (zzljVar.zza == null) {
                    zzljVar.zza = new zzky(zzljVar, i);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzljVar.zza);
                    application.registerActivityLifecycleCallbacks(zzljVar.zza);
                    zzgu zzguVar2 = ((zzic) zzljVar.$$delegate_0).zzi;
                    zzP(zzguVar2);
                    zzguVar2.zzl.zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzP(zzguVar);
            zzguVar.zzg.zza("Application context is not an Application");
        }
        zzhzVar.zzj(new com.google.android.gms.tasks.zzi(5, this, zzjsVar));
    }

    public static final void zzM(zzf zzfVar) {
        if (zzfVar != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Component not created");
    }

    public static final void zzN(InteractionResult interactionResult) {
        if (interactionResult != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Component not created");
    }

    public static final void zzO(zzg zzgVar) {
        if (zzgVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Component not created");
        } else {
            if (zzgVar.zza) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Component not initialized: ".concat(String.valueOf(zzgVar.getClass())));
        }
    }

    public static final void zzP(zzjf zzjfVar) {
        if (zzjfVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Component not created");
        } else {
            if (zzjfVar.zza) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Component not initialized: ".concat(String.valueOf(zzjfVar.getClass())));
        }
    }

    public static zzic zzy(Context context, zzdb zzdbVar, Long l, Long l2) {
        Bundle bundle;
        if (zzdbVar != null) {
            Bundle bundle2 = zzdbVar.zzd;
            zzdbVar = new zzdb(zzdbVar.zza, zzdbVar.zzb, zzdbVar.zzc, bundle2, null);
        }
        zzae.checkNotNull(context);
        zzae.checkNotNull(context.getApplicationContext());
        if (zzc == null) {
            synchronized (zzic.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzic(new zzjs(context, zzdbVar, l, l2));
                    }
                } finally {
                }
            }
        } else if (zzdbVar != null && (bundle = zzdbVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            zzae.checkNotNull(zzc);
            zzc.zzB = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        zzae.checkNotNull(zzc);
        return zzc;
    }

    public final boolean zzB() {
        return zzC() == 0;
    }

    public final int zzC() {
        zzhz zzhzVar = this.zzj;
        zzP(zzhzVar);
        zzhzVar.zzg();
        zzal zzalVar = this.zzg;
        if (zzalVar.zzt()) {
            return 1;
        }
        zzP(zzhzVar);
        zzhzVar.zzg();
        if (!this.zzC) {
            return 8;
        }
        zzhh zzhhVar = this.zzh;
        zzN(zzhhVar);
        zzhhVar.zzg();
        Boolean valueOf = zzhhVar.zzd().contains("measurement_enabled") ? Boolean.valueOf(zzhhVar.zzd().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        Trifle trifle = ((zzic) zzalVar.$$delegate_0).zzf;
        Boolean zzr = zzalVar.zzr("firebase_analytics_collection_enabled");
        return zzr != null ? zzr.booleanValue() ? 0 : 4 : (this.zzB == null || this.zzB.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.zzA) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzH() {
        boolean z = false;
        if (!this.zzy) {
            a$$ExternalSyntheticBUOutline0.m$1("AppMeasurement is not initialized");
            return false;
        }
        zzhz zzhzVar = this.zzj;
        zzP(zzhzVar);
        zzhzVar.zzg();
        Boolean bool = this.zzz;
        DefaultClock defaultClock = this.zzn;
        if (bool != null && this.zzA != 0) {
            if (!bool.booleanValue()) {
                defaultClock.getClass();
            }
            return this.zzz.booleanValue();
        }
        defaultClock.getClass();
        this.zzA = SystemClock.elapsedRealtime();
        zzpp zzppVar = this.zzl;
        zzN(zzppVar);
        if (zzppVar.zzab("android.permission.INTERNET") && zzppVar.zzab("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.zzd;
            if (Wrappers.packageManager(context).isCallerInstantApp() || this.zzg.zzE() || (zzpp.zzax(context) && zzpp.zzT(context))) {
                z = true;
            }
        }
        this.zzz = Boolean.valueOf(z);
        if (z) {
            this.zzz = Boolean.valueOf(zzppVar.zzC(zzv().zzk()));
        }
        return this.zzz.booleanValue();
    }

    public final void zzJ(int i, Throwable th, byte[] bArr) {
        zzgu zzguVar;
        zzgu zzguVar2;
        int i2 = i;
        zzgu zzguVar3 = this.zzi;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            zzP(zzguVar3);
            zzguVar3.zzg.zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
        if (th == null) {
            zzhh zzhhVar = this.zzh;
            zzN(zzhhVar);
            zzhhVar.zzo.zzb(true);
            if (bArr == null || bArr.length == 0) {
                zzP(zzguVar3);
                zzguVar3.zzk.zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    zzP(zzguVar3);
                    zzguVar3.zzk.zza("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                zzpp zzppVar = this.zzl;
                zzN(zzppVar);
                zzic zzicVar = (zzic) zzppVar.$$delegate_0;
                if (TextUtils.isEmpty(optString)) {
                    zzguVar2 = zzguVar3;
                } else {
                    Context context = zzicVar.zzd;
                    zzguVar2 = zzguVar3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            this.zzp.zzE("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = zzicVar.zzd;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                zzgu zzguVar4 = ((zzic) zzppVar.$$delegate_0).zzi;
                                zzP(zzguVar4);
                                zzguVar4.zzd.zzb(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        zzguVar = zzguVar2;
                        zzP(zzguVar);
                        zzguVar.zzd.zzb(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                zzP(zzguVar2);
                zzguVar = zzguVar2;
                try {
                    zzguVar.zzg.zzd("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    zzP(zzguVar);
                    zzguVar.zzd.zzb(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                zzguVar = zzguVar3;
            }
        }
        zzP(zzguVar3);
        zzguVar3.zzg.zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Trifle zzaV() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaW() {
        zzgu zzguVar = this.zzi;
        zzP(zzguVar);
        return zzguVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaX() {
        zzhz zzhzVar = this.zzj;
        zzP(zzhzVar);
        return zzhzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaZ() {
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final DefaultClock zzba() {
        return this.zzn;
    }

    public final zzgn zzl() {
        return this.zzm;
    }

    public final zzgl zzm() {
        zzO(this.zzt);
        return this.zzt;
    }

    public final zznl zzt() {
        zzO(this.zzu);
        return this.zzu;
    }

    public final zzbb zzu() {
        zzP(this.zzv);
        return this.zzv;
    }

    public final zzgi zzv() {
        zzO(this.zzw);
        return this.zzw;
    }
}
