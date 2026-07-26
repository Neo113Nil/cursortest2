package android.content.Context;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterJavaBetaCosmos7744 {
    public static volatile FrostHunterJavaBetaCosmos7744 FrostHunterAlphaAnimationNeoCosmos5761;
    public static final Logger FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        try {
            for (Map.Entry entry : FrostHunterFragmentTransactionMasterOlympianTitanium5654.FrostHunterConstraintSetCloneMasterUltraRogue2633.entrySet()) {
                FrostHunterFragmentTransactionMasterOlympianTitanium5654.FrostHunterConstraintSetCloneMasterUltraRogue2633((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        FrostHunterJavaBetaCosmos7744 frostHunterGradlePluginSpectraCyber2087 = FrostHunterGradlePluginSpectraCyber2087.FrostHunterLifecycleBlazeGammaElite2889 ? new FrostHunterGradlePluginSpectraCyber2087() : null;
        if (frostHunterGradlePluginSpectraCyber2087 == null) {
            frostHunterGradlePluginSpectraCyber2087 = FrostHunterPackageManagerMaxMega8964.FrostHunterLifecycleBlazeGammaElite2889 ? new FrostHunterPackageManagerMaxMega8964() : null;
        }
        if (frostHunterGradlePluginSpectraCyber2087 == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterGradlePluginSpectraCyber2087;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = Logger.getLogger(FrostHunterPreviewThunderShadowBeta2697.class.getName());
    }

    public void FrostHunterAlertDialogAuroraDelta3200(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        FrostHunterFlowMaxDragonHero5809(str, 5);
    }

    public abstract FrostHunterTransitionGammaTitanSpeed7178 FrostHunterBundlePulseFusionHero2475(X509TrustManager x509TrustManager);

    public abstract boolean FrostHunterCameraXPixelTurboCosmos9814(String str);

    public abstract void FrostHunterFlowMaxDragonHero5809(String str, int i);

    public abstract SSLContext FrostHunterKeyframeGammaGamma1197();

    public abstract String FrostHunterLevelListDrawableFusionDragonHero2232(SSLSocket sSLSocket);

    public void FrostHunterLifecycleBlazeGammaElite2889(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public Object FrostHunterRemoteConfigSpeedSpeed8566() {
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract void FrostHunterServiceEliteCelestialThunder1757(SSLSocket sSLSocket, String str, List list);

    public final String toString() {
        return getClass().getSimpleName();
    }
}
