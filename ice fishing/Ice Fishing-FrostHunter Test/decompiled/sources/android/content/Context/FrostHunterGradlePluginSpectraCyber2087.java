package android.content.Context;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradlePluginSpectraCyber2087 extends FrostHunterJavaBetaCosmos7744 implements FrostHunterDelayBlazePhoenix5124 {
    public static final boolean FrostHunterLifecycleBlazeGammaElite2889;
    public Context FrostHunterBundlePulseFusionHero2475;
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterLifecycleBlazeGammaElite2889 = Build.VERSION.SDK_INT >= 29;
    }

    public FrostHunterGradlePluginSpectraCyber2087() {
        int i = 0;
        ArrayList FrostHunterAnnotationProcessorSolarSpeedNebula4443 = FrostHunterContextSolarMegaPhantom7469.FrostHunterAnnotationProcessorSolarSpeedNebula4443(new FrostHunterDiffUtilPrimeDragon5767[]{Build.VERSION.SDK_INT >= 29 ? new FrostHunterDialogStormShadow3780() : null, new FrostHunterStateSpeedThunder9851(FrostHunterServiceInfoMaxLegend6639.FrostHunterLifecycleBlazeGammaElite2889), new FrostHunterStateSpeedThunder9851(FrostHunterFirebaseModelInterpreterSparkMaxDragon7855.FrostHunterAlphaAnimationNeoCosmos5761), new FrostHunterStateSpeedThunder9851(FrostHunterMotionLayoutTransitionShadowAuroraTitanium6042.FrostHunterAlphaAnimationNeoCosmos5761)});
        ArrayList arrayList = new ArrayList();
        int size = FrostHunterAnnotationProcessorSolarSpeedNebula4443.size();
        while (i < size) {
            Object obj = FrostHunterAnnotationProcessorSolarSpeedNebula4443.get(i);
            i++;
            if (((FrostHunterDiffUtilPrimeDragon5767) obj).FrostHunterBundlePulseFusionHero2475()) {
                arrayList.add(obj);
            }
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = arrayList;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final void FrostHunterAlertDialogAuroraDelta3200(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.FrostHunterAlertDialogAuroraDelta3200(obj, str);
        } else {
            obj.getClass();
            FrostHunterExecutorDragonPhantom9516.FrostHunterAlertDialogAuroraDelta3200(obj).warnIfOpen();
        }
    }

    @Override // android.content.Context.FrostHunterDelayBlazePhoenix5124
    public final void FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        this.FrostHunterBundlePulseFusionHero2475 = context;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final FrostHunterTransitionGammaTitanSpeed7178 FrostHunterBundlePulseFusionHero2475(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        FrostHunterNestedScrollViewVisionVision4024 frostHunterNestedScrollViewVisionVision4024 = x509TrustManagerExtensions != null ? new FrostHunterNestedScrollViewVisionVision4024(x509TrustManager, x509TrustManagerExtensions) : null;
        if (frostHunterNestedScrollViewVisionVision4024 != null) {
            return frostHunterNestedScrollViewVisionVision4024;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new FrostHunterRoomCelestialInferno9531(new FrostHunterShapeAppearancePhantomSparkNova5486((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final boolean FrostHunterCameraXPixelTurboCosmos9814(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // android.content.Context.FrostHunterDelayBlazePhoenix5124
    public final Context FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final void FrostHunterFlowMaxDragonHero5809(String str, int i) {
        if (i == 5) {
            boolean z = FrostHunterPackageManagerMaxMega8964.FrostHunterLifecycleBlazeGammaElite2889;
        } else {
            boolean z2 = FrostHunterPackageManagerMaxMega8964.FrostHunterLifecycleBlazeGammaElite2889;
        }
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final SSLContext FrostHunterKeyframeGammaGamma1197() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final String FrostHunterLevelListDrawableFusionDragonHero2232(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.FrostHunterServiceEliteCelestialThunder1757;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((FrostHunterDiffUtilPrimeDragon5767) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633(sSLSocket)) {
                break;
            }
        }
        FrostHunterDiffUtilPrimeDragon5767 frostHunterDiffUtilPrimeDragon5767 = (FrostHunterDiffUtilPrimeDragon5767) obj;
        if (frostHunterDiffUtilPrimeDragon5767 != null) {
            return frostHunterDiffUtilPrimeDragon5767.FrostHunterAlphaAnimationNeoCosmos5761(sSLSocket);
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final Object FrostHunterRemoteConfigSpeedSpeed8566() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.FrostHunterRemoteConfigSpeedSpeed8566();
        }
        CloseGuard FrostHunterFlowMaxDragonHero5809 = FrostHunterExecutorDragonPhantom9516.FrostHunterFlowMaxDragonHero5809();
        FrostHunterFlowMaxDragonHero5809.open("response.body().close()");
        return FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final void FrostHunterServiceEliteCelestialThunder1757(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.FrostHunterServiceEliteCelestialThunder1757;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((FrostHunterDiffUtilPrimeDragon5767) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633(sSLSocket)) {
                break;
            }
        }
        FrostHunterDiffUtilPrimeDragon5767 frostHunterDiffUtilPrimeDragon5767 = (FrostHunterDiffUtilPrimeDragon5767) obj;
        if (frostHunterDiffUtilPrimeDragon5767 != null) {
            frostHunterDiffUtilPrimeDragon5767.FrostHunterServiceEliteCelestialThunder1757(sSLSocket, str, list);
        }
    }
}
