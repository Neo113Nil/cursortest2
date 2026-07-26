package android.content.Context;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterWorkManagerMaxTurbo1858 implements FrostHunterAccelerometerInfernoVortexMax5334 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterFlowMaxDragonHero5809;

    public FrostHunterWorkManagerMaxTurbo1858(String str) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        str.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = str;
    }

    public static FrostHunterWorkManagerMaxTurbo1858 FrostHunterBundlePulseFusionHero2475(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        String str;
        frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(2);
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        int i = FrostHunterMeteringPointBetaCyber9571 >> 1;
        int FrostHunterMeteringPointBetaCyber95712 = ((frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() >> 3) & 31) | ((FrostHunterMeteringPointBetaCyber9571 & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(FrostHunterMeteringPointBetaCyber95712 < 10 ? ".0" : ".");
        sb.append(FrostHunterMeteringPointBetaCyber95712);
        return new FrostHunterWorkManagerMaxTurbo1858(sb.toString(), 0);
    }

    public static CharSequence FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(FrostHunterServiceEliteCelestialThunder1757(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.FrostHunterFlowMaxDragonHero5809);
                    sb.append(FrostHunterServiceEliteCelestialThunder1757(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // android.content.Context.FrostHunterAccelerometerInfernoVortexMax5334
    public boolean FrostHunterLifecycleBlazeGammaElite2889(CharSequence charSequence, int i, int i2, FrostHunterSupervisorJobLegendNova9809 frostHunterSupervisorJobLegendNova9809) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.FrostHunterFlowMaxDragonHero5809)) {
            return true;
        }
        frostHunterSupervisorJobLegendNova9809.FrostHunterBundlePulseFusionHero2475 = (frostHunterSupervisorJobLegendNova9809.FrostHunterBundlePulseFusionHero2475 & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 3:
                return "<" + this.FrostHunterFlowMaxDragonHero5809 + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterWorkManagerMaxTurbo1858(String str, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = str;
    }

    @Override // android.content.Context.FrostHunterAccelerometerInfernoVortexMax5334
    public Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this;
    }
}
