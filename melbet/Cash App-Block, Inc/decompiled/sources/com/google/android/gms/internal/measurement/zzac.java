package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzac implements Iterator {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ Iterator zzb;

    public zzac(zzae zzaeVar, Iterator it, Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza.hasNext()) {
            return true;
        }
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.zza;
        if (it.hasNext()) {
            return new zzas(((Integer) it.next()).toString());
        }
        Iterator it2 = this.zzb;
        if (it2.hasNext()) {
            return new zzas((String) it2.next());
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
