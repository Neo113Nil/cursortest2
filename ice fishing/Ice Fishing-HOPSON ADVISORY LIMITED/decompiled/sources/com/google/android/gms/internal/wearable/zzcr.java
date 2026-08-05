package com.google.android.gms.internal.wearable;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzcr {
    private final Object zza;
    private final int zzb;

    zzcr(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcr)) {
            return false;
        }
        zzcr zzcrVar = (zzcr) obj;
        return this.zza == zzcrVar.zza && this.zzb == zzcrVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
