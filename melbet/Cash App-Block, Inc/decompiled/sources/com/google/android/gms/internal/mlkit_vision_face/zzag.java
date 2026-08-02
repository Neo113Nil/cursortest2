package com.google.android.gms.internal.mlkit_vision_face;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.AbstractMapBasedMultimap$KeySet;
import com.google.common.collect.Multimaps$CustomListMultimap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class zzag implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public final Iterator zza;
    public Object zzb;
    public final /* synthetic */ Object zzc;

    public zzag(zzao zzaoVar) {
        this.$r8$classId = 2;
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
            case 2:
                zza();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                validateIterator();
                break;
        }
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Object obj = this.zzc;
        Iterator it = this.zza;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.zzb = (Collection) entry.getValue();
                Object key = entry.getKey();
                zzas zzasVar = (zzas) ((zzah) obj).zzb;
                Collection collection = (Collection) entry.getValue();
                zzasVar.getClass();
                List list = (List) collection;
                return new zzbj(key, list instanceof RandomAccess ? new zzak(zzasVar, key, list, null) : new zzao(zzasVar, key, list, (zzao) null));
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.zzb = entry2;
                return entry2.getKey();
            case 2:
                zza();
                return it.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.zzb = (Collection) entry3.getValue();
                return ((zzah) obj).wrapEntry(entry3);
            case 4:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.zzb = entry4;
                return entry4.getKey();
            default:
                validateIterator();
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
                if (!(((Collection) this.zzb) != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
                    break;
                } else {
                    it.remove();
                    ((zzas) ((zzah) obj).zzb).zzb -= ((Collection) this.zzb).size();
                    ((Collection) this.zzb).clear();
                    this.zzb = null;
                    break;
                }
            case 1:
                Map.Entry entry = (Map.Entry) this.zzb;
                if (!(entry != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
                    break;
                } else {
                    Collection collection = (Collection) entry.getValue();
                    it.remove();
                    ((zzaj) obj).zza.zzb -= collection.size();
                    collection.clear();
                    this.zzb = null;
                    break;
                }
            case 2:
                it.remove();
                zzao zzaoVar = (zzao) obj;
                zzas zzasVar = (zzas) zzaoVar.zze;
                zzasVar.zzb--;
                zzaoVar.zzc();
                break;
            case 3:
                Trace.checkState("no calls to next() since the last call to remove()", ((Collection) this.zzb) != null);
                it.remove();
                ((Multimaps$CustomListMultimap) ((zzah) obj).zzb).totalSize -= ((Collection) this.zzb).size();
                ((Collection) this.zzb).clear();
                this.zzb = null;
                break;
            case 4:
                Trace.checkState("no calls to next() since the last call to remove()", ((Map.Entry) this.zzb) != null);
                Collection collection2 = (Collection) ((Map.Entry) this.zzb).getValue();
                it.remove();
                ((AbstractMapBasedMultimap$KeySet) obj).this$0.totalSize -= collection2.size();
                collection2.clear();
                this.zzb = null;
                break;
            default:
                it.remove();
                zzao zzaoVar2 = (zzao) obj;
                ((Multimaps$CustomListMultimap) zzaoVar2.zze).totalSize--;
                zzaoVar2.removeIfEmpty();
                break;
        }
    }

    public void validateIterator() {
        zzao zzaoVar = (zzao) this.zzc;
        zzaoVar.refreshIfEmpty();
        if (zzaoVar.zzb == ((Collection) this.zzb)) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    public void zza() {
        zzao zzaoVar = (zzao) this.zzc;
        zzaoVar.zzb();
        if (zzaoVar.zzb == ((Collection) this.zzb)) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    public /* synthetic */ zzag(AbstractSet abstractSet, Iterator it, int i) {
        this.$r8$classId = i;
        this.zzc = abstractSet;
        this.zza = it;
    }

    public zzag(zzah zzahVar) {
        this.$r8$classId = 0;
        this.zzc = zzahVar;
        this.zza = zzahVar.zza.entrySet().iterator();
    }

    public zzag(zzao zzaoVar, ListIterator listIterator) {
        this.$r8$classId = 2;
        this.zzc = zzaoVar;
        this.zzb = zzaoVar.zzb;
        this.zza = listIterator;
    }

    public zzag(zzao zzaoVar, byte b) {
        Iterator it;
        this.$r8$classId = 5;
        this.zzc = zzaoVar;
        Collection collection = zzaoVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    public zzag(zzao zzaoVar, ListIterator listIterator, byte b) {
        this.$r8$classId = 5;
        this.zzc = zzaoVar;
        this.zzb = zzaoVar.zzb;
        this.zza = listIterator;
    }

    public zzag(zzah zzahVar, byte b) {
        this.$r8$classId = 3;
        this.zzc = zzahVar;
        this.zza = zzahVar.zza.entrySet().iterator();
    }
}
