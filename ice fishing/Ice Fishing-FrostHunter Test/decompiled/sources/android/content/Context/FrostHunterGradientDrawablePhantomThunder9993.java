package android.content.Context;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradientDrawablePhantomThunder9993 implements FrostHunterWithContextVisionPixelCosmos6861 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final byte[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGradientDrawablePhantomThunder9993(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(z);
                break;
            case "auxiliary.tracks.map":
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i2 == 0);
                break;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
    }

    public final ArrayList FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("Metadata is not an auxiliary tracks map", this.FrostHunterAlphaAnimationNeoCosmos5761.equals("auxiliary.tracks.map"));
        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterGradientDrawablePhantomThunder9993.class == obj.getClass()) {
            FrostHunterGradientDrawablePhantomThunder9993 frostHunterGradientDrawablePhantomThunder9993 = (FrostHunterGradientDrawablePhantomThunder9993) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterGradientDrawablePhantomThunder9993.FrostHunterAlphaAnimationNeoCosmos5761) && Arrays.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterGradientDrawablePhantomThunder9993.FrostHunterConstraintSetCloneMasterUltraRogue2633) && this.FrostHunterBundlePulseFusionHero2475 == frostHunterGradientDrawablePhantomThunder9993.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterServiceEliteCelestialThunder1757 == frostHunterGradientDrawablePhantomThunder9993.FrostHunterServiceEliteCelestialThunder1757) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761, 527, 31)) * 31) + this.FrostHunterBundlePulseFusionHero2475) * 31) + this.FrostHunterServiceEliteCelestialThunder1757;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        FrostHunterVectorDrawableNovaXNebula4109 frostHunterVectorDrawableNovaXNebula4109;
        boolean z;
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i == 0) {
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals("auxiliary.tracks.map")) {
                ArrayList FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                new FrostHunterWorkManagerMaxTurbo1858(String.valueOf(',')).FrostHunterAlphaAnimationNeoCosmos5761(sb2, FrostHunterServiceEliteCelestialThunder1757.iterator());
                sb = sb2.toString();
            }
            byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterInputFilterInfernoSolarCosmos2540 frostHunterInputFilterInfernoSolarCosmos2540 = FrostHunterVectorDrawableNovaXNebula4109.FrostHunterServiceEliteCelestialThunder1757;
            frostHunterVectorDrawableNovaXNebula4109 = frostHunterInputFilterInfernoSolarCosmos2540.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterVectorDrawableNovaXNebula4109 == null) {
            }
            int length = bArr.length;
            FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(0, length, bArr.length);
            FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742 = frostHunterVectorDrawableNovaXNebula4109.FrostHunterAlphaAnimationNeoCosmos5761;
            int i2 = frostHunterPreviewInfernoNeoDragon1742.FrostHunterLifecycleBlazeGammaElite2889;
            int i3 = frostHunterPreviewInfernoNeoDragon1742.FrostHunterLevelListDrawableFusionDragonHero2232;
            RoundingMode roundingMode = RoundingMode.CEILING;
            StringBuilder sb3 = new StringBuilder(FrostHunterCanvasInfernoVortex4700.FrostHunterMagnetometerFusionTitanium8202(length, i3) * i2);
            frostHunterVectorDrawableNovaXNebula4109.FrostHunterConstraintSetCloneMasterUltraRogue2633(sb3, bArr, length);
            sb = sb3.toString();
        } else if (i == 1) {
            byte[] bArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            sb = new String(bArr2, StandardCharsets.UTF_8);
        } else if (i == 23) {
            byte[] bArr3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterCanvasInfernoVortex4700.FrostHunterLintTitanVortexQuantum9911(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterLooperHyperionForce4133(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
        } else if (i == 67) {
            byte[] bArr4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterCanvasInfernoVortex4700.FrostHunterLintTitanVortexQuantum9911(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
            sb = String.valueOf(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterLooperHyperionForce4133(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new FrostHunterLicensingSpectraPulse8868(this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterMeteringPointMegaCyber7955());
            }
            byte[] bArr5 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            String str3 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterInputFilterInfernoSolarCosmos2540 frostHunterInputFilterInfernoSolarCosmos25402 = FrostHunterVectorDrawableNovaXNebula4109.FrostHunterServiceEliteCelestialThunder1757;
            frostHunterVectorDrawableNovaXNebula4109 = frostHunterInputFilterInfernoSolarCosmos25402.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterVectorDrawableNovaXNebula4109 == null) {
                FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon17422 = frostHunterInputFilterInfernoSolarCosmos25402.FrostHunterAlphaAnimationNeoCosmos5761;
                char[] cArr = frostHunterPreviewInfernoNeoDragon17422.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int length2 = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    if (FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterServiceInfoHyperionSparkMax9966(cArr[i4])) {
                        int length3 = cArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length3) {
                                z = false;
                                break;
                            }
                            char c = cArr[i5];
                            if (c >= 'a' && c <= 'z') {
                                z = true;
                                break;
                            }
                            i5++;
                        }
                        FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        char[] cArr2 = new char[cArr.length];
                        for (int i6 = 0; i6 < cArr.length; i6++) {
                            char c2 = cArr[i6];
                            if (FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterServiceInfoHyperionSparkMax9966(c2)) {
                                c2 = (char) (c2 ^ ' ');
                            }
                            cArr2[i6] = c2;
                        }
                        FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon17423 = new FrostHunterPreviewInfernoNeoDragon1742(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), frostHunterPreviewInfernoNeoDragon17422.FrostHunterAlphaAnimationNeoCosmos5761, ".lowerCase()"), cArr2);
                        if (frostHunterPreviewInfernoNeoDragon17422.FrostHunterCameraXPixelTurboCosmos9814) {
                            byte[] bArr6 = frostHunterPreviewInfernoNeoDragon17423.FrostHunterRemoteConfigSpeedSpeed8566;
                            if (!frostHunterPreviewInfernoNeoDragon17423.FrostHunterCameraXPixelTurboCosmos9814) {
                                byte[] copyOf = Arrays.copyOf(bArr6, bArr6.length);
                                for (int i7 = 65; i7 <= 90; i7++) {
                                    int i8 = i7 | 32;
                                    byte b = bArr6[i7];
                                    byte b2 = bArr6[i8];
                                    if (b == -1) {
                                        copyOf[i7] = b2;
                                    } else {
                                        char c3 = (char) i7;
                                        char c4 = (char) i8;
                                        if (!(b2 == -1)) {
                                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                            return null;
                                        }
                                        copyOf[i8] = b;
                                    }
                                }
                                frostHunterPreviewInfernoNeoDragon17422 = new FrostHunterPreviewInfernoNeoDragon1742(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), frostHunterPreviewInfernoNeoDragon17423.FrostHunterAlphaAnimationNeoCosmos5761, ".ignoreCase()"), frostHunterPreviewInfernoNeoDragon17423.FrostHunterConstraintSetCloneMasterUltraRogue2633, copyOf, true);
                            }
                        }
                        frostHunterPreviewInfernoNeoDragon17422 = frostHunterPreviewInfernoNeoDragon17423;
                    } else {
                        i4++;
                    }
                }
                frostHunterVectorDrawableNovaXNebula4109 = frostHunterPreviewInfernoNeoDragon17422 == frostHunterInputFilterInfernoSolarCosmos25402.FrostHunterAlphaAnimationNeoCosmos5761 ? frostHunterInputFilterInfernoSolarCosmos25402 : new FrostHunterInputFilterInfernoSolarCosmos2540(frostHunterPreviewInfernoNeoDragon17422);
                frostHunterInputFilterInfernoSolarCosmos25402.FrostHunterBundlePulseFusionHero2475 = frostHunterVectorDrawableNovaXNebula4109;
            }
            int length4 = bArr5.length;
            FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(0, length4, bArr5.length);
            FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon17424 = frostHunterVectorDrawableNovaXNebula4109.FrostHunterAlphaAnimationNeoCosmos5761;
            int i22 = frostHunterPreviewInfernoNeoDragon17424.FrostHunterLifecycleBlazeGammaElite2889;
            int i32 = frostHunterPreviewInfernoNeoDragon17424.FrostHunterLevelListDrawableFusionDragonHero2232;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            StringBuilder sb32 = new StringBuilder(FrostHunterCanvasInfernoVortex4700.FrostHunterMagnetometerFusionTitanium8202(length4, i32) * i22);
            try {
                frostHunterVectorDrawableNovaXNebula4109.FrostHunterConstraintSetCloneMasterUltraRogue2633(sb32, bArr5, length4);
                sb = sb32.toString();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        } else {
            sb = String.valueOf(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[0] & 255);
        }
        return "mdta: key=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", value=" + sb;
    }
}
