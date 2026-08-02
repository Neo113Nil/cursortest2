package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzamz extends AbstractList implements RandomAccess, zzalw {
    public static final Object[] zza;
    public static final zzamz zzb;
    public boolean zza$1;
    public Object[] zzc;
    public int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzamz(objArr, 0, false);
    }

    public zzamz(Object[] objArr, int i, boolean z) {
        this.zza$1 = z;
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzd)) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index:", i, this.zzd, ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i);
            System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
            this.zzc = objArr2;
        }
        this.zzc[i] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzh(i);
        return this.zzc[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        zzh(i);
        Object[] objArr = this.zzc;
        Object obj = objArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        zza();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        zza();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        zzh(i);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zza() {
        if (this.zza$1) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m();
    }

    public final /* bridge */ /* synthetic */ zzamz zzd(int i) {
        if (i >= this.zzd) {
            return new zzamz(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.zzd) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index:", i, this.zzd, ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zza();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            this.zzc = Arrays.copyOf(this.zzc, re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
