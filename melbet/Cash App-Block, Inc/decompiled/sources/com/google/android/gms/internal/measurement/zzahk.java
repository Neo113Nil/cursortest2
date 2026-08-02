package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahk implements Supplier {
    public static final zzahk zza = new zzahk();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahm());

    public static void zza() {
    }

    public static boolean zzb() {
        return ((Boolean) zzahm.zza.get()).booleanValue();
    }

    public static boolean zzc() {
        return ((Boolean) zzahm.zzb.get()).booleanValue();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahm) this.zzb.instance;
    }
}
