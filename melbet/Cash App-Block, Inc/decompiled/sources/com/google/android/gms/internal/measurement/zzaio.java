package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzaio implements Supplier {
    public static final zzaio zza = new zzaio();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaiq());

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaiq) this.zzb.instance;
    }
}
