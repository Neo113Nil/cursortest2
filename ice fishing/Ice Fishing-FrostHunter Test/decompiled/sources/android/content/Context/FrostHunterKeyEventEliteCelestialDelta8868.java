package android.content.Context;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKeyEventEliteCelestialDelta8868 {
    public static FrostHunterKeyEventEliteCelestialDelta8868 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Executor FrostHunterAlphaAnimationNeoCosmos5761;
    public final Object FrostHunterBundlePulseFusionHero2475;
    public final CopyOnWriteArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterKeyEventEliteCelestialDelta8868(Context context) {
        Executor FrostHunterServiceInfoHyperionSparkMax9966 = FrostHunterPaintCyberPulse5979.FrostHunterServiceInfoHyperionSparkMax9966();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterServiceInfoHyperionSparkMax9966;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new CopyOnWriteArrayList();
        this.FrostHunterBundlePulseFusionHero2475 = new Object();
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
        FrostHunterServiceInfoHyperionSparkMax9966.execute(new androidx.media3.common.util.FrostHunterTransitionManagerOmegaNeoMaster3754(0, context, this));
    }

    public static synchronized FrostHunterKeyEventEliteCelestialDelta8868 FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        FrostHunterKeyEventEliteCelestialDelta8868 frostHunterKeyEventEliteCelestialDelta8868;
        synchronized (FrostHunterKeyEventEliteCelestialDelta8868.class) {
            try {
                if (FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
                    FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterKeyEventEliteCelestialDelta8868(context);
                }
                frostHunterKeyEventEliteCelestialDelta8868 = FrostHunterLevelListDrawableFusionDragonHero2232;
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterKeyEventEliteCelestialDelta8868;
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            FrostHunterIntentServicePulseThunderSpeed7845 frostHunterIntentServicePulseThunderSpeed7845 = (FrostHunterIntentServicePulseThunderSpeed7845) it.next();
            if (frostHunterIntentServicePulseThunderSpeed7845.FrostHunterAlphaAnimationNeoCosmos5761.get() == null) {
                copyOnWriteArrayList.remove(frostHunterIntentServicePulseThunderSpeed7845);
            }
        }
        synchronized (this.FrostHunterBundlePulseFusionHero2475) {
            try {
                if (this.FrostHunterLifecycleBlazeGammaElite2889 && this.FrostHunterServiceEliteCelestialThunder1757 == i) {
                    return;
                }
                this.FrostHunterLifecycleBlazeGammaElite2889 = true;
                this.FrostHunterServiceEliteCelestialThunder1757 = i;
                Iterator it2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.iterator();
                while (it2.hasNext()) {
                    FrostHunterIntentServicePulseThunderSpeed7845 frostHunterIntentServicePulseThunderSpeed78452 = (FrostHunterIntentServicePulseThunderSpeed7845) it2.next();
                    frostHunterIntentServicePulseThunderSpeed78452.FrostHunterConstraintSetCloneMasterUltraRogue2633.execute(new FrostHunterFilterAlphaSparkSpeed9857(19, frostHunterIntentServicePulseThunderSpeed78452));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int i;
        synchronized (this.FrostHunterBundlePulseFusionHero2475) {
            i = this.FrostHunterServiceEliteCelestialThunder1757;
        }
        return i;
    }
}
