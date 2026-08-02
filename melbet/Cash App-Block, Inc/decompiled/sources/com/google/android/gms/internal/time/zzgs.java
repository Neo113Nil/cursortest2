package com.google.android.gms.internal.time;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzgs {
    public static final zzgl zza = new zzgl(0);
    public static final zzgs zzb;
    public final zzgq zzc;

    static {
        List list = Collections.EMPTY_LIST;
        zzb = new zzgs(new zzgq());
    }

    public zzgs(zzgq zzgqVar) {
        this.zzc = zzgqVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgs) && ((zzgs) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }
}
