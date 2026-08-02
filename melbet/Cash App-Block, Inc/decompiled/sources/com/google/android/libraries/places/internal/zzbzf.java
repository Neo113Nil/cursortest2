package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.concurrent.TimeUnit;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbzf implements zzbsi {
    @Override // com.google.android.libraries.places.internal.zzbsi
    public final /* bridge */ /* synthetic */ Object zza(String str) {
        Trace.checkArgument("empty timeout", str.length() > 0);
        Trace.checkArgument("bad timeout format", str.length() <= 9);
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        Path$$ExternalSyntheticBUOutline0.m$2(charAt, "Invalid timeout unit: ");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        long max = Math.max(1L, ((Long) obj).longValue());
        if (max < 100000000) {
            StringBuilder sb = new StringBuilder(String.valueOf(max).length() + 1);
            sb.append(max);
            sb.append("n");
            return sb.toString();
        }
        if (max < 100000000000L) {
            long j = max / 1000;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 1);
            sb2.append(j);
            sb2.append("u");
            return sb2.toString();
        }
        if (max < 100000000000000L) {
            long j2 = max / 1000000;
            StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 1);
            sb3.append(j2);
            sb3.append("m");
            return sb3.toString();
        }
        if (max < 100000000000000000L) {
            long j3 = max / 1000000000;
            StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 1);
            sb4.append(j3);
            sb4.append("S");
            return sb4.toString();
        }
        if (max < 6000000000000000000L) {
            long j4 = max / 60000000000L;
            StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 1);
            sb5.append(j4);
            sb5.append("M");
            return sb5.toString();
        }
        long j5 = max / 3600000000000L;
        StringBuilder sb6 = new StringBuilder(String.valueOf(j5).length() + 1);
        sb6.append(j5);
        sb6.append("H");
        return sb6.toString();
    }
}
