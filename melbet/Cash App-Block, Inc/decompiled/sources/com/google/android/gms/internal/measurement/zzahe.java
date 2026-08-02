package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;

/* loaded from: classes4.dex */
public final class zzahe implements Supplier {
    public static final zzahe zza = new zzahe();
    public final Suppliers$SupplierOfInstance zzb = new Suppliers$SupplierOfInstance(new zzahg());

    public static String zza() {
        return (String) zzahg.zza.get();
    }

    public static String zzb() {
        return (String) zzahg.zzb.get();
    }

    public static String zzc() {
        return (String) zzahg.zzc.get();
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return (zzahg) this.zzb.instance;
    }
}
