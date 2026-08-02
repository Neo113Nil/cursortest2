package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzaii implements Supplier {
    public static final zzaii zza = new zzaii();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaik());

    public static boolean zza() {
        return ((Boolean) zzaik.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaik) this.zzb.instance;
    }
}
