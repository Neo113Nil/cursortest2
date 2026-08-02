package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zzb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzhg extends zzhp {
    public final zzcc zza;
    public final int zzb;

    public zzhg(zzct zzctVar) {
        zzctVar.getClass();
        this.zza = zzctVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            zzcc zzccVar = this.zza;
            if (i >= zzccVar.size()) {
                break;
            }
            int zzb = ((zzhp) zzccVar.get(i)).zzb();
            if (i2 < zzb) {
                i2 = zzb;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.zzb = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int zzd = zzhp.zzd(Byte.MIN_VALUE);
        if (zzd != zza) {
            return zzd - zzhpVar.zza();
        }
        zzcc zzccVar = ((zzhg) zzhpVar).zza;
        zzcc zzccVar2 = this.zza;
        if (zzccVar2.size() != zzccVar.size()) {
            return zzccVar2.size() - zzccVar.size();
        }
        for (int i = 0; i < zzccVar2.size(); i++) {
            int compareTo = ((zzhp) zzccVar2.get(i)).compareTo((zzhp) zzccVar.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.zza.equals(((zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(Byte.MIN_VALUE)), this.zza});
    }

    public final String toString() {
        zzcc zzccVar = this.zza;
        if (zzccVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = zzccVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((zzhp) zzccVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzb.zzd(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(zzb.zzd(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd(Byte.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zzb() {
        return this.zzb;
    }
}
