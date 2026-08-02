package com.google.android.gms.internal.fido;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzbs implements Serializable {
    public final Object zza;

    public zzbs(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbs) {
            return zzh.m2007zza(this.zza, ((zzbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Suppliers.ofInstance(", this.zza.toString(), ")");
    }
}
