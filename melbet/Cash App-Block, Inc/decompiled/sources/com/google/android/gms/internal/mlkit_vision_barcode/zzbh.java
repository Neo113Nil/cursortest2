package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzao;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class zzbh implements Iterator {
    public final /* synthetic */ int $r8$classId = 1;
    public final Iterator zza;
    public Object zzb;
    public final /* synthetic */ Object zzc;

    public zzbh(zzao zzaoVar) {
        this.zzc = zzaoVar;
        Collection collection = zzaoVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                break;
            default:
                zza();
                break;
        }
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Iterator it = this.zza;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.zzb = (Collection) entry.getValue();
                Object key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                zzbw zzbwVar = (zzbw) ((com.google.android.gms.internal.mlkit_vision_face.zzah) this.zzc).zzb;
                zzbwVar.getClass();
                List list = (List) collection;
                return new zzco(key, list instanceof RandomAccess ? new zzbm(zzbwVar, key, list, null) : new zzao(zzbwVar, key, list, (zzao) null));
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.zzb = entry2;
                return entry2.getKey();
            default:
                zza();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$r8$classId;
        Object obj = this.zzc;
        Iterator it = this.zza;
        switch (i) {
            case 0:
                TransactorKt.zzf("no calls to next() since the last call to remove()", ((Collection) this.zzb) != null);
                it.remove();
                ((zzbw) ((com.google.android.gms.internal.mlkit_vision_face.zzah) obj).zzb).zzb -= ((Collection) this.zzb).size();
                ((Collection) this.zzb).clear();
                this.zzb = null;
                break;
            case 1:
                TransactorKt.zzf("no calls to next() since the last call to remove()", ((Map.Entry) this.zzb) != null);
                Collection collection = (Collection) ((Map.Entry) this.zzb).getValue();
                it.remove();
                ((zzbl) obj).zza.zzb -= collection.size();
                collection.clear();
                this.zzb = null;
                break;
            default:
                it.remove();
                zzao zzaoVar = (zzao) obj;
                zzbw zzbwVar = (zzbw) zzaoVar.zze;
                zzbwVar.zzb--;
                zzaoVar.zzc();
                break;
        }
    }

    public void zza() {
        zzao zzaoVar = (zzao) this.zzc;
        zzaoVar.zzb();
        if (zzaoVar.zzb == ((Collection) this.zzb)) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    public zzbh(zzao zzaoVar, ListIterator listIterator) {
        this.zzc = zzaoVar;
        this.zzb = zzaoVar.zzb;
        this.zza = listIterator;
    }

    public zzbh(com.google.android.gms.internal.mlkit_vision_face.zzah zzahVar) {
        this.zzc = zzahVar;
        this.zza = zzahVar.zza.entrySet().iterator();
    }

    public zzbh(zzbl zzblVar, Iterator it) {
        this.zza = it;
        this.zzc = zzblVar;
    }
}
