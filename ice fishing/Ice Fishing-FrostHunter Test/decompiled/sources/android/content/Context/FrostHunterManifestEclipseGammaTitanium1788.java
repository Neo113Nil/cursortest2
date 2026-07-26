package android.content.Context;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterManifestEclipseGammaTitanium1788 implements Iterable, Serializable {
    public static final FrostHunterManifestEclipseGammaTitanium1788 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterManifestEclipseGammaTitanium1788(FrostHunterExoPlayerBetaAlpha8415.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    public static final FrostHunterPagingGammaVortex4292 FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final byte[] FrostHunterFlowMaxDragonHero5809;

    static {
        FrostHunterKeyframeGammaGamma1197 = FrostHunterShapeAppearanceQuantumHeroSpark5567.FrostHunterAlphaAnimationNeoCosmos5761() ? new FrostHunterRewardedAdHyperStrike1151(25) : new FrostHunterRippleDrawableBlazeBetaStorm6320(24);
    }

    public FrostHunterManifestEclipseGammaTitanium1788(byte[] bArr) {
        bArr.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = bArr;
    }

    public static int FrostHunterBundlePulseFusionHero2475(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static FrostHunterManifestEclipseGammaTitanium1788 FrostHunterServiceEliteCelestialThunder1757(byte[] bArr, int i, int i2) {
        FrostHunterBundlePulseFusionHero2475(i, i + i2, bArr.length);
        return new FrostHunterManifestEclipseGammaTitanium1788(FrostHunterKeyframeGammaGamma1197.FrostHunterBundlePulseFusionHero2475(bArr, i, i2));
    }

    public byte FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        return this.FrostHunterFlowMaxDragonHero5809[i];
    }

    public int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return 0;
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(byte[] bArr, int i) {
        System.arraycopy(this.FrostHunterFlowMaxDragonHero5809, 0, bArr, 0, i);
    }

    public byte FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        return this.FrostHunterFlowMaxDragonHero5809[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterManifestEclipseGammaTitanium1788) || size() != ((FrostHunterManifestEclipseGammaTitanium1788) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof FrostHunterManifestEclipseGammaTitanium1788)) {
            return obj.equals(this);
        }
        FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788 = (FrostHunterManifestEclipseGammaTitanium1788) obj;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = frostHunterManifestEclipseGammaTitanium1788.FrostHunterCameraXPixelTurboCosmos9814;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > frostHunterManifestEclipseGammaTitanium1788.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > frostHunterManifestEclipseGammaTitanium1788.size()) {
            StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Ran off end of other: 0, ", size, ", ");
            FrostHunterServiceConnectionTurboPhoenixOmega6719.append(frostHunterManifestEclipseGammaTitanium1788.size());
            throw new IllegalArgumentException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
        }
        byte[] bArr = frostHunterManifestEclipseGammaTitanium1788.FrostHunterFlowMaxDragonHero5809;
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232() + size;
        int FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterLevelListDrawableFusionDragonHero2232();
        int FrostHunterLevelListDrawableFusionDragonHero22323 = frostHunterManifestEclipseGammaTitanium1788.FrostHunterLevelListDrawableFusionDragonHero2232();
        while (FrostHunterLevelListDrawableFusionDragonHero22322 < FrostHunterLevelListDrawableFusionDragonHero2232) {
            if (this.FrostHunterFlowMaxDragonHero5809[FrostHunterLevelListDrawableFusionDragonHero22322] != bArr[FrostHunterLevelListDrawableFusionDragonHero22323]) {
                return false;
            }
            FrostHunterLevelListDrawableFusionDragonHero22322++;
            FrostHunterLevelListDrawableFusionDragonHero22323++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i != 0) {
            return i;
        }
        int size = size();
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
        int i2 = size;
        for (int i3 = FrostHunterLevelListDrawableFusionDragonHero2232; i3 < FrostHunterLevelListDrawableFusionDragonHero2232 + size; i3++) {
            i2 = (i2 * 31) + this.FrostHunterFlowMaxDragonHero5809[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterScrollViewLegendPhoenix5801(this);
    }

    public int size() {
        return this.FrostHunterFlowMaxDragonHero5809.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLifecycleBlazeGammaElite2889(this);
        } else {
            int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(0, 47, size());
            concat = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterBundlePulseFusionHero2475 == 0 ? FrostHunterAlertDialogAuroraDelta3200 : new FrostHunterSharedFlowSolarNovaXPhantom8344(this.FrostHunterFlowMaxDragonHero5809, FrostHunterLevelListDrawableFusionDragonHero2232(), FrostHunterBundlePulseFusionHero2475)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, concat, "\">");
    }
}
