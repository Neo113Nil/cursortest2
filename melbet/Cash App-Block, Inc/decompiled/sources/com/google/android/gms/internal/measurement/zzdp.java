package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzdp extends zzeo {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Context zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzey zzeyVar, Bundle bundle, Activity activity) {
        super(zzeyVar.zza, true);
        this.zzb = bundle;
        this.zza = activity;
        this.zzc = zzeyVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:14|15|(1:17)|18|(12:58|59|60|21|(1:57)(1:25)|26|27|28|(1:30)(1:53)|31|32|(1:34)(7:36|(1:51)(1:39)|40|41|(1:43)(1:50)|44|(1:46)(1:48)))|20|21|(1:23)|57|26|27|28|(0)(0)|31|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        r7.zzW(r0, true, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: Exception -> 0x0059, LoadingException -> 0x008b, TRY_ENTER, TryCatch #1 {LoadingException -> 0x008b, blocks: (B:30:0x0088, B:31:0x008f, B:53:0x008d), top: B:28:0x0086, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: Exception -> 0x0059, TryCatch #2 {Exception -> 0x0059, blocks: (B:15:0x0041, B:17:0x0054, B:18:0x005c, B:21:0x0071, B:23:0x0078, B:26:0x0081, B:30:0x0088, B:31:0x008f, B:32:0x00a1, B:34:0x00a7, B:36:0x00b0, B:40:0x00c9, B:46:0x00eb, B:48:0x0101, B:53:0x008d, B:56:0x009e, B:59:0x0068), top: B:14:0x0041, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: Exception -> 0x0059, TryCatch #2 {Exception -> 0x0059, blocks: (B:15:0x0041, B:17:0x0054, B:18:0x005c, B:21:0x0071, B:23:0x0078, B:26:0x0081, B:30:0x0088, B:31:0x008f, B:32:0x00a1, B:34:0x00a7, B:36:0x00b0, B:40:0x00c9, B:46:0x00eb, B:48:0x0101, B:53:0x008d, B:56:0x009e, B:59:0x0068), top: B:14:0x0041, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d A[Catch: Exception -> 0x0059, LoadingException -> 0x008b, TryCatch #1 {LoadingException -> 0x008b, blocks: (B:30:0x0088, B:31:0x008f, B:53:0x008d), top: B:28:0x0086, outer: #2 }] */
    @Override // com.google.android.gms.internal.measurement.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        Boolean valueOf;
        zzez zzezVar;
        Bundle bundle = null;
        zzcp zzcpVar = null;
        switch (this.$r8$classId) {
            case 0:
                try {
                    Context context = this.zza;
                    com.google.android.gms.common.internal.zzae.checkNotNull(context);
                    String zza = PlatformKt.zza(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(zza)) {
                        zza = PlatformKt.zza(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", zza);
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        zzezVar = (zzez) this.zzc;
                        Object[] objArr = (valueOf == null && valueOf.booleanValue()) ? false : true;
                        zzezVar.getClass();
                        zzcpVar = zzco.asInterface(DynamiteModule.load(context, objArr == false ? DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION : DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        zzezVar.zzj = zzcpVar;
                        if (zzezVar.zzj == null) {
                            int localVersion = DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID);
                            int zza2 = DynamiteModule.zza(context, ModuleDescriptor.MODULE_ID, false);
                            int max = Math.max(localVersion, zza2);
                            boolean z = Boolean.TRUE.equals(valueOf) || zza2 < localVersion;
                            long j = max;
                            zzezVar.zzk = j;
                            zzdb zzdbVar = new zzdb(161000L, j, z, this.zzb, PlatformKt.zza(context));
                            Object[] objArr2 = zzezVar.zzk >= 169;
                            zzcp zzcpVar2 = zzezVar.zzj;
                            if (objArr2 != true) {
                                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                                zzcpVar2.initialize(new ObjectWrapper(context), zzdbVar, this.zzi);
                                break;
                            } else {
                                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                                zzcpVar2.initializeWithElapsedTime(new ObjectWrapper(context), zzdbVar, this.zzi, this.zzj);
                                break;
                            }
                        } else {
                            Log.w("FA", "Failed to connect to measurement client.");
                            break;
                        }
                    }
                    valueOf = null;
                    zzezVar = (zzez) this.zzc;
                    if (valueOf == null) {
                    }
                    zzezVar.getClass();
                    zzcpVar = zzco.asInterface(DynamiteModule.load(context, objArr == false ? DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION : DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    zzezVar.zzj = zzcpVar;
                    if (zzezVar.zzj == null) {
                    }
                } catch (Exception e) {
                    ((zzez) this.zzc).zzW(e, true, false);
                    return;
                }
            default:
                Bundle bundle2 = this.zzb;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                zzcp zzcpVar3 = ((zzey) this.zzc).zza.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar3);
                zzcpVar3.onActivityCreatedByScionActivityInfo(zzdd.zza((Activity) this.zza), bundle, this.zzj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzez zzezVar, Context context, Bundle bundle) {
        super(zzezVar, true);
        this.zza = context;
        this.zzb = bundle;
        this.zzc = zzezVar;
    }
}
