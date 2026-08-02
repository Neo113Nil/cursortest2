package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzgdr extends zzgdo {
    private zzgdr() {
        super(null);
    }

    /* synthetic */ zzgdr(zzgdq zzgdqVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    final int zza(zzgds zzgdsVar) {
        int i;
        int i2;
        synchronized (zzgdsVar) {
            i = zzgdsVar.remaining;
            i2 = i - 1;
            zzgdsVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    final void zzb(zzgds zzgdsVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzgdsVar) {
            set3 = zzgdsVar.seenExceptions;
            if (set3 == null) {
                zzgdsVar.seenExceptions = set2;
            }
        }
    }
}
