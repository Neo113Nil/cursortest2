package android.content.Context;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirestoreEpicSparkTitan3429 {
    public static FrostHunterFirestoreEpicSparkTitan3429 FrostHunterServiceEliteCelestialThunder1757;
    public final WeakHashMap FrostHunterAlphaAnimationNeoCosmos5761 = new WeakHashMap(0);
    public boolean FrostHunterBundlePulseFusionHero2475;
    public TypedValue FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new LinkedHashMap(0, 0.75f, true);
    }

    public final synchronized Drawable FrostHunterAlphaAnimationNeoCosmos5761(Context context, long j) {
        Object obj;
        FrostHunterNavigationSparkTitanDelta2974 frostHunterNavigationSparkTitanDelta2974 = (FrostHunterNavigationSparkTitanDelta2974) this.FrostHunterAlphaAnimationNeoCosmos5761.get(context);
        if (frostHunterNavigationSparkTitanDelta2974 == null) {
            return null;
        }
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809(frostHunterNavigationSparkTitanDelta2974.FrostHunterFlowMaxDragonHero5809, frostHunterNavigationSparkTitanDelta2974.FrostHunterKeyframeGammaGamma1197, j);
        if (FrostHunterFlowMaxDragonHero5809 < 0 || (obj = frostHunterNavigationSparkTitanDelta2974.FrostHunterAlertDialogAuroraDelta3200[FrostHunterFlowMaxDragonHero5809]) == FrostHunterCardViewHyperionAurora3829.FrostHunterAlertDialogAuroraDelta3200) {
            obj = null;
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            frostHunterNavigationSparkTitanDelta2974.FrostHunterBundlePulseFusionHero2475(j);
        }
        return null;
    }

    public final synchronized Drawable FrostHunterBundlePulseFusionHero2475(Context context, int i) {
        Drawable FrostHunterAlphaAnimationNeoCosmos5761;
        try {
            if (!this.FrostHunterBundlePulseFusionHero2475) {
                this.FrostHunterBundlePulseFusionHero2475 = true;
                Drawable FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(context, R.drawable.abc_vector_test);
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null || !"android.graphics.drawable.VectorDrawable".equals(FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass().getName())) {
                    this.FrostHunterBundlePulseFusionHero2475 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new TypedValue();
            }
            context.getResources().getValue(i, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, true);
            FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(context, (r0.assetCookie << 32) | r0.data);
            if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                FrostHunterAlphaAnimationNeoCosmos5761 = null;
            }
            if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                FrostHunterAlphaAnimationNeoCosmos5761 = context.getDrawable(i);
            }
            if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                synchronized (this) {
                }
            }
            if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                int[] iArr = FrostHunterTranslateAnimationTitanCyber9918.FrostHunterAlphaAnimationNeoCosmos5761;
                String name = FrostHunterAlphaAnimationNeoCosmos5761.getClass().getName();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = FrostHunterAlphaAnimationNeoCosmos5761.getState();
                    if (state != null && state.length != 0) {
                        FrostHunterAlphaAnimationNeoCosmos5761.setState(FrostHunterTranslateAnimationTitanCyber9918.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        FrostHunterAlphaAnimationNeoCosmos5761.setState(state);
                    }
                    FrostHunterAlphaAnimationNeoCosmos5761.setState(FrostHunterTranslateAnimationTitanCyber9918.FrostHunterAlphaAnimationNeoCosmos5761);
                    FrostHunterAlphaAnimationNeoCosmos5761.setState(state);
                }
            }
        } finally {
        }
        return FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final synchronized Drawable FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, int i) {
        return FrostHunterBundlePulseFusionHero2475(context, i);
    }
}
