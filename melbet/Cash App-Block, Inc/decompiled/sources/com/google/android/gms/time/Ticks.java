package com.google.android.gms.time;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzai;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class Ticks {
    public final zzai zza;
    public final long zzb;

    public Ticks(zzai zzaiVar, long j) {
        Objects.requireNonNull(zzaiVar);
        this.zza = zzaiVar;
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticks)) {
            return false;
        }
        Ticks ticks = (Ticks) obj;
        return this.zzb == ticks.zzb && Objects.equals(this.zza, ticks.zza);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Long.valueOf(this.zzb));
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.zzb, "}", JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Ticks{originalTicker=", String.valueOf(this.zza), ", value="));
    }
}
