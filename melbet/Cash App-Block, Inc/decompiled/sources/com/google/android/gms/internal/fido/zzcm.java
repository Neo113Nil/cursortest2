package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcm extends zzdc {
    public static final Object zza = new Object();
    public Object zzb;

    public zzcm(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.zzb;
        Object obj2 = zza;
        if (obj != obj2) {
            this.zzb = obj2;
            return obj;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
