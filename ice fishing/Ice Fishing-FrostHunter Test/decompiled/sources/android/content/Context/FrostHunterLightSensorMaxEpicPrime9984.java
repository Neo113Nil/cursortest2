package android.content.Context;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLightSensorMaxEpicPrime9984 {
    public final FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterServiceEliteCelestialThunder1757;
    public final ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633 = new ArrayList();
    public ByteBuffer[] FrostHunterBundlePulseFusionHero2475 = new ByteBuffer[0];

    public FrostHunterLightSensorMaxEpicPrime9984(FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAlarmManagerHeroTitaniumFusion5758;
        FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218 = FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterServiceEliteCelestialThunder1757 = false;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterRotateAnimationLegendTitanium3412 frostHunterRotateAnimationLegendTitanium3412 = FrostHunterRotateAnimationLegendTitanium3412.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        ArrayList arrayList = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        arrayList.clear();
        this.FrostHunterServiceEliteCelestialThunder1757 = false;
        long j = frostHunterRotateAnimationLegendTitanium3412.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = 0;
        while (true) {
            FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i >= frostHunterAlarmManagerHeroTitaniumFusion5758.size()) {
                break;
            }
            FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336 frostHunterPaintFlagsDrawFilterSparkSpectraMega2336 = (FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) frostHunterAlarmManagerHeroTitaniumFusion5758.get(i);
            frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterCameraXPixelTurboCosmos9814(new FrostHunterRotateAnimationLegendTitanium3412(j));
            if (frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761()) {
                j = frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterLevelListDrawableFusionDragonHero2232(j);
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(j >= 0);
                arrayList.add(frostHunterPaintFlagsDrawFilterSparkSpectraMega2336);
            }
            i++;
        }
        this.FrostHunterBundlePulseFusionHero2475 = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= FrostHunterConstraintSetCloneMasterUltraRogue2633(); i2++) {
            this.FrostHunterBundlePulseFusionHero2475[i2] = ((FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) arrayList.get(i2)).FrostHunterBundlePulseFusionHero2475();
        }
    }

    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterServiceEliteCelestialThunder1757 && ((FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(FrostHunterConstraintSetCloneMasterUltraRogue2633())).FrostHunterConstraintSetCloneMasterUltraRogue2633() && !this.FrostHunterBundlePulseFusionHero2475[FrostHunterConstraintSetCloneMasterUltraRogue2633()].hasRemaining();
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterBundlePulseFusionHero2475.length - 1;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                if (!this.FrostHunterBundlePulseFusionHero2475[i].hasRemaining()) {
                    ArrayList arrayList = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336 frostHunterPaintFlagsDrawFilterSparkSpectraMega2336 = (FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) arrayList.get(i);
                    if (!frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.FrostHunterBundlePulseFusionHero2475[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761;
                        long remaining = byteBuffer2.remaining();
                        frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterLifecycleBlazeGammaElite2889(byteBuffer2);
                        this.FrostHunterBundlePulseFusionHero2475[i] = frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterBundlePulseFusionHero2475();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.FrostHunterBundlePulseFusionHero2475[i].hasRemaining();
                    } else if (!this.FrostHunterBundlePulseFusionHero2475[i].hasRemaining() && i < FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                        ((FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) arrayList.get(i + 1)).FrostHunterServiceEliteCelestialThunder1757();
                    }
                }
                i++;
            }
        }
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757() {
        return !this.FrostHunterConstraintSetCloneMasterUltraRogue2633.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterLightSensorMaxEpicPrime9984)) {
            return false;
        }
        FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = ((FrostHunterLightSensorMaxEpicPrime9984) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion57582 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterAlarmManagerHeroTitaniumFusion57582.size() != frostHunterAlarmManagerHeroTitaniumFusion5758.size()) {
            return false;
        }
        for (int i = 0; i < frostHunterAlarmManagerHeroTitaniumFusion57582.size(); i++) {
            if (frostHunterAlarmManagerHeroTitaniumFusion57582.get(i) != frostHunterAlarmManagerHeroTitaniumFusion5758.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode();
    }
}
