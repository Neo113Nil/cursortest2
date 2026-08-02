package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzfe implements zzfk {
    public static final zzea zza = new zzea(3);
    public final Object zzb;

    public zzfe(int i) {
        switch (i) {
            case 3:
                this.zzb = new ArrayDeque();
                break;
            default:
                zzfu zzfuVar = zzfu.zzb;
                zzfe zzfeVar = new zzfe(zzea.zza, zza);
                Charset charset = zzep.zza;
                this.zzb = zzfeVar;
                break;
        }
    }

    public void zzb(zzdf zzdfVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.zzb;
        if (!zzdfVar.zzh()) {
            if (!(zzdfVar instanceof zzgd)) {
                a$$ExternalSyntheticBUOutline0.m$3("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzdfVar.getClass())));
                return;
            }
            zzgd zzgdVar = (zzgd) zzdfVar;
            zzb(zzgdVar.zzd);
            zzb(zzgdVar.zze);
            return;
        }
        int binarySearch = Arrays.binarySearch(zzgd.zza, zzdfVar.zzd());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int zzc = zzgd.zzc(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((zzdf) arrayDeque.peek()).zzd() >= zzc) {
            arrayDeque.push(zzdfVar);
            return;
        }
        int zzc2 = zzgd.zzc(binarySearch);
        zzdf zzdfVar2 = (zzdf) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((zzdf) arrayDeque.peek()).zzd() < zzc2) {
            zzdfVar2 = new zzgd((zzdf) arrayDeque.pop(), zzdfVar2);
        }
        zzgd zzgdVar2 = new zzgd(zzdfVar2, zzdfVar);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(zzgd.zza, zzgdVar2.zzc);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((zzdf) arrayDeque.peek()).zzd() >= zzgd.zzc(binarySearch2 + 1)) {
                break;
            } else {
                zzgdVar2 = new zzgd((zzdf) arrayDeque.pop(), zzgdVar2);
            }
        }
        arrayDeque.push(zzgdVar2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((zzfk[]) this.zzb)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public void zzq(int i, Object obj, zzge zzgeVar) {
        zzdk zzdkVar = (zzdk) this.zzb;
        zzdkVar.zzr(i, 3);
        zzgeVar.zzi((zzcq) obj, zzdkVar.zza);
        zzdkVar.zzr(i, 4);
    }

    public void zzv(int i, Object obj, zzge zzgeVar) {
        zzcq zzcqVar = (zzcq) obj;
        zzdk zzdkVar = (zzdk) this.zzb;
        zzdkVar.zzt((i << 3) | 2);
        zzdkVar.zzt(zzcqVar.zzB(zzgeVar));
        zzgeVar.zzi(zzcqVar, zzdkVar.zza);
    }

    public zzfe(zzfk... zzfkVarArr) {
        this.zzb = zzfkVarArr;
    }

    public zzfe(zzdk zzdkVar) {
        Charset charset = zzep.zza;
        this.zzb = zzdkVar;
        zzdkVar.zza = this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public zzfw zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzfk zzfkVar = ((zzfk[]) this.zzb)[i];
            if (zzfkVar.zzc(cls)) {
                return zzfkVar.zzb(cls);
            }
        }
        a$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
