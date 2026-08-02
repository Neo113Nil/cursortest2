package com.google.android.gms.internal.mlkit_vision_barcode;

import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzcv extends zzcn implements Set {
    public transient zzcs zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return CustomizeUtils.zza(this);
    }
}
