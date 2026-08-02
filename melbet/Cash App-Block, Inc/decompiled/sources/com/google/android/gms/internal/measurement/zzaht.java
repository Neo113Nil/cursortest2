package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzaht implements Supplier {
    public static final zzaht zza = new zzaht();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahv());

    public static boolean zza() {
        return ((Boolean) zzahv.zza.get()).booleanValue();
    }

    public static boolean zzb() {
        return ((Boolean) zzahv.zzb.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahv) this.zzb.instance;
    }
}
