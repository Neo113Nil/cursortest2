package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class zzand {
    public static final zzzx zzb;

    static {
        int i = zzaki.$r8$clinit;
        zzb = new zzzx(11);
    }

    public static void zzd(Object obj, Object obj2) {
        zzals zzalsVar = (zzals) obj;
        zzano zzanoVar = zzalsVar.zzc;
        zzano zzanoVar2 = ((zzals) obj2).zzc;
        zzano zzanoVar3 = zzano.zza;
        if (!zzanoVar3.equals(zzanoVar2)) {
            if (zzanoVar3.equals(zzanoVar)) {
                int i = zzanoVar.zzb + zzanoVar2.zzb;
                int[] copyOf = Arrays.copyOf(zzanoVar.zzc, i);
                System.arraycopy(zzanoVar2.zzc, 0, copyOf, zzanoVar.zzb, zzanoVar2.zzb);
                Object[] copyOf2 = Arrays.copyOf(zzanoVar.zzd, i);
                System.arraycopy(zzanoVar2.zzd, 0, copyOf2, zzanoVar.zzb, zzanoVar2.zzb);
                zzanoVar = new zzano(i, copyOf, copyOf2, true);
            } else {
                zzanoVar.getClass();
                if (!zzanoVar2.equals(zzanoVar3)) {
                    if (!zzanoVar.zze) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int i2 = zzanoVar.zzb + zzanoVar2.zzb;
                    zzanoVar.zzi(i2);
                    System.arraycopy(zzanoVar2.zzc, 0, zzanoVar.zzc, zzanoVar.zzb, zzanoVar2.zzb);
                    System.arraycopy(zzanoVar2.zzd, 0, zzanoVar.zzd, zzanoVar.zzb, zzanoVar2.zzb);
                    zzanoVar.zzb = i2;
                }
            }
        }
        zzalsVar.zzc = zzanoVar;
    }

    public static boolean zze(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
