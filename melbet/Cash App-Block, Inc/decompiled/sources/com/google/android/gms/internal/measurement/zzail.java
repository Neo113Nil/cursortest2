package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzail implements Supplier {
    public static final zzail zza = new zzail();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzain());

    public static boolean zza() {
        return ((Boolean) zzain.zza.get()).booleanValue();
    }

    public static boolean zzb() {
        return ((Boolean) zzain.zzb.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzain) this.zzb.instance;
    }
}
