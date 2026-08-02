package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzbjl implements Cloneable {
    public zzbjr zza;
    public final zzbjr zzb;

    public zzbjl(zzbjr zzbjrVar) {
        this.zzb = zzbjrVar;
        if (zzbjrVar.zzbv()) {
            a$$ExternalSyntheticBUOutline0.m$3("Default instance must be immutable.");
            throw null;
        }
        this.zza = (zzbjr) zzbjrVar.zzb(4, null);
    }

    public static void zza(int i, List list) {
        int size = list.size() - i;
        String m = re$$ExternalSyntheticOutline0.m(size, "Element at index ", " is null.", new StringBuilder(String.valueOf(size).length() + 26));
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(m);
            }
            list.remove(size2);
        }
    }

    public final Object clone() {
        zzbjl zzbjlVar = (zzbjl) this.zzb.zzb(5, null);
        zzbjlVar.zza = zzC();
        return zzbjlVar;
    }

    public zzbjr zzC() {
        boolean zzbv = this.zza.zzbv();
        zzbjr zzbjrVar = this.zza;
        if (!zzbv) {
            return zzbjrVar;
        }
        zzbjrVar.getClass();
        zzblj.zza.zzb(zzbjrVar.getClass()).zzh(zzbjrVar);
        zzbjrVar.zzbw();
        return this.zza;
    }

    public final zzbjr zzD() {
        zzbjr zzC = zzC();
        zzC.getClass();
        if (zzbjr.zze(zzC, true)) {
            return zzC;
        }
        throw new zzbly();
    }

    public /* bridge */ zzbhz zzF() {
        return zzC();
    }

    public final void zzy() {
        if (this.zza.zzbv()) {
            return;
        }
        zzz();
    }

    public void zzz() {
        zzbjr zzbjrVar = (zzbjr) this.zzb.zzb(4, null);
        zzblj.zza.zzb(zzbjrVar.getClass()).zzd(zzbjrVar, this.zza);
        this.zza = zzbjrVar;
    }
}
