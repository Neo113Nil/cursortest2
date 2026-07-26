package android.content.Context;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRotateDrawableMaxPrime8918 {
    public static final ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633 = new ArrayList(50);
    public final Handler FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterRotateDrawableMaxPrime8918(Handler handler) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = handler;
    }

    public static FrostHunterObjectDetectionNeoBlaze6529 FrostHunterBundlePulseFusionHero2475() {
        FrostHunterObjectDetectionNeoBlaze6529 frostHunterObjectDetectionNeoBlaze6529;
        ArrayList arrayList = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        synchronized (arrayList) {
            try {
                frostHunterObjectDetectionNeoBlaze6529 = arrayList.isEmpty() ? new FrostHunterObjectDetectionNeoBlaze6529() : (FrostHunterObjectDetectionNeoBlaze6529) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterObjectDetectionNeoBlaze6529;
    }

    public final FrostHunterObjectDetectionNeoBlaze6529 FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        FrostHunterObjectDetectionNeoBlaze6529 FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475();
        FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterAlphaAnimationNeoCosmos5761.obtainMessage(i);
        return FrostHunterBundlePulseFusionHero2475;
    }

    public final FrostHunterObjectDetectionNeoBlaze6529 FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, Object obj) {
        FrostHunterObjectDetectionNeoBlaze6529 FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475();
        FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterAlphaAnimationNeoCosmos5761.obtainMessage(i, obj);
        return FrostHunterBundlePulseFusionHero2475;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.sendEmptyMessage(i);
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i != 0);
        this.FrostHunterAlphaAnimationNeoCosmos5761.removeMessages(i);
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(Runnable runnable) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.post(runnable);
    }
}
