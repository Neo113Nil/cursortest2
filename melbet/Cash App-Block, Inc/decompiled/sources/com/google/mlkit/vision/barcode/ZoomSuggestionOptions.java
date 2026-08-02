package com.google.mlkit.vision.barcode;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.pos.LocalPosCheckInViewKt$$ExternalSyntheticLambda5;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ZoomSuggestionOptions {
    public final LocalPosCheckInViewKt$$ExternalSyntheticLambda5 zza;

    public /* synthetic */ ZoomSuggestionOptions(LocalPosCheckInViewKt$$ExternalSyntheticLambda5 localPosCheckInViewKt$$ExternalSyntheticLambda5) {
        this.zza = localPosCheckInViewKt$$ExternalSyntheticLambda5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ZoomSuggestionOptions) && zzae.equal(this.zza, ((ZoomSuggestionOptions) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Float.valueOf(RecyclerView.DECELERATION_RATE)});
    }
}
