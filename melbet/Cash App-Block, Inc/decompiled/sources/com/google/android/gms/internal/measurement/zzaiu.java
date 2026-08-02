package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzaiu implements Supplier {
    public static final zzaiu zza = new zzaiu();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaiw());

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaiw) this.zzb.instance;
    }
}
