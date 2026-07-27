package android.content.Context;

import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPropertyValuesHolderPrimeOmegaHyperion5340 implements FrostHunterContextTurboThunder5763 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    public /* synthetic */ FrostHunterPropertyValuesHolderPrimeOmegaHyperion5340(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    @Override // android.content.Context.FrostHunterContextTurboThunder5763
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        String obj2;
        Object frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterLiveDataScopeMaxMasterHyper3876 frostHunterLiveDataScopeMaxMasterHyper3876 = (FrostHunterLiveDataScopeMaxMasterHyper3876) obj;
                frostHunterLiveDataScopeMaxMasterHyper3876.getClass();
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, new SecretKeySpec(frostHunterLiveDataScopeMaxMasterHyper3876.FrostHunterConstraintSetCloneMasterUltraRogue2633, "AES"), new GCMParameterSpec(128, frostHunterLiveDataScopeMaxMasterHyper3876.FrostHunterBundlePulseFusionHero2475));
                byte[] bytes = frostHunterLiveDataScopeMaxMasterHyper3876.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.getBytes(FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
                bytes.getClass();
                byte[] doFinal = cipher.doFinal(bytes);
                doFinal.getClass();
                return doFinal;
            case 1:
                return (obj == null || (obj2 = obj.toString()) == null) ? "" : obj2;
            case 2:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                String encodeToString = Base64.encodeToString(bArr, 2);
                encodeToString.getClass();
                return encodeToString;
            case 3:
                FrostHunterMotionLayoutNovaHero1833 frostHunterMotionLayoutNovaHero1833 = (FrostHunterMotionLayoutNovaHero1833) obj;
                frostHunterMotionLayoutNovaHero1833.getClass();
                FrostHunterContentObserverOmegaNebula2987 frostHunterContentObserverOmegaNebula2987 = frostHunterMotionLayoutNovaHero1833.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                String str = frostHunterContentObserverOmegaNebula2987.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterPoseDetectionShadowFusion5531 frostHunterPoseDetectionShadowFusion5531 = frostHunterMotionLayoutNovaHero1833.FrostHunterAlphaAnimationNeoCosmos5761;
                return new FrostHunterDelayPixelLegendHero6751(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterMotionEventSparkPixelNebula7600(str, frostHunterPoseDetectionShadowFusion5531.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761), new FrostHunterMotionEventSparkPixelNebula7600(frostHunterContentObserverOmegaNebula2987.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterPoseDetectionShadowFusion5531.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761), new FrostHunterMotionEventSparkPixelNebula7600(frostHunterContentObserverOmegaNebula2987.FrostHunterBundlePulseFusionHero2475, frostHunterPoseDetectionShadowFusion5531.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761), new FrostHunterMotionEventSparkPixelNebula7600(frostHunterContentObserverOmegaNebula2987.FrostHunterServiceEliteCelestialThunder1757, frostHunterPoseDetectionShadowFusion5531.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761)));
            case 4:
                FrostHunterConstraintSetCloneSolarHyper7154 frostHunterConstraintSetCloneSolarHyper7154 = (FrostHunterConstraintSetCloneSolarHyper7154) obj;
                frostHunterConstraintSetCloneSolarHyper7154.getClass();
                String str2 = frostHunterConstraintSetCloneSolarHyper7154.FrostHunterAlphaAnimationNeoCosmos5761;
                if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterServiceInfoHyperionSparkMax9966(str2)) {
                    return FrostHunterCameraSelectorEpicTitanium4314.FrostHunterAlphaAnimationNeoCosmos5761;
                }
                try {
                    frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new JSONObject(str2);
                } catch (Throwable th) {
                    frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
                }
                JSONObject jSONObject = (JSONObject) (frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 instanceof FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409 ? null : frostHunterRealtimeDatabaseBetaOlympianPhoenix2409);
                return jSONObject == null ? FrostHunterCameraSelectorEpicTitanium4314.FrostHunterConstraintSetCloneMasterUltraRogue2633 : new FrostHunterConstraintSetMasterDragonOlympian9546(jSONObject);
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                FrostHunterViewPagerLegendShadowMaster9145 frostHunterViewPagerLegendShadowMaster9145 = (FrostHunterViewPagerLegendShadowMaster9145) obj;
                frostHunterViewPagerLegendShadowMaster9145.getClass();
                byte[] bArr2 = frostHunterViewPagerLegendShadowMaster9145.FrostHunterAlphaAnimationNeoCosmos5761;
                byte[] bArr3 = frostHunterViewPagerLegendShadowMaster9145.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                bArr2.getClass();
                bArr3.getClass();
                int length = bArr2.length;
                int length2 = bArr3.length;
                byte[] copyOf = Arrays.copyOf(bArr2, length + length2);
                System.arraycopy(bArr3, 0, copyOf, length, length2);
                byte[] bArr4 = frostHunterViewPagerLegendShadowMaster9145.FrostHunterBundlePulseFusionHero2475;
                bArr4.getClass();
                int length3 = copyOf.length;
                int length4 = bArr4.length;
                byte[] copyOf2 = Arrays.copyOf(copyOf, length3 + length4);
                System.arraycopy(bArr4, 0, copyOf2, length3, length4);
                return copyOf2;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                FrostHunterImageCaptureSolarPhantomMaster9123 frostHunterImageCaptureSolarPhantomMaster9123 = (FrostHunterImageCaptureSolarPhantomMaster9123) obj;
                frostHunterImageCaptureSolarPhantomMaster9123.getClass();
                String jSONObject2 = frostHunterImageCaptureSolarPhantomMaster9123.FrostHunterAlphaAnimationNeoCosmos5761.toString();
                jSONObject2.getClass();
                return jSONObject2;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                ((FrostHunterInsetDrawableUltraDelta5446) obj).getClass();
                SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
                throw null;
            default:
                FrostHunterOnLongClickListenerLegendLegend1905 frostHunterOnLongClickListenerLegendLegend1905 = (FrostHunterOnLongClickListenerLegendLegend1905) obj;
                frostHunterOnLongClickListenerLegendLegend1905.getClass();
                return (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterServiceInfoHyperionSparkMax9966(frostHunterOnLongClickListenerLegendLegend1905.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761) || FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterServiceInfoHyperionSparkMax9966(frostHunterOnLongClickListenerLegendLegend1905.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761)) ? FrostHunterPaintDeltaLegend2556.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 : new FrostHunterConfigurationUltraGamma9150(frostHunterOnLongClickListenerLegendLegend1905);
        }
    }
}
