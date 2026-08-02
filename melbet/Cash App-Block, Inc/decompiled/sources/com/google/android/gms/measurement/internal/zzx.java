package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bugsnag.android.internal.dag.ContextModule;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes.dex */
public final class zzx {
    public final /* synthetic */ int $r8$classId = 0;
    public final zzic zza;

    public zzx(zzpg zzpgVar) {
        this.zza = zzpgVar.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean zza() {
        int i = this.$r8$classId;
        zzic zzicVar = this.zza;
        switch (i) {
            case 1:
                boolean z = false;
                try {
                    ContextModule packageManager = Wrappers.packageManager(zzicVar.zzd);
                    if (packageManager == null) {
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzl.zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        zzicVar = zzicVar;
                    } else {
                        int i2 = packageManager.getPackageInfo(128, "com.android.vending").versionCode;
                        zzicVar = i2;
                        if (i2 >= 80837300) {
                            z = true;
                            zzicVar = i2;
                        }
                    }
                } catch (Exception e) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzl.zzb(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                zzgu zzguVar3 = zzicVar.zzi;
                zzic.zzP(zzguVar3);
                return Log.isLoggable(zzguVar3.zzn(), 3);
        }
    }

    public void zzb(Bundle bundle, String str) {
        String uri;
        zzic zzicVar = this.zza;
        zzhz zzhzVar = zzicVar.zzj;
        zzhh zzhhVar = zzicVar.zzh;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        if (zzicVar.zzB()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        zzic.zzN(zzhhVar);
        zzhhVar.zzr.zzb(uri);
        zzhe zzheVar = zzhhVar.zzs;
        zzicVar.zzn.getClass();
        zzheVar.zzb(System.currentTimeMillis());
    }

    public boolean zzd() {
        if (!zze()) {
            return false;
        }
        zzic zzicVar = this.zza;
        zzicVar.zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zzhh zzhhVar = zzicVar.zzh;
        zzic.zzN(zzhhVar);
        return currentTimeMillis - zzhhVar.zzs.zza() > zzicVar.zzg.zzl(null, zzfy.zzai);
    }

    public boolean zze() {
        zzhh zzhhVar = this.zza.zzh;
        zzic.zzN(zzhhVar);
        return zzhhVar.zzs.zza() > 0;
    }

    public zzx(zzic zzicVar) {
        this.zza = zzicVar;
    }

    public zzx(zzjs zzjsVar, zzic zzicVar) {
        this.zza = zzicVar;
    }
}
