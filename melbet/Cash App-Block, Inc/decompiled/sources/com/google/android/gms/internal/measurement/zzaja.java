package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzaja implements Supplier {
    public static final zzaja zza = new zzaja();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzajc());

    public static void zza() {
    }

    public static boolean zzb() {
        return ((Boolean) zzajc.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzajc) this.zzb.instance;
    }
}
