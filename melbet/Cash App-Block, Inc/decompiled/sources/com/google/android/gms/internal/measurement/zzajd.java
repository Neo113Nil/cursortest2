package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzajd implements Supplier {
    public static final zzajd zza = new zzajd();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzajf());

    public static boolean zza() {
        return ((Boolean) zzajf.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzajf) this.zzb.instance;
    }
}
