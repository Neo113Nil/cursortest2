package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzhbv implements Iterator {
    private final ArrayDeque zza;
    private zzgyg zzb;

    /* synthetic */ zzhbv(zzgyl zzgylVar, zzhbu zzhbuVar) {
        if (!(zzgylVar instanceof zzhbx)) {
            this.zza = null;
            this.zzb = (zzgyg) zzgylVar;
            return;
        }
        zzhbx zzhbxVar = (zzhbx) zzgylVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhbxVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhbxVar);
        this.zzb = zzb(zzhbxVar.zzd);
    }

    private final zzgyg zzb(zzgyl zzgylVar) {
        while (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            this.zza.push(zzhbxVar);
            zzgylVar = zzhbxVar.zzd;
        }
        return (zzgyg) zzgylVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgyg next() {
        zzgyg zzgygVar;
        zzgyg zzgygVar2 = this.zzb;
        if (zzgygVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgygVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgygVar = zzb(((zzhbx) this.zza.pop()).zze);
        } while (zzgygVar.zzd() == 0);
        this.zzb = zzgygVar;
        return zzgygVar2;
    }
}
