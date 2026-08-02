package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzab;
import com.google.android.gms.internal.mlkit_vision_text_common.zzac;
import com.google.android.gms.internal.mlkit_vision_text_common.zzba;
import com.google.common.collect.AbstractMapBasedMultimap$AsMap$AsMapEntries;
import com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps$CustomListMultimap;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public class zzah extends AbstractMap {
    public final /* synthetic */ int $r8$classId;
    public final transient Map zza;
    public transient AbstractSet zza$1;
    public final /* synthetic */ Serializable zzb;
    public transient AbstractCollection zzc;

    public /* synthetic */ zzah(Serializable serializable, Map map, int i) {
        this.$r8$classId = i;
        this.zzb = serializable;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = this.$r8$classId;
        Serializable serializable = this.zzb;
        Map map = this.zza;
        switch (i) {
            case 0:
                zzas zzasVar = (zzas) serializable;
                zzbd zzbdVar = zzasVar.zza;
                if (map != zzbdVar) {
                    zzag zzagVar = new zzag(this);
                    while (zzagVar.hasNext()) {
                        zzagVar.next();
                        zzagVar.remove();
                    }
                    break;
                } else {
                    Iterator it = zzbdVar.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    zzbdVar.clear();
                    zzasVar.zzb = 0;
                    break;
                }
            case 1:
                zzbw zzbwVar = (zzbw) serializable;
                if (map != zzbwVar.zza) {
                    zzbh zzbhVar = new zzbh(this);
                    while (zzbhVar.hasNext()) {
                        zzbhVar.next();
                        zzbhVar.remove();
                    }
                    break;
                } else {
                    zzbwVar.zzs();
                    break;
                }
            case 2:
                zzba zzbaVar = ((com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable).zza;
                if (map != zzbaVar) {
                    zzac zzacVar = new zzac(this);
                    while (zzacVar.hasNext()) {
                        zzacVar.next();
                        zzacVar.remove();
                    }
                    break;
                } else {
                    Iterator it2 = zzbaVar.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    zzbaVar.clear();
                    break;
                }
            default:
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                if (map != multimaps$CustomListMultimap.map) {
                    zzag zzagVar2 = new zzag(this, (byte) 0);
                    while (zzagVar2.hasNext()) {
                        zzagVar2.next();
                        zzagVar2.remove();
                    }
                    break;
                } else {
                    multimaps$CustomListMultimap.clear();
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.$r8$classId;
        Map map = this.zza;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                map.getClass();
                try {
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            case 2:
                map.getClass();
                try {
                    break;
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
            default:
                map.getClass();
                try {
                    break;
                } catch (ClassCastException | NullPointerException unused4) {
                    return false;
                }
        }
        return map.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.$r8$classId) {
            case 0:
                zzaf zzafVar = (zzaf) this.zza$1;
                if (zzafVar != null) {
                    return zzafVar;
                }
                zzaf zzafVar2 = new zzaf(this);
                this.zza$1 = zzafVar2;
                return zzafVar2;
            case 1:
                zzbg zzbgVar = (zzbg) this.zza$1;
                if (zzbgVar != null) {
                    return zzbgVar;
                }
                zzbg zzbgVar2 = new zzbg(this);
                this.zza$1 = zzbgVar2;
                return zzbgVar2;
            case 2:
                zzab zzabVar = (zzab) this.zza$1;
                if (zzabVar != null) {
                    return zzabVar;
                }
                zzab zzabVar2 = new zzab(this);
                this.zza$1 = zzabVar2;
                return zzabVar2;
            default:
                AbstractMapBasedMultimap$AsMap$AsMapEntries abstractMapBasedMultimap$AsMap$AsMapEntries = (AbstractMapBasedMultimap$AsMap$AsMapEntries) this.zza$1;
                if (abstractMapBasedMultimap$AsMap$AsMapEntries != null) {
                    return abstractMapBasedMultimap$AsMap$AsMapEntries;
                }
                AbstractMapBasedMultimap$AsMap$AsMapEntries abstractMapBasedMultimap$AsMap$AsMapEntries2 = new AbstractMapBasedMultimap$AsMap$AsMapEntries(this);
                this.zza$1 = abstractMapBasedMultimap$AsMap$AsMapEntries2;
                return abstractMapBasedMultimap$AsMap$AsMapEntries2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (this == obj || this.zza.equals(obj)) {
                }
                break;
            case 1:
                if (this == obj || this.zza.equals(obj)) {
                }
                break;
            case 2:
                if (this == obj || this.zza.equals(obj)) {
                }
                break;
            default:
                if (this == obj || this.zza.equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.$r8$classId;
        Serializable serializable = this.zzb;
        Map map = this.zza;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                zzas zzasVar = (zzas) serializable;
                zzasVar.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new zzak(zzasVar, obj, list, null) : new zzao(zzasVar, obj, list, (zzao) null);
            case 1:
                return zza(obj);
            case 2:
                map.getClass();
                try {
                    obj3 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                com.google.android.gms.internal.mlkit_vision_text_common.zzao zzaoVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable;
                zzaoVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new com.google.android.gms.internal.mlkit_vision_text_common.zzag(zzaoVar, obj, list2, null) : new zzao(zzaoVar, obj, list2, (zzao) null);
            default:
                map.getClass();
                try {
                    obj4 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new AbstractMapBasedMultimap$RandomAccessWrappedList(multimaps$CustomListMultimap, obj, list3, null) : new zzao(multimaps$CustomListMultimap, obj, list3, (zzao) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.$r8$classId) {
            case 0:
                return this.zza.hashCode();
            case 1:
                return this.zza.hashCode();
            case 2:
                return this.zza.hashCode();
            default:
                return this.zza.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        int i = this.$r8$classId;
        Serializable serializable = this.zzb;
        switch (i) {
            case 0:
                zzas zzasVar = (zzas) serializable;
                zzaj zzajVar = ((zzar) zzasVar).zza;
                if (zzajVar != null) {
                    return zzajVar;
                }
                zzaj zzajVar2 = new zzaj(zzasVar, zzasVar.zza);
                ((zzar) zzasVar).zza = zzajVar2;
                return zzajVar2;
            case 1:
                return ((zzbw) serializable).zzw();
            case 2:
                com.google.android.gms.internal.mlkit_vision_text_common.zzao zzaoVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable;
                zzab zzabVar = ((com.google.android.gms.internal.mlkit_vision_text_common.zzan) zzaoVar).zza;
                if (zzabVar != null) {
                    return zzabVar;
                }
                zzab zzabVar2 = new zzab(zzaoVar, zzaoVar.zza);
                ((com.google.android.gms.internal.mlkit_vision_text_common.zzan) zzaoVar).zza = zzabVar2;
                return zzabVar2;
            default:
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                Set set = multimaps$CustomListMultimap.keySet;
                if (set != null) {
                    return set;
                }
                Set createKeySet = multimaps$CustomListMultimap.createKeySet();
                multimaps$CustomListMultimap.keySet = createKeySet;
                return createKeySet;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int i = this.$r8$classId;
        Map map = this.zza;
        Serializable serializable = this.zzb;
        switch (i) {
            case 0:
                zzas zzasVar = (zzas) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                zzasVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                zzasVar.zzb -= collection.size();
                collection.clear();
                return arrayList;
            case 1:
                zzbw zzbwVar = (zzbw) serializable;
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                zzbwVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                zzbwVar.zzb -= collection2.size();
                collection2.clear();
                return arrayList2;
            case 2:
                com.google.android.gms.internal.mlkit_vision_text_common.zzao zzaoVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable;
                Collection collection3 = (Collection) map.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                zzaoVar.getClass();
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.addAll(collection3);
                collection3.size();
                collection3.clear();
                return arrayList3;
            default:
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                Collection collection4 = (Collection) map.remove(obj);
                if (collection4 == null) {
                    return null;
                }
                List list = (List) multimaps$CustomListMultimap.factory.get();
                list.addAll(collection4);
                multimaps$CustomListMultimap.totalSize -= collection4.size();
                collection4.clear();
                return list;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.$r8$classId) {
        }
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.$r8$classId) {
        }
        return this.zza.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.$r8$classId) {
            case 0:
                Maps.Values values = (Maps.Values) this.zzc;
                if (values != null) {
                    return values;
                }
                Maps.Values values2 = new Maps.Values((AbstractMap) this, 5);
                this.zzc = values2;
                return values2;
            case 1:
                Maps.Values values3 = (Maps.Values) this.zzc;
                if (values3 != null) {
                    return values3;
                }
                Maps.Values values4 = new Maps.Values((AbstractMap) this, 3);
                this.zzc = values4;
                return values4;
            case 2:
                Maps.Values values5 = (Maps.Values) this.zzc;
                if (values5 != null) {
                    return values5;
                }
                Maps.Values values6 = new Maps.Values((AbstractMap) this, 7);
                this.zzc = values6;
                return values6;
            default:
                Maps.Values values7 = (Maps.Values) this.zzc;
                if (values7 != null) {
                    return values7;
                }
                Maps.Values values8 = new Maps.Values((AbstractMap) this, 0);
                this.zzc = values8;
                return values8;
        }
    }

    public AbstractMap.SimpleImmutableEntry wrapEntry(Map.Entry entry) {
        Object key = entry.getKey();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) this.zzb;
        List list = (List) ((Collection) entry.getValue());
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new AbstractMapBasedMultimap$RandomAccessWrappedList(multimaps$CustomListMultimap, key, list, null) : new zzao(multimaps$CustomListMultimap, key, list, (zzao) null));
    }

    public zzao zza(Object obj) {
        Object obj2;
        Map map = this.zza;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        zzbw zzbwVar = (zzbw) this.zzb;
        zzbwVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new com.google.android.gms.internal.mlkit_vision_barcode.zzbm(zzbwVar, obj, list, null) : new zzao(zzbwVar, obj, list, (zzao) null);
    }
}
