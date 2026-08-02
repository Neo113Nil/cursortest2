package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzaix implements Supplier {
    public static final zzaix zza = new zzaix();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaiz());

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaiz) this.zzb.instance;
    }
}
