package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzaic implements Supplier {
    public static final zzaic zza = new zzaic();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaie());

    @Override // com.google.common.base.Supplier
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzaie get() {
        return (zzaie) this.zzb.instance;
    }
}
