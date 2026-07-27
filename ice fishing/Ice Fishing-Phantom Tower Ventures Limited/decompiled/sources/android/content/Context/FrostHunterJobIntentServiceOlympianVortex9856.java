package android.content.Context;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterJobIntentServiceOlympianVortex9856 {
    public static final Object[] FrostHunterAlphaAnimationNeoCosmos5761(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, i, 6, objArr, objArr2);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] FrostHunterBundlePulseFusionHero2475(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, i, 6, objArr, objArr2);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final boolean FrostHunterCameraXPixelTurboCosmos9814(FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster1626, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        FrostHunterCoroutinePixelNebulaMaster1626 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterCanvasNebulaSpectra7875.FrostHunterAlphaAnimationNeoCosmos5761();
        Path path = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            FrostHunterCanvasNebulaSpectra7875.FrostHunterConstraintSetCloneMasterUltraRogue2633("Invalid rectangle, make sure no value is NaN");
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new RectF();
        }
        RectF rectF = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        FrostHunterCoroutinePixelNebulaMaster1626 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterCanvasNebulaSpectra7875.FrostHunterAlphaAnimationNeoCosmos5761();
        Path path2 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterBundlePulseFusionHero2475(frostHunterCoroutinePixelNebulaMaster1626, FrostHunterAlphaAnimationNeoCosmos5761, 1);
        boolean isEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !isEmpty;
    }

    public static final Object[] FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, i, 6, objArr, objArr2);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final boolean FrostHunterFlowMaxDragonHero5809(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final int FrostHunterRemoteConfigSpeedSpeed8566(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static void FrostHunterServiceEliteCelestialThunder1757(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public abstract int FrostHunterLevelListDrawableFusionDragonHero2232(String str, byte[] bArr, int i, int i2);

    public abstract String FrostHunterLifecycleBlazeGammaElite2889(byte[] bArr, int i, int i2);
}
