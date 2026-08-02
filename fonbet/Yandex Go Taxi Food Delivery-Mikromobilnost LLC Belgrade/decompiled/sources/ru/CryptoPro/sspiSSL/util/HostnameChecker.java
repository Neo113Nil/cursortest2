package ru.CryptoPro.sspiSSL.util;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.net.ssl.SNIHostName;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.util.IPAddressUtil;

/* loaded from: classes4.dex */
public class HostnameChecker {
    public static final byte TYPE_LDAP = 2;
    public static final byte TYPE_TLS = 1;
    public static final HostnameChecker b = new HostnameChecker((byte) 1);
    public static final HostnameChecker c = new HostnameChecker((byte) 2);
    public final byte a;

    public HostnameChecker(byte b2) {
        this.a = b2;
    }

    public static boolean b(String str, String str2) {
        int indexOf = str2.indexOf("*");
        if (indexOf == -1) {
            return str.equals(str2);
        }
        boolean z = true;
        while (indexOf != -1) {
            String substring = str2.substring(0, indexOf);
            str2 = str2.substring(indexOf + 1);
            int indexOf2 = str.indexOf(substring);
            if (indexOf2 == -1 || (z && indexOf2 != 0)) {
                return false;
            }
            str = str.substring(substring.length() + indexOf2);
            indexOf = str2.indexOf("*");
            z = false;
        }
        return str.endsWith(str2);
    }

    public static HostnameChecker getInstance(byte b2) {
        if (b2 == 1) {
            return b;
        }
        if (b2 == 2) {
            return c;
        }
        ny61.g(oyr.i(b2, "Unknown check type: "));
        return null;
    }

    public static X500Name getSubjectX500Name(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            Principal subjectDN = x509Certificate.getSubjectDN();
            return subjectDN instanceof X500Name ? (X500Name) subjectDN : new X500Name(x509Certificate.getSubjectX500Principal().getEncoded());
        } catch (IOException e) {
            throw ((CertificateParsingException) new CertificateParsingException().initCause(e));
        }
    }

    public final boolean a(String str, String str2) {
        String str3;
        if (str2.equals("*") || str2.equals("*.")) {
            str3 = "Certificate domain name has illegal single wildcard character: ";
        } else {
            int lastIndexOf = str2.lastIndexOf("*");
            if (lastIndexOf == -1 || str2.substring(lastIndexOf).indexOf(Extension.DOT_CHAR) != -1) {
                try {
                    new SNIHostName(str2.replace('*', 'x'));
                    byte b2 = this.a;
                    if (b2 == 1) {
                        Locale locale = Locale.ENGLISH;
                        String lowerCase = str.toLowerCase(locale);
                        String lowerCase2 = str2.toLowerCase(locale);
                        StringTokenizer stringTokenizer = new StringTokenizer(lowerCase, Extension.DOT_CHAR);
                        StringTokenizer stringTokenizer2 = new StringTokenizer(lowerCase2, Extension.DOT_CHAR);
                        if (stringTokenizer.countTokens() == stringTokenizer2.countTokens()) {
                            while (stringTokenizer.hasMoreTokens()) {
                                if (!b(stringTokenizer.nextToken(), stringTokenizer2.nextToken())) {
                                }
                            }
                            return true;
                        }
                    } else if (b2 == 2) {
                        Locale locale2 = Locale.ENGLISH;
                        String lowerCase3 = str.toLowerCase(locale2);
                        String lowerCase4 = str2.toLowerCase(locale2);
                        int indexOf = lowerCase4.indexOf(Extension.DOT_CHAR);
                        int indexOf2 = lowerCase3.indexOf(Extension.DOT_CHAR);
                        if (indexOf == -1) {
                            indexOf = lowerCase4.length();
                        }
                        if (indexOf2 == -1) {
                            indexOf2 = lowerCase3.length();
                        }
                        if (b(lowerCase3.substring(0, indexOf2), lowerCase4.substring(0, indexOf))) {
                            return lowerCase4.substring(indexOf).equals(lowerCase3.substring(indexOf2));
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
                return false;
            }
            str3 = "Certificate domain name has illegal wildcard, no dot after wildcard character: ";
        }
        SSLLogger.fine(str3.concat(str2));
        return false;
    }

    public void match(String str, X509Certificate x509Certificate) throws CertificateException {
        if (str == null) {
            w511.y("Hostname or IP address is undefined.");
            return;
        }
        if (IPAddressUtil.isIPv4LiteralAddress(str) || IPAddressUtil.isIPv6LiteralAddress(str)) {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                w511.y("No subject alternative names present");
                return;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (((Integer) list.get(0)).intValue() == 7) {
                    String str2 = (String) list.get(1);
                    if (str.equalsIgnoreCase(str2)) {
                        return;
                    }
                    try {
                        if (InetAddress.getByName(str).equals(InetAddress.getByName(str2))) {
                            return;
                        }
                    } catch (SecurityException | UnknownHostException unused) {
                        continue;
                    }
                }
            }
            throw new CertificateException(oyr.p("No subject alternative names matching IP address ", str, " found"));
        }
        try {
            new SNIHostName(str);
            Collection<List<?>> subjectAlternativeNames2 = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames2 != null) {
                boolean z = false;
                for (List<?> list2 : subjectAlternativeNames2) {
                    if (((Integer) list2.get(0)).intValue() == 2) {
                        if (a(str, (String) list2.get(1))) {
                            return;
                        } else {
                            z = true;
                        }
                    }
                }
                if (z) {
                    throw new CertificateException(oyr.p("No subject alternative DNS name matching ", str, " found."));
                }
            }
            DerValue findMostSpecificAttribute = getSubjectX500Name(x509Certificate).findMostSpecificAttribute(X500Name.commonName_oid);
            if (findMostSpecificAttribute != null) {
                try {
                    if (a(str, findMostSpecificAttribute.getAsString())) {
                        return;
                    }
                } catch (IOException unused2) {
                }
            }
            w511.y(oyr.p("No name matching ", str, " found"));
        } catch (IllegalArgumentException e) {
            throw new CertificateException("Illegal given domain name: ".concat(str), e);
        }
    }
}
