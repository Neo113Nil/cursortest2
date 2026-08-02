package ru.CryptoPro.reprov.x509;

import defpackage.g8e;
import defpackage.ny61;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class DNSName implements GeneralNameInterface {
    private static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String alphaDigitsAndHyphen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-";
    private static final String digitsAndHyphen = "0123456789-";
    private String name;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r1 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DNSName(String str) throws IOException {
        if (str == null || str.length() == 0) {
            ny61.v("DNS name must not be null");
            throw null;
        }
        if (str.indexOf(32) != -1) {
            ny61.v("DNS names or NameConstraints with blank components are not permitted");
            throw null;
        }
        int i = 0;
        if (str.charAt(0) == '.' || g8e.a(1, str) == '.') {
            ny61.v("DNS names or NameConstraints may not begin or end with a .");
            throw null;
        }
        while (i < str.length()) {
            int indexOf = str.indexOf(46, i);
            indexOf = indexOf < 0 ? str.length() : indexOf;
            if (indexOf - i < 1) {
                ny61.v("DNSName SubjectAltNames with empty components are not permitted");
                throw null;
            }
            if (alpha.indexOf(str.charAt(i)) < 0) {
                ny61.v("DNSName components must begin with a letter");
                throw null;
            }
            do {
                i++;
                if (i < indexOf) {
                }
            } while (alphaDigitsAndHyphen.indexOf(str.charAt(i)) >= 0);
            ny61.v("DNSName components must consist of letters, digits, and hyphens");
            throw null;
        }
        this.name = str;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) throws UnsupportedOperationException {
        if (generalNameInterface == null || generalNameInterface.getType() != 2) {
            return -1;
        }
        String lowerCase = ((DNSName) generalNameInterface).getName().toLowerCase();
        String lowerCase2 = this.name.toLowerCase();
        if (lowerCase.equals(lowerCase2)) {
            return 0;
        }
        return lowerCase2.endsWith(lowerCase) ? lowerCase2.charAt(lowerCase2.lastIndexOf(lowerCase) - 1) == '.' ? 2 : 3 : (lowerCase.endsWith(lowerCase2) && lowerCase.charAt(lowerCase.lastIndexOf(lowerCase2) - 1) == '.') ? 1 : 3;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putIA5String(this.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DNSName) {
            return this.name.equalsIgnoreCase(((DNSName) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int getType() {
        return 2;
    }

    public int hashCode() {
        return this.name.toUpperCase().hashCode();
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int subtreeDepth() throws UnsupportedOperationException {
        String str = this.name;
        int i = 1;
        while (str.lastIndexOf(46) >= 0) {
            str = str.substring(0, str.lastIndexOf(46));
            i++;
        }
        return i;
    }

    public String toString() {
        return "DNSName: " + this.name;
    }

    public DNSName(DerValue derValue) throws IOException {
        this.name = derValue.getIA5String();
    }
}
