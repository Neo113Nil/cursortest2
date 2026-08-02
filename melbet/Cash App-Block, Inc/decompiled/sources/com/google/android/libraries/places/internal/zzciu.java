package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Ascii;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class zzciu implements HostnameVerifier {
    public static final zzciu zza = new zzciu();
    public static final Pattern zzb = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private zzciu() {
    }

    public static List zza(X509Certificate x509Certificate, int i) {
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

    public static final boolean zzb(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = Ascii.toLowerCase(str2);
            if (!lowerCase.contains(Marker.ANY_MARKER)) {
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
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        String zza2;
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) == charAt2) {
                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unpaired surrogate at index "));
                                return false;
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 < length) {
            OptionalProvider$$ExternalSyntheticLambda0.m(i2 + 4294967296L);
            return false;
        }
        if (i2 == str.length()) {
            try {
                X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
                if (zzb.matcher(str).matches()) {
                    List zza3 = zza(x509Certificate, 7);
                    int size = zza3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (!str.equalsIgnoreCase((String) zza3.get(i4))) {
                        }
                    }
                } else {
                    String lowerCase = Ascii.toLowerCase(str);
                    List zza4 = zza(x509Certificate, 2);
                    int size2 = zza4.size();
                    int i5 = 0;
                    boolean z = false;
                    while (i5 < size2) {
                        if (!zzb(lowerCase, (String) zza4.get(i5))) {
                            i5++;
                            z = true;
                        }
                    }
                    if (!z && (zza2 = new zzcir(x509Certificate.getSubjectX500Principal()).zza()) != null) {
                        return zzb(lowerCase, zza2);
                    }
                }
                return true;
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
