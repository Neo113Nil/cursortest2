package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zzuv extends zzuh {
    public static final zzuv zza = new zzuv(UUID.randomUUID());
    public final zzuy zza$1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzuv(UUID uuid) {
        super("<skip trace>", uuid, r0, zzur.zzd());
        String concat = "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
        zzuy zzuyVar = zzux.zza;
        Trace.checkArgument(zzuyVar.zzd);
        this.zza$1 = zzuyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzuh
    public final zzuy zzg() {
        zzuy zzuyVar = zzux.zza;
        zzuy zzuyVar2 = this.zza$1;
        zzuyVar2.getClass();
        if (zzuyVar2 == zzuyVar) {
            return zzuyVar;
        }
        zzuyVar.getClass();
        return zzuyVar2;
    }
}
