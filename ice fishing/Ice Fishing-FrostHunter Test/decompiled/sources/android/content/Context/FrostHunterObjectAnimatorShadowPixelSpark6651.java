package android.content.Context;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObjectAnimatorShadowPixelSpark6651 implements FrostHunterServiceInfoEpicSpectra3006, FrostHunterContentResolverOmegaDragon8329 {
    public final FrostHunterLooperThreadTitanGamma7336 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterCoroutineScopeBetaMasterRogue7248 FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterSurfaceViewPrimeAlphaPulse4865 FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterMotionEventBetaSpark6296 FrostHunterCameraXTurboCelestialHero5430;
    public final FrostHunterGuidelineUltraThunderTitanium6483 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Socket FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterRotateAnimationOlympianCyber9511 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterLifecycleCameraControllerStormAlpha3266 FrostHunterFragmentBetaMegaVortex6025;
    public final List FrostHunterKeyframeGammaGamma1197;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final boolean FrostHunterLightSensorForceFusion4241;
    public Socket FrostHunterLintTitanVortexQuantum9911;
    public FrostHunterButtonBlazeOmegaVortex4430 FrostHunterLooperThreadBetaHyperionMax1000;
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public FrostHunterFragmentManagerShadowForceCyber6887 FrostHunterResourcesTitanHyperVision5823;
    public volatile boolean FrostHunterScaleAnimationStrikeSpark5059;
    public final int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final int FrostHunterServiceEliteCelestialThunder1757;
    public FrostHunterTraceHyperionAuroraNebula9947 FrostHunterTextViewDragonStormMega4297;

    public FrostHunterObjectAnimatorShadowPixelSpark6651(FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248, FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium6483, int i, int i2, int i3, int i4, boolean z, FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, FrostHunterRotateAnimationOlympianCyber9511 frostHunterRotateAnimationOlympianCyber9511, FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336, List list, FrostHunterLifecycleCameraControllerStormAlpha3266 frostHunterLifecycleCameraControllerStormAlpha3266, int i5, boolean z2) {
        frostHunterCoroutineScopeBetaMasterRogue7248.getClass();
        frostHunterGuidelineUltraThunderTitanium6483.getClass();
        frostHunterLooperThreadTitanGamma7336.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterCoroutineScopeBetaMasterRogue7248;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterGuidelineUltraThunderTitanium6483;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i3;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i4;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = z;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterSurfaceViewPrimeAlphaPulse4865;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterRotateAnimationOlympianCyber9511;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLooperThreadTitanGamma7336;
        this.FrostHunterKeyframeGammaGamma1197 = list;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterLifecycleCameraControllerStormAlpha3266;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5;
        this.FrostHunterLightSensorForceFusion4241 = z2;
    }

    public final void FrostHunterAlertDialogAuroraDelta3200(SSLSocket sSLSocket, FrostHunterNavigationViewFusionVortexTitanium1543 frostHunterNavigationViewFusionVortexTitanium1543) {
        FrostHunterFragmentManagerShadowForceCyber6887 frostHunterFragmentManagerShadowForceCyber6887;
        FrostHunterDialogFragmentMasterSpectra2557 frostHunterDialogFragmentMasterSpectra2557 = this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761;
        try {
            if (frostHunterNavigationViewFusionVortexTitanium1543.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757(sSLSocket, frostHunterDialogFragmentMasterSpectra2557.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757, frostHunterDialogFragmentMasterSpectra2557.FrostHunterFlowMaxDragonHero5809);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            FrostHunterMotionEventBetaSpark6296 FrostHunterMeteringPointBetaCyber9571 = FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointBetaCyber9571(session);
            HostnameVerifier hostnameVerifier = frostHunterDialogFragmentMasterSpectra2557.FrostHunterServiceEliteCelestialThunder1757;
            hostnameVerifier.getClass();
            boolean verify = hostnameVerifier.verify(frostHunterDialogFragmentMasterSpectra2557.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757, session);
            int i = 2;
            if (verify) {
                FrostHunterDialogFragmentAlphaInfernoPhoenix7084 frostHunterDialogFragmentAlphaInfernoPhoenix7084 = frostHunterDialogFragmentMasterSpectra2557.FrostHunterLifecycleBlazeGammaElite2889;
                frostHunterDialogFragmentAlphaInfernoPhoenix7084.getClass();
                this.FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterMotionEventBetaSpark6296(FrostHunterMeteringPointBetaCyber9571.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterMeteringPointBetaCyber9571.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterMeteringPointBetaCyber9571.FrostHunterBundlePulseFusionHero2475, new FrostHunterDragEventEclipseThunderSpeed6590(frostHunterDialogFragmentAlphaInfernoPhoenix7084, FrostHunterMeteringPointBetaCyber9571, frostHunterDialogFragmentMasterSpectra2557, i));
                frostHunterDialogFragmentMasterSpectra2557.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757.getClass();
                Iterator it = frostHunterDialogFragmentAlphaInfernoPhoenix7084.FrostHunterAlphaAnimationNeoCosmos5761.iterator();
                String str = null;
                if (it.hasNext()) {
                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperThreadBetaHyperionMax1000(it.next());
                    throw null;
                }
                if (frostHunterNavigationViewFusionVortexTitanium1543.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos77442 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
                    str = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(sSLSocket);
                }
                this.FrostHunterLintTitanVortexQuantum9911 = sSLSocket;
                this.FrostHunterTextViewDragonStormMega4297 = new FrostHunterTraceHyperionAuroraNebula9947(new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(sSLSocket));
                if (str != null) {
                    FrostHunterFragmentManagerShadowForceCyber6887.FrostHunterFlowMaxDragonHero5809.getClass();
                    frostHunterFragmentManagerShadowForceCyber6887 = FrostHunterBottomSheetEclipseUltraShadow6009.FrostHunterLightSensorForceFusion4241(str);
                } else {
                    frostHunterFragmentManagerShadowForceCyber6887 = FrostHunterFragmentManagerShadowForceCyber6887.HTTP_1_1;
                }
                this.FrostHunterResourcesTitanHyperVision5823 = frostHunterFragmentManagerShadowForceCyber6887;
                FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos77443 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                return;
            }
            List FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterMeteringPointBetaCyber9571.FrostHunterAlphaAnimationNeoCosmos5761();
            if (FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + frostHunterDialogFragmentMasterSpectra2557.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757 + " not verified (no certificates)");
            }
            Object obj = FrostHunterAlphaAnimationNeoCosmos5761.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(frostHunterDialogFragmentMasterSpectra2557.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757);
            sb.append(" not verified:\n            |    certificate: ");
            FrostHunterDialogFragmentAlphaInfernoPhoenix7084 frostHunterDialogFragmentAlphaInfernoPhoenix70842 = FrostHunterDialogFragmentAlphaInfernoPhoenix7084.FrostHunterBundlePulseFusionHero2475;
            StringBuilder sb2 = new StringBuilder("sha256/");
            FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(FrostHunterChipSpeedTitan5326.FrostHunterLintTitanVortexQuantum9911(encoded).FrostHunterBundlePulseFusionHero2475("SHA-256").FrostHunterAlphaAnimationNeoCosmos5761());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterCoordinatorLayoutGammaTurboSpark2420(FrostHunterDataBindingForceEpicShadow1928.FrostHunterAlphaAnimationNeoCosmos5761(x509Certificate, 7), FrostHunterDataBindingForceEpicShadow1928.FrostHunterAlphaAnimationNeoCosmos5761(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(FrostHunterBundleAuroraDeltaSolar9352.FrostHunterServiceConnectionTurboPhoenixOmega6719(sb.toString()));
        } catch (Throwable th) {
            FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos77444 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(sSLSocket);
            throw th;
        }
    }

    @Override // android.content.Context.FrostHunterServiceInfoEpicSpectra3006
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterResourcesTitanHyperVision5823 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    @Override // android.content.Context.FrostHunterServiceInfoEpicSpectra3006
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterTransitionBetaFusion4495 FrostHunterBundlePulseFusionHero2475() {
        FrostHunterObjectAnimatorShadowPixelSpark6651 frostHunterObjectAnimatorShadowPixelSpark6651;
        FrostHunterObjectAnimatorShadowPixelSpark6651 frostHunterObjectAnimatorShadowPixelSpark66512;
        FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium6483 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        CopyOnWriteArrayList copyOnWriteArrayList = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterMeteringPointBetaCyber9571;
        Socket socket = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        FrostHunterObjectAnimatorShadowPixelSpark6651 frostHunterObjectAnimatorShadowPixelSpark66513 = null;
        if (socket == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("TCP not connected");
            return null;
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("already connected");
            return null;
        }
        FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336 = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterDialogFragmentMasterSpectra2557 frostHunterDialogFragmentMasterSpectra2557 = frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761;
        InetSocketAddress inetSocketAddress = frostHunterLooperThreadTitanGamma7336.FrostHunterBundlePulseFusionHero2475;
        FrostHunterDialogFragmentMasterSpectra2557 frostHunterDialogFragmentMasterSpectra25572 = frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761;
        List list = frostHunterDialogFragmentMasterSpectra2557.FrostHunterAlertDialogAuroraDelta3200;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                if (this.FrostHunterFragmentBetaMegaVortex6025 != null) {
                    FrostHunterTransitionBetaFusion4495 FrostHunterKeyframeGammaGamma1197 = FrostHunterKeyframeGammaGamma1197();
                    if (FrostHunterKeyframeGammaGamma1197.FrostHunterBundlePulseFusionHero2475 != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket2 = this.FrostHunterLintTitanVortexQuantum9911;
                        if (socket2 != null) {
                            FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket2);
                        }
                        FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket);
                        return FrostHunterKeyframeGammaGamma1197;
                    }
                }
                if (frostHunterDialogFragmentMasterSpectra25572.FrostHunterBundlePulseFusionHero2475 != null) {
                    FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterTextViewDragonStormMega4297;
                    if (frostHunterTraceHyperionAuroraNebula9947 == null) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("socket");
                        throw null;
                    }
                    if (((FrostHunterConstraintLayoutBetaAlphaNebula8582) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814()) {
                        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula99472 = this.FrostHunterTextViewDragonStormMega4297;
                        if (frostHunterTraceHyperionAuroraNebula99472 == null) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("socket");
                            throw null;
                        }
                        if (((FrostHunterConstraintSetBlazeSpectra9155) frostHunterTraceHyperionAuroraNebula99472.FrostHunterKeyframeGammaGamma1197).FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814()) {
                            SSLSocketFactory sSLSocketFactory = frostHunterDialogFragmentMasterSpectra25572.FrostHunterBundlePulseFusionHero2475;
                            FrostHunterAdMobSpeedMasterSpark5250 frostHunterAdMobSpeedMasterSpark5250 = frostHunterDialogFragmentMasterSpectra25572.FrostHunterCameraXPixelTurboCosmos9814;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, frostHunterAdMobSpeedMasterSpark5250.FrostHunterServiceEliteCelestialThunder1757, frostHunterAdMobSpeedMasterSpark5250.FrostHunterLifecycleBlazeGammaElite2889, true);
                            createSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            FrostHunterObjectAnimatorShadowPixelSpark6651 FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(list, sSLSocket);
                            FrostHunterNavigationViewFusionVortexTitanium1543 frostHunterNavigationViewFusionVortexTitanium1543 = (FrostHunterNavigationViewFusionVortexTitanium1543) list.get(FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterServiceConnectionTurboPhoenixOmega6719);
                            frostHunterObjectAnimatorShadowPixelSpark6651 = FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFragmentBetaMegaVortex6025(list, sSLSocket);
                            try {
                                frostHunterNavigationViewFusionVortexTitanium1543.FrostHunterAlphaAnimationNeoCosmos5761(sSLSocket, FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterLightSensorForceFusion4241);
                                FrostHunterAlertDialogAuroraDelta3200(sSLSocket, frostHunterNavigationViewFusionVortexTitanium1543);
                                frostHunterObjectAnimatorShadowPixelSpark66512 = frostHunterObjectAnimatorShadowPixelSpark6651;
                            } catch (IOException e) {
                                e = e;
                                inetSocketAddress.getClass();
                                frostHunterGuidelineUltraThunderTitanium6483.getClass();
                                if (this.FrostHunterRemoteConfigSpeedSpeed8566 && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    frostHunterObjectAnimatorShadowPixelSpark66513 = frostHunterObjectAnimatorShadowPixelSpark6651;
                                }
                                FrostHunterTransitionBetaFusion4495 frostHunterTransitionBetaFusion4495 = new FrostHunterTransitionBetaFusion4495(this, frostHunterObjectAnimatorShadowPixelSpark66513, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    Socket socket3 = this.FrostHunterLintTitanVortexQuantum9911;
                                    if (socket3 != null) {
                                        FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket3);
                                    }
                                    FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket);
                                }
                                return frostHunterTransitionBetaFusion4495;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.FrostHunterLintTitanVortexQuantum9911 = socket;
                List list2 = frostHunterDialogFragmentMasterSpectra25572.FrostHunterFlowMaxDragonHero5809;
                FrostHunterFragmentManagerShadowForceCyber6887 frostHunterFragmentManagerShadowForceCyber6887 = FrostHunterFragmentManagerShadowForceCyber6887.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(frostHunterFragmentManagerShadowForceCyber6887)) {
                    frostHunterFragmentManagerShadowForceCyber6887 = FrostHunterFragmentManagerShadowForceCyber6887.HTTP_1_1;
                }
                this.FrostHunterResourcesTitanHyperVision5823 = frostHunterFragmentManagerShadowForceCyber6887;
                frostHunterObjectAnimatorShadowPixelSpark66512 = null;
                try {
                    FrostHunterCoroutineScopeBetaMasterRogue7248 frostHunterCoroutineScopeBetaMasterRogue7248 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium64832 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma73362 = this.FrostHunterAlertDialogAuroraDelta3200;
                    Socket socket4 = this.FrostHunterLintTitanVortexQuantum9911;
                    socket4.getClass();
                    FrostHunterMotionEventBetaSpark6296 frostHunterMotionEventBetaSpark6296 = this.FrostHunterCameraXTurboCelestialHero5430;
                    FrostHunterFragmentManagerShadowForceCyber6887 frostHunterFragmentManagerShadowForceCyber68872 = this.FrostHunterResourcesTitanHyperVision5823;
                    frostHunterFragmentManagerShadowForceCyber68872.getClass();
                    FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula99473 = this.FrostHunterTextViewDragonStormMega4297;
                    if (frostHunterTraceHyperionAuroraNebula99473 == null) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("socket");
                        throw null;
                    }
                    frostHunterGuidelineUltraThunderTitanium6483.getClass();
                    FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex4430 = new FrostHunterButtonBlazeOmegaVortex4430(frostHunterCoroutineScopeBetaMasterRogue7248, frostHunterGuidelineUltraThunderTitanium64832, frostHunterLooperThreadTitanGamma73362, socket, socket4, frostHunterMotionEventBetaSpark6296, frostHunterFragmentManagerShadowForceCyber68872, frostHunterTraceHyperionAuroraNebula99473);
                    this.FrostHunterLooperThreadBetaHyperionMax1000 = frostHunterButtonBlazeOmegaVortex4430;
                    frostHunterButtonBlazeOmegaVortex4430.FrostHunterFlowMaxDragonHero5809();
                    inetSocketAddress.getClass();
                    try {
                        FrostHunterTransitionBetaFusion4495 frostHunterTransitionBetaFusion44952 = new FrostHunterTransitionBetaFusion4495(this, (Throwable) null, 6);
                        copyOnWriteArrayList.remove(this);
                        return frostHunterTransitionBetaFusion44952;
                    } catch (IOException e2) {
                        e = e2;
                        frostHunterObjectAnimatorShadowPixelSpark6651 = frostHunterObjectAnimatorShadowPixelSpark66512;
                        z = true;
                        inetSocketAddress.getClass();
                        frostHunterGuidelineUltraThunderTitanium6483.getClass();
                        if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
                            frostHunterObjectAnimatorShadowPixelSpark66513 = frostHunterObjectAnimatorShadowPixelSpark6651;
                        }
                        FrostHunterTransitionBetaFusion4495 frostHunterTransitionBetaFusion44953 = new FrostHunterTransitionBetaFusion4495(this, frostHunterObjectAnimatorShadowPixelSpark66513, e);
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                        }
                        return frostHunterTransitionBetaFusion44953;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                            Socket socket5 = this.FrostHunterLintTitanVortexQuantum9911;
                            if (socket5 != null) {
                                FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket5);
                            }
                            FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    frostHunterObjectAnimatorShadowPixelSpark6651 = frostHunterObjectAnimatorShadowPixelSpark66512;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            frostHunterObjectAnimatorShadowPixelSpark6651 = null;
        }
    }

    @Override // android.content.Context.FrostHunterServiceInfoEpicSpectra3006
    public final FrostHunterServiceInfoEpicSpectra3006 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return new FrostHunterObjectAnimatorShadowPixelSpark6651(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterLevelListDrawableFusionDragonHero2232, this.FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241);
    }

    public final void FrostHunterFlowMaxDragonHero5809() {
        Socket createSocket;
        Proxy.Type type = this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633.type();
        int i = type == null ? -1 : FrostHunterFontFamilyVortexInfernoBlaze4804.FrostHunterAlphaAnimationNeoCosmos5761[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = createSocket;
        if (this.FrostHunterScaleAnimationStrikeSpark5059) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("canceled");
            return;
        }
        createSocket.setSoTimeout(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        try {
            FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889(createSocket, this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterBundlePulseFusionHero2475, this.FrostHunterLifecycleBlazeGammaElite2889);
            try {
                this.FrostHunterTextViewDragonStormMega4297 = new FrostHunterTraceHyperionAuroraNebula9947(new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(createSocket));
            } catch (NullPointerException e) {
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterBundlePulseFusionHero2475);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final FrostHunterObjectAnimatorShadowPixelSpark6651 FrostHunterFragmentBetaMegaVortex6025(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            FrostHunterNavigationViewFusionVortexTitanium1543 frostHunterNavigationViewFusionVortexTitanium1543 = (FrostHunterNavigationViewFusionVortexTitanium1543) list.get(i2);
            frostHunterNavigationViewFusionVortexTitanium1543.getClass();
            if (frostHunterNavigationViewFusionVortexTitanium1543.FrostHunterAlphaAnimationNeoCosmos5761 && (((strArr = frostHunterNavigationViewFusionVortexTitanium1543.FrostHunterServiceEliteCelestialThunder1757) == null || FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterLifecycleBlazeGammaElite2889(strArr, sSLSocket.getEnabledProtocols(), FrostHunterLocationManagerSparkInfernoQuantum6284.FrostHunterFlowMaxDragonHero5809)) && ((strArr2 = frostHunterNavigationViewFusionVortexTitanium1543.FrostHunterBundlePulseFusionHero2475) == null || FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterLifecycleBlazeGammaElite2889(strArr2, sSLSocket.getEnabledCipherSuites(), FrostHunterModelInputOutputInfernoBlaze5651.FrostHunterBundlePulseFusionHero2475)))) {
                return new FrostHunterObjectAnimatorShadowPixelSpark6651(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterLevelListDrawableFusionDragonHero2232, this.FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, i2, i != -1);
            }
        }
        return null;
    }

    public final FrostHunterTransitionBetaFusion4495 FrostHunterKeyframeGammaGamma1197() {
        FrostHunterLifecycleCameraControllerStormAlpha3266 frostHunterLifecycleCameraControllerStormAlpha3266 = this.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterLifecycleCameraControllerStormAlpha3266.getClass();
        FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336 = this.FrostHunterAlertDialogAuroraDelta3200;
        String str = "CONNECT " + FrostHunterTextureViewForceEpicQuantum6388.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814, true) + " HTTP/1.1";
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterTextViewDragonStormMega4297;
        if (frostHunterTraceHyperionAuroraNebula9947 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("socket");
            throw null;
        }
        FrostHunterTimerAuroraNeoAurora3531 frostHunterTimerAuroraNeoAurora3531 = new FrostHunterTimerAuroraNeoAurora3531(null, this, frostHunterTraceHyperionAuroraNebula9947);
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula99472 = this.FrostHunterTextViewDragonStormMega4297;
        if (frostHunterTraceHyperionAuroraNebula99472 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("socket");
            throw null;
        }
        FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475 = ((FrostHunterConstraintLayoutBetaAlphaNebula8582) frostHunterTraceHyperionAuroraNebula99472.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475();
        long j = this.FrostHunterBundlePulseFusionHero2475;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        FrostHunterBundlePulseFusionHero2475.FrostHunterRemoteConfigSpeedSpeed8566(j, timeUnit);
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula99473 = this.FrostHunterTextViewDragonStormMega4297;
        if (frostHunterTraceHyperionAuroraNebula99473 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("socket");
            throw null;
        }
        ((FrostHunterConstraintSetBlazeSpectra9155) frostHunterTraceHyperionAuroraNebula99473.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475().FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterServiceEliteCelestialThunder1757, timeUnit);
        frostHunterTimerAuroraNeoAurora3531.FrostHunterFragmentBetaMegaVortex6025(frostHunterLifecycleCameraControllerStormAlpha3266.FrostHunterBundlePulseFusionHero2475, str);
        frostHunterTimerAuroraNeoAurora3531.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterCountDownTimerSparkStorm4778 FrostHunterAlertDialogAuroraDelta3200 = frostHunterTimerAuroraNeoAurora3531.FrostHunterAlertDialogAuroraDelta3200(false);
        FrostHunterAlertDialogAuroraDelta3200.getClass();
        FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLifecycleCameraControllerStormAlpha3266;
        FrostHunterThemeOverlayAlphaUltra2883 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761();
        int i = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197;
        long FrostHunterServiceEliteCelestialThunder1757 = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterServiceEliteCelestialThunder1757(FrostHunterAlphaAnimationNeoCosmos5761);
        if (FrostHunterServiceEliteCelestialThunder1757 != -1) {
            FrostHunterFilterShadowCelestial9261 FrostHunterKeyframeGammaGamma1197 = frostHunterTimerAuroraNeoAurora3531.FrostHunterKeyframeGammaGamma1197(FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterServiceEliteCelestialThunder1757);
            FrostHunterTextureViewForceEpicQuantum6388.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyframeGammaGamma1197, Integer.MAX_VALUE);
            FrostHunterKeyframeGammaGamma1197.close();
        }
        if (i == 200) {
            return new FrostHunterTransitionBetaFusion4495(this, (Throwable) null, 6);
        }
        if (i != 407) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Unexpected response code for CONNECT: ", i));
            return null;
        }
        frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232.getClass();
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Failed to authenticate with proxy");
        return null;
    }

    @Override // android.content.Context.FrostHunterServiceInfoEpicSpectra3006
    public final FrostHunterTransitionBetaFusion4495 FrostHunterLevelListDrawableFusionDragonHero2232() {
        Socket socket;
        Socket socket2;
        FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium6483 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336 = this.FrostHunterAlertDialogAuroraDelta3200;
        CopyOnWriteArrayList copyOnWriteArrayList = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterMeteringPointBetaCyber9571;
        if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                frostHunterLooperThreadTitanGamma7336.FrostHunterBundlePulseFusionHero2475.getClass();
                frostHunterGuidelineUltraThunderTitanium6483.getClass();
                FrostHunterFlowMaxDragonHero5809();
                z = true;
                FrostHunterTransitionBetaFusion4495 frostHunterTransitionBetaFusion4495 = new FrostHunterTransitionBetaFusion4495(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return frostHunterTransitionBetaFusion4495;
            } catch (IOException e) {
                FrostHunterDialogFragmentMasterSpectra2557 frostHunterDialogFragmentMasterSpectra2557 = frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterLooperThreadTitanGamma7336.FrostHunterConstraintSetCloneMasterUltraRogue2633.type() != Proxy.Type.DIRECT) {
                    FrostHunterDialogFragmentMasterSpectra2557 frostHunterDialogFragmentMasterSpectra25572 = frostHunterLooperThreadTitanGamma7336.FrostHunterAlphaAnimationNeoCosmos5761;
                    frostHunterDialogFragmentMasterSpectra25572.FrostHunterRemoteConfigSpeedSpeed8566.connectFailed(frostHunterDialogFragmentMasterSpectra25572.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(), frostHunterLooperThreadTitanGamma7336.FrostHunterConstraintSetCloneMasterUltraRogue2633.address(), e);
                }
                frostHunterLooperThreadTitanGamma7336.FrostHunterBundlePulseFusionHero2475.getClass();
                frostHunterGuidelineUltraThunderTitanium6483.getClass();
                FrostHunterTransitionBetaFusion4495 frostHunterTransitionBetaFusion44952 = new FrostHunterTransitionBetaFusion4495(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) != null) {
                    FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket2);
                }
                return frostHunterTransitionBetaFusion44952;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) != null) {
                FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket);
            }
            throw th;
        }
    }

    @Override // android.content.Context.FrostHunterContentResolverOmegaDragon8329
    public final FrostHunterLooperThreadTitanGamma7336 FrostHunterLifecycleBlazeGammaElite2889() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    public final FrostHunterObjectAnimatorShadowPixelSpark6651 FrostHunterServiceConnectionTurboPhoenixOmega6719(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719 != -1) {
            return this;
        }
        FrostHunterObjectAnimatorShadowPixelSpark6651 FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025(list, sSLSocket);
        if (FrostHunterFragmentBetaMegaVortex6025 != null) {
            return FrostHunterFragmentBetaMegaVortex6025;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.FrostHunterLightSensorForceFusion4241);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // android.content.Context.FrostHunterServiceInfoEpicSpectra3006
    public final FrostHunterButtonBlazeOmegaVortex4430 FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceInfoHyperionSparkMax9966;
        FrostHunterLooperThreadTitanGamma7336 frostHunterLooperThreadTitanGamma7336 = this.FrostHunterAlertDialogAuroraDelta3200;
        synchronized (frostHunterAnimatorQuantumFusionMaster8565) {
            frostHunterLooperThreadTitanGamma7336.getClass();
            ((LinkedHashSet) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809).remove(frostHunterLooperThreadTitanGamma7336);
        }
        FrostHunterButtonBlazeOmegaVortex4430 frostHunterButtonBlazeOmegaVortex4430 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        frostHunterButtonBlazeOmegaVortex4430.getClass();
        this.FrostHunterAlertDialogAuroraDelta3200.getClass();
        FrostHunterDigitalInkRecognitionDeltaAurora4203 FrostHunterServiceEliteCelestialThunder1757 = this.FrostHunterFlowMaxDragonHero5809.FrostHunterServiceEliteCelestialThunder1757(this, this.FrostHunterKeyframeGammaGamma1197);
        if (FrostHunterServiceEliteCelestialThunder1757 != null) {
            return FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        synchronized (frostHunterButtonBlazeOmegaVortex4430) {
            FrostHunterGuidelineUltraThunderTitanium6483 frostHunterGuidelineUltraThunderTitanium6483 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterGuidelineUltraThunderTitanium6483.getClass();
            TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterGuidelineUltraThunderTitanium6483.FrostHunterServiceEliteCelestialThunder1757.add(frostHunterButtonBlazeOmegaVortex4430);
            frostHunterGuidelineUltraThunderTitanium6483.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475(frostHunterGuidelineUltraThunderTitanium6483.FrostHunterBundlePulseFusionHero2475, 0L);
            this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterButtonBlazeOmegaVortex4430);
        }
        return frostHunterButtonBlazeOmegaVortex4430;
    }

    @Override // android.content.Context.FrostHunterServiceInfoEpicSpectra3006
    public final void cancel() {
        this.FrostHunterScaleAnimationStrikeSpark5059 = true;
        Socket socket = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (socket != null) {
            FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633(socket);
        }
    }

    @Override // android.content.Context.FrostHunterContentResolverOmegaDragon8329
    public final void FrostHunterCameraXPixelTurboCosmos9814() {
    }

    @Override // android.content.Context.FrostHunterContentResolverOmegaDragon8329
    public final void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865, IOException iOException) {
    }
}
