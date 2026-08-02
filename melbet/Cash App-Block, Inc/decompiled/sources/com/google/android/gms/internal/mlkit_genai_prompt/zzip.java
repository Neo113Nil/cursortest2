package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzip extends zzih implements Set {
    public transient zzil zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public zzil zzd() {
        zzil zzilVar = this.zza;
        if (zzilVar != null) {
            return zzilVar;
        }
        zzil zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public zzil zzh() {
        Object[] array2 = toArray(zzih.zza);
        zzij zzijVar = zzil.zza;
        return zzil.zzi(array2.length, array2);
    }
}
