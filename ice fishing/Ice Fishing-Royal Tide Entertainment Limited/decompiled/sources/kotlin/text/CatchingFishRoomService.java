package kotlin.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class CatchingFishRoomService implements CatchingFishRealmEspresso {
    public final X509TrustManager CatchingFishParcelableFAB;
    public final Method CatchingFishSnackbar;

    public CatchingFishRoomService(X509TrustManager x509TrustManager, Method method) {
        this.CatchingFishSnackbar = method;
        this.CatchingFishParcelableFAB = x509TrustManager;
    }

    @Override // kotlin.text.CatchingFishRealmEspresso
    public final X509Certificate CatchingFishParcelableFAB(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.CatchingFishSnackbar.invoke(this.CatchingFishParcelableFAB, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishRoomService)) {
            return false;
        }
        CatchingFishRoomService catchingFishRoomService = (CatchingFishRoomService) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishRoomService.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishRoomService.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return (this.CatchingFishSnackbar.hashCode() * 31) + this.CatchingFishParcelableFAB.hashCode();
    }
}
