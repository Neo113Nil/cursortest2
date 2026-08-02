package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import kotlinx.atomicfu.AtomicFU;

/* loaded from: classes4.dex */
public final class zzd implements zzel {
    public final /* synthetic */ int $r8$classId;
    public static final zzd zza$1 = new zzd(1);
    public static final zzd zza$2 = new zzd(2);
    public static final zzd zza = new zzd(0);
    public static final zzd zza$3 = new zzd(3);
    public static final zzd zza$4 = new zzd(4);

    public /* synthetic */ zzd(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final boolean zza(int i) {
        switch (this.$r8$classId) {
            case 0:
                if (AtomicFU.zza(i) != 0) {
                }
                break;
            case 1:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
            case 2:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                }
                break;
            case 3:
                if (zzg.zza(i) != 0) {
                }
                break;
            default:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
        }
        return true;
    }
}
