package com.google.android.gms.internal.measurement;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzxs {
    public static final zzxr zza = new zzxr();
    public final Object zza$1;

    public zzxs(int i) {
        switch (i) {
            case 4:
                this.zza$1 = new AtomicInteger();
                break;
            default:
                this.zza$1 = new ConcurrentHashMap();
                break;
        }
    }

    public static void zzd(String str, zzxq zzxqVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(zzxqVar.zzc / 1000000)));
        sb.append(": logging error [");
        zzyc zzycVar = zzxqVar.zze;
        if (zzycVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("cannot request log site information prior to postProcess()");
            return;
        }
        zzxm.zza(1, zzycVar, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public zznx zza(String str, boolean z) {
        return new zznx(str, (zzpi) this.zza$1, z);
    }

    public zzxs(Context context) {
        new ConcurrentHashMap();
        zzky.zza(context != null, "Context cannot be null", new Object[0]);
        this.zza$1 = context.getApplicationContext();
    }

    public /* synthetic */ zzxs(Object obj) {
        this.zza$1 = obj;
    }
}
