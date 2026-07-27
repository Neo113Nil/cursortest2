package android.content.Context;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBarcodeScannerLegendPhantomTurbo1194 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ Runnable FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterBarcodeScannerLegendPhantomTurbo1194(Runnable runnable) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.run();
    }
}
