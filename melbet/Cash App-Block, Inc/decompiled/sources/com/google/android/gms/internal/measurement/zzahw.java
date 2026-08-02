package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahw implements Supplier {
    public static final zzahw zza = new zzahw();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahy());

    public static boolean zza() {
        return ((Boolean) zzahy.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahy) this.zzb.instance;
    }
}
