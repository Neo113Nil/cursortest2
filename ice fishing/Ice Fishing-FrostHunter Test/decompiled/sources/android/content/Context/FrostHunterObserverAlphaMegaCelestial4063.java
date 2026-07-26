package android.content.Context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObserverAlphaMegaCelestial4063 implements FrostHunterMotionSceneHyperionHyperPhoenix3425 {
    public final X509TrustManager FrostHunterAlphaAnimationNeoCosmos5761;
    public final Method FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterObserverAlphaMegaCelestial4063(X509TrustManager x509TrustManager, Method method) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = x509TrustManager;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = method;
    }

    @Override // android.content.Context.FrostHunterMotionSceneHyperionHyperPhoenix3425
    public final X509Certificate FrostHunterAlphaAnimationNeoCosmos5761(X509Certificate x509Certificate) {
        try {
            Object invoke = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.invoke(this.FrostHunterAlphaAnimationNeoCosmos5761, x509Certificate);
            invoke.getClass();
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterObserverAlphaMegaCelestial4063)) {
            return false;
        }
        FrostHunterObserverAlphaMegaCelestial4063 frostHunterObserverAlphaMegaCelestial4063 = (FrostHunterObserverAlphaMegaCelestial4063) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterObserverAlphaMegaCelestial4063.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterObserverAlphaMegaCelestial4063.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() + (this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", findByIssuerAndSignatureMethod=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ')';
    }
}
