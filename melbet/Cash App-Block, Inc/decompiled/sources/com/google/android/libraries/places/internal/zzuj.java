package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zzuj {
    public final RegularImmutableList zza;
    public final RegularImmutableList zzb;
    public final UUID zzc;

    public zzuj(RegularImmutableList regularImmutableList, RegularImmutableList regularImmutableList2, UUID uuid) {
        this.zza = regularImmutableList;
        this.zzb = regularImmutableList2;
        this.zzc = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzuj)) {
            return false;
        }
        zzuj zzujVar = (zzuj) obj;
        if (Maps.equalsImpl(zzujVar.zza, this.zza)) {
            return Maps.equalsImpl(zzujVar.zzb, this.zzb) && this.zzc.equals(zzujVar.zzc);
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
