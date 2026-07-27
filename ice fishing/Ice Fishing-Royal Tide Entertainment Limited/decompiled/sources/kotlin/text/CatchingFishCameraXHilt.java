package kotlin.text;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class CatchingFishCameraXHilt {
    public static final CatchingFishCameraXHilt CatchingFishCoroutine = new CatchingFishCameraXHilt(new LinkedHashSet(new ArrayList()), null);
    public final LinkedHashSet CatchingFishParcelableFAB;
    public final CatchingFishGsonCardView CatchingFishSnackbar;

    public CatchingFishCameraXHilt(LinkedHashSet linkedHashSet, CatchingFishGsonCardView catchingFishGsonCardView) {
        this.CatchingFishParcelableFAB = linkedHashSet;
        this.CatchingFishSnackbar = catchingFishGsonCardView;
    }

    public static String CatchingFishSnackbar(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + CatchingFishWebSocketMockk.CatchingFishViewModelFAB(x509Certificate.getPublicKey().getEncoded()).CatchingFishCoroutine("SHA-256").CatchingFishParcelableFAB();
    }

    public final void CatchingFishParcelableFAB(String str, List list) {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.CatchingFishParcelableFAB.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (list2.isEmpty()) {
            return;
        }
        CatchingFishGsonCardView catchingFishGsonCardView = this.CatchingFishSnackbar;
        if (catchingFishGsonCardView != null) {
            list = catchingFishGsonCardView.CatchingFishEspressoTesting(str, list);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list2.size() > 0) {
                list2.get(0).getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ");
            sb.append(CatchingFishSnackbar(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (list2.get(i3) != null) {
                throw new ClassCastException();
            }
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishCameraXHilt)) {
            return false;
        }
        CatchingFishCameraXHilt catchingFishCameraXHilt = (CatchingFishCameraXHilt) obj;
        return Objects.equals(this.CatchingFishSnackbar, catchingFishCameraXHilt.CatchingFishSnackbar) && this.CatchingFishParcelableFAB.equals(catchingFishCameraXHilt.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() + (Objects.hashCode(this.CatchingFishSnackbar) * 31);
    }
}
