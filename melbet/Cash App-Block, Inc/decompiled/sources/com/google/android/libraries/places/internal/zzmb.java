package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.android.libraries.places.api.net.zzo;
import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzmb implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JWECryptoParts zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzmb(JWECryptoParts jWECryptoParts, long j, int i) {
        this.$r8$classId = i;
        this.zza = jWECryptoParts;
        this.zzb = j;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.$r8$classId;
        zzd zzdVar = zzd.zza;
        zzns zznsVar = zzns.zzc;
        long j = this.zzb;
        JWECryptoParts jWECryptoParts = this.zza;
        switch (i) {
            case 0:
                zbc zbcVar = (zbc) jWECryptoParts.cipherText;
                ((zzfa) ((zzex) jWECryptoParts.authenticationTag)).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzaqq zza = zzaqv.zza();
                zza.zzf(15);
                zza.zzg(zbc.zzp(task));
                zza.zza((int) (elapsedRealtime - j));
                zbcVar.zzt((zzaqv) zza.zzD(), 2, zznsVar, zzdVar);
                return (com.google.android.libraries.places.api.net.zzc) task.getResult();
            default:
                zbc zbcVar2 = (zbc) jWECryptoParts.cipherText;
                ((zzfa) ((zzex) jWECryptoParts.authenticationTag)).getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (task.isSuccessful()) {
                    ((zzo) task.getResult()).getClass();
                    throw null;
                }
                zzapx zza$1 = zzapy.zza$1();
                zza$1.zzy();
                ((zzapy) zza$1.zza).zzc(0);
                zzapy zzapyVar = (zzapy) zza$1.zzD();
                zzaqq zza2 = zzaqv.zza();
                zza2.zzf(4);
                zza2.zzy();
                ((zzaqv) zza2.zza).zze(zzapyVar);
                zza2.zzg(zbc.zzp(task));
                zza2.zza((int) (elapsedRealtime2 - j));
                zbcVar2.zzt((zzaqv) zza2.zzD(), 2, zznsVar, zzdVar);
                return (zzo) task.getResult();
        }
    }
}
