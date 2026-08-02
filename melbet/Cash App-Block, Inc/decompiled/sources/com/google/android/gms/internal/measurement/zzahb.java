package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahb implements Supplier {
    public static final zzahb zza = new zzahb();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahd());

    public static boolean zza() {
        return ((Boolean) zzahd.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahd) this.zzb.instance;
    }
}
