package com.google.android.libraries.places.internal;

import com.google.android.gms.cloudmessaging.zzv;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzchp extends zzbuq {
    public static final zzclo zzb = new zzclo();
    public final Schema zzc;
    public final String zzd;
    public final zzcgh zze;
    public final String zzf;
    public final zzcho zzg;
    public final zzfv zzh;
    public final zzbor zzi;

    public zzchp(Schema schema, zzbsn zzbsnVar, zzche zzcheVar, zzchy zzchyVar, zzv zzvVar, Object obj, int i, int i2, String str, String str2, zzcgh zzcghVar, zzcgr zzcgrVar, zzbov zzbovVar) {
        super(new zzcih(), zzcghVar, zzcgrVar, zzbsnVar, zzbovVar);
        this.zzh = new zzfv(this, 10);
        this.zze = zzcghVar;
        this.zzc = schema;
        this.zzf = str;
        this.zzd = str2;
        this.zzi = zzchyVar.zzC;
        Object obj2 = schema.mVersion;
        this.zzg = new zzcho(this, i, zzcghVar, obj, zzcheVar, zzvVar, zzchyVar, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbuu
    public final /* synthetic */ zzcho zzp() {
        return this.zzg;
    }
}
