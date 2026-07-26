package android.content.Context;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionLayoutTransitionShadowAuroraTitanium6042 implements FrostHunterDiffUtilPrimeDragon5767 {
    public static final FrostHunterCameraXPrimeMega6165 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterCameraXPrimeMega6165();
    public static final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, FrostHunterRemoteConfigPhantomDelta1739.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final String FrostHunterAlphaAnimationNeoCosmos5761(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(SSLSocket sSLSocket) {
        return false;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final void FrostHunterServiceEliteCelestialThunder1757(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
            parameters.setApplicationProtocols((String[]) FrostHunterMagnetometerInfernoDragon1607.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
