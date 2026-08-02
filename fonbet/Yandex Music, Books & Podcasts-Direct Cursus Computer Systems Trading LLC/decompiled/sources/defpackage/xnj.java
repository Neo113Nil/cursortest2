package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes5.dex */
public final class xnj implements HostnameVerifier {
    public static final xnj a = new xnj();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b7, code lost:
    
        defpackage.xq0.q("Unexpected end of DN: ".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        r4 = r5.d;
        r8 = new java.lang.String(r10, r4, r5.e - r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z;
        boolean z2;
        String str2;
        int i;
        char[] cArr;
        char c;
        int i2;
        char c2;
        boolean z3 = false;
        boolean z4 = true;
        if (b.matcher(str).matches()) {
            List a2 = a(x509Certificate, 7);
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (str.equalsIgnoreCase((String) a2.get(i3))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List a3 = a(x509Certificate, 2);
        int size2 = a3.size();
        int i4 = 0;
        Object[] objArr = false;
        while (i4 < size2) {
            if (c(lowerCase, (String) a3.get(i4))) {
                return true;
            }
            i4++;
            objArr = true;
        }
        if (objArr == false) {
            bb8 bb8Var = new bb8(x509Certificate.getSubjectX500Principal());
            bb8Var.c = 0;
            bb8Var.d = 0;
            bb8Var.e = 0;
            bb8Var.f = 0;
            String str3 = bb8Var.a;
            bb8Var.g = str3.toCharArray();
            String c4 = bb8Var.c();
            String str4 = null;
            if (c4 != null) {
                while (true) {
                    int i5 = bb8Var.c;
                    int i6 = bb8Var.b;
                    if (i5 == i6) {
                        break;
                    }
                    char c5 = bb8Var.g[i5];
                    char c6 = c3;
                    z = z3;
                    if (c5 == '\"') {
                        z2 = z4;
                        int i7 = i5 + 1;
                        bb8Var.c = i7;
                        bb8Var.d = i7;
                        bb8Var.e = i7;
                        while (true) {
                            int i8 = bb8Var.c;
                            if (i8 == i6) {
                                xq0.q("Unexpected end of DN: ".concat(str3));
                                return false;
                            }
                            char[] cArr2 = bb8Var.g;
                            char c7 = cArr2[i8];
                            if (c7 == '\"') {
                                bb8Var.c = i8 + 1;
                                while (true) {
                                    int i9 = bb8Var.c;
                                    if (i9 >= i6 || bb8Var.g[i9] != ' ') {
                                        break;
                                    }
                                    bb8Var.c = i9 + 1;
                                }
                                char[] cArr3 = bb8Var.g;
                                int i10 = bb8Var.d;
                                str2 = new String(cArr3, i10, bb8Var.e - i10);
                            } else {
                                int i11 = bb8Var.e;
                                if (c7 == '\\') {
                                    cArr2[i11] = bb8Var.b();
                                } else {
                                    cArr2[i11] = c7;
                                }
                                bb8Var.c++;
                                bb8Var.e++;
                            }
                        }
                    } else if (c5 == '#') {
                        z2 = z4;
                        if (i5 + 4 >= i6) {
                            xq0.q("Unexpected end of DN: ".concat(str3));
                            return false;
                        }
                        bb8Var.d = i5;
                        bb8Var.c = i5 + 1;
                        while (true) {
                            i = bb8Var.c;
                            if (i == i6 || (c = (cArr = bb8Var.g)[i]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                bb8Var.e = i;
                                bb8Var.c = i + 1;
                                while (true) {
                                    int i12 = bb8Var.c;
                                    if (i12 >= i6 || bb8Var.g[i12] != ' ') {
                                        break;
                                    }
                                    bb8Var.c = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i] = (char) (c + ' ');
                                }
                                bb8Var.c = i + 1;
                            }
                        }
                        bb8Var.e = i;
                        int i13 = bb8Var.e;
                        int i14 = bb8Var.d;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            break;
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (int i18 = z ? 1 : 0; i18 < i16; i18++) {
                            bArr[i18] = (byte) bb8Var.a(i17);
                            i17 += 2;
                        }
                        str2 = new String(bb8Var.g, bb8Var.d, i15);
                    } else if (c5 == '+' || c5 == ',' || c5 == ';') {
                        z2 = z4;
                        str2 = "";
                    } else {
                        bb8Var.d = i5;
                        bb8Var.e = i5;
                        while (true) {
                            int i19 = bb8Var.c;
                            char[] cArr4 = bb8Var.g;
                            if (i19 >= i6) {
                                int i20 = bb8Var.d;
                                str2 = new String(cArr4, i20, bb8Var.e - i20);
                                z2 = z4;
                                break;
                            }
                            char c8 = cArr4[i19];
                            if (c8 == ' ') {
                                z2 = z4;
                                int i21 = bb8Var.e;
                                bb8Var.f = i21;
                                bb8Var.c = i19 + 1;
                                bb8Var.e = i21 + 1;
                                cArr4[i21] = ' ';
                                while (true) {
                                    i2 = bb8Var.c;
                                    if (i2 >= i6) {
                                        break;
                                    }
                                    char[] cArr5 = bb8Var.g;
                                    if (cArr5[i2] != ' ') {
                                        break;
                                    }
                                    int i22 = bb8Var.e;
                                    bb8Var.e = i22 + 1;
                                    cArr5[i22] = ' ';
                                    bb8Var.c = i2 + 1;
                                }
                                if (i2 == i6 || (c2 = bb8Var.g[i2]) == ',' || c2 == '+' || c2 == ';') {
                                    break;
                                }
                                z4 = z2;
                            } else {
                                if (c8 == ';') {
                                    break;
                                }
                                if (c8 == '\\') {
                                    z2 = z4;
                                    int i23 = bb8Var.e;
                                    bb8Var.e = i23 + 1;
                                    cArr4[i23] = bb8Var.b();
                                    bb8Var.c++;
                                } else {
                                    if (c8 == '+' || c8 == ',') {
                                        break;
                                    }
                                    int i24 = bb8Var.e;
                                    z2 = z4;
                                    bb8Var.e = i24 + 1;
                                    cArr4[i24] = c8;
                                    bb8Var.c = i19 + 1;
                                }
                                z4 = z2;
                            }
                        }
                        char[] cArr6 = bb8Var.g;
                        int i25 = bb8Var.d;
                        str2 = new String(cArr6, i25, bb8Var.f - i25);
                    }
                    if ("cn".equalsIgnoreCase(c4)) {
                        str4 = str2;
                        break;
                    }
                    int i26 = bb8Var.c;
                    if (i26 >= i6) {
                        break;
                    }
                    char c9 = bb8Var.g[i26];
                    if (c9 != ',' && c9 != ';' && c9 != '+') {
                        xq0.q("Malformed DN: ".concat(str3));
                        return false;
                    }
                    bb8Var.c = i26 + 1;
                    c4 = bb8Var.c();
                    if (c4 == null) {
                        xq0.q("Malformed DN: ".concat(str3));
                        return false;
                    }
                    c3 = c6;
                    z3 = z ? 1 : 0;
                    z4 = z2;
                }
            }
            z = z3;
            return str4 != null ? c(lowerCase, str4) : z;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
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

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
