package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzahn implements Supplier {
    public static final zzahn zza = new zzahn();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahp());

    public static void zza() {
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahp) this.zzb.instance;
    }
}
