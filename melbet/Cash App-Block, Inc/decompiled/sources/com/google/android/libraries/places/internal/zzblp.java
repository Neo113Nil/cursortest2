package com.google.android.libraries.places.internal;

import com.google.android.gms.internal.time.zzfh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class zzblp extends AbstractMap {
    public Object[] zza;
    public int zzb;
    public Map zzc;
    public boolean zzd;
    public volatile zzfh zze;
    public Map zzf;

    public zzblp() {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzm(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzfh(this, 5);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzblp)) {
            return super.equals(obj);
        }
        zzblp zzblpVar = (zzblp) obj;
        int size = size();
        if (size == zzblpVar.size()) {
            int i = this.zzb;
            if (i != zzblpVar.zzb) {
                return entrySet().equals(zzblpVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (zzd(i2).equals(zzblpVar.zzd(i2))) {
                }
            }
            if (i != size) {
                return this.zzc.equals(zzblpVar.zzc);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzm = zzm(comparable);
        return zzm >= 0 ? ((zzblq) this.zza[zzm]).zzc : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.zza[i3].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzm = zzm(comparable);
        if (zzm >= 0) {
            return zzl(zzm);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public final zzblq zzd(int i) {
        if (i < this.zzb) {
            return (zzblq) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set zze() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzm = zzm(comparable);
        if (zzm >= 0) {
            return ((zzblq) this.zza[zzm]).setValue(obj);
        }
        zzn();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i = -(zzm + 1);
        if (i >= 16) {
            return zzo().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzblq zzblqVar = (zzblq) this.zza[15];
            this.zzb = 15;
            zzo().put(zzblqVar.zzb, zzblqVar.zzc);
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.zza[i] = new zzblq(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Object zzl(int i) {
        zzn();
        Object[] objArr = this.zza;
        Object obj = ((zzblq) objArr[i]).zzc;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzo().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zzblq(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return obj;
    }

    public final int zzm(Comparable comparable) {
        int i = this.zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((zzblq) this.zza[i2]).zzb);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((zzblq) this.zza[i4]).zzb);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void zzn() {
        if (this.zzd) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
        }
    }

    public final SortedMap zzo() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }
}
