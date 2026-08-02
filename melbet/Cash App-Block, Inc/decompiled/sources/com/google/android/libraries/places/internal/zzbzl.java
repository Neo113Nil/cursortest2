package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzbzl {
    public final Set zza = Collections.newSetFromMap(new IdentityHashMap());

    public final void zza(Object obj, boolean z) {
        Set set = this.zza;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                zzd();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zze();
        }
    }

    public abstract void zzd();

    public abstract void zze();
}
