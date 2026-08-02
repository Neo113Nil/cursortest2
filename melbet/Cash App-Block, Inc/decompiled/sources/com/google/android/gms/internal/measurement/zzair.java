package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzair implements Supplier {
    public static final zzair zza = new zzair();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzait());

    public static void zza() {
    }

    public static boolean zzb() {
        return ((Boolean) zzait.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzait) this.zzb.instance;
    }
}
