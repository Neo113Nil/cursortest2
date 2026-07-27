package kotlin.text;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class CatchingFishGlideOkHttp implements HostnameVerifier {
    public static final CatchingFishGlideOkHttp CatchingFishParcelableFAB = new CatchingFishGlideOkHttp();

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:14:0x003a->B:43:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean CatchingFishCoroutine(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        if (CatchingFishEspressoDagger.CatchingFishViewModelFAB.matcher(str).matches()) {
            List CatchingFishSnackbar = CatchingFishSnackbar(x509Certificate, 7);
            int size = CatchingFishSnackbar.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) CatchingFishSnackbar.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str2 : CatchingFishSnackbar(x509Certificate, 2)) {
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                String concat = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                if (!str2.endsWith(".")) {
                    str2 = str2.concat(".");
                }
                String lowerCase2 = str2.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    z = concat.equals(lowerCase2);
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && concat.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String substring = lowerCase2.substring(1);
                    if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || concat.lastIndexOf(46, length - 1) == -1)) {
                        z = true;
                    }
                }
                if (!z) {
                    return true;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    public static ArrayList CatchingFishParcelableFAB(X509Certificate x509Certificate) {
        List CatchingFishSnackbar = CatchingFishSnackbar(x509Certificate, 7);
        List CatchingFishSnackbar2 = CatchingFishSnackbar(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(CatchingFishSnackbar2.size() + CatchingFishSnackbar.size());
        arrayList.addAll(CatchingFishSnackbar);
        arrayList.addAll(CatchingFishSnackbar2);
        return arrayList;
    }

    public static List CatchingFishSnackbar(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return CatchingFishCoroutine(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
