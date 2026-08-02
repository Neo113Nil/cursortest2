package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzaq implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzas zza;
    public int zzb = 0;

    public /* synthetic */ zzaq(zzas zzasVar, int i) {
        this.$r8$classId = i;
        this.zza = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.zzb < this.zza.zza.length()) {
                }
                break;
            default:
                if (this.zzb < this.zza.zza.length()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.$r8$classId;
        zzas zzasVar = this.zza;
        switch (i) {
            case 0:
                String str = zzasVar.zza;
                int i2 = this.zzb;
                if (i2 >= str.length()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this.zzb = i2 + 1;
                    break;
                }
            default:
                String str2 = zzasVar.zza;
                int i3 = this.zzb;
                if (i3 >= str2.length()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this.zzb = i3 + 1;
                    break;
                }
        }
        return null;
    }
}
