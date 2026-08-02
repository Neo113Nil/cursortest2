package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class zzfx implements zzboh {
    public final zzbon zza;

    public zzfx(zzbon zzbonVar) {
        this.zza = zzbonVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ImmutableList zzb() {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) this.zza.zzb());
        zzkf.zza(copyOf);
        return copyOf;
    }
}
