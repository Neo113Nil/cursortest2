package com.google.android.libraries.places.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.BitSet;

/* loaded from: classes4.dex */
public final class zzje {
    public final Context zza;

    public zzje(Context context) {
        this.zza = context;
        zzbog.zza(new zznm(zzfz.zza(context), 1));
    }

    public void zzc(zzbsn zzbsnVar) {
        Context context = this.zza;
        String zza = zzkf.zza(context.getPackageManager(), context.getPackageName());
        if (TextUtils.isEmpty(zza)) {
            return;
        }
        zzbsg zzbsgVar = zzbsn.zza;
        BitSet bitSet = zzbsj.zzb;
        zzbsnVar.zzc(new zzbsh("X-Android-Package", zzbsgVar), context.getPackageName());
        zzbsnVar.zzc(new zzbsh("X-Places-Android-Sdk", zzbsgVar), "5.2.0");
        zzbsnVar.zzc(new zzbsh("X-Android-Cert", zzbsgVar), zza);
    }
}
