package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahq implements Supplier {
    public static final zzahq zza = new zzahq();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahs());

    public static boolean zza() {
        return ((Boolean) zzahs.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahs) this.zzb.instance;
    }
}
