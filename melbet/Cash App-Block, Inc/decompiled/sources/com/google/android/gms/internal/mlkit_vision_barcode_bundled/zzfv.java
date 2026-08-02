package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzfv extends zzcs implements RandomAccess {
    public static final zzfv zza = new zzfv(new Object[0], 0, false);
    public Object[] zzb;
    public int zzc;

    public zzfv(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index:", i, this.zzc, ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.zzb;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Boxes$$ExternalSyntheticOutline1.m$2(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.zzb, i, objArr2, i3, this.zzc - i);
            this.zzb = objArr2;
        }
        this.zzb[i] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzg$1(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        zzg$1(i);
        Object[] objArr = this.zzb;
        Object obj = objArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        zzg$1(i);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i) {
        if (i >= this.zzc) {
            return new zzfv(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public final void zzg$1(int i) {
        if (i < 0 || i >= this.zzc) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index:", i, this.zzc, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.zzc;
        Object[] objArr = this.zzb;
        if (i == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
