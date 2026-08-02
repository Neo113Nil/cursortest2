package com.google.android.gms.internal.time;

import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class zzef {
    public static final zzdg zzb = new zzdg(7);
    public final Object zza;

    public zzef() {
        this.zza = new ConcurrentHashMap();
    }

    public static void zzb(String str, zzd zzdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(zzdVar.zzc / 1000000)));
        sb.append(": logging error [");
        zzdg zzdgVar = zzdVar.zze;
        if (zzdgVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("cannot request log site information prior to postProcess()");
            return;
        }
        zzbz.zza(1, zzdgVar, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract Object zza();

    public void zza(RuntimeException runtimeException, zzd zzdVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void zzb(zzd zzdVar);

    public abstract boolean zzc(Level level);

    public /* synthetic */ zzef(Object obj) {
        this.zza = obj;
    }

    public Object zzb(zzdi zzdiVar, zzcw zzcwVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.zza;
        Object obj = concurrentHashMap.get(zzdiVar);
        if (obj != null) {
            return obj;
        }
        Object zza = zza();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(zzdiVar, zza);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int zza2 = zzcwVar.zza();
        for (int i = 0; i < zza2; i++) {
            if (zzdd.zzf.equals(zzcwVar.zzb(i))) {
                zzcwVar.zzd(i);
            }
        }
        return zza;
    }
}
