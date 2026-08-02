package com.google.android.gms.internal.time;

import com.google.android.gms.internal.measurement.zzjx;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzy;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzfi implements Iterator {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object zza;
    public final Object zzb;
    public int zzc;
    public int zzd;

    public /* synthetic */ zzfi(zzfj zzfjVar, zzdq zzdqVar, int i) {
        this.zza = zzfjVar;
        this.zzb = zzdqVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.zzc >= 0) {
                }
                break;
            default:
                if (this.zzc >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Object obj = this.zzb;
        Object obj2 = this.zza;
        switch (i) {
            case 0:
                zzfj zzfjVar = (zzfj) obj2;
                int i2 = this.zzc;
                zzcw zzcwVar = zzfjVar.zza;
                int zza = zzcwVar.zza();
                Object cast = ((zzdq) obj).zzb.cast(i2 >= zza ? zzfjVar.zzb.zzd(i2 - zza) : zzcwVar.zzd(i2));
                int i3 = this.zzd;
                if (i3 != 0) {
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i3) + 1;
                    this.zzd >>>= numberOfTrailingZeros;
                    this.zzc += numberOfTrailingZeros;
                } else {
                    this.zzc = -1;
                }
                return cast;
            default:
                zzzy zzzyVar = (zzzy) obj2;
                int i4 = this.zzc;
                zzjx zzjxVar = zzzyVar.zza;
                int zza2 = zzjxVar.zza();
                Object cast2 = ((zzyl) obj).zzb.cast(i4 >= zza2 ? zzzyVar.zzb.zzc(i4 - zza2) : zzjxVar.zzc(i4));
                int i5 = this.zzd;
                if (i5 != 0) {
                    int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i5) + 1;
                    this.zzd >>>= numberOfTrailingZeros2;
                    this.zzc += numberOfTrailingZeros2;
                } else {
                    this.zzc = -1;
                }
                return cast2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ zzfi(zzzy zzzyVar, zzyl zzylVar, int i) {
        this.zza = zzzyVar;
        this.zzb = zzylVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
    }
}
