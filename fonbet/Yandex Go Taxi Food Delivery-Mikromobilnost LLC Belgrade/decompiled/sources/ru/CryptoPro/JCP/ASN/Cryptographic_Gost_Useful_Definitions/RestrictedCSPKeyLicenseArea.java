package ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions;

import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1ValueParseException;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class RestrictedCSPKeyLicenseArea extends Asn1BitString {
    public static final int licenseCAKeyId = 1;
    public static final int licenseCAdES = 7;
    public static final int licenseCSP = 2;
    public static final int licenseEFS = 5;
    public static final int licenseIPsec = 6;
    public static final int licenseIssuer = 0;
    public static final int licenseWinLogon = 4;

    public RestrictedCSPKeyLicenseArea() {
        this.value = new byte[1];
    }

    public RestrictedCSPKeyLicenseArea(int i, byte[] bArr) {
        super(i, bArr);
    }

    public RestrictedCSPKeyLicenseArea(boolean[] zArr) {
        super(zArr);
    }

    public RestrictedCSPKeyLicenseArea(String str) throws Asn1ValueParseException {
        super(str);
    }

    public RestrictedCSPKeyLicenseArea(BitSet bitSet) {
        super(bitSet);
    }
}
