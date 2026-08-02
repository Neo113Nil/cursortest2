package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzabe {
    public static final zzaax zzb = new zzaax(0);
    public static final zzabe zzc;
    public final zzabc zzd;

    static {
        List list = Collections.EMPTY_LIST;
        zzc = new zzabe(new zzabc());
    }

    public zzabe(zzabc zzabcVar) {
        this.zzd = zzabcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzabe) && ((zzabe) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final String toString() {
        return this.zzd.toString();
    }
}
