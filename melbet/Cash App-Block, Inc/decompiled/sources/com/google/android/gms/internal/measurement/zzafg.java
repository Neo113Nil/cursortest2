package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.squareup.moshi.LinkedHashTreeMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzafg implements zzafp {
    public final zzacb zza;
    public final zztw zzb;

    public zzafg(zztw zztwVar, zzacb zzacbVar) {
        zztw zztwVar2 = zzadi.zza;
        this.zzb = zztwVar;
        this.zza = zzacbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final zzadu zza() {
        zzacb zzacbVar = this.zza;
        if (zzacbVar instanceof zzadu) {
            return ((zzadu) zzacbVar).zzck();
        }
        zzadp zzadpVar = (zzadp) ((zzadu) zzacbVar).zzg(5);
        boolean zzch = zzadpVar.zza.zzch();
        zzadu zzaduVar = zzadpVar.zza;
        if (!zzch) {
            return zzaduVar;
        }
        zzaduVar.getClass();
        zzafl.zza().zzb(zzaduVar.getClass()).zzk(zzaduVar);
        zzaduVar.zzci();
        return zzadpVar.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzb(zzadu zzaduVar, zzadu zzaduVar2) {
        return zzaduVar.zzc.equals(zzaduVar2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zzc(zzadu zzaduVar) {
        return zzaduVar.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzd(Object obj, Object obj2) {
        zzafq.zzE(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zze(zzacb zzacbVar) {
        zzaga zzagaVar = ((zzadu) zzacbVar).zzc;
        int i = zzagaVar.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < zzagaVar.zzb; i3++) {
            int i4 = zzagaVar.zzc[i3] >>> 3;
            zzacr zzacrVar = (zzacr) zzagaVar.zzd[i3];
            int zzE = zzada.zzE(8);
            int zzE2 = zzada.zzE(i4) + zzada.zzE(16);
            int zzE3 = zzada.zzE(24);
            int zzb = zzacrVar.zzb();
            i2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(zzE + zzE, zzE2, FillrEnv$EnumUnboxingLocalUtility.m(zzb, zzb, zzE3), i2);
        }
        zzagaVar.zze = i2;
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzf(Object obj, zzj zzjVar) {
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzg(Object obj, LinkedHashTreeMap.AvlBuilder avlBuilder, zzadf zzadfVar) {
        this.zzb.getClass();
        zztw.zzh(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzacg zzacgVar) {
        zzadu zzaduVar = (zzadu) obj;
        if (zzaduVar.zzc == zzaga.zza) {
            zzaduVar.zzc = zzaga.zzb();
        }
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzk(Object obj) {
        this.zzb.getClass();
        zzaga zzagaVar = ((zzadu) obj).zzc;
        if (zzagaVar.zzf) {
            zzagaVar.zzf = false;
        }
        zztw zztwVar = zzadi.zza;
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }
}
