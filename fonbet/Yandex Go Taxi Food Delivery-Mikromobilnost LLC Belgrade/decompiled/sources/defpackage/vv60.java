package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vv60 implements HostnameVerifier {
    public static final vv60 a = new vv60();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && jl40.l(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:1: B:26:0x006b->B:56:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        if (wf61.a.h(str)) {
            String b = wf61.b(str);
            List a2 = a(x509Certificate, 7);
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (jl40.l(b, wf61.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) q5z.d0(str))) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> a3 = a(x509Certificate, 2);
        if (!(a3 instanceof Collection) || !a3.isEmpty()) {
            for (String str2 : a3) {
                if (str.length() != 0 && !cvu0.x(str, Extension.DOT_CHAR, false) && !cvu0.s(str, "..", false) && str2 != null && str2.length() != 0 && !cvu0.x(str2, Extension.DOT_CHAR, false) && !cvu0.s(str2, "..", false)) {
                    String concat = !cvu0.s(str, Extension.DOT_CHAR, false) ? str.concat(Extension.DOT_CHAR) : str;
                    if (!cvu0.s(str2, Extension.DOT_CHAR, false)) {
                        str2 = str2.concat(Extension.DOT_CHAR);
                    }
                    if (str2.length() == ((int) q5z.d0(str2))) {
                        str2 = str2.toLowerCase(Locale.US);
                    }
                    if (!evu0.y(str2, "*", false)) {
                        z = concat.equals(str2);
                    } else if (cvu0.x(str2, "*.", false) && evu0.G(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (cvu0.s(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || evu0.K(concat, '.', length - 1, 4) == -1)) {
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
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (str.length() == ((int) q5z.d0(str))) {
            try {
                return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
