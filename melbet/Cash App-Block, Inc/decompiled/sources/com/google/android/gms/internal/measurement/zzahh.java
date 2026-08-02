package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahh implements Supplier {
    public static final zzahh zza = new zzahh();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahj());

    public static void zza() {
    }

    public static boolean zzb() {
        return ((Boolean) zzahj.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahj) this.zzb.instance;
    }
}
