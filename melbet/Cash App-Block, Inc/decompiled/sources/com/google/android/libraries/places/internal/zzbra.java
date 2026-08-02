package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzbra {
    public static final AtomicLong zza = new AtomicLong();
    public final String zzb;
    public final String zzc;
    public final long zzd;

    public zzbra(String str, String str2, long j) {
        Trace.checkArgument("empty type", !str.isEmpty());
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzbra zza(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new zzbra(simpleName, str, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        long j = this.zzd;
        StringBuilder sb2 = new StringBuilder(JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(length, 1, String.valueOf(j).length(), 1));
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        String str2 = this.zzc;
        if (str2 != null) {
            sb.append(": (");
            sb.append(str2);
            sb.append(')');
        }
        return sb.toString();
    }
}
