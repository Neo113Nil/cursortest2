package android.content.Context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterServiceInfoMaxLegend6639 implements FrostHunterDiffUtilPrimeDragon5767 {
    public static final FrostHunterRippleDrawableBlazeBetaStorm6320 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterRippleDrawableBlazeBetaStorm6320(20);
    public final Class FrostHunterAlphaAnimationNeoCosmos5761;
    public final Method FrostHunterBundlePulseFusionHero2475;
    public final Method FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final Method FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterServiceInfoMaxLegend6639(Class cls) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.FrostHunterBundlePulseFusionHero2475 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.FrostHunterServiceEliteCelestialThunder1757 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final String FrostHunterAlphaAnimationNeoCosmos5761(SSLSocket sSLSocket) {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.FrostHunterBundlePulseFusionHero2475.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        boolean z = FrostHunterPackageManagerMaxMega8964.FrostHunterLifecycleBlazeGammaElite2889;
        return FrostHunterPackageManagerMaxMega8964.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(SSLSocket sSLSocket) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.isInstance(sSLSocket);
    }

    @Override // android.content.Context.FrostHunterDiffUtilPrimeDragon5767
    public final void FrostHunterServiceEliteCelestialThunder1757(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.FrostHunterAlphaAnimationNeoCosmos5761.isInstance(sSLSocket)) {
            try {
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterJavaBetaCosmos7744 frostHunterJavaBetaCosmos7744 = FrostHunterJavaBetaCosmos7744.FrostHunterAlphaAnimationNeoCosmos5761;
                method.invoke(sSLSocket, FrostHunterMagnetometerInfernoDragon1607.FrostHunterLintTitanVortexQuantum9911(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
