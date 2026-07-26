package android.content.Context;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPackageManagerMaxMega8964 extends FrostHunterJavaBetaCosmos7744 implements FrostHunterDelayBlazePhoenix5124 {
    public static final boolean FrostHunterLifecycleBlazeGammaElite2889;
    public Context FrostHunterBundlePulseFusionHero2475;
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterLifecycleBlazeGammaElite2889 = Build.VERSION.SDK_INT < 29;
    }

    public FrostHunterPackageManagerMaxMega8964() {
        FrostHunterViewNovaTitanium9237 frostHunterViewNovaTitanium9237;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            frostHunterViewNovaTitanium9237 = new FrostHunterViewNovaTitanium9237(cls);
        } catch (Exception e) {
            CopyOnWriteArraySet copyOnWriteArraySet = FrostHunterFragmentTransactionMasterOlympianTitanium5654.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterFragmentTransactionMasterOlympianTitanium5654.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterPreviewThunderShadowBeta2697.class.getName(), 5, "unable to load android socket classes", e);
            frostHunterViewNovaTitanium9237 = null;
        }
        int i = 0;
        ArrayList FrostHunterAnnotationProcessorSolarSpeedNebula4443 = FrostHunterContextSolarMegaPhantom7469.FrostHunterAnnotationProcessorSolarSpeedNebula4443(new FrostHunterDiffUtilPrimeDragon5767[]{frostHunterViewNovaTitanium9237, new FrostHunterStateSpeedThunder9851(FrostHunterServiceInfoMaxLegend6639.FrostHunterLifecycleBlazeGammaElite2889), new FrostHunterStateSpeedThunder9851(FrostHunterFirebaseModelInterpreterSparkMaxDragon7855.FrostHunterAlphaAnimationNeoCosmos5761), new FrostHunterStateSpeedThunder9851(FrostHunterMotionLayoutTransitionShadowAuroraTitanium6042.FrostHunterAlphaAnimationNeoCosmos5761)});
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

    @Override // android.content.Context.FrostHunterDelayBlazePhoenix5124
    public final void FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        this.FrostHunterBundlePulseFusionHero2475 = context;
    }

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final FrostHunterTransitionGammaTitanSpeed7178 FrostHunterBundlePulseFusionHero2475(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        FrostHunterMotionSceneHyperionHyperPhoenix3425 frostHunterShapeAppearancePhantomSparkNova5486;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        FrostHunterNestedScrollViewVisionVision4024 frostHunterNestedScrollViewVisionVision4024 = x509TrustManagerExtensions != null ? new FrostHunterNestedScrollViewVisionVision4024(x509TrustManager, x509TrustManagerExtensions) : null;
        if (frostHunterNestedScrollViewVisionVision4024 != null) {
            return frostHunterNestedScrollViewVisionVision4024;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            frostHunterShapeAppearancePhantomSparkNova5486 = new FrostHunterObserverAlphaMegaCelestial4063(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            frostHunterShapeAppearancePhantomSparkNova5486 = new FrostHunterShapeAppearancePhantomSparkNova5486((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new FrostHunterRoomCelestialInferno9531(frostHunterShapeAppearancePhantomSparkNova5486);
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
    public final void FrostHunterLifecycleBlazeGammaElite2889(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
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

    @Override // android.content.Context.FrostHunterJavaBetaCosmos7744
    public final void FrostHunterFlowMaxDragonHero5809(String str, int i) {
    }
}
