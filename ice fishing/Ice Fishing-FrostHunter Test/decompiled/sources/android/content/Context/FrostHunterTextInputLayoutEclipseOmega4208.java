package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextInputLayoutEclipseOmega4208 extends FrostHunterConfigurationTitanHero4370 {
    public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200 = 1;
    public final Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterTextInputLayoutEclipseOmega4208(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.FrostHunterKeyframeGammaGamma1197 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj = this.FrostHunterKeyframeGammaGamma1197;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                    break;
                } else {
                    int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                    this.FrostHunterCameraXPixelTurboCosmos9814 = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                    break;
                } else {
                    this.FrostHunterCameraXPixelTurboCosmos9814++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj = this.FrostHunterKeyframeGammaGamma1197;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                    break;
                } else {
                    int i2 = this.FrostHunterCameraXPixelTurboCosmos9814 - 1;
                    this.FrostHunterCameraXPixelTurboCosmos9814 = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                    break;
                } else {
                    this.FrostHunterCameraXPixelTurboCosmos9814--;
                    break;
                }
        }
        return null;
    }

    public FrostHunterTextInputLayoutEclipseOmega4208(int i, Object obj) {
        super(i, 1);
        this.FrostHunterKeyframeGammaGamma1197 = obj;
    }
}
