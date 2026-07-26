package android.content.Context;

import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSupervisorJobForceCosmosShadow4412 implements Iterator {
    public final CharSequence FrostHunterAlertDialogAuroraDelta3200;
    public String FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterOnDeviceTranslatorTitanSpectraAlpha7216 FrostHunterKeyframeGammaGamma1197;
    public final /* synthetic */ FrostHunterAnimatorQuantumFusionMaster8565 FrostHunterLightSensorForceFusion4241;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public int FrostHunterCameraXPixelTurboCosmos9814 = 2;
    public int FrostHunterFragmentBetaMegaVortex6025 = 0;

    public FrostHunterSupervisorJobForceCosmosShadow4412(FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565, FrostHunterActivityInfoMaxOlympian4796 frostHunterActivityInfoMaxOlympian4796, CharSequence charSequence) {
        this.FrostHunterLightSensorForceFusion4241 = frostHunterAnimatorQuantumFusionMaster8565;
        this.FrostHunterKeyframeGammaGamma1197 = (FrostHunterOnDeviceTranslatorTitanSpectraAlpha7216) frostHunterActivityInfoMaxOlympian4796.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterActivityInfoMaxOlympian4796.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterAlertDialogAuroraDelta3200 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        FrostHunterOnDeviceTranslatorTitanSpectraAlpha7216 frostHunterOnDeviceTranslatorTitanSpectraAlpha7216;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterCameraXPixelTurboCosmos9814 != 4);
        int FrostHunterLooperHyperionForce4133 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperHyperionForce4133(this.FrostHunterCameraXPixelTurboCosmos9814);
        if (FrostHunterLooperHyperionForce4133 == 0) {
            return true;
        }
        if (FrostHunterLooperHyperionForce4133 != 2) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
            int i = this.FrostHunterFragmentBetaMegaVortex6025;
            while (true) {
                int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
                if (i2 == -1) {
                    this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
                    str = null;
                    break;
                }
                FrostHunterAsyncTaskOlympianOmegaTitanium8725 frostHunterAsyncTaskOlympianOmegaTitanium8725 = (FrostHunterAsyncTaskOlympianOmegaTitanium8725) this.FrostHunterLightSensorForceFusion4241.FrostHunterFlowMaxDragonHero5809;
                CharSequence charSequence = this.FrostHunterAlertDialogAuroraDelta3200;
                int length = charSequence.length();
                FrostHunterCanvasInfernoVortex4700.FrostHunterEditTextPulseHyperion1262(i2, length);
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (frostHunterAsyncTaskOlympianOmegaTitanium8725.FrostHunterAlphaAnimationNeoCosmos5761(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    i2 = charSequence.length();
                    this.FrostHunterFragmentBetaMegaVortex6025 = -1;
                } else {
                    this.FrostHunterFragmentBetaMegaVortex6025 = i2 + 1;
                }
                int i3 = this.FrostHunterFragmentBetaMegaVortex6025;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.FrostHunterFragmentBetaMegaVortex6025 = i4;
                    if (i4 > charSequence.length()) {
                        this.FrostHunterFragmentBetaMegaVortex6025 = -1;
                    }
                } else {
                    while (true) {
                        frostHunterOnDeviceTranslatorTitanSpectraAlpha7216 = this.FrostHunterKeyframeGammaGamma1197;
                        if (i >= i2 || !frostHunterOnDeviceTranslatorTitanSpectraAlpha7216.FrostHunterAlphaAnimationNeoCosmos5761(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (i2 > i && frostHunterOnDeviceTranslatorTitanSpectraAlpha7216.FrostHunterAlphaAnimationNeoCosmos5761(charSequence.charAt(i2 - 1))) {
                        i2--;
                    }
                    int i5 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (i5 == 1) {
                        i2 = charSequence.length();
                        this.FrostHunterFragmentBetaMegaVortex6025 = -1;
                        while (i2 > i && frostHunterOnDeviceTranslatorTitanSpectraAlpha7216.FrostHunterAlphaAnimationNeoCosmos5761(charSequence.charAt(i2 - 1))) {
                            i2--;
                        }
                    } else {
                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5 - 1;
                    }
                    str = charSequence.subSequence(i, i2).toString();
                }
            }
            this.FrostHunterFlowMaxDragonHero5809 = str;
            if (this.FrostHunterCameraXPixelTurboCosmos9814 != 3) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return null;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        String str = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
