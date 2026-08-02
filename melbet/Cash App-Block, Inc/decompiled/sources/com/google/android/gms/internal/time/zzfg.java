package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzabb;
import com.google.android.gms.internal.measurement.zzabc;
import com.google.android.gms.internal.measurement.zzzy;
import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzfg implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractSet zza;
    public int zzb = 0;

    public /* synthetic */ zzfg(AbstractSet abstractSet, int i) {
        this.$r8$classId = i;
        this.zza = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$r8$classId;
        AbstractSet abstractSet = this.zza;
        switch (i) {
            case 0:
                if (this.zzb < ((zzfj) ((zzfh) abstractSet).zza).zzd) {
                    break;
                }
                break;
            case 1:
                zzabb zzabbVar = (zzabb) abstractSet;
                if (this.zzb < zzabbVar.zzc() - zzabbVar.zzb()) {
                    break;
                }
                break;
            case 2:
                if (this.zzb < ((zzzy) ((zzfh) abstractSet).zza).zzd) {
                    break;
                }
                break;
            default:
                zzgp zzgpVar = (zzgp) abstractSet;
                if (this.zzb < zzgpVar.zza() - zzgpVar.zzb()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        AbstractSet abstractSet = this.zza;
        switch (i) {
            case 0:
                zzfj zzfjVar = (zzfj) ((zzfh) abstractSet).zza;
                int[] iArr = zzfjVar.zzc;
                int i2 = this.zzb;
                this.zzb = i2 + 1;
                return zzfjVar.zzi(iArr[i2] & 31);
            case 1:
                int i3 = this.zzb;
                zzabb zzabbVar = (zzabb) abstractSet;
                if (i3 >= zzabbVar.zzc() - zzabbVar.zzb()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                zzabc zzabcVar = zzabbVar.zzb;
                Object obj = zzabcVar.zzb[zzabbVar.zzb() + i3];
                this.zzb = i3 + 1;
                return obj;
            case 2:
                int i4 = this.zzb;
                this.zzb = i4 + 1;
                zzzy zzzyVar = (zzzy) ((zzfh) abstractSet).zza;
                return zzzyVar.zzi(zzzyVar.zzc[i4] & 31);
            default:
                int i5 = this.zzb;
                zzgp zzgpVar = (zzgp) abstractSet;
                if (i5 >= zzgpVar.zza() - zzgpVar.zzb()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Object obj2 = zzgpVar.zzb.zzb[zzgpVar.zzb() + i5];
                this.zzb = i5 + 1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
