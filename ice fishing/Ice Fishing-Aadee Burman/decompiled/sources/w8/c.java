package w8;

import Q7.i;
import Q7.q;
import com.anythink.core.common.d.j;
import java.security.cert.Certificate;
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
import kotlin.jvm.internal.h;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f41694a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        C5135p c5135p = C5135p.f41439n;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return c5135p;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && h.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0073->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String host, X509Certificate x509Certificate) {
        boolean z3;
        int length;
        h.e(host, "host");
        i iVar = j8.b.f38481a;
        i iVar2 = j8.b.f38481a;
        iVar2.getClass();
        if (iVar2.f2685n.matcher(host).matches()) {
            String b9 = j8.b.b(host);
            List a9 = a(x509Certificate, 7);
            if (!a9.isEmpty()) {
                Iterator it = a9.iterator();
                while (it.hasNext()) {
                    if (h.a(b9, j8.b.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) y8.b.g(host))) {
            Locale US = Locale.US;
            h.d(US, "US");
            host = host.toLowerCase(US);
            h.d(host, "toLowerCase(...)");
        }
        List<String> a10 = a(x509Certificate, 2);
        if (!a10.isEmpty()) {
            for (String str : a10) {
                if (host.length() != 0 && !q.R(host, j.f12378z) && !q.K(host, "..") && str != null && str.length() != 0 && !q.R(str, j.f12378z) && !q.K(str, "..")) {
                    String concat = !q.K(host, j.f12378z) ? host.concat(j.f12378z) : host;
                    if (!q.K(str, j.f12378z)) {
                        str = str.concat(j.f12378z);
                    }
                    if (str.length() == ((int) y8.b.g(str))) {
                        Locale US2 = Locale.US;
                        h.d(US2, "US");
                        str = str.toLowerCase(US2);
                        h.d(str, "toLowerCase(...)");
                    }
                    if (!Q7.j.U(str, "*", false)) {
                        z3 = h.a(concat, str);
                    } else if (q.R(str, "*.") && Q7.j.Z(str, '*', 1, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                        String substring = str.substring(1);
                        h.d(substring, "substring(...)");
                        if (q.K(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || Q7.j.e0(concat, length - 1, 4, '.') == -1)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        return true;
                    }
                }
                z3 = false;
                if (!z3) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        h.e(host, "host");
        h.e(session, "session");
        if (host.length() == ((int) y8.b.g(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                h.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
