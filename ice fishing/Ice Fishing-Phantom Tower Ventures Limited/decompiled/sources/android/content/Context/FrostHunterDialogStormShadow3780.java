package android.content.Context;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDialogStormShadow3780 implements FrostHunterDiffUtilPrimeDragon5767 {
    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final String FrostHunterAlphaAnimationNeoCosmos5761(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final void FrostHunterServiceEliteCelestialThunder1757(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
            sSLParameters.setApplicationProtocols((String[]) FrostHunterMagnetometerInfernoDragon1607.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
