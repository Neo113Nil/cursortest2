package android.content.Context;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirebaseModelInterpreterSparkMaxDragon7855 implements FrostHunterDiffUtilPrimeDragon5767 {
    public static final FrostHunterConfigurationMaxCosmos6905 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterConfigurationMaxCosmos6905();
    public static final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, FrostHunterClipboardManagerTitaniumSolar2256.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (FrostHunterClipboardManagerTitaniumSolar2256.FrostHunterAlphaAnimationNeoCosmos5761()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final String FrostHunterAlphaAnimationNeoCosmos5761(SSLSocket sSLSocket) {
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final void FrostHunterServiceEliteCelestialThunder1757(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) FrostHunterMagnetometerInfernoDragon1607.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(list).toArray(new String[0]));
        }
    }
}
