package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzaif implements Supplier {
    public static final zzaif zza = new zzaif();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaih());

    public static void zza() {
        zza.get();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzaih get() {
        return (zzaih) this.zzb.instance;
    }
}
