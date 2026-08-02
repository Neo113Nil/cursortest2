package com.anythink.core.common.n.b.a.j;

import com.anythink.core.common.d.j;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class e implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final e f16162a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final int f16163b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16164c = 7;

    private e() {
    }

    public static boolean a(String str, X509Certificate x509Certificate) {
        return com.anythink.core.common.n.b.a.c.c(str) ? b(str, x509Certificate) : c(str, x509Certificate);
    }

    private static boolean b(String str, X509Certificate x509Certificate) {
        List<String> a9 = a(x509Certificate, 7);
        int size = a9.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(a9.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = a(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (a(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> a9 = a(x509Certificate, 7);
        List<String> a10 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a10.size() + a9.size());
        arrayList.addAll(a9);
        arrayList.addAll(a10);
        return arrayList;
    }

    private static List<String> a(X509Certificate x509Certificate, int i) {
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

    private static boolean a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(j.f13164z) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(j.f13164z) && !str2.endsWith("..")) {
            if (!str.endsWith(j.f13164z)) {
                str = str.concat(j.f13164z);
            }
            if (!str2.endsWith(j.f13164z)) {
                str2 = str2.concat(j.f13164z);
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
