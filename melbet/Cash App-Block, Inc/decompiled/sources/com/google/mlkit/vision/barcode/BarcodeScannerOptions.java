package com.google.mlkit.vision.barcode;

import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class BarcodeScannerOptions {
    public final int zza;
    public final ZoomSuggestionOptions zzd;

    public /* synthetic */ BarcodeScannerOptions(int i, ZoomSuggestionOptions zoomSuggestionOptions) {
        this.zza = i;
        this.zzd = zoomSuggestionOptions;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerOptions)) {
            return false;
        }
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        return this.zza == barcodeScannerOptions.zza && zzae.equal(null, null) && zzae.equal(this.zzd, barcodeScannerOptions.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Boolean.FALSE, null, this.zzd});
    }
}
