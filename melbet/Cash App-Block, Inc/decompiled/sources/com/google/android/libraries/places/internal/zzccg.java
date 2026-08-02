package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzccg {
    public static final zzboq zza = new zzboq("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 1);
    public final Long zzb;
    public final Boolean zzc;
    public final Integer zzd;
    public final Integer zze;
    public final zzcfm zzf;
    public final zzbzh zzg;

    public zzccg(Map map, boolean z) {
        long j;
        boolean z2;
        zzcfm zzcfmVar;
        zzbzh zzbzhVar;
        this.zzb = zzwr.zzh("timeout", map);
        this.zzc = zzwr.zzi("waitForReady", map);
        Integer zzf = zzwr.zzf("maxResponseMessageBytes", map);
        this.zzd = zzf;
        if (zzf != null) {
            Trace.checkArgument("maxInboundMessageSize %s exceeds bounds", zzf, zzf.intValue() >= 0);
        }
        Integer zzf2 = zzwr.zzf("maxRequestMessageBytes", map);
        this.zze = zzf2;
        if (zzf2 != null) {
            Trace.checkArgument("maxOutboundMessageSize %s exceeds bounds", zzf2, zzf2.intValue() >= 0);
        }
        Map zzd = z ? zzwr.zzd("retryPolicy", map) : null;
        if (zzd == null) {
            j = 0;
            zzcfmVar = null;
            z2 = true;
        } else {
            Integer zzf3 = zzwr.zzf("maxAttempts", zzd);
            Trace.checkNotNull(zzf3, "maxAttempts cannot be empty");
            int intValue = zzf3.intValue();
            Trace.checkArgument("maxAttempts must be greater than 1: %s", intValue, intValue >= 2);
            int min = Math.min(intValue, 5);
            Long zzh = zzwr.zzh("initialBackoff", zzd);
            Trace.checkNotNull(zzh, "initialBackoff cannot be empty");
            long longValue = zzh.longValue();
            Trace.checkArgument(longValue, "initialBackoffNanos must be greater than 0: %s", longValue > 0);
            Long zzh2 = zzwr.zzh("maxBackoff", zzd);
            Trace.checkNotNull(zzh2, "maxBackoff cannot be empty");
            long longValue2 = zzh2.longValue();
            j = 0;
            z2 = true;
            Trace.checkArgument(longValue2, "maxBackoff must be greater than 0: %s", longValue2 > 0);
            Double zze = zzwr.zze("backoffMultiplier", zzd);
            Trace.checkNotNull(zze, "backoffMultiplier cannot be empty");
            double doubleValue = zze.doubleValue();
            Trace.checkArgument("backoffMultiplier must be greater than 0: %s", zze, doubleValue > 0.0d);
            Long zzh3 = zzwr.zzh("perAttemptRecvTimeout", zzd);
            Trace.checkArgument("perAttemptRecvTimeout cannot be negative: %s", zzh3, zzh3 == null || zzh3.longValue() >= 0);
            Set zzc = zzcfz.zzc("retryableStatusCodes", zzd);
            Ascii.verify("%s is required in retry policy", "retryableStatusCodes", zzc != null);
            Ascii.verify("%s must not contain OK", "retryableStatusCodes", !zzc.contains(zzbtu.OK));
            Trace.checkArgument("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (zzh3 == null && zzc.isEmpty()) ? false : true);
            zzcfmVar = new zzcfm(min, longValue, longValue2, doubleValue, zzh3, zzc);
        }
        this.zzf = zzcfmVar;
        Map zzd2 = z ? zzwr.zzd("hedgingPolicy", map) : null;
        if (zzd2 == null) {
            zzbzhVar = null;
        } else {
            Integer zzf4 = zzwr.zzf("maxAttempts", zzd2);
            Trace.checkNotNull(zzf4, "maxAttempts cannot be empty");
            int intValue2 = zzf4.intValue();
            Trace.checkArgument("maxAttempts must be greater than 1: %s", intValue2, intValue2 >= 2 ? z2 : false);
            int min2 = Math.min(intValue2, 5);
            Long zzh4 = zzwr.zzh("hedgingDelay", zzd2);
            Trace.checkNotNull(zzh4, "hedgingDelay cannot be empty");
            long longValue3 = zzh4.longValue();
            Trace.checkArgument(longValue3, "hedgingDelay must not be negative: %s", longValue3 >= j ? z2 : false);
            Set zzc2 = zzcfz.zzc("nonFatalStatusCodes", zzd2);
            if (zzc2 == null) {
                zzc2 = Collections.unmodifiableSet(EnumSet.noneOf(zzbtu.class));
            } else {
                Ascii.verify("%s must not contain OK", "nonFatalStatusCodes", !zzc2.contains(zzbtu.OK));
            }
            zzbzhVar = new zzbzh(min2, longValue3, zzc2);
        }
        this.zzg = zzbzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzccg)) {
            return false;
        }
        zzccg zzccgVar = (zzccg) obj;
        return Objects.equals(this.zzb, zzccgVar.zzb) && Objects.equals(this.zzc, zzccgVar.zzc) && Objects.equals(this.zzd, zzccgVar.zzd) && Objects.equals(this.zze, zzccgVar.zze) && Objects.equals(this.zzf, zzccgVar.zzf) && Objects.equals(this.zzg, zzccgVar.zzg);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzb, "timeoutNanos");
        stringHelper.add(this.zzc, "waitForReady");
        stringHelper.add(this.zzd, "maxInboundMessageSize");
        stringHelper.add(this.zze, "maxOutboundMessageSize");
        stringHelper.add(this.zzf, "retryPolicy");
        stringHelper.add(this.zzg, "hedgingPolicy");
        return stringHelper.toString();
    }
}
