package kotlin.text;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class CatchingFishRealmWidget {
    public final List CatchingFishCoroutine;
    public final CatchingFishGradleGradle CatchingFishParcelableFAB;
    public final List CatchingFishReduxKtor;
    public final CatchingFishViewModelMoshi CatchingFishSnackbar;

    public CatchingFishRealmWidget(CatchingFishGradleGradle catchingFishGradleGradle, CatchingFishViewModelMoshi catchingFishViewModelMoshi, List list, List list2) {
        this.CatchingFishParcelableFAB = catchingFishGradleGradle;
        this.CatchingFishSnackbar = catchingFishViewModelMoshi;
        this.CatchingFishCoroutine = list;
        this.CatchingFishReduxKtor = list2;
    }

    public static CatchingFishRealmWidget CatchingFishParcelableFAB(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        CatchingFishViewModelMoshi CatchingFishParcelableFAB = CatchingFishViewModelMoshi.CatchingFishParcelableFAB(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        CatchingFishGradleGradle CatchingFishParcelableFAB2 = CatchingFishGradleGradle.CatchingFishParcelableFAB(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List CatchingFishLayout = certificateArr != null ? CatchingFishEspressoDagger.CatchingFishLayout(certificateArr) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new CatchingFishRealmWidget(CatchingFishParcelableFAB2, CatchingFishParcelableFAB, CatchingFishLayout, localCertificates != null ? CatchingFishEspressoDagger.CatchingFishLayout(localCertificates) : Collections.EMPTY_LIST);
    }

    public static ArrayList CatchingFishSnackbar(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishRealmWidget)) {
            return false;
        }
        CatchingFishRealmWidget catchingFishRealmWidget = (CatchingFishRealmWidget) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishRealmWidget.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishRealmWidget.CatchingFishSnackbar) && this.CatchingFishCoroutine.equals(catchingFishRealmWidget.CatchingFishCoroutine) && this.CatchingFishReduxKtor.equals(catchingFishRealmWidget.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishCoroutine.hashCode() + ((this.CatchingFishSnackbar.hashCode() + ((this.CatchingFishParcelableFAB.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.CatchingFishParcelableFAB + " cipherSuite=" + this.CatchingFishSnackbar + " peerCertificates=" + CatchingFishSnackbar(this.CatchingFishCoroutine) + " localCertificates=" + CatchingFishSnackbar(this.CatchingFishReduxKtor) + '}';
    }
}
