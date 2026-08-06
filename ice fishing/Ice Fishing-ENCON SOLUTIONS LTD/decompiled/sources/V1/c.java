package V1;

import i1.r;
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
import kotlin.jvm.internal.i;
import u0.AbstractC1050a;
import z1.f;
import z1.g;
import z1.o;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1831a = new c();

    public static List a(X509Certificate x509Certificate, int i2) {
        Object obj;
        r rVar = r.f3416a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return rVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return rVar;
        }
    }

    public static boolean b(String str) {
        int i2;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(C1.a.g(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < length2) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i2 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 = 3;
                } else {
                    int i4 = i3 + 1;
                    char charAt2 = i4 < length2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i3 = i4;
                    } else {
                        j2 += 4;
                        i3 += 2;
                    }
                }
                j2 += i2;
            }
            i3++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x0073->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String host, X509Certificate certificate) {
        boolean z2;
        int length;
        i.e(host, "host");
        i.e(certificate, "certificate");
        byte[] bArr = K1.b.f1051a;
        f fVar = K1.b.f1055e;
        fVar.getClass();
        if (fVar.f8637a.matcher(host).matches()) {
            String D2 = AbstractC1050a.D(host);
            List a2 = a(certificate, 7);
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (i.a(D2, AbstractC1050a.D((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(host)) {
                Locale US = Locale.US;
                i.d(US, "US");
                host = host.toLowerCase(US);
                i.d(host, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a3 = a(certificate, 2);
            if (!a3.isEmpty()) {
                for (String str : a3) {
                    if (host.length() != 0 && !o.R(host, ".", false) && !o.M(host, "..") && str != null && str.length() != 0 && !o.R(str, ".", false) && !o.M(str, "..")) {
                        String h2 = !o.M(host, ".") ? i.h(".", host) : host;
                        if (!o.M(str, ".")) {
                            str = i.h(".", str);
                        }
                        if (b(str)) {
                            Locale US2 = Locale.US;
                            i.d(US2, "US");
                            str = str.toLowerCase(US2);
                            i.d(str, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!g.T(str, "*")) {
                            z2 = i.a(h2, str);
                        } else if (o.R(str, "*.", false) && g.X(str, '*', 1, false, 4) == -1 && h2.length() >= str.length() && !"*.".equals(str)) {
                            String substring = str.substring(1);
                            i.d(substring, "this as java.lang.String).substring(startIndex)");
                            if (o.M(h2, substring) && ((length = h2.length() - substring.length()) <= 0 || g.b0(h2, '.', length - 1, 4) == -1)) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            return true;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        i.e(host, "host");
        i.e(session, "session");
        if (!b(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return c(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
