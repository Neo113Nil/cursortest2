package com.google.android.gms.internal.mlkit_vision_text_common;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzah;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class zzac implements Iterator {
    public final /* synthetic */ int $r8$classId = 0;
    public final Iterator zza;
    public Collection zzb;
    public final /* synthetic */ Object zzc;

    public zzac(com.google.android.gms.internal.mlkit_vision_face.zzao zzaoVar) {
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
                zzao zzaoVar = (zzao) ((zzah) this.zzc).zzb;
                zzaoVar.getClass();
                List list = (List) collection;
                return new zzbg(key, list instanceof RandomAccess ? new zzag(zzaoVar, key, list, null) : new com.google.android.gms.internal.mlkit_vision_face.zzao(zzaoVar, key, list, (com.google.android.gms.internal.mlkit_vision_face.zzao) null));
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
                if (!(this.zzb != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
                    break;
                } else {
                    it.remove();
                    ((zzao) ((zzah) obj).zzb).getClass();
                    this.zzb.size();
                    this.zzb.clear();
                    this.zzb = null;
                    break;
                }
            default:
                it.remove();
                ((com.google.android.gms.internal.mlkit_vision_face.zzao) obj).zzc();
                break;
        }
    }

    public void zza() {
        com.google.android.gms.internal.mlkit_vision_face.zzao zzaoVar = (com.google.android.gms.internal.mlkit_vision_face.zzao) this.zzc;
        zzaoVar.zzb();
        if (zzaoVar.zzb == this.zzb) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    public zzac(zzah zzahVar) {
        this.zzc = zzahVar;
        this.zza = zzahVar.zza.entrySet().iterator();
    }

    public zzac(com.google.android.gms.internal.mlkit_vision_face.zzao zzaoVar, ListIterator listIterator) {
        this.zzc = zzaoVar;
        this.zzb = zzaoVar.zzb;
        this.zza = listIterator;
    }
}
