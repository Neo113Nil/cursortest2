package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes.dex */
public final class zzags implements Supplier {
    public static final zzags zza = new zzags();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzagu());

    @Override // com.google.common.base.Supplier
    /* renamed from: zzaz, reason: merged with bridge method [inline-methods] */
    public final zzagu get() {
        return (zzagu) this.zzb.instance;
    }
}
