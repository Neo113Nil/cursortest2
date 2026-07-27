package s8;

import M7.i;
import M7.q;
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
import r7.C4985p;

/* loaded from: classes2.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f40527a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        C4985p c4985p = C4985p.f40358n;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return c4985p;
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
        boolean z8;
        int length;
        h.e(host, "host");
        i iVar = f8.b.f37813a;
        i iVar2 = f8.b.f37813a;
        iVar2.getClass();
        if (iVar2.f1937n.matcher(host).matches()) {
            String b9 = f8.b.b(host);
            List a9 = a(x509Certificate, 7);
            if (!a9.isEmpty()) {
                Iterator it = a9.iterator();
                while (it.hasNext()) {
                    if (h.a(b9, f8.b.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) u8.b.g(host))) {
            Locale US = Locale.US;
            h.d(US, "US");
            host = host.toLowerCase(US);
            h.d(host, "toLowerCase(...)");
        }
        List<String> a10 = a(x509Certificate, 2);
        if (!a10.isEmpty()) {
            for (String str : a10) {
                if (host.length() != 0 && !q.I(host, j.f12535z) && !q.B(host, "..") && str != null && str.length() != 0 && !q.I(str, j.f12535z) && !q.B(str, "..")) {
                    String concat = !q.B(host, j.f12535z) ? host.concat(j.f12535z) : host;
                    if (!q.B(str, j.f12535z)) {
                        str = str.concat(j.f12535z);
                    }
                    if (str.length() == ((int) u8.b.g(str))) {
                        Locale US2 = Locale.US;
                        h.d(US2, "US");
                        str = str.toLowerCase(US2);
                        h.d(str, "toLowerCase(...)");
                    }
                    if (!M7.j.L(str, "*", false)) {
                        z8 = h.a(concat, str);
                    } else if (q.I(str, "*.") && M7.j.Q(str, '*', 1, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                        String substring = str.substring(1);
                        h.d(substring, "substring(...)");
                        if (q.B(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || M7.j.V(concat, length - 1, 4, '.') == -1)) {
                            z8 = true;
                        }
                    }
                    if (!z8) {
                        return true;
                    }
                }
                z8 = false;
                if (!z8) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        h.e(host, "host");
        h.e(session, "session");
        if (host.length() == ((int) u8.b.g(host))) {
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
