package android.content.Context;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCoroutinePixelNebulaMaster1626 {
    public final Path FrostHunterAlphaAnimationNeoCosmos5761;
    public float[] FrostHunterBundlePulseFusionHero2475;
    public RectF FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterCoroutinePixelNebulaMaster1626(Path path) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = path;
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster1626, FrostHunterFocusMeteringActionBetaShadowTurbo7112 frostHunterFocusMeteringActionBetaShadowTurbo7112) {
        if (frostHunterCoroutinePixelNebulaMaster1626.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            frostHunterCoroutinePixelNebulaMaster1626.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new RectF();
        }
        RectF rectF = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        rectF.getClass();
        float f = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterAlphaAnimationNeoCosmos5761;
        long j = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterCameraXPixelTurboCosmos9814;
        long j2 = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterRemoteConfigSpeedSpeed8566;
        long j3 = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterLevelListDrawableFusionDragonHero2232;
        long j4 = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterLifecycleBlazeGammaElite2889;
        rectF.set(f, frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterBundlePulseFusionHero2475, frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterServiceEliteCelestialThunder1757);
        if (frostHunterCoroutinePixelNebulaMaster1626.FrostHunterBundlePulseFusionHero2475 == null) {
            frostHunterCoroutinePixelNebulaMaster1626.FrostHunterBundlePulseFusionHero2475 = new float[8];
        }
        float[] fArr = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterBundlePulseFusionHero2475;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterAlphaAnimationNeoCosmos5761;
        RectF rectF2 = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        rectF2.getClass();
        float[] fArr2 = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterBundlePulseFusionHero2475;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final boolean FrostHunterBundlePulseFusionHero2475(FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster1626, FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster16262, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(frostHunterCoroutinePixelNebulaMaster1626 instanceof FrostHunterCoroutinePixelNebulaMaster1626)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = frostHunterCoroutinePixelNebulaMaster1626.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterCoroutinePixelNebulaMaster16262 instanceof FrostHunterCoroutinePixelNebulaMaster1626) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761.op(path, frostHunterCoroutinePixelNebulaMaster16262.FrostHunterAlphaAnimationNeoCosmos5761, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final FrostHunterBarrierThunderHyperion9659 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new RectF();
        }
        RectF rectF = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        rectF.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761.computeBounds(rectF, true);
        return new FrostHunterBarrierThunderHyperion9659(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
