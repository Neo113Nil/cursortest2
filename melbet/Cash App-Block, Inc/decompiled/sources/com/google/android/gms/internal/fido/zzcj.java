package com.google.android.gms.internal.fido;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.viewpager.widget.ViewPager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class zzcj extends zzcd implements NavigableMap {
    public static final zzcj zzc;
    public final transient zzcv zzd;
    public final transient zzcc zze;
    public final transient zzcj zzf;

    static {
        zzcv zzs = zzck.zzs(zzcq.zza);
        zzbz zzbzVar = zzcc.zza;
        zzc = new zzcj(zzs, zzct.zza, null);
    }

    public zzcj(zzcv zzcvVar, zzcc zzccVar, zzcj zzcjVar) {
        this.zzd = zzcvVar;
        this.zze = zzccVar;
        this.zzf = zzcjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzcj zzf(TreeMap treeMap) {
        zzcq zzcqVar = zzcq.zza;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        int i2 = 0;
        boolean z = comparator == null || zzcqVar == comparator;
        Set entrySet = treeMap.entrySet();
        if (!(entrySet instanceof Collection)) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(zzcd.zza);
        int length = entryArr.length;
        if (length == 0) {
            return zzg(zzcqVar);
        }
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr[i3] == null) {
                    a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "at index "));
                    return null;
                }
            }
            zzcv zzcvVar = new zzcv(zzcc.zzh(1, objArr), zzcqVar);
            Object[] objArr2 = {value};
            while (i2 < 1) {
                if (objArr2[i2] == null) {
                    a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "at index "));
                    return null;
                }
                i2++;
            }
            return new zzcj(zzcvVar, zzcc.zzh(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (z) {
            while (i2 < length) {
                Map.Entry entry2 = entryArr[i2];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                zzh.zza(key2, value2);
                objArr3[i2] = key2;
                objArr4[i2] = value2;
                i2++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new ViewPager.AnonymousClass1(25));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            zzh.zza(objArr3[0], value3);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                zzh.zza(key4, value4);
                objArr3[i] = key4;
                objArr4[i] = value4;
                if (zzcqVar.compare(key3, key4) == 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(CameraSelector$$ExternalSyntheticOutline0.m("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                    return null;
                }
                i++;
                key3 = key4;
            }
        }
        return new zzcj(new zzcv(zzcc.zzh(length, objArr3), zzcqVar), zzcc.zzh(length, objArr4), null);
    }

    public static zzcj zzg(Comparator comparator) {
        if (zzcq.zza == comparator) {
            return zzc;
        }
        zzcv zzs = zzck.zzs(comparator);
        zzbz zzbzVar = zzcc.zza;
        return new zzcj(zzs, zzct.zza, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzck) this.zzd).zza;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.zzd.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzcj zzcjVar = this.zzf;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        boolean isEmpty = isEmpty();
        zzcv zzcvVar = this.zzd;
        if (!isEmpty) {
            return new zzcj((zzcv) zzcvVar.descendingSet(), this.zze.zzf(), this);
        }
        Comparator comparator = ((zzck) zzcvVar).zza;
        return zzg((comparator instanceof zzcs ? (zzcs) comparator : new zzbw(comparator)).zza());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.zzd.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        zzcv zzcvVar = this.zzd;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(zzcvVar.zzd, obj, ((zzck) zzcvVar).zza);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.zze.get(binarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.zzd;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(this.zze.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.zzd.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.zzd;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zze.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.zze;
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzcj headMap(Object obj, boolean z) {
        obj.getClass();
        return zzl(0, this.zzd.zzu(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzcj subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (((zzck) this.zzd).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        a$$ExternalSyntheticBUOutline0.m$3(zzh.zza("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcj tailMap(Object obj, boolean z) {
        obj.getClass();
        return zzl(this.zzd.zzv(obj, z), this.zze.size());
    }

    public final zzcj zzl(int i, int i2) {
        zzcc zzccVar = this.zze;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        zzcv zzcvVar = this.zzd;
        return i == i2 ? zzg(((zzck) zzcvVar).zza) : new zzcj(zzcvVar.zzw(i, i2), zzccVar.subList(i, i2), null);
    }
}
