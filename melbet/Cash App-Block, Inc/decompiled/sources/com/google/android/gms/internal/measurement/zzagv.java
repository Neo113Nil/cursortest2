package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzagv implements Supplier {
    public static final zzagv zza = new zzagv();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzagx());

    public static long zza() {
        return ((Long) zzagx.zza.get()).longValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzagx) this.zzb.instance;
    }
}
