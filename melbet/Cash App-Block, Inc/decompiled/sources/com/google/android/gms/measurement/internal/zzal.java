package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class zzal extends InteractionResult {
    public Boolean zza;
    public String zzb;
    public zzak zzc;
    public Boolean zzd;

    public final boolean zzC(String str) {
        zzic.zzN(((zzic) this.$$delegate_0).zzl);
        if (zzpp.zzaE((String) zzfy.zzbg.zzb(null), str) || zzpp.zzaE((String) zzfy.zzbh.zzb(null), str) || zzpp.zzaE((String) zzfy.zzbi.zzb(null), str)) {
            return true;
        }
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzD(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzE() {
        if (this.zza == null) {
            Boolean zzr = zzr("app_measurement_lite");
            this.zza = zzr;
            if (zzr == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !((zzic) this.$$delegate_0).zze;
    }

    public final String zzK(String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            zzae.checkNotNull(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzd.zzb(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            zzgu zzguVar4 = zzicVar.zzi;
            zzic.zzP(zzguVar4);
            zzguVar4.zzd.zzb(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int zzf(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(zzm(str, zzfy.zzag), 500), 100) : 500, 256);
    }

    public final void zzi() {
        ((zzic) this.$$delegate_0).getClass();
    }

    public final String zzk(String str, zzfx zzfxVar) {
        return TextUtils.isEmpty(str) ? (String) zzfxVar.zzb(null) : (String) zzfxVar.zzb(this.zzc.zza(str, zzfxVar.zza));
    }

    public final long zzl(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
        String zza = this.zzc.zza(str, zzfxVar.zza);
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
        try {
            return ((Long) zzfxVar.zzb(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfxVar.zzb(null)).longValue();
        }
    }

    public final int zzm(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
        String zza = this.zzc.zza(str, zzfxVar.zza);
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
        try {
            return ((Integer) zzfxVar.zzb(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfxVar.zzb(null)).intValue();
        }
    }

    public final double zzo(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
        String zza = this.zzc.zza(str, zzfxVar.zza);
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
        try {
            return ((Double) zzfxVar.zzb(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfxVar.zzb(null)).doubleValue();
        }
    }

    public final boolean zzp(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfxVar.zzb(null)).booleanValue();
        }
        String zza = this.zzc.zza(str, zzfxVar.zza);
        return TextUtils.isEmpty(zza) ? ((Boolean) zzfxVar.zzb(null)).booleanValue() : ((Boolean) zzfxVar.zzb(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final Bundle zzq() {
        zzic zzicVar = (zzic) this.$$delegate_0;
        try {
            Context context = zzicVar.zzd;
            Context context2 = zzicVar.zzd;
            zzgu zzguVar = zzicVar.zzi;
            if (context.getPackageManager() == null) {
                zzic.zzP(zzguVar);
                zzguVar.zzd.zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(context2).getApplicationInfo(128, context2.getPackageName());
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean zzr(String str) {
        zzae.checkNotEmpty(str);
        Bundle zzq = zzq();
        if (zzq != null) {
            if (zzq.containsKey(str)) {
                return Boolean.valueOf(zzq.getBoolean(str));
            }
            return null;
        }
        zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzd.zza("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean zzt() {
        ((zzic) this.$$delegate_0).getClass();
        Boolean zzr = zzr("firebase_analytics_collection_deactivated");
        return zzr != null && zzr.booleanValue();
    }

    public final boolean zzv() {
        Boolean zzr = zzr("google_analytics_automatic_screen_reporting_enabled");
        return zzr == null || zzr.booleanValue();
    }

    public final zzji zzw(String str, boolean z) {
        Object obj;
        zzae.checkNotEmpty(str);
        zzic zzicVar = (zzic) this.$$delegate_0;
        Bundle zzq = zzq();
        if (zzq == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = zzq.get(str);
        }
        zzji zzjiVar = zzji.UNINITIALIZED;
        if (obj == null) {
            return zzjiVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        zzgu zzguVar2 = zzicVar.zzi;
        zzic.zzP(zzguVar2);
        zzguVar2.zzg.zzb(str, "Invalid manifest metadata for");
        return zzjiVar;
    }
}
