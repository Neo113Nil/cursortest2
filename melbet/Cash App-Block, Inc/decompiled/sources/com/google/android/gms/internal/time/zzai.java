package com.google.android.gms.internal.time;

import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import com.google.android.gms.time.Ticks;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzai {
    public final Long zza;
    public final int zzb;

    public zzai(int i, Long l) {
        this.zza = l;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzai) {
            return Objects.equals(this.zza, ((zzai) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza);
    }

    public final String toString() {
        return "BasicPhysicalTicker";
    }

    public final void zzd(Ticks ticks) {
        if (ticks.zza == this) {
            return;
        }
        DifferentialMotionFlingController$$ExternalSyntheticLambda0.m(ticks, ") must be from this Ticker (", this, ")", "Ticks (");
    }
}
