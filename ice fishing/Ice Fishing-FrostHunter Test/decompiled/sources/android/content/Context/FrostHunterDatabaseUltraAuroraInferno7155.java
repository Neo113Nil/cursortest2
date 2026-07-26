package android.content.Context;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDatabaseUltraAuroraInferno7155 extends FrostHunterSoundPoolThunderTurboNeo7086 {
    public final List FrostHunterCameraXTurboCelestialHero5430;
    public final long FrostHunterResourcesTitanHyperVision5823;
    public final float FrostHunterTextViewDragonStormMega4297;

    public FrostHunterDatabaseUltraAuroraInferno7155(List list, long j, float f) {
        this.FrostHunterCameraXTurboCelestialHero5430 = list;
        this.FrostHunterResourcesTitanHyperVision5823 = j;
        this.FrostHunterTextViewDragonStormMega4297 = f;
    }

    @Override // android.content.Context.FrostHunterSoundPoolThunderTurboNeo7086
    public final Shader FrostHunterNestedScrollViewPixelPhantom8605(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.FrostHunterResourcesTitanHyperVision5823;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long FrostHunterFlowMaxDragonHero5809 = FrostHunterDisplayMetricsTurboMax7649.FrostHunterFlowMaxDragonHero5809(j);
            intBitsToFloat = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero5809 >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero5809 & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.FrostHunterTextViewDragonStormMega4297;
        if (f == Float.POSITIVE_INFINITY) {
            f = FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterBundlePulseFusionHero2475(j) / 2.0f;
        }
        float f2 = f;
        List list = this.FrostHunterCameraXTurboCelestialHero5430;
        FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPreviewBlazeAurora1020(list);
        int FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterLooperThreadBetaHyperionMax1000(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, FrostHunterRemoteConfigPhantomDelta1739.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterLooperThreadBetaHyperionMax1000, list), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterStateCelestialNovaPixel8414(FrostHunterLooperThreadBetaHyperionMax1000, list), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterDatabaseUltraAuroraInferno7155)) {
            return false;
        }
        FrostHunterDatabaseUltraAuroraInferno7155 frostHunterDatabaseUltraAuroraInferno7155 = (FrostHunterDatabaseUltraAuroraInferno7155) obj;
        return this.FrostHunterCameraXTurboCelestialHero5430.equals(frostHunterDatabaseUltraAuroraInferno7155.FrostHunterCameraXTurboCelestialHero5430) && FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterResourcesTitanHyperVision5823, frostHunterDatabaseUltraAuroraInferno7155.FrostHunterResourcesTitanHyperVision5823) && this.FrostHunterTextViewDragonStormMega4297 == frostHunterDatabaseUltraAuroraInferno7155.FrostHunterTextViewDragonStormMega4297;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterTextViewDragonStormMega4297, FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterCameraXTurboCelestialHero5430.hashCode() * 961, 31, this.FrostHunterResourcesTitanHyperVision5823), 31);
    }

    public final String toString() {
        String str;
        long j = this.FrostHunterResourcesTitanHyperVision5823;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterRemoteConfigSpeedSpeed8566(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.FrostHunterTextViewDragonStormMega4297;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.FrostHunterCameraXTurboCelestialHero5430 + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
