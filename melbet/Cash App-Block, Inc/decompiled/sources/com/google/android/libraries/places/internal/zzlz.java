package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.auth.zzd;
import com.nimbusds.jose.JWECryptoParts;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzlz implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JWECryptoParts zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzns zzc;

    public /* synthetic */ zzlz(JWECryptoParts jWECryptoParts, long j, zzns zznsVar, int i) {
        this.$r8$classId = i;
        this.zza = jWECryptoParts;
        this.zzb = j;
        this.zzc = zznsVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.$r8$classId;
        JWECryptoParts jWECryptoParts = this.zza;
        switch (i) {
            case 0:
                ((zzfa) ((zzex) jWECryptoParts.authenticationTag)).getClass();
                ((zbc) jWECryptoParts.cipherText).zzl(task, this.zzb, SystemClock.elapsedRealtime(), 2, this.zzc, zzd.zza);
                return (com.google.android.libraries.places.api.net.zzl) task.getResult();
            default:
                ((zzfa) ((zzex) jWECryptoParts.authenticationTag)).getClass();
                ((zbc) jWECryptoParts.cipherText).zzn(task, this.zzb, SystemClock.elapsedRealtime(), 2, this.zzc, zzd.zza);
                return (com.google.android.libraries.places.api.net.zzf) task.getResult();
        }
    }
}
