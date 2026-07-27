package android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSQLiteGammaEclipseMax8527 implements FrostHunterStatePhantomVisionSpectra5005 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterSQLiteGammaEclipseMax8527(FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326) {
        frostHunterChipSpeedTitan5326.getClass();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterChipSpeedTitan5326;
    }

    public static int FrostHunterServiceEliteCelestialThunder1757(FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883, int i) {
        String FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761("Retry-After");
        if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            FrostHunterAlphaAnimationNeoCosmos5761 = null;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(FrostHunterAlphaAnimationNeoCosmos5761).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(FrostHunterAlphaAnimationNeoCosmos5761);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511, still in use, count: 2, list:
          (r0v25 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511) from 0x0072: MOVE (r18v0 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511) = (r0v25 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511) (LINE:115)
          (r0v25 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511) from 0x005f: MOVE (r18v3 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511) = (r0v25 android.content.Context.FrostHunterRotateAnimationOlympianCyber9511) (LINE:96)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // android.content.Context.FrostHunterStatePhantomVisionSpectra5005
    public final android.content.Context.FrostHunterThemeOverlayAlphaUltra2883 FrostHunterAlphaAnimationNeoCosmos5761(android.content.Context.FrostHunterGyroscopeOmegaRogue4017 r35) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.Context.FrostHunterSQLiteGammaEclipseMax8527.FrostHunterAlphaAnimationNeoCosmos5761(android.content.Context.FrostHunterGyroscopeOmegaRogue4017):android.content.Context.FrostHunterThemeOverlayAlphaUltra2883");
    }

    public boolean FrostHunterBundlePulseFusionHero2475(IOException iOException, FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, FrostHunterLifecycleCameraControllerStormAlpha3266 frostHunterLifecycleCameraControllerStormAlpha3266) {
        boolean z = iOException instanceof FrostHunterDataBindingPulseGamma5650;
        if (!((FrostHunterPreviewThunderShadowBeta2697) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterLifecycleBlazeGammaElite2889) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834 = frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLooperHyperionForce4133;
        if (frostHunterAudioManagerNovaNovaXAurora2834 == null || !frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterCameraXPixelTurboCosmos9814) {
            return false;
        }
        FrostHunterOnAttachStateChangeListenerElitePrimeBeta7473 frostHunterOnAttachStateChangeListenerElitePrimeBeta7473 = frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterScaleAnimationStrikeSpark5059;
        frostHunterOnAttachStateChangeListenerElitePrimeBeta7473.getClass();
        FrostHunterRotateAnimationOlympianCyber9511 FrostHunterKeyframeGammaGamma1197 = frostHunterOnAttachStateChangeListenerElitePrimeBeta7473.FrostHunterKeyframeGammaGamma1197();
        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora28342 = frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterLooperHyperionForce4133;
        return FrostHunterKeyframeGammaGamma1197.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAudioManagerNovaNovaXAurora28342 != null ? frostHunterAudioManagerNovaNovaXAurora28342.FrostHunterLifecycleBlazeGammaElite2889() : null);
    }

    public FrostHunterLifecycleCameraControllerStormAlpha3266 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883, FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834) {
        FrostHunterFontFamilyGammaSpeed1025 frostHunterFontFamilyGammaSpeed1025;
        FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra28832;
        FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336 = frostHunterAudioManagerNovaNovaXAurora2834 != null ? frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterLifecycleBlazeGammaElite2889().FrostHunterBundlePulseFusionHero2475 : null;
        int i = frostHunterThemeOverlayAlphaUltra2883.FrostHunterKeyframeGammaGamma1197;
        String str = frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((FrostHunterPreviewThunderShadowBeta2697) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterRemoteConfigSpeedSpeed8566.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra28833 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXTurboCelestialHero5430;
                    if ((frostHunterThemeOverlayAlphaUltra28833 == null || frostHunterThemeOverlayAlphaUltra28833.FrostHunterKeyframeGammaGamma1197 != 503) && FrostHunterServiceEliteCelestialThunder1757(frostHunterThemeOverlayAlphaUltra2883, Integer.MAX_VALUE) == 0) {
                        return frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXPixelTurboCosmos9814;
                    }
                } else {
                    if (i == 407) {
                        frostHunterLooperThreadTitanGamma7336.getClass();
                        if (frostHunterLooperThreadTitanGamma7336.FrostHunterConstraintSetCloneMasterUltraRogue2633.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((FrostHunterPreviewThunderShadowBeta2697) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterServiceConnectionTurboPhoenixOmega6719.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((FrostHunterPreviewThunderShadowBeta2697) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterLifecycleBlazeGammaElite2889 && (((frostHunterThemeOverlayAlphaUltra28832 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXTurboCelestialHero5430) == null || frostHunterThemeOverlayAlphaUltra28832.FrostHunterKeyframeGammaGamma1197 != 408) && FrostHunterServiceEliteCelestialThunder1757(frostHunterThemeOverlayAlphaUltra2883, 0) <= 0)) {
                        return frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXPixelTurboCosmos9814;
                    }
                }
            } else if (frostHunterAudioManagerNovaNovaXAurora2834 != null && !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(((FrostHunterOnAttachStateChangeListenerElitePrimeBeta7473) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197().FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757, ((FrostHunterLayoutInflaterNovaXTitan5170) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterKeyframeGammaGamma1197).FrostHunterLifecycleBlazeGammaElite2889().FrostHunterLifecycleBlazeGammaElite2889().FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757)) {
                FrostHunterButtonBlazeOmegaVortex4430 FrostHunterLifecycleBlazeGammaElite2889 = frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterLifecycleBlazeGammaElite2889();
                synchronized (FrostHunterLifecycleBlazeGammaElite2889) {
                    FrostHunterLifecycleBlazeGammaElite2889.FrostHunterKeyframeGammaGamma1197 = true;
                }
                return frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXPixelTurboCosmos9814;
            }
            return null;
        }
        FrostHunterPreviewThunderShadowBeta2697 frostHunterPreviewThunderShadowBeta2697 = (FrostHunterPreviewThunderShadowBeta2697) this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (frostHunterPreviewThunderShadowBeta2697.FrostHunterCameraXPixelTurboCosmos9814) {
            String FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761("Location");
            if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                FrostHunterAlphaAnimationNeoCosmos5761 = null;
            }
            FrostHunterLifecycleCameraControllerStormAlpha3266 frostHunterLifecycleCameraControllerStormAlpha3266 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterCameraXPixelTurboCosmos9814;
            if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                FrostHunterAdMobSpeedMasterSpark5250 frostHunterAdMobSpeedMasterSpark5250 = frostHunterLifecycleCameraControllerStormAlpha3266.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterAdMobSpeedMasterSpark5250.getClass();
                try {
                    frostHunterFontFamilyGammaSpeed1025 = new FrostHunterFontFamilyGammaSpeed1025(1);
                    frostHunterFontFamilyGammaSpeed1025.FrostHunterLightSensorForceFusion4241(frostHunterAdMobSpeedMasterSpark5250, FrostHunterAlphaAnimationNeoCosmos5761);
                } catch (IllegalArgumentException unused) {
                    frostHunterFontFamilyGammaSpeed1025 = null;
                }
                FrostHunterAdMobSpeedMasterSpark5250 FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterFontFamilyGammaSpeed1025 != null ? frostHunterFontFamilyGammaSpeed1025.FrostHunterAlphaAnimationNeoCosmos5761() : null;
                if (FrostHunterAlphaAnimationNeoCosmos57612 != null && (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLifecycleCameraControllerStormAlpha3266.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761) || frostHunterPreviewThunderShadowBeta2697.FrostHunterFlowMaxDragonHero5809)) {
                    FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 FrostHunterAlphaAnimationNeoCosmos57613 = frostHunterLifecycleCameraControllerStormAlpha3266.FrostHunterAlphaAnimationNeoCosmos5761();
                    if (FrostHunterPaintCyberPulse5979.FrostHunterPagingDataTurboTitanium7332(str)) {
                        int i2 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterKeyframeGammaGamma1197;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterBitmapTurboDeltaNebula8743(str, z ? frostHunterLifecycleCameraControllerStormAlpha3266.FrostHunterServiceEliteCelestialThunder1757 : null);
                        } else {
                            FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterBitmapTurboDeltaNebula8743("GET", null);
                        }
                        if (!z) {
                            ((FrostHunterServiceInfoSpectraMegaThunder7104) FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814("Transfer-Encoding");
                            ((FrostHunterServiceInfoSpectraMegaThunder7104) FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814("Content-Length");
                            ((FrostHunterServiceInfoSpectraMegaThunder7104) FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814("Content-Type");
                        }
                    }
                    if (!FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLifecycleCameraControllerStormAlpha3266.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterAlphaAnimationNeoCosmos57612)) {
                        ((FrostHunterServiceInfoSpectraMegaThunder7104) FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814("Authorization");
                    }
                    FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterAlphaAnimationNeoCosmos57612;
                    return new FrostHunterLifecycleCameraControllerStormAlpha3266(FrostHunterAlphaAnimationNeoCosmos57613);
                }
            }
        }
        return null;
    }

    public FrostHunterSQLiteGammaEclipseMax8527(FrostHunterPreviewThunderShadowBeta2697 frostHunterPreviewThunderShadowBeta2697) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterPreviewThunderShadowBeta2697;
    }
}
