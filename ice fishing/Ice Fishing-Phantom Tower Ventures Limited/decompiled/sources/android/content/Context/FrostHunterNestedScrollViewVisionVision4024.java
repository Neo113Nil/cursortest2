package android.content.Context;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNestedScrollViewVisionVision4024 extends FrostHunterTransitionGammaTitanSpeed7178 {
    public final X509TrustManagerExtensions FrostHunterLightSensorForceFusion4241;
    public final X509TrustManager FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterNestedScrollViewVisionVision4024(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = x509TrustManager;
        this.FrostHunterLightSensorForceFusion4241 = x509TrustManagerExtensions;
    }

    @Override // android.content.Context.FrostHunterTransitionGammaTitanSpeed7178
    public final List FrostHunterServiceConnectionTurboPhoenixOmega6719(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.FrostHunterLightSensorForceFusion4241.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FrostHunterNestedScrollViewVisionVision4024) && ((FrostHunterNestedScrollViewVisionVision4024) obj).FrostHunterServiceConnectionTurboPhoenixOmega6719 == this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    public final int hashCode() {
        return System.identityHashCode(this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
    }
}
