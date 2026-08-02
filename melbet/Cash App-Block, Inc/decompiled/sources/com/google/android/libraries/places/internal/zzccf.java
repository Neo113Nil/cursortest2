package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzccf extends zzbsd {
    public static final ReferenceQueue zza = new ReferenceQueue();
    public static final ConcurrentHashMap zzb = new ConcurrentHashMap();
    public static final Logger zzc = Logger.getLogger(zzccf.class.getName());
    public final zzcby zza$1;

    public zzccf(zzcby zzcbyVar) {
        this.zza$1 = zzcbyVar;
        new zzcce(this, zzcbyVar, zza, zzb);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza$1, "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final zzbpa zza(Schema schema, zzbov zzbovVar) {
        return this.zza$1.zzA.zza(schema, zzbovVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final String zzb() {
        return this.zza$1.zzA.zzb();
    }
}
