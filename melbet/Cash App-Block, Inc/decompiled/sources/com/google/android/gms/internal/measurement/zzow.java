package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.base.Function;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzow implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzow(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((zzpg) this.zza).zzf)), (Throwable) obj);
                return null;
            case 1:
                zznu zznuVar = (zznu) obj;
                zzvb zzvbVar = zzpu.zzb;
                String str = (String) this.zza;
                zznq zznqVar = (zznq) zznuVar.zza(str, zznr.zzb()).zzco();
                if (!Collections.unmodifiableList(((zznr) zznqVar.zza).zza()).contains("")) {
                    zznqVar.zzaY();
                    ((zznr) zznqVar.zza).zzc$4("");
                }
                zznt zzntVar = (zznt) zznuVar.zzco();
                zznqVar.zzaY();
                ((zznr) zznqVar.zza).zzd("");
                zznr zznrVar = (zznr) zznqVar.zzbd();
                zzntVar.zzaY();
                ((zznu) zzntVar.zza).zzc().put(str, zznrVar);
                return (zznu) zzntVar.zzbd();
            default:
                zzrf zzrfVar = (zzrf) this.zza;
                zzno zznoVar = (zzno) obj;
                zzz zzzVar = new zzz(3);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (zzrf.zza) {
                            zzru zzruVar = (zzru) zzrfVar.zzf.get();
                            Uri uri = zzrfVar.zzi;
                            zzz zzzVar2 = new zzz(zznoVar.zza());
                            zzzVar2.zzb = new zzz[]{zzzVar};
                            zzruVar.zza(uri, zzzVar2);
                            zzrfVar.zzj = zznoVar.zza();
                        }
                        synchronized (zzrf.zzb) {
                            zzru zzruVar2 = (zzru) zzrfVar.zzf.get();
                            Uri uri2 = zzrfVar.zzk;
                            zzz zzzVar3 = new zzz(zznoVar.zzb());
                            zzzVar3.zzb = new zzz[]{zzzVar};
                            zzruVar2.zza(uri2, zzzVar3);
                            zznoVar.zzb();
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
