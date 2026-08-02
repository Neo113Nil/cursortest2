package com.google.android.libraries.places.internal;

import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class zzcgl {
    public static final zzbsb zza;
    public static final zzbsb zzb;
    public static final zzbsb zzc;
    public static final zzbsb zzd;
    public final zzfv zze;

    static {
        zzbsb zzbsbVar;
        zzbsu zza2 = zzbsu.zza();
        zza = zza2.zzc("grpc.subchannel.disconnections", "EXPERIMENTAL. Number of times the selected subchannel becomes disconnected", "{disconnection}", Maps.newArrayList("grpc.target"), Maps.newArrayList("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"));
        zzb = zza2.zzc("grpc.subchannel.connection_attempts_succeeded", "EXPERIMENTAL. Number of successful connection attempts", "{attempt}", Maps.newArrayList("grpc.target"), Maps.newArrayList("grpc.lb.backend_service", "grpc.lb.locality"));
        zzc = zza2.zzc("grpc.subchannel.connection_attempts_failed", "EXPERIMENTAL. Number of failed connection attempts", "{attempt}", Maps.newArrayList("grpc.target"), Maps.newArrayList("grpc.lb.backend_service", "grpc.lb.locality"));
        ArrayList newArrayList = Maps.newArrayList("grpc.target");
        ArrayList newArrayList2 = Maps.newArrayList("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality");
        Trace.checkArgument("missing metric name", !TransactorKt.stringIsNullOrEmpty("grpc.subchannel.open_connections"));
        synchronized (zza2.zzb) {
            HashSet hashSet = zza2.zzc;
            if (hashSet.contains("grpc.subchannel.open_connections")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append("Metric with name grpc.subchannel.open_connections already exists");
                throw new IllegalStateException(sb.toString());
            }
            int i = zza2.zze;
            int i2 = i + 1;
            zzbsb[] zzbsbVarArr = zza2.zzd;
            if (i2 == zzbsbVarArr.length) {
                zza2.zzd = (zzbsb[]) Arrays.copyOf(zzbsbVarArr, zzbsbVarArr.length + 5);
            }
            zzbsbVar = new zzbsb(i, "grpc.subchannel.open_connections", newArrayList, newArrayList2);
            zza2.zzd[i] = zzbsbVar;
            hashSet.add("grpc.subchannel.open_connections");
            zza2.zze++;
        }
        zzd = zzbsbVar;
    }

    public zzcgl(zzfv zzfvVar) {
        this.zze = zzfvVar;
    }
}
