package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahz implements Supplier {
    public static final zzahz zza = new zzahz();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzaib());

    public static boolean zza() {
        return ((Boolean) zzaib.zza.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzaib) this.zzb.instance;
    }
}
