package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzagy implements Supplier {
    public static final zzagy zza = new zzagy();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaha());

    public static boolean zza() {
        return ((Boolean) zzaha.zza.get()).booleanValue();
    }

    public static boolean zzb() {
        return ((Boolean) zzaha.zzb.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaha) this.zzb.instance;
    }
}
