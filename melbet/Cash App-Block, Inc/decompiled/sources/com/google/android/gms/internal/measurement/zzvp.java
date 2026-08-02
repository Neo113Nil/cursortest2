package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zzvp {
    public final RegularImmutableList zza;
    public final RegularImmutableList zzb;
    public final UUID zzc;

    public zzvp(RegularImmutableList regularImmutableList, RegularImmutableList regularImmutableList2, UUID uuid) {
        this.zza = regularImmutableList;
        this.zzb = regularImmutableList2;
        this.zzc = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzvp)) {
            return false;
        }
        zzvp zzvpVar = (zzvp) obj;
        if (Maps.equalsImpl(zzvpVar.zza, this.zza)) {
            return Maps.equalsImpl(zzvpVar.zzb, this.zzb) && this.zzc.equals(zzvpVar.zzc);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzc.hashCode() ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.zza);
    }
}
