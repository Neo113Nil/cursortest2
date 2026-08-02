package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzad implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public Iterable zza;
    public int zzb;

    public zzad(zzae zzaeVar) {
        this.$r8$classId = 0;
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.zzb < ((zzae) this.zza).zzh()) {
                    break;
                }
                break;
            default:
                if (this.zzb < ((CLObject) this.zza).mElements.size()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                zzae zzaeVar = (zzae) this.zza;
                int i = this.zzb;
                int zzh = zzaeVar.zzh();
                int i2 = this.zzb;
                if (i < zzh) {
                    this.zzb = i2 + 1;
                    return zzaeVar.zzl(i2);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                return null;
            default:
                CLKey cLKey = (CLKey) ((CLObject) this.zza).mElements.get(this.zzb);
                this.zzb++;
                return cLKey;
        }
    }
}
